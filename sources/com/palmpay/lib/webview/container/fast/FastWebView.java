package com.palmpay.lib.webview.container.fast;

import N8.q0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.config.FastCacheMode;
import com.palmpay.lib.webview.container.fast.cookie.FastCookieManager;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FastWebView extends WebView implements FastOpenApi {
    private InnerFastClient mFastClient;
    private boolean mRecycled;
    private WebViewClient mUserWebViewClient;

    public FastWebView(Context context) {
        this(context, null);
    }

    public static void preload(Context context, String str) {
        new FastWebView(context.getApplicationContext()).loadUrl(str);
    }

    public static void setDebug(boolean z3) {
        LogUtils.DEBUG = z3;
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void addResourceInterceptor(ResourceInterceptor resourceInterceptor) {
        InnerFastClient innerFastClient = this.mFastClient;
        if (innerFastClient != null) {
            innerFastClient.addResourceInterceptor(resourceInterceptor);
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        return !this.mRecycled && super.canGoBack();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        release();
        super.destroy();
    }

    public FastCookieManager getFastCookieManager() {
        return FastCookieManager.getInstance();
    }

    @Override // android.webkit.WebView
    public WebViewClient getWebViewClient() {
        WebViewClient webViewClient = this.mUserWebViewClient;
        return webViewClient != null ? webViewClient : super.getWebViewClient();
    }

    public boolean isRecycled() {
        return this.mRecycled;
    }

    public void release() {
        stopLoading();
        loadUrl("");
        setRecycled(true);
        setWebViewClient(null);
        setWebChromeClient(null);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setBlockNetworkImage(false);
        clearHistory();
        clearCache(true);
        removeAllViews();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        InnerFastClient innerFastClient = this.mFastClient;
        if (innerFastClient != null) {
            innerFastClient.destroy();
        }
        getFastCookieManager().destroy();
    }

    public void runJs(String str, Object... objArr) {
        StringBuilder sbQ = q0.q("javascript:", str, "(");
        if (objArr != null && objArr.length > 0) {
            for (int i7 = 0; i7 < objArr.length; i7++) {
                Object obj = objArr[i7];
                if (obj != null) {
                    if (obj instanceof String) {
                        obj = "'" + obj + "'";
                    }
                    sbQ.append(obj);
                    if (i7 != objArr.length - 1) {
                        sbQ.append(",");
                    }
                }
            }
        }
        sbQ.append(");");
        runJs(sbQ.toString());
    }

    public void setCacheMode(FastCacheMode fastCacheMode) {
        setCacheMode(fastCacheMode, null);
    }

    public void setRecycled(boolean z3) {
        this.mRecycled = z3;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        InnerFastClient innerFastClient = this.mFastClient;
        if (innerFastClient != null) {
            innerFastClient.updateProxyClient(webViewClient);
        } else {
            super.setWebViewClient(webViewClient);
        }
        this.mUserWebViewClient = webViewClient;
    }

    public FastWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void setCacheMode(FastCacheMode fastCacheMode, CacheConfig cacheConfig) {
        if (fastCacheMode == FastCacheMode.DEFAULT) {
            this.mFastClient = null;
            WebViewClient webViewClient = this.mUserWebViewClient;
            if (webViewClient != null) {
                setWebViewClient(webViewClient);
                return;
            }
            return;
        }
        InnerFastClient innerFastClient = new InnerFastClient(this);
        this.mFastClient = innerFastClient;
        WebViewClient webViewClient2 = this.mUserWebViewClient;
        if (webViewClient2 != null) {
            innerFastClient.updateProxyClient(webViewClient2);
        }
        this.mFastClient.setCacheMode(fastCacheMode, cacheConfig);
        super.setWebViewClient(this.mFastClient);
    }

    public FastWebView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mRecycled = false;
    }

    private void runJs(String str) {
        loadUrl(str);
    }
}
