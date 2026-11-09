package com.transsnet.palmpay.managemoney.ui.activity;

import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Z;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlanDetailActivity f32103b;

    public /* synthetic */ G(PlanDetailActivity planDetailActivity, int i7) {
        this.f32102a = i7;
        this.f32103b = planDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Resources resources;
        int i7;
        PlanDetailActivity planDetailActivity = this.f32103b;
        switch (this.f32102a) {
            case 0:
                int i10 = PlanDetailActivity.f32158s0;
                return (AppCompatTextView) planDetailActivity.findViewById(Jc.c.btnPlanBreak);
            case 1:
                int i11 = PlanDetailActivity.f32158s0;
                return (PpButton) planDetailActivity.findViewById(Jc.c.btnRepay);
            case 2:
                int i12 = PlanDetailActivity.f32158s0;
                return (TextView) planDetailActivity.findViewById(Jc.c.tvPlanStatusDesc);
            case 3:
                int i13 = PlanDetailActivity.f32158s0;
                return (LinearLayout) planDetailActivity.findViewById(Jc.c.layoutPlanExtroInfo);
            case 4:
                int i14 = PlanDetailActivity.f32158s0;
                return (LinearLayout) planDetailActivity.findViewById(Jc.c.layoutAutoRenewalExtroInfo);
            case 5:
                int i15 = PlanDetailActivity.f32158s0;
                return planDetailActivity.findViewById(Jc.c.vAutoRenewalLine);
            case 6:
                int i16 = PlanDetailActivity.f32158s0;
                return (LinearLayout) planDetailActivity.findViewById(Jc.c.layoutSecInfo);
            case 7:
                int i17 = PlanDetailActivity.f32158s0;
                return (LinearLayout) planDetailActivity.findViewById(Jc.c.layoutPlanInfo);
            case 8:
                int i18 = PlanDetailActivity.f32158s0;
                return (TextView) planDetailActivity.findViewById(Jc.c.tvPlanStatus);
            case 9:
                int i19 = PlanDetailActivity.f32158s0;
                return (TextView) planDetailActivity.findViewById(Jc.c.tvPlanTitle);
            case 10:
                int i20 = PlanDetailActivity.f32158s0;
                return (NestedScrollView) planDetailActivity.findViewById(Jc.c.nsv);
            case 11:
                int i21 = PlanDetailActivity.f32158s0;
                return (PpTitleBar) planDetailActivity.findViewById(Jc.c.titleBar);
            case 12:
                int i22 = PlanDetailActivity.f32158s0;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, planDetailActivity.getResources().getString(Jc.f.mm_interest_earned), planDetailActivity.getResources().getString(Jc.f.mm_interest_earned_remark), planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 13:
                int i23 = PlanDetailActivity.f32158s0;
                CommonTipsDialogFragment.a aVar = CommonTipsDialogFragment.f31249X;
                String string = planDetailActivity.getResources().getString(Jc.f.mm_maturity_date);
                if (planDetailActivity.f32176k0) {
                    resources = planDetailActivity.getResources();
                    i7 = Jc.f.mm_maturity_date_auto_tips;
                } else {
                    resources = planDetailActivity.getResources();
                    i7 = Jc.f.mm_maturity_date_tips;
                }
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(aVar, string, resources.getString(i7), planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager2 = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 14:
                int i24 = PlanDetailActivity.f32158s0;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "", planDetailActivity.getResources().getString(Jc.f.mm_matures_into_your_tips), planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager3 = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default3.show(supportFragmentManager3, "showMaturesIntoYourTipsDialog");
                return Unit.f38893a;
            case 15:
                int i25 = PlanDetailActivity.f32158s0;
                return (ConstraintLayout) planDetailActivity.findViewById(Jc.c.layoutStrick);
            case 16:
                int i26 = PlanDetailActivity.f32158s0;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default4 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, planDetailActivity.getResources().getString(Jc.f.mm_advance_repayment), planDetailActivity.getResources().getString(Jc.f.mm_advance_repayment_desc), planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager4 = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default4.show(supportFragmentManager4, "showMaturesIntoYourTipsDialog");
                return Unit.f38893a;
            case 17:
                int i27 = PlanDetailActivity.f32158s0;
                return (IconicsTextView) planDetailActivity.findViewById(Jc.c.itvTitle);
            case 18:
                int i28 = PlanDetailActivity.f32158s0;
                return (ConstraintLayout) planDetailActivity.findViewById(Jc.c.llAdvanceModule);
            case 19:
                int i29 = PlanDetailActivity.f32158s0;
                return (IconicsTextView) planDetailActivity.findViewById(Jc.c.itv_status_text);
            case 20:
                int i30 = PlanDetailActivity.f32158s0;
                return (IconicsTextView) planDetailActivity.findViewById(Jc.c.itv_total_amount);
            case 21:
                int i31 = PlanDetailActivity.f32158s0;
                return (IconicsTextView) planDetailActivity.findViewById(Jc.c.itv_due_date);
            case 22:
                int i32 = PlanDetailActivity.f32158s0;
                return (TextView) planDetailActivity.findViewById(Jc.c.tvRepayableAmount);
            default:
                int i33 = PlanDetailActivity.f32158s0;
                return (TextView) planDetailActivity.findViewById(Jc.c.tvDueDate);
        }
    }
}
