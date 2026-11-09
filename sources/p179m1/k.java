package p179m1;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39460a;

    static {
        new j(null);
    }

    public k(int i7, int i10, boolean z3) {
        super(i7, i10);
        this.f39460a = z3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putBoolean("isCancelled", this.f39460a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topAnimationFinish";
    }
}
