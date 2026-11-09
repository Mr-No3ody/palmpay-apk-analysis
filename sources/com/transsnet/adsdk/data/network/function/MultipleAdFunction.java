package com.transsnet.adsdk.data.network.function;

import com.transsnet.adsdk.data.bean.resp.AdBean;
import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IRemoteDataListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MultipleAdFunction implements Function<AdCommonResult<AdBean>, List<AdEntity>> {
    private IRemoteDataListener mRemoteDataListener;
    private String mSlotId;

    public MultipleAdFunction(String slot) {
        this(slot, null);
    }

    public MultipleAdFunction(String slot, IRemoteDataListener remoteDataListener) {
        this.mSlotId = slot;
        this.mRemoteDataListener = remoteDataListener;
    }

    @Override // io.reactivex.functions.Function
    public List<AdEntity> apply(AdCommonResult<AdBean> param) {
        List<AdEntity> list;
        if (param == null) {
            IRemoteDataListener iRemoteDataListener = this.mRemoteDataListener;
            if (iRemoteDataListener != null) {
                iRemoteDataListener.emptyData(false);
            }
            return new ArrayList();
        }
        if (!param.isSuccess()) {
            IRemoteDataListener iRemoteDataListener2 = this.mRemoteDataListener;
            if (iRemoteDataListener2 != null) {
                iRemoteDataListener2.emptyData(false);
            }
            return new ArrayList();
        }
        AdBean adBean = param.data;
        if (adBean != null && (list = adBean.list) != null && !list.isEmpty()) {
            AdSdkUtils.setAdExpiredTime(this.mSlotId, System.currentTimeMillis() + param.data.expiredTime);
            return param.data.list;
        }
        IRemoteDataListener iRemoteDataListener3 = this.mRemoteDataListener;
        if (iRemoteDataListener3 != null) {
            iRemoteDataListener3.emptyData(true);
        }
        return new ArrayList();
    }
}
