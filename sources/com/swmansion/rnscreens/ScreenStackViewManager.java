package com.swmansion.rnscreens;

import M7.H;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u00100\u001a\u00020%H\u0016¢\u0006\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/ScreenStack;", "Lcom/facebook/react/viewmanagers/RNSScreenStackManagerInterface;", "<init>", "()V", "Lcom/swmansion/rnscreens/Screen;", "screen", "", "prepareOutTransition", "(Lcom/swmansion/rnscreens/Screen;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/ScreenStack;", "parent", "Landroid/view/View;", "child", "", FirebaseAnalytics.Param.INDEX, "addView", "(Lcom/swmansion/rnscreens/ScreenStack;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/ScreenStack;I)V", "invalidate", "getChildCount", "(Lcom/swmansion/rnscreens/ScreenStack;)I", "getChildAt", "(Lcom/swmansion/rnscreens/ScreenStack;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/LayoutShadowNode;", "", "needsCustomLayoutForChildren", "()Z", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "value", "setIosPreventReattachmentOfDismissedScreens", "(Lcom/swmansion/rnscreens/ScreenStack;Z)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ScreenStackViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nScreenStackViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackViewManager.kt\ncom/swmansion/rnscreens/ScreenStackViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class ScreenStackViewManager extends ViewGroupManager<ScreenStack> implements RNSScreenStackManagerInterface<ScreenStack> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStack";

    @NotNull
    private final ViewManagerDelegate<ScreenStack> delegate;

    public ScreenStackViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackManagerDelegate(this);
    }

    private final void prepareOutTransition(Screen screen) {
        if (screen == null || screen.isBeingRemoved) {
            return;
        }
        screen.isBeingRemoved = true;
        screen.g(screen);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ScreenStack> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return G.h(new Pair("topFinishTransitioning", G.h(new Pair("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NativeProxy.f25273a.clearMapOnInvalidate();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackManagerInterface
    public void setIosPreventReattachmentOfDismissedScreens(@Nullable ScreenStack view, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new H(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ScreenStack createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStack(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull ScreenStack parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof Screen) {
            Screen screen = (Screen) child;
            NativeProxy.f25273a.addScreenToMap(screen.getId(), screen);
            parent.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            ScreenFragmentWrapper screenFragmentWrapperA = parent.a(screen);
            screen.setFragmentWrapper(screenFragmentWrapperA);
            parent.f25305a.add(index, screenFragmentWrapperA);
            screen.setContainer(parent);
            parent.e();
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type Screen");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull ScreenStack parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ((ScreenFragmentWrapper) parent.f25305a.get(index)).getScreen();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull ScreenStack parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull ScreenStack parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Screen screen = ((ScreenFragmentWrapper) parent.f25305a.get(index)).getScreen();
        prepareOutTransition(screen);
        parent.i(index);
        NativeProxy.f25273a.removeScreenFromMap(screen.getId());
    }
}
