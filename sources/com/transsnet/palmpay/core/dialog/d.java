package com.transsnet.palmpay.core.dialog;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CouponItem f27379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CoreSelectCouponForPaymentDialog f27380g;

    public d(CoreSelectCouponForPaymentDialog coreSelectCouponForPaymentDialog, CouponItem couponItem) {
        this.f27380g = coreSelectCouponForPaymentDialog;
        this.f27379f = couponItem;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f27380g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f27380g.mLoadingView.setVisibility(8);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        CoreSelectCouponForPaymentDialog coreSelectCouponForPaymentDialog = this.f27380g;
        coreSelectCouponForPaymentDialog.mLoadingView.setVisibility(8);
        if (!commonBeanResult.isSuccess()) {
            ToastUtils.showLong(commonBeanResult.getRespMsg());
        } else {
            coreSelectCouponForPaymentDialog.mCallBack.onCouponClick(this.f27379f);
            coreSelectCouponForPaymentDialog.dismiss();
        }
    }
}
