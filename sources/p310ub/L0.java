package p310ub;

import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcReferEarnWithdrawDialog;
import p235pb.p;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements OcReferEarnWithdrawDialog.WithdrawClickInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcReferEarnActivity f42771a;

    public L0(OcReferEarnActivity ocReferEarnActivity) {
        this.f42771a = ocReferEarnActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.OcReferEarnWithdrawDialog.WithdrawClickInterface
    public final void inviteMote() {
        OcReferEarnActivity ocReferEarnActivity = this.f42771a;
        int i7 = OcReferEarnActivity.f29672M;
        ((p) ocReferEarnActivity.f27350a).queryReferEarnHome();
    }
}
