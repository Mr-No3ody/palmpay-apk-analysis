package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.arch.core.util.Function;
import androidx.core.app.AbstractC1032a;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1188x mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    Z mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    ViewModelProvider$Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    Z mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    K mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1212w mLifecycleRegistry;
    EnumC1204n mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC1189y> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    @RestrictTo({p192n.c.f39800a})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC1189y mSavedStateAttachListener;
    L0.f mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    t0 mViewLifecycleOwner;
    androidx.lifecycle.F mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1162a0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC1183s(this, 0);
        this.mMaxState = EnumC1204n.f17464e;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.F();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C1184t(this);
        d();
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public final C1188x a() {
        if (this.mAnimationInfo == null) {
            C1188x c1188x = new C1188x();
            c1188x.f17235i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c1188x.f17236j = obj;
            c1188x.f17237k = null;
            c1188x.f17238l = obj;
            c1188x.f17239m = null;
            c1188x.f17240n = obj;
            c1188x.f17243q = 1.0f;
            c1188x.f17244r = null;
            this.mAnimationInfo = c1188x;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        EnumC1204n enumC1204n = this.mMaxState;
        return (enumC1204n == EnumC1204n.f17461b || this.mParentFragment == null) ? enumC1204n.ordinal() : Math.min(enumC1204n.ordinal(), this.mParentFragment.b());
    }

    public final Fragment c(boolean z3) {
        String str;
        if (z3) {
            p275s0.d dVar = p275s0.e.f42006a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            p275s0.e.b(new p275s0.h(this, "Attempting to get target fragment from fragment " + this));
            p275s0.e.a(this).f42005a.contains(p275s0.b.f42001f);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        Z z8 = this.mFragmentManager;
        if (z8 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return z8.f17069c.b(str);
    }

    public void callStartTransitionListener(boolean z3) {
        ViewGroup viewGroup;
        Z z8;
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x != null) {
            c1188x.f17245s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (z8 = this.mFragmentManager) == null) {
            return;
        }
        D0 orCreateController = D0.f16973f.getOrCreateController(viewGroup, z8);
        orCreateController.f();
        if (z3) {
            this.mHost.f17027c.post(new RunnableC1177l(orCreateController, 1));
        } else {
            orCreateController.c();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public H createFragmentContainer() {
        return new C1185u(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new C1212w(this);
        this.mSavedStateRegistryController = L0.f.f5522d.create(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        AbstractC1189y abstractC1189y = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            abstractC1189y.a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC1189y);
        }
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentC = c(false);
        if (fragmentC != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentC);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            A0.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(N8.q0.j(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final r e(p177m.b bVar, Function function, ActivityResultCallback activityResultCallback) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C1187w c1187w = new C1187w(this, function, atomicReference, bVar, activityResultCallback);
        if (this.mState >= 0) {
            c1187w.a();
        } else {
            this.mOnPreAttachedListeners.add(c1187w);
        }
        return new r(atomicReference);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f17069c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final E getActivity() {
        K k2 = this.mHost;
        if (k2 == null) {
            return null;
        }
        return k2.f17025a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null || (bool = c1188x.f17242p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null || (bool = c1188x.f17241o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        c1188x.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final Z getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        K k2 = this.mHost;
        if (k2 == null) {
            return null;
        }
        return k2.f17026b;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public z0.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Z.L(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        z0.d dVar = new z0.d(0);
        if (application != null) {
            dVar.b(androidx.lifecycle.e0.f17448h, application);
        }
        dVar.b(androidx.lifecycle.V.f17413a, this);
        dVar.b(androidx.lifecycle.V.f17414b, this);
        if (getArguments() != null) {
            dVar.b(androidx.lifecycle.V.f17415c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Z.L(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new androidx.lifecycle.Y(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @AnimRes
    public int getEnterAnim() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 0;
        }
        return c1188x.f17228b;
    }

    @Nullable
    public Object getEnterTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        return c1188x.f17235i;
    }

    public androidx.core.app.P getEnterTransitionCallback() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        c1188x.getClass();
        return null;
    }

    @AnimRes
    public int getExitAnim() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 0;
        }
        return c1188x.f17229c;
    }

    @Nullable
    public Object getExitTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        return c1188x.f17237k;
    }

    public androidx.core.app.P getExitTransitionCallback() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        c1188x.getClass();
        return null;
    }

    public View getFocusedView() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        return c1188x.f17244r;
    }

    @Nullable
    @Deprecated
    public final Z getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        K k2 = this.mHost;
        if (k2 == null) {
            return null;
        }
        return ((D) k2).f16972e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public AbstractC1205o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public A0.a getLoaderManager() {
        return A0.a.a(this);
    }

    public int getNextTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 0;
        }
        return c1188x.f17232f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final Z getParentFragmentManager() {
        Z z3 = this.mFragmentManager;
        if (z3 != null) {
            return z3;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return false;
        }
        return c1188x.f17227a;
    }

    @AnimRes
    public int getPopEnterAnim() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 0;
        }
        return c1188x.f17230d;
    }

    @AnimRes
    public int getPopExitAnim() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 0;
        }
        return c1188x.f17231e;
    }

    public float getPostOnViewCreatedAlpha() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return 1.0f;
        }
        return c1188x.f17243q;
    }

    @Nullable
    public Object getReenterTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        Object obj = c1188x.f17238l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        p275s0.d dVar = p275s0.e.f42006a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        p275s0.e.b(new p275s0.g(this, "Attempting to get retain instance for fragment " + this));
        p275s0.e.a(this).f42005a.contains(p275s0.b.f41999d);
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        Object obj = c1188x.f17236j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final L0.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f5524b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        return c1188x.f17239m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return null;
        }
        Object obj = c1188x.f17240n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C1188x c1188x = this.mAnimationInfo;
        return (c1188x == null || (arrayList = c1188x.f17233g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C1188x c1188x = this.mAnimationInfo;
        return (c1188x == null || (arrayList = c1188x.f17234h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@StringRes int i7) {
        return getResources().getString(i7);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        p275s0.d dVar = p275s0.e.f42006a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        p275s0.e.b(new p275s0.h(this, "Attempting to get target request code from fragment " + this));
        p275s0.e.a(this).f42005a.contains(p275s0.b.f42001f);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i7) {
        return getResources().getText(i7);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public LifecycleOwner getViewLifecycleOwner() {
        t0 t0Var = this.mViewLifecycleOwner;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.B getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public androidx.lifecycle.i0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (b() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f17065O.f17103f;
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) map.get(this.mWho);
        if (i0Var != null) {
            return i0Var;
        }
        androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
        map.put(this.mWho, i0Var2);
        return i0Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({p192n.c.f39802c})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1162a0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        Z z3 = this.mFragmentManager;
        if (z3 != null) {
            Fragment fragment = this.mParentFragment;
            z3.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({p192n.c.f39802c})
    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        C1188x c1188x = this.mAnimationInfo;
        if (c1188x == null) {
            return false;
        }
        return c1188x.f17245s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        Z z3 = this.mFragmentManager;
        if (z3 == null) {
            return false;
        }
        return z3.P();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i7, int i10, @Nullable Intent intent) {
        if (Z.L(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        K k2 = this.mHost;
        E e10 = k2 == null ? null : k2.f17025a;
        if (e10 != null) {
            this.mCalled = false;
            onAttach((Activity) e10);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        Z z3 = this.mChildFragmentManager;
        if (z3.f17086u >= 1) {
            return;
        }
        z3.f17058H = false;
        z3.f17059I = false;
        z3.f17065O.f17106j = false;
        z3.t(1);
    }

    @Nullable
    @MainThread
    public Animation onCreateAnimation(int i7, boolean z3, int i10) {
        return null;
    }

    @Nullable
    @MainThread
    public Animator onCreateAnimator(int i7, boolean z3, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    @MainThread
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i7 = this.mContentLayoutId;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @MainThread
    public void onHiddenChanged(boolean z3) {
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        K k2 = this.mHost;
        E e10 = k2 == null ? null : k2.f17025a;
        if (e10 != null) {
            this.mCalled = false;
            onInflate((Activity) e10, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z3) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z3) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z3) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (Z.L(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        Z z3 = this.mChildFragmentManager;
        z3.f17058H = false;
        z3.f17059I = false;
        z3.f17065O.f17106j = false;
        z3.t(4);
    }

    public void performAttach() {
        Iterator<AbstractC1189y> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f17026b);
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Z z3 = this.mFragmentManager;
        Iterator it2 = z3.f17081o.iterator();
        while (it2.hasNext()) {
            ((FragmentOnAttachListener) it2.next()).onAttachFragment(z3, this);
        }
        Z z8 = this.mChildFragmentManager;
        z8.f17058H = false;
        z8.f17059I = false;
        z8.f17065O.f17106j = false;
        z8.t(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
                View view;
                if (enumC1203m != EnumC1203m.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(EnumC1203m.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z3 = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z3;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new t0(this, getViewModelStore(), new RunnableC1182q(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f17212e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Z.L(3)) {
            Objects.toString(this.mView);
            toString();
        }
        View view = this.mView;
        t0 t0Var = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(p358y0.a.view_tree_lifecycle_owner, t0Var);
        View view2 = this.mView;
        t0 t0Var2 = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(z0.e.view_tree_view_model_store_owner, t0Var2);
        View view3 = this.mView;
        t0 t0Var3 = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view3, "<this>");
        view3.setTag(L0.a.view_tree_saved_state_registry_owner, t0Var3);
        this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(EnumC1203m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            t0 t0Var = this.mViewLifecycleOwner;
            t0Var.b();
            if (t0Var.f17212e.f17478d.a(EnumC1204n.f17462c)) {
                this.mViewLifecycleOwner.a(EnumC1203m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        M.o oVar = A0.a.a(this).f22b.f20d;
        if (oVar.e() <= 0) {
            this.mPerformedCreateView = false;
        } else {
            oVar.f(0).getClass();
            throw new ClassCastException();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        Z z3 = this.mChildFragmentManager;
        if (z3.f17060J) {
            return;
        }
        z3.k();
        this.mChildFragmentManager = new C1162a0();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z3) {
        onMultiWindowModeChanged(z3);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1203m.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(EnumC1203m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z3) {
        onPictureInPictureModeChanged(z3);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z3 = true;
        }
        return this.mChildFragmentManager.s(menu) | z3;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zO = Z.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO);
            onPrimaryNavigationFragmentChanged(zO);
            Z z3 = this.mChildFragmentManager;
            z3.m0();
            z3.q(z3.f17090y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.y(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1212w c1212w = this.mLifecycleRegistry;
        EnumC1203m enumC1203m = EnumC1203m.ON_RESUME;
        c1212w.e(enumC1203m);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f17212e.e(enumC1203m);
        }
        Z z3 = this.mChildFragmentManager;
        z3.f17058H = false;
        z3.f17059I = false;
        z3.f17065O.f17106j = false;
        z3.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.y(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1212w c1212w = this.mLifecycleRegistry;
        EnumC1203m enumC1203m = EnumC1203m.ON_START;
        c1212w.e(enumC1203m);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f17212e.e(enumC1203m);
        }
        Z z3 = this.mChildFragmentManager;
        z3.f17058H = false;
        z3.f17059I = false;
        z3.f17065O.f17106j = false;
        z3.t(5);
    }

    public void performStop() {
        Z z3 = this.mChildFragmentManager;
        z3.f17059I = true;
        z3.f17065O.f17106j = true;
        z3.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1203m.ON_STOP);
        }
        this.mLifecycleRegistry.e(EnumC1203m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        a().f17245s = true;
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.a registerForActivityResult(@NonNull p177m.b bVar, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return e(bVar, new C1186v(this, 0), activityResultCallback);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i7) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to Activity"));
        }
        Z parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17055E == null) {
            parentFragmentManager.f17087v.getClass();
            return;
        }
        parentFragmentManager.f17056F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i7));
        parentFragmentManager.f17055E.a(strArr);
    }

    @NonNull
    public final E requireActivity() {
        E activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final Z requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.b0(bundle);
        Z z3 = this.mChildFragmentManager;
        z3.f17058H = false;
        z3.f17059I = false;
        z3.f17065O.f17106j = false;
        z3.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new E0(androidx.camera.video.u.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1203m.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z3) {
        a().f17242p = Boolean.valueOf(z3);
    }

    public void setAllowReturnTransitionOverlap(boolean z3) {
        a().f17241o = Boolean.valueOf(z3);
    }

    public void setAnimations(@AnimRes int i7, @AnimRes int i10, @AnimRes int i11, @AnimRes int i12) {
        if (this.mAnimationInfo == null && i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        a().f17228b = i7;
        a().f17229c = i10;
        a().f17230d = i11;
        a().f17231e = i12;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.P p3) {
        a().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        a().f17235i = obj;
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.P p3) {
        a().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        a().f17237k = obj;
    }

    public void setFocusedView(View view) {
        a().f17244r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z3) {
        if (this.mHasMenu != z3) {
            this.mHasMenu = z3;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((D) this.mHost).invalidateMenu();
        }
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f16982a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z3) {
        if (this.mMenuVisible != z3) {
            this.mMenuVisible = z3;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((D) this.mHost).invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i7) {
        if (this.mAnimationInfo == null && i7 == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f17232f = i7;
    }

    public void setPopDirection(boolean z3) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().f17227a = z3;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        a().f17243q = f10;
    }

    public void setReenterTransition(@Nullable Object obj) {
        a().f17238l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z3) {
        p275s0.d dVar = p275s0.e.f42006a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        p275s0.e.b(new p275s0.g(this, "Attempting to set retain instance for fragment " + this));
        p275s0.e.a(this).f42005a.contains(p275s0.b.f41999d);
        this.mRetainInstance = z3;
        Z z8 = this.mFragmentManager;
        if (z8 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z3) {
            z8.f17065O.d(this);
        } else {
            z8.f17065O.f(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        a().f17236j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        a().f17239m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        a();
        C1188x c1188x = this.mAnimationInfo;
        c1188x.f17233g = arrayList;
        c1188x.f17234h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        a().f17240n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment targetFragment, int i7) {
        if (targetFragment != null) {
            p275s0.d dVar = p275s0.e.f42006a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            p275s0.e.b(new p275s0.h(this, "Attempting to set target fragment " + targetFragment + " with request code " + i7 + " for fragment " + this));
            p275s0.e.a(this).f42005a.contains(p275s0.b.f42001f);
        }
        Z z3 = this.mFragmentManager;
        Z z8 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (z3 != null && z8 != null && z3 != z8) {
            throw new IllegalArgumentException(androidx.camera.video.u.m("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragmentC = targetFragment; fragmentC != null; fragmentC = fragmentC.c(false)) {
            if (fragmentC.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || targetFragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        } else {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i7;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z3) {
        p275s0.d dVar = p275s0.e.f42006a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        p275s0.e.b(new p275s0.a(this, "Attempting to set user visible hint to " + z3 + " for fragment " + this));
        p275s0.e.a(this).f42005a.contains(p275s0.b.f42000e);
        boolean z8 = false;
        if (!this.mUserVisibleHint && z3 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            Z z10 = this.mFragmentManager;
            f0 f0VarF = z10.f(this);
            Fragment fragment = f0VarF.f17125c;
            if (fragment.mDeferStart) {
                if (z10.f17068b) {
                    z10.f17061K = true;
                } else {
                    fragment.mDeferStart = false;
                    f0VarF.i();
                }
            }
        }
        this.mUserVisibleHint = z3;
        if (this.mState < 5 && !z3) {
            z8 = true;
        }
        this.mDeferStart = z8;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        K k2 = this.mHost;
        if (k2 != null) {
            return AbstractC1032a.h(((D) k2).f16972e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i7) {
        startActivityForResult(intent, i7, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i7, @Nullable Intent intent, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to Activity"));
        }
        if (Z.L(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        Z parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17054D == null) {
            K k2 = parentFragmentManager.f17087v;
            if (i7 == -1) {
                k2.f17025a.startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
                return;
            } else {
                k2.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (Z.L(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i10, i11);
        parentFragmentManager.f17056F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i7));
        if (Z.L(2)) {
            toString();
        }
        parentFragmentManager.f17054D.a(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().f17245s) {
            return;
        }
        if (this.mHost == null) {
            a().f17245s = false;
        } else if (Looper.myLooper() != this.mHost.f17027c.getLooper()) {
            this.mHost.f17027c.postAtFrontOfQueue(new RunnableC1183s(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new C1190z();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f16982a;

        public SavedState(Bundle bundle) {
            this.f16982a = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeBundle(this.f16982a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f16982a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) J.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e10) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    @NonNull
    public final String getString(@StringRes int i7, @Nullable Object... objArr) {
        return getResources().getString(i7, objArr);
    }

    public final void postponeEnterTransition(long j6, @NonNull TimeUnit timeUnit) {
        a().f17245s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        Z z3 = this.mFragmentManager;
        if (z3 != null) {
            this.mPostponedHandler = z3.f17087v.f17027c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j6));
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.a registerForActivityResult(@NonNull p177m.b bVar, @NonNull androidx.activity.result.h hVar, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return e(bVar, new C1186v(hVar, 1), activityResultCallback);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        K k2 = this.mHost;
        if (k2 == null) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to Activity"));
        }
        k2.f17026b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i7, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.video.u.m("Fragment ", this, " not attached to Activity"));
        }
        Z parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17053C != null) {
            parentFragmentManager.f17056F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i7));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f17053C.a(intent);
            return;
        }
        K k2 = parentFragmentManager.f17087v;
        if (i7 == -1) {
            k2.f17026b.startActivity(intent, bundle);
        } else {
            k2.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @NonNull
    @RestrictTo({p192n.c.f39802c})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        K k2 = this.mHost;
        if (k2 != null) {
            AbstractActivityC0837o abstractActivityC0837o = ((D) k2).f16972e;
            LayoutInflater layoutInflaterCloneInContext = abstractActivityC0837o.getLayoutInflater().cloneInContext(abstractActivityC0837o);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f17072f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i7) {
        this();
        this.mContentLayoutId = i7;
    }
}
