package Sf;

import Fe.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public class p extends n {
    public static g c(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new g(sequence, true, predicate);
    }

    public static Object d(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int e(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i7 = 0;
        for (Object obj2 : sequence) {
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

    public static e f(Kf.q qVar, Function1 transform) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new e(qVar, transform, 2);
    }

    public static g g(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        e eVar = new e(sequence, transform, 2);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        h0 predicate = new h0(25);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new g(eVar, false, predicate);
    }

    public static e h(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new e(sequence, predicate, 1);
    }

    public static List i(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return z.f38935a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C1849p.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
