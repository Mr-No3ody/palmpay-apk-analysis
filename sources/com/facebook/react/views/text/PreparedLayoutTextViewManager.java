package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.facebook.react.R;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ReferenceStateWrapper;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001FB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020!H\u0007J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J \u0010(\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0007J\u001a\u0010,\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0007J \u0010.\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&2\u0006\u0010/\u001a\u00020+H\u0007J'\u00100\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u00101J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u00103\u001a\u00020!H\u0007J0\u00104\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&H\u0016J\u0010\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030:H\u0016J \u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010)\u001a\u00020&H\u0016J\u001a\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&H\u0016J\u0018\u0010@\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00022\u0006\u0010)\u001a\u00020&H\u0016J\u0010\u0010A\u001a\u00020&2\u0006\u0010<\u001a\u00020\u0002H\u0016J\b\u0010B\u001a\u00020!H\u0016J\u0010\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020EH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/IViewGroupManager;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "prepareToRecycleView", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "getName", "", "updateViewAccessibility", "", "createViewInstance", "context", "updateExtraData", "extraData", "", "updateState", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getExportedCustomDirectEventTypeConstants", "", "setOverflow", ViewProps.OVERFLOW, "setAccessible", "accessible", "", "setSelectable", "isSelectable", "setSelectionColor", ViewProps.COLOR, "", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V", "setBorderRadius", FirebaseAnalytics.Param.INDEX, ViewProps.BORDER_RADIUS, "", "setBorderStyle", "borderStyle", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V", "setDisabled", "disabled", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "getShadowNodeClass", "Ljava/lang/Class;", "addView", "parent", "child", "Landroid/view/View;", "getChildAt", "removeViewAt", "getChildCount", "needsCustomLayoutForChildren", "onPostProcessSpannable", ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/Spannable;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = "RCTText")
@SourceDebugExtension({"SMAP\nPreparedLayoutTextViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreparedLayoutTextViewManager.kt\ncom/facebook/react/views/text/PreparedLayoutTextViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class PreparedLayoutTextViewManager extends BaseViewManager<PreparedLayoutTextView, LayoutShadowNode> implements IViewGroupManager<PreparedLayoutTextView>, ReactTextViewManagerCallback {

    @NotNull
    public static final String REACT_CLASS = "RCTText";

    @Nullable
    private final ReactTextViewManagerCallback reactTextViewManagerCallback;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PreparedLayoutTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topTextLayout", F.b(new Pair("registrationName", "onTextLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    @Override // com.facebook.react.views.text.ReactTextViewManagerCallback
    public void onPostProcessSpannable(@NotNull Spannable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.reactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(text);
        }
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(@NotNull PreparedLayoutTextView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR, ViewProps.BORDER_START_COLOR, ViewProps.BORDER_END_COLOR, ViewProps.BORDER_BLOCK_COLOR, ViewProps.BORDER_BLOCK_END_COLOR, ViewProps.BORDER_BLOCK_START_COLOR})
    public final void setBorderColor(@NotNull PreparedLayoutTextView view, int index, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.values()[index], color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(@NotNull PreparedLayoutTextView view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(@NotNull PreparedLayoutTextView view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public final void setBorderWidth(@NotNull PreparedLayoutTextView view, int index, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public final void setDisabled(@NotNull PreparedLayoutTextView view, boolean disabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(!disabled);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull PreparedLayoutTextView view, @Nullable String overflow) {
        Overflow overflowFromString;
        Intrinsics.checkNotNullParameter(view, "view");
        if (overflow == null || (overflowFromString = Overflow.INSTANCE.fromString(overflow)) == null) {
            overflowFromString = Overflow.HIDDEN;
        }
        view.setOverflow(overflowFromString);
    }

    @ReactProp(defaultBoolean = false, name = "selectable")
    public final void setSelectable(@NotNull PreparedLayoutTextView view, boolean isSelectable) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(@NotNull PreparedLayoutTextView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setSelectionColor(color);
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setSelectionColor(Integer.valueOf(DefaultStyleValuesUtil.getDefaultTextColorHighlight(context)));
    }

    public /* synthetic */ PreparedLayoutTextViewManager(ReactTextViewManagerCallback reactTextViewManagerCallback, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(@NotNull PreparedLayoutTextView parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public PreparedLayoutTextView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PreparedLayoutTextView(context);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    @Nullable
    public View getChildAt(@NotNull PreparedLayoutTextView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(@NotNull PreparedLayoutTextView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public PreparedLayoutTextView prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull PreparedLayoutTextView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        PreparedLayoutTextView preparedLayoutTextView = (PreparedLayoutTextView) super.prepareToRecycleView(reactContext, view);
        if (preparedLayoutTextView != null) {
            preparedLayoutTextView.recycleView();
        }
        return preparedLayoutTextView;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(@NotNull PreparedLayoutTextView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull PreparedLayoutTextView view, int left, int top2, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(left, top2, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull PreparedLayoutTextView view, @NotNull Object extraData) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        SystraceSection systraceSection = new SystraceSection("PreparedLayoutTextViewManager.updateExtraData");
        try {
            PreparedLayout preparedLayout = (PreparedLayout) extraData;
            view.setPreparedLayout(preparedLayout);
            if (preparedLayout.getLayout().getText() instanceof Spanned) {
                CharSequence text = preparedLayout.getLayout().getText();
                Intrinsics.f(text, "null cannot be cast to non-null type android.text.Spanned");
                ReactTextViewAccessibilityDelegate.AccessibilityLinks accessibilityLinks = new ReactTextViewAccessibilityDelegate.AccessibilityLinks((Spanned) text);
                int i7 = R.id.accessibility_links;
                if (accessibilityLinks.size() <= 0) {
                    accessibilityLinks = null;
                }
                view.setTag(i7, accessibilityLinks);
                ReactTextViewAccessibilityDelegate.INSTANCE.resetDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
            }
            Unit unit = Unit.f38893a;
            systraceSection.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    systraceSection.close();
                } catch (Throwable th3) {
                    C2126e.a(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull PreparedLayoutTextView view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        ReferenceStateWrapper referenceStateWrapper = stateWrapper instanceof ReferenceStateWrapper ? (ReferenceStateWrapper) stateWrapper : null;
        if (referenceStateWrapper != null) {
            return referenceStateWrapper.getStateDataReference();
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(@NotNull PreparedLayoutTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactTextViewAccessibilityDelegate.INSTANCE.setDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
    }

    @JvmOverloads
    public PreparedLayoutTextViewManager(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
        setupViewRecycling();
    }
}
