package com.palmpay.lib.webview.offline.net;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestCallback<T> {
    void onFail(Throwable th);

    void onSuccess(T t);
}
