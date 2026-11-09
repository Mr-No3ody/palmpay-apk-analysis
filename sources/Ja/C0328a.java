package Ja;

import Pa.C0525w;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.BindCardResponseBean;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.fragment.verify.AddLinkCardWebFragment;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;

/* JADX INFO: renamed from: Ja.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0328a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4640b;

    public /* synthetic */ C0328a(Object obj, int i7) {
        this.f4639a = i7;
        this.f4640b = obj;
    }

    public void a(WebView webView, String str, int i7, String str2) {
        if (i7 == -6 && "net::ERR_CONNECTION_CLOSED".equals(str2)) {
            String str3 = (String) this.f4640b;
            if (!TextUtils.isEmpty(str3) && str3.equals(str) && (webView instanceof ActivityWebView)) {
                ((ActivityWebView) webView).loadUrl("file:///android_asset/network_error.html");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z3) {
        switch (this.f4639a) {
            case 1:
                if (str != null && (webView instanceof ActivityWebView)) {
                    ((ActivityWebView) webView).f28204d = str;
                }
                super.doUpdateVisitedHistory(webView, str, z3);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f4639a) {
            case 0:
                super.onPageFinished(webView, str);
                AddLinkCardWebFragment addLinkCardWebFragment = (AddLinkCardWebFragment) this.f4640b;
                Object[] objArr = {C0.G.o("url:", str)};
                String str2 = addLinkCardWebFragment.f27317a;
                F6.d.h(str2, 3, objArr);
                if (TextUtils.isEmpty(str) || !str.startsWith("https://www.palmpay.com/complete?reference")) {
                    if ("https://standard.paystack.co/close".equals(str) || "https://www.palmpay.com/complete".equals(str)) {
                        AndroidXWebView androidXWebView = addLinkCardWebFragment.f27925i;
                        if (androidXWebView != null) {
                            androidXWebView.destroy();
                        }
                        ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).payLoading();
                        ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).queryPayResult("", "");
                        break;
                    } else if (!TextUtils.isEmpty(str) && str.startsWith("https://www.palmpay.com")) {
                        String queryParameter = Uri.parse(str).getQueryParameter("resp");
                        F6.d.h(str2, 3, C0.G.o("jsonStr: ", queryParameter));
                        C0525w.f().getClass();
                        BindCardResponseBean bindCardResponseBean = (BindCardResponseBean) C0525w.d(queryParameter, BindCardResponseBean.class);
                        if (!TransType.TRANS_SCENE_REFUND.equals(bindCardResponseBean.getResponsecode())) {
                            ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).showAlertDialog(bindCardResponseBean.getResponsemessage());
                        } else {
                            ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).payLoading();
                            ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).queryPayResult(bindCardResponseBean.getResponsetoken(), bindCardResponseBean.getTransactionno());
                        }
                        break;
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    String queryParameter2 = uri.getQueryParameter("reference");
                    String queryParameter3 = uri.getQueryParameter("respCode");
                    String queryParameter4 = uri.getQueryParameter("respMsg");
                    if (!"00000000".equals(queryParameter3)) {
                        ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).showAlertDialog(queryParameter4);
                    } else {
                        ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).payLoading();
                        ((PayVerificationCallback) addLinkCardWebFragment.getActivity()).queryPayResult("", queryParameter2);
                    }
                    break;
                }
                break;
            case 1:
                if (str != null && (webView instanceof ActivityWebView)) {
                    ((ActivityWebView) webView).f28204d = str;
                }
                super.onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f4639a) {
            case 1:
                if (str != null && (webView instanceof ActivityWebView)) {
                    ((ActivityWebView) webView).f28204d = str;
                }
                super.onPageStarted(webView, str, bitmap);
                break;
            case 2:
                ThirdPartyMerchantActivity thirdPartyMerchantActivity = (ThirdPartyMerchantActivity) this.f4640b;
                super.onPageStarted(webView, str, bitmap);
                try {
                    WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() != webBackForwardListCopyBackForwardList.getSize() - 1 && str.startsWith(com.transsnet.palmpay.core.config.d.g("/static/open/auth/index.html"))) {
                        thirdPartyMerchantActivity.finish();
                        break;
                    }
                } catch (Exception e10) {
                    F6.d.c(thirdPartyMerchantActivity.TAG, "onPageStarted: ", e10);
                    return;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f4639a) {
            case 1:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                F6.d.h("ActivityWebView", 3, "onReceivedError()  errorCode: " + webResourceError.getErrorCode() + ", desc ription: " + ((Object) webResourceError.getDescription()) + ", url:" + webResourceRequest.getUrl());
                a(webView, webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
                break;
            case 2:
                if (webResourceRequest.isForMainFrame()) {
                    webView.loadUrl("file:///android_asset/network_error.html");
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f4639a) {
            case 1:
                StringBuilder sbE = androidx.camera.camera2.internal.F.e(webResourceResponse.getStatusCode(), "onReceivedHttpError()  statusCode: ", ", url:");
                sbE.append(webResourceRequest.getUrl());
                F6.d.h("ActivityWebView", 3, sbE.toString());
                if (webResourceResponse.getStatusCode() >= 400 && webResourceResponse.getStatusCode() <= 700) {
                    String str = (String) this.f4640b;
                    if (!TextUtils.isEmpty(str) && str.equals(webResourceRequest.getUrl()) && (webView instanceof ActivityWebView)) {
                        ((ActivityWebView) webView).loadUrl("file:///android_asset/network_error.html");
                        break;
                    }
                }
                break;
            case 2:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                int statusCode = webResourceResponse.getStatusCode();
                if (404 == statusCode || 500 == statusCode) {
                    webView.loadUrl("file:///android_asset/network_error.html");
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f4639a) {
            case 0:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                super.onRenderProcessGone(webView, renderProcessGoneDetail);
                return true;
            case 1:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                super.onRenderProcessGone(webView, renderProcessGoneDetail);
                return true;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                super.onRenderProcessGone(webView, renderProcessGoneDetail);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f4639a) {
            case 1:
                Uri url = webResourceRequest.getUrl();
                if (url == null) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
                F6.d.h("ActivityWebView", 3, "host:" + url.getHost() + ",  path: " + url.getPath() + ",  prot: " + url.getPort() + ",  scheme: " + url.getScheme() + ",  query: " + url.getQuery() + ",  uri.toString: " + url.toString() + " " + (System.currentTimeMillis() - jCurrentTimeMillis));
                return webResourceResponseShouldInterceptRequest;
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f4639a) {
            case 1:
                if (TextUtils.isEmpty(str)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                try {
                    if (str.startsWith("tel:")) {
                        ActivityUtils.startActivity(IntentUtils.getDialIntent(str.substring(4)));
                    } else {
                        if (!str.startsWith("mailto:")) {
                            return super.shouldOverrideUrlLoading(webView, str);
                        }
                        ActivityUtils.startActivity(IntentUtils.getSendEmailIntent(str.substring(7), true));
                    }
                    break;
                } catch (Exception unused) {
                }
                return true;
            case 2:
                webView.loadUrl(str);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C0328a(String str) {
        this.f4639a = 1;
        this.f4640b = str;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i7, String str, String str2) {
        switch (this.f4639a) {
            case 1:
                super.onReceivedError(webView, i7, str, str2);
                F6.d.h("ActivityWebView", 3, "onReceivedError()  errorCode: " + i7 + ", description: " + str + ", url:" + webView.getUrl() + ", failingUrl = " + str2);
                a(webView, str2, i7, str);
                break;
            case 2:
                break;
            default:
                super.onReceivedError(webView, i7, str, str2);
                break;
        }
    }

    private final void b(WebView webView, int i7, String str, String str2) {
    }
}
