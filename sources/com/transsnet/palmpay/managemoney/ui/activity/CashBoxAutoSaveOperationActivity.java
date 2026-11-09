package com.transsnet.palmpay.managemoney.ui.activity;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_auto_save_operation_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxAutoSaveOperationActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxAutoSaveOperationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxAutoSaveOperationActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxAutoSaveOperationActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,50:1\n171#2,12:51\n215#2:63\n*S KotlinDebug\n*F\n+ 1 CashBoxAutoSaveOperationActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxAutoSaveOperationActivity\n*L\n41#1:51,12\n41#1:63\n*E\n"})
public final class CashBoxAutoSaveOperationActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32018c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
        com.transsnet.palmpay.core.base.l lVar = cashBoxViewModel != null ? cashBoxViewModel.f32748k0 : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new T8.o(10, this, this), (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
        if (cashBoxViewModel != null) {
            String str = this.f32018c;
            if (str == null) {
                str = "coin_rain";
            }
            cashBoxViewModel.i(1, str, "");
        }
    }
}
