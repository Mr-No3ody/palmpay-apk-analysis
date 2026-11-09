package com.transsnet.palmpay.managemoney.ui.activity;

import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Z;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanBreakPreDetailActivity f32085b;

    public /* synthetic */ D(PlanBreakPreDetailActivity planBreakPreDetailActivity, int i7) {
        this.f32084a = i7;
        this.f32085b = planBreakPreDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PlanBreakPreDetailActivity planBreakPreDetailActivity = this.f32085b;
        switch (this.f32084a) {
            case 0:
                int i7 = PlanBreakPreDetailActivity.f32151j;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Savings Advance Repayment", "Savings Advance Repayment includes the Advance Amount and Total Service Fee.\n\u2028Total Service Fee = Advance Amount \n× Number of Days Used × Daily Rate", planBreakPreDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager = planBreakPreDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 1:
                int i10 = PlanBreakPreDetailActivity.f32151j;
                return (PpButton) planBreakPreDetailActivity.findViewById(Jc.c.btnPlanGoBack);
            case 2:
                int i11 = PlanBreakPreDetailActivity.f32151j;
                return (PpButton) planBreakPreDetailActivity.findViewById(Jc.c.btnPlanContinue);
            case 3:
                int i12 = PlanBreakPreDetailActivity.f32151j;
                return (LinearLayout) planBreakPreDetailActivity.findViewById(Jc.c.layoutExtroInfo);
            case 4:
                int i13 = PlanBreakPreDetailActivity.f32151j;
                return (LinearLayout) planBreakPreDetailActivity.findViewById(Jc.c.layoutPlanInfo);
            default:
                int i14 = PlanBreakPreDetailActivity.f32151j;
                return (NestedScrollView) planBreakPreDetailActivity.findViewById(Jc.c.nsv);
        }
    }
}
