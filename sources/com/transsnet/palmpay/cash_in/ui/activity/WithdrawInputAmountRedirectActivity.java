package com.transsnet.palmpay.cash_in.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/withdraw_input_amount")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/WithdrawInputAmountRedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WithdrawInputAmountRedirectActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26944b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ARouter.getInstance().inject(this);
        ARouter.getInstance().build("/sm/withdraw_input_amount").with(getIntent().getExtras()).withString("sn_no", this.f26943a).withString("core_order_source_type", this.f26944b).withFlags(33554432).navigation(this);
        finish();
    }
}
