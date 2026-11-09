package com.transsnet.adsdk.data.network.function;

import android.text.TextUtils;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.data.bean.resp.AdBean;
import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public class SingleAdFunction implements Function<AdCommonResult<AdBean>, AdEntity> {
    private IRemoteDataListener mRemoteDataListener;
    private String mSlotId;

    public SingleAdFunction(String slotId) {
        this(slotId, null);
    }

    private void postEmptyResult() {
        IRemoteDataListener iRemoteDataListener = this.mRemoteDataListener;
        if (iRemoteDataListener != null) {
            iRemoteDataListener.emptyData(true);
        }
    }

    public SingleAdFunction(String slotId, IRemoteDataListener remoteDataListener) {
        this.mSlotId = slotId;
        this.mRemoteDataListener = remoteDataListener;
    }

    @Override // io.reactivex.functions.Function
    public AdEntity apply(AdCommonResult<AdBean> param) {
        AdEntity adEntityQueryByAdId;
        if (param == null) {
            postEmptyResult();
            return new AdEntity();
        }
        if (!param.isSuccess()) {
            postEmptyResult();
            return new AdEntity();
        }
        AdBean adBean = param.data;
        if (adBean == null || adBean.list == null || adBean.list.isEmpty()) {
            postEmptyResult();
            return new AdEntity();
        }
        if (!TextUtils.isEmpty(this.mSlotId)) {
            AdSdkUtils.setAdExpiredTime(this.mSlotId, System.currentTimeMillis() + param.data.expiredTime);
        }
        AdEntity adEntity = param.data.list.get(0);
        if (adEntity != null && !TextUtils.isEmpty(adEntity.adId) && (adEntityQueryByAdId = d0.h().queryByAdId(adEntity.adId)) != null) {
            adEntity.closeCount = adEntityQueryByAdId.closeCount;
        }
        return adEntity;
    }
}
