package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.TargetSavingsTransactionHistoryViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1599v implements MonthPickDialog.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmFragment f32671b;

    public /* synthetic */ C1599v(BaseMvvmFragment baseMvvmFragment, int i7) {
        this.f32670a = i7;
        this.f32671b = baseMvvmFragment;
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        QueryCashBoxStatReq queryCashBoxStatReq3;
        QueryFundStatReq queryFundStatReq;
        QueryFundStatReq queryFundStatReq2;
        QueryFundStatReq queryFundStatReq3;
        QueryCashBoxStatReq queryCashBoxStatReq4;
        QueryCashBoxStatReq queryCashBoxStatReq5;
        QueryCashBoxStatReq queryCashBoxStatReq6;
        switch (this.f32670a) {
            case 0:
                CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = (CashBoxTransactionHistoryFragment) this.f32671b;
                MonthPickDialog monthPickDialog = cashBoxTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog);
                int nowPickYear = monthPickDialog.getNowPickYear();
                MonthPickDialog monthPickDialog2 = cashBoxTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog2);
                int nowPickMonth = monthPickDialog2.getNowPickMonth();
                cashBoxTransactionHistoryFragment.x(nowPickYear, nowPickMonth);
                if (cashBoxTransactionHistoryFragment.f32441w != nowPickMonth || cashBoxTransactionHistoryFragment.f32429A != nowPickYear) {
                    cashBoxTransactionHistoryFragment.f32429A = nowPickYear;
                    cashBoxTransactionHistoryFragment.f32441w = nowPickMonth;
                    long jT = CashBoxTransactionHistoryFragment.t(nowPickYear, nowPickMonth);
                    long jT2 = CashBoxTransactionHistoryFragment.t(nowPickYear, nowPickMonth + 1);
                    CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
                    if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq3 = cashBoxTransactionHistoryViewModel.f32725e) != null) {
                        queryCashBoxStatReq3.setStartTime(jT);
                    }
                    CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
                    if (cashBoxTransactionHistoryViewModel2 != null && (queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel2.f32725e) != null) {
                        queryCashBoxStatReq2.setEndTime(jT2);
                    }
                    CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel3 = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
                    if (cashBoxTransactionHistoryViewModel3 != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel3.f32726f) != null) {
                        queryCashBoxStatReq.setStartTime(jT2);
                    }
                    cashBoxTransactionHistoryFragment.v(true);
                }
                break;
            case 1:
                FundTransactionHistoryFragment fundTransactionHistoryFragment = (FundTransactionHistoryFragment) this.f32671b;
                MonthPickDialog monthPickDialog3 = fundTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog3);
                int nowPickYear2 = monthPickDialog3.getNowPickYear();
                MonthPickDialog monthPickDialog4 = fundTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog4);
                int nowPickMonth2 = monthPickDialog4.getNowPickMonth();
                fundTransactionHistoryFragment.y(nowPickYear2, nowPickMonth2);
                if (fundTransactionHistoryFragment.f32472w != nowPickMonth2 || fundTransactionHistoryFragment.f32459A != nowPickYear2) {
                    fundTransactionHistoryFragment.f32459A = nowPickYear2;
                    fundTransactionHistoryFragment.f32472w = nowPickMonth2;
                    long jT3 = FundTransactionHistoryFragment.t(nowPickYear2, nowPickMonth2);
                    long jT4 = FundTransactionHistoryFragment.t(nowPickYear2, nowPickMonth2 + 1);
                    FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
                    if (fundTransactionHistoryViewModel != null && (queryFundStatReq3 = fundTransactionHistoryViewModel.f32767e) != null) {
                        queryFundStatReq3.setStartTime(jT3);
                    }
                    FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
                    if (fundTransactionHistoryViewModel2 != null && (queryFundStatReq2 = fundTransactionHistoryViewModel2.f32767e) != null) {
                        queryFundStatReq2.setEndTime(jT4);
                    }
                    FundTransactionHistoryViewModel fundTransactionHistoryViewModel3 = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
                    if (fundTransactionHistoryViewModel3 != null && (queryFundStatReq = fundTransactionHistoryViewModel3.f32768f) != null) {
                        queryFundStatReq.setStartTime(jT4);
                    }
                    fundTransactionHistoryFragment.w(true);
                }
                break;
            default:
                TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = (TargetSavingsTransactionHistoryFragment) this.f32671b;
                MonthPickDialog monthPickDialog5 = targetSavingsTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog5);
                int nowPickYear3 = monthPickDialog5.getNowPickYear();
                MonthPickDialog monthPickDialog6 = targetSavingsTransactionHistoryFragment.t;
                Intrinsics.e(monthPickDialog6);
                int nowPickMonth3 = monthPickDialog6.getNowPickMonth();
                targetSavingsTransactionHistoryFragment.x(nowPickYear3, nowPickMonth3);
                if (targetSavingsTransactionHistoryFragment.f32561w != nowPickMonth3 || targetSavingsTransactionHistoryFragment.f32550A != nowPickYear3) {
                    targetSavingsTransactionHistoryFragment.f32550A = nowPickYear3;
                    targetSavingsTransactionHistoryFragment.f32561w = nowPickMonth3;
                    long jT5 = TargetSavingsTransactionHistoryFragment.t(nowPickYear3, nowPickMonth3);
                    long jT6 = TargetSavingsTransactionHistoryFragment.t(nowPickYear3, nowPickMonth3 + 1);
                    TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
                    if (targetSavingsTransactionHistoryViewModel != null && (queryCashBoxStatReq6 = targetSavingsTransactionHistoryViewModel.f32788e) != null) {
                        queryCashBoxStatReq6.setStartTime(jT5);
                    }
                    TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
                    if (targetSavingsTransactionHistoryViewModel2 != null && (queryCashBoxStatReq5 = targetSavingsTransactionHistoryViewModel2.f32788e) != null) {
                        queryCashBoxStatReq5.setEndTime(jT6);
                    }
                    TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel3 = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
                    if (targetSavingsTransactionHistoryViewModel3 != null && (queryCashBoxStatReq4 = targetSavingsTransactionHistoryViewModel3.f32789f) != null) {
                        queryCashBoxStatReq4.setStartTime(jT6);
                    }
                    targetSavingsTransactionHistoryFragment.v(true);
                }
                break;
        }
    }
}
