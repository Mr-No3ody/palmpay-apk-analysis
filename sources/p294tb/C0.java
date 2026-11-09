package p294tb;

import C0.G;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCashLoadingDialog;
import com.transsnet.palmpay.credit.ui.dialog.ClamUpgradeInstallmentDialog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements ClamUpgradeInstallmentDialog.OnUpgradeInstallmentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpgradeInstallmentTransParentActivity f42402a;

    public C0(UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity) {
        this.f42402a = upgradeInstallmentTransParentActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.ClamUpgradeInstallmentDialog.OnUpgradeInstallmentListener
    public final void onClaim() {
        UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = this.f42402a;
        CLCashLoadingDialog cLCashLoadingDialog = new CLCashLoadingDialog(upgradeInstallmentTransParentActivity, "The installment amount is being calculated...", null, null, 12, null);
        upgradeInstallmentTransParentActivity.f29190k0 = cLCashLoadingDialog;
        cLCashLoadingDialog.show();
        CLCashLoadingDialog cLCashLoadingDialog2 = upgradeInstallmentTransParentActivity.f29190k0;
        if (cLCashLoadingDialog2 != null) {
            cLCashLoadingDialog2.setOnDismissListener(new z0(upgradeInstallmentTransParentActivity, 3));
        }
        int size = 0;
        try {
            PackageManager packageManager = upgradeInstallmentTransParentActivity.getPackageManager();
            List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
            List<PackageInfo> list = installedPackages;
            if (list != null && !list.isEmpty()) {
                size = installedPackages.size();
            }
        } catch (Exception unused) {
        }
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        OcApplyData ocApplyData = upgradeInstallmentTransParentActivity.f29248B;
        String applyId = ocApplyData != null ? ocApplyData.getApplyId() : null;
        OcApplyData ocApplyData2 = upgradeInstallmentTransParentActivity.f29248B;
        String deviceTag = ocApplyData2 != null ? ocApplyData2.getDeviceTag() : null;
        Integer numValueOf = Integer.valueOf(size);
        OcApplyData ocApplyData3 = upgradeInstallmentTransParentActivity.f29248B;
        boolean plIsActive = ocApplyData3 != null ? ocApplyData3.getPlIsActive() : true;
        OcApplyData ocApplyData4 = upgradeInstallmentTransParentActivity.f29248B;
        boolean plIsInstall = ocApplyData4 != null ? ocApplyData4.getPlIsInstall() : true;
        OcApplyData ocApplyData5 = upgradeInstallmentTransParentActivity.f29248B;
        iApiCreditServiceH.openCashLoan(new CLOpenAccountReq("RETURN_APPLY", applyId, deviceTag, numValueOf, plIsActive, plIsInstall, ocApplyData5 != null ? ocApplyData5.getRouterTag() : null, null, null, null, null, null, null, null, null, Intrinsics.c(upgradeInstallmentTransParentActivity.f29261w, "INSTALLMENT_LOAN") ? upgradeInstallmentTransParentActivity.f29261w : null, 32640, null)).k(f.f42629b).i(b.a()).subscribe(new B0(upgradeInstallmentTransParentActivity, 1));
    }
}
