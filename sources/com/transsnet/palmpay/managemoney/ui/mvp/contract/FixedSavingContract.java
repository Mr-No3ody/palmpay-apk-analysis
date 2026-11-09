package com.transsnet.palmpay.managemoney.ui.mvp.contract;

import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/mvp/contract/FixedSavingContract;", "", "View", "Presenter", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FixedSavingContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/mvp/contract/FixedSavingContract$Presenter;", "", "queryPreviewInfo", "", "req", "Lcom/transsnet/palmpay/core/bean/req/PreviewPayInfoV2Req;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter {
        void queryPreviewInfo(@NotNull PreviewPayInfoV2Req req);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/mvp/contract/FixedSavingContract$View;", "Lcom/transsnet/palmpay/core/ui/mvp/contract/SelectPaymentContract$IView;", "showPreviewInfoResp", "", "resp", "Lcom/transsnet/palmpay/core/bean/payment/PreviewPayInfoResp;", "showPreviewInfoRespError", "errMsg", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends SelectPaymentContract$IView {
        void showPreviewInfoResp(@NotNull PreviewPayInfoResp resp);

        void showPreviewInfoRespError(@NotNull String errMsg);
    }
}
