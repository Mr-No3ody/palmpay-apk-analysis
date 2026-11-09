package com.chuanyi.ad;

import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;

/* JADX INFO: loaded from: classes.dex */
public final class d implements IAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f21091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseViewGroupManager f21092c;

    public /* synthetic */ d(BaseViewGroupManager baseViewGroupManager, ViewGroup viewGroup, int i7) {
        this.f21090a = i7;
        this.f21092c = baseViewGroupManager;
        this.f21091b = viewGroup;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f21090a) {
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
                ((MarqueeViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewClicked", writableMapCreateMap);
                break;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("adId", adEntity.adId);
                writableMapCreateMap2.putString("applicationId", adEntity.applicationId);
                writableMapCreateMap2.putString("adSlotId", adEntity.adSlotId);
                writableMapCreateMap2.putString("imageUrl", adEntity.imageUrl);
                writableMapCreateMap2.putString("jumpType", adEntity.jumpType);
                writableMapCreateMap2.putString("relativeUrl", adEntity.relativeUrl);
                writableMapCreateMap2.putString("imageDimension", adEntity.imageDimention);
                writableMapCreateMap2.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, adEntity.countryCode);
                writableMapCreateMap2.putString("showDates", adEntity.showDates);
                writableMapCreateMap2.putString("multipleImageUrl", adEntity.multipleImageUrl);
                writableMapCreateMap2.putString("jumpParams", adEntity.jumpParams);
                ((SingleAdViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewClicked", writableMapCreateMap2);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
        switch (this.f21090a) {
            case 0:
                ((MarqueeViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewClosed", Arguments.createMap());
                break;
            default:
                ((SingleAdViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewClosed", Arguments.createMap());
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        switch (this.f21090a) {
            case 0:
                ((MarqueeViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewFailToLoad", Arguments.createMap());
                break;
            default:
                ((SingleAdViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewFailToLoad", Arguments.createMap());
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        switch (this.f21090a) {
            case 0:
                ((MarqueeViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewSuccess", Arguments.createMap());
                break;
            default:
                ((SingleAdViewManager) this.f21092c).receiveEvent(this.f21091b.getId(), "onViewSuccess", Arguments.createMap());
                break;
        }
    }
}
