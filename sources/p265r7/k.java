package p265r7;

import android.app.Activity;
import android.webkit.WebSettings;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f41617i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ReadableMap f41623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41625h;

    static {
        new h(null);
    }

    public final void a(RNCWebViewWrapper rNCWebViewWrapper) {
        RNCWebView webView = rNCWebViewWrapper.getWebView();
        if (this.f41624g != null) {
            webView.getSettings().setUserAgentString(this.f41624g);
        } else if (this.f41625h != null) {
            webView.getSettings().setUserAgentString(this.f41625h);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public final void b(RNCWebView rNCWebView) {
        Activity currentActivity = rNCWebView.getThemedReactContext().getCurrentActivity();
        if (this.f41618a && currentActivity != null) {
            j jVar = new j(rNCWebView, currentActivity, currentActivity.getRequestedOrientation());
            jVar.f41601p = this.f41619b;
            jVar.t = this.f41622e;
            rNCWebView.setWebChromeClient(jVar);
            return;
        }
        b bVar = (b) rNCWebView.getWebChromeClient();
        if (bVar != null) {
            bVar.onHideCustomView();
        }
        i iVar = new i(rNCWebView);
        iVar.f41601p = this.f41619b;
        iVar.t = this.f41622e;
        rNCWebView.setWebChromeClient(iVar);
    }
}
