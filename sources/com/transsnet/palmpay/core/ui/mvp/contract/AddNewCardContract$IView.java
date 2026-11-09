package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.CardNoBankInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.GetFundActivityConfigRsp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AddNewCardContract$IView extends BasePaymentContract.IView {
    void getBindBankCardTips(CommonBeanResult<String> commonBeanResult);

    default void handleBindResult(BindActionRsp bindActionRsp) {
    }

    void handleCheckCardBindNum(CommonResult commonResult);

    void handleCheckInputBankCardInfoRsp(CheckBankCardInfoReq checkBankCardInfoReq, CheckBankCardInfoRsp checkBankCardInfoRsp);

    default void handleFundActivityConfig(CommonBeanResult<GetFundActivityConfigRsp> commonBeanResult) {
    }

    default void handleGetBankInfoByCardNoRsp(CardNoBankInfoRsp cardNoBankInfoRsp) {
    }

    default void handlePaymentMethods(List<PaymentMethod> list) {
    }
}
