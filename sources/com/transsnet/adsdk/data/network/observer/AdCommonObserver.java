package com.transsnet.adsdk.data.network.observer;

import android.content.Context;
import com.transsnet.adsdk.data.network.INetResult;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdCommonObserver<T> implements Observer<T>, INetResult<T> {
    private IAdListener mAdListener;
    private Context mContext;

    public AdCommonObserver(Context context, IAdListener adListener) {
        this.mContext = context;
        this.mAdListener = adListener;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable e10) {
        e10.printStackTrace();
        if (!(e10 instanceof C1993k)) {
            onFailed(FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, e10.getMessage());
        } else {
            C1993k c1993k = (C1993k) e10;
            onFailed(String.valueOf(c1993k.f41932a), c1993k.getMessage());
        }
    }

    public void onFailed(String errCode, String errMsg) {
        AdSdkUtils.onLoadAdFailed(this.mContext, this.mAdListener);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        onSuccess(t);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable d2) {
    }
}
