package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.core.ui.widget.TransFilterLayout;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements TransFilterLayout.OnSelectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryFragment f32480a;

    public L(FundTransactionHistoryFragment fundTransactionHistoryFragment) {
        this.f32480a = fundTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectBillType(String str) {
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectCashBoxBillType(int i7) {
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectIOType(int i7) {
        QueryFundStatReq queryFundStatReq;
        QueryFundStatReq queryFundStatReq2;
        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
        FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32480a;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
        if (fundTransactionHistoryViewModel != null && (queryFundStatReq2 = fundTransactionHistoryViewModel.f32767e) != null) {
            queryFundStatReq2.setSubTransType((String) fundTransactionHistoryFragment.f32466X.get(i7));
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
        if (fundTransactionHistoryViewModel2 != null && (queryFundStatReq = fundTransactionHistoryViewModel2.f32768f) != null) {
            queryFundStatReq.setSubTransType((String) fundTransactionHistoryFragment.f32466X.get(i7));
        }
        fundTransactionHistoryFragment.w(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectStatus(int i7) {
        QueryFundStatReq queryFundStatReq;
        QueryFundStatReq queryFundStatReq2;
        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
        FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32480a;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
        if (fundTransactionHistoryViewModel != null && (queryFundStatReq2 = fundTransactionHistoryViewModel.f32767e) != null) {
            queryFundStatReq2.setTransactionStatus(String.valueOf(i7));
        }
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
        if (fundTransactionHistoryViewModel2 != null && (queryFundStatReq = fundTransactionHistoryViewModel2.f32768f) != null) {
            queryFundStatReq.setTransactionStatus(String.valueOf(i7));
        }
        fundTransactionHistoryFragment.w(true);
    }
}
