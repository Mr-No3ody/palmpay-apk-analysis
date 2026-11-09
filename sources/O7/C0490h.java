package O7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: renamed from: O7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0490h extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6661a;

    static {
        new C0489g(null);
    }

    public C0490h(int i7, int i10, double d2) {
        super(i7, i10);
        this.f6661a = d2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) this.f6661a;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("headerHeight", this.f6661a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topHeaderHeightChange";
    }
}
