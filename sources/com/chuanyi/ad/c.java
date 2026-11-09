package com.chuanyi.ad;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WritableMap f21089b;

    public c(int i7, int i10, String str, WritableMap writableMap) {
        super(i7, i10);
        this.f21088a = str;
        this.f21089b = writableMap == null ? Arguments.createMap() : writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        return this.f21089b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        return this.f21088a;
    }
}
