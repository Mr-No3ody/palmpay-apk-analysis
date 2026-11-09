package com.transsnet.palmpay.credit.ui.activity.cashloan;

import O6.c;
import O6.d;
import Ya.g;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCashLoadingDialog;
import com.transsnet.palmpay.credit.ui.dialog.ClamUpgradeInstallmentDialog;
import com.transsnet.palmpay.credit.ui.dialog.UpgradeInstallmentSuccDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p068ec.f;
import p285sc.x;
import p294tb.A0;
import p294tb.C0;
import p294tb.z0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit大额分期升级中转页", path = "/credit_score/ol_upgrade_installment_trans_parent_dialog_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/UpgradeInstallmentTransParentActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeInstallmentTransParentActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f29187u0 = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ClamUpgradeInstallmentDialog f29189Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CLCashLoadingDialog f29190k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public d f29191p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public UpgradeInstallmentSuccDialog f29192q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CLOpenAccountData f29193r0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f29188Y = 5000;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29194s0 = C2131j.b(new p068ec.d(this, 21));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Handler f29195t0 = new Handler(Looper.getMainLooper());

    public final void A(int i7) {
        QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto installmentLoanInfo;
        Handler handler = this.f29195t0;
        t tVar = this.f29194s0;
        if (i7 == 0) {
            handler.postDelayed((Runnable) tVar.getValue(), this.f29188Y);
            return;
        }
        if (i7 != 1) {
            handler.removeCallbacks((Runnable) tVar.getValue());
            z();
            return;
        }
        CLOpenAccountData cLOpenAccountData = this.f29193r0;
        if (cLOpenAccountData != null && (installmentLoanInfo = cLOpenAccountData.getInstallmentLoanInfo()) != null) {
            Activity topActivity = ActivityUtils.getTopActivity();
            Intrinsics.checkNotNullExpressionValue(topActivity, "getTopActivity(...)");
            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog = new UpgradeInstallmentSuccDialog(topActivity);
            this.f29192q0 = upgradeInstallmentSuccDialog;
            upgradeInstallmentSuccDialog.show();
            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog2 = this.f29192q0;
            if (upgradeInstallmentSuccDialog2 != null) {
                upgradeInstallmentSuccDialog2.setOnShowListener(new f(this, 2));
            }
            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog3 = this.f29192q0;
            if (upgradeInstallmentSuccDialog3 != null) {
                upgradeInstallmentSuccDialog3.setOnDismissListener(new z0(this, 2));
            }
            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog4 = this.f29192q0;
            if (upgradeInstallmentSuccDialog4 != null) {
                upgradeInstallmentSuccDialog4.fillData(installmentLoanInfo);
            }
        }
        CLCashLoadingDialog cLCashLoadingDialog = this.f29190k0;
        if (cLCashLoadingDialog != null) {
            cLCashLoadingDialog.dismiss();
        }
        handler.removeCallbacks((Runnable) tVar.getValue());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_activity_upgrade_installment_transparent;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog = new ClamUpgradeInstallmentDialog(this, new C0(this));
        this.f29189Z = clamUpgradeInstallmentDialog;
        clamUpgradeInstallmentDialog.show();
        ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog2 = this.f29189Z;
        if (clamUpgradeInstallmentDialog2 != null) {
            clamUpgradeInstallmentDialog2.setOnDismissListener(new z0(this, 0));
        }
    }

    public final void y() {
        this.f29195t0.postDelayed(new A0(this, 0), 100L);
    }

    public final void z() {
        c cVar = new c(this);
        cVar.f6596b = d.f("Application failed");
        cVar.f6607m = Ya.d.cs_cl_failed;
        cVar.f6598d = "Sorry, the application for installment experience amount has failed.Please maintain the flexible cash loan and repay it on time， We will evaluate in real-time";
        cVar.d(g.cs_confirm, new x(this, 14));
        d dVarG = cVar.g();
        this.f29191p0 = dVarG;
        dVarG.setOnDismissListener(new z0(this, 1));
        CLCashLoadingDialog cLCashLoadingDialog = this.f29190k0;
        if (cLCashLoadingDialog != null) {
            cLCashLoadingDialog.dismiss();
        }
    }
}
