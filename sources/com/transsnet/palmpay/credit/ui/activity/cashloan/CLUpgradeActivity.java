package com.transsnet.palmpay.credit.ui.activity.cashloan;

import android.os.Bundle;
import android.view.Window;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.interfaces.CLActiveInterface;
import kotlin.Metadata;
import p071ef.b;
import p221ob.c;
import p294tb.y0;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit升级页", path = "/credit_score/cs_cl_upgrade_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLUpgradeActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/cashloan/a;", "Lcom/transsnet/palmpay/credit/interfaces/CLActiveInterface;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLUpgradeActivity extends a implements CLActiveInterface {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CLMainData f29186M;

    public static final void v(CLUpgradeActivity cLUpgradeActivity) {
        cLUpgradeActivity.showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().getCashLoanNew().k(f.f42629b).i(b.a()).subscribe(new y0(cLUpgradeActivity, 1));
    }

    @Override // com.transsnet.palmpay.credit.interfaces.CLActiveInterface
    public final void activeCashLoan(String str) {
        a.o(this, str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_cl_upgrade_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        c.f40268a.getInstance().getClass();
        c.a().queryOpenCashProduct().k(f.f42629b).i(b.a()).subscribe(new y0(this, 0));
    }
}
