package com.transsnet.adsdk.widgets.Interstitial;

import Yd.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.remote.ProcessSurfaceView;
import com.transsnet.adsdk.remote.RemoteDrawService;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces;
import com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener;
import com.transsnet.adsdk.widgets.jsinterfaces.JsInterfaces;
import com.transsnet.analysis.contants.EventsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class InterstitialAdDialog extends O6.f implements View.OnClickListener, View.OnTouchListener, RequestListener<Drawable>, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, IJsClickListener {
    private static final String TAG = "InterstitialAdDialog";
    private boolean bDarkMode;
    private boolean bUseRemoteWebView;
    private View mAdCloseIbt;
    private AdEntity mAdData;
    private ImageView mAdImg;
    private IAdListener mAdListener;
    private int mAdType;
    private Context mContext;
    private IAppDataInterfaces mDataInterfaces;
    private String mH5Url;
    private String mLastBeginId;
    private int mLocationX;
    private int mLocationY;
    private long mShowTime;
    private WebView mWebView;

    public InterstitialAdDialog(@NonNull Context context, AdEntity adEntity, int adType, IAdListener adListener) {
        super(context);
        this.mShowTime = 0L;
        this.mLastBeginId = "";
        this.mAdType = 0;
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mAdType = adType;
        this.mContext = context;
        this.mAdData = adEntity;
        this.mAdListener = adListener;
    }

    private void clickAd() {
        AdSdkUtils.onClickAd(getContext(), this.mAdListener, this.mAdData);
        AdManager.saveAdClickStatus(this.mAdData);
        AdEntity adEntity = this.mAdData;
        AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
        dismiss();
    }

    private Rect getOriginSize(AdEntity data) {
        if (data == null) {
            return new Rect();
        }
        if (TextUtils.isEmpty(data.imageDimention) || !data.imageDimention.contains("*")) {
            return new Rect();
        }
        String[] strArrSplit = data.imageDimention.split("[*]");
        return new Rect(0, 0, Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
    }

    private int getScreenWidth() {
        WindowManager windowManager = (WindowManager) AdManager.get().getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initListener() {
        int i7 = this.mAdType;
        if (i7 == 0 || AdSdkUtils.isImageOnlyWebAd(this.mAdData, i7)) {
            this.mAdImg.setOnClickListener(this);
            this.mAdCloseIbt.setOnClickListener(this);
            this.mAdImg.setOnTouchListener(this);
        }
        setOnShowListener(this);
        setOnDismissListener(this);
    }

    private void initRemoteWebViewAd() {
        getWindow().requestFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCanceledOnTouchOutside(false);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.lib_ad_remote_webview_layout, (ViewGroup) null);
        ProcessSurfaceView processSurfaceView = (ProcessSurfaceView) viewInflate.findViewById(R.id.surface_view);
        processSurfaceView.setZOrderOnTop(true);
        processSurfaceView.getHolder().setFormat(-3);
        processSurfaceView.setWebViewUrl(this.mH5Url);
        processSurfaceView.setOnClickListener(new i(this, 18));
        viewInflate.findViewById(R.id.interstitial_close_ibt).setOnClickListener(this);
        initListener();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) processSurfaceView.getLayoutParams();
        Rect originSize = getOriginSize(this.mAdData);
        int iWidth = originSize.width();
        int iHeight = originSize.height();
        int screenWidth = (int) (getScreenWidth() * 0.78f);
        layoutParams.width = screenWidth;
        if (iWidth <= 0 || iHeight <= 0) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = (int) ((iHeight / iWidth) * screenWidth);
        }
        processSurfaceView.setLayoutParams(layoutParams);
        setContentView(viewInflate);
    }

    private void initView(View parentView) {
        int i7 = this.mAdType;
        if (i7 == 0 || AdSdkUtils.isImageOnlyWebAd(this.mAdData, i7)) {
            this.mAdImg = (ImageView) parentView.findViewById(R.id.interstitial_img);
            this.mAdCloseIbt = parentView.findViewById(R.id.interstitial_close_ibt);
            initListener();
            requestData();
            return;
        }
        if (isUseRemoteWebView()) {
            initRemoteWebViewAd();
            return;
        }
        WebView webView = new WebView(AdManager.get().getApp());
        this.mWebView = webView;
        initWebViewAd(parentView, webView);
    }

    private void initWebViewAd(View parentView, WebView webView) {
        FrameLayout frameLayout = (FrameLayout) parentView.findViewById(R.id.interstitial_root);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Rect originSize = getOriginSize(this.mAdData);
        int iWidth = originSize.width();
        int iHeight = originSize.height();
        if (iWidth <= 0 || iHeight <= 0) {
            layoutParams.width = ConvertUtils.dp2px(240.0f);
            layoutParams.height = ConvertUtils.dp2px(360.0f);
        } else {
            int screenWidth = (int) (getScreenWidth() * 0.78f);
            float f10 = iHeight / iWidth;
            int iDp2px = ConvertUtils.dp2px(128.0f);
            layoutParams.width = screenWidth;
            layoutParams.height = iDp2px + ((int) (f10 * screenWidth));
        }
        frameLayout.setLayoutParams(layoutParams);
        AdSdkUtils.setupWebView(getContext(), webView, "main", new JsInterfaces(this, this.mDataInterfaces));
        frameLayout.addView(webView);
        initListener();
        requestData();
    }

    private boolean isUseRemoteWebView() {
        return this.bUseRemoteWebView || AdManager.get().checkUseRemoteWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRemoteWebViewAd$0(View view) {
        clickAd();
    }

    private void removeWebView(WebView view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
        view.stopLoading();
        view.getSettings().setJavaScriptEnabled(false);
        view.clearHistory();
        view.removeAllViews();
        view.destroy();
    }

    private void requestData() {
        G1.d dVar;
        int i7 = this.mAdType;
        if (i7 != 0 && !AdSdkUtils.isImageOnlyWebAd(this.mAdData, i7)) {
            WebView webView = this.mWebView;
            if (webView != null) {
                webView.loadUrl(this.mH5Url);
                return;
            }
            return;
        }
        AdEntity adEntity = this.mAdData;
        if (adEntity == null || TextUtils.isEmpty(adEntity.adId)) {
            if (AdSdkUtils.isValidGlideContext(getContext())) {
                AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
                dismiss();
                return;
            }
            return;
        }
        if (AppUtils.isActivityAlive(getContext())) {
            AdEntity adEntity2 = this.mAdData;
            String str = adEntity2.imageUrl;
            if (this.bDarkMode && !TextUtils.isEmpty(adEntity2.imageUrlDark)) {
                str = this.mAdData.imageUrlDark;
            }
            if (this.mAdType == 1 && !TextUtils.isEmpty(this.mAdData.h5ImageUrl)) {
                str = (!this.bDarkMode || TextUtils.isEmpty(this.mAdData.h5ImageUrlDark)) ? this.mAdData.h5ImageUrl : this.mAdData.h5ImageUrlDark;
            }
            int iDp2px = ConvertUtils.dp2px(240.0f);
            Rect originSize = getOriginSize(this.mAdData);
            G1.d dVar2 = (G1.d) ((G1.d) new G1.d().g(k.f20705d)).F(true);
            if (originSize.width() <= 0 || originSize.height() <= 0) {
                dVar = (G1.d) dVar2.w(iDp2px, Integer.MIN_VALUE);
            } else {
                dVar = (G1.d) dVar2.w(iDp2px, (int) ((originSize.height() / originSize.width()) * iDp2px));
            }
            com.bumptech.glide.b.e(this.mContext).load(str).a(dVar).N(this).S(this.mAdImg);
        }
    }

    @Override // com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener
    public void jsOnClickCallback(String param) {
        try {
            JSONObject jSONObject = new JSONObject(param);
            String strOptString = jSONObject.optString("jumpType");
            String strOptString2 = jSONObject.optString("jumpPath");
            String strOptString3 = jSONObject.optString("jumpParams");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                AdManager.saveAdCloseStatus(this.mAdData);
                AdEntity adEntity = this.mAdData;
                AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
            } else {
                AdEntity adEntity2 = this.mAdData;
                adEntity2.jumpType = strOptString;
                adEntity2.relativeUrl = strOptString2;
                if (!TextUtils.isEmpty(strOptString3)) {
                    this.mAdData.jumpParams = strOptString3;
                }
                AdSdkUtils.onClickAd(getContext(), this.mAdListener, this.mAdData);
                AdManager.saveAdClickStatus(this.mAdData);
                AdEntity adEntity3 = this.mAdData;
                AdSdkUtils.trackEvent(adEntity3.adId, this.mShowTime, adEntity3.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
            }
            dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        int id2 = v3.getId();
        if (id2 == R.id.interstitial_img) {
            clickAd();
            return;
        }
        if (id2 == R.id.interstitial_close_ibt) {
            AdSdkUtils.onAdClosed(getContext(), this.mAdListener);
            AdManager.saveAdCloseStatus(this.mAdData);
            AdEntity adEntity = this.mAdData;
            AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        View viewInflate;
        super.onCreate(savedInstanceState);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(R.drawable.lib_ad_transparent_bg);
        }
        int i7 = this.mAdType;
        if (i7 == 0 || AdSdkUtils.isImageOnlyWebAd(this.mAdData, i7)) {
            viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.lib_ad_interstitial_layout, (ViewGroup) null);
        } else {
            if (isUseRemoteWebView()) {
                initView(null);
                return;
            }
            viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.lib_ad_web_interstitial_layout, (ViewGroup) null);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setContentView(viewInflate, layoutParams);
        initView(viewInflate);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        WebView webView;
        if (this.mShowTime > 0 && System.currentTimeMillis() - this.mShowTime > 800) {
            AdManager.saveAdShowStatusBackground(this.mAdData, true);
        }
        if (!TextUtils.isEmpty(this.mAdData.adId)) {
            this.mLastBeginId = AdSdkUtils.getBehaviorId();
        }
        if (this.mAdType == 1 && (webView = this.mWebView) != null) {
            removeWebView(webView);
            AdSdkUtils.onAdClosed(getContext(), this.mAdListener);
        }
        if (this.mAdImg != null) {
            if (AdSdkUtils.isValidGlideContext(this.mContext)) {
                p pVarE = com.bumptech.glide.b.e(this.mContext);
                ImageView imageView = this.mAdImg;
                pVarE.getClass();
                pVarE.e(new n(imageView));
            }
            this.mAdImg.setImageDrawable(null);
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u e10, Object model, Target<Drawable> target, boolean isFirstResource) {
        View view = this.mAdCloseIbt;
        if (view != null) {
            view.setVisibility(0);
        }
        AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
        return false;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialog) {
        if (!TextUtils.isEmpty(this.mAdData.adId)) {
            String behaviorId = AdSdkUtils.getBehaviorId();
            AdSdkUtils.trackEvent(this.mAdData.adId, System.currentTimeMillis(), this.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
            this.mLastBeginId = behaviorId;
        }
        if (this.mAdType == 1) {
            AdSdkUtils.onLoadAdSuccess(getContext(), this.mAdListener);
        }
        this.mShowTime = System.currentTimeMillis();
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View v3, MotionEvent event) {
        if (event.getAction() != 1) {
            return false;
        }
        this.mLocationX = (int) event.getRawX();
        this.mLocationY = (int) event.getRawY();
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (Build.VERSION.SDK_INT == 29) {
            Window window = getWindow();
            if (!hasFocus || window == null) {
                return;
            }
            View decorView = window.getDecorView();
            if (decorView.getHeight() == 0 || decorView.getWidth() == 0) {
                decorView.requestLayout();
            }
        }
    }

    public void setUseRemoteWebView(boolean bUseRemoteWebView) {
        this.bUseRemoteWebView = bUseRemoteWebView;
        if (bUseRemoteWebView) {
            try {
                this.mContext.startService(new Intent(this.mContext, (Class<?>) RemoteDrawService.class));
            } catch (Exception unused) {
            }
        }
    }

    public void switchDarkMode(boolean dark) {
        this.bDarkMode = dark;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
        View view = this.mAdCloseIbt;
        if (view != null) {
            view.setVisibility(0);
        }
        AdSdkUtils.onLoadAdSuccess(getContext(), this.mAdListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        return false;
    }

    public InterstitialAdDialog(@NonNull Context context, AdEntity adEntity, int adType, String url, IAdListener adListener) {
        super(context);
        this.mShowTime = 0L;
        this.mLastBeginId = "";
        this.mAdType = 0;
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mContext = context;
        this.mAdData = adEntity;
        this.mAdType = adType;
        this.mH5Url = url;
        this.mAdListener = adListener;
    }

    public InterstitialAdDialog(@NonNull Context context, AdEntity adEntity, int adType, String url, IAdListener adListener, IAppDataInterfaces dataInterfaces) {
        super(context);
        this.mShowTime = 0L;
        this.mLastBeginId = "";
        this.mAdType = 0;
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mContext = context;
        this.mAdData = adEntity;
        this.mAdType = adType;
        this.mH5Url = url;
        this.mAdListener = adListener;
        this.mDataInterfaces = dataInterfaces;
    }
}
