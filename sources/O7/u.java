package O7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f6677d;

    static {
        new t(null);
    }

    public u(int i7, int i10, float f10, boolean z3, boolean z8, short s3) {
        super(i7, i10);
        this.f6674a = f10;
        this.f6675b = z3;
        this.f6676c = z8;
        this.f6677d = s3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return this.f6677d;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f6674a);
        writableMapCreateMap.putInt("closing", this.f6675b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f6676c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topTransitionProgress";
    }
}
