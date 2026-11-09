package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxWithdrawFragment f32452b;

    public /* synthetic */ D(CashBoxWithdrawFragment cashBoxWithdrawFragment, int i7) {
        this.f32451a = i7;
        this.f32452b = cashBoxWithdrawFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CashBoxWithdrawFragment cashBoxWithdrawFragment = this.f32452b;
        switch (this.f32451a) {
            case 0:
                CashBoxWithdrawFragment.a aVar = CashBoxWithdrawFragment.f32442H;
                View view = cashBoxWithdrawFragment.f27318b;
                if (view != null) {
                    return (RoundedTextView) view.findViewById(Jc.c.rtvNext);
                }
                return null;
            case 1:
                CashBoxWithdrawFragment.a aVar2 = CashBoxWithdrawFragment.f32442H;
                View view2 = cashBoxWithdrawFragment.f27318b;
                if (view2 != null) {
                    return (CashBoxEstimatedInterestView) view2.findViewById(Jc.c.viewEstimatedInterest);
                }
                return null;
            case 2:
                CashBoxWithdrawFragment.a aVar3 = CashBoxWithdrawFragment.f32442H;
                CashBoxEstimatedInterestView cashBoxEstimatedInterestViewU = cashBoxWithdrawFragment.u();
                if (cashBoxEstimatedInterestViewU != null) {
                    return (AmountEditText) cashBoxEstimatedInterestViewU.findViewById(Jc.c.etAmount);
                }
                return null;
            case 3:
                CashBoxWithdrawFragment.a aVar4 = CashBoxWithdrawFragment.f32442H;
                CashBoxEstimatedInterestView cashBoxEstimatedInterestViewU2 = cashBoxWithdrawFragment.u();
                if (cashBoxEstimatedInterestViewU2 != null) {
                    return (TextView) cashBoxEstimatedInterestViewU2.findViewById(Jc.c.tvAmountError);
                }
                return null;
            case 4:
                CashBoxWithdrawFragment.a aVar5 = CashBoxWithdrawFragment.f32442H;
                View view3 = cashBoxWithdrawFragment.f27318b;
                if (view3 != null) {
                    return (PpTitleBar) view3.findViewById(Jc.c.mtb);
                }
                return null;
            default:
                CashBoxWithdrawFragment.a aVar6 = CashBoxWithdrawFragment.f32442H;
                Pa.n0.g().l("CashBox_WithdrawPop_Withdraw_Click");
                cashBoxWithdrawFragment.w();
                return Unit.f38893a;
        }
    }
}
