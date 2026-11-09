package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.C0525w;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.RiskControlResult;
import com.transsnet.palmpay.core.ui.fragment.RiskControlCheckOtcFragment;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/risk_control_verify")
public class RiskControlVerifyActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RiskControlResult f27707a;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_risk_control_verify;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (this.f27707a == null) {
            C0525w c0525wF = C0525w.f();
            String stringExtra = getIntent().getStringExtra("extra_rn_data");
            c0525wF.getClass();
            this.f27707a = (RiskControlResult) C0525w.d(stringExtra, RiskControlResult.class);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        RiskControlResult riskControlResult = this.f27707a;
        if (riskControlResult == null || !riskControlResult.isRequireOtcVerify()) {
            setResult(0);
            finish();
            return;
        }
        if (getSupportFragmentManager().D(L9.a.fragmentContainer) instanceof RiskControlCheckOtcFragment) {
            return;
        }
        androidx.fragment.app.Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        int i7 = L9.a.fragmentContainer;
        RiskControlResult riskControlResult2 = this.f27707a;
        RiskControlCheckOtcFragment riskControlCheckOtcFragment = new RiskControlCheckOtcFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("result", riskControlResult2);
        riskControlCheckOtcFragment.setArguments(bundle2);
        c1161aE.e(i7, riskControlCheckOtcFragment, null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
