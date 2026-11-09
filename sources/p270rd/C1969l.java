package p270rd;

import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.dialog.ConfirmLargeAndRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;

/* JADX INFO: renamed from: rd.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1969l implements ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f41757b;

    public /* synthetic */ C1969l(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog, int i7) {
        this.f41756a = i7;
        this.f41757b = confirmLargeAndRecipientInfoDialog;
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public final void onComplete(Object obj) {
        ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog = this.f41757b;
        switch (this.f41756a) {
            case 0:
                int i7 = PayShopInputAmountActivity.f33176p;
                confirmLargeAndRecipientInfoDialog.dismiss();
                break;
            case 1:
                int i10 = WithdrawInputAmountActivity.f33293p;
                confirmLargeAndRecipientInfoDialog.dismiss();
                break;
            case 2:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                confirmLargeAndRecipientInfoDialog.dismiss();
                break;
            case 3:
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                confirmLargeAndRecipientInfoDialog.dismiss();
                break;
            default:
                int i11 = TransferToPalmPayInputAmountActivity.f33602Y;
                confirmLargeAndRecipientInfoDialog.dismiss();
                break;
        }
    }
}
