package com.transsnet.palmpay.managemoney.ui.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.ui.widget.TransFilterLayout;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements TransFilterLayout.OnSelectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryFragment f32341a;

    public B(CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment) {
        this.f32341a = cashBoxTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectBillType(String str) {
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectCashBoxBillType(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32341a;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel.f32725e) != null) {
            queryCashBoxStatReq2.setTransactionType(i7);
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel2.f32726f) != null) {
            queryCashBoxStatReq.setTransactionType(i7);
        }
        cashBoxTransactionHistoryFragment.v(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectIOType(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        TextView textView;
        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32341a;
        if (Pa.r0.N0(System.currentTimeMillis()) == cashBoxTransactionHistoryFragment.f32429A) {
            TextView textView2 = cashBoxTransactionHistoryFragment.f32431C;
            if (textView2 != null) {
                textView2.setText(Pa.r0.i0(cashBoxTransactionHistoryFragment.f32441w - 1));
            }
        } else {
            TextView textView3 = cashBoxTransactionHistoryFragment.f32431C;
            if (textView3 != null) {
                textView3.setText(Pa.r0.i0(cashBoxTransactionHistoryFragment.f32441w - 1) + " " + cashBoxTransactionHistoryFragment.f32429A);
            }
        }
        TextView textView4 = cashBoxTransactionHistoryFragment.f32434M;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        TextView textView5 = cashBoxTransactionHistoryFragment.f32433L;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        if (i7 == 1) {
            TextView textView6 = cashBoxTransactionHistoryFragment.f32434M;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        } else if (i7 == 2 && (textView = cashBoxTransactionHistoryFragment.f32433L) != null) {
            textView.setVisibility(8);
        }
        TextView textView7 = cashBoxTransactionHistoryFragment.f32433L;
        if (textView7 != null) {
            textView7.setText(C0.G.i("In  ").setForegroundColor(cashBoxTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append("0.00").create());
        }
        TextView textView8 = cashBoxTransactionHistoryFragment.f32434M;
        if (textView8 != null) {
            textView8.setText(C0.G.i("Out  ").setForegroundColor(cashBoxTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append("0.00").create());
        }
        LinearLayout linearLayout = cashBoxTransactionHistoryFragment.f32430B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel.f32725e) != null) {
            queryCashBoxStatReq2.setTransactionDirection(i7);
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel2.f32726f) != null) {
            queryCashBoxStatReq.setTransactionDirection(i7);
        }
        cashBoxTransactionHistoryFragment.v(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectStatus(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32341a;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel.f32725e) != null) {
            queryCashBoxStatReq2.setTransactionStatus(i7);
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
        if (cashBoxTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = cashBoxTransactionHistoryViewModel2.f32726f) != null) {
            queryCashBoxStatReq.setTransactionStatus(i7);
        }
        cashBoxTransactionHistoryFragment.v(true);
    }
}
