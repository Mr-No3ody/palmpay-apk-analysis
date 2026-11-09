package androidx.activity;

import E.AbstractC0198c;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.AbstractActivityC1040i;
import androidx.core.app.N;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.C1063o;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.V;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: renamed from: androidx.activity.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0822m extends AbstractActivityC1040i implements ContextAware, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final C0817h Companion = new C0817h(null);

    @Nullable
    private i0 _viewModelStore;

    @NotNull
    private final androidx.activity.result.h activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;

    @NotNull
    private final p148k.a contextAwareHelper = new p148k.a();

    @NotNull
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final Lazy fullyDrawnReporter$delegate;

    @NotNull
    private final C1063o menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final Lazy onBackPressedDispatcher$delegate;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<androidx.core.app.t>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<N>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final ComponentActivity$ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @NotNull
    private final L0.f savedStateRegistryController;

    public AbstractActivityC0822m() {
        final androidx.fragment.app.E e10 = (androidx.fragment.app.E) this;
        this.menuHostHelper = new C1063o(new RunnableC0813d(e10, 0));
        L0.f fVarCreate = L0.f.f5522d.create(this);
        this.savedStateRegistryController = fVarCreate;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0819j(e10);
        this.fullyDrawnReporter$delegate = C2131j.b(new C0821l(e10, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0820k(e10);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i7 = 0;
        getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m event) {
                Window window;
                View viewPeekDecorView;
                switch (i7) {
                    case 0:
                        androidx.fragment.app.E this$0 = e10;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC1203m.ON_STOP && (window = this$0.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0822m.b(e10, lifecycleOwner, event);
                        break;
                }
            }
        });
        final int i10 = 1;
        getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m event) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        androidx.fragment.app.E this$0 = e10;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC1203m.ON_STOP && (window = this$0.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0822m.b(e10, lifecycleOwner, event);
                        break;
                }
            }
        });
        getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                androidx.fragment.app.E e11 = e10;
                AbstractActivityC0822m.access$ensureViewModelStore(e11);
                e11.getLifecycle().b(this);
            }
        });
        fVarCreate.a();
        V.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new E0.n(e10, 2));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.f
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                AbstractActivityC0822m.a(context, e10);
            }
        });
        this.defaultViewModelProviderFactory$delegate = C2131j.b(new C0821l(e10, 0));
        this.onBackPressedDispatcher$delegate = C2131j.b(new C0821l(e10, 3));
    }

    public static void a(Context it, androidx.fragment.app.E this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            androidx.activity.result.h hVar = ((AbstractActivityC0822m) this$0).activityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f12064d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = hVar.f12067g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                String str = stringArrayList.get(i7);
                LinkedHashMap linkedHashMap = hVar.f12062b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = hVar.f12061a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        kotlin.jvm.internal.K.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0822m abstractActivityC0822m) {
        if (abstractActivityC0822m._viewModelStore == null) {
            C0818i c0818i = (C0818i) abstractActivityC0822m.getLastNonConfigurationInstance();
            if (c0818i != null) {
                abstractActivityC0822m._viewModelStore = c0818i.f12031b;
            }
            if (abstractActivityC0822m._viewModelStore == null) {
                abstractActivityC0822m._viewModelStore = new i0();
            }
        }
    }

    public static void b(androidx.fragment.app.E this$0, LifecycleOwner lifecycleOwner, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC1203m.ON_DESTROY) {
            ((AbstractActivityC0822m) this$0).contextAwareHelper.f38605b = null;
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            ((AbstractActivityC0822m) this$0).reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    public static Bundle c(androidx.fragment.app.E this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle outState = new Bundle();
        androidx.activity.result.h hVar = ((AbstractActivityC0822m) this$0).activityResultRegistry;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = hVar.f12062b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f12064d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f12067g));
        return outState;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        C1063o c1063o = this.menuHostHelper;
        c1063o.f16269b.add(provider);
        c1063o.f16268a.run();
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        p148k.a aVar = this.contextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractActivityC0822m abstractActivityC0822m = aVar.f38605b;
        if (abstractActivityC0822m != null) {
            listener.onContextAvailable(abstractActivityC0822m);
        }
        aVar.f38604a.add(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer<androidx.core.app.t> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer<N> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @NotNull
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NotNull
    public z0.b getDefaultViewModelCreationExtras() {
        z0.d dVar = new z0.d(0);
        if (getApplication() != null) {
            c0 c0Var = e0.f17448h;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            dVar.b(c0Var, application);
        }
        dVar.b(V.f17413a, this);
        dVar.b(V.f17414b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.b(V.f17415c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider$Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @NotNull
    public v getFullyDrawnReporter() {
        return (v) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        C0818i c0818i = (C0818i) getLastNonConfigurationInstance();
        if (c0818i != null) {
            return c0818i.f12030a;
        }
        return null;
    }

    @Override // androidx.core.app.AbstractActivityC1040i, androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final I getOnBackPressedDispatcher() {
        return (I) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public final L0.d getSavedStateRegistry() {
        return this.savedStateRegistryController.f5524b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public i0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0818i c0818i = (C0818i) getLastNonConfigurationInstance();
            if (c0818i != null) {
                this._viewModelStore = c0818i.f12031b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new i0();
            }
        }
        i0 i0Var = this._viewModelStore;
        Intrinsics.e(i0Var);
        return i0Var;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(p358y0.a.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(z0.e.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(L0.a.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(J.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(J.report_drawn, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        if (this.activityResultRegistry.a(i7, i10, intent)) {
            return;
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        p148k.a aVar = this.contextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        aVar.f38605b = this;
        Iterator it = aVar.f38604a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).onContextAvailable(this);
        }
        super.onCreate(bundle);
        ReportFragment.f17398b.injectIfNeededIn(this);
        int i7 = this.contentLayoutId;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        C1063o c1063o = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c1063o.f16269b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onCreateMenu(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i7, item)) {
            return true;
        }
        if (i7 == 0) {
            Iterator it = this.menuHostHelper.f16269b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).onMenuItemSelected(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onMultiWindowModeChanged(boolean z3) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<androidx.core.app.t>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.t(z3));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f16269b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onMenuClosed(menu);
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z3) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<N>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new N(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = this.menuHostHelper.f16269b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).onPrepareMenu(menu);
        }
        return true;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i7, permissions, grantResults);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        C0818i c0818i;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        i0 i0Var = this._viewModelStore;
        if (i0Var == null && (c0818i = (C0818i) getLastNonConfigurationInstance()) != null) {
            i0Var = c0818i.f12031b;
        }
        if (i0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0818i c0818i2 = new C0818i();
        c0818i2.f12030a = objOnRetainCustomNonConfigurationInstance;
        c0818i2.f12031b = i0Var;
        return c0818i2;
    }

    @Override // androidx.core.app.AbstractActivityC1040i, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof C1212w) {
            AbstractC1205o lifecycle = getLifecycle();
            Intrinsics.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1212w) lifecycle).g(EnumC1204n.f17462c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.f38605b;
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NotNull
    public final <I, O> androidx.activity.result.a registerForActivityResult(@NotNull p177m.b contract, @NotNull androidx.activity.result.h registry, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        p148k.a aVar = this.contextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar.f38604a.remove(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer<androidx.core.app.t> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer<N> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0198c.J()) {
                Trace.beginSection(AbstractC0198c.m0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i7);

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        ComponentActivity$ReportFullyDrawnExecutor componentActivity$ReportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        componentActivity$ReportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i7) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i7, @Nullable Intent intent2, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i7, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i7, @Nullable Intent intent2, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i7, intent2, i10, i11, i12, bundle);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NotNull
    public final <I, O> androidx.activity.result.a registerForActivityResult(@NotNull p177m.b contract, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z3, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z3, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            for (Consumer<androidx.core.app.t> consumer : this.onMultiWindowModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                consumer.accept(new androidx.core.app.t(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z3, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z3, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            for (Consumer<N> consumer : this.onPictureInPictureModeChangedListeners) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                consumer.accept(new N(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.a(provider, owner);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner, @NotNull EnumC1204n state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.b(provider, owner, state);
    }
}
