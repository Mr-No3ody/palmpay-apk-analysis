package p353xd;

import Kd.C0425w1;
import Pa.F;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.CreateTransferOrderBeforeResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.FinanceGuidanceDialog$OnFinanceGuidanceDialogListener;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements FinanceGuidanceDialog$OnFinanceGuidanceDialogListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentInfoRsp.DataBean f43853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43854b;

    public C(VerifyPaymentInfoRsp.DataBean dataBean, TransferToBankInputAmountActivity transferToBankInputAmountActivity) {
        this.f43853a = dataBean;
        this.f43854b = transferToBankInputAmountActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FinanceGuidanceDialog$OnFinanceGuidanceDialogListener
    public final void onSaveToCashBox() {
        VerifyPaymentInfoRsp.DataBean dataBean = this.f43853a;
        boolean zC = Intrinsics.c(dataBean.financialGuidePopUp.getNeedAutoCashBox(), Boolean.TRUE);
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43854b;
        if (zC) {
            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
            TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
            transferToBankViewModel.getClass();
            f.s(transferToBankViewModel, new C0425w1(1, null), new l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ActivityUtils.startActivity(F.a(transferToBankInputAmountActivity, dataBean.financialGuidePopUp.getFinancialButtonJumpUrl()));
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FinanceGuidanceDialog$OnFinanceGuidanceDialogListener
    public final void onTransfer() {
        String str;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43854b;
        TransferBankChannelInfoResp transferBankChannelInfoResp = transferToBankInputAmountActivity.f33531o;
        CreateTransferOrderBeforeResp csLevyFeeGuide = transferBankChannelInfoResp != null ? transferBankChannelInfoResp.getCsLevyFeeGuide() : null;
        VerifyPaymentInfoRsp.DataBean dataBean = this.f43853a;
        if (dataBean == null || (str = dataBean.accountName) == null) {
            str = "";
        }
        transferToBankInputAmountActivity.q(csLevyFeeGuide, str);
    }
}
