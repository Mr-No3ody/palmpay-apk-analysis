package com.swmansion.rnscreens;

import M7.EnumC0454n;
import M7.EnumC0455o;
import M7.q;
import N7.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.webview.container.PPWebActivity;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1849p;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010H\u001a\u00020,H\u0017¢\u0006\u0004\bI\u0010/J!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010J\u001a\u00020,H\u0017¢\u0006\u0004\bK\u0010/J#\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bL\u0010)J!\u0010M\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bM\u0010/J!\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bN\u0010\u001bJ!\u0010O\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bO\u0010/J!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010T\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bT\u0010/J!\u0010U\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bU\u0010/J#\u0010V\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bV\u0010)J#\u0010W\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bW\u0010)J#\u0010X\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bX\u0010)J#\u0010Y\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u0010)J#\u0010Z\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u0010)J!\u0010[\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\b[\u0010/J!\u0010\\\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\b\\\u0010/J!\u0010^\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010]H\u0017¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\b`\u0010\u001bJ\u001f\u0010a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\ba\u0010/J\u001f\u0010b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bb\u0010\u0012J\u001f\u0010c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bc\u0010/J\u001f\u0010d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bd\u0010\u001bJ!\u0010e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\be\u0010)J\u001b\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0fH\u0016¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00020iH\u0014¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u0006H\u0002¢\u0006\u0004\bm\u0010nR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/Screen;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/Screen;", "view", "", "activityState", "", "setActivityState", "(Lcom/swmansion/rnscreens/Screen;F)V", "parent", "Landroid/view/View;", "child", "", FirebaseAnalytics.Param.INDEX, "addView", "(Lcom/swmansion/rnscreens/Screen;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/Screen;I)V", "removeView", "(Lcom/swmansion/rnscreens/Screen;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/Screen;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/Screen;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/Screen;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/Screen;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/Screen;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", PPWebActivity.KEY_WEB_NAV_BAR, "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "sheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/Screen;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setSynchronousShadowStateUpdatesEnabled", "setAndroidResetScreenShadowStateOnOrientationChangeEnabled", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/Screen;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ScreenViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nScreenViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenViewManager.kt\ncom/swmansion/rnscreens/ScreenViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,449:1\n1#2:450\n*E\n"})
public class ScreenViewManager extends ViewGroupManager<Screen> implements RNSScreenManagerInterface<Screen> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreen";

    @NotNull
    private final ViewManagerDelegate<Screen> delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenManagerDelegate(this);
    }

    private final void logNotAvailable(String propName) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<Screen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return G.h(new Pair("topDismissed", G.e(new Pair("registrationName", "onDismissed"))), new Pair("topWillAppear", G.e(new Pair("registrationName", "onWillAppear"))), new Pair("topAppear", G.e(new Pair("registrationName", "onAppear"))), new Pair("topWillDisappear", G.e(new Pair("registrationName", "onWillDisappear"))), new Pair("topDisappear", G.e(new Pair("registrationName", "onDisappear"))), new Pair("topHeaderHeightChange", G.e(new Pair("registrationName", "onHeaderHeightChange"))), new Pair("topHeaderBackButtonClicked", G.e(new Pair("registrationName", "onHeaderBackButtonClicked"))), new Pair("topTransitionProgress", G.e(new Pair("registrationName", "onTransitionProgress"))), new Pair("topSheetDetentChanged", G.e(new Pair("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setBottomScrollEdgeEffect(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeShadowEnabled(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(@Nullable Screen view, @Nullable ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setLeftScrollEdgeEffect(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setRightScrollEdgeEffect(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(@Nullable Screen view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTopScrollEdgeEffect(@Nullable Screen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(@Nullable Screen view, int value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Screen createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new Screen(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull Screen view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        if (view.f25279H) {
            view.f25279H = false;
            if (view.stackPresentation != q.f5845d || view.getBackground() == null) {
                return;
            }
            Drawable background = view.getBackground();
            MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
            if (materialShapeDrawable != null) {
                float fMax = Math.max(PixelUtil.toDIPFromPixel(view.sheetCornerRadius), 0.0f);
                ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
                builder.setTopLeftCorner(0, fMax);
                builder.setTopRightCorner(0, fMax);
                materialShapeDrawable.setShapeAppearanceModel(builder.build());
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull Screen parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView(parent, view);
        if (view instanceof ScreenFooter) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(@NotNull Screen view, float activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(@NotNull Screen view, boolean gestureEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(@NotNull Screen view, boolean nativeBackButtonDismissalEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(@NotNull Screen view, @Nullable Integer navigationBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("navigationBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = PPWebActivity.KEY_WEB_NAV_BAR)
    public void setNavigationBarHidden(@NotNull Screen view, boolean navigationBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull Screen view, boolean navigationBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("navigationBarTranslucent");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(@NotNull Screen view, @Nullable String animation) {
        EnumC0455o enumC0455o;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation == null || animation.equals("pop")) {
            enumC0455o = EnumC0455o.f5830b;
        } else {
            if (!animation.equals(Constants.PUSH)) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type ".concat(animation));
            }
            enumC0455o = EnumC0455o.f5829a;
        }
        view.setReplaceAnimation(enumC0455o);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setScreenId(@NotNull Screen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(@NotNull Screen view, @Nullable String screenOrientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(@NotNull Screen view, @Nullable ReadableArray value) {
        ?? C10;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.size() <= 0) {
            C10 = C1849p.c(Double.valueOf(1.0d));
        } else {
            int size = value.size();
            C10 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                C10.add(Double.valueOf(value.getDouble(i7)));
            }
        }
        view.setSheetDetents(new k(C10));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetCornerRadius")
    public void setSheetCornerRadius(@NotNull Screen view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetDefaultResizeAnimationEnabled")
    public void setSheetDefaultResizeAnimationEnabled(@Nullable Screen view, boolean sheetDefaultResizeAnimationEnabled) {
        if (view != null) {
            view.setSheetDefaultResizeAnimationEnabled(sheetDefaultResizeAnimationEnabled);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetElevation")
    public void setSheetElevation(@Nullable Screen view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(@NotNull Screen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(@NotNull Screen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetInitialDetent")
    public void setSheetInitialDetent(@NotNull Screen view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(@NotNull Screen view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetShouldOverflowTopInset")
    public void setSheetShouldOverflowTopInset(@Nullable Screen view, boolean sheetShouldOverflowTopInset) {
        if (view != null) {
            view.setSheetShouldOverflowTopInset(sheetShouldOverflowTopInset);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3.equals(com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r3.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackAnimation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.Screen r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L91
            int r0 = r3.hashCode()
            switch(r0) {
                case -1418955385: goto L7c;
                case -1198710326: goto L71;
                case -427095442: goto L66;
                case -349395819: goto L5b;
                case 3135100: goto L50;
                case 3145837: goto L47;
                case 3387192: goto L3c;
                case 182437661: goto L31;
                case 1500346553: goto L26;
                case 1544803905: goto L1c;
                case 1601504978: goto L10;
                default: goto Le;
            }
        Le:
            goto L85
        L10:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5835d
            goto L93
        L1c:
            java.lang.String r0 = "default"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L26:
            java.lang.String r0 = "ios_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5839i
            goto L93
        L31:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5838g
            goto L93
        L3c:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5833b
            goto L93
        L47:
            java.lang.String r0 = "flip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L50:
            java.lang.String r0 = "fade"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5834c
            goto L93
        L5b:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5836e
            goto L93
        L66:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5837f
            goto L93
        L71:
            java.lang.String r0 = "ios_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            M7.p r3 = M7.p.f5840j
            goto L93
        L7c:
            java.lang.String r0 = "simple_push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L85:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown animation type "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
        L91:
            M7.p r3 = M7.p.f5832a
        L93:
            r2.setStackAnimation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r3.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r3.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r3.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r3 = M7.q.f5843b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r3.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r3 = M7.q.f5844c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackPresentation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.Screen r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L62
            int r0 = r3.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            M7.q r3 = M7.q.f5845d
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
        L46:
            M7.q r3 = M7.q.f5843b
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            M7.q r3 = M7.q.f5842a
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            M7.q r3 = M7.q.f5844c
        L5e:
            r2.setStackPresentation(r3)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown presentation type "
            java.lang.String r3 = C0.G.o(r0, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(@NotNull Screen view, @Nullable String statusBarAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || ViewProps.NONE.equals(statusBarAnimation)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(@NotNull Screen view, @Nullable Integer statusBarColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("statusBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(@NotNull Screen view, boolean statusBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(@NotNull Screen view, @Nullable String statusBarStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull Screen view, boolean statusBarTranslucent) {
        Intrinsics.checkNotNullParameter(view, "view");
        logNotAvailable("statusBarTranslucent");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull Screen view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull Screen parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof ScreenContentWrapper) {
            ScreenContentWrapper wrapper = (ScreenContentWrapper) child;
            parent.getClass();
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            wrapper.setDelegate$react_native_screens_release(parent);
        } else if (child instanceof ScreenFooter) {
            parent.setFooter((ScreenFooter) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull Screen parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(index) instanceof ScreenFooter) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(@NotNull Screen view, int activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(EnumC0454n.f5825a);
        } else if (activityState == 1) {
            view.setActivityState(EnumC0454n.f5826b);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(EnumC0454n.f5827c);
        }
    }
}
