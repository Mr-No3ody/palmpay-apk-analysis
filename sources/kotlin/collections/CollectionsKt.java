package kotlin.collections;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.navigation.NavigationBarView;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlin/collections/p", "kotlin/collections/q", "kotlin/collections/r", "kotlin/collections/s", "kotlin/collections/t", "kotlin/collections/u", "kotlin/collections/v", "kotlin/collections/w", "kotlin/collections/x", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static boolean A(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return H(iterable, obj) >= 0;
    }

    public static List B(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return Y(a0(iterable));
    }

    public static List C(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i7;
        if (size < 0) {
            size = 0;
        }
        return U(list2, size);
    }

    public static ArrayList D(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object E(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return F((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object G(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static int H(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            if (Intrinsics.c(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static /* synthetic */ void I(Iterable iterable, StringBuilder sb2, Wd.G g7, int i7) {
        String str = (i7 & 2) != 0 ? ", " : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        if ((i7 & 64) != 0) {
            g7 = null;
        }
        CollectionsKt___CollectionsKt.w(iterable, sb2, str, "", "", g7);
    }

    public static String J(Iterable iterable, String str, String str2, String str3, Function1 function1, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i7 & 2) != 0 ? "" : str2;
        String postfix = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.w(iterable, sb2, separator, prefix, postfix, function1);
        return sb2.toString();
    }

    public static Object K(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C1850q.g(list));
    }

    public static Object L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return androidx.camera.video.u.e(1, list);
    }

    public static Comparable M(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float N(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float O(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList P(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            v.n(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList Q(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List R(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Y(iterable);
        }
        List listX = CollectionsKt___CollectionsKt.x(iterable);
        Intrinsics.checkNotNullParameter(listX, "<this>");
        Collections.reverse(listX);
        return listX;
    }

    public static List S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!(list instanceof Collection)) {
            List listX = CollectionsKt___CollectionsKt.x(list);
            u.m(listX);
            return listX;
        }
        List list2 = list;
        if (list2.size() <= 1) {
            return Y(list);
        }
        Object[] array = list2.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C1846m.c(array);
    }

    public static List T(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Y(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C1846m.k(comparator, array);
            return C1846m.c(array);
        }
        List listX = CollectionsKt___CollectionsKt.x(iterable);
        Intrinsics.checkNotNullParameter(listX, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (((ArrayList) listX).size() > 1) {
            Collections.sort(listX, comparator);
        }
        return listX;
    }

    public static List U(Iterable iterable, int i7) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return z.f38935a;
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return Y(iterable);
            }
            if (i7 == 1) {
                return C1849p.c(E(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i7) {
                break;
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : C1849p.c(arrayList.get(0));
        }
        return z.f38935a;
    }

    public static void V(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static float[] W(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            fArr[i7] = ((Number) it.next()).floatValue();
            i7++;
        }
        return fArr;
    }

    public static int[] X(AbstractList abstractList) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        int[] iArr = new int[abstractList.size()];
        Iterator it = abstractList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List Y(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return z.f38935a;
            }
            if (size != 1) {
                return Z(collection);
            }
            return C1849p.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        List listX = CollectionsKt___CollectionsKt.x(iterable);
        Intrinsics.checkNotNullParameter(listX, "<this>");
        ArrayList arrayList = (ArrayList) listX;
        int size2 = arrayList.size();
        if (size2 != 0) {
            return size2 != 1 ? listX : C1849p.c(arrayList.get(0));
        }
        return z.f38935a;
    }

    public static ArrayList Z(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet a0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        V(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set b0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            V(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : N.b(linkedHashSet.iterator().next());
            }
            return B.f38895a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return B.f38895a;
        }
        if (size2 == 1) {
            return N.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(F.a(collection.size()));
        V(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static ArrayList c0(Iterable iterable, Iterable other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.l(iterable, 10), r.l(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Kf.q y(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new Kf.q(iterable, 4);
    }

    public static ArrayList z(Iterable iterable, int i7) {
        Iterator it;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        com.facebook.imagepipeline.nativecode.b.e(i7, i7);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            Intrinsics.checkNotNullParameter(iterator, "iterator");
            if (iterator.hasNext()) {
                Q block = new Q(i7, i7, iterator, null);
                Intrinsics.checkNotNullParameter(block, "block");
                Sf.i iVar = new Sf.i();
                iVar.f8898d = Ef.f.a(iVar, iVar, block);
                it = iVar;
            } else {
                it = y.f38934a;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i7) + (size % i7 == 0 ? 0 : 1));
        int i10 = 0;
        while (i10 >= 0 && i10 < size) {
            int i11 = size - i10;
            if (i7 <= i11) {
                i11 = i7;
            }
            ArrayList arrayList3 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList3.add(list.get(i12 + i10));
            }
            arrayList2.add(arrayList3);
            i10 += i7;
        }
        return arrayList2;
    }
}
