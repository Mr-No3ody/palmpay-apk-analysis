package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import N8.q0;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeFailFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradePendingFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.credit.viewmodel.OcEmptyViewModel;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import org.greenrobot.eventbus.c;
import p068ec.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit大额分期授信结果页", path = "/credit_score/ol_upgrade_installment_result_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLInstallmentUpGradeResultActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcEmptyViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentUpGradeResultActivity extends CreditBaseMvvmActivity<OcEmptyViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28931j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CLOpenAccountData f28932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f28933g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28934i = C2131j.b(new d(this, 19));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_install_upgrade_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n() {
        Integer applyStatus;
        CLOpenAccountData cLOpenAccountData = this.f28932f;
        int iIntValue = (cLOpenAccountData == null || (applyStatus = cLOpenAccountData.getApplyStatus()) == null) ? 0 : applyStatus.intValue();
        Handler handler = this.f28933g;
        t tVar = this.f28934i;
        if (iIntValue == 0) {
            c.b().f(new MessageEvent(MessageEvent.EVENT_CL_OPEN_PENDING));
            handler.postDelayed((Runnable) tVar.getValue(), 5000L);
            return;
        }
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                return;
            }
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(e.framelayout, CLInstallmentUpGradeFailFragment.f30589p.newInstance(), null);
            c1161aE.h(true);
            return;
        }
        handler.removeCallbacks((Runnable) tVar.getValue());
        Z supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager2);
        int i7 = e.framelayout;
        CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragmentNewInstance = CLInstallmentUpGradeSuccFragment.f30601q0.newInstance();
        CLOpenAccountData cLOpenAccountData2 = this.f28932f;
        cLInstallmentUpGradeSuccFragmentNewInstance.f30613k0 = cLOpenAccountData2 != null ? cLOpenAccountData2.getInstallmentLoanInfo() : null;
        c1161a.e(i7, cLInstallmentUpGradeSuccFragmentNewInstance, null);
        c1161a.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f28933g.postDelayed((Runnable) this.f28934i.getValue(), 5000L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("cl_open_result");
        F6.d.h("CLOpenResultActivity", 3, G.o("dataStr = ", stringExtra));
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f28932f = (CLOpenAccountData) d0.l(CLOpenAccountData.class, stringExtra);
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.framelayout, CLInstallmentUpGradePendingFragment.f30592L.newInstance(), null);
        c1161aE.h(true);
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
    }
}
