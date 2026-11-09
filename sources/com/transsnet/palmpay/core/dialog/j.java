package com.transsnet.palmpay.core.dialog;

import Pa.i0;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p052da.S;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod f27386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27387g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectPayMethodDialog f27388i;

    public j(SelectPayMethodDialog selectPayMethodDialog, PaymentMethod paymentMethod, int i7) {
        this.f27388i = selectPayMethodDialog;
        this.f27386f = paymentMethod;
        this.f27387g = i7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f27388i.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        SelectPayMethodDialog selectPayMethodDialog = this.f27388i;
        if (i0.W(selectPayMethodDialog.basePreviewActivity)) {
            selectPayMethodDialog.basePreviewActivity.showLoadingDialog(false);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        SelectPayMethodDialog selectPayMethodDialog = this.f27388i;
        if (i0.W(selectPayMethodDialog.basePreviewActivity)) {
            selectPayMethodDialog.basePreviewActivity.showLoadingDialog(false);
            if (previewPayInfoResp.getData() == null || selectPayMethodDialog.mCallBack == null) {
                return;
            }
            selectPayMethodDialog.mCallBack.onChoosePayMethodClick(this.f27386f, previewPayInfoResp.getData());
            S s3 = selectPayMethodDialog.mAdapter;
            s3.f35731o = this.f27387g;
            s3.notifyDataSetChanged();
        }
    }
}
