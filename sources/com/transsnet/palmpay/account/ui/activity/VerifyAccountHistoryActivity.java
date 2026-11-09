package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import L6.b;
import N8.q0;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/verify_account_history")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/VerifyAccountHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyAccountHistoryActivity extends BaseMvvmActivity<BaseViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GetSecurityFlowRsp f26074c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_verify_account_history;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    public final void m(AccountHistoryListRsp accountHistoryListRsp) {
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(d.fragmentContainer, VerifyAccountHistoryFragment.f26150v.newInstance(accountHistoryListRsp, this.f26074c), null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
    }
}
