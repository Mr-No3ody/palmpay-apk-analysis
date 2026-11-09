package com.facebook.react.views.swiperefresh;

import U8.a;
import android.content.Context;
import com.BV.LinearGradient.LinearGradientManager;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerDelegate;
import com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = SwipeRefreshLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0011\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u001a\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0011H\u0017J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0017J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0%H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0%H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;", "Lcom/facebook/react/viewmanagers/AndroidSwipeRefreshLayoutManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setEnabled", "", "view", ViewProps.ENABLED, "", "setColors", LinearGradientManager.PROP_COLORS, "Lcom/facebook/react/bridge/ReadableArray;", "setProgressBackgroundColor", ViewProps.COLOR, "", "(Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;Ljava/lang/Integer;)V", "setSize", "value", "size", "Lcom/facebook/react/bridge/Dynamic;", "setRefreshing", "refreshing", "setProgressViewOffset", "offset", "", "setNativeRefreshing", "addEventEmitters", "getExportedViewConstants", "", "", "getExportedCustomDirectEventTypeConstants", "getDelegate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SwipeRefreshLayoutManager extends ViewGroupManager<ReactSwipeRefreshLayout> implements AndroidSwipeRefreshLayoutManagerInterface<ReactSwipeRefreshLayout> {

    @NotNull
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    @NotNull
    private final ViewManagerDelegate<ReactSwipeRefreshLayout> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeRefreshLayoutManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.delegate = new AndroidSwipeRefreshLayoutManagerDelegate(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(ThemedReactContext themedReactContext, ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, reactSwipeRefreshLayout.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new RefreshEvent(UIManagerHelper.getSurfaceId(reactSwipeRefreshLayout), reactSwipeRefreshLayout.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactSwipeRefreshLayout> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(G.h(new Pair("topRefresh", G.h(new Pair("registrationName", "onRefresh")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return G.h(new Pair("SIZE", G.h(new Pair("DEFAULT", 1), new Pair("LARGE", 0))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactSwipeRefreshLayout view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnRefreshListener(new a(23, reactContext, view));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactSwipeRefreshLayout createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ReactSwipeRefreshLayout(reactContext);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    @ReactProp(customType = "ColorArray", name = LinearGradientManager.PROP_COLORS)
    public void setColors(@NotNull ReactSwipeRefreshLayout view, @Nullable ReadableArray colors) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (colors == null) {
            view.setColorSchemeColors(new int[0]);
            return;
        }
        int size = colors.size();
        int[] iArr = new int[size];
        int size2 = colors.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (colors.getType(i7) == ReadableType.Map) {
                ReadableMap map = colors.getMap(i7);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iArr[i7] = ColorPropConverter.getColor(map, context, 0);
            } else {
                iArr[i7] = colors.getInt(i7);
            }
        }
        view.setColorSchemeColors(Arrays.copyOf(iArr, size));
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    @ReactProp(defaultBoolean = true, name = ViewProps.ENABLED)
    public void setEnabled(@NotNull ReactSwipeRefreshLayout view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    public void setNativeRefreshing(@NotNull ReactSwipeRefreshLayout view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        setRefreshing(view, value);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    @ReactProp(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(@NotNull ReactSwipeRefreshLayout view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressBackgroundColorSchemeColor(color != null ? color.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(@NotNull ReactSwipeRefreshLayout view, float offset) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressViewOffset(offset);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    @ReactProp(name = "refreshing")
    public void setRefreshing(@NotNull ReactSwipeRefreshLayout view, boolean refreshing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRefreshing(refreshing);
    }

    public final void setSize(@NotNull ReactSwipeRefreshLayout view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSize(value);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwipeRefreshLayoutManagerInterface
    public void setSize(@NotNull ReactSwipeRefreshLayout view, @Nullable String size) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (size != null && !size.equals(GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT)) {
            if (size.equals(Constants.LARGE)) {
                view.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: ".concat(size));
        }
        view.setSize(1);
    }

    @ReactProp(name = "size")
    public final void setSize(@NotNull ReactSwipeRefreshLayout view, @NotNull Dynamic size) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(size, "size");
        if (size.isNull()) {
            view.setSize(1);
        } else if (size.getType() == ReadableType.Number) {
            view.setSize(size.asInt());
        } else {
            if (size.getType() != ReadableType.String) {
                throw new IllegalArgumentException("Size must be 'default' or 'large'");
            }
            setSize(view, size.asString());
        }
    }
}
