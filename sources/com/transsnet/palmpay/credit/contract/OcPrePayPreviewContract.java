package com.transsnet.palmpay.credit.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;

/* JADX INFO: loaded from: classes4.dex */
public interface OcPrePayPreviewContract {

    public interface IPreviewPresenter extends IBasePresenter<IPreviewView> {
        void createOrder(OcOrderReq ocOrderReq);

        void queryPreviewInfo(PreviewPayInfoV2Req previewPayInfoV2Req);
    }

    public interface IPreviewView extends SelectPaymentContract$IView {
        void launchPay(OcOrderRsp ocOrderRsp);

        void showPreviewInfo(PreviewPayInfoResp.DataBean dataBean);
    }
}
