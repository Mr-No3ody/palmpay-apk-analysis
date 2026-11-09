package com.swmansion.rnscreens.gamma.stack.host;

import N2.b;
import S7.c;
import S7.d;
import S7.e;
import android.annotation.SuppressLint;
import androidx.camera.core.impl.utils.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$OnBackStackChangedListener;
import androidx.fragment.app.Z;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d3.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/host/StackContainer;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "", "getHasPendingOperations", "()Z", "hasPendingOperations", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nStackContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackContainer.kt\ncom/swmansion/rnscreens/gamma/stack/host/StackContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1#2:200\n1869#3,2:201\n1869#3,2:203\n1869#3,2:205\n*S KotlinDebug\n*F\n+ 1 StackContainer.kt\ncom/swmansion/rnscreens/gamma/stack/host/StackContainer\n*L\n105#1:201,2\n122#1:203,2\n163#1:205,2\n*E\n"})
public final class StackContainer extends CoordinatorLayout implements FragmentManager$OnBackStackChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z f25405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f25407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f25409f;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackContainer(ThemedReactContext context, WeakReference delegate) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f25404a = delegate;
        this.f25406c = new ArrayList();
        this.f25407d = new ArrayList();
        this.f25408e = new ArrayList();
        this.f25409f = new j(2);
        b bVar = R7.a.f7933a;
        setId(R7.a.f7933a.generateViewId());
    }

    private final boolean getHasPendingOperations() {
        return (this.f25408e.isEmpty() && this.f25407d.isEmpty()) ? false : true;
    }

    public final void l() {
        ArrayList arrayList;
        Object next;
        StackScreenFragment stackScreenFragment;
        if (getHasPendingOperations() && isAttachedToWindow()) {
            Z z3 = this.f25405b;
            if (z3 == null) {
                throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f25407d;
            Iterator it = arrayList3.iterator();
            do {
                boolean zHasNext = it.hasNext();
                arrayList = this.f25406c;
                if (!zHasNext) {
                    ArrayList arrayList4 = this.f25408e;
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        StackScreen stackScreen = ((e) it2.next()).f8822f;
                        StackScreenFragment stackScreenFragment2 = new StackScreenFragment(stackScreen);
                        stackScreen.getScreenKey();
                        stackScreenFragment2.toString();
                        arrayList2.add(new S7.a(stackScreenFragment2, getId(), !arrayList.isEmpty()));
                        arrayList.add(stackScreenFragment2);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("[RNScreens] Stack should never be empty after updates");
                    }
                    arrayList2.add(new c((StackScreenFragment) CollectionsKt.K(arrayList), 1));
                    arrayList3.clear();
                    arrayList4.clear();
                    this.f25409f.a(z3, arrayList2);
                    getId();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((StackScreenFragment) it3.next()).f25421a.getScreenKey();
                    }
                    return;
                }
                d dVar = (d) it.next();
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((StackScreenFragment) next).f25421a != dVar.f8821f);
                if (next == null) {
                    throw new IllegalStateException("[RNScreens] Unable to find a fragment to pop");
                }
                stackScreenFragment = (StackScreenFragment) next;
                if (arrayList.size() <= 1) {
                    throw new IllegalStateException("[RNScreens] Attempt to pop last screen from the stack");
                }
                arrayList2.add(new c(stackScreenFragment, 0));
            } while (arrayList.remove(C1850q.g(arrayList)) == stackScreenFragment);
            throw new IllegalStateException("[RNScreens] Attempt to pop non-top screen");
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "StackContainer [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("StackContainer", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
        Z zI = n.i(this);
        if (zI == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        if (zI.f17079m == null) {
            zI.f17079m = new ArrayList();
        }
        zI.f17079m.add(this);
        this.f25405b = zI;
        l();
    }

    @Override // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChangeCommitted(Fragment fragment, boolean z3) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!(fragment instanceof StackScreenFragment)) {
            fragment.getClass();
            return;
        }
        if (z3) {
            StackContainerDelegate stackContainerDelegate = (StackContainerDelegate) this.f25404a.get();
            if (stackContainerDelegate != null) {
                stackContainerDelegate.onScreenDismiss(((StackScreenFragment) fragment).f25421a);
            }
            ArrayList arrayList = this.f25406c;
            if (arrayList.contains(fragment)) {
                StackScreenFragment stackScreenFragment = (StackScreenFragment) fragment;
                getId();
                stackScreenFragment.f25421a.getScreenKey();
                if (!arrayList.remove(stackScreenFragment)) {
                    throw new IllegalArgumentException("[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model");
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("[RNScreens] Stack model should not be empty after a native pop");
                }
                Z z8 = this.f25405b;
                if (z8 == null) {
                    throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
                }
                if (z8.f17090y == stackScreenFragment) {
                    this.f25409f.a(z8, C1849p.c(new c((StackScreenFragment) CollectionsKt.K(arrayList), 1)));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
    public final void onBackStackChanged() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Z z3 = this.f25405b;
        if (z3 == null) {
            throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
        }
        ArrayList arrayList = z3.f17079m;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f25405b = null;
    }
}
