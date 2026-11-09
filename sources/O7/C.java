package O7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6657a;

    static {
        new B(null);
    }

    public C(int i7, int i10, String str) {
        super(i7, i10);
        this.f6657a = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(ReactTextInputShadowNode.PROP_TEXT, this.f6657a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topChangeText";
    }
}
