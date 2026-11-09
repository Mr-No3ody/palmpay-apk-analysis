package p310ub;

import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcInviteDiscoverDialog;
import p235pb.p;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 implements OcInviteDiscoverDialog.OcInviteDiscoverListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcReferEarnActivity f42768a;

    public K0(OcReferEarnActivity ocReferEarnActivity) {
        this.f42768a = ocReferEarnActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.OcInviteDiscoverDialog.OcInviteDiscoverListener
    public final void confirm(boolean z3) {
        if (z3) {
            OcReferEarnActivity ocReferEarnActivity = this.f42768a;
            int i7 = OcReferEarnActivity.f29672M;
            ((p) ocReferEarnActivity.f27350a).queryReferEarnHome();
        }
    }
}
