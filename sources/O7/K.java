package O7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6658a;

    static {
        new J(null);
    }

    public K(int i7, int i10, String str) {
        super(i7, i10);
        this.f6658a = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(ReactTextInputShadowNode.PROP_TEXT, this.f6658a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return "topSearchButtonPress";
    }
}
