package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.E;
import androidx.core.view.N;
import com.facebook.react.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];

    public class BaseVMFocusChangeListener<V extends View> implements View.OnFocusChangeListener {

        @Nullable
        private View.OnFocusChangeListener mOriginalFocusChangeListener;

        public BaseVMFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
            this.mOriginalFocusChangeListener = onFocusChangeListener;
        }

        public void attach(T t) {
            t.setOnFocusChangeListener(this);
        }

        public void detach(T t) {
            t.setOnFocusChangeListener(this.mOriginalFocusChangeListener);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            EventDispatcher eventDispatcherForReactTag;
            View.OnFocusChangeListener onFocusChangeListener = this.mOriginalFocusChangeListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z3);
            }
            int surfaceId = UIManagerHelper.getSurfaceId(view.getContext());
            if (surfaceId == -1 || !(view.getContext() instanceof ThemedReactContext) || (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ThemedReactContext) view.getContext(), view.getId())) == null) {
                return;
            }
            if (z3) {
                eventDispatcherForReactTag.dispatchEvent(new FocusEvent(surfaceId, view.getId()));
            } else {
                eventDispatcherForReactTag.dispatchEvent(new BlurEvent(surfaceId, view.getId()));
            }
        }
    }

    public static class LayerEffectsHelper {
        private LayerEffectsHelper() {
        }

        public static void apply(@NonNull View view, @Nullable ReadableArray readableArray, @Nullable Boolean bool) {
            Paint paint;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (FilterHelper.isOnlyColorMatrixFilters(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(FilterHelper.parseColorMatrixFilters(readableArray));
            } else {
                if (i7 >= 31) {
                    view.setRenderEffect(FilterHelper.parseFilters(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        p229p2.a.x("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(@NonNull View view, PointerEventHelper.EVENT event, boolean z3) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << event.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z3 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(@NonNull T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey(ReactTextInputShadowNode.PROP_TEXT) && (dynamic = readableMap2.getDynamic(ReactTextInputShadowNode.PROP_TEXT)) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
        super.addEventEmitters(themedReactContext, t);
        new BaseVMFocusChangeListener(t.getOnFocusChangeListener()).attach(t);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        MapBuilder.Builder builderPut = MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(builderPut.put(PointerEventHelper.POINTER_ENTER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_ENTER, "captured", ViewProps.ON_POINTER_ENTER_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_LEAVE, "captured", ViewProps.ON_POINTER_LEAVE_CAPTURE, "skipBubbling", bool))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_MOVE, "captured", ViewProps.ON_POINTER_MOVE_CAPTURE))).put(PointerEventHelper.POINTER_UP, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OUT, "captured", ViewProps.ON_POINTER_OUT_CAPTURE))).put(PointerEventHelper.POINTER_OVER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_POINTER_OVER, "captured", ViewProps.ON_POINTER_OVER_CAPTURE))).put(PointerEventHelper.CLICK, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", ViewProps.ON_CLICK, "captured", ViewProps.ON_CLICK_CAPTURE))).put(BlurEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onBlur", "captured", "onBlurCapture"))).put(FocusEvent.EVENT_NAME, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onFocus", "captured", "onFocusCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
        Boolean bool = (Boolean) t.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t.addOnLayoutChangeListener(this);
            setTransformProperty(t, (ReadableArray) t.getTag(R.id.transform), (ReadableArray) t.getTag(R.id.transform_origin));
            t.setTag(R.id.invalidate_transform, Boolean.FALSE);
        }
        LayerEffectsHelper.apply(t, (ReadableArray) t.getTag(R.id.filter), (Boolean) t.getTag(R.id.use_hardware_layer));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull T t) {
        super.onDropViewInstance(t);
        View.OnFocusChangeListener onFocusChangeListener = t.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof BaseVMFocusChangeListener) {
            ((BaseVMFocusChangeListener) onFocusChangeListener).detach(t);
        }
        if (t instanceof ViewGroup) {
            ((ViewGroup) t).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i15 - i13;
        int i18 = i11 - i7;
        if (i12 - i10 == i16 - i14 && i18 == i17) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, T t) {
        t.setTag(null);
        t.setTag(R.id.pointer_events, null);
        t.setTag(R.id.react_test_id, null);
        t.setTag(R.id.view_tag_native_id, null);
        t.setTag(R.id.labelled_by, null);
        t.setTag(R.id.accessibility_label, null);
        t.setTag(R.id.accessibility_hint, null);
        t.setTag(R.id.accessibility_role, null);
        t.setTag(R.id.accessibility_state, null);
        t.setTag(R.id.accessibility_actions, null);
        t.setTag(R.id.accessibility_value, null);
        t.setTag(R.id.accessibility_state_expanded, null);
        t.setTag(R.id.view_clipped, null);
        setTransformProperty(t, null, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 28) {
            return null;
        }
        t.resetPivot();
        t.setTop(0);
        t.setBottom(0);
        t.setLeft(0);
        t.setRight(0);
        t.setElevation(0.0f);
        if (i7 >= 29) {
            t.setAnimationMatrix(null);
        }
        t.setTag(R.id.transform, null);
        t.setTag(R.id.transform_origin, null);
        t.setTag(R.id.invalidate_transform, null);
        t.removeOnLayoutChangeListener(this);
        t.setTag(R.id.use_hardware_layer, null);
        t.setTag(R.id.filter, null);
        t.setTag(R.id.mix_blend_mode, null);
        LayerEffectsHelper.apply(t, null, null);
        if (i7 >= 28) {
            t.setOutlineAmbientShadowColor(-16777216);
            t.setOutlineSpotShadowColor(-16777216);
        }
        t.setNextFocusDownId(-1);
        t.setNextFocusForwardId(-1);
        t.setNextFocusRightId(-1);
        t.setNextFocusUpId(-1);
        t.setFocusable(false);
        t.setFocusableInTouchMode(false);
        t.setElevation(0.0f);
        t.setAlpha(1.0f);
        setPadding(t, 0, 0, 0, 0);
        t.setForeground(null);
        return t;
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ACTIONS)
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(R.id.accessibility_actions, readableArray);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION)
    public void setAccessibilityCollection(@NonNull T t, @Nullable ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION_ITEM)
    public void setAccessibilityCollectionItem(@NonNull T t, @Nullable ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_HINT)
    public void setAccessibilityHint(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABELLED_BY)
    public void setAccessibilityLabelledBy(@NonNull T t, @Nullable Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(@NonNull T t, @Nullable String str) {
        if (str == null || str.equals(ViewProps.NONE)) {
            WeakHashMap weakHashMap = N.f16168a;
            t.setAccessibilityLiveRegion(0);
        } else if (str.equals("polite")) {
            WeakHashMap weakHashMap2 = N.f16168a;
            t.setAccessibilityLiveRegion(1);
        } else if (str.equals("assertive")) {
            WeakHashMap weakHashMap3 = N.f16168a;
            t.setAccessibilityLiveRegion(2);
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@NonNull T t, @Nullable String str) {
        if (str == null) {
            t.setTag(R.id.accessibility_role, null);
        } else {
            t.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_VALUE)
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            t.setTag(R.id.accessibility_value, null);
            t.setContentDescription(null);
        } else {
            t.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey(ReactTextInputShadowNode.PROP_TEXT)) {
                updateViewContentDescription(t);
            }
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@NonNull T t, @ColorInt int i7) {
        BackgroundStyleApplicator.setBackgroundColor(t, Integer.valueOf(i7));
    }

    public void setBorderBottomLeftRadius(T t, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_LEFT_RADIUS);
    }

    public void setBorderBottomRightRadius(T t, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    public void setBorderRadius(T t, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_RADIUS);
    }

    public void setBorderTopLeftRadius(T t, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_LEFT_RADIUS);
    }

    public void setBorderTopRightRadius(T t, float f10) {
        logUnsupportedPropertyWarning(ViewProps.BORDER_TOP_RIGHT_RADIUS);
    }

    @ReactProp(customType = "BoxShadow", name = ViewProps.BOX_SHADOW)
    public void setBoxShadow(T t, @Nullable ReadableArray readableArray) {
        BackgroundStyleApplicator.setBoxShadow(t, readableArray);
    }

    @ReactProp(name = ViewProps.ON_CLICK)
    public void setClick(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.CLICK, z3);
    }

    @ReactProp(name = ViewProps.ON_CLICK_CAPTURE)
    public void setClickCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.CLICK_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.ELEVATION)
    public void setElevation(@NonNull T t, float f10) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f10);
        WeakHashMap weakHashMap = N.f16168a;
        E.l(t, pixelFromDIP);
    }

    @ReactProp(customType = "Filter", name = ViewProps.FILTER)
    public void setFilter(@NonNull T t, @Nullable ReadableArray readableArray) {
        if (ViewUtil.getUIManagerType(t) == 2) {
            t.setTag(R.id.filter, readableArray);
        }
    }

    @ReactProp(name = ViewProps.IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(@NonNull T t, @Nullable String str) {
        if (str == null || str.equals("auto")) {
            WeakHashMap weakHashMap = N.f16168a;
            t.setImportantForAccessibility(0);
            return;
        }
        if (str.equals("yes")) {
            WeakHashMap weakHashMap2 = N.f16168a;
            t.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            WeakHashMap weakHashMap3 = N.f16168a;
            t.setImportantForAccessibility(2);
        } else if (str.equals("no-hide-descendants")) {
            WeakHashMap weakHashMap4 = N.f16168a;
            t.setImportantForAccessibility(4);
        }
    }

    @ReactProp(name = ViewProps.MIX_BLEND_MODE)
    public void setMixBlendMode(@NonNull T t, @Nullable String str) {
        if (ViewUtil.getUIManagerType(t) == 2) {
            t.setTag(R.id.mix_blend_mode, BlendModeHelper.parseMixBlendMode(str));
            if (t.getParent() instanceof View) {
                ((View) t.getParent()).invalidate();
            }
        }
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = ViewProps.NATIVE_ID)
    public void setNativeId(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(@NonNull T t, float f10) {
        t.setAlpha(f10);
    }

    @ReactProp(customType = "Color", name = ViewProps.OUTLINE_COLOR)
    public void setOutlineColor(T t, @Nullable Integer num) {
        BackgroundStyleApplicator.setOutlineColor(t, num);
    }

    @ReactProp(name = ViewProps.OUTLINE_OFFSET)
    public void setOutlineOffset(T t, float f10) {
        BackgroundStyleApplicator.setOutlineOffset(t, f10);
    }

    @ReactProp(name = ViewProps.OUTLINE_STYLE)
    public void setOutlineStyle(T t, @Nullable String str) {
        BackgroundStyleApplicator.setOutlineStyle(t, str == null ? null : OutlineStyle.fromString(str));
    }

    @ReactProp(name = ViewProps.OUTLINE_WIDTH)
    public void setOutlineWidth(T t, float f10) {
        BackgroundStyleApplicator.setOutlineWidth(t, f10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setPointerEnter(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.ENTER, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER_CAPTURE)
    public void setPointerEnterCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.ENTER_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setPointerLeave(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.LEAVE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE_CAPTURE)
    public void setPointerLeaveCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.LEAVE_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setPointerMove(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.MOVE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE_CAPTURE)
    public void setPointerMoveCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.MOVE_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT)
    public void setPointerOut(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OUT, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OUT_CAPTURE)
    public void setPointerOutCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OUT_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER)
    public void setPointerOver(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OVER, z3);
    }

    @ReactProp(name = ViewProps.ON_POINTER_OVER_CAPTURE)
    public void setPointerOverCapture(@NonNull T t, boolean z3) {
        setPointerEventsFlag(t, PointerEventHelper.EVENT.OVER_CAPTURE, z3);
    }

    @ReactProp(name = ViewProps.RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(@NonNull T t, boolean z3) {
        t.setTag(R.id.use_hardware_layer, Boolean.valueOf(z3));
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(@NonNull T t, @Nullable String str) {
        if (str == null) {
            t.setTag(R.id.role, null);
        } else {
            t.setTag(R.id.role, ReactAccessibilityDelegate.Role.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ROTATION)
    @Deprecated
    public void setRotation(@NonNull T t, float f10) {
        t.setRotation(f10);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_X)
    @Deprecated
    public void setScaleX(@NonNull T t, float f10) {
        t.setScaleX(f10);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.SCALE_Y)
    @Deprecated
    public void setScaleY(@NonNull T t, float f10) {
        t.setScaleY(f10);
    }

    @ReactProp(name = ViewProps.SCREEN_READER_FOCUSABLE)
    public void setScreenReaderFocusable(@NonNull T t, boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setScreenReaderFocusable(z3);
        }
    }

    @ReactProp(customType = "Color", defaultInt = -16777216, name = ViewProps.SHADOW_COLOR)
    public void setShadowColor(@NonNull T t, int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(i7);
            t.setOutlineSpotShadowColor(i7);
        }
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = ViewProps.TEST_ID)
    public void setTestId(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(@NonNull T t, boolean z3) {
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(@NonNull T t, @Nullable ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t.getTag(R.id.transform), readableArray)) {
            return;
        }
        t.setTag(R.id.transform, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    @ReactProp(name = ViewProps.TRANSFORM_ORIGIN)
    public void setTransformOrigin(@NonNull T t, @Nullable ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t.getTag(R.id.transform_origin), readableArray)) {
            return;
        }
        t.setTag(R.id.transform_origin, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    public void setTransformProperty(@NonNull T t, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2) {
        if (readableArray == null) {
            t.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            t.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            t.setRotation(0.0f);
            t.setRotationX(0.0f);
            t.setRotationY(0.0f);
            t.setScaleX(1.0f);
            t.setScaleY(1.0f);
            t.setCameraDistance(0.0f);
            return;
        }
        boolean z3 = ViewUtil.getUIManagerType(t) == 2;
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, PixelUtil.toDIPFromPixel(t.getWidth()), PixelUtil.toDIPFromPixel(t.getHeight()), readableArray2, z3);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        t.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        t.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        t.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        t.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        t.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        t.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        t.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            t.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_X)
    @Deprecated
    public void setTranslateX(@NonNull T t, float f10) {
        t.setTranslationX(PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(@NonNull T t, float f10) {
        t.setTranslationY(PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_STATE)
    public void setViewState(@NonNull T t, @Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("expanded")) {
            t.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean("expanded")));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t.isSelected();
            boolean z3 = readableMap.getBoolean("selected");
            t.setSelected(z3);
            if (t.isAccessibilityFocused() && zIsSelected && !z3) {
                t.announceForAccessibility(t.getContext().getString(R.string.state_unselected_description));
            }
        } else {
            t.setSelected(false);
        }
        t.setTag(R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals("expanded") || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            } else if (t.isAccessibilityFocused()) {
                t.sendAccessibilityEvent(1);
            }
        }
    }

    @ReactProp(name = ViewProps.Z_INDEX)
    public void setZIndex(@NonNull T t, float f10) {
        ViewGroupManager.setViewZIndex(t, Math.round(f10));
        ViewParent parent = t.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }

    public void updateViewAccessibility(@NonNull T t) {
        ReactAccessibilityDelegate.setDelegate(t, t.isFocusable(), t.getImportantForAccessibility());
    }

    public BaseViewManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
