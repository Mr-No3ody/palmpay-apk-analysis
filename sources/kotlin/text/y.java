package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class y extends StringsKt__StringNumberConversionsKt {
    public static boolean g(String str, String suffix, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z3 ? str.endsWith(suffix) : i(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean h(String str, String str2, boolean z3) {
        if (str == null) {
            return str2 == null;
        }
        return !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean i(int i7, int i10, int i11, String str, String other, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z3 ? str.regionMatches(i7, other, i10, i11) : str.regionMatches(z3, i7, other, i10, i11);
    }

    public static String j(String str, char c6, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace = str.replace(c6, c10);
        Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
        return strReplace;
    }

    public static String k(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iO = StringsKt__StringsKt.o(false, oldValue, str, 0);
        if (iO < 0) {
            return str;
        }
        int length = oldValue.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iO);
            sb2.append(newValue);
            i10 = iO + length;
            if (iO >= str.length()) {
                break;
            }
            iO = StringsKt__StringsKt.o(false, oldValue, str, iO + i7);
        } while (iO > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static boolean l(String str, String prefix, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z3 ? str.startsWith(prefix, i7) : i(i7, 0, prefix.length(), str, prefix, z3);
    }

    public static boolean m(String str, String prefix, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z3 ? str.startsWith(prefix) : i(0, 0, prefix.length(), str, prefix, z3);
    }
}
