package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f17123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f17124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f17125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17126d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17127e = -1;

    public f0(F f10, h0 h0Var, Fragment fragment) {
        this.f17123a = f10;
        this.f17124b = h0Var;
        this.f17125c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.f17125c;
        Fragment expectedParentFragment = Z.F(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i7 = fragment.mContainerId;
            p275s0.d dVar = p275s0.e.f42006a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(expectedParentFragment);
            sb2.append(" via container with ID ");
            p275s0.e.b(new p275s0.a(fragment, C0.G.n(i7, " without using parent's childFragmentManager", sb2)));
            p275s0.e.a(fragment).f42005a.contains(p275s0.b.f41998c);
        }
        h0 h0Var = this.f17124b;
        h0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = h0Var.f17139a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                Fragment fragment2 = (Fragment) arrayList.get(i10);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = (Fragment) arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zL = Z.L(3);
        Fragment fragment = this.f17125c;
        if (zL) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        f0 f0Var = null;
        h0 h0Var = this.f17124b;
        if (fragment2 != null) {
            f0 f0Var2 = (f0) h0Var.f17140b.get(fragment2.mWho);
            if (f0Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            f0Var = f0Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (f0Var = (f0) h0Var.f17140b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(C0.G.r(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (f0Var != null) {
            f0Var.i();
        }
        Z z3 = fragment.mFragmentManager;
        fragment.mHost = z3.f17087v;
        fragment.mParentFragment = z3.f17089x;
        F f10 = this.f17123a;
        f10.g(fragment, false);
        fragment.performAttach();
        f10.b(fragment, false);
    }

    public final int c() {
        Object next;
        Fragment fragment = this.f17125c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f17127e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f17127e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f17127e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        z0 z0Var = null;
        if (viewGroup != null) {
            D0 orCreateController = D0.f16973f.getOrCreateController(viewGroup, fragment.getParentFragmentManager());
            orCreateController.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            x0 x0VarD = orCreateController.d(fragment);
            z0 z0Var2 = x0VarD != null ? x0VarD.f17247b : null;
            Iterator it = orCreateController.f16976c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                x0 x0Var = (x0) next;
                if (Intrinsics.c(x0Var.f17248c, fragment) && !x0Var.f17251f) {
                    break;
                }
            }
            x0 x0Var2 = (x0) next;
            z0Var = x0Var2 != null ? x0Var2.f17247b : null;
            int i7 = z0Var2 == null ? -1 : C0.f16971a[z0Var2.ordinal()];
            if (i7 != -1 && i7 != 1) {
                z0Var = z0Var2;
            }
        }
        if (z0Var == z0.f17256b) {
            iMin = Math.min(iMin, 6);
        } else if (z0Var == z0.f17257c) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Z.L(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() {
        String resourceName;
        Fragment fragment = this.f17125c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Z.L(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i7 = fragment.mContainerId;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException(androidx.camera.video.u.m("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f17088w.a(i7);
                if (container == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    p275s0.d dVar = p275s0.e.f42006a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    p275s0.e.b(new p275s0.f(fragment, container, 1));
                    p275s0.e.a(fragment).f42005a.contains(p275s0.b.f42002g);
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (Z.L(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(p260r0.b.fragment_container_view_tag, fragment);
            if (container != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            if (view.isAttachedToWindow()) {
                androidx.core.view.C.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1170e0(view2));
            }
            fragment.performViewCreated();
            this.f17123a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (Z.L(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zL = Z.L(3);
        Fragment fragment = this.f17125c;
        if (zL) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z3 = fragment.mRemoving && !fragment.isInBackStack();
        h0 h0Var = this.f17124b;
        if (z3 && !fragment.mBeingSaved) {
            h0Var.i(null, fragment.mWho);
        }
        if (!z3) {
            C1166c0 c1166c0 = h0Var.f17142d;
            if (!((c1166c0.f17101d.containsKey(fragment.mWho) && c1166c0.f17104g) ? c1166c0.f17105i : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = h0Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        K k2 = fragment.mHost;
        if (k2 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = h0Var.f17142d.f17105i;
        } else {
            E e10 = k2.f17026b;
            if (e10 != null) {
                zIsChangingConfigurations = true ^ e10.isChangingConfigurations();
            }
        }
        if ((z3 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            C1166c0 c1166c1 = h0Var.f17142d;
            c1166c1.getClass();
            if (Z.L(3)) {
                Objects.toString(fragment);
            }
            c1166c1.e(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.f17123a.d(fragment, false);
        for (f0 f0Var : h0Var.d()) {
            if (f0Var != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = f0Var.f17125c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = h0Var.b(str3);
        }
        h0Var.h(this);
    }

    public final void f() {
        View view;
        boolean zL = Z.L(3);
        Fragment fragment = this.f17125c;
        if (zL) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f17123a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zL = Z.L(3);
        Fragment fragment = this.f17125c;
        if (zL) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f17123a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            C1166c0 c1166c0 = this.f17124b.f17142d;
            if (!((c1166c0.f17101d.containsKey(fragment.mWho) && c1166c0.f17104g) ? c1166c0.f17105i : true)) {
                return;
            }
        }
        if (Z.L(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.f17125c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Z.L(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(p260r0.b.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f17123a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z3 = this.f17126d;
        Fragment fragment = this.f17125c;
        if (z3) {
            if (Z.L(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f17126d = true;
            boolean z8 = false;
            while (true) {
                int iC = c();
                int i7 = fragment.mState;
                h0 h0Var = this.f17124b;
                if (iC == i7) {
                    if (!z8 && i7 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (Z.L(3)) {
                            Objects.toString(fragment);
                        }
                        C1166c0 c1166c0 = h0Var.f17142d;
                        c1166c0.getClass();
                        if (Z.L(3)) {
                            Objects.toString(fragment);
                        }
                        c1166c0.e(fragment.mWho, true);
                        h0Var.h(this);
                        if (Z.L(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            D0 orCreateController = D0.f16973f.getOrCreateController(viewGroup, fragment.getParentFragmentManager());
                            boolean z10 = fragment.mHidden;
                            z0 z0Var = z0.f17255a;
                            if (z10) {
                                orCreateController.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (Z.L(2)) {
                                    Objects.toString(fragment);
                                }
                                orCreateController.a(B0.f16952d, z0Var, this);
                            } else {
                                orCreateController.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (Z.L(2)) {
                                    Objects.toString(fragment);
                                }
                                orCreateController.a(B0.f16951c, z0Var, this);
                            }
                        }
                        Z z11 = fragment.mFragmentManager;
                        if (z11 != null && fragment.mAdded && Z.M(fragment)) {
                            z11.f17057G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    return;
                }
                F f10 = this.f17123a;
                if (iC > i7) {
                    switch (i7 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                f10.h(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                f10.c(fragment, bundle, false);
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            f10.a(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                D0 orCreateController2 = D0.f16973f.getOrCreateController(viewGroup3, fragment.getParentFragmentManager());
                                B0 finalState = B0.f16949a.from(fragment.mView.getVisibility());
                                orCreateController2.getClass();
                                Intrinsics.checkNotNullParameter(finalState, "finalState");
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (Z.L(2)) {
                                    Objects.toString(fragment);
                                }
                                orCreateController2.a(finalState, z0.f17256b, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            f10.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i7 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) h0Var.f17141c.get(fragment.mWho)) == null) {
                                    h0Var.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                h0Var.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                D0 orCreateController3 = D0.f16973f.getOrCreateController(viewGroup2, fragment.getParentFragmentManager());
                                orCreateController3.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (Z.L(2)) {
                                    Objects.toString(fragment);
                                }
                                orCreateController3.a(B0.f16950b, z0.f17257c, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            f10.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (Z.L(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            f10.f(fragment, false);
                            break;
                    }
                }
                z8 = true;
            }
        } finally {
            this.f17126d = false;
        }
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.f17125c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.t;
            fragment.mTargetRequestCode = fragmentState.f17012v;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.f17013w;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void k() {
        boolean zL = Z.L(3);
        Fragment fragment = this.f17125c;
        if (zL) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                focusedView.requestFocus();
                if (Z.L(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (Z.L(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f17123a.i(fragment, false);
        this.f17124b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f17125c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f17123a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC0 = fragment.mChildFragmentManager.c0();
            if (!bundleC0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.f17125c;
        if (fragment.mView == null) {
            return;
        }
        if (Z.L(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f17213f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public f0(F f10, h0 h0Var, ClassLoader classLoader, J j6, Bundle bundle) {
        this.f17123a = f10;
        this.f17124b = h0Var;
        Fragment fragmentC = ((FragmentState) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).c(j6, classLoader);
        this.f17125c = fragmentC;
        fragmentC.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentC.setArguments(bundle2);
        if (Z.L(2)) {
            Objects.toString(fragmentC);
        }
    }

    public f0(F f10, h0 h0Var, Fragment fragment, Bundle bundle) {
        this.f17123a = f10;
        this.f17124b = h0Var;
        this.f17125c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
