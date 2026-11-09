package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.textinput.ReactContentSizeChangedEvent;
import com.facebook.react.views.textinput.ReactTextChangedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/UIManagerModuleConstants;", "", "<init>", "()V", "bubblingEventTypeConstants", "", "", "directEventTypeConstants", "constants", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIManagerModuleConstants {

    @NotNull
    public static final UIManagerModuleConstants INSTANCE = new UIManagerModuleConstants();

    @JvmField
    @NotNull
    public static final Map<String, Object> bubblingEventTypeConstants;

    @JvmField
    @NotNull
    public static final Map<String, Object> constants;

    @JvmField
    @NotNull
    public static final Map<String, Object> directEventTypeConstants;

    static {
        Pair pair = new Pair(ReactTextChangedEvent.EVENT_NAME, F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onChange"), new Pair("captured", "onChangeCapture")))));
        Pair pair2 = new Pair("topSelect", F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onSelect"), new Pair("captured", "onSelectCapture")))));
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        bubblingEventTypeConstants = G.g(pair, pair2, new Pair(companion.getJSEventName(TouchEventType.START), F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onTouchStart"), new Pair("captured", "onTouchStartCapture"))))), new Pair(companion.getJSEventName(TouchEventType.MOVE), F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onTouchMove"), new Pair("captured", "onTouchMoveCapture"))))), new Pair(companion.getJSEventName(TouchEventType.END), F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onTouchEnd"), new Pair("captured", "onTouchEndCapture"))))), new Pair(companion.getJSEventName(TouchEventType.CANCEL), F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onTouchCancel"), new Pair("captured", "onTouchCancelCapture"))))));
        directEventTypeConstants = G.g(new Pair(ReactContentSizeChangedEvent.EVENT_NAME, com.airbnb.lottie.model.layer.d.q("registrationName", "onContentSizeChange")), new Pair("topLayout", com.airbnb.lottie.model.layer.d.q("registrationName", "onLayout")), new Pair("topLoadingError", com.airbnb.lottie.model.layer.d.q("registrationName", "onLoadingError")), new Pair("topLoadingFinish", com.airbnb.lottie.model.layer.d.q("registrationName", "onLoadingFinish")), new Pair("topLoadingStart", com.airbnb.lottie.model.layer.d.q("registrationName", "onLoadingStart")), new Pair("topSelectionChange", com.airbnb.lottie.model.layer.d.q("registrationName", "onSelectionChange")), new Pair("topMessage", com.airbnb.lottie.model.layer.d.q("registrationName", "onMessage")), new Pair("topScrollBeginDrag", com.airbnb.lottie.model.layer.d.q("registrationName", "onScrollBeginDrag")), new Pair("topScrollEndDrag", com.airbnb.lottie.model.layer.d.q("registrationName", "onScrollEndDrag")), new Pair("topScroll", com.airbnb.lottie.model.layer.d.q("registrationName", "onScroll")), new Pair("topMomentumScrollBegin", com.airbnb.lottie.model.layer.d.q("registrationName", "onMomentumScrollBegin")), new Pair("topMomentumScrollEnd", com.airbnb.lottie.model.layer.d.q("registrationName", "onMomentumScrollEnd")));
        constants = G.g(new Pair("UIView", F.b(new Pair("ContentMode", G.g(new Pair("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), new Pair("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), new Pair("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), new Pair("StyleConstants", F.b(new Pair("PointerEventsValues", G.g(new Pair(ViewProps.NONE, Integer.valueOf(PointerEvents.NONE.ordinal())), new Pair("boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal())), new Pair("boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal())), new Pair("unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal())))))), new Pair("AccessibilityEventTypes", G.g(new Pair("typeWindowStateChanged", 32), new Pair("typeViewFocused", 8), new Pair("typeViewClicked", 1))));
    }

    private UIManagerModuleConstants() {
    }
}
