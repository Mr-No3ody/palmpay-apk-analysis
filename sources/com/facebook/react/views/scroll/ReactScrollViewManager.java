package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.E;
import androidx.core.view.N;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\\B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0007J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0011H\u0007J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0011H\u0007J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0011H\u0007J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0011H\u0007J\u001a\u0010'\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0011H\u0007J\u0018\u0010+\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-H\u0007J\u001a\u0010.\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010/\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020-\u0018\u000101H\u0016J\"\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u00010\u001cH\u0017J\"\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u00106\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00022\u0006\u00108\u001a\u000209H\u0016J\"\u0010:\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\u0015H\u0007J\u001c\u0010=\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\tH\u0007J\"\u0010?\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020-2\u0006\u0010@\u001a\u00020\u0015H\u0007J)\u0010A\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0002\u0010BJ\u001a\u0010C\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010E\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00022\u0006\u00108\u001a\u00020FH\u0016J\u0018\u0010G\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010H\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020IH\u0007J\u001a\u0010J\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010KH\u0007J\u001a\u0010L\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010KH\u0007J\"\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016J\u0016\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N\u0018\u000101H\u0016J\u001a\u0010T\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010U\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010V\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010W\u001a\u00020-H\u0007J\u001a\u0010X\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010Y\u001a\u00020\u0011H\u0007J\u0018\u0010Z\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0011H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/ReactScrollView;", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollCommandHandler;", "fpsListener", "Lcom/facebook/react/views/scroll/FpsListener;", "<init>", "(Lcom/facebook/react/views/scroll/FpsListener;)V", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setScrollEnabled", "", "view", "value", "", "setShowsVerticalScrollIndicator", "setDecelerationRate", "decelerationRate", "", "setDisableIntervalMomentum", "disableIntervalMomentum", "setSnapToInterval", "snapToInterval", "setSnapToOffsets", "snapToOffsets", "Lcom/facebook/react/bridge/ReadableArray;", "setSnapToAlignment", "alignment", "setSnapToStart", "snapToStart", "setSnapToEnd", "snapToEnd", "setRemoveClippedSubviews", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "setSendMomentumEvents", "sendMomentumEvents", "setScrollPerfTag", "scrollPerfTag", "setPagingEnabled", "pagingEnabled", "setBottomFillColor", ViewProps.COLOR, "", "setOverScrollMode", "setNestedScrollEnabled", "getCommandsMap", "", "receiveCommand", "scrollView", "commandId", "args", "flashScrollIndicators", "scrollTo", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToCommandData;", "setBorderRadius", FirebaseAnalytics.Param.INDEX, ViewProps.BORDER_RADIUS, "setBorderStyle", "borderStyle", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/scroll/ReactScrollView;ILjava/lang/Integer;)V", "setOverflow", ViewProps.OVERFLOW, "scrollToEnd", "Lcom/facebook/react/views/scroll/ReactScrollViewCommandHelper$ScrollToEndCommandData;", "setPersistentScrollbar", "setFadingEdgeLength", "Lcom/facebook/react/bridge/Dynamic;", "setContentOffset", "Lcom/facebook/react/bridge/ReadableMap;", "setMaintainVisibleContentPosition", "updateState", "", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getExportedCustomDirectEventTypeConstants", "setPointerEvents", "pointerEventsStr", "setScrollEventThrottle", "scrollEventThrottle", "setHorizontal", "horizontal", "setIsInvertedVirtualizedList", "applyFix", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactScrollView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String REACT_CLASS = "RCTScrollView";

    @Nullable
    private final FpsListener fpsListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager$Companion;", "", "<init>", "()V", "REACT_CLASS", "", "createExportedCustomDirectEventTypeConstants", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<String, Object> createExportedCustomDirectEventTypeConstants() {
            ScrollEventType.Companion companion = ScrollEventType.INSTANCE;
            return G.g(new Pair(companion.getJSEventName(ScrollEventType.SCROLL), d.q("registrationName", "onScroll")), new Pair(companion.getJSEventName(ScrollEventType.BEGIN_DRAG), d.q("registrationName", "onScrollBeginDrag")), new Pair(companion.getJSEventName(ScrollEventType.END_DRAG), d.q("registrationName", "onScrollEndDrag")), new Pair(companion.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), d.q("registrationName", "onMomentumScrollBegin")), new Pair(companion.getJSEventName(ScrollEventType.MOMENTUM_END), d.q("registrationName", "onMomentumScrollEnd")));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ReactScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return ReactScrollViewCommandHelper.INSTANCE.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(INSTANCE.createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(@Nullable ReactScrollView view, int index, @Nullable Integer color) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(@Nullable ReactScrollView view, int index, float borderRadius) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
        }
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(@Nullable ReactScrollView view, @Nullable String borderStyle) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(@Nullable ReactScrollView view, int index, float width) {
        if (view != null) {
            BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.getEntries().get(index), Float.valueOf(width));
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(@NotNull ReactScrollView view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEndFillColor(color);
    }

    @ReactProp(customType = "Point", name = "contentOffset")
    public final void setContentOffset(@NotNull ReactScrollView view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setContentOffset(value);
    }

    @ReactProp(name = "decelerationRate")
    public final void setDecelerationRate(@NotNull ReactScrollView view, float decelerationRate) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDecelerationRate(decelerationRate);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(@NotNull ReactScrollView view, boolean disableIntervalMomentum) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @ReactProp(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(@NotNull ReactScrollView view, @NotNull Dynamic value) {
        ReadableMap readableMapAsMap;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        int i7 = WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()];
        if (i7 == 1) {
            view.setFadingEdgeLengthStart(value.asInt());
            view.setFadingEdgeLengthEnd(value.asInt());
        } else if (i7 == 2 && (readableMapAsMap = value.asMap()) != null) {
            int i10 = (!readableMapAsMap.hasKey(ViewProps.START) || readableMapAsMap.getInt(ViewProps.START) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.START);
            int i11 = (!readableMapAsMap.hasKey(ViewProps.END) || readableMapAsMap.getInt(ViewProps.END) <= 0) ? 0 : readableMapAsMap.getInt(ViewProps.END);
            view.setFadingEdgeLengthStart(i10);
            view.setFadingEdgeLengthEnd(i11);
        }
        if (view.getFadingEdgeLengthStart() > 0 || view.getFadingEdgeLengthEnd() > 0) {
            view.setVerticalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(PixelUtil.INSTANCE.dpToPx(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setVerticalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = "horizontal")
    public final void setHorizontal(@Nullable ReactScrollView view, boolean horizontal) {
    }

    @ReactProp(name = "isInvertedVirtualizedList")
    public final void setIsInvertedVirtualizedList(@NotNull ReactScrollView view, boolean applyFix) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (applyFix) {
            view.setVerticalScrollbarPosition(1);
        } else {
            view.setVerticalScrollbarPosition(0);
        }
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(@NotNull ReactScrollView view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.INSTANCE.fromReadableMap(value));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(@Nullable ReactScrollView view, boolean value) {
        if (view != null) {
            WeakHashMap weakHashMap = N.f16168a;
            E.m(view, value);
        }
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(@NotNull ReactScrollView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(value));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull ReactScrollView view, @Nullable String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = "pagingEnabled")
    public final void setPagingEnabled(@NotNull ReactScrollView view, boolean pagingEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPagingEnabled(pagingEnabled);
    }

    @ReactProp(name = "persistentScrollbar")
    public final void setPersistentScrollbar(@NotNull ReactScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollbarFadingEnabled(!value);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public final void setPointerEvents(@NotNull ReactScrollView view, @Nullable String pointerEventsStr) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPointerEvents(PointerEvents.INSTANCE.parsePointerEvents(pointerEventsStr));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public final void setRemoveClippedSubviews(@NotNull ReactScrollView view, boolean removeClippedSubviews) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(@NotNull ReactScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollEnabled(value);
        view.setFocusable(value);
    }

    @ReactProp(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(@NotNull ReactScrollView view, int scrollEventThrottle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @ReactProp(name = "scrollPerfTag")
    public final void setScrollPerfTag(@NotNull ReactScrollView view, @Nullable String scrollPerfTag) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollPerfTag(scrollPerfTag);
    }

    @ReactProp(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(@NotNull ReactScrollView view, boolean sendMomentumEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @ReactProp(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public final void setShowsVerticalScrollIndicator(@NotNull ReactScrollView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVerticalScrollBarEnabled(value);
    }

    @ReactProp(name = "snapToAlignment")
    public final void setSnapToAlignment(@NotNull ReactScrollView view, @Nullable String alignment) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(alignment));
    }

    @ReactProp(name = "snapToEnd")
    public final void setSnapToEnd(@NotNull ReactScrollView view, boolean snapToEnd) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToEnd(snapToEnd);
    }

    @ReactProp(name = "snapToInterval")
    public final void setSnapToInterval(@NotNull ReactScrollView view, float snapToInterval) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapInterval((int) (PixelUtil.getDisplayMetricDensity() * snapToInterval));
    }

    @ReactProp(name = "snapToOffsets")
    public final void setSnapToOffsets(@NotNull ReactScrollView view, @Nullable ReadableArray snapToOffsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (snapToOffsets == null || snapToOffsets.size() == 0) {
            view.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        int size = snapToOffsets.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(Integer.valueOf((int) (snapToOffsets.getDouble(i7) * ((double) displayMetricDensity))));
        }
        view.setSnapOffsets(arrayList);
    }

    @ReactProp(name = "snapToStart")
    public final void setSnapToStart(@NotNull ReactScrollView view, boolean snapToStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSnapToStart(snapToStart);
    }

    public /* synthetic */ ReactScrollViewManager(FpsListener fpsListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fpsListener);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactScrollView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactScrollView(context, this.fpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(@NotNull ReactScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        scrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(@NotNull ReactScrollView scrollView, @NotNull ReactScrollViewCommandHelper.ScrollToCommandData data) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(data, "data");
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(data.mDestX, data.mDestY);
        } else {
            scrollView.scrollTo(data.mDestX, data.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(@NotNull ReactScrollView scrollView, @NotNull ReactScrollViewCommandHelper.ScrollToEndCommandData data) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(data, "data");
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int paddingBottom = scrollView.getPaddingBottom() + childAt.getHeight();
        scrollView.abortAnimation();
        if (data.mAnimated) {
            scrollView.reactSmoothScrollTo(scrollView.getScrollX(), paddingBottom);
        } else {
            scrollView.scrollTo(scrollView.getScrollX(), paddingBottom);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ReactScrollView view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }

    @JvmOverloads
    public ReactScrollViewManager(@Nullable FpsListener fpsListener) {
        super(null, 1, null);
        this.fpsListener = fpsListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Deprecated(message = "ReceiveCommand with an int commandId param is deprecated. Use the overload where commandId is a string.", replaceWith = @ReplaceWith(expression = "receiveCommand(scrollView, commandId, args)", imports = {}))
    public void receiveCommand(@NotNull ReactScrollView scrollView, int commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ReactScrollView scrollView, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        ReactScrollViewCommandHelper.INSTANCE.receiveCommand(this, scrollView, commandId, args);
    }
}
