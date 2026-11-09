package Hg;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import okhttp3.W;
import okhttp3.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final k get(@NotNull e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new k(response.f40729b, response.f40731d, response.f40730c);
    }

    @NotNull
    public final k parse(@NotNull String statusLine) throws IOException {
        W w3;
        int i7;
        String strSubstring;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        if (y.m(statusLine, "HTTP/1.", false)) {
            i7 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt == 0) {
                w3 = W.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                w3 = W.HTTP_1_1;
            }
        } else {
            if (!y.m(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            w3 = W.HTTP_1_0;
            i7 = 4;
        }
        int i10 = i7 + 3;
        if (statusLine.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i7, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i11 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i10) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i10) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i7 + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new k(w3, i11, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    private j() {
    }
}
