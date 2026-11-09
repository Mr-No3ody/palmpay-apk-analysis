package com.palmpay.lib.webview.container.fast;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.config.FastCacheMode;
import com.palmpay.lib.webview.container.fast.offline.Destroyable;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;

/* JADX INFO: loaded from: classes3.dex */
class InnerFastClient extends WebViewClient implements FastOpenApi, Destroyable {
    private static final String METHOD_GET = "GET";
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private WebViewClient mDelegate;
    private FastWebView mOwner;
    private final String mUserAgent;
    private WebViewCache mWebViewCache;
    private final int mWebViewCacheMode;

    public InnerFastClient(FastWebView fastWebView) {
        this.mOwner = fastWebView;
        WebSettings settings = fastWebView.getSettings();
        this.mWebViewCacheMode = settings.getCacheMode();
        this.mUserAgent = settings.getUserAgentString();
        this.mWebViewCache = new WebViewCacheImpl(fastWebView.getContext());
    }

    @RequiresApi(api = 21)
    private WebResourceResponse loadFromWebViewCache(WebResourceRequest webResourceRequest) {
        String strTrim = webResourceRequest.getUrl().getScheme().trim();
        String strTrim2 = webResourceRequest.getMethod().trim();
        if ((TextUtils.equals(SCHEME_HTTP, strTrim) || TextUtils.equals("https", strTrim)) && strTrim2.equalsIgnoreCase("GET")) {
            return this.mWebViewCache.getResource(webResourceRequest, this.mWebViewCacheMode, this.mUserAgent);
        }
        return null;
    }

    @RequiresApi(api = 21)
    private WebResourceResponse onIntercept(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseShouldInterceptRequest;
        WebViewClient webViewClient = this.mDelegate;
        return (webViewClient == null || (webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest)) == null) ? loadFromWebViewCache(webResourceRequest) : webResourceResponseShouldInterceptRequest;
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void addResourceInterceptor(ResourceInterceptor resourceInterceptor) {
        WebViewCache webViewCache = this.mWebViewCache;
        if (webViewCache != null) {
            webViewCache.addResourceInterceptor(resourceInterceptor);
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        WebViewCache webViewCache = this.mWebViewCache;
        if (webViewCache != null) {
            webViewCache.destroy();
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z3);
        } else {
            super.doUpdateVisitedHistory(webView, str, z3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.mOwner.isRecycled() && !str.equals("about:blank")) {
            this.mOwner.setRecycled(false);
            this.mOwner.clearHistory();
        }
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i7, String str, String str2) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i7, str, str2);
        } else {
            super.onReceivedError(webView, i7, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f10, f11);
        } else {
            super.onScaleChanged(webView, f10, f11);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void setCacheMode(FastCacheMode fastCacheMode, CacheConfig cacheConfig) {
        WebViewCache webViewCache = this.mWebViewCache;
        if (webViewCache != null) {
            webViewCache.setCacheMode(fastCacheMode, cacheConfig);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return onIntercept(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.mDelegate;
        return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
        webView.loadUrl(str);
        return true;
    }

    public void updateProxyClient(WebViewClient webViewClient) {
        this.mDelegate = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(webView, str);
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
