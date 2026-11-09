package com.palmpay.lib.webview.offline.widget;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.airbnb.lottie.model.layer.d;
import com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceErrorAdapterImpl;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceRequestAdapterImpl;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceResponseAdapterImpl;

/* JADX INFO: loaded from: classes3.dex */
public class EnhWebViewClient extends WebViewClient {
    private WebViewClient mDelegate;
    private final IWebPageStatus mWebPageStatus;

    public EnhWebViewClient(IWebPageStatus iWebPageStatus) {
        this.mWebPageStatus = iWebPageStatus;
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
    @RequiresApi(api = 23)
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
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
        this.mWebPageStatus.onPageLoadFinish(str, webView.getProgress());
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
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
        this.mWebPageStatus.onLoadError(str2, d.j("code = ", i7, ", desc = ", str));
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
        this.mWebPageStatus.onLoadError(webResourceRequest == null ? null : new EnhWebResourceRequestAdapterImpl(null, webResourceRequest), webResourceResponse != null ? new EnhWebResourceResponseAdapterImpl(null, webResourceResponse) : null);
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
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClient = this.mDelegate;
        return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 27)
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
        } else {
            super.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
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

    public void setDelegate(WebViewClient webViewClient) {
        this.mDelegate = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.mDelegate;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
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

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.mDelegate;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
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
        this.mWebPageStatus.onLoadError(webResourceRequest == null ? null : new EnhWebResourceRequestAdapterImpl(null, webResourceRequest), webResourceError != null ? new EnhWebResourceErrorAdapterImpl(null, webResourceError) : null);
    }
}
