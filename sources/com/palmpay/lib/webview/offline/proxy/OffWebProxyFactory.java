package com.palmpay.lib.webview.offline.proxy;

import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.widget.IOfflineWebView;

/* JADX INFO: loaded from: classes3.dex */
public class OffWebProxyFactory {
    private OffWebProxyFactory() {
    }

    public static IOfflineWebViewProxy getProxy(IOfflineWebView iOfflineWebView) {
        return OfflineWebManager.getInstance().isInit() ? new OfflineWebViewProxy(iOfflineWebView) : new EmptyOfflineWebViewProxy();
    }
}
