package p281s7;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WritableMap f42063a;

    static {
        new u(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(WritableMap mData, int i7) {
        super(i7);
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f42063a = mData;
        mData.putString("navigationType", "other");
        mData.putBoolean("isTopFrame", true);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "topShouldStartLoadWithRequest", this.f42063a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topShouldStartLoadWithRequest";
    }
}
