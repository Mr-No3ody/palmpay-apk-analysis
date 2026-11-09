package p187mc;

import Rd.C0593i;
import Wf.t0;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.echat.EchatActivity;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39644a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f39645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f39646c;

    public b(AndroidXWebView androidXWebView, BettingQuickBetWebActivity bettingQuickBetWebActivity) {
        this.f39645b = androidXWebView;
        this.f39646c = bettingQuickBetWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        switch (this.f39644a) {
            case 0:
                super.onPageFinished(view, url);
                ((EchatActivity) this.f39646c).showLoadingDialog(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                super.onPageFinished(view, url);
                BettingQuickBetWebActivity bettingQuickBetWebActivity = (BettingQuickBetWebActivity) this.f39646c;
                String str = bettingQuickBetWebActivity.f26698i;
                if (str != null && str.length() != 0) {
                    if (!TextUtils.equals(url, bettingQuickBetWebActivity.f26698i)) {
                        if (!TextUtils.equals(url, bettingQuickBetWebActivity.f26698i + "/index")) {
                            if (!TextUtils.equals(url, bettingQuickBetWebActivity.f26698i + "/index")) {
                            }
                        }
                    }
                    t0 t0Var = bettingQuickBetWebActivity.f26697g;
                    if (t0Var != null) {
                        t0Var.cancel((CancellationException) null);
                    }
                    C0593i c0593i = (C0593i) bettingQuickBetWebActivity.f27334c;
                    if (c0593i != null) {
                        c0593i.f8334d.a();
                    }
                    C0593i c0593i2 = (C0593i) bettingQuickBetWebActivity.f27334c;
                    if (c0593i2 != null) {
                        h.s(c0593i2.f8332b, false);
                    }
                    bettingQuickBetWebActivity.f26698i = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        switch (this.f39644a) {
            case 0:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                super.onRenderProcessGone(this.f39645b, detail);
                return true;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(detail, "detail");
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                super.onRenderProcessGone((AndroidXWebView) this.f39645b, detail);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String str) {
        switch (this.f39644a) {
            case 0:
                ((EchatActivity) this.f39646c).l(view, str);
                return true;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                return ((BettingQuickBetWebActivity) this.f39646c).q(view, str);
        }
    }

    public b(EchatActivity echatActivity, WebView webView) {
        this.f39646c = echatActivity;
        this.f39645b = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        switch (this.f39644a) {
            case 0:
                ((EchatActivity) this.f39646c).l(view, request.getUrl().toString());
                return true;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                return ((BettingQuickBetWebActivity) this.f39646c).q(view, request.getUrl().toString());
        }
    }
}
