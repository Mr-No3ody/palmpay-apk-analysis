package com.transsnet.palmpay.ui.activity.coupon;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseActivity;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/coupon_list_page")
public class CouponListActivity extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        d.x(null, "Coupon");
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
