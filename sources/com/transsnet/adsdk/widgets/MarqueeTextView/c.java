package com.transsnet.adsdk.widgets.MarqueeTextView;

import android.content.Context;
import android.view.View;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.data.network.observer.AdCommonObserver;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.widgets.splash.SplashAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AdCommonObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f25597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(View view, Context context, IAdListener iAdListener, int i7) {
        super(context, iAdListener);
        this.f25596a = i7;
        this.f25597b = view;
    }

    @Override // com.transsnet.adsdk.data.network.INetResult
    public final void onSuccess(Object obj) {
        switch (this.f25596a) {
            case 0:
                MarqueeView marqueeView = (MarqueeView) this.f25597b;
                marqueeView.mAdData = (AdEntity) obj;
                if (AppUtils.isActivityAlive(marqueeView.getContext())) {
                    marqueeView.setContent();
                }
                break;
            default:
                AdEntity adEntity = (AdEntity) obj;
                SplashAdView splashAdView = (SplashAdView) this.f25597b;
                splashAdView.mAdData = adEntity;
                if (AppUtils.isActivityAlive(splashAdView.getContext())) {
                    if (splashAdView.mAdType != 0) {
                        splashAdView.showWebViewAd();
                    } else {
                        SplashAdView.downloadNoCacheImg(adEntity);
                    }
                }
                break;
        }
    }
}
