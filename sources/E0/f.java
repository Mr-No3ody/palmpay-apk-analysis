package E0;

import C0.C0119k;
import C0.C0120l;
import C0.C0123o;
import C0.C0129v;
import C0.J;
import C0.K;
import C0.U;
import C0.e0;
import C9.C0138e;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.Y;
import androidx.fragment.app.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.navigation.Navigator$Name;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Navigator$Name("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"LE0/f;", "LC0/e0;", "LE0/g;", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,719:1\n31#2:720\n63#2,2:721\n766#3:723\n857#3,2:724\n1855#3,2:726\n518#3,7:728\n533#3,6:735\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n253#1:720\n253#1:721,2\n333#1:723\n333#1:724,2\n340#1:726,2\n90#1:728,7\n141#1:735,6\n*E\n"})
public class f extends e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f2151j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f2153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0120l f2157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f2158i;

    public static final class a extends a0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WeakReference f2159d;

        @Override // androidx.lifecycle.a0
        public final void b() {
            WeakReference weakReference = this.f2159d;
            if (weakReference == null) {
                Intrinsics.n("completeTransition");
                throw null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        new b(null);
    }

    public f(Context context, Z fragmentManager, int i7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2152c = context;
        this.f2153d = fragmentManager;
        this.f2154e = i7;
        this.f2155f = new LinkedHashSet();
        this.f2156g = new ArrayList();
        int i10 = 1;
        this.f2157h = new C0120l(this, i10);
        this.f2158i = new J(this, i10);
    }

    public static void k(f fVar, String str, int i7) {
        boolean z3 = (i7 & 2) == 0;
        boolean z8 = (i7 & 4) != 0;
        ArrayList arrayList = fVar.f2156g;
        if (z8) {
            v.r(arrayList, new C0129v(str, 1));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z3)));
    }

    public static void l(C0119k entry, C0123o state, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        i0 viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "fragment.viewModelStore");
        ArrayList arrayList = new ArrayList();
        i initializer = i.f2163a;
        C1858h clazz = G.a(a.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        arrayList.add(new z0.f(p002a.a.m(clazz), initializer));
        z0.f[] fVarArr = (z0.f[]) arrayList.toArray(new z0.f[0]);
        a aVar = (a) new androidx.camera.video.internal.c(viewModelStore, new z0.c((z0.f[]) Arrays.copyOf(fVarArr, fVarArr.length)), z0.a.f44407b).h(a.class);
        WeakReference weakReference = new WeakReference(new h(entry, state, fragment));
        aVar.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        aVar.f2159d = weakReference;
    }

    @Override // C0.e0
    public final K a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new g(this);
    }

    @Override // C0.e0
    public final void d(List entries, U u6) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Z z3 = this.f2153d;
        if (z3.P()) {
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0119k c0119k = (C0119k) it.next();
            boolean zIsEmpty = ((List) b().f1070e.f39102a.getValue()).isEmpty();
            if (u6 == null || zIsEmpty || !u6.f984b || !this.f2155f.remove(c0119k.f1055f)) {
                C1161a c1161aM = m(c0119k, u6);
                if (!zIsEmpty) {
                    C0119k c0119k2 = (C0119k) CollectionsKt.L((List) b().f1070e.f39102a.getValue());
                    if (c0119k2 != null) {
                        k(this, c0119k2.f1055f, 6);
                    }
                    String str = c0119k.f1055f;
                    k(this, str, 6);
                    c1161aM.c(str);
                }
                c1161aM.h(false);
                if (Z.L(2)) {
                    c0119k.toString();
                }
                b().h(c0119k);
            } else {
                z3.w(new Y(z3, c0119k.f1055f, 0), false);
                b().h(c0119k);
            }
        }
    }

    @Override // C0.e0
    public final void e(final C0123o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        FragmentOnAttachListener fragmentOnAttachListener = new FragmentOnAttachListener() { // from class: E0.e
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(Z z3, Fragment fragment) {
                Object objPrevious;
                int i7 = f.f2151j;
                C0123o state2 = state;
                Intrinsics.checkNotNullParameter(state2, "$state");
                f this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(z3, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                List list = (List) state2.f1070e.f39102a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!Intrinsics.c(((C0119k) objPrevious).f1055f, fragment.getTag()));
                C0119k c0119k = (C0119k) objPrevious;
                if (Z.L(2)) {
                    Objects.toString(fragment);
                    Objects.toString(c0119k);
                    Objects.toString(this$0.f2153d);
                }
                if (c0119k != null) {
                    this$0.getClass();
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new C0138e(new j(this$0, fragment, c0119k)));
                    fragment.getLifecycle().a(this$0.f2157h);
                    f.l(c0119k, state2, fragment);
                }
            }
        };
        Z z3 = this.f2153d;
        z3.f17081o.add(fragmentOnAttachListener);
        l lVar = new l(state, this);
        if (z3.f17079m == null) {
            z3.f17079m = new ArrayList();
        }
        z3.f17079m.add(lVar);
    }

    @Override // C0.e0
    public final void f(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Z z3 = this.f2153d;
        if (z3.P()) {
            return;
        }
        C1161a c1161aM = m(backStackEntry, null);
        List list = (List) b().f1070e.f39102a.getValue();
        if (list.size() > 1) {
            C0119k c0119k = (C0119k) CollectionsKt.G(C1850q.g(list) - 1, list);
            if (c0119k != null) {
                k(this, c0119k.f1055f, 6);
            }
            String str = backStackEntry.f1055f;
            k(this, str, 4);
            z3.T(1, str);
            k(this, str, 2);
            c1161aM.c(str);
        }
        c1161aM.h(false);
        b().c(backStackEntry);
    }

    @Override // C0.e0
    public final void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f2155f;
            linkedHashSet.clear();
            v.n(linkedHashSet, stringArrayList);
        }
    }

    @Override // C0.e0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f2155f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return p002a.a.e(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // C0.e0
    public final void i(C0119k popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Z z8 = this.f2153d;
        if (z8.P()) {
            return;
        }
        List list = (List) b().f1070e.f39102a.getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        C0119k c0119k = (C0119k) CollectionsKt.F(list);
        if (z3) {
            for (C0119k c0119k2 : CollectionsKt.R(listSubList)) {
                if (Intrinsics.c(c0119k2, c0119k)) {
                    Objects.toString(c0119k2);
                } else {
                    z8.w(new Y(z8, c0119k2.f1055f, 1), false);
                    this.f2155f.add(c0119k2.f1055f);
                }
            }
        } else {
            z8.T(1, popUpTo.f1055f);
        }
        if (Z.L(2)) {
            Objects.toString(popUpTo);
        }
        C0119k c0119k3 = (C0119k) CollectionsKt.G(iIndexOf - 1, list);
        if (c0119k3 != null) {
            k(this, c0119k3.f1055f, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            C0119k c0119k4 = (C0119k) obj;
            Sf.e eVarF = Sf.p.f(CollectionsKt.y(this.f2156g), m.f2172a);
            String str = c0119k4.f1055f;
            Intrinsics.checkNotNullParameter(eVarF, "<this>");
            if (Sf.p.e(eVarF, str) < 0) {
                if (!Intrinsics.c(c0119k4.f1055f, c0119k.f1055f)) {
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((C0119k) it.next()).f1055f, 4);
        }
        b().f(popUpTo, z3);
    }

    public final C1161a m(C0119k c0119k, U u6) {
        K k2 = c0119k.f1051b;
        Intrinsics.f(k2, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleA = c0119k.a();
        String str = ((g) k2).t;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f2152c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Z z3 = this.f2153d;
        Fragment fragmentA = z3.J().a(context.getClassLoader(), str);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        fragmentA.setArguments(bundleA);
        C1161a c1161a = new C1161a(z3);
        Intrinsics.checkNotNullExpressionValue(c1161a, "fragmentManager.beginTransaction()");
        int i7 = u6 != null ? u6.f988f : -1;
        int i10 = u6 != null ? u6.f989g : -1;
        int i11 = u6 != null ? u6.f990h : -1;
        int i12 = u6 != null ? u6.f991i : -1;
        if (i7 != -1 || i10 != -1 || i11 != -1 || i12 != -1) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            c1161a.f(i7, i10, i11, i12 != -1 ? i12 : 0);
        }
        c1161a.e(this.f2154e, fragmentA, c0119k.f1055f);
        c1161a.o(fragmentA);
        c1161a.f17176p = true;
        return c1161a;
    }
}
