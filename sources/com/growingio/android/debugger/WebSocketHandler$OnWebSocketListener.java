package com.growingio.android.debugger;

/* JADX INFO: loaded from: classes3.dex */
interface WebSocketHandler$OnWebSocketListener {
    void onFailed();

    void onMessage(String msg);

    void onQuited();

    void onReady();
}
