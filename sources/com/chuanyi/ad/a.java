package com.chuanyi.ad;

import Pa.n0;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a implements IAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21081a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21084d;

    public /* synthetic */ a() {
    }

    public static void a(String str, AdEntity adEntity) {
        if (adEntity == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("jumpType", adEntity.jumpType);
        map.put("jumpPath", adEntity.relativeUrl);
        map.put("adPictureUrl", adEntity.imageUrl);
        map.put("caller", str);
        n0.g().n("Endpage_advertising_click_pic_" + adEntity.adId, map);
        try {
            org.chromium.support_lib_boundary.util.b.Q(adEntity.jumpType, adEntity.relativeUrl, adEntity.jumpParams, null);
        } catch (Exception e10) {
            F6.d.c("a", "clickAd: ", e10);
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f21081a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("adId", adEntity.adId);
                writableMapCreateMap.putString("applicationId", adEntity.applicationId);
                writableMapCreateMap.putString("adSlotId", adEntity.adSlotId);
                writableMapCreateMap.putString("imageUrl", adEntity.imageUrl);
                writableMapCreateMap.putString("jumpType", adEntity.jumpType);
                writableMapCreateMap.putString("relativeUrl", adEntity.relativeUrl);
                writableMapCreateMap.putString("imageDimension", adEntity.imageDimention);
                writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, adEntity.countryCode);
                writableMapCreateMap.putString("showDates", adEntity.showDates);
                writableMapCreateMap.putString("multipleImageUrl", adEntity.multipleImageUrl);
                writableMapCreateMap.putString("jumpParams", adEntity.jumpParams);
                ((AdBannerManager) this.f21084d).receiveEvent((ThemedReactContext) this.f21082b, ((ViewGroup) this.f21083c).getId(), "onViewClicked", writableMapCreateMap);
                break;
            default:
                ClickEvent clickEvent = (ClickEvent) this.f21084d;
                if (clickEvent != null) {
                    n0.g().k(clickEvent);
                }
                a((String) this.f21083c, adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
        switch (this.f21081a) {
            case 0:
                ((AdBannerManager) this.f21084d).receiveEvent((ThemedReactContext) this.f21082b, ((ViewGroup) this.f21083c).getId(), "onViewClosed", Arguments.createMap());
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        switch (this.f21081a) {
            case 0:
                ((AdBannerManager) this.f21084d).receiveEvent((ThemedReactContext) this.f21082b, ((ViewGroup) this.f21083c).getId(), "onViewFailToLoad", Arguments.createMap());
                break;
            default:
                View view = (View) this.f21082b;
                if (view != null) {
                    view.setVisibility(8);
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        switch (this.f21081a) {
            case 0:
                ((AdBannerManager) this.f21084d).receiveEvent((ThemedReactContext) this.f21082b, ((ViewGroup) this.f21083c).getId(), "onViewSuccess", Arguments.createMap());
                break;
        }
    }

    public a(View view, String str) {
        this.f21082b = view;
        this.f21083c = str;
    }

    public a(AdBannerManager adBannerManager, ThemedReactContext themedReactContext, ViewGroup viewGroup) {
        this.f21084d = adBannerManager;
        this.f21082b = themedReactContext;
        this.f21083c = viewGroup;
    }

    private final void b() {
    }

    private void c() {
    }
}
