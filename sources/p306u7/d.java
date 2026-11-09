package p306u7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42711a;

    static {
        new c(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i7, String mPageScrollState) {
        super(i7);
        Intrinsics.checkNotNullParameter(mPageScrollState, "mPageScrollState");
        this.f42711a = mPageScrollState;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        int viewTag = getViewTag();
        String strInternal_getEventNameCompat = internal_getEventNameCompat();
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("pageScrollState", this.f42711a);
        rctEventEmitter.receiveEvent(viewTag, strInternal_getEventNameCompat, writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topPageScrollStateChanged";
    }
}
