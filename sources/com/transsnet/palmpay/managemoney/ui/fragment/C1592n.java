package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1592n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxMainFragment f32644b;

    public /* synthetic */ C1592n(CashBoxMainFragment cashBoxMainFragment, int i7) {
        this.f32643a = i7;
        this.f32644b = cashBoxMainFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CashBoxMainFragment cashBoxMainFragment = this.f32644b;
        switch (this.f32643a) {
            case 0:
                CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                ((CashBoxViewModel) cashBoxMainFragment.f27327p).i(1, "cash_box_pop_up", "");
                return Unit.f38893a;
            case 1:
                CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                View view = cashBoxMainFragment.f27318b;
                if (view != null) {
                    return (TextView) view.findViewById(Jc.c.tvAutoSave);
                }
                return null;
            case 2:
                CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                View view2 = cashBoxMainFragment.f27318b;
                if (view2 != null) {
                    return (LinearLayout) view2.findViewById(Jc.c.layoutAutoSave);
                }
                return null;
            case 3:
                CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                View view3 = cashBoxMainFragment.f27318b;
                if (view3 != null) {
                    return (TextView) view3.findViewById(Jc.c.tvDailyIncome);
                }
                return null;
            case 4:
                CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                View view4 = cashBoxMainFragment.f27318b;
                if (view4 != null) {
                    return (RoundedTextView) view4.findViewById(Jc.c.rtvSave);
                }
                return null;
            case 5:
                CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                View view5 = cashBoxMainFragment.f27318b;
                if (view5 != null) {
                    return (RecyclerView) view5.findViewById(Jc.c.rvTransactionList);
                }
                return null;
            case 6:
                CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                View view6 = cashBoxMainFragment.f27318b;
                if (view6 != null) {
                    return (IconicsImageView) view6.findViewById(Jc.c.ivRateWarn);
                }
                return null;
            case 7:
                CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                View view7 = cashBoxMainFragment.f27318b;
                if (view7 != null) {
                    return (TextView) view7.findViewById(Jc.c.rtvInterestRate);
                }
                return null;
            case 8:
                CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                View view8 = cashBoxMainFragment.f27318b;
                if (view8 != null) {
                    return (RoundedTextView) view8.findViewById(Jc.c.rtvWithdraw);
                }
                return null;
            case 9:
                CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                View view9 = cashBoxMainFragment.f27318b;
                if (view9 != null) {
                    return (TextView) view9.findViewById(Jc.c.tvTotalReturnAmount);
                }
                return null;
            case 10:
                CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                View view10 = cashBoxMainFragment.f27318b;
                if (view10 != null) {
                    return (IconicsTextView) view10.findViewById(Jc.c.tvTrialCashYesterdayReturnAmount);
                }
                return null;
            case 11:
                CashBoxMainFragment.a aVar12 = CashBoxMainFragment.f32383V0;
                cashBoxMainFragment.A(true);
                return Unit.f38893a;
            case 12:
                CashBoxMainFragment.a aVar13 = CashBoxMainFragment.f32383V0;
                View view11 = cashBoxMainFragment.f27318b;
                if (view11 != null) {
                    return view11.findViewById(Jc.c.v_trial_line);
                }
                return null;
            case 13:
                CashBoxMainFragment.a aVar14 = CashBoxMainFragment.f32383V0;
                View view12 = cashBoxMainFragment.f27318b;
                if (view12 != null) {
                    return (TextView) view12.findViewById(Jc.c.tvYesterdayReturnAmount);
                }
                return null;
            case 14:
                CashBoxMainFragment.a aVar15 = CashBoxMainFragment.f32383V0;
                View view13 = cashBoxMainFragment.f27318b;
                if (view13 != null) {
                    return (TextView) view13.findViewById(Jc.c.tvFrozenText);
                }
                return null;
            case 15:
                CashBoxMainFragment.a aVar16 = CashBoxMainFragment.f32383V0;
                View view14 = cashBoxMainFragment.f27318b;
                if (view14 != null) {
                    return (LinearLayout) view14.findViewById(Jc.c.frozenLayout);
                }
                return null;
            case 16:
                CashBoxMainFragment.a aVar17 = CashBoxMainFragment.f32383V0;
                View view15 = cashBoxMainFragment.f27318b;
                if (view15 != null) {
                    return (IconicsImageView) view15.findViewById(Jc.c.ivWarn);
                }
                return null;
            case 17:
                CashBoxMainFragment.a aVar18 = CashBoxMainFragment.f32383V0;
                View view16 = cashBoxMainFragment.f27318b;
                if (view16 != null) {
                    return (AppCompatTextView) view16.findViewById(Jc.c.tvExpenditureAmount);
                }
                return null;
            case 18:
                CashBoxMainFragment.a aVar19 = CashBoxMainFragment.f32383V0;
                View view17 = cashBoxMainFragment.f27318b;
                if (view17 != null) {
                    return (TextView) view17.findViewById(Jc.c.tvBalanceAmount);
                }
                return null;
            case 19:
                CashBoxMainFragment.a aVar20 = CashBoxMainFragment.f32383V0;
                View view18 = cashBoxMainFragment.f27318b;
                if (view18 != null) {
                    return (RoundedTextView) view18.findViewById(Jc.c.rtvAccountStatus);
                }
                return null;
            case 20:
                CashBoxMainFragment.a aVar21 = CashBoxMainFragment.f32383V0;
                View view19 = cashBoxMainFragment.f27318b;
                if (view19 != null) {
                    return (IconicsImageView) view19.findViewById(Jc.c.ivToggleShowBalance);
                }
                return null;
            case 21:
                CashBoxMainFragment.a aVar22 = CashBoxMainFragment.f32383V0;
                View view20 = cashBoxMainFragment.f27318b;
                if (view20 != null) {
                    return (LinearLayout) view20.findViewById(Jc.c.ll_basic_container);
                }
                return null;
            case 22:
                CashBoxMainFragment.a aVar23 = CashBoxMainFragment.f32383V0;
                View view21 = cashBoxMainFragment.f27318b;
                if (view21 != null) {
                    return (ConstraintLayout) view21.findViewById(Jc.c.layoutSecurityGuaranteed);
                }
                return null;
            case 23:
                CashBoxMainFragment.a aVar24 = CashBoxMainFragment.f32383V0;
                View view22 = cashBoxMainFragment.f27318b;
                if (view22 != null) {
                    return (MarqueeViewV2) view22.findViewById(Jc.c.adView);
                }
                return null;
            case 24:
                CashBoxMainFragment.a aVar25 = CashBoxMainFragment.f32383V0;
                View view23 = cashBoxMainFragment.f27318b;
                if (view23 != null) {
                    return (PpTitleBar) view23.findViewById(Jc.c.mtb);
                }
                return null;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                CashBoxMainFragment.a aVar26 = CashBoxMainFragment.f32383V0;
                View view24 = cashBoxMainFragment.f27318b;
                if (view24 != null) {
                    return (IconicsTextView) view24.findViewById(Jc.c.tvMore);
                }
                return null;
            case 26:
                CashBoxMainFragment.a aVar27 = CashBoxMainFragment.f32383V0;
                View view25 = cashBoxMainFragment.f27318b;
                if (view25 != null) {
                    return (TextView) view25.findViewById(Jc.c.tvAutoSaveSec);
                }
                return null;
            case 27:
                CashBoxMainFragment.a aVar28 = CashBoxMainFragment.f32383V0;
                View view26 = cashBoxMainFragment.f27318b;
                if (view26 != null) {
                    return (AppCompatTextView) view26.findViewById(Jc.c.tvIncomeAmount);
                }
                return null;
            case 28:
                CashBoxMainFragment.a aVar29 = CashBoxMainFragment.f32383V0;
                View view27 = cashBoxMainFragment.f27318b;
                if (view27 != null) {
                    return (IconicsTextView) view27.findViewById(Jc.c.tvRecentTransaction);
                }
                return null;
            default:
                CashBoxMainFragment.a aVar30 = CashBoxMainFragment.f32383V0;
                View view28 = cashBoxMainFragment.f27318b;
                if (view28 != null) {
                    return (TextView) view28.findViewById(Jc.c.rtvGo);
                }
                return null;
        }
    }
}
