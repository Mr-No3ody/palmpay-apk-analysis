package com.palmpay.lib.webview.offline.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceErrorAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceRequestAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebResourceResponseAdapter;
import com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus;
import com.palmpay.lib.webview.offline.monitor.impl.OfflineWebPageStatus;
import com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy;
import com.palmpay.lib.webview.offline.proxy.OffWebProxyFactory;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class EnhOfflineWebView extends WebView implements ReloadOfflineWebView, IWebPageStatus {
    private EnhWebViewClient mEnhWebViewClient;
    private IOfflineWebViewProxy mOfflineWebViewProxy;
    private IWebPageStatus mWebPageStatus;

    public EnhOfflineWebView(Context context) {
        super(context);
        initProxy();
    }

    private void initProxy() {
        this.mOfflineWebViewProxy = OffWebProxyFactory.getProxy(this);
        this.mWebPageStatus = new OfflineWebPageStatus();
        EnhWebViewClient enhWebViewClient = new EnhWebViewClient(this);
        this.mEnhWebViewClient = enhWebViewClient;
        super.setWebViewClient(enhWebViewClient);
    }

    @Override // android.webkit.WebView, com.palmpay.lib.webview.offline.widget.IOfflineWebView
    public void destroy() {
        super.destroy();
        this.mOfflineWebViewProxy.destroy();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        this.mWebPageStatus.onLoadUrl(str);
        super.loadUrl(this.mOfflineWebViewProxy.loadUrl(str));
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onCacheHit(int i7) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mOfflineWebViewProxy.destroy();
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, IEnhWebResourceErrorAdapter iEnhWebResourceErrorAdapter) {
        this.mWebPageStatus.onLoadError(iEnhWebResourceRequestAdapter, iEnhWebResourceErrorAdapter);
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadUrl(@Nullable String str) {
        this.mWebPageStatus.onLoadUrl(str);
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onPageLoadFinish(@Nullable String str, int i7) {
        this.mWebPageStatus.onPageLoadFinish(str, i7);
    }

    @Override // com.palmpay.lib.webview.offline.widget.ReloadOfflineWebView
    public void reloadOfflineWeb() {
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.mEnhWebViewClient.setDelegate(webViewClient);
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(IEnhWebResourceRequestAdapter iEnhWebResourceRequestAdapter, IEnhWebResourceResponseAdapter iEnhWebResourceResponseAdapter) {
        this.mWebPageStatus.onLoadError(iEnhWebResourceRequestAdapter, iEnhWebResourceResponseAdapter);
    }

    public EnhOfflineWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initProxy();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        this.mWebPageStatus.onLoadUrl(str);
        super.loadUrl(this.mOfflineWebViewProxy.loadUrl(str), map);
    }

    @Override // com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus
    public void onLoadError(String str, String str2) {
        this.mWebPageStatus.onLoadError(str, str2);
    }

    public EnhOfflineWebView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        initProxy();
    }

    public EnhOfflineWebView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        initProxy();
    }
}
