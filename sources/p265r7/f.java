package p265r7;

import E.N;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewWrapper;
import java.util.concurrent.atomic.AtomicReference;
import p229p2.a;
import p281s7.b;
import p281s7.h;
import p281s7.j;
import p281s7.n;
import p281s7.t;
import p281s7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N f41611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f41612c;

    public final WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.f41610a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        super.doUpdateVisitedHistory(webView, str, z3);
        ((RNCWebView) webView).a(webView, new n(a(webView, str), RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.f41610a) {
            return;
        }
        RNCWebView rNCWebView = (RNCWebView) webView;
        if (rNCWebView.getSettings().getJavaScriptEnabled() && (str2 = rNCWebView.f24670a) != null && !TextUtils.isEmpty(str2)) {
            rNCWebView.evaluateJavascript("(function() {\n" + rNCWebView.f24670a + ";\n})();", null);
            rNCWebView.b();
        }
        int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new j(a(webView, str), reactTagFromWebView));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.f41610a = false;
        RNCWebView rNCWebView = (RNCWebView) webView;
        if (!rNCWebView.getSettings().getJavaScriptEnabled() || (str2 = rNCWebView.f24671b) == null || TextUtils.isEmpty(str2)) {
            return;
        }
        rNCWebView.evaluateJavascript("(function() {\n" + rNCWebView.f24671b + ";\n})();", null);
        rNCWebView.b();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        super.onReceivedError(webView, i7, str, str2);
        this.f41610a = true;
        RNCWebViewWrapper.a aVar = RNCWebViewWrapper.f24683b;
        int reactTagFromWebView = aVar.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new j(a(webView, str2), reactTagFromWebView));
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i7);
        writableMapA.putString("description", str);
        int reactTagFromWebView2 = aVar.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView2).dispatchEvent(new h(writableMapA, reactTagFromWebView2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f41612c;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f41588a, aVar.f41589b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new p281s7.f(writableMapA, reactTagFromWebView));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            str = "The certificate is not yet valid";
        } else if (primaryError == 1) {
            str = "The certificate has expired";
        } else if (primaryError == 2) {
            str = "Hostname mismatch";
        } else if (primaryError == 3) {
            str = "The certificate authority is not trusted";
        } else if (primaryError != 4) {
            str = primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred";
        } else {
            str = "The date of the certificate is invalid";
        }
        String strConcat = "SSL error: ".concat(str);
        if (url.equalsIgnoreCase(url2)) {
            onReceivedError(webView, primaryError, strConcat, url2);
            return;
        }
        WritableMap writableMapA = a(webView, url2);
        writableMapA.putDouble("code", primaryError);
        writableMapA.putString("description", strConcat);
        int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new b(writableMapA, reactTagFromWebView));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            Log.e("RNCWebViewClient", "The WebView rendering process crashed.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new t(writableMapA, reactTagFromWebView));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        double d2;
        AtomicReference atomicReference;
        Double dValueOf;
        RNCWebView rNCWebView = (RNCWebView) webView;
        if (rNCWebView.getReactApplicationContext().getJavaScriptContextHolder().getContext() == 0 || rNCWebView.f24676g == null) {
            a.v("RNCWebViewClient", "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f41611b.f1938b = true;
            int reactTagFromWebView = RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new v(a(webView, str), reactTagFromWebView));
            return true;
        }
        o oVar = p.f41636g;
        synchronized (oVar) {
            d2 = oVar.f41634a;
            oVar.f41634a = 1.0d + d2;
            atomicReference = new AtomicReference(n.f41630a);
            oVar.f41635b.put(Double.valueOf(d2), atomicReference);
            dValueOf = Double.valueOf(d2);
        }
        WritableMap writableMapA = a(webView, str);
        writableMapA.putDouble("lockIdentifier", d2);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMapA);
        writableNativeMap.putString("messagingModuleName", rNCWebView.f24675f);
        rNCWebView.f24676g.onShouldStartLoadWithRequest(writableNativeMap);
        try {
            synchronized (atomicReference) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                while (atomicReference.get() == n.f41630a) {
                    if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                        a.v("RNCWebViewClient", "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                        o oVar2 = p.f41636g;
                        synchronized (oVar2) {
                            oVar2.f41635b.remove(dValueOf);
                        }
                        return false;
                    }
                    atomicReference.wait(250L);
                }
                boolean z3 = atomicReference.get() == n.f41631b;
                o oVar3 = p.f41636g;
                synchronized (oVar3) {
                    oVar3.f41635b.remove(dValueOf);
                }
                return z3;
            }
        } catch (InterruptedException e10) {
            a.i("RNCWebViewClient", "shouldOverrideUrlLoading was interrupted while waiting for result.", e10);
            o oVar4 = p.f41636g;
            synchronized (oVar4) {
                oVar4.f41635b.remove(dValueOf);
                return false;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
