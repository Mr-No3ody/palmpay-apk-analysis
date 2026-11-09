package p179m1;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f39459a;

    static {
        new h(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i7, int i10, Throwable error) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f39459a = error;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("error", this.f39459a.getMessage());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topAnimationFailure";
    }
}
