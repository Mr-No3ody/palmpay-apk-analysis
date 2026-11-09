package com.transsnet.adsdk.widgets.splash;

import D3.a;
import Fe.Z;
import G1.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.bean.req.AdReq;
import com.transsnet.adsdk.data.local.dao.AdDao;
import com.transsnet.adsdk.data.local.database.AdDatabase;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.AdApi;
import com.transsnet.adsdk.data.network.Predicate.SingleAdPredicate;
import com.transsnet.adsdk.data.network.ReqUtil;
import com.transsnet.adsdk.data.network.function.SingleAdFunction;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AdSpUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener;
import com.transsnet.adsdk.widgets.jsinterfaces.JsInterfaces;
import com.transsnet.analysis.contants.EventsConstants;
import df.i;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.C1762n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p161kf.e;
import p184m8.b;
import p250q8.c;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class SplashAdView extends FrameLayout implements RequestListener<Drawable>, View.OnClickListener, Runnable, IJsClickListener, View.OnTouchListener {
    private static final String DARK_SPLASH_IMG_PATH = "dark_splash_img_path";
    private static final String SPLASH_IMG_PATH = "splash_img_path";
    private static final String TAG = "adsdk";
    private boolean adjustViewBounds;
    private boolean bDarkMode;
    private boolean bVirtualButton;
    private AdEntity mAdData;
    private ImageView mAdImg;
    private IAdListener mAdListener;
    private int mAdType;
    private Context mContext;

    @DrawableRes
    private Integer mDefaultImgRes;
    private String mLastBeginId;
    private int mLocationX;
    private int mLocationY;
    private List<String> mNoShowList;
    private long mShowTime;
    private TextView mSkipTv;
    private String mSlotId;
    private WebView mWebView;
    private ImageView.ScaleType scaleType;

    public SplashAdView(Context context, String positionId, IAdListener adListener) {
        this(context, null);
        this.mSlotId = positionId;
        this.mAdListener = adListener;
    }

    public static void clearSplashImagePath() {
        AdSpUtils.getInstance().put(SPLASH_IMG_PATH, "");
        AdSpUtils.getInstance().put(DARK_SPLASH_IMG_PATH, "");
    }

    private static void downloadImg(AdEntity adData) {
        downloadImg(false, adData.imageUrl);
        downloadImg(true, adData.imageUrlDark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void downloadNoCacheImg(AdEntity adData) {
        if (hasCacheImg(adData)) {
            return;
        }
        downloadImg(adData);
    }

    public static void downloadSplashImg(String slotId) {
        if (TextUtils.isEmpty(slotId)) {
            return;
        }
        C1755g c1755g = new C1755g(new Z(slotId, 4), 0);
        i iVar = f.f42628a;
        try {
            try {
                new C1760l(c1755g.k(iVar).i(iVar), new b(4), 2).i(iVar).f(new Z(slotId, 3)).subscribe(new C1762n(new C1762n(new c(null, null), new SingleAdPredicate(new b(6)), 0), new SingleAdFunction(slotId, new b(5)), 1));
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th) {
                a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            a.H(th2);
            org.chromium.support_lib_boundary.util.b.V(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    private ImageView getImageView() {
        if (this.mAdImg == null) {
            ImageView imageView = new ImageView(getContext());
            this.mAdImg = imageView;
            imageView.setScaleType(this.scaleType);
            imageView.setAdjustViewBounds(this.adjustViewBounds);
            imageView.setId(R.id.splash_ad_img);
            imageView.setOnClickListener(this);
            addView(imageView, new FrameLayout.LayoutParams(-1, -2));
        }
        return this.mAdImg;
    }

    private TextView getSkipTv() {
        if (this.mSkipTv == null) {
            TextView textView = new TextView(getContext());
            this.mSkipTv = textView;
            textView.setId(R.id.splash_countdown_tv);
            textView.setOnClickListener(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, this.mContext.getResources().getDisplayMetrics());
            layoutParams.setMargins(0, iApplyDimension, iApplyDimension, 0);
            addView(textView, layoutParams);
        }
        return this.mSkipTv;
    }

    private static boolean hasCacheImg(AdEntity adData) {
        try {
            boolean z3 = true;
            File file = (File) com.bumptech.glide.b.e(AdManager.get().getApp()).g().load(adData.imageUrl).a((d) ((d) ((d) new d().q(true)).g(k.f20705d)).w(Integer.MIN_VALUE, Integer.MIN_VALUE)).f0(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (file == null || !file.exists()) {
                z3 = false;
            }
            if (z3) {
                saveSplashImagePath(SPLASH_IMG_PATH, file.getPath());
            }
            return z3;
        } catch (Exception unused) {
            return false;
        }
    }

    @SuppressLint({"CheckResult"})
    private void initAdData() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        C1755g c1755g = new C1755g(new p250q8.b(this, 5), 0);
        i iVar = f.f42629b;
        c1755g.k(iVar).i(iVar).subscribe(new e(new b(7), p147jf.a.f38601e, p147jf.a.f38599c));
    }

    private void initData() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        initAdData();
    }

    public static boolean isSplashImageExist() {
        return !TextUtils.isEmpty(AdSpUtils.getInstance().getString(SPLASH_IMG_PATH, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$downloadSplashImg$10(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            clearSplashImagePath();
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource lambda$downloadSplashImg$11(String str, Boolean bool) throws Exception {
        AdDatabase.getInstance(AdManager.get().getApp()).adDao().disableAllData(str);
        AdReq commonAdReq = ReqUtil.getCommonAdReq(str, null);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadSplashImg$12(boolean z3) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadSplashImg$13(boolean z3, AdEntity adEntity) {
        if (!z3) {
            clearSplashImagePath();
        }
        AdDao adDaoH = d0.h();
        AdEntity adEntityQueryByAdId = adDaoH.queryByAdId(adEntity.adId);
        if (adEntityQueryByAdId == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            adEntity.createTime = jCurrentTimeMillis;
            adEntity.updateTime = jCurrentTimeMillis;
            adEntity.curEnable = 1;
            adDaoH.insert(adEntity);
            return;
        }
        if (adEntityQueryByAdId.adId.equals(adEntity.adId)) {
            adEntity.showDate = adEntityQueryByAdId.showDate;
            adEntity.hasShowTimes = adEntityQueryByAdId.hasShowTimes;
            adEntity.clickDate = adEntityQueryByAdId.clickDate;
            adEntity.createTime = adEntityQueryByAdId.createTime;
        }
        adEntity.updateTime = System.currentTimeMillis();
        adEntity.curEnable = 1;
        adDaoH.update(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadSplashImg$9(String str, ObservableEmitter observableEmitter) throws Exception {
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(str, AdManager.get().getCountryCode(), 1);
        if (listQueryBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity = listQueryBySlotIdLimitCount.get(0);
            if (AdManager.checkShowAd(adEntity)) {
                boolean zHasCacheImg = hasCacheImg(adEntity);
                observableEmitter.onNext(Boolean.valueOf(zHasCacheImg));
                if (!zHasCacheImg) {
                    downloadImg(adEntity);
                }
            } else {
                observableEmitter.onNext(Boolean.FALSE);
                downloadNoCacheImg(adEntity);
            }
        } else {
            observableEmitter.onNext(Boolean.FALSE);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAdData$7(ObservableEmitter observableEmitter) throws Exception {
        AdEntity adEntity;
        try {
            List<AdEntity> listQueryBySlotIdLimitCount = AdDatabase.getInstance(AdManager.get().getApp()).adDao().queryBySlotIdLimitCount(this.mSlotId, AdManager.get().getCountryCode(), 1);
            if (listQueryBySlotIdLimitCount.size() > 0 && (adEntity = listQueryBySlotIdLimitCount.get(0)) != null) {
                this.mAdData = adEntity;
            }
        } catch (Exception unused) {
        }
        observableEmitter.onNext(Boolean.TRUE);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initAdData$8(Boolean bool) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$0(ObservableEmitter observableEmitter) throws Exception {
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(this.mSlotId, AdManager.get().getCountryCode(), 1);
        this.mNoShowList.clear();
        if (listQueryBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity = listQueryBySlotIdLimitCount.get(0);
            this.mAdData = adEntity;
            if (AdManager.checkShowAd(adEntity)) {
                boolean zHasCacheImg = hasCacheImg(this.mAdData);
                observableEmitter.onNext(Boolean.valueOf(zHasCacheImg));
                if (!zHasCacheImg) {
                    downloadImg(this.mAdData);
                }
            } else {
                observableEmitter.onNext(Boolean.FALSE);
                downloadNoCacheImg(this.mAdData);
            }
        } else {
            observableEmitter.onNext(Boolean.FALSE);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean lambda$run$1(Boolean bool) throws Exception {
        if (!bool.booleanValue() || !AppUtils.isActivityAlive(getContext())) {
            if (AppUtils.isActivityAlive(getContext()) && this.mDefaultImgRes != null) {
                getImageView().setImageDrawable(this.mContext.getDrawable(this.mDefaultImgRes.intValue()));
            }
            return bool;
        }
        if (this.mAdType != 0) {
            showWebViewAd();
            return bool;
        }
        AdEntity adEntity = this.mAdData;
        loadImage(adEntity.imageUrl, adEntity.imageUrlDark);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$run$2(Boolean bool) throws Exception {
        d0.h().disableAllData(this.mSlotId);
        AdReq commonAdReq = ReqUtil.getCommonAdReq(this.mSlotId, this.mNoShowList);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$3() {
        if (this.mAdListener == null || !AdSdkUtils.isValidGlideContext(getContext())) {
            return;
        }
        this.mAdListener.onLoadFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$4(boolean z3) {
        new Handler(Looper.getMainLooper()).post(new p250q8.a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$5() {
        AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$6(boolean z3, AdEntity adEntity) {
        if (!z3) {
            new Handler(Looper.getMainLooper()).post(new p250q8.a(this, 1));
        }
        AdDao adDao = AdDatabase.getInstance(getContext()).adDao();
        AdEntity adEntityQueryByAdId = adDao.queryByAdId(adEntity.adId);
        if (adEntityQueryByAdId == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            adEntity.createTime = jCurrentTimeMillis;
            adEntity.updateTime = jCurrentTimeMillis;
            adEntity.curEnable = 1;
            adDao.insert(adEntity);
            return;
        }
        if (adEntityQueryByAdId.adId.equals(adEntity.adId)) {
            adEntity.showDate = adEntityQueryByAdId.showDate;
            adEntity.hasShowTimes = adEntityQueryByAdId.hasShowTimes;
            adEntity.clickDate = adEntityQueryByAdId.clickDate;
            adEntity.createTime = adEntityQueryByAdId.createTime;
            adEntity.closeCount = adEntityQueryByAdId.closeCount;
        }
        adEntity.updateTime = System.currentTimeMillis();
        adEntity.curEnable = 1;
        adDao.update(adEntity);
    }

    private void loadImage(File lightUrl, File darkUrl) {
        if (lightUrl == null || !lightUrl.exists()) {
            return;
        }
        if (this.bDarkMode && darkUrl != null) {
            lightUrl = darkUrl;
        }
        ImageView imageView = getImageView();
        if (this.bDarkMode && darkUrl == null && AdSdkUtils.isInDarkMode(imageView)) {
            imageView.setAlpha((this.mAdData.getAlpha() * 1.0f) / 255.0f);
        } else {
            imageView.setAlpha(1.0f);
        }
        com.bumptech.glide.b.f(imageView).load(lightUrl).S(imageView);
    }

    private static void saveSplashImagePath(String key, String path) {
        AdSpUtils.getInstance().put(key, path);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void setupWebView() {
        this.mWebView.setLayerType(2, null);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.addJavascriptInterface(new JsInterfaces(this), "interstitialAd");
        this.mWebView.setWebViewClient(new p219o8.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWebViewAd() {
        if (this.mWebView == null) {
            this.mWebView = new WebView(AdManager.get().getApp());
            setupWebView();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (TextUtils.isEmpty(this.mAdData.imageDimention) || !this.mAdData.imageDimention.contains("*")) {
                layoutParams.width = ConvertUtils.dp2px(240.0f);
                layoutParams.height = ConvertUtils.dp2px(120.0f);
            } else {
                String[] strArrSplit = this.mAdData.imageDimention.split("[*]");
                layoutParams.width = Integer.parseInt(strArrSplit[0]);
                layoutParams.height = Integer.parseInt(strArrSplit[1]);
            }
            setLayoutParams(layoutParams);
            addView(this.mWebView);
        }
        this.mWebView.loadUrl(this.mAdData.imageUrl);
        AdSdkUtils.onLoadAdSuccess(getContext(), this.mAdListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        AdSdkUtils.trackEvent(this.mAdData.adId, System.currentTimeMillis(), this.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", AdSdkUtils.getBehaviorId(), this.mLastBeginId);
    }

    private void trackClickEvent() {
        AdManager.saveAdClickStatus(this.mAdData);
        AdEntity adEntity = this.mAdData;
        AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void enableVirtualButton(boolean enable) {
        this.bVirtualButton = enable;
        ImageView imageView = getImageView();
        if (this.bVirtualButton) {
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(this);
        } else {
            imageView.setOnClickListener(this);
            imageView.setOnTouchListener(null);
        }
    }

    public IAdListener getAdListener() {
        return this.mAdListener;
    }

    public String getSlotId() {
        return this.mSlotId;
    }

    @Override // com.transsnet.adsdk.widgets.jsinterfaces.IJsClickListener
    public void jsOnClickCallback(String param) {
        try {
            JSONObject jSONObject = new JSONObject(param);
            String strOptString = jSONObject.optString("jumpType");
            String strOptString2 = jSONObject.optString("jumpPath");
            String strOptString3 = jSONObject.optString("jumpParams");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                AdEntity adEntity = this.mAdData;
                AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
                return;
            }
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
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        int id2 = v3.getId();
        if (id2 == R.id.splash_ad_img) {
            AdSdkUtils.onClickAd(getContext(), this.mAdListener, this.mAdData);
            trackClickEvent();
        } else if (id2 == R.id.splash_countdown_tv) {
            AdSdkUtils.onAdClosed(getContext(), this.mAdListener);
            AdEntity adEntity = this.mAdData;
            AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u e10, Object model, Target<Drawable> target, boolean isFirstResource) {
        AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v3, MotionEvent event) {
        if (event.getAction() != 1) {
            return false;
        }
        this.mLocationX = (int) event.getRawX();
        this.mLocationY = (int) event.getRawY();
        int height = getImageView().getHeight();
        if (this.bVirtualButton && height > 0 && ((int) event.getY()) > (height * 2) / 3) {
            AdSdkUtils.onClickAd(getContext(), this.mAdListener, this.mAdData);
        }
        trackClickEvent();
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 1) {
            this.mLocationX = (int) event.getRawX();
            this.mLocationY = (int) event.getRawY();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        AdEntity adEntity = this.mAdData;
        if (adEntity == null || TextUtils.isEmpty(adEntity.adId)) {
            return;
        }
        String behaviorId = AdSdkUtils.getBehaviorId();
        if (visibility == 0) {
            AdSdkUtils.trackEvent(this.mAdData.adId, System.currentTimeMillis(), this.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", behaviorId, this.mLastBeginId);
        }
        this.mLastBeginId = behaviorId;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            return;
        }
        AdManager.get();
        if (TextUtils.isEmpty(AdManager.getUserId())) {
            if (this.mDefaultImgRes != null) {
                getImageView().setImageDrawable(this.mContext.getDrawable(this.mDefaultImgRes.intValue()));
                return;
            }
            return;
        }
        C1755g c1755g = new C1755g(new p250q8.b(this, 0), 0);
        i iVar = f.f42628a;
        try {
            try {
                new C1760l(c1755g.k(iVar).i(p071ef.b.a()), new p250q8.b(this, 1), 2).i(iVar).f(new p250q8.b(this, 2)).subscribe(new C1762n(new C1762n(new com.transsnet.adsdk.widgets.MarqueeTextView.c(this, getContext(), this.mAdListener, 1), new SingleAdPredicate(new p250q8.b(this, 4)), 0), new SingleAdFunction(this.mSlotId, new p250q8.b(this, 3)), 1));
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th) {
                a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            a.H(th2);
            org.chromium.support_lib_boundary.util.b.V(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    public void setAdListener(IAdListener mAdListener) {
        this.mAdListener = mAdListener;
    }

    public void setDefaultSplashImg(@DrawableRes int resId) {
        this.mDefaultImgRes = Integer.valueOf(resId);
        File file = new File(AdSpUtils.getInstance().getString(SPLASH_IMG_PATH, ""));
        ImageView imageView = getImageView();
        if (file.exists()) {
            com.bumptech.glide.b.f(imageView).load(file).S(imageView);
        } else {
            imageView.setImageDrawable(this.mContext.getDrawable(resId));
        }
    }

    public void setSlotId(String slotId) {
        setSlotId(slotId, true);
    }

    public void showSplashImg() {
        String string = AdSpUtils.getInstance().getString(SPLASH_IMG_PATH, "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        loadImage(new File(string), new File(AdSpUtils.getInstance().getString(DARK_SPLASH_IMG_PATH, "")));
    }

    public void switchDarkMode(boolean dark) {
        this.bDarkMode = dark;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
        AdSdkUtils.onLoadAdSuccess(getContext(), this.mAdListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        AdSdkUtils.trackEvent(this.mAdData.adId, System.currentTimeMillis(), this.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", AdSdkUtils.getBehaviorId(), this.mLastBeginId);
        return false;
    }

    public void setSlotId(String slotId, boolean loadNow) {
        this.mSlotId = slotId;
        if (loadNow) {
            run();
        } else {
            initAdData();
        }
    }

    private static void downloadImg(boolean dark, String imageUrl) {
        try {
            File file = (File) com.bumptech.glide.b.e(AdManager.get().getApp()).d().load(imageUrl).a((d) ((d) new d().g(k.f20705d)).w(Integer.MIN_VALUE, Integer.MIN_VALUE)).f0(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (file == null || !file.exists()) {
                return;
            }
            saveSplashImagePath(dark ? DARK_SPLASH_IMG_PATH : SPLASH_IMG_PATH, file.getPath());
        } catch (Exception unused) {
        }
    }

    public SplashAdView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SplashAdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mAdData = new AdEntity();
        this.mLastBeginId = "";
        this.mAdType = 0;
        this.bVirtualButton = false;
        this.mDefaultImgRes = null;
        this.mNoShowList = new ArrayList();
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        this.scaleType = scaleType;
        this.adjustViewBounds = true;
        this.bDarkMode = AdManager.get().isUseDarkMode();
        this.mContext = context;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SplashAdView);
            this.mSlotId = typedArrayObtainStyledAttributes.getString(R.styleable.SplashAdView_slot_id);
            this.mAdType = typedArrayObtainStyledAttributes.getInt(R.styleable.SplashAdView_ad_type, 0);
            this.bVirtualButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplashAdView_ad_virtual_button, false);
            this.adjustViewBounds = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SplashAdView_android_adjustViewBounds, true);
            this.scaleType = ImageView.ScaleType.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.SplashAdView_android_scaleType, scaleType.ordinal())];
            typedArrayObtainStyledAttributes.recycle();
        }
        initData();
    }

    private void loadImage(String lightUrl, String darkUrl) {
        if (lightUrl == null) {
            return;
        }
        if (this.bDarkMode && darkUrl != null) {
            lightUrl = darkUrl;
        }
        ImageView imageView = getImageView();
        if (this.bDarkMode && TextUtils.isEmpty(darkUrl) && AdSdkUtils.isInDarkMode(imageView)) {
            imageView.setAlpha((this.mAdData.getAlpha() * 1.0f) / 255.0f);
        } else {
            imageView.setAlpha(1.0f);
        }
        com.bumptech.glide.b.f(imageView).load(lightUrl).S(imageView);
    }
}
