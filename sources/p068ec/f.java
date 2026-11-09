package p068ec;

import C0.G;
import android.content.DialogInterface;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.req.UpLoadLoanDialogPopUps;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.util.SPUtils;
import p071ef.b;
import p221ob.c;
import p294tb.B0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmActivity f36256b;

    public /* synthetic */ f(BaseMvvmActivity baseMvvmActivity, int i7) {
        this.f36255a = i7;
        this.f36256b = baseMvvmActivity;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BaseMvvmActivity baseMvvmActivity = this.f36256b;
        switch (this.f36255a) {
            case 0:
                ((BuyBundleHomePageActivity) baseMvvmActivity).f31757q0 = true;
                SPUtils sPUtils = SPUtils.get();
                String memberId = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                sPUtils.put("qt_data_bundle_exit_coupon_retention_last_show_time_".concat(memberId != null ? memberId : ""), System.currentTimeMillis());
                break;
            case 1:
                ((TopupAirtimeActivity) baseMvvmActivity).f26515t0 = true;
                SPUtils sPUtils2 = SPUtils.get();
                String memberId2 = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                sPUtils2.put("qt_airtime_exit_coupon_retention_last_show_time_".concat(memberId2 != null ? memberId2 : ""), System.currentTimeMillis());
                break;
            default:
                int i7 = UpgradeInstallmentTransParentActivity.f29187u0;
                UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = (UpgradeInstallmentTransParentActivity) baseMvvmActivity;
                upgradeInstallmentTransParentActivity.getClass();
                G.h(c.f40268a).uploadLoanDialogPopUps(new UpLoadLoanDialogPopUps("installmentLoanOpen")).k(p298tf.f.f42629b).i(b.a()).subscribe(new B0(upgradeInstallmentTransParentActivity, 2));
                break;
        }
    }
}
