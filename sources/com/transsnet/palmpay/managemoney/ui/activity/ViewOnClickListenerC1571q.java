package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import Pa.r0;
import android.view.View;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CreatePlanViewModel;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1571q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePlanActivity f32257b;

    public /* synthetic */ ViewOnClickListenerC1571q(CreatePlanActivity createPlanActivity, int i7) {
        this.f32256a = i7;
        this.f32257b = createPlanActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 10;
        int i10 = 0;
        CreatePlanActivity createPlanActivity = this.f32257b;
        switch (this.f32256a) {
            case 0:
                createPlanActivity.f32083w = createPlanActivity.f32083w == 0 ? 1 : 0;
                createPlanActivity.v();
                createPlanActivity.u(createPlanActivity.f32083w);
                n0.g().l(createPlanActivity.f32083w == 1 ? "CreatePlanPage_EnableAutoRenewal_Click" : "CreatePlanPage_DisableAutoRenewal_Click");
                return;
            case 1:
                GetBeforeOrderResp.BeforeOrderBean beforeOrderBean = createPlanActivity.f32074d;
                if (beforeOrderBean != null) {
                    if (!createPlanActivity.p(beforeOrderBean)) {
                        createPlanActivity.f32078i = 0L;
                        createPlanActivity.v();
                        return;
                    }
                    int i11 = createPlanActivity.f32083w;
                    GetBeforeOrderResp.StateInfo stateInfo = createPlanActivity.f32073c;
                    if (stateInfo != null) {
                        CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) createPlanActivity.l();
                        long productId = beforeOrderBean.getProductId();
                        Lc.a aVar = createPlanActivity.f32071H;
                        if (aVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        long j6 = aVar.f5637f.getLong();
                        String stateCode = stateInfo.getStateCode();
                        Lc.a aVar2 = createPlanActivity.f32071H;
                        if (aVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        String strValueOf = String.valueOf(aVar2.f5638g.getText());
                        long j10 = createPlanActivity.f32075e;
                        createPlanViewModel.getClass();
                        p140j8.f.s(createPlanViewModel, new Qc.Q(productId, j6, strValueOf, stateCode, createPlanViewModel, j10, i11, null), createPlanViewModel.f32763f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i12 = CreatePlanActivity.f32067M;
                createPlanActivity.q();
                return;
            case 3:
                Lc.a aVar3 = createPlanActivity.f32071H;
                if (aVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                AmountEditText amountEditText = aVar3.f5637f;
                if (amountEditText != null) {
                    long j11 = createPlanActivity.f32077g;
                    long j12 = createPlanActivity.f32076f;
                    if (j11 > j12) {
                        j11 = j12;
                    }
                    amountEditText.setText(String.valueOf(r0.h(j11)));
                    return;
                }
                return;
            case 4:
                GetBeforeOrderResp.BeforeOrderBean beforeOrderBean2 = createPlanActivity.f32074d;
                if (beforeOrderBean2 != null) {
                    if ((beforeOrderBean2.getAutoRenewal() == 0 ? beforeOrderBean2 : null) != null) {
                        createPlanActivity.u(0);
                        createPlanActivity.f32083w = 0;
                        ToastUtils.showShort("Sorry, this is a limited-purchase fixed savings plan and doesn't allow auto renewal.", new Object[0]);
                        return;
                    }
                }
                int i13 = createPlanActivity.f32083w;
                String str = i13 == 0 ? "Do you want to Enable Auto-Renewal?" : "Do you want to Disable Auto-Renewal?";
                String string = i13 == 0 ? createPlanActivity.getResources().getString(Jc.f.mm_auto_enable) : createPlanActivity.getResources().getString(Jc.f.mm_saving_auto_renewal_close, TimeUtils.millis2String(createPlanActivity.f32079j, new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)));
                Intrinsics.e(string);
                n0.g().v(createPlanActivity.f32083w == 0 ? "EnableAutoRenewal_View" : "DisableAutoRenewal_View");
                O6.c cVar = new O6.c(createPlanActivity);
                cVar.f6596b = O6.d.f(str);
                cVar.f6598d = string;
                cVar.c(p025ba.k.core_cancel, new ViewOnClickListenerC1478l(i7));
                cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1571q(createPlanActivity, i10));
                cVar.g();
                return;
            case 5:
                int i14 = CreatePlanActivity.f32067M;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, createPlanActivity.getResources().getString(Jc.f.mm_auto_renewal), createPlanActivity.getResources().getString(Jc.f.mm_auto_renewal_dialog_text), createPlanActivity.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                Z supportFragmentManager = createPlanActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showUpgradeLevelDialog");
                return;
            default:
                int i15 = CreatePlanActivity.f32067M;
                int iD = p059e1.a.D(0, "invest_interest_disable");
                n0.g().l(iD == 1 ? "CreatePlanPage_DisableInterest_Click" : "CreatePlanPage_EnableInterest_Click");
                String str2 = iD == 0 ? "You will start earning interest on your savings and earnings account (CashBox, Fixed Savings, Target Savings, Spend&Save and SafeBox), please confirm to continue." : "You will earn no interest on your savings and earnings account (CashBox, Fixed Savings, Target Savings and Spend & Save), please confirm to continue.";
                O6.c cVar2 = new O6.c(createPlanActivity);
                cVar2.f6596b = O6.d.f("Reminder");
                cVar2.f6598d = str2;
                cVar2.c(p025ba.k.core_cancel, new ViewOnClickListenerC1478l(i7));
                cVar2.d(p025ba.k.core_confirm, new Ad.V(createPlanActivity, iD, 5));
                cVar2.g();
                return;
        }
    }
}
