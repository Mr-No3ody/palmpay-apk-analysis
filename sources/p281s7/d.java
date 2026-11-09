package p281s7;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WritableMap f42054a;

    static {
        new c(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WritableMap mEventData, int i7) {
        super(i7);
        Intrinsics.checkNotNullParameter(mEventData, "mEventData");
        this.f42054a = mEventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f42054a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topCustomMenuSelection";
    }
}
