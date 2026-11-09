package com.google.common.io;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z3) throws IOException {
        String str;
        if (this.sawReturn) {
            str = z3 ? "\r\n" : "\r";
        } else {
            str = z3 ? ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE : "";
        }
        handleLine(this.line.toString(), str);
        this.line = new StringBuilder();
        this.sawReturn = false;
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void add(char[] cArr, int i7, int i10) throws IOException {
        int i11;
        if (!this.sawReturn || i10 <= 0) {
            i11 = i7;
        } else {
            if (finishLine(cArr[i7] == '\n')) {
                i11 = i7 + 1;
            } else {
                i11 = i7;
            }
        }
        int i12 = i7 + i10;
        int i13 = i11;
        while (i11 < i12) {
            char c6 = cArr[i11];
            if (c6 != '\n') {
                if (c6 == '\r') {
                    this.line.append(cArr, i13, i11 - i13);
                    this.sawReturn = true;
                    int i14 = i11 + 1;
                    if (i14 < i12) {
                        if (finishLine(cArr[i14] == '\n')) {
                            i11 = i14;
                        }
                    }
                }
                i11++;
            } else {
                this.line.append(cArr, i13, i11 - i13);
                finishLine(true);
            }
            i13 = i11 + 1;
            i11++;
        }
        this.line.append(cArr, i13, i12 - i13);
    }

    public void finish() throws IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }

    public abstract void handleLine(String str, String str2) throws IOException;
}
