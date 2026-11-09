package com.transsnet.adsdk.data.network.Predicate;

import android.text.TextUtils;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IDataUpdateListener;
import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class SingleAdPredicate implements Predicate<AdEntity> {
    private IDataUpdateListener mChangeListener;

    public SingleAdPredicate(IDataUpdateListener changeListener) {
        this.mChangeListener = changeListener;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(AdEntity entity) {
        boolean zCheckShowAd = AdManager.checkShowAd(entity);
        if (this.mChangeListener != null && !TextUtils.isEmpty(entity.adId)) {
            this.mChangeListener.dataUpdate(zCheckShowAd, entity);
        }
        return zCheckShowAd;
    }
}
