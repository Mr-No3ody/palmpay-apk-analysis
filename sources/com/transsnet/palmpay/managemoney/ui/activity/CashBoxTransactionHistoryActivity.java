package com.transsnet.palmpay.managemoney.ui.activity;

import N8.q0;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_transaction_history_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxTransactionHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxTransactionHistoryActivity extends BaseMvvmActivity<CashBoxViewModel> {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_transaction_history_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragmentNewInstance = CashBoxTransactionHistoryFragment.f32428Y.newInstance();
        Intent intent = getIntent();
        if (intent != null) {
            cashBoxTransactionHistoryFragmentNewInstance.f32436X = intent.getIntExtra("orderType", -1);
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(Jc.c.layoutContainer, cashBoxTransactionHistoryFragmentNewInstance, null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight), true);
    }
}
