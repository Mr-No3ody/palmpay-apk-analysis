package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import Pa.i0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxDepositFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxWithdrawFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_deposit_withdraw_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxDepositWithdrawActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxDepositWithdrawActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32038c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32039d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_deposit_withdraw_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int intExtra = getIntent().getIntExtra("cash_box_type", 1);
        this.f32038c = intExtra;
        if (intExtra == 2) {
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(Jc.c.layoutContainer, CashBoxWithdrawFragment.f32442H.newInstance(), String.valueOf(this.f32038c));
            c1161aE.h(true);
            return;
        }
        String stringExtra = getIntent().getStringExtra("total_back_amount");
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean booleanExtra = getIntent().getBooleanExtra("from_activity", false);
        this.f32039d = booleanExtra;
        Z supportFragmentManager2 = getSupportFragmentManager();
        C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
        c1161aE2.e(Jc.c.layoutContainer, CashBoxDepositFragment.f32357p0.newInstance(booleanExtra, stringExtra), null);
        c1161aE2.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), !i0.T());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (this.f32038c == 1) {
            Fragment fragmentE = getSupportFragmentManager().E(String.valueOf(this.f32038c));
            if (fragmentE instanceof CashBoxDepositFragment) {
                ((CashBoxDepositFragment) fragmentE).onBackPressed();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("total_back_amount");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            boolean z3 = this.f32039d;
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(Jc.c.layoutContainer, CashBoxDepositFragment.f32357p0.newInstance(z3, stringExtra), null);
            c1161aE.h(true);
        }
        processLogic(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((CashBoxViewModel) l()).h();
    }
}
