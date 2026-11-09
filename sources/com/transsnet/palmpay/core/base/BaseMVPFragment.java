package com.transsnet.palmpay.core.base;

import com.transsnet.palmpay.core.base.IBasePresenter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMVPFragment<T extends IBasePresenter> extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IBasePresenter f27328i;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public void n() {
        IBasePresenter iBasePresenterT = t();
        this.f27328i = iBasePresenterT;
        iBasePresenterT.attachView(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        IBasePresenter iBasePresenter = this.f27328i;
        if (iBasePresenter != null) {
            iBasePresenter.detachView();
        }
    }

    public abstract IBasePresenter t();
}
