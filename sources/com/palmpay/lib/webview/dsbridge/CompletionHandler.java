package com.palmpay.lib.webview.dsbridge;

/* JADX INFO: loaded from: classes3.dex */
public interface CompletionHandler<T> {
    void complete();

    void complete(T t);

    void setProgressData(T t);
}
