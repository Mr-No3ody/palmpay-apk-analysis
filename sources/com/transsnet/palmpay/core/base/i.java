package com.transsnet.palmpay.core.base;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBasePresenter f27350a;

    public abstract IBasePresenter l();

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        IBasePresenter iBasePresenter = this.f27350a;
        if (iBasePresenter instanceof j) {
            ((j) iBasePresenter).unSubscribe();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IBasePresenter iBasePresenter = this.f27350a;
        if (iBasePresenter != null) {
            iBasePresenter.detachView();
            this.f27350a = null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void processLogic(Bundle bundle) {
        IBasePresenter iBasePresenterL = l();
        this.f27350a = iBasePresenterL;
        iBasePresenterL.attachView(this);
    }
}
