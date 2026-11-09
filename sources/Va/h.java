package Va;

import C0.G;
import android.os.Handler;
import android.webkit.WebView;
import androidx.activity.I;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.web.WebJsCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebJsCallback f10241b;

    public /* synthetic */ h(WebJsCallback webJsCallback, int i7) {
        this.f10240a = i7;
        this.f10241b = webJsCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I onBackPressedDispatcher;
        Handler handler;
        WebJsCallback webJsCallback = this.f10241b;
        switch (this.f10240a) {
            case 0:
                WeakReference weakReference = webJsCallback.f28611b;
                WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
                if (webView != null && !webJsCallback.d(webView.getUrl())) {
                    if (webView.canGoBack()) {
                        webView.goBack();
                        break;
                    } else {
                        E eB = webJsCallback.b();
                        if (eB != null && (onBackPressedDispatcher = eB.getOnBackPressedDispatcher()) != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                    }
                }
                break;
            case 1:
                int i7 = WebJsCallback.t;
                G.u(4, org.greenrobot.eventbus.c.b());
                if (webJsCallback.f28619o && (handler = webJsCallback.f28614e) != null) {
                    handler.post(new h(webJsCallback, 2));
                    break;
                }
                break;
            default:
                int i10 = WebJsCallback.t;
                E eB2 = webJsCallback.b();
                if (eB2 != null) {
                    eB2.finish();
                }
                break;
        }
    }
}
