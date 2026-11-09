package com.transsnet.adsdk.data.network.Predicate;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IMultipleUpdateListener;
import io.reactivex.functions.Predicate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MultipleAdPredicate implements Predicate<List<AdEntity>> {
    private IMultipleUpdateListener mChangeListener;

    public MultipleAdPredicate(IMultipleUpdateListener adListener) {
        this.mChangeListener = adListener;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(List<AdEntity> adEntities) {
        boolean z3 = (adEntities == null || adEntities.size() == 0) ? false : true;
        IMultipleUpdateListener iMultipleUpdateListener = this.mChangeListener;
        if (iMultipleUpdateListener != null) {
            iMultipleUpdateListener.dataUpdate(z3, adEntities);
        }
        return z3;
    }
}
