package com.transsnet.palmpay.ui.activity.qr;

import Ac.f;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/qrcode/collect")
public class QRCodeReceiveActivity extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_receive_money_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (BaseApplication.hasLogin()) {
            return;
        }
        d.F("/account/login");
        ActivityUtils.finishAllActivities();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
    }
}
