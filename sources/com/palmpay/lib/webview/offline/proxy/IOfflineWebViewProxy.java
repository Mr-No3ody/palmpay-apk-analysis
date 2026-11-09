package com.palmpay.lib.webview.offline.proxy;

/* JADX INFO: loaded from: classes3.dex */
public interface IOfflineWebViewProxy {
    void destroy();

    String getBisName();

    String loadUrl(String str);

    void reLoadUrl();
}
