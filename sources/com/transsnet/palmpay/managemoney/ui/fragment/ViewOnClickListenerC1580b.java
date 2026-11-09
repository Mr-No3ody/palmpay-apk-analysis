package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1580b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxAutoSaveFragment f32591b;

    public /* synthetic */ ViewOnClickListenerC1580b(CashBoxAutoSaveFragment cashBoxAutoSaveFragment, int i7) {
        this.f32590a = i7;
        this.f32591b = cashBoxAutoSaveFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CashBoxAutoSaveFragment cashBoxAutoSaveFragment = this.f32591b;
        switch (this.f32590a) {
            case 0:
                CashBoxAutoSaveFragment.a aVar = CashBoxAutoSaveFragment.f32343Y;
                Pa.n0.g().l("Auto_Save_TurnOff_Click");
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragmentNewInstance = WhyTurnOffSaveDialogFragment.f32329Z.newInstance("product");
                C1579a dialogClosedClick = new C1579a(cashBoxAutoSaveFragment, 6);
                whyTurnOffSaveDialogFragmentNewInstance.getClass();
                Intrinsics.checkNotNullParameter(dialogClosedClick, "dialogClosedClick");
                whyTurnOffSaveDialogFragmentNewInstance.f32334Y = dialogClosedClick;
                androidx.fragment.app.Z childFragmentManager = cashBoxAutoSaveFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                whyTurnOffSaveDialogFragmentNewInstance.show(childFragmentManager, "showAutoSaveDetainmentTipsDialog");
                break;
            case 1:
                if (!cashBoxAutoSaveFragment.f32351X) {
                    N8.q0.u("/manage_money/cash_box_main_activity");
                } else {
                    androidx.fragment.app.E activity = cashBoxAutoSaveFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                break;
            default:
                CashBoxAutoSaveFragment.a aVar2 = CashBoxAutoSaveFragment.f32343Y;
                Pa.n0.g().l("Auto_Save_TurnOn_Click");
                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxAutoSaveFragment.f27333i;
                if (cashBoxViewModel != null) {
                    cashBoxViewModel.i(1, "product", "");
                }
                break;
        }
    }
}
