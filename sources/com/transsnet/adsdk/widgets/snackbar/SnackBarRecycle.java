package com.transsnet.adsdk.widgets.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.snackbar.Snackbar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.utils.ConvertUtils;
import com.transsnet.analysis.contants.EventsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class SnackBarRecycle {

    @Deprecated
    private Drawable drawable;
    private final AdEntity mAdData;
    private final IAdListener mAdListener;
    private ImageView mImageView;
    private String mLastBeginId;
    private int mLocationX;
    private int mLocationY;
    private long mShowTime;

    @Deprecated
    private View parentView;

    @Deprecated
    private boolean valid;

    @Deprecated
    private WeakReference<Context> weakContext;

    @Deprecated
    public SnackBarRecycle(WeakReference<Context> weakContext, View parentView, Drawable drawable, boolean valid, AdEntity adData, IAdListener adListener) {
        this.mLastBeginId = "";
        this.weakContext = weakContext;
        this.parentView = parentView;
        this.drawable = drawable;
        this.valid = valid;
        this.mAdListener = adListener;
        this.mAdData = adData;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private Snackbar createSnackBar(Context context, View parentView, int marginTop) {
        Snackbar snackbarMake = Snackbar.make(parentView, "", -1);
        snackbarMake.getView().setPadding(0, 0, 0, 0);
        snackbarMake.getView().setBackgroundColor(0);
        snackbarMake.getView().setElevation(0.0f);
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarMake.getView();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) snackbarLayout.getLayoutParams();
        layoutParams.gravity = 48;
        if (marginTop == -1) {
            layoutParams.topMargin = context.getResources().getDimensionPixelSize(R.dimen.ad_dp_52);
        } else {
            layoutParams.topMargin = marginTop;
        }
        View viewInflate = LayoutInflater.from(snackbarMake.getView().getContext()).inflate(R.layout.lib_ad_snackbar_ad_layout, (ViewGroup) null);
        this.mImageView = (ImageView) viewInflate.findViewById(R.id.snack_bar_content_img);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.snack_bar_close_img);
        com.bumptech.glide.b.f(this.mImageView).load(this.mAdData.imageUrl).S(this.mImageView);
        if (this.mAdData.showCloseButton == 1) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        final int i7 = 0;
        imageView.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.transsnet.adsdk.widgets.snackbar.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SnackBarRecycle f25676b;

            {
                this.f25676b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i7) {
                    case 0:
                        return this.f25676b.lambda$createSnackBar$0(view, motionEvent);
                    default:
                        return this.f25676b.lambda$createSnackBar$2(view, motionEvent);
                }
            }
        });
        imageView.setOnClickListener(new i(this, snackbarMake, context));
        final int i10 = 1;
        viewInflate.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.transsnet.adsdk.widgets.snackbar.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SnackBarRecycle f25676b;

            {
                this.f25676b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i10) {
                    case 0:
                        return this.f25676b.lambda$createSnackBar$0(view, motionEvent);
                    default:
                        return this.f25676b.lambda$createSnackBar$2(view, motionEvent);
                }
            }
        });
        viewInflate.setOnClickListener(new i(this, context, snackbarMake));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AppUtils.getScreenWidth() - ConvertUtils.dp2px(24.0f), -2);
        layoutParams2.leftMargin = ConvertUtils.dp2px(12.0f);
        snackbarLayout.addView(viewInflate, layoutParams2);
        snackbarMake.setDuration(5000);
        snackbarMake.addCallback(new j(this));
        return snackbarMake;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createSnackBar$0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.mLocationX = (int) motionEvent.getRawX();
        this.mLocationY = (int) motionEvent.getRawY();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSnackBar$1(Snackbar snackbar, Context context, View view) {
        if (snackbar.isShown()) {
            AdSdkUtils.onAdClosed(context, this.mAdListener);
            AdManager.saveAdCloseStatus(this.mAdData);
            AdEntity adEntity = this.mAdData;
            AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, "close", String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
            snackbar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createSnackBar$2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.mLocationX = (int) motionEvent.getRawX();
        this.mLocationY = (int) motionEvent.getRawY();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSnackBar$3(Context context, Snackbar snackbar, View view) {
        AdSdkUtils.onClickAd(context, this.mAdListener, this.mAdData);
        AdManager.saveAdClickStatus(this.mAdData);
        AdEntity adEntity = this.mAdData;
        AdSdkUtils.trackEvent(adEntity.adId, this.mShowTime, adEntity.adSlotId, EventsConstants.CLICK, EventsConstants.CLICK_OPEN, String.valueOf(this.mLocationX), String.valueOf(this.mLocationY), AdSdkUtils.getBehaviorId(), "");
        snackbar.dismiss();
    }

    @Deprecated
    public boolean isValid() {
        return this.valid;
    }

    @Deprecated
    public void setValid(boolean valid) {
        ImageView imageView;
        this.valid = valid;
        if (valid || (imageView = this.mImageView) == null) {
            return;
        }
        this.drawable = null;
        imageView.setImageDrawable(null);
    }

    @Deprecated
    public void show() {
        if (this.valid) {
            createSnackBar(this.weakContext.get(), this.parentView, -1).show();
        }
    }

    public void show(Context context, View parentView, int marginTop) {
        createSnackBar(context, parentView, marginTop).show();
    }

    public SnackBarRecycle(AdEntity adData, IAdListener adListener) {
        this.mLastBeginId = "";
        this.valid = true;
        this.mAdListener = adListener;
        this.mAdData = adData;
    }
}
