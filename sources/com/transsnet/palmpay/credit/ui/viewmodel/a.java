package com.transsnet.palmpay.credit.ui.viewmodel;

import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AvailableCouponItem f30710f;

    public a(AvailableCouponItem availableCouponItem) {
        this.f30710f = availableCouponItem;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f30710f.getMDisposable().add(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        AvailableCouponItem availableCouponItem = this.f30710f;
        availableCouponItem.setVisibility(8);
        AvailableCouponItem.OnVisibleCallBack onVisibleCallBack = availableCouponItem.getOnVisibleCallBack();
        if (onVisibleCallBack != null) {
            onVisibleCallBack.visible(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        T data;
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        boolean z3 = (commonBeanResult == null || !commonBeanResult.isSuccess() || commonBeanResult.data == 0) ? false : true;
        int i7 = z3 ? 0 : 8;
        AvailableCouponItem availableCouponItem = this.f30710f;
        availableCouponItem.setVisibility(i7);
        AvailableCouponItem.OnVisibleCallBack onVisibleCallBack = availableCouponItem.getOnVisibleCallBack();
        if (onVisibleCallBack != null) {
            onVisibleCallBack.visible(z3);
        }
        if (commonBeanResult == null || !commonBeanResult.isSuccess() || (data = commonBeanResult.data) == 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        AvailableCouponItem.f(availableCouponItem, (CouponItem) data);
    }
}
