package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.common.ViewUtil;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0007JJ\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0017J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010$\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006+"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "motionEvent", "Landroid/view/MotionEvent;", "touchEventType", "Lcom/facebook/react/uimanager/events/TouchEventType;", "coalescingKey", "", "value", "", "viewX", "getViewX", "()F", "viewY", "getViewY", "getMotionEvent", "getTouchEventType", "init", "", "surfaceId", "", "viewTag", "motionEventToCopy", "gestureStartTime", "", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "onDispose", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "dispatch", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "dispatchModern", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "getEventCategory", "verifyMotionEvent", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchEvent extends Event<TouchEvent> {
    private static final int TOUCH_EVENTS_POOL_SIZE = 3;
    public static final long UNSET = Long.MIN_VALUE;
    private short coalescingKey;

    @Nullable
    private MotionEvent motionEvent;

    @Nullable
    private TouchEventType touchEventType;
    private float viewX;
    private float viewY;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TouchEvent";

    @NotNull
    private static final p058e0.b EVENTS_POOL = new p058e0.b(3);

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent$Companion;", "", "<init>", "()V", "", "viewTag", "Lcom/facebook/react/uimanager/events/TouchEventType;", "touchEventType", "Landroid/view/MotionEvent;", "motionEventToCopy", "", "gestureStartTime", "", "viewX", "viewY", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEvent;", "obtain", "(ILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;", "surfaceId", "(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "Le0/b;", "EVENTS_POOL", "Le0/b;", "UNSET", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Please use the other overload of the obtain method, which explicitly provides surfaceId", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
        @JvmStatic
        @NotNull
        public final TouchEvent obtain(int viewTag, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            p059e1.a.f(motionEventToCopy);
            return obtain(-1, viewTag, touchEventType, motionEventToCopy, gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final TouchEvent obtain(int surfaceId, int viewTag, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            TouchEvent touchEvent = (TouchEvent) TouchEvent.EVENTS_POOL.acquire();
            if (touchEvent == null) {
                touchEvent = new TouchEvent(null);
            }
            TouchEvent touchEvent2 = touchEvent;
            p059e1.a.f(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(motionEventToCopy, "assertNotNull(...)");
            touchEvent2.init(surfaceId, viewTag, touchEventType, motionEventToCopy, gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
            return touchEvent2;
        }
    }

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
                iArr[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int surfaceId, int viewTag, TouchEventType touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        init(surfaceId, viewTag, motionEventToCopy.getEventTime());
        short coalescingKey = 0;
        SoftAssertions.assertCondition(gestureStartTime != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEventToCopy.getAction() & 255;
        if (action == 0) {
            touchEventCoalescingKeyHelper.addCoalescingKey(gestureStartTime);
        } else if (action == 1) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
        } else if (action == 2) {
            coalescingKey = touchEventCoalescingKeyHelper.getCoalescingKey(gestureStartTime);
        } else if (action == 3) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
        } else if (action == 5 || action == 6) {
            touchEventCoalescingKeyHelper.incrementCoalescingKey(gestureStartTime);
        }
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.touchEventType = touchEventType;
        this.coalescingKey = coalescingKey;
        this.viewX = viewX;
        this.viewY = viewY;
    }

    @JvmStatic
    @NotNull
    public static final TouchEvent obtain(int i7, int i10, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEvent, long j6, float f10, float f11, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i7, i10, touchEventType, motionEvent, j6, f10, f11, touchEventCoalescingKeyHelper);
    }

    private final boolean verifyMotionEvent() {
        if (this.motionEvent != null) {
            return true;
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG2, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        TouchEventType touchEventType = this.touchEventType;
        p059e1.a.f(touchEventType);
        int i7 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return false;
        }
        if (i7 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.touchEventType);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Deprecated(message = "Deprecated in Java")
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(@NotNull RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            int uIManagerType = ViewUtil.getUIManagerType(getViewTag(), getSurfaceId());
            if (uIManagerType == 1) {
                TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
            } else {
                if (uIManagerType != 2) {
                    return;
                }
                TouchesHelper.sendTouchEvent(rctEventEmitter, this);
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public int getEventCategory() {
        TouchEventType touchEventType = this.touchEventType;
        if (touchEventType == null) {
            return 2;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2 || i7 == 3) {
            return 1;
        }
        if (i7 == 4) {
            return 4;
        }
        throw new l();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        TouchEventType touchEventType = this.touchEventType;
        p059e1.a.f(touchEventType);
        Intrinsics.checkNotNullExpressionValue(touchEventType, "assertNotNull(...)");
        return companion.getJSEventName(touchEventType);
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        MotionEvent motionEvent = this.motionEvent;
        p059e1.a.f(motionEvent);
        Intrinsics.checkNotNullExpressionValue(motionEvent, "assertNotNull(...)");
        return motionEvent;
    }

    @NotNull
    public final TouchEventType getTouchEventType() {
        TouchEventType touchEventType = this.touchEventType;
        p059e1.a.f(touchEventType);
        Intrinsics.checkNotNullExpressionValue(touchEventType, "assertNotNull(...)");
        return touchEventType;
    }

    public final float getViewX() {
        return this.viewX;
    }

    public final float getViewY() {
        return this.viewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG2, e10);
        }
    }

    private TouchEvent() {
    }

    @Deprecated(message = "Please use the other overload of the obtain method, which explicitly provides surfaceId", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
    @JvmStatic
    @NotNull
    public static final TouchEvent obtain(int i7, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEvent, long j6, float f10, float f11, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i7, touchEventType, motionEvent, j6, f10, f11, touchEventCoalescingKeyHelper);
    }
}
