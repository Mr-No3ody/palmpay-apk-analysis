package com.transsnet.palmpay.managemoney.ui.activity;

import android.view.View;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanDetailActivity f32108b;

    public /* synthetic */ I(PlanDetailActivity planDetailActivity, int i7) {
        this.f32107a = i7;
        this.f32108b = planDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlanDetailActivity planDetailActivity = this.f32108b;
        switch (this.f32107a) {
            case 0:
                int i7 = PlanDetailActivity.f32158s0;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Total Repayable Amount", "You need to pay the full Total Repayable Amount in one go.\nCalculated as: Advance Amount + Total Service Fee", planDetailActivity.getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showAdvanceTipsDialog");
                break;
            case 1:
                int i10 = PlanDetailActivity.f32158s0;
                com.palmpay.lib.apm.launchcounter.util.d.y("AutoRenewalRecord", "orderId", planDetailActivity.getIntent().getStringExtra("orderNo"));
                break;
            default:
                int i11 = PlanDetailActivity.f32158s0;
                com.palmpay.lib.apm.launchcounter.util.d.y("AutoRenewalRecord", "orderId", planDetailActivity.getIntent().getStringExtra("orderNo"));
                break;
        }
    }
}
