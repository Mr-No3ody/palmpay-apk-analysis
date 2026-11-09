package com.adjust.sdk.sig;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19482a;

    /* JADX WARN: Illegal instructions before constructor call */
    public m1(String str, String str2) {
        String strConcat;
        StringBuilder sbS = androidx.camera.video.u.s(str);
        if (str2 != null) {
            for (int i7 = 0; i7 < str2.length(); i7++) {
                char cCharAt = str2.charAt(i7);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    strConcat = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(str2);
                }
            }
            strConcat = "";
        } else {
            strConcat = "";
        }
        sbS.append(strConcat);
        String string = sbS.toString();
        super(string);
        this.f19482a = string;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f19482a;
    }
}
