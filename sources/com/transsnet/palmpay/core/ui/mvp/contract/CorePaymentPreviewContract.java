package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;

/* JADX INFO: loaded from: classes3.dex */
public interface CorePaymentPreviewContract {

    public interface Presenter extends IBasePresenter<View> {
        void queryPreviewInfo(PreviewPayInfoV2Req req);
    }

    public interface View extends SelectPaymentContract$IView {
        void updatePreviewInfo(String payAccountType, PreviewPayInfoResp.DataBean bean);
    }
}
