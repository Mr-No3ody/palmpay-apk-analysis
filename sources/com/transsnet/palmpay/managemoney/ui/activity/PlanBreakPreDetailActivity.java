package com.transsnet.palmpay.managemoney.ui.activity;

import Qc.g0;
import Qc.j0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/plan_break_pre_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/PlanBreakPreDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/PlanDetailViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlanBreakPreDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanBreakPreDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PlanBreakPreDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,395:1\n171#2,12:396\n215#2:408\n171#2,12:409\n215#2:421\n171#2,12:422\n215#2:434\n*S KotlinDebug\n*F\n+ 1 PlanBreakPreDetailActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/PlanBreakPreDetailActivity\n*L\n76#1:396,12\n76#1:408\n94#1:409,12\n94#1:421\n117#1:422,12\n117#1:434\n*E\n"})
public final class PlanBreakPreDetailActivity extends BaseMvvmActivity<PlanDetailViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f32151j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32152c = C2131j.b(new D(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32153d = C2131j.b(new D(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32154e = C2131j.b(new D(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32155f = C2131j.b(new D(this, 4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32156g = C2131j.b(new D(this, 5));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProductBean f32157i;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_plan_break_pre_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((PlanDetailViewModel) l()).f32783g;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new F(this, this, 0), 12));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((PlanDetailViewModel) l()).f32784i;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new F(this, this, 1), 12));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((PlanDetailViewModel) l()).f32785j;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new F(this, this, 2), 12));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(Jc.a.mm_color_f6f6fa), true);
    }

    public final LinearLayout m() {
        Object value = this.f32155f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String orderId;
        Intent intent = getIntent();
        if (intent == null || (orderId = intent.getStringExtra("orderNo")) == null) {
            return;
        }
        PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) l();
        planDetailViewModel.getClass();
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        p140j8.f.s(planDetailViewModel, new j0(orderId, null), planDetailViewModel.f32783g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Object value = this.f32152c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpButton ppButton = (PpButton) value;
        if (ppButton != null) {
            final int i7 = 0;
            ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PlanBreakPreDetailActivity f32090b;

                {
                    this.f32090b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlanBreakPreDetailActivity planBreakPreDetailActivity = this.f32090b;
                    switch (i7) {
                        case 0:
                            int i10 = PlanBreakPreDetailActivity.f32151j;
                            PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) planBreakPreDetailActivity.l();
                            if (planDetailViewModel != null) {
                                p140j8.f.s(planDetailViewModel, new g0(1, null), planDetailViewModel.f32784i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        default:
                            int i11 = PlanBreakPreDetailActivity.f32151j;
                            planBreakPreDetailActivity.finish();
                            break;
                    }
                }
            });
        }
        Object value2 = this.f32153d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        PpButton ppButton2 = (PpButton) value2;
        if (ppButton2 != null) {
            final int i10 = 1;
            ppButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PlanBreakPreDetailActivity f32090b;

                {
                    this.f32090b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlanBreakPreDetailActivity planBreakPreDetailActivity = this.f32090b;
                    switch (i10) {
                        case 0:
                            int i11 = PlanBreakPreDetailActivity.f32151j;
                            PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) planBreakPreDetailActivity.l();
                            if (planDetailViewModel != null) {
                                p140j8.f.s(planDetailViewModel, new g0(1, null), planDetailViewModel.f32784i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        default:
                            int i12 = PlanBreakPreDetailActivity.f32151j;
                            planBreakPreDetailActivity.finish();
                            break;
                    }
                }
            });
        }
    }
}
