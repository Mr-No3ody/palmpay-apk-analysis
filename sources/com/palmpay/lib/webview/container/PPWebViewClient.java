package com.palmpay.lib.webview.container;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.airbnb.lottie.model.layer.d;
import com.palmpay.lib.webview.container.widget.SwipeRefreshLayout;
import com.palmpay.lib.webview.offline.monitor.base.IWebPageStatus;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceErrorAdapterImpl;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceRequestAdapterImpl;
import com.palmpay.lib.webview.offline.monitor.impl.EnhWebResourceResponseAdapterImpl;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class PPWebViewClient extends WebViewClient {
    public static final int ERROR_NO_SUPPORT = -999;
    private final WeakReference<Activity> mActivityWeakReference;
    private WebClientCallback mWebClientCallback;
    private IWebPageStatus mWebPageStatus;
    private final WebViewConfig mWebViewConfig;
    private final SwipeRefreshLayout swipeRefreshLayout;

    public PPWebViewClient(Activity activity, WebViewConfig webViewConfig, SwipeRefreshLayout swipeRefreshLayout) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        this.mWebViewConfig = webViewConfig;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Activity activity = this.mActivityWeakReference.get();
        if (activity != null && !activity.isFinishing() && !WebTools.isNetworkConnected(activity) && this.mWebViewConfig.getProgressBar() != null) {
            this.mWebViewConfig.getProgressBar().hide();
        }
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null) {
            webClientCallback.onPageFinished(webView, str);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        super.onPageFinished(webView, str);
        IWebPageStatus iWebPageStatus = this.mWebPageStatus;
        if (iWebPageStatus != null) {
            iWebPageStatus.onPageLoadFinish(str, webView.getProgress());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null) {
            webClientCallback.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i7, String str, String str2) {
        super.onReceivedError(webView, i7, str, str2);
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback == null) {
            IWebPageStatus iWebPageStatus = this.mWebPageStatus;
            if (iWebPageStatus != null) {
                iWebPageStatus.onLoadError(str2, d.j("code = ", i7, ", desc = ", str));
                return;
            }
            return;
        }
        webClientCallback.onReceivedError(webView, i7, str, str2);
        IWebPageStatus iWebPageStatus2 = this.mWebPageStatus;
        if (iWebPageStatus2 != null) {
            iWebPageStatus2.onLoadError(str2, d.j("code = ", i7, ", desc = ", str));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null) {
            webClientCallback.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
        IWebPageStatus iWebPageStatus = this.mWebPageStatus;
        if (iWebPageStatus != null) {
            iWebPageStatus.onLoadError(webResourceRequest == null ? null : new EnhWebResourceRequestAdapterImpl(null, webResourceRequest), webResourceResponse != null ? new EnhWebResourceResponseAdapterImpl(null, webResourceResponse) : null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback == null || !webClientCallback.onReceivedSslError(webView, sslErrorHandler, sslError)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
            builder.setMessage("SSL authentication failed, continue to visit?");
            builder.setPositiveButton("continue", new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.container.PPWebViewClient.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i7) {
                    sslErrorHandler.proceed();
                }
            });
            builder.setNegativeButton(PPRNBridge.DIALOG_ACTION_CANCEL, new DialogInterface.OnClickListener() { // from class: com.palmpay.lib.webview.container.PPWebViewClient.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i7) {
                    sslErrorHandler.cancel();
                }
            });
            builder.create().show();
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (!renderProcessGoneDetail.didCrash()) {
            return true;
        }
        Log.e("TAG", "The WebView rendering process crashed.");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        super.onScaleChanged(webView, f10, f11);
        if (f11 - f10 > 7.0f) {
            webView.setInitialScale((int) ((f10 / f11) * 100.0f));
        }
    }

    public void setWebClientCallback(WebClientCallback webClientCallback) {
        this.mWebClientCallback = webClientCallback;
    }

    public void setWebPageStatus(IWebPageStatus iWebPageStatus) {
        this.mWebPageStatus = iWebPageStatus;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.mWebViewConfig.getLoader() != null) {
            return this.mWebViewConfig.getLoader().onRequest(webResourceRequest, this.mWebPageStatus);
        }
        WebClientCallback webClientCallback = this.mWebClientCallback;
        return webClientCallback != null ? webClientCallback.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null && webClientCallback.shouldOverrideUrlLoading(webView, webResourceRequest)) {
            return true;
        }
        String string = webResourceRequest.getUrl().toString();
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        WebClientCallback webClientCallback2 = this.mWebClientCallback;
        if (webClientCallback2 != null) {
            if (webClientCallback2.isOpenThirdApp(string)) {
                return true;
            }
            return !WebTools.checkUrlHost(string);
        }
        Activity activity = this.mActivityWeakReference.get();
        if (activity == null || activity.isFinishing()) {
            return !WebTools.checkUrlHost(string);
        }
        if (WebTools.handleThirdApp(activity, string)) {
            return true;
        }
        return !WebTools.checkUrlHost(string);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null && webClientCallback.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        WebClientCallback webClientCallback2 = this.mWebClientCallback;
        if (webClientCallback2 != null) {
            if (webClientCallback2.isOpenThirdApp(str)) {
                return true;
            }
            return !WebTools.checkUrlHost(str);
        }
        Activity activity = this.mActivityWeakReference.get();
        if (activity != null && !activity.isFinishing()) {
            if (WebTools.handleThirdApp(activity, str)) {
                return true;
            }
            return !WebTools.checkUrlHost(str);
        }
        return !WebTools.checkUrlHost(str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        WebClientCallback webClientCallback = this.mWebClientCallback;
        if (webClientCallback != null) {
            webClientCallback.onReceivedError(webView, webResourceRequest, webResourceError);
        } else if (webResourceRequest.isForMainFrame()) {
            this.mWebViewConfig.showErrorView(webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "");
        }
        IWebPageStatus iWebPageStatus = this.mWebPageStatus;
        if (iWebPageStatus != null) {
            iWebPageStatus.onLoadError(webResourceRequest == null ? null : new EnhWebResourceRequestAdapterImpl(null, webResourceRequest), webResourceError != null ? new EnhWebResourceErrorAdapterImpl(null, webResourceError) : null);
        }
    }
}
