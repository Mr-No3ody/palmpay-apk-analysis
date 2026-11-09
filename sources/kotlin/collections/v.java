package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public class v extends u {
    public static void n(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void o(Collection collection, Sequence elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void p(Collection collection, Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        collection.addAll(C1846m.c(elements));
    }

    public static final boolean q(Iterable iterable, Function1 function1, boolean z3) {
        Iterator it = iterable.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z3) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static void r(List list, Function1 predicate) {
        int iG;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            Intrinsics.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableIterable)) {
                kotlin.jvm.internal.K.g(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                q(list, predicate, true);
                return;
            } catch (ClassCastException e10) {
                Intrinsics.j(e10, kotlin.jvm.internal.K.class.getName());
                throw e10;
            }
        }
        int iG2 = C1850q.g(list);
        int i7 = 0;
        if (iG2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i10 != i7) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i7 == iG2) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i10;
        }
        if (i7 >= list.size() || i7 > (iG = C1850q.g(list))) {
            return;
        }
        while (true) {
            list.remove(iG);
            if (iG == i7) {
                return;
            } else {
                iG--;
            }
        }
    }

    public static Object s(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(C1850q.g(arrayList));
    }
}
