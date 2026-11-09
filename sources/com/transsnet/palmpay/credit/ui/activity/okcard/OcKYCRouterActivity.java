package com.transsnet.palmpay.credit.ui.activity.okcard;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import kotlin.Metadata;
import p143jb.o;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit KYC路由过渡页", path = "/credit_score/oc_kyc_router_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcKYCRouterActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcKYCRouterActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f29554Y = true;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_activity_kyc_router;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        if (this.f29554Y) {
            this.f29554Y = false;
        } else {
            F6.d.h(this.TAG, 3, d0.q("jumpLogic >>> mNextStep=", this.f29257j));
            if (this.f29257j) {
                this.f29257j = false;
                r();
            } else {
                F6.d.h(this.TAG, 3, "jumpLogic >>> bvn close");
                o.f38542z.getInstance().t(this.f29259p);
                finish();
            }
        }
        super.onResume();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f29260v = true;
        try {
            String strK = o.f38542z.getInstance().k(Integer.valueOf(getIntent().getIntExtra("oc_route_id", -1)));
            F6.d.h(this.TAG, 3, "processLogic >>> router=/account/upgrade, url=" + strK);
            s("/account/upgrade", strK);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(-1);
    }
}
