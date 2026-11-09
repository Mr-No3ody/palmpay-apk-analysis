package E0;

import C0.C0119k;
import C0.C0123o;
import C0.G;
import C0.K;
import C0.U;
import C0.e0;
import E0.b;
import E0.d;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.Navigator$Name;
import androidx.navigation.fragment.DialogFragmentNavigator$observer$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.P;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes.dex */
@Navigator$Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LE0/b;", "LC0/e0;", "LE0/c;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2142h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f2144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DialogFragmentNavigator$observer$1 f2146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2147g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public b(Context context, Z fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2143c = context;
        this.f2144d = fragmentManager;
        this.f2145e = new LinkedHashSet();
        this.f2146f = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
                int iNextIndex;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i7 = d.f2148a[event.ordinal()];
                b bVar = this.f17501a;
                if (i7 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) source;
                    int i10 = b.f2142h;
                    Iterable iterable = (Iterable) bVar.b().f1070e.f39102a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.c(((C0119k) it.next()).f1055f, dialogFragment.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogFragment.dismiss();
                    return;
                }
                Object obj = null;
                if (i7 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) source;
                    int i11 = b.f2142h;
                    for (Object obj2 : (Iterable) bVar.b().f1071f.f39102a.getValue()) {
                        if (Intrinsics.c(((C0119k) obj2).f1055f, dialogFragment2.getTag())) {
                            obj = obj2;
                        }
                    }
                    C0119k c0119k = (C0119k) obj;
                    if (c0119k != null) {
                        bVar.b().b(c0119k);
                        return;
                    }
                    return;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) source;
                    int i12 = b.f2142h;
                    for (Object obj3 : (Iterable) bVar.b().f1071f.f39102a.getValue()) {
                        if (Intrinsics.c(((C0119k) obj3).f1055f, dialogFragment3.getTag())) {
                            obj = obj3;
                        }
                    }
                    C0119k c0119k2 = (C0119k) obj;
                    if (c0119k2 != null) {
                        bVar.b().b(c0119k2);
                    }
                    dialogFragment3.getLifecycle().b(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) source;
                if (dialogFragment4.requireDialog().isShowing()) {
                    return;
                }
                int i13 = b.f2142h;
                List list = (List) bVar.b().f1070e.f39102a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (Intrinsics.c(((C0119k) listIterator.previous()).f1055f, dialogFragment4.getTag())) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                C0119k c0119k3 = (C0119k) CollectionsKt.G(iNextIndex, list);
                if (!Intrinsics.c(CollectionsKt.L(list), c0119k3)) {
                    dialogFragment4.toString();
                }
                if (c0119k3 != null) {
                    bVar.l(iNextIndex, c0119k3, false);
                }
            }
        };
        this.f2147g = new LinkedHashMap();
    }

    @Override // C0.e0
    public final K a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new c(this);
    }

    @Override // C0.e0
    public final void d(List entries, U u6) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Z z3 = this.f2144d;
        if (z3.P()) {
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0119k c0119k = (C0119k) it.next();
            k(c0119k).show(z3, c0119k.f1055f);
            C0119k c0119k2 = (C0119k) CollectionsKt.L((List) b().f1070e.f39102a.getValue());
            boolean zA = CollectionsKt.A((Iterable) b().f1071f.f39102a.getValue(), c0119k2);
            b().h(c0119k);
            if (c0119k2 != null && !zA) {
                b().b(c0119k2);
            }
        }
    }

    @Override // C0.e0
    public final void e(C0123o state) {
        AbstractC1205o lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        Iterator it = ((List) state.f1070e.f39102a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Z z3 = this.f2144d;
            if (!zHasNext) {
                z3.f17081o.add(new FragmentOnAttachListener() { // from class: E0.a
                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public final void onAttachFragment(Z z8, Fragment childFragment) {
                        int i7 = b.f2142h;
                        b this$0 = this.f2141a;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(z8, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f2145e;
                        String tag = childFragment.getTag();
                        kotlin.jvm.internal.K.a(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            childFragment.getLifecycle().a(this$0.f2146f);
                        }
                        LinkedHashMap linkedHashMap = this$0.f2147g;
                        kotlin.jvm.internal.K.c(linkedHashMap).remove(childFragment.getTag());
                    }
                });
                return;
            }
            C0119k c0119k = (C0119k) it.next();
            DialogFragment dialogFragment = (DialogFragment) z3.E(c0119k.f1055f);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f2145e.add(c0119k.f1055f);
            } else {
                lifecycle.a(this.f2146f);
            }
        }
    }

    @Override // C0.e0
    public final void f(C0119k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Z z3 = this.f2144d;
        if (z3.P()) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f2147g;
        String str = backStackEntry.f1055f;
        DialogFragment dialogFragment = (DialogFragment) linkedHashMap.get(str);
        if (dialogFragment == null) {
            Fragment fragmentE = z3.E(str);
            dialogFragment = fragmentE instanceof DialogFragment ? (DialogFragment) fragmentE : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().b(this.f2146f);
            dialogFragment.dismiss();
        }
        k(backStackEntry).show(z3, str);
        C0123o c0123oB = b();
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) c0123oB.f1070e.f39102a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C0119k c0119k = (C0119k) listIterator.previous();
            if (Intrinsics.c(c0119k.f1055f, str)) {
                g0 g0Var = c0123oB.f1068c;
                g0Var.e(null, P.c(P.c((Set) g0Var.getValue(), c0119k), backStackEntry));
                c0123oB.c(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // C0.e0
    public final void i(C0119k popUpTo, boolean z3) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Z z8 = this.f2144d;
        if (z8.P()) {
            return;
        }
        List list = (List) b().f1070e.f39102a.getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = CollectionsKt.R(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentE = z8.E(((C0119k) it.next()).f1055f);
            if (fragmentE != null) {
                ((DialogFragment) fragmentE).dismiss();
            }
        }
        l(iIndexOf, popUpTo, z3);
    }

    public final DialogFragment k(C0119k c0119k) {
        K k2 = c0119k.f1051b;
        Intrinsics.f(k2, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        c cVar = (c) k2;
        String str = cVar.t;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f2143c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment fragmentA = this.f2144d.J().a(context.getClassLoader(), str);
        Intrinsics.checkNotNullExpressionValue(fragmentA, "fragmentManager.fragment…ader, className\n        )");
        if (DialogFragment.class.isAssignableFrom(fragmentA.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentA;
            dialogFragment.setArguments(c0119k.a());
            dialogFragment.getLifecycle().a(this.f2146f);
            this.f2147g.put(c0119k.f1055f, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = cVar.t;
        if (str2 != null) {
            throw new IllegalArgumentException(G.r(sb2, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i7, C0119k c0119k, boolean z3) {
        C0119k c0119k2 = (C0119k) CollectionsKt.G(i7 - 1, (List) b().f1070e.f39102a.getValue());
        boolean zA = CollectionsKt.A((Iterable) b().f1071f.f39102a.getValue(), c0119k2);
        b().f(c0119k, z3);
        if (c0119k2 == null || zA) {
            return;
        }
        b().b(c0119k2);
    }
}
