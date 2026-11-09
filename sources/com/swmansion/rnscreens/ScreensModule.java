package com.swmansion.rnscreens;

import N8.q0;
import O7.r;
import O7.u;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNSModule")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "jsiPtr", "", "nativeInstall", "(J)V", "nativeUninstall", "()V", "setupFabric", "", "reactTag", "", "startTransition", "(Ljava/lang/Integer;)[I", "", ReactProgressBarViewManager.PROP_PROGRESS, "updateTransition", "(D)V", "", "canceled", "finishTransition", "(Ljava/lang/Integer;Z)V", "invalidate", "initialize", "", "getName", "()Ljava/lang/String;", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactApplicationContext;", "topScreenId", "I", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/swmansion/rnscreens/NativeProxy;", "proxy", "Lcom/swmansion/rnscreens/NativeProxy;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreensModule extends NativeScreensModuleSpec implements LifecycleEventListener {

    @NotNull
    public static final String NAME = "RNSModule";

    @NotNull
    private final AtomicBoolean isActiveTransition;

    @Nullable
    private NativeProxy proxy;

    @NotNull
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.getContext());
            } else {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
            }
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @DoNotStrip
    private final void finishTransition(Integer reactTag, boolean canceled) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || reactTag == null) {
            Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
            return;
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactContext, reactTag.intValue());
        View viewResolveView = uIManagerForReactTag != null ? uIManagerForReactTag.resolveView(reactTag.intValue()) : null;
        if (viewResolveView instanceof ScreenStack) {
            if (canceled) {
                ScreenStack screenStack = (ScreenStack) viewResolveView;
                ArrayList arrayList = screenStack.f25305a;
                if (arrayList.size() < 2) {
                    throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
                }
                C1161a c1161aB = screenStack.b();
                c1161aB.m(((ScreenFragmentWrapper) q0.i(2, arrayList)).getFragment());
                c1161aB.j();
            } else {
                ScreenStack screenStack2 = (ScreenStack) viewResolveView;
                Screen topScreen = screenStack2.getTopScreen();
                Intrinsics.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
                if (screenStack2.getContext() instanceof ReactContext) {
                    int surfaceId = UIManagerHelper.getSurfaceId(screenStack2.getContext());
                    Context context = screenStack2.getContext();
                    Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
                    if (eventDispatcherForReactTag != null) {
                        eventDispatcherForReactTag.dispatchEvent(new r(surfaceId, topScreen.getId()));
                    }
                }
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long jsiPtr);

    private final native void nativeUninstall();

    private final void setupFabric() {
        UIManager uIManager = UIManagerHelper.getUIManager(this.reactContext, 2);
        Intrinsics.f(uIManager, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        FabricUIManager fabricUIManager = (FabricUIManager) uIManager;
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.nativeAddMutationsListener(fabricUIManager);
        }
    }

    @DoNotStrip
    private final int[] startTransition(Integer reactTag) {
        ScreenStack screenStack;
        ArrayList<ScreenStackFragmentWrapper> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || reactTag == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactContext, reactTag.intValue());
        View viewResolveView = uIManagerForReactTag != null ? uIManagerForReactTag.resolveView(reactTag.intValue()) : null;
        if (!(viewResolveView instanceof ScreenStack) || (size = (fragments = (screenStack = (ScreenStack) viewResolveView).getFragments()).size()) <= 1) {
            return iArr;
        }
        this.isActiveTransition.set(true);
        ArrayList arrayList = screenStack.f25305a;
        if (arrayList.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        C1161a c1161aB = screenStack.b();
        Screen topScreen = screenStack.getTopScreen();
        Intrinsics.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.f(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        c1161aB.m(fragment);
        c1161aB.a(((ScreenFragmentWrapper) arrayList.get(arrayList.size() - 2)).getFragment(), screenStack.getId());
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.f(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        c1161aB.a(fragment2, screenStack.getId());
        c1161aB.j();
        int id2 = fragments.get(size - 1).getScreen().getId();
        this.topScreenId = id2;
        iArr[0] = id2;
        iArr[1] = fragments.get(size - 2).getScreen().getId();
        return iArr;
    }

    @DoNotStrip
    private final void updateTransition(double progress) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId == -1) {
            return;
        }
        float f10 = (float) progress;
        short coalescingKey = ScreenFragment.f25321i.getCoalescingKey(f10);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, this.topScreenId);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new u(UIManagerHelper.getSurfaceId(this.reactContext), this.topScreenId, f10, true, true, coalescingKey));
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNSModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.proxy = new NativeProxy();
        this.reactContext.addLifecycleEventListener(this);
        setupFabric();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.invalidateNative();
        }
        this.proxy = null;
        this.reactContext.removeLifecycleEventListener(this);
        nativeUninstall();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.cleanupExpiredMountingCoordinators();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        setupFabric();
    }
}
