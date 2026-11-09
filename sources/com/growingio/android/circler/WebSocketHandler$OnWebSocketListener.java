package com.growingio.android.circler;

/* JADX INFO: loaded from: classes3.dex */
interface WebSocketHandler$OnWebSocketListener {
    void onFailed();

    void onMessage(String msg);

    void onQuited();

    void onReady();
}
