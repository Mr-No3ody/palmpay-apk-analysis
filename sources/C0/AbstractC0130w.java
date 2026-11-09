package C0;

import N8.q0;
import Yf.EnumC0789a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController$OnDestinationChangedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C1843j;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: C0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0130w {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static boolean f1097D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f1098A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f1099B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final kotlinx.coroutines.flow.W f1100C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f1102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N f1103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f1104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable[] f1105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1843j f1107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.g0 f1108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.g0 f1109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f1110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f1111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f1112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f1113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LifecycleOwner f1114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0131x f1115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f1116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EnumC1204n f1117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0120l f1118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p294tb.I f1119s;
    public final boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g0 f1120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f1121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.o f1122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0124p f1123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f1124y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1125z;

    static {
        new C0121m(null);
        f1097D = true;
    }

    public AbstractC0130w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1101a = context;
        for (Object obj : Sf.m.b(context, C0111c.f1006c)) {
            if (((Context) obj) instanceof Activity) {
                this.f1102b = (Activity) obj;
                this.f1107g = new C1843j();
                kotlin.collections.z zVar = kotlin.collections.z.f38935a;
                kotlinx.coroutines.flow.g0 g0VarA = kotlinx.coroutines.flow.X.a(zVar);
                this.f1108h = g0VarA;
                kotlinx.coroutines.flow.X.d(g0VarA);
                kotlinx.coroutines.flow.g0 g0VarA2 = kotlinx.coroutines.flow.X.a(zVar);
                this.f1109i = g0VarA2;
                kotlinx.coroutines.flow.X.d(g0VarA2);
                this.f1110j = new LinkedHashMap();
                this.f1111k = new LinkedHashMap();
                this.f1112l = new LinkedHashMap();
                this.f1113m = new LinkedHashMap();
                this.f1116p = new CopyOnWriteArrayList();
                this.f1117q = EnumC1204n.f17461b;
                this.f1118r = new C0120l(this, 0);
                this.f1119s = new p294tb.I(this);
                this.t = true;
                g0 g0Var = new g0();
                this.f1120u = g0Var;
                this.f1121v = new LinkedHashMap();
                this.f1124y = new LinkedHashMap();
                g0Var.a(new O(g0Var));
                g0Var.a(new C0109a(this.f1101a));
                this.f1098A = new ArrayList();
                this.f1099B = C2131j.b(new C0127t(this, 0));
                kotlinx.coroutines.flow.W w3 = new kotlinx.coroutines.flow.W(1, EnumC0789a.f11391b);
                this.f1100C = w3;
                new kotlinx.coroutines.flow.Q(w3);
            }
        }
        obj = null;
        this.f1102b = (Activity) obj;
        this.f1107g = new C1843j();
        kotlin.collections.z zVar2 = kotlin.collections.z.f38935a;
        kotlinx.coroutines.flow.g0 g0VarA3 = kotlinx.coroutines.flow.X.a(zVar2);
        this.f1108h = g0VarA3;
        kotlinx.coroutines.flow.X.d(g0VarA3);
        kotlinx.coroutines.flow.g0 g0VarA4 = kotlinx.coroutines.flow.X.a(zVar2);
        this.f1109i = g0VarA4;
        kotlinx.coroutines.flow.X.d(g0VarA4);
        this.f1110j = new LinkedHashMap();
        this.f1111k = new LinkedHashMap();
        this.f1112l = new LinkedHashMap();
        this.f1113m = new LinkedHashMap();
        this.f1116p = new CopyOnWriteArrayList();
        this.f1117q = EnumC1204n.f17461b;
        this.f1118r = new C0120l(this, 0);
        this.f1119s = new p294tb.I(this);
        this.t = true;
        g0 g0Var2 = new g0();
        this.f1120u = g0Var2;
        this.f1121v = new LinkedHashMap();
        this.f1124y = new LinkedHashMap();
        g0Var2.a(new O(g0Var2));
        g0Var2.a(new C0109a(this.f1101a));
        this.f1098A = new ArrayList();
        this.f1099B = C2131j.b(new C0127t(this, 0));
        kotlinx.coroutines.flow.W w6 = new kotlinx.coroutines.flow.W(1, EnumC0789a.f11391b);
        this.f1100C = w6;
        new kotlinx.coroutines.flow.Q(w6);
    }

    public static /* synthetic */ void n(AbstractC0130w abstractC0130w, C0119k c0119k) {
        abstractC0130w.m(c0119k, false, new C1843j());
    }

    public final void a(K k2, Bundle bundle, C0119k c0119k, List list) {
        Bundle bundle2;
        C1843j<C0119k> c1843j;
        Context context;
        C1843j c1843j2;
        Object obj;
        N n10;
        Object objPrevious;
        N n11;
        Object objPrevious2;
        K k8 = c0119k.f1051b;
        boolean z3 = k8 instanceof FloatingWindow;
        C1843j c1843j3 = this.f1107g;
        if (!z3) {
            while (!c1843j3.isEmpty() && (((C0119k) c1843j3.last()).f1051b instanceof FloatingWindow) && l(((C0119k) c1843j3.last()).f1051b.f961i, true, false)) {
            }
        }
        C1843j c1843j4 = new C1843j();
        boolean z8 = k2 instanceof N;
        boolean z10 = false;
        Context context2 = this.f1101a;
        Object obj2 = null;
        if (z8) {
            K k10 = k8;
            while (true) {
                Intrinsics.e(k10);
                N n12 = k10.f955b;
                if (n12 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!Intrinsics.c(((C0119k) objPrevious2).f1051b, n12));
                    C0119k c0119kCreate$default = (C0119k) objPrevious2;
                    if (c0119kCreate$default == null) {
                        n11 = n12;
                        c1843j = c1843j4;
                        bundle2 = bundle;
                        c0119kCreate$default = C0115g.create$default(C0119k.f1049v, context2, n11, bundle2, f(), this.f1115o, null, null, 96, null);
                    } else {
                        c1843j = c1843j4;
                        n11 = n12;
                        bundle2 = bundle;
                    }
                    context = context2;
                    c1843j.addFirst(c0119kCreate$default);
                    if (!c1843j3.isEmpty() && ((C0119k) c1843j3.last()).f1051b == n11) {
                        n(this, (C0119k) c1843j3.last());
                    }
                } else {
                    c1843j = c1843j4;
                    context = context2;
                    c1843j3 = c1843j3;
                    n11 = n12;
                    bundle2 = bundle;
                }
                if (n11 == null || n11 == k2) {
                    break;
                }
                k10 = n11;
                c1843j4 = c1843j;
                context2 = context;
                c1843j3 = c1843j3;
                z10 = false;
            }
        } else {
            bundle2 = bundle;
            c1843j = c1843j4;
            context = context2;
            c1843j3 = c1843j3;
        }
        K k11 = c1843j.isEmpty() ? k8 : ((C0119k) c1843j.first()).f1051b;
        while (k11 != null && c(k11.f961i) != k11) {
            N n13 = k11.f955b;
            if (n13 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!Intrinsics.c(((C0119k) objPrevious).f1051b, n13));
                C0119k c0119kCreate$default2 = (C0119k) objPrevious;
                if (c0119kCreate$default2 == null) {
                    n10 = n13;
                    c0119kCreate$default2 = C0115g.create$default(C0119k.f1049v, context, n10, n13.b(bundle3), f(), this.f1115o, null, null, 96, null);
                } else {
                    n10 = n13;
                }
                c1843j.addFirst(c0119kCreate$default2);
            } else {
                n10 = n13;
            }
            k11 = n10;
        }
        if (!c1843j.isEmpty()) {
            k8 = ((C0119k) c1843j.first()).f1051b;
        }
        while (!c1843j3.isEmpty() && (((C0119k) c1843j3.last()).f1051b instanceof N)) {
            K k12 = ((C0119k) c1843j3.last()).f1051b;
            Intrinsics.f(k12, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((N) k12).g(k8.f961i, false) != null) {
                break;
            } else {
                n(this, (C0119k) c1843j3.last());
            }
        }
        if (c1843j3.isEmpty()) {
            obj = null;
            c1843j2 = c1843j3;
        } else {
            c1843j2 = c1843j3;
            obj = c1843j2.f38932b[c1843j2.f38931a];
        }
        C0119k c0119k2 = (C0119k) obj;
        if (c0119k2 == null) {
            c0119k2 = (C0119k) (c1843j.isEmpty() ? null : c1843j.f38932b[c1843j.f38931a]);
        }
        if (!Intrinsics.c(c0119k2 != null ? c0119k2.f1051b : null, this.f1103c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                K k13 = ((C0119k) objPrevious3).f1051b;
                N n14 = this.f1103c;
                Intrinsics.e(n14);
                if (Intrinsics.c(k13, n14)) {
                    obj2 = objPrevious3;
                    break;
                }
            }
            C0119k c0119kCreate$default3 = (C0119k) obj2;
            if (c0119kCreate$default3 == null) {
                C0115g c0115g = C0119k.f1049v;
                N n15 = this.f1103c;
                Intrinsics.e(n15);
                N n16 = this.f1103c;
                Intrinsics.e(n16);
                c0119kCreate$default3 = C0115g.create$default(c0115g, context, n15, n16.b(bundle2), f(), this.f1115o, null, null, 96, null);
            }
            c1843j.addFirst(c0119kCreate$default3);
        }
        for (C0119k c0119k3 : c1843j) {
            Object obj3 = this.f1121v.get(this.f1120u.b(c0119k3.f1051b.f954a));
            if (obj3 == null) {
                throw new IllegalStateException(G.r(new StringBuilder("NavigatorBackStack for "), k2.f954a, " should already be created").toString());
            }
            ((C0123o) obj3).a(c0119k3);
        }
        c1843j2.addAll(c1843j);
        c1843j2.addLast(c0119k);
        for (C0119k c0119k4 : CollectionsKt.Q(c1843j, c0119k)) {
            N n17 = c0119k4.f1051b.f955b;
            if (n17 != null) {
                g(c0119k4, d(n17.f961i));
            }
        }
    }

    public final boolean b() {
        C1843j c1843j;
        while (true) {
            c1843j = this.f1107g;
            if (c1843j.isEmpty() || !(((C0119k) c1843j.last()).f1051b instanceof N)) {
                break;
            }
            n(this, (C0119k) c1843j.last());
        }
        C0119k c0119k = (C0119k) c1843j.f();
        ArrayList arrayList = this.f1098A;
        if (c0119k != null) {
            arrayList.add(c0119k);
        }
        this.f1125z++;
        s();
        int i7 = this.f1125z - 1;
        this.f1125z = i7;
        if (i7 == 0) {
            ArrayList<C0119k> arrayListZ = CollectionsKt.Z(arrayList);
            arrayList.clear();
            for (C0119k c0119k2 : arrayListZ) {
                Iterator it = this.f1116p.iterator();
                while (it.hasNext()) {
                    ((NavController$OnDestinationChangedListener) it.next()).onDestinationChanged(this, c0119k2.f1051b, c0119k2.a());
                }
                this.f1100C.tryEmit(c0119k2);
            }
            ArrayList arrayListZ2 = CollectionsKt.Z(c1843j);
            kotlinx.coroutines.flow.g0 g0Var = this.f1108h;
            g0Var.getClass();
            g0Var.e(null, arrayListZ2);
            ArrayList arrayListO = o();
            kotlinx.coroutines.flow.g0 g0Var2 = this.f1109i;
            g0Var2.getClass();
            g0Var2.e(null, arrayListO);
        }
        return c0119k != null;
    }

    public final K c(int i7) {
        K k2;
        N n10;
        N n11 = this.f1103c;
        if (n11 == null) {
            return null;
        }
        if (n11.f961i == i7) {
            return n11;
        }
        C0119k c0119k = (C0119k) this.f1107g.f();
        if (c0119k == null || (k2 = c0119k.f1051b) == null) {
            k2 = this.f1103c;
            Intrinsics.e(k2);
        }
        if (k2.f961i == i7) {
            return k2;
        }
        if (k2 instanceof N) {
            n10 = (N) k2;
        } else {
            n10 = k2.f955b;
            Intrinsics.e(n10);
        }
        return n10.g(i7, true);
    }

    public final C0119k d(int i7) {
        Object objPrevious;
        C1843j c1843j = this.f1107g;
        ListIterator<E> listIterator = c1843j.listIterator(c1843j.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C0119k) objPrevious).f1051b.f961i != i7);
        C0119k c0119k = (C0119k) objPrevious;
        if (c0119k != null) {
            return c0119k;
        }
        StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbE.append(e());
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public final K e() {
        C0119k c0119k = (C0119k) this.f1107g.f();
        if (c0119k != null) {
            return c0119k.f1051b;
        }
        return null;
    }

    public final EnumC1204n f() {
        return this.f1114n == null ? EnumC1204n.f17462c : this.f1117q;
    }

    public final void g(C0119k c0119k, C0119k c0119k2) {
        this.f1110j.put(c0119k, c0119k2);
        LinkedHashMap linkedHashMap = this.f1111k;
        if (linkedHashMap.get(c0119k2) == null) {
            linkedHashMap.put(c0119k2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0119k2);
        Intrinsics.e(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void h(int i7, Bundle bundle, U u6) {
        int i10;
        int i11;
        C1843j c1843j = this.f1107g;
        K k2 = c1843j.isEmpty() ? this.f1103c : ((C0119k) c1843j.last()).f1051b;
        if (k2 == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C0113e c0113eC = k2.c(i7);
        Bundle bundle2 = null;
        if (c0113eC != null) {
            if (u6 == null) {
                u6 = c0113eC.f1034b;
            }
            Bundle bundle3 = c0113eC.f1035c;
            i10 = c0113eC.f1033a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i10 = i7;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i10 == 0 && u6 != null && (i11 = u6.f985c) != -1) {
            if (i11 != -1) {
                k(i11, u6.f986d);
                return;
            }
            return;
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        K kC = c(i10);
        if (kC != null) {
            i(kC, bundle2, u6);
            return;
        }
        H h7 = K.f952o;
        Context context = this.f1101a;
        String displayName = h7.getDisplayName(context, i10);
        if (c0113eC == null) {
            throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + k2);
        }
        StringBuilder sbQ = q0.q("Navigation destination ", displayName, " referenced from action ");
        sbQ.append(h7.getDisplayName(context, i7));
        sbQ.append(" cannot be found from the current destination ");
        sbQ.append(k2);
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    public final void i(K k2, Bundle bundle, U u6) {
        boolean z3;
        K k8;
        int i7;
        LinkedHashMap linkedHashMap = this.f1121v;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C0123o) it.next()).f1069d = true;
        }
        kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
        int iNextIndex = -1;
        boolean zL = (u6 == null || (i7 = u6.f985c) == -1) ? false : l(i7, u6.f986d, u6.f987e);
        Bundle bundleB = k2.b(bundle);
        if (u6 != null && u6.f984b && this.f1112l.containsKey(Integer.valueOf(k2.f961i))) {
            b7.f38947a = p(k2.f961i, bundleB, u6);
            z3 = false;
        } else {
            g0 g0Var = this.f1120u;
            if (u6 == null || !u6.f983a) {
                z3 = false;
            } else {
                C1843j c1843j = this.f1107g;
                C0119k c0119k = (C0119k) c1843j.f();
                int i10 = k2 instanceof N ? N.f966A.findStartDestination((N) k2).f961i : k2.f961i;
                if (c0119k == null || (k8 = c0119k.f1051b) == null || i10 != k8.f961i) {
                    z3 = false;
                } else {
                    C1843j<C0119k> c1843j2 = new C1843j();
                    ListIterator listIterator = c1843j.listIterator(c1843j.a());
                    while (listIterator.hasPrevious()) {
                        if (((C0119k) listIterator.previous()).f1051b == k2) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    while (C1850q.g(c1843j) >= iNextIndex) {
                        C0119k entry = (C0119k) c1843j.removeLast();
                        r(entry);
                        Bundle bundleB2 = entry.f1051b.b(bundle);
                        Intrinsics.checkNotNullParameter(entry, "entry");
                        C0119k c0119k2 = new C0119k(entry.f1050a, entry.f1051b, bundleB2, entry.f1053d, entry.f1054e, entry.f1055f, entry.f1056g);
                        c0119k2.f1053d = entry.f1053d;
                        c0119k2.b(entry.f1060p);
                        c1843j2.addFirst(c0119k2);
                        iNextIndex = iNextIndex;
                    }
                    for (C0119k c0119k3 : c1843j2) {
                        N n10 = c0119k3.f1051b.f955b;
                        if (n10 != null) {
                            g(c0119k3, d(n10.f961i));
                        }
                        c1843j.addLast(c0119k3);
                    }
                    for (C0119k c0119k4 : c1843j2) {
                        g0Var.b(c0119k4.f1051b.f954a).f(c0119k4);
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                C0119k c0119kCreate$default = C0115g.create$default(C0119k.f1049v, this.f1101a, k2, bundleB, f(), this.f1115o, null, null, 96, null);
                e0 e0VarB = g0Var.b(k2.f954a);
                List listC = C1849p.c(c0119kCreate$default);
                this.f1122w = new C0128u(b7, this, k2, bundleB);
                e0VarB.d(listC, u6);
                this.f1122w = null;
            }
        }
        t();
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((C0123o) it2.next()).f1069d = false;
        }
        if (zL || b7.f38947a || z3) {
            b();
        } else {
            s();
        }
    }

    public final boolean j() {
        if (this.f1107g.isEmpty()) {
            return false;
        }
        K kE = e();
        Intrinsics.e(kE);
        return k(kE.f961i, true);
    }

    public final boolean k(int i7, boolean z3) {
        return l(i7, z3, false) && b();
    }

    public final boolean l(int i7, boolean z3, boolean z8) {
        K k2;
        AbstractC0130w abstractC0130w;
        boolean z10;
        String str;
        C1843j c1843j = this.f1107g;
        if (c1843j.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.R(c1843j).iterator();
        do {
            if (!it.hasNext()) {
                k2 = null;
                break;
            }
            k2 = ((C0119k) it.next()).f1051b;
            e0 e0VarB = this.f1120u.b(k2.f954a);
            if (z3 || k2.f961i != i7) {
                arrayList.add(e0VarB);
            }
        } while (k2.f961i != i7);
        if (k2 == null) {
            K.f952o.getDisplayName(this.f1101a, i7);
            return false;
        }
        kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
        C1843j c1843j2 = new C1843j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                abstractC0130w = this;
                z10 = z8;
                break;
            }
            e0 e0Var = (e0) it2.next();
            kotlin.jvm.internal.B b10 = new kotlin.jvm.internal.B();
            C0119k c0119k = (C0119k) this.f1107g.last();
            abstractC0130w = this;
            z10 = z8;
            abstractC0130w.f1123x = new C0124p(b10, b7, abstractC0130w, z10, c1843j2);
            e0Var.i(c0119k, z10);
            abstractC0130w.f1123x = null;
            if (!b10.f38947a) {
                break;
            }
            z8 = z10;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = abstractC0130w.f1112l;
            if (!z3) {
                Sf.d dVar = new Sf.d(Sf.p.h(Sf.m.b(k2, C0111c.f1008e), new C0125q(this, 0)), (byte) 0);
                while (dVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((K) dVar.next()).f961i);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) (c1843j2.isEmpty() ? null : c1843j2.f38932b[c1843j2.f38931a]);
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f17497a : null);
                }
            }
            if (!c1843j2.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c1843j2.first();
                Sf.d dVar2 = new Sf.d(Sf.p.h(Sf.m.b(c(navBackStackEntryState2.f17498b), C0111c.f1009f), new C0125q(this, 1)), (byte) 0);
                while (true) {
                    boolean zHasNext = dVar2.hasNext();
                    str = navBackStackEntryState2.f17497a;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((K) dVar2.next()).f961i), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    abstractC0130w.f1113m.put(str, c1843j2);
                }
            }
        }
        t();
        return b7.f38947a;
    }

    public final void m(C0119k c0119k, boolean z3, C1843j c1843j) {
        C0131x c0131x;
        kotlinx.coroutines.flow.S s3;
        Set set;
        C1843j c1843j2 = this.f1107g;
        C0119k c0119k2 = (C0119k) c1843j2.last();
        if (!Intrinsics.c(c0119k2, c0119k)) {
            throw new IllegalStateException(("Attempted to pop " + c0119k.f1051b + ", which is not the top of the back stack (" + c0119k2.f1051b + ')').toString());
        }
        c1843j2.removeLast();
        C0123o c0123o = (C0123o) this.f1121v.get(this.f1120u.b(c0119k2.f1051b.f954a));
        boolean z8 = true;
        if ((c0123o == null || (s3 = c0123o.f1071f) == null || (set = (Set) s3.f39102a.getValue()) == null || !set.contains(c0119k2)) && !this.f1111k.containsKey(c0119k2)) {
            z8 = false;
        }
        EnumC1204n enumC1204n = c0119k2.f1057i.f17478d;
        EnumC1204n enumC1204n2 = EnumC1204n.f17462c;
        if (enumC1204n.a(enumC1204n2)) {
            if (z3) {
                c0119k2.b(enumC1204n2);
                c1843j.addFirst(new NavBackStackEntryState(c0119k2));
            }
            if (z8) {
                c0119k2.b(enumC1204n2);
            } else {
                c0119k2.b(EnumC1204n.f17460a);
                r(c0119k2);
            }
        }
        if (z3 || z8 || (c0131x = this.f1115o) == null) {
            return;
        }
        String backStackEntryId = c0119k2.f1055f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) c0131x.f1128d.remove(backStackEntryId);
        if (i0Var != null) {
            i0Var.a();
        }
    }

    public final ArrayList o() {
        EnumC1204n enumC1204n;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1121v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC1204n = EnumC1204n.f17463d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C0123o) it.next()).f1071f.f39102a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0119k c0119k = (C0119k) obj;
                if (!arrayList.contains(c0119k) && !c0119k.f1060p.a(enumC1204n)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.v.n(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f1107g) {
            C0119k c0119k2 = (C0119k) obj2;
            if (!arrayList.contains(c0119k2) && c0119k2.f1060p.a(enumC1204n)) {
                arrayList3.add(obj2);
            }
        }
        kotlin.collections.v.n(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C0119k) obj3).f1051b instanceof N)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i7, Bundle bundle, U u6) {
        K k2;
        C0119k c0119k;
        K k8;
        N n10;
        K kG;
        LinkedHashMap linkedHashMap = this.f1112l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i7));
        Collection collectionValues = linkedHashMap.values();
        C0129v predicate = new C0129v(str, 0);
        Intrinsics.checkNotNullParameter(collectionValues, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.collections.v.q(collectionValues, predicate, true);
        C1843j<NavBackStackEntryState> c1843j = (C1843j) kotlin.jvm.internal.K.c(this.f1113m).remove(str);
        ArrayList arrayList = new ArrayList();
        C0119k c0119k2 = (C0119k) this.f1107g.f();
        if ((c0119k2 == null || (k2 = c0119k2.f1051b) == null) && (k2 = this.f1103c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (c1843j != null) {
            for (NavBackStackEntryState navBackStackEntryState : c1843j) {
                int i10 = navBackStackEntryState.f17498b;
                if (k2.f961i == i10) {
                    kG = k2;
                } else {
                    if (k2 instanceof N) {
                        n10 = (N) k2;
                    } else {
                        n10 = k2.f955b;
                        Intrinsics.e(n10);
                    }
                    kG = n10.g(i10, true);
                }
                Context context = this.f1101a;
                if (kG == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + K.f952o.getDisplayName(context, navBackStackEntryState.f17498b) + " cannot be found from the current destination " + k2).toString());
                }
                arrayList.add(navBackStackEntryState.c(context, kG, f(), this.f1115o));
                k2 = kG;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C0119k) obj).f1051b instanceof N)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C0119k c0119k3 = (C0119k) it.next();
            List list = (List) CollectionsKt.L(arrayList2);
            if (list != null && (c0119k = (C0119k) CollectionsKt.K(list)) != null && (k8 = c0119k.f1051b) != null) {
                str2 = k8.f954a;
            }
            if (Intrinsics.c(str2, c0119k3.f1051b.f954a)) {
                list.add(c0119k3);
            } else {
                arrayList2.add(C1850q.i(c0119k3));
            }
        }
        kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
        for (List list2 : arrayList2) {
            e0 e0VarB = this.f1120u.b(((C0119k) CollectionsKt.F(list2)).f1051b.f954a);
            Bundle bundle2 = bundle;
            this.f1122w = new r(b7, arrayList, new kotlin.jvm.internal.D(), this, bundle2);
            e0VarB.d(list2, u6);
            this.f1122w = null;
            bundle = bundle2;
        }
        return b7.f38947a;
    }

    public final void q(N graph, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] intArray;
        String displayName;
        boolean z3;
        K kG;
        Bundle bundle2;
        boolean z8;
        K kG2;
        Object obj;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        boolean zC = Intrinsics.c(this.f1103c, graph);
        C1843j<C0119k> c1843j = this.f1107g;
        if (zC) {
            M.o oVar = graph.t;
            int iE = oVar.e();
            for (int i7 = 0; i7 < iE; i7++) {
                K k2 = (K) oVar.f(i7);
                N n10 = this.f1103c;
                Intrinsics.e(n10);
                int iC = n10.t.c(i7);
                N n11 = this.f1103c;
                Intrinsics.e(n11);
                M.o oVar2 = n11.t;
                if (oVar2.f5696a) {
                    M.k.a(oVar2);
                }
                int iA = N.a.a(oVar2.f5699d, iC, oVar2.f5697b);
                if (iA >= 0) {
                    Object[] objArr = oVar2.f5698c;
                    Object obj2 = objArr[iA];
                    objArr[iA] = k2;
                }
            }
            for (C0119k c0119k : c1843j) {
                kotlin.collections.K kV = kotlin.collections.w.v(Sf.p.i(K.f952o.getHierarchy(c0119k.f1051b)));
                K kG3 = this.f1103c;
                Intrinsics.e(kG3);
                Iterator it = kV.iterator();
                while (true) {
                    ListIterator listIterator = ((kotlin.collections.J) it).f38901a;
                    if (listIterator.hasPrevious()) {
                        K k8 = (K) listIterator.previous();
                        if ((!Intrinsics.c(k8, this.f1103c) || !Intrinsics.c(kG3, graph)) && (kG3 instanceof N)) {
                            kG3 = ((N) kG3).g(k8.f961i, true);
                            Intrinsics.e(kG3);
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(kG3, "<set-?>");
                c0119k.f1051b = kG3;
            }
            return;
        }
        N n12 = this.f1103c;
        LinkedHashMap linkedHashMap = this.f1121v;
        if (n12 != null) {
            for (Integer id2 : new ArrayList(this.f1112l.keySet())) {
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                int iIntValue = id2.intValue();
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((C0123o) it2.next()).f1069d = true;
                }
                boolean zP = p(iIntValue, null, p002a.a.u(C0111c.f1007d));
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((C0123o) it3.next()).f1069d = false;
                }
                if (zP) {
                    l(iIntValue, true, false);
                }
            }
            l(n12.f961i, true, false);
        }
        this.f1103c = graph;
        Bundle bundle3 = this.f1104d;
        g0 g0Var = this.f1120u;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                e0 e0VarB = g0Var.b(name);
                Bundle bundle4 = bundle3.getBundle(name);
                if (bundle4 != null) {
                    e0VarB.g(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.f1105e;
        Context context = this.f1101a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                int i10 = navBackStackEntryState.f17498b;
                K kC = c(i10);
                if (kC == null) {
                    StringBuilder sbQ = q0.q("Restoring the Navigation back stack failed: destination ", K.f952o.getDisplayName(context, i10), " cannot be found from the current destination ");
                    sbQ.append(e());
                    throw new IllegalStateException(sbQ.toString());
                }
                C0119k c0119kC = navBackStackEntryState.c(context, kC, f(), this.f1115o);
                e0 e0VarB2 = g0Var.b(kC.f954a);
                Object obj3 = linkedHashMap.get(e0VarB2);
                if (obj3 == null) {
                    obj = obj3;
                    C0123o c0123o = new C0123o(this, e0VarB2);
                    linkedHashMap.put(e0VarB2, c0123o);
                    obj = c0123o;
                }
                obj = obj3;
                c1843j.addLast(c0119kC);
                ((C0123o) obj).a(c0119kC);
                N n13 = c0119kC.f1051b.f955b;
                if (n13 != null) {
                    g(c0119kC, d(n13.f961i));
                }
            }
            t();
            this.f1105e = null;
        }
        Collection collectionValues = kotlin.collections.G.k(g0Var.f1044a).values();
        ArrayList<e0> arrayList = new ArrayList();
        for (Object obj4 : collectionValues) {
            if (!((e0) obj4).f1037b) {
                arrayList.add(obj4);
            }
        }
        for (e0 e0Var : arrayList) {
            Object c0123o2 = linkedHashMap.get(e0Var);
            if (c0123o2 == null) {
                c0123o2 = new C0123o(this, e0Var);
                linkedHashMap.put(e0Var, c0123o2);
            }
            e0Var.e((C0123o) c0123o2);
        }
        if (this.f1103c == null || !c1843j.isEmpty()) {
            b();
            return;
        }
        if (!this.f1106f && (activity = this.f1102b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e10) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundle5 = new Bundle();
            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle6 != null) {
                bundle5.putAll(bundle6);
            }
            if (intArray == null || intArray.length == 0) {
                N n14 = this.f1103c;
                Intrinsics.e(n14);
                Intrinsics.checkNotNullParameter(intent, "intent");
                I iD = n14.d(new top.zibin.luban.io.a(intent.getData(), 2, intent.getAction(), intent.getType()));
                if (iD != null) {
                    K k10 = iD.f944a;
                    k10.getClass();
                    C1843j c1843j2 = new C1843j();
                    K k11 = k10;
                    while (true) {
                        N n15 = k11.f955b;
                        if (n15 == null || n15.f967v != k11.f961i) {
                            c1843j2.addFirst(k11);
                        }
                        if (Intrinsics.c(n15, null) || n15 == null) {
                            break;
                        } else {
                            k11 = n15;
                        }
                    }
                    List listY = CollectionsKt.Y(c1843j2);
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(listY, 10));
                    Iterator it4 = listY.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(Integer.valueOf(((K) it4.next()).f961i));
                    }
                    intArray = CollectionsKt.X(arrayList2);
                    Bundle bundleB = k10.b(iD.f945b);
                    if (bundleB != null) {
                        bundle5.putAll(bundleB);
                    }
                    parcelableArrayList = null;
                }
            }
            if (intArray != null && intArray.length != 0) {
                N n16 = this.f1103c;
                int length = intArray.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        displayName = null;
                        break;
                    }
                    int i12 = intArray[i11];
                    if (i11 == 0) {
                        N n17 = this.f1103c;
                        Intrinsics.e(n17);
                        kG2 = n17.f961i == i12 ? this.f1103c : null;
                        z8 = true;
                    } else {
                        Intrinsics.e(n16);
                        z8 = true;
                        kG2 = n16.g(i12, true);
                    }
                    if (kG2 == null) {
                        displayName = K.f952o.getDisplayName(context, i12);
                        break;
                    }
                    if (i11 != intArray.length - (z8 ? 1 : 0) && (kG2 instanceof N)) {
                        N n18 = (N) kG2;
                        while (true) {
                            Intrinsics.e(n18);
                            if (!(n18.g(n18.f967v, z8) instanceof N)) {
                                break;
                            }
                            n18 = (N) n18.g(n18.f967v, z8);
                            z8 = true;
                        }
                        n16 = n18;
                    }
                    i11++;
                }
                if (displayName == null) {
                    bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length2 = intArray.length;
                    Bundle[] bundleArr = new Bundle[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        Bundle bundle7 = new Bundle();
                        bundle7.putAll(bundle5);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i13)) != null) {
                            bundle7.putAll(bundle2);
                        }
                        bundleArr[i13] = bundle7;
                    }
                    int flags = intent.getFlags();
                    int i14 = 268435456 & flags;
                    if (i14 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        androidx.core.app.Q q10 = new androidx.core.app.Q(context);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(q10.f15953b.getPackageManager());
                        }
                        if (component != null) {
                            q10.a(component);
                        }
                        q10.f15952a.add(intent);
                        Intrinsics.checkNotNullExpressionValue(q10, "create(context)\n        …ntWithParentStack(intent)");
                        q10.b();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i14 != 0) {
                        if (!c1843j.isEmpty()) {
                            N n19 = this.f1103c;
                            Intrinsics.e(n19);
                            l(n19.f961i, true, false);
                        }
                        int i15 = 0;
                        while (i15 < intArray.length) {
                            int i16 = intArray[i15];
                            int i17 = i15 + 1;
                            Bundle bundle8 = bundleArr[i15];
                            K kC2 = c(i16);
                            if (kC2 == null) {
                                StringBuilder sbQ2 = q0.q("Deep Linking failed: destination ", K.f952o.getDisplayName(context, i16), " cannot be found from the current destination ");
                                sbQ2.append(e());
                                throw new IllegalStateException(sbQ2.toString());
                            }
                            i(kC2, bundle8, p002a.a.u(new C0126s(0, kC2, this)));
                            i15 = i17;
                        }
                        this.f1106f = true;
                        return;
                    }
                    N n20 = this.f1103c;
                    int length3 = intArray.length;
                    int i18 = 0;
                    while (i18 < length3) {
                        int i19 = intArray[i18];
                        Bundle bundle9 = bundleArr[i18];
                        if (i18 == 0) {
                            kG = this.f1103c;
                            z3 = true;
                        } else {
                            Intrinsics.e(n20);
                            z3 = true;
                            kG = n20.g(i19, true);
                        }
                        if (kG == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + K.f952o.getDisplayName(context, i19) + " cannot be found in graph " + n20);
                        }
                        if (i18 == intArray.length - (z3 ? 1 : 0)) {
                            N n21 = this.f1103c;
                            Intrinsics.e(n21);
                            length3 = length3;
                            i18 = i18;
                            intArray = intArray;
                            i(kG, bundle9, new U(false, false, n21.f961i, true, false, 0, 0, -1, -1));
                        } else if (kG instanceof N) {
                            N n22 = (N) kG;
                            while (true) {
                                Intrinsics.e(n22);
                                if (!(n22.g(n22.f967v, z3) instanceof N)) {
                                    break;
                                }
                                n22 = (N) n22.g(n22.f967v, z3);
                                z3 = true;
                            }
                            n20 = n22;
                        }
                        i18++;
                        intArray = intArray;
                        bundleArr = bundleArr;
                        length3 = length3;
                    }
                    this.f1106f = true;
                    return;
                }
                intent.toString();
            }
        }
        K k12 = this.f1103c;
        Intrinsics.e(k12);
        i(k12, bundle, null);
    }

    public final void r(C0119k child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C0119k c0119k = (C0119k) this.f1110j.remove(child);
        if (c0119k == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f1111k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0119k);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0123o c0123o = (C0123o) this.f1121v.get(this.f1120u.b(c0119k.f1051b.f954a));
            if (c0123o != null) {
                c0123o.b(c0119k);
            }
            linkedHashMap.remove(c0119k);
        }
    }

    public final void s() {
        AtomicInteger atomicInteger;
        kotlinx.coroutines.flow.S s3;
        Set set;
        ArrayList<C0119k> arrayListZ = CollectionsKt.Z(this.f1107g);
        if (arrayListZ.isEmpty()) {
            return;
        }
        K k2 = ((C0119k) CollectionsKt.K(arrayListZ)).f1051b;
        ArrayList arrayList = new ArrayList();
        if (k2 instanceof FloatingWindow) {
            Iterator it = CollectionsKt.R(arrayListZ).iterator();
            while (it.hasNext()) {
                K k8 = ((C0119k) it.next()).f1051b;
                arrayList.add(k8);
                if (!(k8 instanceof FloatingWindow) && !(k8 instanceof N)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C0119k c0119k : CollectionsKt.R(arrayListZ)) {
            EnumC1204n enumC1204n = c0119k.f1060p;
            K k10 = c0119k.f1051b;
            EnumC1204n enumC1204n2 = EnumC1204n.f17464e;
            EnumC1204n enumC1204n3 = EnumC1204n.f17463d;
            if (k2 != null && k10.f961i == k2.f961i) {
                if (enumC1204n != enumC1204n2) {
                    C0123o c0123o = (C0123o) this.f1121v.get(this.f1120u.b(k10.f954a));
                    if (Intrinsics.c((c0123o == null || (s3 = c0123o.f1071f) == null || (set = (Set) s3.f39102a.getValue()) == null) ? null : Boolean.valueOf(set.contains(c0119k)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f1111k.get(c0119k)) != null && atomicInteger.get() == 0)) {
                        map.put(c0119k, enumC1204n3);
                    } else {
                        map.put(c0119k, enumC1204n2);
                    }
                }
                K k11 = (K) CollectionsKt.firstOrNull(arrayList);
                if (k11 != null && k11.f961i == k10.f961i) {
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                k2 = k2.f955b;
            } else if (arrayList.isEmpty() || k10.f961i != ((K) CollectionsKt.F(arrayList)).f961i) {
                c0119k.b(EnumC1204n.f17462c);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                K k12 = (K) arrayList.remove(0);
                if (enumC1204n == enumC1204n2) {
                    c0119k.b(enumC1204n3);
                } else if (enumC1204n != enumC1204n3) {
                    map.put(c0119k, enumC1204n3);
                }
                N n10 = k12.f955b;
                if (n10 != null && !arrayList.contains(n10)) {
                    arrayList.add(n10);
                }
            }
        }
        for (C0119k c0119k2 : arrayListZ) {
            EnumC1204n enumC1204n4 = (EnumC1204n) map.get(c0119k2);
            if (enumC1204n4 != null) {
                c0119k2.b(enumC1204n4);
            } else {
                c0119k2.c();
            }
        }
    }

    public final void t() {
        int i7;
        boolean z3 = false;
        if (this.t) {
            C1843j c1843j = this.f1107g;
            if (c1843j == null || !c1843j.isEmpty()) {
                Iterator it = c1843j.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!(((C0119k) it.next()).f1051b instanceof N) && (i7 = i7 + 1) < 0) {
                        C1850q.j();
                        throw null;
                    }
                }
            } else {
                i7 = 0;
            }
            if (i7 > 1) {
                z3 = true;
            }
        }
        this.f1119s.setEnabled(z3);
    }
}
