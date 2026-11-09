package com.palmpay.lib.webview.offline.proxy;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyOfflineWebViewProxy implements IOfflineWebViewProxy {
    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public void destroy() {
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public String getBisName() {
        return "";
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public String loadUrl(String str) {
        return str;
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public void reLoadUrl() {
    }
}
