package W7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Event implements NamingAwareEventType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10566a = new e(null);

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topWillAppear";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    public final String getEventRegistrationName() {
        return "onWillAppear";
    }
}
