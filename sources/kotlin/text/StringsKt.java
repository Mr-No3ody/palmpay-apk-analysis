package kotlin.text;

import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlin/text/r", "kotlin/text/s", "kotlin/text/t", "kotlin/text/u", "kotlin/text/v", "kotlin/text/w", "kotlin/text/x", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/y", "kotlin/text/StringsKt__StringsKt", "kotlin/text/C", "kotlin/text/F"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER)
public final class StringsKt extends F {
    private StringsKt() {
    }

    public static boolean A(CharSequence charSequence, String other, boolean z3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other != null) {
            if (E(charSequence, other, 0, z3, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.p(charSequence, other, 0, charSequence.length(), z3, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean B(CharSequence charSequence, char c6) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return D(charSequence, c6, 0, 2) >= 0;
    }

    public static int C(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int D(CharSequence charSequence, char c6, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.q(charSequence, new char[]{c6}, i7, false) : ((String) charSequence).indexOf(c6, i7);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i7, boolean z3, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            z3 = false;
        }
        return StringsKt__StringsKt.o(z3, str, charSequence, i7);
    }

    public static boolean F(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!CharsKt.b(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int G(CharSequence charSequence, int i7, String string) {
        int iC = (i7 & 2) != 0 ? C(charSequence) : 0;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.p(charSequence, string, iC, 0, false, true) : ((String) charSequence).lastIndexOf(string, iC);
    }

    public static int H(String str, char c6, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = C(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str != null) {
            return str.lastIndexOf(c6, i7);
        }
        char[] chars = {c6};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (str != null) {
            return str.lastIndexOf(C1847n.x(chars), i7);
        }
        int iC = C(str);
        if (i7 > iC) {
            i7 = iC;
        }
        while (-1 < i7) {
            if (C1862a.a(chars[0], str.charAt(i7), false)) {
                return i7;
            }
            i7--;
        }
        return -1;
    }

    public static String I(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!StringsKt__StringsKt.u(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String J(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("Client", "suffix");
        if (!StringsKt__StringsKt.n(str, "Client")) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String K(String str, String prefix, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < suffix.length() + prefix.length() || !StringsKt__StringsKt.u(str, prefix) || !StringsKt__StringsKt.n(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List M(String str, final char[] delimiters, int i7) {
        int i10 = (i7 & 4) != 0 ? 0 : 2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.t(false, String.valueOf(delimiters[0]), str, i10);
        }
        StringsKt__StringsKt.s(i10);
        C1864c c1864c = new C1864c(str, i10, new Function2() { // from class: kotlin.text.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iQ = StringsKt__StringsKt.q(DelimitedRangesSequence, delimiters, iIntValue, false);
                if (iQ < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iQ), 1);
            }
        });
        Intrinsics.checkNotNullParameter(c1864c, "<this>");
        Sf.o oVar = new Sf.o(c1864c);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            C1863b c1863b = (C1863b) it;
            if (!c1863b.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) c1863b.next();
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(str.subSequence(range.f38977a, range.f38978b + 1).toString());
        }
    }

    public static boolean N(String str, char c6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && C1862a.a(str.charAt(0), c6, false);
    }

    public static String O(char c6, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iD = D(str, c6, 0, 6);
        if (iD == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iD + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iE = E(missingDelimiterValue, delimiter, 0, false, 6);
        if (iE == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iE, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q(String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iH = H(str, '.', 0, 6);
        if (iH == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iH + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG = G(missingDelimiterValue, 6, delimiter);
        if (iG == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iG, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S(String missingDelimiterValue, char c6) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iD = D(missingDelimiterValue, c6, 0, 6);
        if (iD == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iD);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG = G(missingDelimiterValue, 6, delimiter);
        if (iG == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iG);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Long U(String str) {
        boolean z3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        long j6 = -9223372036854775807L;
        if (Intrinsics.h(cCharAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z3 = false;
                i7 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j6 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z3 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j6 / ((long) 10);
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * ((long) 10);
            long j13 = iDigit;
            if (j12 < j6 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i7++;
        }
        return z3 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }

    public static CharSequence V(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean zB = CharsKt.b(charSequence.charAt(!z3 ? i7 : length));
            if (z3) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i7++;
            } else {
                z3 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }
}
