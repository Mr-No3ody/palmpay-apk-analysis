package com.swmansion.rnscreens.gamma.tabs;

import V7.c;
import W7.b;
import W7.d;
import W7.f;
import W7.h;
import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.e;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002a.a;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = TabScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010!J#\u0010&\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010$J#\u0010'\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010!J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010!J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b,\u0010!J!\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010!J\u001f\u0010.\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010*J!\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b/\u0010$J\u001f\u00100\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b0\u0010*J#\u00101\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010!J#\u00102\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010!J#\u00103\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010!J#\u00104\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u0010!J!\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010!J!\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b6\u0010!J!\u00107\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b7\u0010\u001fJ!\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u0010!J!\u00109\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010!J!\u0010:\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010!J!\u0010;\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b;\u0010!J!\u0010<\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b<\u0010$R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;", "Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "setStandardAppearance", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/Dynamic;)V", "setScrollEdgeAppearance", "", "setTabBarItemBadgeBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V", "setIconType", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setIconImageSource", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V", "setIconResourceName", "setSelectedIconImageSource", "setSelectedIconResourceName", "", "setIsFocused", "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V", "setTabKey", "setBadgeValue", "setTitle", "setIsTitleUndefined", "setSpecialEffects", "setOverrideScrollViewContentInsetAdjustmentBehavior", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setTabBarItemTestID", "setTabBarItemAccessibilityLabel", "setTabBarItemBadgeTextColor", "setDrawableIconResourceName", "setOrientation", "setSystemItem", "setUserInterfaceStyle", "setImageIconResource", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "setContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabScreenViewManager extends ViewGroupManager<TabScreen> implements RNSBottomTabsScreenManagerInterface<TabScreen> {

    @NotNull
    public static final String REACT_CLASS = "RNSBottomTabsScreen";

    @Nullable
    private ThemedReactContext context;

    @NotNull
    private final ViewManagerDelegate<TabScreen> delegate;

    public TabScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSBottomTabsScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public TabScreen createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(REACT_CLASS, "tag");
        Intrinsics.checkNotNullParameter("createViewInstance", "message");
        return new TabScreen(reactContext);
    }

    @Nullable
    public final ThemedReactContext getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<TabScreen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return G.h(a.s(f.f10566a), a.s(b.f10564a), a.s(h.f10567a), a.s(d.f10565a));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setBottomScrollEdgeEffect(@Nullable TabScreen view, @Nullable String value) {
    }

    public final void setContext(@Nullable ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setIconImageSource(@Nullable TabScreen view, @Nullable ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setIconResourceName(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setIconType(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setIsTitleUndefined(@NotNull TabScreen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setLeftScrollEdgeEffect(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setOrientation(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setOverrideScrollViewContentInsetAdjustmentBehavior(@NotNull TabScreen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setRightScrollEdgeEffect(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setScrollEdgeAppearance(@NotNull TabScreen view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setSelectedIconImageSource(@Nullable TabScreen view, @Nullable ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setSelectedIconResourceName(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setStandardAppearance(@NotNull TabScreen view, @NotNull Dynamic value) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setSystemItem(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setTopScrollEdgeEffect(@Nullable TabScreen view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    public void setUserInterfaceStyle(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull TabScreen view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabScreen must have its tag set when registering event emitters");
        }
        int id2 = view.getId();
        ThemedReactContext reactContext2 = view.reactContext;
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        view.setEventEmitter$react_native_screens_release(new c(reactContext2, id2));
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "badgeValue")
    public void setBadgeValue(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBadgeValue(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "drawableIconResourceName")
    public void setDrawableIconResourceName(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "imageIconResource")
    public void setImageIconResource(@NotNull TabScreen view, @Nullable ReadableMap value) {
        Uri uriF;
        String scheme;
        Intrinsics.checkNotNullParameter(view, "view");
        String uri = value != null ? value.getString("uri") : null;
        if (uri != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                uriF = Uri.parse(uri);
                if (uriF.getScheme() == null) {
                    uriF = l.f(context, uri);
                }
            } catch (Exception unused) {
                uriF = l.f(context, uri);
            }
            boolean zM = false;
            if (uriF != null && (scheme = uriF.getScheme()) != null) {
                zM = y.m(scheme, "res", false);
            }
            if (zM) {
                Intrinsics.e(uriF);
                String string = uriF.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                uriF = Uri.parse(y.k(string, "res:/", "android.resource://" + context.getPackageName() + "/"));
            }
            if (uriF == null) {
                return;
            }
            p118hf.a.w().a(e.d(uriF).a(), context).subscribe(new X7.b(context, new V7.e(view, 1), uriF), p180m2.a.f39461a);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "isFocused")
    public void setIsFocused(@NotNull TabScreen view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String message = "TabScreen [" + view.getId() + "] setIsFocused " + value;
        Intrinsics.checkNotNullParameter(REACT_CLASS, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        view.setFocusedTab(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "specialEffects")
    public void setSpecialEffects(@NotNull TabScreen view, @Nullable ReadableMap value) {
        boolean z3;
        ReadableMap map;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z8 = true;
        if (!(value != null ? value.hasKey("repeatedTabSelection") : false) || (map = value.getMap("repeatedTabSelection")) == null) {
            z3 = true;
        } else {
            z3 = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
            if (map.hasKey("popToRoot")) {
                z8 = map.getBoolean("popToRoot");
            }
        }
        view.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z8);
        view.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "tabBarItemAccessibilityLabel")
    public void setTabBarItemAccessibilityLabel(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemAccessibilityLabel(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemBadgeBackgroundColor")
    public void setTabBarItemBadgeBackgroundColor(@NotNull TabScreen view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemBadgeBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemBadgeTextColor")
    public void setTabBarItemBadgeTextColor(@NotNull TabScreen view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemBadgeTextColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "tabBarItemTestID")
    public void setTabBarItemTestID(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTestID(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "tabKey")
    public void setTabKey(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabKey(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface
    @ReactProp(name = "title")
    public void setTitle(@NotNull TabScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabTitle(value);
    }
}
