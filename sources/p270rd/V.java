package p270rd;

import Kd.K0;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferResultViewModel;
import java.util.ArrayList;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements NotificationEmailDialog.OnNotificationDialogListner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41709a;

    public V(TransferResultActivity transferResultActivity) {
        this.f41709a = transferResultActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog.OnNotificationDialogListner
    public final void onNotificate(boolean z3) {
        ArrayList arrayList = TransferResultActivity.f33237Z;
        TransferResultViewModel transferResultViewModel = (TransferResultViewModel) this.f41709a.l();
        transferResultViewModel.getClass();
        f.s(transferResultViewModel, new K0(z3, null), new l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
