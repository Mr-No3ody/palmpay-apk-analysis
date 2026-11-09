package com.swmansion.rnscreens;

import M7.E;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import javax.annotation.Nonnull;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001pB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010#J!\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0015H\u0017¢\u0006\u0004\b6\u0010&J!\u00108\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b=\u0010;J\u001f\u0010?\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010>\u001a\u00020+H\u0017¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0017¢\u0006\u0004\bB\u0010@J\u001f\u0010D\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010C\u001a\u00020+H\u0017¢\u0006\u0004\bD\u0010@J!\u0010F\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bF\u0010;J\u001f\u0010H\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010G\u001a\u00020+H\u0017¢\u0006\u0004\bH\u0010@J\u001f\u0010J\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010I\u001a\u00020+H\u0017¢\u0006\u0004\bJ\u0010@J\u001f\u0010L\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010K\u001a\u00020+H\u0017¢\u0006\u0004\bL\u0010@J!\u0010N\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bN\u00102J!\u0010P\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bP\u0010@J\u001b\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0QH\u0016¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020TH\u0014¢\u0006\u0004\bU\u0010VJ#\u0010W\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bW\u00102J#\u0010X\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bX\u00102J!\u0010Y\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020\u0015H\u0016¢\u0006\u0004\bY\u0010&J!\u0010Z\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bZ\u0010@J!\u0010[\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\b[\u0010@J#\u0010\\\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\\\u00102J!\u0010]\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020\u0015H\u0016¢\u0006\u0004\b]\u0010&J#\u0010^\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b^\u00102J#\u0010_\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b_\u0010;J!\u0010`\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\b`\u0010@J#\u0010a\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\ba\u0010;J!\u0010b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bb\u0010@J#\u0010c\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bc\u00102J#\u0010d\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bd\u00102J#\u0010f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bf\u0010gJ#\u0010h\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bh\u0010gJ#\u0010i\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bi\u00102J\u0017\u0010k\u001a\u00020\u00172\u0006\u0010j\u001a\u00020\u0006H\u0002¢\u0006\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/LayoutShadowNode;", "parent", "Landroid/view/View;", "child", "", FirebaseAnalytics.Param.INDEX, "", "addView", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;)I", "getChildAt", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "title", "setTitle", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", ViewProps.COLOR, "setColor", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "value", "setSynchronousShadowStateUpdatesEnabled", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "Lcom/facebook/react/bridge/ReadableArray;", "setHeaderLeftBarButtonItems", "(Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;Lcom/facebook/react/bridge/ReadableArray;)V", "setHeaderRightBarButtonItems", "setUserInterfaceStyle", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<ScreenStackHeaderConfig> implements RNSScreenStackHeaderConfigManagerInterface<ScreenStackHeaderConfig> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

    @NotNull
    private final ViewManagerDelegate<ScreenStackHeaderConfig> delegate;

    public ScreenStackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackHeaderConfigManagerDelegate(this);
    }

    private final void logNotAvailable(String propName) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ScreenStackHeaderConfig> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return G.e(new Pair("topAttached", G.e(new Pair("registrationName", "onAttached"))), new Pair("topDetached", G.e(new Pair("registrationName", "onDetached"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(@Nullable ScreenStackHeaderConfig config, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return new E();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ScreenStackHeaderConfig createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStackHeaderConfig(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.onAfterUpdateTransaction(parent);
        parent.d();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull @NotNull ScreenStackHeaderConfig view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.f25358M = true;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.f25361g.clear();
        parent.b();
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackButtonDisplayMode(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(@NotNull ScreenStackHeaderConfig config, boolean backButtonInCustomView) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitle(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("backTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontFamily(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontSize(@Nullable ScreenStackHeaderConfig view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleVisible(@Nullable ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NotNull ScreenStackHeaderConfig config, @Nullable Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBlurEffect(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("blurEffect");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(@NotNull ScreenStackHeaderConfig config, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "direction")
    public void setDirection(@NotNull ScreenStackHeaderConfig config, @Nullable String direction) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setDirection(direction);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDisableBackButtonMenu(@Nullable ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderLeftBarButtonItems(@Nullable ScreenStackHeaderConfig view, @Nullable ReadableArray value) {
        logNotAvailable("headerLeftBarButtonItems");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderRightBarButtonItems(@Nullable ScreenStackHeaderConfig view, @Nullable ReadableArray value) {
        logNotAvailable("headerRightBarButtonItems");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = ViewProps.HIDDEN)
    public void setHidden(@NotNull ScreenStackHeaderConfig config, boolean hidden) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHidden(hidden);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideBackButton")
    public void setHideBackButton(@NotNull ScreenStackHeaderConfig config, boolean hideBackButton) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideShadow")
    public void setHideShadow(@NotNull ScreenStackHeaderConfig config, boolean hideShadow) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitle(@Nullable ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleBackgroundColor(@Nullable ScreenStackHeaderConfig view, @Nullable Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleColor(@Nullable ScreenStackHeaderConfig view, @Nullable Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontFamily(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontSize(@Nullable ScreenStackHeaderConfig view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontWeight(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleHideShadow(@Nullable ScreenStackHeaderConfig view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "title")
    public void setTitle(@NotNull ScreenStackHeaderConfig config, @Nullable String title) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitle(title);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = "titleColor")
    public void setTitleColor(@NotNull ScreenStackHeaderConfig config, @Nullable Integer titleColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontFamily")
    public void setTitleFontFamily(@NotNull ScreenStackHeaderConfig config, @Nullable String titleFontFamily) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontSize")
    public void setTitleFontSize(@NotNull ScreenStackHeaderConfig config, int titleFontSize) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontWeight")
    public void setTitleFontWeight(@NotNull ScreenStackHeaderConfig config, @Nullable String titleFontWeight) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "topInsetEnabled")
    public void setTopInsetEnabled(@NotNull ScreenStackHeaderConfig config, boolean topInsetEnabled) {
        Intrinsics.checkNotNullParameter(config, "config");
        logNotAvailable("topInsetEnabled");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "translucent")
    public void setTranslucent(@NotNull ScreenStackHeaderConfig config, boolean translucent) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setUserInterfaceStyle(@Nullable ScreenStackHeaderConfig view, @Nullable String value) {
        logNotAvailable("userInterfaceStyle");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ScreenStackHeaderConfig view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull ScreenStackHeaderConfig parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof ScreenStackHeaderSubview) {
            ScreenStackHeaderSubview child2 = (ScreenStackHeaderSubview) child;
            parent.getClass();
            Intrinsics.checkNotNullParameter(child2, "child");
            parent.f25361g.add(index, child2);
            parent.b();
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull ScreenStackHeaderConfig parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object obj = parent.f25361g.get(index);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (ScreenStackHeaderSubview) obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull ScreenStackHeaderConfig parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull ScreenStackHeaderConfig parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.f25361g.remove(index);
        parent.b();
    }
}
