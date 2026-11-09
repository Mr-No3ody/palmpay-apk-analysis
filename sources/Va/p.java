package Va;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
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
import com.palmpay.lib.webview.container.PPWebViewClient;
import com.palmpay.lib.webview.container.fast.WebViewCache;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.transsnet.palmpay.core.web.JsInterface;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PPWebViewClient f10278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f10279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JsInterface f10280c;

    static {
        new o(null);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        JsInterface jsInterface;
        if (str != null && (jsInterface = this.f10280c) != null) {
            jsInterface.f28591e = str;
        }
        this.f10278a.doUpdateVisitedHistory(webView, str, z3);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f10278a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f10278a.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f10278a.onPageCommitVisible(webView, str);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        String str2;
        JsInterface jsInterface;
        if (str != null && (jsInterface = this.f10280c) != null) {
            jsInterface.f28591e = str;
        }
        m mVar = this.f10279b;
        if (mVar == null || mVar.f10270d || webView == null || str == null || StringsKt.F(str) || !y.m(str, "http", true) || mVar.f10274h) {
            webView2 = webView;
            str2 = str;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - mVar.f10273g;
            long j6 = jElapsedRealtime < 0 ? 0L : jElapsedRealtime;
            long j10 = mVar.f10275i;
            if (mVar.f10270d || mVar.f10274h || j10 != j10) {
                webView2 = webView;
                str2 = str;
            } else {
                webView2 = webView;
                str2 = str;
                webView2.evaluateJavascript("(function() {\n    try {\n        var nav = (performance.getEntriesByType && performance.getEntriesByType('navigation')[0]) || null;\n        var timing = performance.timing || null;\n        var paints = (performance.getEntriesByType && performance.getEntriesByType('paint')) || [];\n        var supportsGetEntriesByType = !!(performance && performance.getEntriesByType);\n        var paintEntryCount = paints ? paints.length : -1;\n        var navigationEntryAvailable = nav ? 1 : 0;\n        function getPaint(name) {\n            for (var i = 0; i < paints.length; i++) {\n                if (paints[i] && paints[i].name === name) {\n                    return paints[i].startTime;\n                }\n            }\n            return -1;\n        }\n        var fp = getPaint('first-paint');\n        var fcp = getPaint('first-contentful-paint');\n        var loadEventEnd = nav ? nav.loadEventEnd : (timing ? (timing.loadEventEnd - timing.navigationStart) : -1);\n        var dclEnd = nav ? nav.domContentLoadedEventEnd : (timing ? (timing.domContentLoadedEventEnd - timing.navigationStart) : -1);\n        var ttfb = nav ? nav.responseStart : (timing ? (timing.responseStart - timing.navigationStart) : -1);\n        return [fp, fcp, loadEventEnd, dclEnd, ttfb, supportsGetEntriesByType ? 1 : 0, paintEntryCount, navigationEntryAvailable].join('|');\n    } catch (e) {\n        return 'ERR|' + (e && e.message ? e.message : 'unknown');\n    }\n})();", new i(0, j10, j6, mVar, webView2, str2));
            }
        }
        this.f10278a.onPageFinished(webView2, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        JsInterface jsInterface;
        if (str != null && (jsInterface = this.f10280c) != null) {
            jsInterface.f28591e = str;
        }
        m mVar = this.f10279b;
        if (mVar != null && !mVar.f10270d) {
            mVar.f10276j = 0;
            mVar.f10277k = 0;
            mVar.f10273g = SystemClock.elapsedRealtime();
            mVar.f10274h = false;
            mVar.f10275i = SystemClock.elapsedRealtimeNanos();
            if (!mVar.f10271e) {
                mVar.f10271e = true;
                long j6 = mVar.f10273g - mVar.f10268b;
                if (j6 < 0) {
                    j6 = 0;
                }
                mVar.f10272f = j6;
                F6.d.h("WebPerfCollector", 3, "web perf engine init cost: " + j6 + " ms, url=" + str);
            }
        }
        this.f10278a.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f10278a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f10278a.onReceivedError(webView, i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f10278a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f10278a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f10278a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:3:0x0002, B:10:0x000f, B:13:0x0017, B:14:0x001a), top: B:20:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x0017 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:3:0x0002, B:10:0x000f, B:13:0x0017, B:14:0x001a), top: B:20:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[RETURN] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        String url2;
        if (webView != null) {
            try {
                url = webView.getUrl();
                if (url == null) {
                    url = "";
                }
                if (sslError != null) {
                    url2 = sslError.getUrl();
                } else {
                    url2 = null;
                }
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (!url.equalsIgnoreCase(url2)) {
                    return;
                }
            } catch (Exception e10) {
                Log.e("WrapPPWebViewClient", "onReceivedSslError: ", e10);
            }
        } else {
            url = "";
            if (sslError != null) {
                url2 = sslError.getUrl();
            } else {
                url2 = null;
            }
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            if (!url.equalsIgnoreCase(url2)) {
                return;
            }
        }
        this.f10278a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f10278a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        this.f10278a.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        this.f10278a.onScaleChanged(webView, f10, f11);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f10278a.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f10278a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f10278a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f10278a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f10278a.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f10278a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Map<String, String> responseHeaders;
        System.currentTimeMillis();
        WebResourceResponse webResourceResponseShouldInterceptRequest = this.f10278a.shouldInterceptRequest(webView, webResourceRequest);
        if ("GET".equalsIgnoreCase(webResourceRequest != null ? webResourceRequest.getMethod() : null)) {
            String str = (webResourceResponseShouldInterceptRequest == null || (responseHeaders = webResourceResponseShouldInterceptRequest.getResponseHeaders()) == null) ? null : responseHeaders.get(HeaderUtils.HEADER_CACHE_SOURCE);
            Objects.toString(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            m mVar = this.f10279b;
            if (mVar != null) {
                boolean z3 = Intrinsics.c(str, WebViewCache.SOURCE_MEMORY_CACHE) || Intrinsics.c(str, "file") || Intrinsics.c(str, WebViewCache.SOURCE_OKHTTP_CACHE);
                if (!mVar.f10270d) {
                    mVar.f10276j++;
                    if (z3) {
                        mVar.f10277k++;
                    }
                }
            }
        }
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (webResourceRequest != null) {
            webResourceRequest.getMethod();
        }
        System.currentTimeMillis();
        Objects.toString(url);
        return webResourceResponseShouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f10278a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
