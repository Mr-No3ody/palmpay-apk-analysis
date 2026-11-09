package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.ResetPinVerificationReq;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinVerificationContract;", "", "View", "Presenter", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ResetPinVerificationContract {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinVerificationContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinVerificationContract$View;", "getResetPinVerifyType", "", "smsToken", "", "resetPinVerify", "req", "Lcom/transsnet/palmpay/account/bean/ResetPinVerificationReq;", TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT, "", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void getResetPinVerifyType(@Nullable String smsToken);

        void resetPinVerify(@NotNull ResetPinVerificationReq req, boolean v3);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/mvp/contract/ResetPinVerificationContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "showLoadingView", "", "show", "", "handleResetPinVerifyTypeRsp", "rsp", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/account/bean/ResetPinVerifyTypeRsp;", "handleResetPinVerifyResult", "Lcom/transsnet/palmpay/core/bean/rsp/CommonStringResult;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void handleResetPinVerifyResult(@NotNull CommonStringResult rsp);

        void handleResetPinVerifyTypeRsp(@NotNull CommonBeanResult<ResetPinVerifyTypeRsp> rsp);

        void showLoadingView(boolean show);
    }
}
