package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.managemoney.ui.fragment.FundTransactionHistoryFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/fund_transaction_history_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/FundTransactionHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FundTransactionHistoryActivity extends BaseMvvmActivity<CashBoxViewModel> {
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
        String stringExtra;
        FundTransactionHistoryFragment fundTransactionHistoryFragmentNewInstance = FundTransactionHistoryFragment.f32458Z.newInstance();
        Intent intent = getIntent();
        if (intent != null) {
            fundTransactionHistoryFragmentNewInstance.f32467Y = intent.getStringExtra("fundId");
            stringExtra = intent.getStringExtra("fundName");
        } else {
            stringExtra = null;
        }
        n0 n0VarG = n0.g();
        ViewEvent viewEvent = new ViewEvent("Mutualfunds_TransactionHistoryAll");
        if (stringExtra == null) {
            stringExtra = "";
        }
        n0VarG.u(viewEvent.add("fundName", stringExtra));
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        c1161a.e(Jc.c.layoutContainer, fundTransactionHistoryFragmentNewInstance, null);
        c1161a.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight), true);
    }
}
