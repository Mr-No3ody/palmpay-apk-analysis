package com.transsnet.palmpay.core.dialog;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.util.ToastUtils;
import com.wang.avi.AVLoadingIndicatorView;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CashierCouponListDialog f27375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CashierCouponItem f27376g;

    public a(CashierCouponListDialog cashierCouponListDialog, CashierCouponItem cashierCouponItem) {
        this.f27375f = cashierCouponListDialog;
        this.f27376g = cashierCouponItem;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f27375f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        AVLoadingIndicatorView aVLoadingIndicatorView;
        Intrinsics.checkNotNullParameter(message, "message");
        p142ja.b bVar = this.f27375f.binding;
        if (bVar != null && (aVLoadingIndicatorView = bVar.f38453f) != null) {
            aVLoadingIndicatorView.setVisibility(8);
        }
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        CashierCouponListDialog cashierCouponListDialog = this.f27375f;
        p142ja.b bVar = cashierCouponListDialog.binding;
        if (bVar != null) {
            bVar.f38453f.setVisibility(8);
        }
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            ToastUtils.showLong(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, new Object[0]);
            return;
        }
        CashierCouponListDialog.CallBack callBack = cashierCouponListDialog.mCallBack;
        if (callBack != null) {
            callBack.onCouponClick(this.f27376g);
        }
        cashierCouponListDialog.dismiss();
    }
}
