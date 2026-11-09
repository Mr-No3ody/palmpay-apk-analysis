package com.transsnet.palmpay.send_money.ui.activity.pay_me;

import L6.b;
import N8.q0;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.send_money.viewmodel.PayMeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/money_transfer_history_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/pay_me/MoneyTransferRecordListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoneyTransferRecordListActivity extends BaseMvvmActivity<PayMeViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33305e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_money_transfer_record_listt;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Object objNavigation = ARouter.getInstance().build("/sm/money_transfer_history_fragment").withInt("core_bill_in_out", this.f33304d).withInt("core_bill_status", this.f33303c).withString("core_bill_type", this.f33305e).navigation();
        Intrinsics.f(objNavigation, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment");
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.fl_container, (MoneyTransferHistoryFragment) objNavigation, null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }
}
