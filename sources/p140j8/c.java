package p140j8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import p002a.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f38337b;

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, int i10, a mInsets, d mFrame) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(mInsets, "mInsets");
        Intrinsics.checkNotNullParameter(mFrame, "mFrame");
        this.f38336a = mInsets;
        this.f38337b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putMap("insets", a.j(this.f38336a));
        d rect = this.f38337b;
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        writableMapCreateMap2.putDouble("x", PixelUtil.toDIPFromPixel(rect.f38338a));
        writableMapCreateMap2.putDouble("y", PixelUtil.toDIPFromPixel(rect.f38339b));
        writableMapCreateMap2.putDouble("width", PixelUtil.toDIPFromPixel(rect.f38340c));
        writableMapCreateMap2.putDouble("height", PixelUtil.toDIPFromPixel(rect.f38341d));
        writableMapCreateMap.putMap("frame", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topInsetsChange";
    }
}
