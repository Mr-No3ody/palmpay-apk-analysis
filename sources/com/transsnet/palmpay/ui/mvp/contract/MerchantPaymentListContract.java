package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantListRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface MerchantPaymentListContract {

    public interface Presenter extends IBasePresenter<View> {
        void queryMerchantList();

        void unbind(String str);
    }

    public interface View extends IBaseView {
        void showFailMessage(String str);

        void showLoadingView(boolean z3);

        void updateMerchantList(List<MerchantListRsp> list);
    }
}
