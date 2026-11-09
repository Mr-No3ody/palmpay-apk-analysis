package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ExpressageInfoActivity f27709g;

    public /* synthetic */ S(ExpressageInfoActivity expressageInfoActivity, int i7) {
        this.f27708f = i7;
        this.f27709g = expressageInfoActivity;
    }

    @Override // Z4.e, io.reactivex.Observer
    public final void onError(Throwable e10) {
        switch (this.f27708f) {
            case 0:
                Intrinsics.checkNotNullParameter(e10, "e");
                super.onError(e10);
                ToastUtils.showShort(e10.getMessage(), new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(e10, "e");
                super.onError(e10);
                ToastUtils.showShort(e10.getMessage(), new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(e10, "e");
                super.onError(e10);
                ToastUtils.showShort(e10.getMessage(), new Object[0]);
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f27708f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f27709g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f27709g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f27709g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f27708f) {
            case 0:
                ToastUtils.showShort(str, new Object[0]);
                break;
            case 1:
                ToastUtils.showShort(str, new Object[0]);
                break;
            default:
                ToastUtils.showShort(str, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f27708f) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (commonBeanResult != null && commonBeanResult.isSuccess()) {
                    ExpressageInfoActivity.l(this.f27709g, commonBeanResult);
                } else {
                    ToastUtils.showLong(commonBeanResult != null ? commonBeanResult.getRespMsg() : null, new Object[0]);
                }
                break;
            case 1:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                if (commonBeanResult2 != null) {
                    if (!commonBeanResult2.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult2.getRespMsg(), new Object[0]);
                    } else {
                        ExpressageInfoActivity.l(this.f27709g, commonBeanResult2);
                    }
                    break;
                }
                break;
            default:
                CommonBeanResult commonBeanResult3 = (CommonBeanResult) obj;
                if (commonBeanResult3 != null) {
                    if (!commonBeanResult3.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult3.getRespMsg(), new Object[0]);
                    } else {
                        ExpressageInfoActivity.l(this.f27709g, commonBeanResult3);
                    }
                    break;
                }
                break;
        }
    }
}
