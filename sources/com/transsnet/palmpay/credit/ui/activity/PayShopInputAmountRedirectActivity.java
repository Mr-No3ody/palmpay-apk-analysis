package com.transsnet.palmpay.credit.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/pay_shop_input_amount")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopInputAmountRedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayShopInputAmountRedirectActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28726b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ARouter.getInstance().inject(this);
        ARouter.getInstance().build("/sm/pay_shop_input_amount").with(getIntent().getExtras()).withString("sn_no", this.f28725a).withString("core_order_source_type", this.f28726b).withFlags(33554432).navigation(this);
        finish();
    }
}
