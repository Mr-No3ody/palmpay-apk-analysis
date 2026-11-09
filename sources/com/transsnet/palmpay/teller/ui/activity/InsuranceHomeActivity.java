package com.transsnet.palmpay.teller.ui.activity;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "缴费/保险首页", path = "/quick_teller/insurance_home", remark = "ignore")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/InsuranceHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InsuranceHomeActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34219b;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f34218a) {
            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", "7");
            if (!TextUtils.isEmpty(this.f34219b)) {
                postcardWithString.withString("billerId", this.f34219b);
            }
            postcardWithString.navigation();
            this.f34218a = true;
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
