package W7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Event implements NamingAwareEventType {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f10568d = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i7, int i10, String tabKey, int i11, boolean z3) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(tabKey, "tabKey");
        this.f10569a = tabKey;
        this.f10570b = i11;
        this.f10571c = z3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) ((this.f10570b * 10) + (this.f10571c ? 1 : 0));
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f10569a);
        writableMapCreateMap.putBoolean("repeatedSelectionHandledBySpecialEffect", this.f10571c);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topNativeFocusChange";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    public final String getEventRegistrationName() {
        return "onNativeFocusChange";
    }
}
