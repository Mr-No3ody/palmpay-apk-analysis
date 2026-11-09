package C0;

import androidx.lifecycle.EnumC1204n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C1843j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: C0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0123o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.g0 f1067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.g0 f1068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.S f1070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.S f1071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f1072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0130w f1073h;

    public C0123o(AbstractC0130w abstractC0130w, e0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f1073h = abstractC0130w;
        this.f1066a = new ReentrantLock(true);
        kotlinx.coroutines.flow.g0 g0VarA = kotlinx.coroutines.flow.X.a(kotlin.collections.z.f38935a);
        this.f1067b = g0VarA;
        kotlinx.coroutines.flow.g0 g0VarA2 = kotlinx.coroutines.flow.X.a(kotlin.collections.B.f38895a);
        this.f1068c = g0VarA2;
        this.f1070e = kotlinx.coroutines.flow.X.d(g0VarA);
        this.f1071f = kotlinx.coroutines.flow.X.d(g0VarA2);
        this.f1072g = navigator;
    }

    public final void a(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f1066a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.g0 g0Var = this.f1067b;
            ArrayList arrayListQ = CollectionsKt.Q((Collection) g0Var.getValue(), backStackEntry);
            g0Var.getClass();
            g0Var.e(null, arrayListQ);
            Unit unit = Unit.f38893a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    public final void b(C0119k entry) {
        C0131x c0131x;
        androidx.lifecycle.i0 i0Var;
        Intrinsics.checkNotNullParameter(entry, "entry");
        AbstractC0130w abstractC0130w = this.f1073h;
        boolean zC = Intrinsics.c(abstractC0130w.f1124y.get(entry), Boolean.TRUE);
        Intrinsics.checkNotNullParameter(entry, "entry");
        kotlinx.coroutines.flow.g0 g0Var = this.f1068c;
        Set set = (Set) g0Var.getValue();
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.F.a(set.size()));
        boolean z3 = false;
        for (Object obj : set) {
            boolean z8 = true;
            if (!z3 && Intrinsics.c(obj, entry)) {
                z3 = true;
                z8 = false;
            }
            if (z8) {
                linkedHashSet.add(obj);
            }
        }
        g0Var.e(null, linkedHashSet);
        abstractC0130w.f1124y.remove(entry);
        C1843j c1843j = abstractC0130w.f1107g;
        boolean zContains = c1843j.contains(entry);
        kotlinx.coroutines.flow.g0 g0Var2 = abstractC0130w.f1109i;
        if (zContains) {
            if (this.f1069d) {
                return;
            }
            abstractC0130w.s();
            ArrayList arrayListZ = CollectionsKt.Z(c1843j);
            kotlinx.coroutines.flow.g0 g0Var3 = abstractC0130w.f1108h;
            g0Var3.getClass();
            g0Var3.e(null, arrayListZ);
            ArrayList arrayListO = abstractC0130w.o();
            g0Var2.getClass();
            g0Var2.e(null, arrayListO);
            return;
        }
        abstractC0130w.r(entry);
        if (entry.f1057i.f17478d.a(EnumC1204n.f17462c)) {
            entry.b(EnumC1204n.f17460a);
        }
        String backStackEntryId = entry.f1055f;
        if (c1843j == null || !c1843j.isEmpty()) {
            Iterator it = c1843j.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((C0119k) it.next()).f1055f, backStackEntryId)) {
                }
            }
            if (!zC && (c0131x = abstractC0130w.f1115o) != null) {
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                i0Var = (androidx.lifecycle.i0) c0131x.f1128d.remove(backStackEntryId);
                if (i0Var != null) {
                    i0Var.a();
                }
            }
        } else if (!zC) {
            Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
            i0Var = (androidx.lifecycle.i0) c0131x.f1128d.remove(backStackEntryId);
            if (i0Var != null) {
                i0Var.a();
            }
        }
        abstractC0130w.s();
        ArrayList arrayListO2 = abstractC0130w.o();
        g0Var2.getClass();
        g0Var2.e(null, arrayListO2);
    }

    public final void c(C0119k backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f1066a;
        reentrantLock.lock();
        try {
            ArrayList arrayListZ = CollectionsKt.Z((Collection) this.f1070e.f39102a.getValue());
            ListIterator listIterator = arrayListZ.listIterator(arrayListZ.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.c(((C0119k) listIterator.previous()).f1055f, backStackEntry.f1055f)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListZ.set(iNextIndex, backStackEntry);
            kotlinx.coroutines.flow.g0 g0Var = this.f1067b;
            g0Var.getClass();
            g0Var.e(null, arrayListZ);
            Unit unit = Unit.f38893a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(C0119k popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        AbstractC0130w abstractC0130w = this.f1073h;
        e0 e0VarB = abstractC0130w.f1120u.b(popUpTo.f1051b.f954a);
        if (!e0VarB.equals(this.f1072g)) {
            Object obj = abstractC0130w.f1121v.get(e0VarB);
            Intrinsics.e(obj);
            ((C0123o) obj).d(popUpTo, z3);
            return;
        }
        C0124p c0124p = abstractC0130w.f1123x;
        if (c0124p != null) {
            c0124p.invoke(popUpTo);
            e(popUpTo, z3);
            return;
        }
        C0122n onComplete = new C0122n(this, popUpTo, z3);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        C1843j c1843j = abstractC0130w.f1107g;
        int iIndexOf = c1843j.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Objects.toString(popUpTo);
            return;
        }
        int i7 = iIndexOf + 1;
        if (i7 != c1843j.f38933c) {
            abstractC0130w.l(((C0119k) c1843j.get(i7)).f1051b.f961i, true, false);
        }
        AbstractC0130w.n(abstractC0130w, popUpTo);
        onComplete.invoke();
        abstractC0130w.t();
        abstractC0130w.b();
    }

    public final void e(C0119k popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f1066a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.g0 g0Var = this.f1067b;
            Iterable iterable = (Iterable) g0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.c((C0119k) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            g0Var.getClass();
            g0Var.e(null, arrayList);
            Unit unit = Unit.f38893a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[EDGE_INSN: B:39:0x00a5->B:31:0x00a5 BREAK  A[LOOP:0: B:23:0x0078->B:40:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078 A[SYNTHETIC] */
    public final void f(C0119k popUpTo, boolean z3) {
        ListIterator listIterator;
        Object objPrevious;
        C0119k c0119k;
        C0119k c0119k2;
        MutableStateFlow mutableStateFlow;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        kotlinx.coroutines.flow.g0 g0Var = this.f1068c;
        Iterable iterable = (Iterable) g0Var.getValue();
        boolean z8 = iterable instanceof Collection;
        kotlinx.coroutines.flow.S s3 = this.f1070e;
        if (z8 && ((Collection) iterable).isEmpty()) {
            g0Var.e(null, kotlin.collections.P.c((Set) g0Var.getValue(), popUpTo));
            List list = (List) s3.f39102a.getValue();
            listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                c0119k2 = (C0119k) objPrevious;
                if (!Intrinsics.c(c0119k2, popUpTo)) {
                    mutableStateFlow = s3.f39102a;
                    if (((List) mutableStateFlow.getValue()).lastIndexOf(c0119k2) < ((List) mutableStateFlow.getValue()).lastIndexOf(popUpTo)) {
                        break;
                        break;
                    }
                }
            }
            c0119k = (C0119k) objPrevious;
            if (c0119k != null) {
                g0Var.e(null, kotlin.collections.P.c((Set) g0Var.getValue(), c0119k));
            }
            d(popUpTo, z3);
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C0119k) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) s3.f39102a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        do {
                            if (it2.hasNext()) {
                            }
                        } while (((C0119k) it2.next()) != popUpTo);
                    }
                }
            }
            g0Var.e(null, kotlin.collections.P.c((Set) g0Var.getValue(), popUpTo));
            List list2 = (List) s3.f39102a.getValue();
            listIterator = list2.listIterator(list2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                c0119k2 = (C0119k) objPrevious;
                if (!Intrinsics.c(c0119k2, popUpTo)) {
                    mutableStateFlow = s3.f39102a;
                    if (((List) mutableStateFlow.getValue()).lastIndexOf(c0119k2) < ((List) mutableStateFlow.getValue()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            }
            c0119k = (C0119k) objPrevious;
            if (c0119k != null) {
                g0Var.e(null, kotlin.collections.P.c((Set) g0Var.getValue(), c0119k));
            }
            d(popUpTo, z3);
        }
        this.f1073h.f1124y.put(popUpTo, Boolean.valueOf(z3));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.o] */
    public final void g(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        AbstractC0130w abstractC0130w = this.f1073h;
        e0 e0VarB = abstractC0130w.f1120u.b(backStackEntry.f1051b.f954a);
        if (!e0VarB.equals(this.f1072g)) {
            Object obj = abstractC0130w.f1121v.get(e0VarB);
            if (obj == null) {
                throw new IllegalStateException(G.r(new StringBuilder("NavigatorBackStack for "), backStackEntry.f1051b.f954a, " should already be created").toString());
            }
            ((C0123o) obj).g(backStackEntry);
            return;
        }
        ?? r3 = abstractC0130w.f1122w;
        if (r3 == 0) {
            Objects.toString(backStackEntry.f1051b);
        } else {
            r3.invoke(backStackEntry);
            a(backStackEntry);
        }
    }

    public final void h(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        kotlinx.coroutines.flow.g0 g0Var = this.f1068c;
        Iterable iterable = (Iterable) g0Var.getValue();
        boolean z3 = iterable instanceof Collection;
        kotlinx.coroutines.flow.S s3 = this.f1070e;
        if (!z3 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C0119k) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) s3.f39102a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0119k) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        C0119k c0119k = (C0119k) CollectionsKt.L((List) s3.f39102a.getValue());
        if (c0119k != null) {
            LinkedHashSet linkedHashSetC = kotlin.collections.P.c((Set) g0Var.getValue(), c0119k);
            g0Var.getClass();
            g0Var.e(null, linkedHashSetC);
        }
        LinkedHashSet linkedHashSetC2 = kotlin.collections.P.c((Set) g0Var.getValue(), backStackEntry);
        g0Var.getClass();
        g0Var.e(null, linkedHashSetC2);
        g(backStackEntry);
    }
}
