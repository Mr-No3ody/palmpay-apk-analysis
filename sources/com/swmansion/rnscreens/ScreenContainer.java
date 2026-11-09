package com.swmansion.rnscreens;

import M7.ChoreographerFrameCallbackC0441a;
import M7.EnumC0454n;
import M7.s;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/Z;", "fm", "", "setFragmentManager", "(Landroidx/fragment/app/Z;)V", "", "getScreenCount", "()I", "screenCount", "Lcom/swmansion/rnscreens/Screen;", "getTopScreen", "()Lcom/swmansion/rnscreens/Screen;", "topScreen", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenContainer.kt\ncom/swmansion/rnscreens/ScreenContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,449:1\n295#2,2:450\n1#3:452\n37#4:453\n36#4,3:454\n*S KotlinDebug\n*F\n+ 1 ScreenContainer.kt\ncom/swmansion/rnscreens/ScreenContainer\n*L\n134#1:450,2\n398#1:453\n398#1:454,3\n*E\n"})
public class ScreenContainer extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25304i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z f25306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0441a f25310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScreenFragmentWrapper f25311g;

    public ScreenContainer(@Nullable Context context) {
        super(context);
        this.f25305a = new ArrayList();
        this.f25310f = new ChoreographerFrameCallbackC0441a(this, 1);
    }

    private final void setFragmentManager(Z fm) {
        this.f25306b = fm;
        this.f25308d = true;
        g();
    }

    public ScreenFragmentWrapper a(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new ScreenFragment(screen);
    }

    public final C1161a b() {
        Z z3 = this.f25306b;
        if (z3 == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        C1161a c1161a = new C1161a(z3);
        c1161a.f17176p = true;
        Intrinsics.checkNotNullExpressionValue(c1161a, "setReorderingAllowed(...)");
        return c1161a;
    }

    public boolean c(ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.A(this.f25305a, screenFragmentWrapper);
    }

    public void d() {
        ScreenFragmentWrapper fragmentWrapper;
        Screen topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.onContainerUpdate();
    }

    public final void e() {
        this.f25308d = true;
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new s(this, 0));
    }

    public void f() {
        C1161a c1161aB = b();
        Z z3 = this.f25306b;
        if (z3 == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(z3.f17069c.f());
        ArrayList arrayList = this.f25305a;
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
            if (screenFragmentWrapper.getScreen().getActivityState() == EnumC0454n.f5825a && screenFragmentWrapper.getFragment().isAdded()) {
                c1161aB.m(screenFragmentWrapper.getFragment());
            }
            hashSet.remove(screenFragmentWrapper.getFragment());
        }
        boolean z8 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == null) {
                    c1161aB.m(fragment);
                }
            }
        }
        boolean z10 = getTopScreen() == null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            ScreenFragmentWrapper screenFragmentWrapper2 = (ScreenFragmentWrapper) next2;
            screenFragmentWrapper2.getScreen().setTransitioning(z10);
            if (screenFragmentWrapper2.getScreen().getActivityState() != EnumC0454n.f5825a) {
                if (screenFragmentWrapper2.getFragment().isAdded()) {
                    if (z8) {
                        c1161aB.m(screenFragmentWrapper2.getFragment());
                        arrayList2.add(screenFragmentWrapper2);
                    }
                } else if (z8) {
                    arrayList2.add(screenFragmentWrapper2);
                } else {
                    c1161aB.a(screenFragmentWrapper2.getFragment(), getId());
                    z8 = true;
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Intrinsics.checkNotNullExpressionValue(next3, "next(...)");
            c1161aB.a(((ScreenFragmentWrapper) next3).getFragment(), getId());
        }
        c1161aB.j();
    }

    public final void g() {
        Z z3;
        if (!this.f25308d || !this.f25307c || (z3 = this.f25306b) == null || z3.f17060J) {
            return;
        }
        this.f25308d = false;
        f();
        d();
    }

    public final int getScreenCount() {
        return this.f25305a.size();
    }

    @Nullable
    public Screen getTopScreen() {
        Object next;
        Iterator it = this.f25305a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ScreenFragmentWrapper) next).getScreen().getActivityState() != EnumC0454n.f5827c);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getScreen();
        }
        return null;
    }

    public void h() {
        ArrayList arrayList = this.f25305a;
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ((ScreenFragmentWrapper) next).getScreen().setContainer(null);
        }
        arrayList.clear();
        e();
    }

    public void i(int i7) {
        ArrayList arrayList = this.f25305a;
        ((ScreenFragmentWrapper) arrayList.get(i7)).getScreen().setContainer(null);
        arrayList.remove(i7);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z3;
        boolean z8;
        Z supportFragmentManager;
        Unit unit;
        super.onAttachedToWindow();
        this.f25307c = true;
        ViewParent parent = this;
        while (true) {
            z3 = parent instanceof ReactRootView;
            if (z3 || (parent instanceof FragmentProviding) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        }
        if (parent instanceof Screen) {
            ScreenFragmentWrapper fragmentWrapper = ((Screen) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f25311g = fragmentWrapper;
                fragmentWrapper.addChildScreenContainer(this);
                Z childFragmentManager = fragmentWrapper.getFragment().getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (parent instanceof FragmentProviding) {
            Fragment associatedFragment = ((FragmentProviding) parent).getAssociatedFragment();
            if (associatedFragment != null) {
                Z childFragmentManager2 = associatedFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager2);
                return;
            } else {
                throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
            }
        }
        if (!z3) {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        }
        ReactRootView reactRootView = (ReactRootView) parent;
        Context context = reactRootView.getContext();
        while (true) {
            z8 = context instanceof E;
            if (z8 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z8) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        E e10 = (E) context;
        if (e10.getSupportFragmentManager().f17069c.f().isEmpty()) {
            supportFragmentManager = e10.getSupportFragmentManager();
            Intrinsics.e(supportFragmentManager);
        } else {
            try {
                supportFragmentManager = Z.C(reactRootView).getChildFragmentManager();
                Intrinsics.e(supportFragmentManager);
            } catch (IllegalStateException unused) {
                supportFragmentManager = e10.getSupportFragmentManager();
                Intrinsics.e(supportFragmentManager);
            }
        }
        setFragmentManager(supportFragmentManager);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Z z3 = this.f25306b;
        if (z3 != null && !z3.f17060J) {
            C1161a c1161a = new C1161a(z3);
            Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
            boolean z8 = false;
            for (Fragment fragment : z3.f17069c.f()) {
                if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == this) {
                    c1161a.m(fragment);
                    z8 = true;
                }
            }
            if (z8) {
                c1161a.j();
            }
            z3.y(true);
            z3.G();
        }
        ScreenFragmentWrapper screenFragmentWrapper = this.f25311g;
        if (screenFragmentWrapper != null) {
            screenFragmentWrapper.removeChildScreenContainer(this);
        }
        this.f25311g = null;
        super.onDetachedFromWindow();
        this.f25307c = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(i7, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ChoreographerFrameCallbackC0441a choreographerFrameCallbackC0441a;
        super.requestLayout();
        if (this.f25309e || (choreographerFrameCallbackC0441a = this.f25310f) == null) {
            return;
        }
        this.f25309e = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, choreographerFrameCallbackC0441a);
    }
}
