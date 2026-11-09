package com.facebook.react.uimanager.events;

import M.q;
import android.os.Trace;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0002\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchesHelper;", "", "<init>", "()V", "TARGET_KEY", "", "getTARGET_KEY$annotations", "TARGET_SURFACE_KEY", "CHANGED_TOUCHES_KEY", "TOUCHES_KEY", "PAGE_X_KEY", "PAGE_Y_KEY", "TIMESTAMP_KEY", "POINTER_IDENTIFIER_KEY", "LOCATION_X_KEY", "LOCATION_Y_KEY", "createPointersArray", "", "Lcom/facebook/react/bridge/WritableMap;", "event", "Lcom/facebook/react/uimanager/events/TouchEvent;", "(Lcom/facebook/react/uimanager/events/TouchEvent;)[Lcom/facebook/react/bridge/WritableMap;", "sendTouchesLegacy", "", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "touchEvent", "sendTouchEvent", "eventEmitter", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "getWritableArray", "Lcom/facebook/react/bridge/WritableArray;", "copyObjects", "", "objects", "(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchesHelper {

    @NotNull
    private static final String CHANGED_TOUCHES_KEY = "changedTouches";

    @NotNull
    private static final String LOCATION_X_KEY = "locationX";

    @NotNull
    private static final String LOCATION_Y_KEY = "locationY";

    @NotNull
    private static final String PAGE_X_KEY = "pageX";

    @NotNull
    private static final String PAGE_Y_KEY = "pageY";

    @NotNull
    private static final String POINTER_IDENTIFIER_KEY = "identifier";

    @NotNull
    private static final String TARGET_SURFACE_KEY = "targetSurface";

    @NotNull
    private static final String TIMESTAMP_KEY = "timestamp";

    @NotNull
    private static final String TOUCHES_KEY = "touches";

    @NotNull
    public static final TouchesHelper INSTANCE = new TouchesHelper();

    @JvmField
    @NotNull
    public static final String TARGET_KEY = "target";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchesHelper() {
    }

    private final WritableMap[] createPointersArray(TouchEvent event) {
        MotionEvent motionEvent = event.getMotionEvent();
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x3 = motionEvent.getX() - event.getViewX();
        float y8 = motionEvent.getY() - event.getViewY();
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            writableMapCreateMap.putDouble(PAGE_X_KEY, pixelUtil.pxToDp(motionEvent.getX(i7)));
            writableMapCreateMap.putDouble(PAGE_Y_KEY, pixelUtil.pxToDp(motionEvent.getY(i7)));
            float x7 = motionEvent.getX(i7) - x3;
            float y10 = motionEvent.getY(i7) - y8;
            writableMapCreateMap.putDouble(LOCATION_X_KEY, pixelUtil.pxToDp(x7));
            writableMapCreateMap.putDouble(LOCATION_Y_KEY, pixelUtil.pxToDp(y10));
            writableMapCreateMap.putInt(TARGET_SURFACE_KEY, event.getSurfaceId());
            writableMapCreateMap.putInt(TARGET_KEY, event.getViewTag());
            writableMapCreateMap.putDouble(TIMESTAMP_KEY, event.getTimestampMs());
            writableMapCreateMap.putDouble(POINTER_IDENTIFIER_KEY, motionEvent.getPointerId(i7));
            writableMapArr[i7] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    @Deprecated(message = "Not used in New Architecture")
    public static /* synthetic */ void getTARGET_KEY$annotations() {
    }

    private final WritableArray getWritableArray(boolean copyObjects, WritableMap[] objects) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        for (WritableMap writableMapCopy : objects) {
            if (writableMapCopy != null) {
                if (copyObjects) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    @JvmStatic
    public static final void sendTouchEvent(@NotNull RCTModernEventEmitter eventEmitter, @NotNull TouchEvent event) {
        WritableMap[] writableMapArr;
        WritableMap writableMap;
        WritableMap[] writableMapArr2;
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        Intrinsics.checkNotNullParameter(event, "event");
        D3.a.a("TouchesHelper.sentTouchEventModern(" + event.getEventName() + ")");
        try {
            TouchEventType touchEventType = event.getTouchEventType();
            MotionEvent motionEvent = event.getMotionEvent();
            WritableMap[] writableMapArrCreatePointersArray = INSTANCE.createPointersArray(event);
            int i7 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    int actionIndex = motionEvent.getActionIndex();
                    WritableMap writableMap2 = writableMapArrCreatePointersArray[actionIndex];
                    writableMapArrCreatePointersArray[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap2};
                } else if (i7 == 3) {
                    writableMapArr2 = new WritableMap[writableMapArrCreatePointersArray.length];
                    for (int i10 = 0; i10 < writableMapArrCreatePointersArray.length; i10++) {
                        WritableMap writableMap3 = writableMapArrCreatePointersArray[i10];
                        writableMapArr2[i10] = writableMap3 != null ? writableMap3.copy() : null;
                    }
                } else {
                    if (i7 != 4) {
                        throw new l();
                    }
                    writableMapArr = new WritableMap[0];
                }
                writableMapArr = writableMapArrCreatePointersArray;
                writableMapArrCreatePointersArray = writableMapArr2;
            } else {
                WritableMap writableMap4 = writableMapArrCreatePointersArray[motionEvent.getActionIndex()];
                writableMapArr = writableMapArrCreatePointersArray;
                writableMapArrCreatePointersArray = new WritableMap[]{writableMap4 != null ? writableMap4.copy() : null};
            }
            q qVarA = AbstractC1859i.a(writableMapArrCreatePointersArray);
            while (qVarA.hasNext()) {
                WritableMap writableMap5 = (WritableMap) qVarA.next();
                if (writableMap5 != null) {
                    WritableMap writableMapCopy = writableMap5.copy();
                    TouchesHelper touchesHelper = INSTANCE;
                    WritableArray writableArray = touchesHelper.getWritableArray(true, writableMapArrCreatePointersArray);
                    WritableArray writableArray2 = touchesHelper.getWritableArray(true, writableMapArr);
                    writableMapCopy.putArray(CHANGED_TOUCHES_KEY, writableArray);
                    writableMapCopy.putArray(TOUCHES_KEY, writableArray2);
                    writableMap = writableMapCopy;
                } else {
                    writableMap = null;
                }
                RCTModernEventEmitter rCTModernEventEmitter = eventEmitter;
                rCTModernEventEmitter.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap, event.getEventCategory());
                eventEmitter = rCTModernEventEmitter;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @JvmStatic
    public static final void sendTouchesLegacy(@NotNull RCTEventEmitter rctEventEmitter, @NotNull TouchEvent touchEvent) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        TouchEventType touchEventType = touchEvent.getTouchEventType();
        TouchesHelper touchesHelper = INSTANCE;
        WritableArray writableArray = touchesHelper.getWritableArray(false, touchesHelper.createPointersArray(touchEvent));
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        if (touchEventType == TouchEventType.MOVE || touchEventType == TouchEventType.CANCEL) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 0; i7 < pointerCount; i7++) {
                writableArrayCreateArray.pushInt(i7);
            }
        } else {
            if (touchEventType != TouchEventType.START && touchEventType != TouchEventType.END) {
                throw new RuntimeException("Unknown touch type: " + touchEventType);
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        }
        rctEventEmitter.receiveTouches(TouchEventType.INSTANCE.getJSEventName(touchEventType), writableArray, writableArrayCreateArray);
    }
}
