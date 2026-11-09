package p265r7;

import android.webkit.JavascriptInterface;
import com.flexibank.sdk.g;
import com.reactnativecommunity.webview.RNCWebView;
import p229p2.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RNCWebView f41609a;

    @JavascriptInterface
    public void postMessage(String str) {
        RNCWebView rNCWebView = this.f41609a;
        if (rNCWebView.getMessagingEnabled()) {
            rNCWebView.post(new g(27, this, str));
        } else {
            a.v("RNCWebViewBridge", "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
        }
    }
}
