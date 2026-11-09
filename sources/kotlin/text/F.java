package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class F extends C {
    public static String v(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String w(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i7;
        if (length < 0) {
            length = 0;
        }
        return z(length, str);
    }

    public static Character x(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static char y(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.C(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String z(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(0, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
