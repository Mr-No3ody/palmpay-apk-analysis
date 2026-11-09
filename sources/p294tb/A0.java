package p294tb;

import C0.G;
import O6.d;
import com.transsnet.palmpay.credit.bean.req.CLQueryApplyAuditResultReq;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCashLoadingDialog;
import com.transsnet.palmpay.credit.ui.dialog.ClamUpgradeInstallmentDialog;
import com.transsnet.palmpay.credit.ui.dialog.UpgradeInstallmentSuccDialog;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeInstallmentTransParentActivity f42395b;

    public /* synthetic */ A0(UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity, int i7) {
        this.f42394a = i7;
        this.f42395b = upgradeInstallmentTransParentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String applyId;
        switch (this.f42394a) {
            case 0:
                UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = this.f42395b;
                ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog = upgradeInstallmentTransParentActivity.f29189Z;
                if (clamUpgradeInstallmentDialog == null || !clamUpgradeInstallmentDialog.isShowing()) {
                    CLCashLoadingDialog cLCashLoadingDialog = upgradeInstallmentTransParentActivity.f29190k0;
                    if (cLCashLoadingDialog == null || !cLCashLoadingDialog.isShowing()) {
                        d dVar = upgradeInstallmentTransParentActivity.f29191p0;
                        if (dVar == null || !dVar.isShowing()) {
                            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog = upgradeInstallmentTransParentActivity.f29192q0;
                            if (upgradeInstallmentSuccDialog == null || !upgradeInstallmentSuccDialog.isShowing()) {
                                upgradeInstallmentTransParentActivity.finish();
                            }
                        }
                    }
                }
                break;
            default:
                UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity2 = this.f42395b;
                String str = upgradeInstallmentTransParentActivity2.TAG;
                CLOpenAccountData cLOpenAccountData = upgradeInstallmentTransParentActivity2.f29193r0;
                F6.d.h(str, 3, G.o("getData: UpgradeInstallmentTransParentActivity mApplyResult?.applyId:", cLOpenAccountData != null ? cLOpenAccountData.getApplyId() : null));
                IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
                CLOpenAccountData cLOpenAccountData2 = upgradeInstallmentTransParentActivity2.f29193r0;
                if (cLOpenAccountData2 == null || (applyId = cLOpenAccountData2.getApplyId()) == null) {
                    applyId = "";
                }
                iApiCreditServiceH.queryCashLoanStatus(new CLQueryApplyAuditResultReq(applyId)).k(f.f42629b).i(b.a()).subscribe(new B0(upgradeInstallmentTransParentActivity2, 0));
                break;
        }
    }
}
