package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.maps.android.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z implements FragmentResultOwner {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.activity.result.g f17053C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public androidx.activity.result.g f17054D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public androidx.activity.result.g f17055E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f17057G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17058H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f17059I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f17060J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f17061K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f17062L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f17063M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f17064N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C1166c0 f17065O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17068b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f17071e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.I f17073g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f17079m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O f17082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final O f17083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final O f17084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final O f17085s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public K f17087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public H f17088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Fragment f17089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Fragment f17090y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17067a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f17069c = new h0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f17072f = new M(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p294tb.K f17074h = new p294tb.K(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f17075i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f17076j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f17077k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f17078l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F f17080n = new F(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f17081o = new CopyOnWriteArrayList();
    public final Q t = new Q(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17086u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public L8.e f17091z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final S f17051A = new S(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final T f17052B = new T();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayDeque f17056F = new ArrayDeque();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final RunnableC1177l f17066P = new RunnableC1177l(this, 2);

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.O] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.O] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.O] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.O] */
    public Z() {
        final int i7 = 0;
        this.f17082p = new Consumer(this) { // from class: androidx.fragment.app.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Z f17035b;

            {
                this.f17035b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Z z3 = this.f17035b;
                        if (z3.N()) {
                            z3.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Z z8 = this.f17035b;
                        if (z8.N() && num.intValue() == 80) {
                            z8.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.t tVar = (androidx.core.app.t) obj;
                        Z z10 = this.f17035b;
                        if (z10.N()) {
                            z10.m(tVar.f16000a, false);
                        }
                        break;
                    default:
                        androidx.core.app.N n10 = (androidx.core.app.N) obj;
                        Z z11 = this.f17035b;
                        if (z11.N()) {
                            z11.r(n10.f15944a, false);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f17083q = new Consumer(this) { // from class: androidx.fragment.app.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Z f17035b;

            {
                this.f17035b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Z z3 = this.f17035b;
                        if (z3.N()) {
                            z3.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Z z8 = this.f17035b;
                        if (z8.N() && num.intValue() == 80) {
                            z8.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.t tVar = (androidx.core.app.t) obj;
                        Z z10 = this.f17035b;
                        if (z10.N()) {
                            z10.m(tVar.f16000a, false);
                        }
                        break;
                    default:
                        androidx.core.app.N n10 = (androidx.core.app.N) obj;
                        Z z11 = this.f17035b;
                        if (z11.N()) {
                            z11.r(n10.f15944a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f17084r = new Consumer(this) { // from class: androidx.fragment.app.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Z f17035b;

            {
                this.f17035b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Z z3 = this.f17035b;
                        if (z3.N()) {
                            z3.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Z z8 = this.f17035b;
                        if (z8.N() && num.intValue() == 80) {
                            z8.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.t tVar = (androidx.core.app.t) obj;
                        Z z10 = this.f17035b;
                        if (z10.N()) {
                            z10.m(tVar.f16000a, false);
                        }
                        break;
                    default:
                        androidx.core.app.N n10 = (androidx.core.app.N) obj;
                        Z z11 = this.f17035b;
                        if (z11.N()) {
                            z11.r(n10.f15944a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f17085s = new Consumer(this) { // from class: androidx.fragment.app.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Z f17035b;

            {
                this.f17035b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Z z3 = this.f17035b;
                        if (z3.N()) {
                            z3.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Z z8 = this.f17035b;
                        if (z8.N() && num.intValue() == 80) {
                            z8.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.t tVar = (androidx.core.app.t) obj;
                        Z z10 = this.f17035b;
                        if (z10.N()) {
                            z10.m(tVar.f16000a, false);
                        }
                        break;
                    default:
                        androidx.core.app.N n10 = (androidx.core.app.N) obj;
                        Z z11 = this.f17035b;
                        if (z11.N()) {
                            z11.r(n10.f15944a, false);
                        }
                        break;
                }
            }
        };
    }

    public static Fragment C(ViewGroup viewGroup) {
        Fragment fragmentF = F(viewGroup);
        if (fragmentF != null) {
            return fragmentF;
        }
        throw new IllegalStateException("View " + viewGroup + " does not have a Fragment set");
    }

    public static Fragment F(View view) {
        while (view != null) {
            Object tag = view.getTag(p260r0.b.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static boolean L(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean M(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zM = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f17069c.e()) {
            if (fragment2 != null) {
                zM = M(fragment2);
            }
            if (zM) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        Z z3 = fragment.mFragmentManager;
        return fragment.equals(z3.f17090y) && O(z3.f17089x);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0231 A[PHI: r13
      0x0231: PHI (r13v10 int) = (r13v9 int), (r13v11 int) binds: [B:100:0x0221, B:105:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        ViewGroup viewGroup;
        ArrayList arrayList3;
        boolean z3;
        int i11;
        boolean z8;
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11 = ((C1161a) arrayList.get(i7)).f17176p;
        ArrayList arrayList4 = this.f17064N;
        if (arrayList4 == null) {
            this.f17064N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f17064N;
        h0 h0Var = this.f17069c;
        arrayList5.addAll(h0Var.f());
        Fragment fragment = this.f17090y;
        int i15 = i7;
        boolean z12 = false;
        while (true) {
            int i16 = 1;
            if (i15 >= i10) {
                boolean z13 = z11;
                boolean z14 = z12;
                this.f17064N.clear();
                if (!z13 && this.f17086u >= 1) {
                    for (int i17 = i7; i17 < i10; i17++) {
                        Iterator it = ((C1161a) arrayList.get(i17)).f17161a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((j0) it.next()).f17153b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                h0Var.g(f(fragment2));
                            }
                        }
                    }
                }
                for (int i18 = i7; i18 < i10; i18++) {
                    C1161a c1161a = (C1161a) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                        c1161a.g(-1);
                        ArrayList arrayList6 = c1161a.f17161a;
                        boolean z15 = true;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            j0 j0Var = (j0) arrayList6.get(size);
                            Fragment fragment3 = j0Var.f17153b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = c1161a.f17094u;
                                fragment3.setPopDirection(z15);
                                int i19 = c1161a.f17166f;
                                int i20 = 8194;
                                int i21 = 4097;
                                if (i19 != 4097) {
                                    if (i19 != 8194) {
                                        i20 = 4100;
                                        i21 = 8197;
                                        if (i19 != 8197) {
                                            if (i19 == 4099) {
                                                i20 = 4099;
                                            } else if (i19 != 4100) {
                                                i20 = 0;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                    } else {
                                        i20 = i21;
                                    }
                                }
                                fragment3.setNextTransition(i20);
                                fragment3.setSharedElementNames(c1161a.f17175o, c1161a.f17174n);
                            }
                            int i22 = j0Var.f17152a;
                            Z z16 = c1161a.f17092r;
                            switch (i22) {
                                case 1:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z15 = true;
                                    z16.f0(fragment3, true);
                                    z16.Z(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + j0Var.f17152a);
                                case 3:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z16.a(fragment3);
                                    z15 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z16.getClass();
                                    if (L(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    z15 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z16.f0(fragment3, true);
                                    if (L(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        z16.i0(fragment3);
                                    }
                                    z15 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z16.c(fragment3);
                                    z15 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(j0Var.f17155d, j0Var.f17156e, j0Var.f17157f, j0Var.f17158g);
                                    z16.f0(fragment3, true);
                                    z16.g(fragment3);
                                    z15 = true;
                                    break;
                                case 8:
                                    z16.h0(null);
                                    z15 = true;
                                    break;
                                case 9:
                                    z16.h0(fragment3);
                                    z15 = true;
                                    break;
                                case 10:
                                    z16.g0(fragment3, j0Var.f17159h);
                                    z15 = true;
                                    break;
                            }
                        }
                    } else {
                        c1161a.g(1);
                        ArrayList arrayList7 = c1161a.f17161a;
                        int size2 = arrayList7.size();
                        for (int i23 = 0; i23 < size2; i23++) {
                            j0 j0Var2 = (j0) arrayList7.get(i23);
                            Fragment fragment4 = j0Var2.f17153b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = c1161a.f17094u;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(c1161a.f17166f);
                                fragment4.setSharedElementNames(c1161a.f17174n, c1161a.f17175o);
                            }
                            int i24 = j0Var2.f17152a;
                            Z z17 = c1161a.f17092r;
                            switch (i24) {
                                case 1:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.f0(fragment4, false);
                                    z17.a(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + j0Var2.f17152a);
                                case 3:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.Z(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.getClass();
                                    if (L(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (!fragment4.mHidden) {
                                        fragment4.mHidden = true;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                        z17.i0(fragment4);
                                    }
                                    break;
                                case 5:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.f0(fragment4, false);
                                    if (L(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (fragment4.mHidden) {
                                        fragment4.mHidden = false;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    }
                                    break;
                                case 6:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.g(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(j0Var2.f17155d, j0Var2.f17156e, j0Var2.f17157f, j0Var2.f17158g);
                                    z17.f0(fragment4, false);
                                    z17.c(fragment4);
                                    break;
                                case 8:
                                    z17.h0(fragment4);
                                    break;
                                case 9:
                                    z17.h0(null);
                                    break;
                                case 10:
                                    z17.g0(fragment4, j0Var2.f17160i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                if (z14 && (arrayList3 = this.f17079m) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C1161a c1161a2 = (C1161a) it2.next();
                        HashSet hashSet = new HashSet();
                        for (int i25 = 0; i25 < c1161a2.f17161a.size(); i25++) {
                            Fragment fragment5 = ((j0) c1161a2.f17161a.get(i25)).f17153b;
                            if (fragment5 != null && c1161a2.f17167g) {
                                hashSet.add(fragment5);
                            }
                        }
                        linkedHashSet.addAll(hashSet);
                    }
                    for (FragmentManager$OnBackStackChangedListener fragmentManager$OnBackStackChangedListener : this.f17079m) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            fragmentManager$OnBackStackChangedListener.onBackStackChangeStarted((Fragment) it3.next(), zBooleanValue);
                        }
                    }
                    for (FragmentManager$OnBackStackChangedListener fragmentManager$OnBackStackChangedListener2 : this.f17079m) {
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            fragmentManager$OnBackStackChangedListener2.onBackStackChangeCommitted((Fragment) it4.next(), zBooleanValue);
                        }
                    }
                }
                for (int i26 = i7; i26 < i10; i26++) {
                    C1161a c1161a3 = (C1161a) arrayList.get(i26);
                    if (zBooleanValue) {
                        for (int size3 = c1161a3.f17161a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = ((j0) c1161a3.f17161a.get(size3)).f17153b;
                            if (fragment6 != null) {
                                f(fragment6).i();
                            }
                        }
                    } else {
                        Iterator it5 = c1161a3.f17161a.iterator();
                        while (it5.hasNext()) {
                            Fragment fragment7 = ((j0) it5.next()).f17153b;
                            if (fragment7 != null) {
                                f(fragment7).i();
                            }
                        }
                    }
                }
                Q(this.f17086u, true);
                HashSet<D0> hashSet2 = new HashSet();
                for (int i27 = i7; i27 < i10; i27++) {
                    Iterator it6 = ((C1161a) arrayList.get(i27)).f17161a.iterator();
                    while (it6.hasNext()) {
                        Fragment fragment8 = ((j0) it6.next()).f17153b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet2.add(D0.f16973f.getOrCreateController(viewGroup, this));
                        }
                    }
                }
                for (D0 d1 : hashSet2) {
                    d1.f16977d = zBooleanValue;
                    d1.f();
                    d1.c();
                }
                for (int i28 = i7; i28 < i10; i28++) {
                    C1161a c1161a4 = (C1161a) arrayList.get(i28);
                    if (((Boolean) arrayList2.get(i28)).booleanValue() && c1161a4.t >= 0) {
                        c1161a4.t = -1;
                    }
                    if (c1161a4.f17177q != null) {
                        for (int i29 = 0; i29 < c1161a4.f17177q.size(); i29++) {
                            ((Runnable) c1161a4.f17177q.get(i29)).run();
                        }
                        c1161a4.f17177q = null;
                    }
                }
                if (!z14 || this.f17079m == null) {
                    return;
                }
                for (int i30 = 0; i30 < this.f17079m.size(); i30++) {
                    ((FragmentManager$OnBackStackChangedListener) this.f17079m.get(i30)).onBackStackChanged();
                }
                return;
            }
            C1161a c1161a5 = (C1161a) arrayList.get(i15);
            if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                z3 = z11;
                i11 = i15;
                z8 = z12;
                int i31 = 1;
                ArrayList arrayList8 = this.f17064N;
                ArrayList arrayList9 = c1161a5.f17161a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    j0 j0Var3 = (j0) arrayList9.get(size4);
                    int i32 = j0Var3.f17152a;
                    if (i32 == i31) {
                        arrayList8.remove(j0Var3.f17153b);
                    } else if (i32 != 3) {
                        switch (i32) {
                            case 6:
                                arrayList8.add(j0Var3.f17153b);
                                break;
                            case 7:
                                arrayList8.remove(j0Var3.f17153b);
                                break;
                            case 8:
                                fragment = null;
                                break;
                            case 9:
                                fragment = j0Var3.f17153b;
                                break;
                            case 10:
                                j0Var3.f17160i = j0Var3.f17159h;
                                break;
                        }
                    } else {
                        arrayList8.add(j0Var3.f17153b);
                    }
                    size4--;
                    i31 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f17064N;
                int i33 = 0;
                while (true) {
                    ArrayList arrayList11 = c1161a5.f17161a;
                    if (i33 < arrayList11.size()) {
                        j0 j0Var4 = (j0) arrayList11.get(i33);
                        int i34 = j0Var4.f17152a;
                        if (i34 != i16) {
                            if (i34 != 2) {
                                if (i34 == 3 || i34 == 6) {
                                    z11 = z11;
                                    arrayList10.remove(j0Var4.f17153b);
                                    Fragment fragment9 = j0Var4.f17153b;
                                    if (fragment9 == fragment) {
                                        arrayList11.add(i33, new j0(fragment9, 9));
                                        i33++;
                                        i13 = i15;
                                        z10 = z12;
                                        i12 = 1;
                                        fragment = null;
                                    }
                                } else if (i34 == 7) {
                                    i12 = 1;
                                } else if (i34 != 8) {
                                    z11 = z11;
                                } else {
                                    z11 = z11;
                                    arrayList11.add(i33, new j0(fragment, 9, 0));
                                    j0Var4.f17154c = true;
                                    i33++;
                                    fragment = j0Var4.f17153b;
                                }
                                i13 = i15;
                                z10 = z12;
                                i12 = 1;
                            } else {
                                z11 = z11;
                                Fragment fragment10 = j0Var4.f17153b;
                                int i35 = fragment10.mContainerId;
                                int size5 = arrayList10.size() - 1;
                                boolean z18 = false;
                                while (size5 >= 0) {
                                    int i36 = i15;
                                    Fragment fragment11 = (Fragment) arrayList10.get(size5);
                                    boolean z19 = z12;
                                    if (fragment11.mContainerId != i35) {
                                        i35 = i35;
                                    } else if (fragment11 == fragment10) {
                                        i35 = i35;
                                        z18 = true;
                                    } else {
                                        if (fragment11 == fragment) {
                                            i14 = 0;
                                            arrayList11.add(i33, new j0(fragment11, 9, 0));
                                            i33++;
                                            fragment = null;
                                        } else {
                                            i14 = 0;
                                        }
                                        j0 j0Var5 = new j0(fragment11, 3, i14);
                                        j0Var5.f17155d = j0Var4.f17155d;
                                        j0Var5.f17157f = j0Var4.f17157f;
                                        j0Var5.f17156e = j0Var4.f17156e;
                                        j0Var5.f17158g = j0Var4.f17158g;
                                        arrayList11.add(i33, j0Var5);
                                        arrayList10.remove(fragment11);
                                        i33++;
                                        fragment = fragment;
                                    }
                                    size5--;
                                    i35 = i35;
                                    z12 = z19;
                                    i15 = i36;
                                }
                                i13 = i15;
                                z10 = z12;
                                i12 = 1;
                                if (z18) {
                                    arrayList11.remove(i33);
                                    i33--;
                                } else {
                                    j0Var4.f17152a = 1;
                                    j0Var4.f17154c = true;
                                    arrayList10.add(fragment10);
                                }
                            }
                            i33 += i12;
                            i16 = i12;
                            z11 = z11;
                            z12 = z10;
                            i15 = i13;
                        } else {
                            i12 = i16;
                        }
                        i13 = i15;
                        z10 = z12;
                        arrayList10.add(j0Var4.f17153b);
                        i33 += i12;
                        i16 = i12;
                        z11 = z11;
                        z12 = z10;
                        i15 = i13;
                    } else {
                        z3 = z11;
                        i11 = i15;
                        z8 = z12;
                    }
                }
            }
            z12 = z8 || c1161a5.f17167g;
            i15 = i11 + 1;
            z11 = z3;
        }
    }

    public final int B(int i7, String str, boolean z3) {
        ArrayList arrayList = this.f17070d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z3) {
                return 0;
            }
            return this.f17070d.size() - 1;
        }
        int size = this.f17070d.size() - 1;
        while (size >= 0) {
            C1161a c1161a = (C1161a) this.f17070d.get(size);
            if ((str != null && str.equals(c1161a.f17169i)) || (i7 >= 0 && i7 == c1161a.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z3) {
            if (size == this.f17070d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1161a c1161a2 = (C1161a) this.f17070d.get(size - 1);
            if ((str == null || !str.equals(c1161a2.f17169i)) && (i7 < 0 || i7 != c1161a2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment D(int i7) {
        h0 h0Var = this.f17069c;
        ArrayList arrayList = h0Var.f17139a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i7) {
                return fragment;
            }
        }
        for (f0 f0Var : h0Var.f17140b.values()) {
            if (f0Var != null) {
                Fragment fragment2 = f0Var.f17125c;
                if (fragment2.mFragmentId == i7) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment E(String str) {
        h0 h0Var = this.f17069c;
        if (str != null) {
            ArrayList arrayList = h0Var.f17139a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            h0Var.getClass();
            return null;
        }
        for (f0 f0Var : h0Var.f17140b.values()) {
            if (f0Var != null) {
                Fragment fragment2 = f0Var.f17125c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void G() {
        for (D0 d1 : e()) {
            if (d1.f16978e) {
                d1.f16978e = false;
                d1.c();
            }
        }
    }

    public final Fragment H(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.f17069c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        k0(new IllegalStateException(C0.G.p("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup I(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f17088w.b()) {
            return null;
        }
        View viewA = this.f17088w.a(fragment.mContainerId);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    public final J J() {
        L8.e eVar = this.f17091z;
        if (eVar != null) {
            return eVar;
        }
        Fragment fragment = this.f17089x;
        return fragment != null ? fragment.mFragmentManager.J() : this.f17051A;
    }

    public final SpecialEffectsControllerFactory K() {
        Fragment fragment = this.f17089x;
        return fragment != null ? fragment.mFragmentManager.K() : this.f17052B;
    }

    public final boolean N() {
        Fragment fragment = this.f17089x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f17089x.getParentFragmentManager().N();
    }

    public final boolean P() {
        return this.f17058H || this.f17059I;
    }

    public final void Q(int i7, boolean z3) {
        HashMap map;
        K k2;
        if (this.f17087v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i7 != this.f17086u) {
            this.f17086u = i7;
            h0 h0Var = this.f17069c;
            Iterator it = h0Var.f17139a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = h0Var.f17140b;
                if (!zHasNext) {
                    break;
                }
                f0 f0Var = (f0) map.get(((Fragment) it.next()).mWho);
                if (f0Var != null) {
                    f0Var.i();
                }
            }
            for (f0 f0Var2 : map.values()) {
                if (f0Var2 != null) {
                    f0Var2.i();
                    Fragment fragment = f0Var2.f17125c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !h0Var.f17141c.containsKey(fragment.mWho)) {
                            h0Var.i(f0Var2.l(), fragment.mWho);
                        }
                        h0Var.h(f0Var2);
                    }
                }
            }
            j0();
            if (this.f17057G && (k2 = this.f17087v) != null && this.f17086u == 7) {
                ((D) k2).invalidateMenu();
                this.f17057G = false;
            }
        }
    }

    public final void R() {
        if (this.f17087v == null) {
            return;
        }
        this.f17058H = false;
        this.f17059I = false;
        this.f17065O.f17106j = false;
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void S() {
        w(new X(this, null, -1, 0), false);
    }

    public final void T(int i7, String str) {
        w(new X(this, str, -1, i7), false);
    }

    public final boolean U() {
        return V(-1, 0);
    }

    public final boolean V(int i7, int i10) {
        y(false);
        x(true);
        Fragment fragment = this.f17090y;
        if (fragment != null && i7 < 0 && fragment.getChildFragmentManager().U()) {
            return true;
        }
        boolean zW = W(this.f17062L, this.f17063M, null, i7, i10);
        if (zW) {
            this.f17068b = true;
            try {
                a0(this.f17062L, this.f17063M);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        m0();
        u();
        this.f17069c.f17140b.values().removeAll(Collections.singleton(null));
        return zW;
    }

    public final boolean W(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i10) {
        int iB = B(i7, str, (i10 & 1) != 0);
        if (iB < 0) {
            return false;
        }
        for (int size = this.f17070d.size() - 1; size >= iB; size--) {
            arrayList.add((C1161a) this.f17070d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void X(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            k0(new IllegalStateException(androidx.camera.video.u.m("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Y(V v3, boolean z3) {
        ((CopyOnWriteArrayList) this.f17080n.f16979a).add(new N(v3, z3));
    }

    public final void Z(Fragment fragment) {
        if (L(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        h0 h0Var = this.f17069c;
        synchronized (h0Var.f17139a) {
            h0Var.f17139a.remove(fragment);
        }
        fragment.mAdded = false;
        if (M(fragment)) {
            this.f17057G = true;
        }
        fragment.mRemoving = true;
        i0(fragment);
    }

    public final f0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            p275s0.e.c(fragment, str);
        }
        if (L(2)) {
            fragment.toString();
        }
        f0 f0VarF = f(fragment);
        fragment.mFragmentManager = this;
        h0 h0Var = this.f17069c;
        h0Var.g(f0VarF);
        if (!fragment.mDetached) {
            h0Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.f17057G = true;
            }
        }
        return f0VarF;
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i7 < size) {
            if (!((C1161a) arrayList.get(i7)).f17176p) {
                if (i10 != i7) {
                    A(arrayList, arrayList2, i10, i7);
                }
                i10 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C1161a) arrayList.get(i10)).f17176p) {
                        i10++;
                    }
                }
                A(arrayList, arrayList2, i7, i10);
                i7 = i10 - 1;
            }
            i7++;
        }
        if (i10 != size) {
            A(arrayList, arrayList2, i10, size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(K k2, H h7, Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f17087v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f17087v = k2;
        this.f17088w = h7;
        this.f17089x = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17081o;
        if (fragment != null) {
            copyOnWriteArrayList.add(new U(fragment));
        } else if (k2 instanceof FragmentOnAttachListener) {
            copyOnWriteArrayList.add((FragmentOnAttachListener) k2);
        }
        if (this.f17089x != null) {
            m0();
        }
        if (k2 instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) k2;
            androidx.activity.I onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.f17073g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcher.a(lifecycleOwner, this.f17074h);
        }
        if (fragment != null) {
            C1166c0 c1166c0 = fragment.mFragmentManager.f17065O;
            HashMap map = c1166c0.f17102e;
            C1166c0 c1166c1 = (C1166c0) map.get(fragment.mWho);
            if (c1166c1 == null) {
                c1166c1 = new C1166c0(c1166c0.f17104g);
                map.put(fragment.mWho, c1166c1);
            }
            this.f17065O = c1166c1;
        } else if (k2 instanceof ViewModelStoreOwner) {
            this.f17065O = (C1166c0) new androidx.camera.video.internal.c(((ViewModelStoreOwner) k2).getViewModelStore(), C1166c0.f17100o).h(C1166c0.class);
        } else {
            this.f17065O = new C1166c0(false);
        }
        this.f17065O.f17106j = P();
        this.f17069c.f17142d = this.f17065O;
        Object obj = this.f17087v;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            L0.d savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new A(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                b0(bundleA);
            }
        }
        Object obj2 = this.f17087v;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            androidx.activity.result.h activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strO = C0.G.o("FragmentManager:", fragment != null ? C0.G.r(new StringBuilder(), fragment.mWho, ":") : "");
            this.f17053C = activityResultRegistry.d(N8.q0.j(strO, "StartActivityForResult"), new p177m.l(), new P(this, 1));
            this.f17054D = activityResultRegistry.d(N8.q0.j(strO, "StartIntentSenderForResult"), new V3.a(1), new P(this, 2));
            this.f17055E = activityResultRegistry.d(N8.q0.j(strO, "RequestPermissions"), new p177m.j(), new P(this, 0));
        }
        Object obj3 = this.f17087v;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.f17082p);
        }
        Object obj4 = this.f17087v;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f17083q);
        }
        Object obj5 = this.f17087v;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f17084r);
        }
        Object obj6 = this.f17087v;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.f17085s);
        }
        Object obj7 = this.f17087v;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.t);
        }
    }

    public final void b0(Bundle bundle) {
        F f10;
        f0 f0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f17087v.f17026b.getClassLoader());
                this.f17077k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f17087v.f17026b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        h0 h0Var = this.f17069c;
        HashMap map2 = h0Var.f17141c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap map3 = h0Var.f17140b;
        map3.clear();
        Iterator it = fragmentManagerState.f16993a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f10 = this.f17080n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = h0Var.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.f17065O.f17101d.get(((FragmentState) bundleI.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).f17002b);
                if (fragment != null) {
                    if (L(2)) {
                        fragment.toString();
                    }
                    f0Var = new f0(f10, h0Var, fragment, bundleI);
                } else {
                    f0Var = new f0(this.f17080n, this.f17069c, this.f17087v.f17026b.getClassLoader(), J(), bundleI);
                }
                Fragment fragment2 = f0Var.f17125c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (L(2)) {
                    fragment2.toString();
                }
                f0Var.j(this.f17087v.f17026b.getClassLoader());
                h0Var.g(f0Var);
                f0Var.f17127e = this.f17086u;
            }
        }
        C1166c0 c1166c0 = this.f17065O;
        c1166c0.getClass();
        for (Fragment fragment3 : new ArrayList(c1166c0.f17101d.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (L(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.f16993a);
                }
                this.f17065O.f(fragment3);
                fragment3.mFragmentManager = this;
                f0 f0Var2 = new f0(f10, h0Var, fragment3);
                f0Var2.f17127e = 1;
                f0Var2.i();
                fragment3.mRemoving = true;
                f0Var2.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f16994b;
        h0Var.f17139a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = h0Var.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(N8.q0.k("No instantiated fragment for (", str3, ")"));
                }
                if (L(2)) {
                    fragmentB.toString();
                }
                h0Var.a(fragmentB);
            }
        }
        if (fragmentManagerState.f16995c != null) {
            this.f17070d = new ArrayList(fragmentManagerState.f16995c.length);
            int i7 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f16995c;
                if (i7 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i7];
                backStackRecordState.getClass();
                C1161a c1161a = new C1161a(this);
                backStackRecordState.c(c1161a);
                c1161a.t = backStackRecordState.f16961g;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f16956b;
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i10);
                    if (str4 != null) {
                        ((j0) c1161a.f17161a.get(i10)).f17153b = h0Var.b(str4);
                    }
                    i10++;
                }
                c1161a.g(1);
                if (L(2)) {
                    c1161a.toString();
                    PrintWriter printWriter = new PrintWriter(new u0(0));
                    c1161a.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f17070d.add(c1161a);
                i7++;
            }
        } else {
            this.f17070d = null;
        }
        this.f17075i.set(fragmentManagerState.f16996d);
        String str5 = fragmentManagerState.f16997e;
        if (str5 != null) {
            Fragment fragmentB2 = h0Var.b(str5);
            this.f17090y = fragmentB2;
            q(fragmentB2);
        }
        ArrayList arrayList3 = fragmentManagerState.f16998f;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                this.f17076j.put((String) arrayList3.get(i11), (BackStackState) fragmentManagerState.f16999g.get(i11));
            }
        }
        this.f17056F = new ArrayDeque(fragmentManagerState.f17000i);
    }

    public final void c(Fragment fragment) {
        if (L(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f17069c.a(fragment);
            if (L(2)) {
                fragment.toString();
            }
            if (M(fragment)) {
                this.f17057G = true;
            }
        }
    }

    public final Bundle c0() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        G();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((D0) it.next()).e();
        }
        y(true);
        this.f17058H = true;
        this.f17065O.f17106j = true;
        h0 h0Var = this.f17069c;
        h0Var.getClass();
        HashMap map = h0Var.f17140b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (f0 f0Var : map.values()) {
            if (f0Var != null) {
                Fragment fragment = f0Var.f17125c;
                h0Var.i(f0Var.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (L(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f17069c.f17141c;
        if (!map2.isEmpty()) {
            h0 h0Var2 = this.f17069c;
            synchronized (h0Var2.f17139a) {
                try {
                    if (h0Var2.f17139a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(h0Var2.f17139a.size());
                        for (Fragment fragment2 : h0Var2.f17139a) {
                            arrayList.add(fragment2.mWho);
                            if (L(2)) {
                                fragment2.toString();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList3 = this.f17070d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i7 = 0; i7 < size; i7++) {
                    backStackRecordStateArr[i7] = new BackStackRecordState((C1161a) this.f17070d.get(i7));
                    if (L(2)) {
                        Objects.toString(this.f17070d.get(i7));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f16997e = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f16998f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.f16999g = arrayList5;
            fragmentManagerState.f16993a = arrayList2;
            fragmentManagerState.f16994b = arrayList;
            fragmentManagerState.f16995c = backStackRecordStateArr;
            fragmentManagerState.f16996d = this.f17075i.get();
            Fragment fragment3 = this.f17090y;
            if (fragment3 != null) {
                fragmentManagerState.f16997e = fragment3.mWho;
            }
            arrayList4.addAll(this.f17076j.keySet());
            arrayList5.addAll(this.f17076j.values());
            fragmentManagerState.f17000i = new ArrayList(this.f17056F);
            bundle.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, fragmentManagerState);
            for (String str : this.f17077k.keySet()) {
                bundle.putBundle(C0.G.o("result_", str), (Bundle) this.f17077k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(C0.G.o("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(String str) {
        this.f17077k.remove(str);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(String str) {
        W w3 = (W) this.f17078l.remove(str);
        if (w3 != null) {
            w3.f17041a.b(w3.f17043c);
        }
    }

    public final void d() {
        this.f17068b = false;
        this.f17063M.clear();
        this.f17062L.clear();
    }

    public final Fragment.SavedState d0(Fragment fragment) {
        f0 f0Var = (f0) this.f17069c.f17140b.get(fragment.mWho);
        if (f0Var != null) {
            Fragment fragment2 = f0Var.f17125c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(f0Var.l());
                }
                return null;
            }
        }
        k0(new IllegalStateException(androidx.camera.video.u.m("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f17069c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f0) it.next()).f17125c.mContainer;
            if (viewGroup != null) {
                hashSet.add(D0.f16973f.getOrCreateController(viewGroup, K()));
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f17067a) {
            try {
                if (this.f17067a.size() == 1) {
                    this.f17087v.f17027c.removeCallbacks(this.f17066P);
                    this.f17087v.f17027c.post(this.f17066P);
                    m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f0 f(Fragment fragment) {
        String str = fragment.mWho;
        h0 h0Var = this.f17069c;
        f0 f0Var = (f0) h0Var.f17140b.get(str);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this.f17080n, h0Var, fragment);
        f0Var2.j(this.f17087v.f17026b.getClassLoader());
        f0Var2.f17127e = this.f17086u;
        return f0Var2;
    }

    public final void f0(Fragment fragment, boolean z3) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z3);
    }

    public final void g(Fragment fragment) {
        if (L(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L(2)) {
                fragment.toString();
            }
            h0 h0Var = this.f17069c;
            synchronized (h0Var.f17139a) {
                h0Var.f17139a.remove(fragment);
            }
            fragment.mAdded = false;
            if (M(fragment)) {
                this.f17057G = true;
            }
            i0(fragment);
        }
    }

    public final void g0(Fragment fragment, EnumC1204n enumC1204n) {
        if (fragment.equals(this.f17069c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC1204n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void h(boolean z3, Configuration configuration) {
        if (z3 && (this.f17087v instanceof OnConfigurationChangedProvider)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z3) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final void h0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f17069c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f17090y;
        this.f17090y = fragment;
        q(fragment2);
        q(this.f17090y);
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f17086u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void i0(Fragment fragment) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupI.getTag(p260r0.b.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(p260r0.b.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupI.getTag(p260r0.b.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f17086u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f17071e != null) {
            for (int i7 = 0; i7 < this.f17071e.size(); i7++) {
                Fragment fragment2 = (Fragment) this.f17071e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f17071e = arrayList;
        return z3;
    }

    public final void j0() {
        for (f0 f0Var : this.f17069c.d()) {
            Fragment fragment = f0Var.f17125c;
            if (fragment.mDeferStart) {
                if (this.f17068b) {
                    this.f17061K = true;
                } else {
                    fragment.mDeferStart = false;
                    f0Var.i();
                }
            }
        }
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f17060J = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((D0) it.next()).e();
        }
        K k2 = this.f17087v;
        boolean z3 = k2 instanceof ViewModelStoreOwner;
        h0 h0Var = this.f17069c;
        if (z3) {
            zIsChangingConfigurations = h0Var.f17142d.f17105i;
        } else {
            E e10 = k2.f17026b;
            if (e10 != null) {
                zIsChangingConfigurations = true ^ e10.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f17076j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((BackStackState) it2.next()).f16968a.iterator();
                while (it3.hasNext()) {
                    h0Var.f17142d.e((String) it3.next(), false);
                }
            }
        }
        t(-1);
        Object obj = this.f17087v;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.f17083q);
        }
        Object obj2 = this.f17087v;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.f17082p);
        }
        Object obj3 = this.f17087v;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f17084r);
        }
        Object obj4 = this.f17087v;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.f17085s);
        }
        Object obj5 = this.f17087v;
        if ((obj5 instanceof MenuHost) && this.f17089x == null) {
            ((MenuHost) obj5).removeMenuProvider(this.t);
        }
        this.f17087v = null;
        this.f17088w = null;
        this.f17089x = null;
        if (this.f17073g != null) {
            this.f17074h.remove();
            this.f17073g = null;
        }
        androidx.activity.result.g gVar = this.f17053C;
        if (gVar != null) {
            gVar.b();
            this.f17054D.b();
            this.f17055E.b();
        }
    }

    public final void k0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u0(0));
        K k2 = this.f17087v;
        if (k2 == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            ((D) k2).f16972e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void l(boolean z3) {
        if (z3 && (this.f17087v instanceof OnTrimMemoryProvider)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z3) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void l0(V v3) {
        F f10 = this.f17080n;
        synchronized (((CopyOnWriteArrayList) f10.f16979a)) {
            try {
                int size = ((CopyOnWriteArrayList) f10.f16979a).size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((N) ((CopyOnWriteArrayList) f10.f16979a).get(i7)).f17032a == v3) {
                        ((CopyOnWriteArrayList) f10.f16979a).remove(i7);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z3, boolean z8) {
        if (z8 && (this.f17087v instanceof OnMultiWindowModeChangedProvider)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z3);
                if (z8) {
                    fragment.mChildFragmentManager.m(z3, true);
                }
            }
        }
    }

    public final void m0() {
        synchronized (this.f17067a) {
            try {
                if (!this.f17067a.isEmpty()) {
                    this.f17074h.setEnabled(true);
                    return;
                }
                p294tb.K k2 = this.f17074h;
                ArrayList arrayList = this.f17070d;
                k2.setEnabled((arrayList != null ? arrayList.size() : 0) > 0 && O(this.f17089x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        for (Fragment fragment : this.f17069c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f17086u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f17086u < 1) {
            return;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f17069c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z3, boolean z8) {
        if (z8 && (this.f17087v instanceof OnPictureInPictureModeChangedProvider)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z3);
                if (z8) {
                    fragment.mChildFragmentManager.r(z3, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z3 = false;
        if (this.f17086u < 1) {
            return false;
        }
        for (Fragment fragment : this.f17069c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(String str, Bundle bundle) {
        W w3 = (W) this.f17078l.get(str);
        if (w3 != null) {
            if (((C1212w) w3.f17041a).f17478d.a(EnumC1204n.f17463d)) {
                w3.onFragmentResult(str, bundle);
            } else {
                this.f17077k.put(str, bundle);
            }
        } else {
            this.f17077k.put(str, bundle);
        }
        if (L(2)) {
            Objects.toString(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(final String str, LifecycleOwner lifecycleOwner, final FragmentResultListener fragmentResultListener) {
        final AbstractC1205o lifecycle = lifecycleOwner.getLifecycle();
        if (((C1212w) lifecycle).f17478d == EnumC1204n.f17460a) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager$6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, EnumC1203m enumC1203m) {
                Bundle bundle;
                EnumC1203m enumC1203m2 = EnumC1203m.ON_START;
                Z z3 = this.f16990d;
                String str2 = str;
                if (enumC1203m == enumC1203m2 && (bundle = (Bundle) z3.f17077k.get(str2)) != null) {
                    fragmentResultListener.onFragmentResult(str2, bundle);
                    z3.clearFragmentResult(str2);
                }
                if (enumC1203m == EnumC1203m.ON_DESTROY) {
                    lifecycle.b(this);
                    z3.f17078l.remove(str2);
                }
            }
        };
        W w3 = (W) this.f17078l.put(str, new W(lifecycle, fragmentResultListener, lifecycleEventObserver));
        if (w3 != null) {
            w3.f17041a.b(w3.f17043c);
        }
        if (L(2)) {
            lifecycle.toString();
            Objects.toString(fragmentResultListener);
        }
        lifecycle.a(lifecycleEventObserver);
    }

    public final void t(int i7) {
        try {
            this.f17068b = true;
            for (f0 f0Var : this.f17069c.f17140b.values()) {
                if (f0Var != null) {
                    f0Var.f17127e = i7;
                }
            }
            Q(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((D0) it.next()).e();
            }
            this.f17068b = false;
            y(true);
        } catch (Throwable th) {
            this.f17068b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f17089x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f17089x)));
            sb2.append("}");
        } else {
            K k2 = this.f17087v;
            if (k2 != null) {
                sb2.append(k2.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f17087v)));
                sb2.append("}");
            } else {
                sb2.append(BuildConfig.TRAVIS);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (this.f17061K) {
            this.f17061K = false;
            j0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strJ = N8.q0.j(str, "    ");
        h0 h0Var = this.f17069c;
        h0Var.getClass();
        String str2 = str + "    ";
        HashMap map = h0Var.f17140b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f0 f0Var : map.values()) {
                printWriter.print(str);
                if (f0Var != null) {
                    Fragment fragment = f0Var.f17125c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.TRAVIS);
                }
            }
        }
        ArrayList arrayList = h0Var.f17139a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size3; i7++) {
                Fragment fragment2 = (Fragment) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f17071e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment3 = (Fragment) this.f17071e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f17070d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1161a c1161a = (C1161a) this.f17070d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1161a.toString());
                c1161a.k(strJ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f17075i.get());
        synchronized (this.f17067a) {
            try {
                int size4 = this.f17067a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (FragmentManager$OpGenerator) this.f17067a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f17087v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f17088w);
        if (this.f17089x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f17089x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f17086u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f17058H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f17059I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f17060J);
        if (this.f17057G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f17057G);
        }
    }

    public final void w(FragmentManager$OpGenerator fragmentManager$OpGenerator, boolean z3) {
        if (!z3) {
            if (this.f17087v == null) {
                if (!this.f17060J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f17067a) {
            try {
                if (this.f17087v == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f17067a.add(fragmentManager$OpGenerator);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z3) {
        if (this.f17068b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f17087v == null) {
            if (!this.f17060J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f17087v.f17027c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f17062L == null) {
            this.f17062L = new ArrayList();
            this.f17063M = new ArrayList();
        }
    }

    public final boolean y(boolean z3) {
        boolean zGenerateOps;
        x(z3);
        boolean z8 = false;
        while (true) {
            ArrayList<C1161a> arrayList = this.f17062L;
            ArrayList<Boolean> arrayList2 = this.f17063M;
            synchronized (this.f17067a) {
                if (this.f17067a.isEmpty()) {
                    zGenerateOps = false;
                } else {
                    try {
                        int size = this.f17067a.size();
                        zGenerateOps = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            zGenerateOps |= ((FragmentManager$OpGenerator) this.f17067a.get(i7)).generateOps(arrayList, arrayList2);
                        }
                        this.f17067a.clear();
                        this.f17087v.f17027c.removeCallbacks(this.f17066P);
                    } catch (Throwable th) {
                        this.f17067a.clear();
                        this.f17087v.f17027c.removeCallbacks(this.f17066P);
                        throw th;
                    }
                }
            }
            if (!zGenerateOps) {
                m0();
                u();
                this.f17069c.f17140b.values().removeAll(Collections.singleton(null));
                return z8;
            }
            z8 = true;
            this.f17068b = true;
            try {
                a0(this.f17062L, this.f17063M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public final void z(C1161a c1161a, boolean z3) {
        if (z3 && (this.f17087v == null || this.f17060J)) {
            return;
        }
        x(z3);
        c1161a.generateOps(this.f17062L, this.f17063M);
        this.f17068b = true;
        try {
            a0(this.f17062L, this.f17063M);
            d();
            m0();
            u();
            this.f17069c.f17140b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
