package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058e0.b;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016Jb\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/scroll/ScrollEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "scrollX", "", "scrollY", "xVelocity", "yVelocity", "contentWidth", "", "contentHeight", "scrollViewWidth", "scrollViewHeight", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "timestamp", "", "onDispose", "", "init", "surfaceId", "viewTag", "getEventName", "", "canCoalesce", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollEvent.kt\ncom/facebook/react/views/scroll/ScrollEvent\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,182:1\n30#2,3:183\n30#2,3:186\n30#2,3:189\n30#2,3:192\n30#2,3:195\n*S KotlinDebug\n*F\n+ 1 ScrollEvent.kt\ncom/facebook/react/views/scroll/ScrollEvent\n*L\n78#1:183,3\n85#1:186,3\n90#1:189,3\n95#1:192,3\n100#1:195,3\n*E\n"})
public final class ScrollEvent extends Event<ScrollEvent> {
    private int contentHeight;
    private int contentWidth;

    @Nullable
    private ScrollEventType scrollEventType;
    private int scrollViewHeight;
    private int scrollViewWidth;
    private float scrollX;
    private float scrollY;
    private long timestamp;
    private float xVelocity;
    private float yVelocity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ScrollEvent";

    @NotNull
    private static final b EVENTS_POOL = new b(3);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014Ja\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/views/scroll/ScrollEvent$Companion;", "", "<init>", "()V", "", "surfaceId", "viewTag", "Lcom/facebook/react/views/scroll/ScrollEventType;", "scrollEventType", "", "scrollX", "scrollY", "xVelocity", "yVelocity", "contentWidth", "contentHeight", "scrollViewWidth", "scrollViewHeight", "Lcom/facebook/react/views/scroll/ScrollEvent;", "obtain", "(IILcom/facebook/react/views/scroll/ScrollEventType;FFFFIIII)Lcom/facebook/react/views/scroll/ScrollEvent;", "(ILcom/facebook/react/views/scroll/ScrollEventType;FFFFIIII)Lcom/facebook/react/views/scroll/ScrollEvent;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Le0/b;", "EVENTS_POOL", "Le0/b;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ScrollEvent obtain(int surfaceId, int viewTag, @Nullable ScrollEventType scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
            ScrollEvent scrollEvent = (ScrollEvent) ScrollEvent.EVENTS_POOL.acquire();
            if (scrollEvent == null) {
                scrollEvent = new ScrollEvent(null);
            }
            ScrollEvent scrollEvent2 = scrollEvent;
            scrollEvent2.init(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight);
            return scrollEvent2;
        }

        private Companion() {
        }

        @Deprecated(message = "Use the obtain version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight)", imports = {}))
        @JvmStatic
        @NotNull
        public final ScrollEvent obtain(int viewTag, @Nullable ScrollEventType scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
            return obtain(-1, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight);
        }
    }

    public /* synthetic */ ScrollEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int surfaceId, int viewTag, ScrollEventType scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        init(surfaceId, viewTag, jUptimeMillis);
        this.scrollEventType = scrollEventType;
        this.scrollX = scrollX;
        this.scrollY = scrollY;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.contentWidth = contentWidth;
        this.contentHeight = contentHeight;
        this.scrollViewWidth = scrollViewWidth;
        this.scrollViewHeight = scrollViewHeight;
        this.timestamp = jUptimeMillis;
    }

    @JvmStatic
    @NotNull
    public static final ScrollEvent obtain(int i7, int i10, @Nullable ScrollEventType scrollEventType, float f10, float f11, float f12, float f13, int i11, int i12, int i13, int i14) {
        return INSTANCE.obtain(i7, i10, scrollEventType, f10, f11, f12, f13, i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return this.scrollEventType == ScrollEventType.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(ViewProps.TOP, 0.0d);
        readableMapBuilder.put(ViewProps.BOTTOM, 0.0d);
        readableMapBuilder.put(ViewProps.LEFT, 0.0d);
        readableMapBuilder.put(ViewProps.RIGHT, 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("x", PixelUtil.toDIPFromPixel(this.scrollX));
        readableMapBuilder2.put("y", PixelUtil.toDIPFromPixel(this.scrollY));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap3, "createMap(...)");
        ReadableMapBuilder readableMapBuilder3 = new ReadableMapBuilder(writableMapCreateMap3);
        readableMapBuilder3.put("width", PixelUtil.toDIPFromPixel(this.contentWidth));
        readableMapBuilder3.put("height", PixelUtil.toDIPFromPixel(this.contentHeight));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap4, "createMap(...)");
        ReadableMapBuilder readableMapBuilder4 = new ReadableMapBuilder(writableMapCreateMap4);
        readableMapBuilder4.put("width", PixelUtil.toDIPFromPixel(this.scrollViewWidth));
        readableMapBuilder4.put("height", PixelUtil.toDIPFromPixel(this.scrollViewHeight));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap5, "createMap(...)");
        ReadableMapBuilder readableMapBuilder5 = new ReadableMapBuilder(writableMapCreateMap5);
        readableMapBuilder5.put("x", PixelUtil.toDIPFromPixel(this.xVelocity));
        readableMapBuilder5.put("y", PixelUtil.toDIPFromPixel(this.yVelocity));
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap6, "createMap(...)");
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putDouble("timestamp", this.timestamp);
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        return writableMapCreateMap6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        ScrollEventType.Companion companion = ScrollEventType.INSTANCE;
        ScrollEventType scrollEventType = this.scrollEventType;
        a.f(scrollEventType);
        Intrinsics.checkNotNullExpressionValue(scrollEventType, "assertNotNull(...)");
        return companion.getJSEventName(scrollEventType);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG2, e10);
        }
    }

    private ScrollEvent() {
    }

    @Deprecated(message = "Use the obtain version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ScrollEvent obtain(int i7, @Nullable ScrollEventType scrollEventType, float f10, float f11, float f12, float f13, int i10, int i11, int i12, int i13) {
        return INSTANCE.obtain(i7, scrollEventType, f10, f11, f12, f13, i10, i11, i12, i13);
    }
}
