package p353xd;

import android.view.View;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.CreateTransferOrderBeforeResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.BeneficiaryBankUnstableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements ConfirmDuplicateTransferDialog.OnContinueClickListener, ResultCallback, BeneficiaryBankUnstableDialog.OnContinueClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentInfoRsp.DataBean f43901c;

    public /* synthetic */ t(TransferToBankInputAmountActivity transferToBankInputAmountActivity, VerifyPaymentInfoRsp.DataBean dataBean, int i7) {
        this.f43899a = i7;
        this.f43900b = transferToBankInputAmountActivity;
        this.f43901c = dataBean;
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        CreateTransferOrderBeforeResp csLevyFeeGuide;
        String str;
        String str2;
        String str3 = "";
        VerifyPaymentInfoRsp.DataBean dataBean = this.f43901c;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43900b;
        Boolean bool = (Boolean) obj;
        switch (this.f43899a) {
            case 1:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                if (bool.booleanValue()) {
                    TransferBankChannelInfoResp transferBankChannelInfoResp = transferToBankInputAmountActivity.f33531o;
                    csLevyFeeGuide = transferBankChannelInfoResp != null ? transferBankChannelInfoResp.getCsLevyFeeGuide() : null;
                    if (dataBean != null && (str = dataBean.accountName) != null) {
                        str3 = str;
                    }
                    transferToBankInputAmountActivity.q(csLevyFeeGuide, str3);
                }
                break;
            default:
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                if (bool.booleanValue()) {
                    TransferBankChannelInfoResp transferBankChannelInfoResp2 = transferToBankInputAmountActivity.f33531o;
                    csLevyFeeGuide = transferBankChannelInfoResp2 != null ? transferBankChannelInfoResp2.getCsLevyFeeGuide() : null;
                    if (dataBean != null && (str2 = dataBean.accountName) != null) {
                        str3 = str2;
                    }
                    transferToBankInputAmountActivity.q(csLevyFeeGuide, str3);
                }
                break;
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog.OnContinueClickListener
    public void onContinueClick(View it) {
        VerifyPaymentInfoRsp.DataBean dataBean = this.f43901c;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43900b;
        switch (this.f43899a) {
            case 0:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(it, "it");
                TransferBankChannelInfoResp transferBankChannelInfoResp = transferToBankInputAmountActivity.f33531o;
                CreateTransferOrderBeforeResp csLevyFeeGuide = transferBankChannelInfoResp != null ? transferBankChannelInfoResp.getCsLevyFeeGuide() : null;
                String str = dataBean.accountName;
                if (str == null) {
                    str = "";
                }
                transferToBankInputAmountActivity.q(csLevyFeeGuide, str);
                break;
            default:
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(it, "it");
                transferToBankInputAmountActivity.t(dataBean);
                break;
        }
    }
}
