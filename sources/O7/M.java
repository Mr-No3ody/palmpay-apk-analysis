package O7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6660b;

    static {
        new L(null);
    }

    public M(int i7, int i10, int i11, boolean z3) {
        super(i7, i10);
        this.f6659a = i11;
        this.f6660b = z3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, this.f6659a);
        writableMapCreateMap.putBoolean("isStable", this.f6660b);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topSheetDetentChanged";
    }
}
