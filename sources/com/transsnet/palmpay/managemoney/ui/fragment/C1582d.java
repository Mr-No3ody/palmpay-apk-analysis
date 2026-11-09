package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1582d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxDepositFragment f32600b;

    public /* synthetic */ C1582d(CashBoxDepositFragment cashBoxDepositFragment, int i7) {
        this.f32599a = i7;
        this.f32600b = cashBoxDepositFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CashBoxDepositFragment cashBoxDepositFragment = this.f32600b;
        switch (this.f32599a) {
            case 0:
                CashBoxDepositFragment.a aVar = CashBoxDepositFragment.f32357p0;
                View view = cashBoxDepositFragment.f27318b;
                if (view != null) {
                    return (Group) view.findViewById(Jc.c.groupProtocol);
                }
                return null;
            case 1:
                CashBoxDepositFragment.a aVar2 = CashBoxDepositFragment.f32357p0;
                View view2 = cashBoxDepositFragment.f27318b;
                if (view2 != null) {
                    return (ConstraintLayout) view2.findViewById(Jc.c.layoutAutoTransfer);
                }
                return null;
            case 2:
                CashBoxDepositFragment.a aVar3 = CashBoxDepositFragment.f32357p0;
                View view3 = cashBoxDepositFragment.f27318b;
                if (view3 != null) {
                    return (TextView) view3.findViewById(Jc.c.tvInterestSec);
                }
                return null;
            case 3:
                CashBoxDepositFragment.a aVar4 = CashBoxDepositFragment.f32357p0;
                View view4 = cashBoxDepositFragment.f27318b;
                if (view4 != null) {
                    return (CashBoxEstimatedInterestView) view4.findViewById(Jc.c.viewEstimatedInterest);
                }
                return null;
            case 4:
                CashBoxDepositFragment.a aVar5 = CashBoxDepositFragment.f32357p0;
                CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV = cashBoxDepositFragment.v();
                if (cashBoxEstimatedInterestViewV != null) {
                    return (AmountEditText) cashBoxEstimatedInterestViewV.findViewById(Jc.c.etAmount);
                }
                return null;
            case 5:
                CashBoxDepositFragment.a aVar6 = CashBoxDepositFragment.f32357p0;
                SwitchCompat switchCompatU = cashBoxDepositFragment.u();
                if (switchCompatU != null) {
                    switchCompatU.setChecked(true);
                }
                return Unit.f38893a;
            case 6:
                CashBoxDepositFragment.a aVar7 = CashBoxDepositFragment.f32357p0;
                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxDepositFragment.f27333i;
                if (cashBoxViewModel != null) {
                    p140j8.f.s(cashBoxViewModel, new Qc.N(0, null), cashBoxViewModel.f32747j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                return Unit.f38893a;
            case 7:
                CashBoxDepositFragment.a aVar8 = CashBoxDepositFragment.f32357p0;
                SwitchCompat switchCompatU2 = cashBoxDepositFragment.u();
                if (switchCompatU2 != null) {
                    switchCompatU2.setChecked(false);
                }
                return Unit.f38893a;
            case 8:
                CashBoxDepositFragment.a aVar9 = CashBoxDepositFragment.f32357p0;
                CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) cashBoxDepositFragment.f27333i;
                if (cashBoxViewModel2 != null) {
                    p140j8.f.s(cashBoxViewModel2, new Qc.N(1, null), cashBoxViewModel2.f32747j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                return Unit.f38893a;
            case 9:
                CashBoxDepositFragment.a aVar10 = CashBoxDepositFragment.f32357p0;
                CashBoxEstimatedInterestView cashBoxEstimatedInterestViewV2 = cashBoxDepositFragment.v();
                if (cashBoxEstimatedInterestViewV2 != null) {
                    return (TextView) cashBoxEstimatedInterestViewV2.findViewById(Jc.c.tvAmountError);
                }
                return null;
            case 10:
                CashBoxDepositFragment.a aVar11 = CashBoxDepositFragment.f32357p0;
                View view5 = cashBoxDepositFragment.f27318b;
                if (view5 != null) {
                    return (PpTitleBar) view5.findViewById(Jc.c.mtb);
                }
                return null;
            case 11:
                CashBoxDepositFragment.a aVar12 = CashBoxDepositFragment.f32357p0;
                View view6 = cashBoxDepositFragment.f27318b;
                if (view6 != null) {
                    return (RoundedTextView) view6.findViewById(Jc.c.rtvNext);
                }
                return null;
            case 12:
                CashBoxDepositFragment.a aVar13 = CashBoxDepositFragment.f32357p0;
                View view7 = cashBoxDepositFragment.f27318b;
                if (view7 != null) {
                    return (TextView) view7.findViewById(Jc.c.tvProtocol);
                }
                return null;
            case 13:
                CashBoxDepositFragment.a aVar14 = CashBoxDepositFragment.f32357p0;
                View view8 = cashBoxDepositFragment.f27318b;
                if (view8 != null) {
                    return (CheckBox) view8.findViewById(Jc.c.ckProtocol);
                }
                return null;
            case 14:
                CashBoxDepositFragment.a aVar15 = CashBoxDepositFragment.f32357p0;
                View view9 = cashBoxDepositFragment.f27318b;
                if (view9 != null) {
                    return (TextView) view9.findViewById(Jc.c.tvTransferAgreement);
                }
                return null;
            case 15:
                CashBoxDepositFragment.a aVar16 = CashBoxDepositFragment.f32357p0;
                View view10 = cashBoxDepositFragment.f27318b;
                if (view10 != null) {
                    return (SwitchCompat) view10.findViewById(Jc.c.switchWidget);
                }
                return null;
            default:
                CashBoxDepositFragment.a aVar17 = CashBoxDepositFragment.f32357p0;
                View view11 = cashBoxDepositFragment.f27318b;
                if (view11 != null) {
                    return (SwitchCompat) view11.findViewById(Jc.c.switchWidgetInterest);
                }
                return null;
        }
    }
}
