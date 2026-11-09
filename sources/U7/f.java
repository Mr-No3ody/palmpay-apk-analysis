package U7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9278c;

    static {
        new e(null);
    }

    public f(int i7, int i10, boolean z3) {
        super(i7, "topDismiss", i10, "onDismiss");
        this.f9278c = z3;
    }

    @Override // U7.g, com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putBoolean("isNativeDismiss", this.f9278c);
        return writableMapCreateMap;
    }
}
