package p306u7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42712a;

    static {
        new e(null);
    }

    public f(int i7, int i10) {
        super(i7);
        this.f42712a = i10;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        int viewTag = getViewTag();
        String strInternal_getEventNameCompat = internal_getEventNameCompat();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt(ViewProps.POSITION, this.f42712a);
        rctEventEmitter.receiveEvent(viewTag, strInternal_getEventNameCompat, writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topPageSelected";
    }
}
