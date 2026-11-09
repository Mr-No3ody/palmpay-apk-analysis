package R3;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankAddLinkCardWebFragment;
import com.flexibank.sdk.core.viewmodel.FlexiBankAndroidXWebView;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewWrapper;
import com.transsnet.mtn.sdk.ui.view.avloading.AVLoadingIndicatorView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import j4.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import mh.i;
import mono.connect.kit.ConnectKitActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p281s7.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7915b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f7914a = i7;
        this.f7915b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        switch (this.f7914a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                super.onPageFinished(view, url);
                FlexiBankAddLinkCardWebFragment flexiBankAddLinkCardWebFragment = (FlexiBankAddLinkCardWebFragment) this.f7915b;
                String str = flexiBankAddLinkCardWebFragment.f21940b;
                if (TextUtils.isEmpty(url) || !y.m(url, "https://www.palmpay.com/complete?reference", false)) {
                    if ("https://standard.paystack.co/close".equals(url) || "https://www.palmpay.com/complete".equals(url)) {
                        FlexiBankAndroidXWebView flexiBankAndroidXWebView = flexiBankAddLinkCardWebFragment.f21999p;
                        if (flexiBankAndroidXWebView != null) {
                            flexiBankAndroidXWebView.destroy();
                        }
                        FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).payLoading();
                        FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).queryPayResult("", "");
                        break;
                    } else if (!TextUtils.isEmpty(url) && y.m(url, "https://www.palmpay.com", false)) {
                        p006a4.c cVar = (p006a4.c) j.f38294b.get().a(Uri.parse(url).getQueryParameter("resp"), p006a4.c.class);
                        if (!TransType.TRANS_SCENE_REFUND.equals(cVar != null ? cVar.getResponsecode() : null)) {
                            FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).showAlertDialog(cVar != null ? cVar.getResponsemessage() : null);
                        } else {
                            FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).payLoading();
                            FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackR = FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment);
                            String responsetoken = cVar.getResponsetoken();
                            if (responsetoken == null) {
                                responsetoken = "";
                            }
                            String transactionno = cVar.getTransactionno();
                            flexiBankPayVerificationCallbackR.queryPayResult(responsetoken, transactionno != null ? transactionno : "");
                        }
                        break;
                    }
                } else {
                    Uri uri = Uri.parse(url);
                    String queryParameter = uri.getQueryParameter("reference");
                    String queryParameter2 = uri.getQueryParameter("respCode");
                    String queryParameter3 = uri.getQueryParameter("respMsg");
                    if (!"00000000".equals(queryParameter2)) {
                        FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).showAlertDialog(queryParameter3);
                    } else {
                        FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).payLoading();
                        FlexiBankAddLinkCardWebFragment.r(flexiBankAddLinkCardWebFragment).queryPayResult("", queryParameter);
                    }
                    break;
                }
                break;
            case 1:
                super.onPageFinished(view, url);
                ((i) this.f7915b).f39791e.a();
                break;
            case 2:
            default:
                super.onPageFinished(view, url);
                break;
            case 3:
                ConnectKitActivity connectKitActivity = (ConnectKitActivity) this.f7915b;
                connectKitActivity.f39793b.setVisibility(8);
                connectKitActivity.f39792a.setVisibility(8);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
                    p273rg.a aVar = new p273rg.a("OPENED", jSONObject);
                    p184m8.b bVar = p273rg.c.a().f41988c;
                    if (bVar != null) {
                        bVar.run(aVar);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i7 = this.f7914a;
        super.onPageStarted(webView, str, bitmap);
        switch (i7) {
            case 1:
                AVLoadingIndicatorView aVLoadingIndicatorView = ((i) this.f7915b).f39791e;
                aVLoadingIndicatorView.f25743a = -1L;
                aVLoadingIndicatorView.f25746d = false;
                aVLoadingIndicatorView.removeCallbacks(aVLoadingIndicatorView.f25747e);
                if (!aVLoadingIndicatorView.f25745c) {
                    aVLoadingIndicatorView.postDelayed(aVLoadingIndicatorView.f25748f, 100L);
                    aVLoadingIndicatorView.f25745c = true;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f7914a) {
            case 1:
                webView.loadUrl(str);
                return true;
            case 2:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("targetUrl", str);
                WebView webView2 = (WebView) this.f7915b;
                ((RNCWebView) webView2).a(webView2, new r(writableMapCreateMap, RNCWebViewWrapper.f24683b.getReactTagFromWebView(webView2)));
                return true;
            case 3:
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
