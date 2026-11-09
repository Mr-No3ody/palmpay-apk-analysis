package Gd;

import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmRecipientInfoDialog f3363b;

    public /* synthetic */ o(ConfirmRecipientInfoDialog confirmRecipientInfoDialog, int i7) {
        this.f3362a = i7;
        this.f3363b = confirmRecipientInfoDialog;
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public final void onComplete(Object obj) {
        ConfirmRecipientInfoDialog confirmRecipientInfoDialog = this.f3363b;
        switch (this.f3362a) {
            case 0:
                int i7 = TransferToBankAccountView.f33899A;
                confirmRecipientInfoDialog.dismiss();
                break;
            default:
                int i10 = TransferToPalmPayAccountView.t;
                confirmRecipientInfoDialog.dismiss();
                break;
        }
    }
}
