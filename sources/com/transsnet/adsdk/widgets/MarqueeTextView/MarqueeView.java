package com.transsnet.adsdk.widgets.MarqueeTextView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.m;
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
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.analysis.contants.EventsConstants;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableSource;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"use MarqueeViewV2 instead"})
@Deprecated
public class MarqueeView<T> extends AppCompatTextView implements View.OnClickListener, RequestListener<Drawable> {
    private AdEntity mAdData;
    private IAdListener mAdListener;
    private boolean mExpired;
    private Runnable mFocusRunnable;
    private String mLastBeginId;
    private int mLocationX;
    private int mLocationY;
    private List<String> mNoShowList;
    private long mShowTime;
    private String mSlotId;
    private final int mTextColor;
    private int mTextSize;
    private Typeface typeface;

    public MarqueeView(Context context, String slotId, IAdListener adListener) {
        this(context, null);
        this.mSlotId = slotId;
        this.mAdListener = adListener;
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        initData();
        initAttrs(context, attrs, defStyleAttr);
        loadAdData();
    }

    private void initAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MarqueeViewStyle, defStyleAttr, 0);
        this.mSlotId = typedArrayObtainStyledAttributes.getString(R.styleable.MarqueeViewStyle_slot_id);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewStyle_mvTextSize)) {
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.MarqueeViewStyle_mvTextSize, context.getResources().getDimensionPixelSize(R.dimen.dp_12));
            this.mTextSize = dimension;
            setTextSize(0, dimension);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewStyle_mvTextColor)) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(R.styleable.MarqueeViewStyle_mvTextColor, -16777216));
        } else if (isDark()) {
            setTextColor(-1);
        } else {
            setTextColor(-16777216);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeViewStyle_mvFont)) {
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MarqueeViewStyle_mvFont, 0);
                if (resourceId != 0) {
                    this.typeface = Y.j.a(resourceId, context);
                }
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    setTypeface(typeface);
                }
            } catch (Exception unused) {
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initData() {
        if (getBackground() == null) {
            setBackground(getContext().getDrawable(R.drawable.lib_ad_marquee_txt_bg));
            setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(R.drawable.lib_ad_marquee_txt_start_icon), (Drawable) null, (Drawable) null, (Drawable) null);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0) {
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp_12);
                setPadding(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
            }
        }
        setGravity(16);
        if (getCompoundDrawablePadding() == 0) {
            setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.dp_6));
        }
        TextUtils.TruncateAt ellipsize = getEllipsize();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        if (ellipsize == truncateAt) {
            setSingleLine(true);
            setEllipsize(truncateAt);
            setMarqueeRepeatLimit(-1);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setOnClickListener(this);
    }

    private boolean isDark() {
        return AdSdkUtils.isInDarkMode(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadAdData$1(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.TRUE);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdData$10(boolean z3, AdEntity adEntity) {
        if (!z3) {
            new Handler(Looper.getMainLooper()).post(new a(this, 2));
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
        }
        adEntity.updateTime = System.currentTimeMillis();
        adEntity.curEnable = 1;
        adDao.update(adEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$loadAdData$3(Boolean bool) throws Exception {
        this.mNoShowList.clear();
        if (this.mExpired) {
            d0.h().disableAllData(this.mSlotId);
            return Boolean.FALSE;
        }
        List<AdEntity> listQueryBySlotIdLimitCount = d0.h().queryBySlotIdLimitCount(this.mSlotId, AdManager.get().getCountryCode(), 1);
        if (listQueryBySlotIdLimitCount.size() != 0) {
            AdEntity adEntity = listQueryBySlotIdLimitCount.get(0);
            this.mAdData = adEntity;
            return Boolean.valueOf(AdManager.checkShowAd(adEntity));
        }
        this.mExpired = true;
        d0.h().disableAllData(this.mSlotId);
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$loadAdData$4(Boolean bool) throws Exception {
        if (bool.booleanValue() && AppUtils.isActivityAlive(getContext())) {
            setContent();
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$loadAdData$5(Boolean bool) throws Exception {
        return this.mExpired;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$loadAdData$6(Boolean bool) throws Exception {
        AdReq commonAdReq = ReqUtil.getCommonAdReq(this.mSlotId, this.mNoShowList);
        return AdApi.getInstance().getService().getAdData(AdSdkUtils.getSignatureHeader(ConvertUtils.json2QueryString(commonAdReq)), commonAdReq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdData$7() {
        setVisibility(8);
        AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdData$8(boolean z3) {
        new Handler(Looper.getMainLooper()).post(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAdData$9() {
        setVisibility(8);
        AdSdkUtils.onLoadAdFailed(getContext(), this.mAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        requestFocus();
    }

    private void saveAnalysisData() {
        AdSdkUtils.onLoadAdSuccess(getContext(), this.mAdListener);
        this.mShowTime = System.currentTimeMillis();
        AdManager.saveAdShowStatusBackground(this.mAdData, true);
        AdSdkUtils.trackEvent(this.mAdData.adId, System.currentTimeMillis(), this.mAdData.adSlotId, EventsConstants.AUTO_BEGIN, "", "", "", AdSdkUtils.getBehaviorId(), this.mLastBeginId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent() {
        if (this.mAdData == null) {
            return;
        }
        setVisibility(0);
        setText(this.mAdData.textContent);
        try {
            if (!TextUtils.isEmpty(this.mAdData.textFontSize)) {
                setTextSize(Integer.parseInt(this.mAdData.textFontSize));
            }
        } catch (Exception unused) {
        }
        String str = this.mAdData.textFontColor;
        if (isDark() && !TextUtils.isEmpty(this.mAdData.textFontColorDark)) {
            str = this.mAdData.textFontColorDark;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                setTextColor(Color.parseColor(str));
            }
        } catch (Exception unused2) {
        }
        String str2 = this.mAdData.backgroundColor;
        if (isDark() && !TextUtils.isEmpty(this.mAdData.backgroundColorDark)) {
            str2 = this.mAdData.backgroundColorDark;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                setBackgroundColor(Color.parseColor(str2));
            }
        } catch (Exception unused3) {
        }
        String str3 = this.mAdData.textIconUrl;
        if (isDark() && !TextUtils.isEmpty(this.mAdData.textIconUrlDark)) {
            str3 = this.mAdData.textIconUrlDark;
        }
        if (!TextUtils.isEmpty(str3)) {
            m mVarN = ((m) com.bumptech.glide.b.e(getContext()).load(str3).w(ConvertUtils.dp2px(16.0f), ConvertUtils.dp2px(16.0f))).N(this);
            mVarN.getClass();
            mVarN.T(new H1.j(mVarN.f21022k0), null, mVarN, J1.g.f4461a);
        }
        postDelayed(this.mFocusRunnable, 1500L);
        saveAnalysisData();
    }

    public IAdListener getAdListener() {
        return this.mAdListener;
    }

    public String getSlotId() {
        return this.mSlotId;
    }

    public void loadAdData() {
        if (TextUtils.isEmpty(this.mSlotId)) {
            setVisibility(8);
            return;
        }
        this.mExpired = AdSdkUtils.checkAdExpired(this.mSlotId);
        C1755g c1755g = new C1755g(new com.palmpay.lib.bridgewrapper.photo.upload.a(11), 0);
        df.i iVar = p298tf.f.f42628a;
        new C1760l(new C1760l(new C1760l(new C1760l(new C1760l(new C1760l(c1755g.k(iVar), new com.palmpay.lib.bridgewrapper.photo.upload.a(12), 1), new b(this, 0), 2).i(p071ef.b.a()), new b(this, 1), 2), new b(this, 2), 1).i(iVar).f(new b(this, 3)), new SingleAdFunction(this.mSlotId, new b(this, 4)), 2), new SingleAdPredicate(new b(this, 5)), 1).i(p071ef.b.a()).subscribe(new c(this, getContext(), this.mAdListener, 0));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        if ("04".equals(this.mAdData.jumpType)) {
            new ShowTextDialog(getContext(), this.mAdData.textContent).show();
            return;
        }
        AdSdkUtils.onClickAd(getContext(), this.mAdListener, this.mAdData);
        AdManager.saveAdClickStatus(this.mAdData);
        AdEntity adEntity = this.mAdData;
        AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mFocusRunnable);
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u e10, Object model, Target<Drawable> target, boolean isFirstResource) {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 1) {
            this.mLocationX = (int) event.getRawX();
            this.mLocationY = (int) event.getRawY();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
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

    public void setAdListener(IAdListener adListener) {
        this.mAdListener = adListener;
    }

    public void setSlotId(String slotId) {
        setSlotId(slotId, true);
    }

    public void switchDarkMode(boolean dark) {
        setContent();
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
        if (!AdSdkUtils.isValidGlideContext(getContext())) {
            return true;
        }
        setCompoundDrawablesWithIntrinsicBounds(resource, (Drawable) null, (Drawable) null, (Drawable) null);
        return true;
    }

    public void setSlotId(String slotId, boolean loadNow) {
        this.mSlotId = slotId;
        if (loadNow) {
            loadAdData();
        }
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mTextSize = 14;
        this.mTextColor = -16777216;
        this.mAdData = new AdEntity();
        this.mLastBeginId = "";
        this.mNoShowList = new ArrayList();
        this.mFocusRunnable = new a(this, 0);
        init(context, attrs, 0);
    }
}
