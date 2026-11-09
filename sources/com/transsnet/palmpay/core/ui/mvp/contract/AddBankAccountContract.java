package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.req.BindBankAccountReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.rsp.AddBankAccSendOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.AddPayBankAccRsp;
import com.transsnet.palmpay.core.bean.rsp.BindActionRsp;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AddBankAccountContract {

    public interface IPresenter<T> extends BasePaymentContract.IPresenter<T> {
        void addBankAccount(AddBankAccountReq addBankAccountReq);

        void addBankAccountSendOtp(AddBankAccSendOtpReq addBankAccSendOtpReq);

        void addTzBankAccount(AddBankAccountReq addBankAccountReq);

        void bindBankAccount(BindBankAccountReq bindBankAccountReq);

        void checkCardBindNum(CheckCardBindNumReq checkCardBindNumReq);

        void checkInputBankAccountInfo(CheckBankCardInfoReq checkBankCardInfoReq);

        void queryPaymentMethod();
    }

    public interface IView extends BasePaymentContract.IView {
        default void handleAddBankAccountResult(AddPayBankAccRsp addPayBankAccRsp) {
        }

        default void handleAddTzBankAccountResult(CommonResult commonResult) {
        }

        default void handleBindResult(BindActionRsp bindActionRsp) {
        }

        default void handleCheckCardBindNum(CommonResult commonResult) {
        }

        default void handleCheckInputBankAccountInfoRsp(CheckBankCardInfoReq checkBankCardInfoReq, CheckBankCardInfoRsp checkBankCardInfoRsp) {
        }

        default void handleOtpResult(AddBankAccSendOtpRsp addBankAccSendOtpRsp) {
        }

        default void handlePaymentMethods(List<PaymentMethod> list) {
        }
    }
}
