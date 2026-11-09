package p306u7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42710b;

    static {
        new a(null);
    }

    public b(int i7, int i10, float f10) {
        super(i7);
        this.f42709a = i10;
        this.f42710b = (Float.isInfinite(f10) || Float.isNaN(f10)) ? 0.0f : f10;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        int viewTag = getViewTag();
        String strInternal_getEventNameCompat = internal_getEventNameCompat();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt(ViewProps.POSITION, this.f42709a);
        writableMapCreateMap.putDouble("offset", this.f42710b);
        rctEventEmitter.receiveEvent(viewTag, strInternal_getEventNameCompat, writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topPageScroll";
    }
}
