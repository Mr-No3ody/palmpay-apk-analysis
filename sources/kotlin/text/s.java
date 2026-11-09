package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class s extends r {
    public static String b(String str) {
        int length;
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listI = Sf.p.i(new Kf.q(str, 5));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (!StringsKt.F((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listI.size();
        int iG = C1850q.g(listI);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listI) {
            int i7 = length + 1;
            if (length < 0) {
                C1850q.k();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iG) && StringsKt.F(str3)) {
                str3 = null;
            } else {
                String line = F.v(iIntValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i7;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        CollectionsKt.I(arrayList3, sb2, null, 124);
        return sb2.toString();
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.F("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listI = Sf.p.i(new Kf.q(str, 5));
        int length = str.length();
        listI.size();
        int iG = C1850q.g(listI);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI.iterator();
        int i7 = 0;
        while (true) {
            String line = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                CollectionsKt.I(arrayList, sb2, null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            String str2 = (String) next;
            if ((i7 != 0 && i7 != iG) || !StringsKt.F(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && y.l(str2, "|", i11, false)) {
                    line = str2.substring("|".length() + i11);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i7 = i10;
        }
    }
}
