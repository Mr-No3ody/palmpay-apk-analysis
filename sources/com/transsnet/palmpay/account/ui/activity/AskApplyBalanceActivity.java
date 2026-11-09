package com.transsnet.palmpay.account.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.p;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/ask_apply_for_balance")
public class AskApplyBalanceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25824a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25827d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        User user = BaseApplication.get().getUser();
        if (user.getSvaStatus() != 3 || user.isTier0User()) {
            d.F("/account/upgrade");
        } else if (!TextUtils.isEmpty(this.f25827d)) {
            d.F(this.f25827d);
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(p.transparent_60)));
    }
}
