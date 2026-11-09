package U7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Event implements NamingAwareEventType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i7, String name, int i10, String registrationName) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(registrationName, "registrationName");
        this.f9279a = name;
        this.f9280b = registrationName;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return this.f9279a;
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    public final String getEventRegistrationName() {
        return this.f9280b;
    }
}
