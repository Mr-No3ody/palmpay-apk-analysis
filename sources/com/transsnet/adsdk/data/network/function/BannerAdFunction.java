package com.transsnet.adsdk.data.network.function;

import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BannerAdFunction implements Function<List<AdEntity>, List<AdEntity>> {
    @Override // io.reactivex.functions.Function
    public List<AdEntity> apply(List<AdEntity> adEntities) {
        if (adEntities == null || adEntities.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (AdEntity adEntity : adEntities) {
            adEntity.displayOrder = i7;
            if (AdManager.checkShowAd(adEntity)) {
                arrayList.add(adEntity);
                AdManager.saveAdShowStatus(adEntity, false);
            }
            i7++;
        }
        return arrayList;
    }
}
