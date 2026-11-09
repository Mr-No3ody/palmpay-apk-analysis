package com.palmpay.lib.webview.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.webview.R;
import com.palmpay.lib.webview.cache.ICacheWebView;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.container.widget.SwipeRefreshLayout;
import com.palmpay.lib.webview.offline.monitor.impl.OfflineWebPageStatus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewConfig {
    private final Activity activity;
    private final WebCacheLoader loader;
    private final int mErrorLayoutId;
    private final String mErrorTitle;
    private View mErrorView;
    private WebProgress mProgressBar;
    private final PPWebChromeClient mWebChromeClient;
    private WebView mWebView;
    private final OfflineWebPageStatus offlineWebPageStatus;
    private LoadJsHolder webLoadJsHolder;

    public static class Builder {
        private Map<String, String> extraHeaders;
        private Map<String, Object> interfaceMap;
        private final Activity mActivity;
        private WebView mCustomWebView;
        private int mErrorLayoutId;
        private String mErrorTitle;
        private ViewGroup.LayoutParams mLayoutParams;
        private int mProgressEndColor;
        private String mProgressEndColorString;
        private int mProgressHeightDp;
        private int mProgressStartColor;
        private String mProgressStartColorString;
        private WebChromeCallback mWebChromeCallback;
        private WebClientCallback mWebClientCallback;
        private ViewGroup mWebContainer;
        private String userAgent;
        private WebCacheLoader webCacheLoader;
        private boolean mUseWebProgress = true;
        private boolean mPullRefresh = true;
        private int mIndex = -1;
        private boolean isFixScreenLandscape = false;
        private boolean isFixScreenPortrait = false;

        public Builder(Activity activity) {
            this.mActivity = activity;
        }

        public Builder addExtraHeaders(String str, String str2) {
            if (this.extraHeaders == null) {
                this.extraHeaders = new HashMap();
            }
            this.extraHeaders.put(str, str2);
            return this;
        }

        public Builder addJavascriptInterface(String str, Object obj) {
            if (this.interfaceMap == null) {
                this.interfaceMap = new HashMap();
            }
            this.interfaceMap.put(str, obj);
            return this;
        }

        public WebViewConfig get() {
            return new WebViewConfig(this, 0);
        }

        public WebViewConfig loadUrl(String str) {
            WebViewConfig webViewConfig = get();
            webViewConfig.loadUrl(str, this.extraHeaders);
            return webViewConfig;
        }

        public Builder setCacheLoader(WebCacheLoader webCacheLoader) {
            this.webCacheLoader = webCacheLoader;
            return this;
        }

        public Builder setCustomWebView(WebView webView) {
            this.mCustomWebView = webView;
            return this;
        }

        public Builder setErrorLayout(@LayoutRes int i7) {
            this.mErrorLayoutId = i7;
            return this;
        }

        public Builder setFixScreenLandscape(boolean z3) {
            this.isFixScreenLandscape = z3;
            return this;
        }

        public Builder setFixScreenPortrait(boolean z3) {
            this.isFixScreenPortrait = z3;
            return this;
        }

        public Builder setPullRefresh(boolean z3) {
            this.mPullRefresh = z3;
            return this;
        }

        public Builder setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Deprecated
        public Builder setWebChromeCallback(WebChromeCallback webChromeCallback) {
            this.mWebChromeCallback = webChromeCallback;
            return this;
        }

        @Deprecated
        public Builder setWebClientCallback(WebClientCallback webClientCallback) {
            this.mWebClientCallback = webClientCallback;
            return this;
        }

        public Builder setWebParent(@NonNull ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
            this.mWebContainer = viewGroup;
            this.mLayoutParams = layoutParams;
            return this;
        }

        public Builder useWebProgress(boolean z3) {
            this.mUseWebProgress = z3;
            return this;
        }

        public Builder setErrorLayout(@LayoutRes int i7, String str) {
            this.mErrorLayoutId = i7;
            this.mErrorTitle = str;
            return this;
        }

        public Builder useWebProgress(int i7) {
            return useWebProgress(i7, i7, 3);
        }

        public Builder setWebParent(@NonNull ViewGroup viewGroup, int i7, ViewGroup.LayoutParams layoutParams) {
            this.mWebContainer = viewGroup;
            this.mIndex = i7;
            this.mLayoutParams = layoutParams;
            return this;
        }

        public Builder useWebProgress(String str) {
            return useWebProgress(str, str, 3);
        }

        public Builder useWebProgress(int i7, int i10, int i11) {
            this.mProgressStartColor = i7;
            this.mProgressEndColor = i10;
            this.mProgressHeightDp = i11;
            return this;
        }

        public Builder useWebProgress(String str, String str2, int i7) {
            this.mProgressStartColorString = str;
            this.mProgressEndColorString = str2;
            this.mProgressHeightDp = i7;
            return this;
        }
    }

    public /* synthetic */ WebViewConfig(Builder builder, int i7) {
        this(builder);
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    private void handleJsInterface(Builder builder) {
        if (builder.interfaceMap == null || builder.interfaceMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : builder.interfaceMap.entrySet()) {
            this.mWebView.addJavascriptInterface(entry.getValue(), (String) entry.getKey());
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "NewApi"})
    private void handleSetting(Builder builder) {
        WebSettings settings = this.mWebView.getSettings();
        settings.setSaveFormData(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(-1);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setMixedContentMode(0);
        if (TextUtils.isEmpty(builder.userAgent)) {
            WebCacheSetting.INSTANCE.setUserAgent(WebSettings.getDefaultUserAgent(this.mWebView.getContext().getApplicationContext()));
        } else {
            WebCacheSetting.INSTANCE.setUserAgent(builder.userAgent);
        }
        WebCacheSetting.INSTANCE.setWebViewCache(settings.getCacheMode());
    }

    private void handleWebProgress(Builder builder, ViewGroup viewGroup) {
        if (builder.mUseWebProgress) {
            this.mProgressBar = new WebProgress(this.activity);
            if (builder.mProgressStartColor != 0 && builder.mProgressEndColor != 0) {
                this.mProgressBar.setColor(builder.mProgressStartColor, builder.mProgressEndColor);
            } else if (builder.mProgressStartColor != 0) {
                this.mProgressBar.setColor(builder.mProgressStartColor, builder.mProgressStartColor);
            } else if (!TextUtils.isEmpty(builder.mProgressStartColorString) && !TextUtils.isEmpty(builder.mProgressEndColorString)) {
                this.mProgressBar.setColor(builder.mProgressStartColorString, builder.mProgressEndColorString);
            } else if (!TextUtils.isEmpty(builder.mProgressStartColorString) && TextUtils.isEmpty(builder.mProgressEndColorString)) {
                this.mProgressBar.setColor(builder.mProgressStartColorString, builder.mProgressStartColorString);
            }
            int iDip2px = WebTools.dip2px(viewGroup.getContext(), WebProgress.WEB_PROGRESS_DEFAULT_HEIGHT);
            if (builder.mProgressHeightDp != 0) {
                this.mProgressBar.setHeight(builder.mProgressHeightDp);
                iDip2px = WebTools.dip2px(viewGroup.getContext(), builder.mProgressHeightDp);
            }
            this.mProgressBar.setVisibility(8);
            viewGroup.addView(this.mProgressBar, new FrameLayout.LayoutParams(-1, iDip2px));
        }
    }

    private void setWebView(WebView webView) {
        if (webView != null) {
            this.mWebView = webView;
        } else {
            this.mWebView = new PPWebView(this.activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRefresh() {
        return this.mWebView.getScrollY() == 0;
    }

    public static Builder with(@NonNull Activity activity) {
        if (activity != null) {
            return new Builder(activity);
        }
        throw new NullPointerException("activity can not be null .");
    }

    public void clearCache() {
        WebCacheLoader webCacheLoader = this.loader;
        if (webCacheLoader != null) {
            webCacheLoader.clearDataSource();
        }
    }

    public String getErrorTitle() {
        return this.mErrorTitle;
    }

    public View getErrorView() {
        return this.mErrorView;
    }

    public LoadJsHolder getLoadJsHolder() {
        if (this.webLoadJsHolder == null) {
            this.webLoadJsHolder = new LoadJsHolder(this.mWebView);
        }
        return this.webLoadJsHolder;
    }

    public WebCacheLoader getLoader() {
        return this.loader;
    }

    public WebProgress getProgressBar() {
        return this.mProgressBar;
    }

    public WebView getWebView() {
        return this.mWebView;
    }

    public void handleFileChooser(int i7, int i10, Intent intent) {
        PPWebChromeClient pPWebChromeClient = this.mWebChromeClient;
        if (pPWebChromeClient != null) {
            pPWebChromeClient.handleFileChooser(i7, i10, intent);
        }
    }

    public boolean handleKeyEvent(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            return isBack();
        }
        return false;
    }

    public void hideErrorView() {
        View view = this.mErrorView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public boolean isBack() {
        if (this.mWebChromeClient.inCustomView()) {
            this.mWebChromeClient.onHideCustomView();
            return true;
        }
        if (!this.mWebView.canGoBack()) {
            return false;
        }
        hideErrorView();
        this.mWebView.goBack();
        return true;
    }

    public void loadUrl(String str, Map<String, String> map) {
        if (!WebTools.checkUrlHost(str)) {
            showErrorView(PPWebViewClient.ERROR_NO_SUPPORT, null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str.endsWith("mp4");
        }
        if (map == null || map.isEmpty()) {
            this.mWebView.loadUrl(str);
        } else {
            this.mWebView.loadUrl(str, map);
        }
        WebProgress webProgress = this.mProgressBar;
        if (webProgress != null) {
            webProgress.show();
        }
        hideErrorView();
        OfflineWebPageStatus offlineWebPageStatus = this.offlineWebPageStatus;
        if (offlineWebPageStatus != null) {
            offlineWebPageStatus.onLoadUrl(str);
        }
    }

    public void onDestroy() {
        PPWebChromeClient pPWebChromeClient = this.mWebChromeClient;
        if (pPWebChromeClient != null && pPWebChromeClient.getVideoFullView() != null) {
            this.mWebChromeClient.getVideoFullView().removeAllViews();
        }
        WebView webView = this.mWebView;
        if (webView != null) {
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mWebView);
            }
            this.mWebView.removeAllViews();
            this.mWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            this.mWebView.stopLoading();
            this.mWebView.setWebChromeClient(null);
            this.mWebView.setWebViewClient(null);
            this.mWebView.destroy();
            this.mWebView = null;
        }
    }

    @SuppressLint({"NewApi"})
    public void onPause() {
        this.mWebView.onPause();
    }

    @SuppressLint({"NewApi"})
    public void onResume() {
        this.mWebView.onResume();
    }

    public void reload() {
        clearCache();
        OfflineWebPageStatus offlineWebPageStatus = this.offlineWebPageStatus;
        if (offlineWebPageStatus != null) {
            offlineWebPageStatus.reset();
        }
        hideErrorView();
        this.mWebView.reload();
    }

    public void setFixScreenLandscape(boolean z3) {
        PPWebChromeClient pPWebChromeClient = this.mWebChromeClient;
        if (pPWebChromeClient != null) {
            pPWebChromeClient.setFixScreenLandscape(z3);
        }
    }

    public void setFixScreenPortrait(boolean z3) {
        PPWebChromeClient pPWebChromeClient = this.mWebChromeClient;
        if (pPWebChromeClient != null) {
            pPWebChromeClient.setFixScreenPortrait(z3);
        }
    }

    public void setPullToRefreshEnabled(boolean z3) {
        WebView webView = this.mWebView;
        if (webView == null || webView.getParent() == null || !(this.mWebView.getParent() instanceof SwipeRefreshLayout)) {
            return;
        }
        ((SwipeRefreshLayout) this.mWebView.getParent()).setPullToRefreshEnabled(z3);
    }

    @SuppressLint({"NewApi"})
    public void setTextZoom(int i7) {
        this.mWebView.getSettings().setTextZoom(i7);
    }

    public void showErrorView(int i7, String str) {
        try {
            View view = this.mErrorView;
            if (view == null) {
                ViewGroup viewGroup = (ViewGroup) this.mWebView.getParent();
                if (viewGroup instanceof SwipeRefreshLayout) {
                    viewGroup = (ViewGroup) viewGroup.getParent();
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                int i10 = this.mErrorLayoutId;
                if (i10 == 0) {
                    i10 = R.layout.lib_web_load_url_error;
                }
                View viewInflate = layoutInflaterFrom.inflate(i10, (ViewGroup) null);
                this.mErrorView = viewInflate;
                View viewFindViewById = viewInflate.findViewById(R.id.opt_btn);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.palmpay.lib.webview.container.WebViewConfig.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            WebViewConfig.this.reload();
                        }
                    });
                }
                viewGroup.addView(this.mErrorView, new FrameLayout.LayoutParams(-1, -1));
            } else {
                view.setVisibility(0);
            }
            ImageView imageView = (ImageView) this.mErrorView.findViewById(R.id.error_img);
            TextView textView = (TextView) this.mErrorView.findViewById(R.id.error_msg);
            TextView textView2 = (TextView) this.mErrorView.findViewById(R.id.error_tips);
            PpButton ppButton = (PpButton) this.mErrorView.findViewById(R.id.opt_btn);
            if (imageView != null && textView != null && textView2 != null) {
                if ((i7 == -6 && "net::ERR_CONNECTION_CLOSED".contentEquals(str)) || i7 == -2) {
                    imageView.setImageResource(R.drawable.lib_web_icon_error_network);
                    textView.setText(R.string.web_error_network_msg);
                    textView2.setText(R.string.web_error_network_tips);
                    ppButton.setText(this.activity.getResources().getString(R.string.more_refresh));
                    ppButton.setVisibility(0);
                    textView2.setVisibility(0);
                } else if (-999 == i7) {
                    imageView.setImageResource(R.drawable.lib_web_icon_error_nosupport);
                    textView.setText(R.string.web_error_no_support_msg);
                    ppButton.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    imageView.setImageResource(R.drawable.lib_web_icon_error_unknown);
                    textView.setText(R.string.web_error_unknown_msg);
                    textView2.setText(R.string.web_error_unknown_tips);
                    ppButton.setText(this.activity.getResources().getString(R.string.web_error_try));
                    ppButton.setVisibility(0);
                    textView2.setVisibility(0);
                }
            }
            this.mWebView.setVisibility(4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @SuppressLint({"NewApi"})
    private WebViewConfig(Builder builder) {
        Activity activity = builder.mActivity;
        this.activity = activity;
        this.mErrorTitle = builder.mErrorTitle;
        this.mErrorLayoutId = builder.mErrorLayoutId;
        WebCacheLoader webCacheLoader = builder.webCacheLoader;
        this.loader = webCacheLoader;
        setWebView(builder.mCustomWebView);
        ViewGroup frameLayout = new FrameLayout(activity);
        final SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(activity);
        swipeRefreshLayout.setDistanceToTriggerSync(300);
        swipeRefreshLayout.addView(this.mWebView, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(swipeRefreshLayout, new FrameLayout.LayoutParams(-1, -1));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.palmpay.lib.webview.container.WebViewConfig.1
            @Override // com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.OnRefreshListener
            public void onRefresh() {
                if (WebViewConfig.this.mWebView == null) {
                    swipeRefreshLayout.setRefreshing(false);
                } else if (WebViewConfig.this.shouldRefresh()) {
                    WebViewConfig.this.reload();
                } else {
                    swipeRefreshLayout.setRefreshing(false);
                }
            }
        });
        swipeRefreshLayout.setPullToRefreshEnabled(builder.mPullRefresh);
        this.mWebView.setOverScrollMode(2);
        handleWebProgress(builder, frameLayout);
        if (builder.mIndex != -1) {
            builder.mWebContainer.addView(frameLayout, builder.mIndex, builder.mLayoutParams);
        } else {
            builder.mWebContainer.addView(frameLayout, builder.mLayoutParams);
        }
        handleSetting(builder);
        PPWebChromeClient pPWebChromeClient = new PPWebChromeClient(activity, this);
        this.mWebChromeClient = pPWebChromeClient;
        pPWebChromeClient.setWebChromeCallback(builder.mWebChromeCallback);
        setFixScreenLandscape(builder.isFixScreenLandscape);
        setFixScreenPortrait(builder.isFixScreenPortrait);
        this.mWebView.setWebChromeClient(pPWebChromeClient);
        PPWebViewClient pPWebViewClient = new PPWebViewClient(activity, this, swipeRefreshLayout);
        pPWebViewClient.setWebClientCallback(builder.mWebClientCallback);
        OfflineWebPageStatus offlineWebPageStatus = new OfflineWebPageStatus();
        this.offlineWebPageStatus = offlineWebPageStatus;
        pPWebViewClient.setWebPageStatus(offlineWebPageStatus);
        this.mWebView.setWebViewClient(pPWebViewClient);
        handleJsInterface(builder);
        WebView webView = this.mWebView;
        if (webView instanceof PPWebView) {
            ((PPWebView) webView).addJavascriptObject(new WebBridge(activity), null);
        }
        if (webCacheLoader != null) {
            ViewParent viewParent = this.mWebView;
            if (viewParent instanceof ICacheWebView) {
                webCacheLoader.setView((ICacheWebView) viewParent);
            }
        }
        this.mWebView.setLayerType(2, null);
        this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        this.mWebView.removeJavascriptInterface("accessibility");
        this.mWebView.removeJavascriptInterface("accessibilityTraversal");
    }
}
