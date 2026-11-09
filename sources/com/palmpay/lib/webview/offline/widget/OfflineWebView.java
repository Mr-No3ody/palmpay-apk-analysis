package com.palmpay.lib.webview.offline.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy;
import com.palmpay.lib.webview.offline.proxy.OffWebProxyFactory;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebView extends WebView implements ReloadOfflineWebView {
    private IOfflineWebViewProxy mOfflineWebViewProxy;

    public OfflineWebView(Context context) {
        super(context);
        initProxy();
    }

    private void initProxy() {
        this.mOfflineWebViewProxy = OffWebProxyFactory.getProxy(this);
    }

    @Override // android.webkit.WebView, com.palmpay.lib.webview.offline.widget.IOfflineWebView
    public void destroy() {
        super.destroy();
        this.mOfflineWebViewProxy.destroy();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(this.mOfflineWebViewProxy.loadUrl(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mOfflineWebViewProxy.destroy();
    }

    @Override // com.palmpay.lib.webview.offline.widget.ReloadOfflineWebView
    public void reloadOfflineWeb() {
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(this.mOfflineWebViewProxy.loadUrl(str), map);
    }

    public OfflineWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initProxy();
    }

    public OfflineWebView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        initProxy();
    }

    @RequiresApi(api = 21)
    public OfflineWebView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        initProxy();
    }
}
