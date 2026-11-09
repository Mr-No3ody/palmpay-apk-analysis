package com.transsnet.palmpay.credit.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.credit.bean.resp.CLRepayOrderData;

/* JADX INFO: loaded from: classes4.dex */
public interface CLRepayPreviewContract {

    public interface ICLRepayPreviewPresenter extends IBasePresenter<ICLRepayPreviewView> {
        void queryPreviewInfo(PreviewPayInfoV2Req previewPayInfoV2Req);
    }

    public interface ICLRepayPreviewView extends SelectPaymentContract$IView {
        void launchPay(CLRepayOrderData cLRepayOrderData);

        void showPreviewInfo(PreviewPayInfoResp.DataBean dataBean);
    }
}
