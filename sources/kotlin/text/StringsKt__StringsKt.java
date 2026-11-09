package kotlin.text;

import com.google.android.material.navigation.NavigationBarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1846m;
import kotlin.collections.C1847n;
import kotlin.collections.C1849p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1579:1\n80#1,22:1580\n114#1,5:1602\n131#1,5:1607\n80#1,22:1612\n108#1:1634\n80#1,22:1635\n114#1,5:1657\n125#1:1662\n114#1,5:1663\n131#1,5:1668\n142#1:1673\n131#1,5:1674\n80#1,22:1679\n114#1,5:1701\n131#1,5:1706\n1069#2,2:1711\n12717#3,2:1713\n12717#3,2:1715\n295#4,2:1717\n295#4,2:1719\n1563#4:1722\n1634#4,3:1723\n1563#4:1726\n1634#4,3:1727\n1#5:1721\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1580,22\n125#1:1602,5\n142#1:1607,5\n147#1:1612,22\n152#1:1634\n152#1:1635,22\n157#1:1657,5\n162#1:1662\n162#1:1663,5\n167#1:1668,5\n172#1:1673\n172#1:1674,5\n177#1:1679,22\n188#1:1701,5\n199#1:1706,5\n312#1:1711,2\n971#1:1713,2\n995#1:1715,2\n1034#1:1717,2\n1040#1:1719,2\n1401#1:1722\n1401#1:1723,3\n1426#1:1726\n1426#1:1727,3\n*E\n"})
public class StringsKt__StringsKt extends y {
    public static boolean n(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return str != null ? y.g(str, suffix, false) : r(str, str.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final int o(boolean z3, String string, CharSequence charSequence, int i7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z3 || !(charSequence instanceof String)) ? p(charSequence, string, i7, charSequence.length(), z3, false) : ((String) charSequence).indexOf(string, i7);
    }

    public static final int p(CharSequence charSequence, String str, int i7, int i10, boolean z3, boolean z8) {
        kotlin.ranges.a aVarFromClosedRange;
        if (z8) {
            int iC = StringsKt.C(charSequence);
            if (i7 > iC) {
                i7 = iC;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            aVarFromClosedRange = kotlin.ranges.a.f38976d.fromClosedRange(i7, i10, -1);
        } else {
            if (i7 < 0) {
                i7 = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            aVarFromClosedRange = new IntRange(i7, i10, 1);
        }
        if (!(charSequence instanceof String) || str == null) {
            boolean z10 = z3;
            int i11 = aVarFromClosedRange.f38977a;
            int i12 = aVarFromClosedRange.f38978b;
            int i13 = aVarFromClosedRange.f38979c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z11 = z10;
                    z10 = z11;
                    if (r(str, 0, charSequence2, i11, str.length(), z11)) {
                        return i11;
                    }
                    if (i11 != i12) {
                        i11 += i13;
                        charSequence = charSequence2;
                    }
                }
            }
        } else {
            int i14 = aVarFromClosedRange.f38977a;
            int i15 = aVarFromClosedRange.f38978b;
            int i16 = aVarFromClosedRange.f38979c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                int i17 = i14;
                while (true) {
                    String str2 = str;
                    boolean z12 = z3;
                    if (y.i(0, i17, str.length(), str2, (String) charSequence, z12)) {
                        return i17;
                    }
                    if (i17 != i15) {
                        i17 += i16;
                        str = str2;
                        z3 = z12;
                    }
                }
            }
        }
        return -1;
    }

    public static final int q(CharSequence charSequence, char[] chars, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z3 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C1847n.x(chars), i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int iC = StringsKt.C(charSequence);
        if (i7 > iC) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i7);
            for (char c6 : chars) {
                if (C1862a.a(c6, cCharAt, z3)) {
                    return i7;
                }
            }
            if (i7 == iC) {
                return -1;
            }
            i7++;
        }
    }

    public static final boolean r(String str, int i7, CharSequence other, int i10, int i11, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 >= 0 && i7 >= 0 && i7 <= str.length() - i11 && i10 <= other.length() - i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (C1862a.a(str.charAt(i7 + i12), other.charAt(i10 + i12), z3)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void s(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(C0.G.m(i7, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, final boolean z3, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z3 = false;
        }
        if ((i10 & 4) != 0) {
            i7 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return t(z3, str, charSequence, i7);
            }
        }
        s(i7);
        final List listC = C1846m.c(delimiters);
        C1864c c1864c = new C1864c(charSequence, i7, new Function2() { // from class: kotlin.text.A
            /* JADX WARN: Code duplicated, block: B:23:0x006a A[EDGE_INSN: B:23:0x006a->B:70:0x011f BREAK  A[LOOP:0: B:39:0x00a5->B:51:0x00de]] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Pair pair;
                String str2;
                boolean z8;
                Object next2;
                Object obj4;
                CharSequence DelimitedRangesSequence = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = listC;
                boolean z10 = z3;
                if (z10 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z11 = DelimitedRangesSequence instanceof String;
                    int i11 = intRange.f38979c;
                    int i12 = intRange.f38978b;
                    if (!z11) {
                        if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                            int i13 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str2 = (String) next;
                                } while (!StringsKt__StringsKt.r(str2, 0, DelimitedRangesSequence, i13, str2.length(), z10));
                                String str3 = (String) next;
                                if (str3 == null) {
                                    if (i13 == i12) {
                                        pair = null;
                                        break;
                                    }
                                    i13 += i11;
                                } else {
                                    pair = new Pair(Integer.valueOf(i13), str3);
                                    break;
                                }
                            }
                        } else {
                            pair = null;
                            break;
                        }
                    } else if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                        int i14 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z8 = z10;
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                String str4 = (String) next2;
                                z8 = z10;
                                if (y.i(0, i14, str4.length(), str4, (String) DelimitedRangesSequence, z8)) {
                                    break;
                                }
                                z10 = z8;
                            }
                            String str5 = (String) next2;
                            if (str5 == null) {
                                if (i14 == i12) {
                                    pair = null;
                                    break;
                                }
                                i14 += i11;
                                z10 = z8;
                            } else {
                                pair = new Pair(Integer.valueOf(i14), str5);
                                break;
                            }
                        }
                    } else {
                        pair = null;
                        break;
                    }
                } else {
                    List list2 = list;
                    Intrinsics.checkNotNullParameter(list2, "<this>");
                    if (list2 instanceof List) {
                        List list3 = list2;
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        int size = list3.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                        obj4 = list3.get(0);
                    } else {
                        Iterator it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next3 = it3.next();
                        if (it3.hasNext()) {
                            throw new IllegalArgumentException("Collection has more than one element.");
                        }
                        obj4 = next3;
                    }
                    String str6 = (String) obj4;
                    int iE = StringsKt.E(DelimitedRangesSequence, str6, iIntValue, false, 4);
                    if (iE < 0) {
                        pair = null;
                        break;
                    }
                    pair = new Pair(Integer.valueOf(iE), str6);
                }
                if (pair == null) {
                    return null;
                }
                return new Pair(pair.f38891a, Integer.valueOf(((String) pair.f38892b).length()));
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
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f38977a, range.f38978b + 1).toString());
        }
    }

    public static final List t(boolean z3, String str, CharSequence charSequence, int i7) {
        s(i7);
        int length = 0;
        int iO = o(z3, str, charSequence, 0);
        if (iO == -1 || i7 == 1) {
            return C1849p.c(charSequence.toString());
        }
        boolean z8 = i7 > 0;
        int i10 = 10;
        if (z8 && i7 <= 10) {
            i10 = i7;
        }
        ArrayList arrayList = new ArrayList(i10);
        do {
            arrayList.add(charSequence.subSequence(length, iO).toString());
            length = str.length() + iO;
            if (z8 && arrayList.size() == i7 - 1) {
                break;
            }
            iO = o(z3, str, charSequence, length);
        } while (iO != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean u(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str != null ? y.m(str, prefix, false) : r(str, 0, prefix, 0, prefix.length(), false);
    }
}
