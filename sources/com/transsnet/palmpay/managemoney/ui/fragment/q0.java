package com.transsnet.palmpay.managemoney.ui.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.ui.widget.TransFilterLayout;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.TargetSavingsTransactionHistoryViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements TransFilterLayout.OnSelectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32654a;

    public q0(TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment) {
        this.f32654a = targetSavingsTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectBillType(String str) {
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectCashBoxBillType(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
        TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32654a;
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = targetSavingsTransactionHistoryViewModel.f32788e) != null) {
            queryCashBoxStatReq2.setOperationType(i7);
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = targetSavingsTransactionHistoryViewModel2.f32789f) != null) {
            queryCashBoxStatReq.setOperationType(i7);
        }
        targetSavingsTransactionHistoryFragment.v(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectIOType(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        TextView textView;
        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
        TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32654a;
        if (Pa.r0.N0(System.currentTimeMillis()) == targetSavingsTransactionHistoryFragment.f32550A) {
            TextView textView2 = targetSavingsTransactionHistoryFragment.f32552C;
            if (textView2 != null) {
                textView2.setText(Pa.r0.i0(targetSavingsTransactionHistoryFragment.f32561w - 1));
            }
        } else {
            TextView textView3 = targetSavingsTransactionHistoryFragment.f32552C;
            if (textView3 != null) {
                textView3.setText(Pa.r0.i0(targetSavingsTransactionHistoryFragment.f32561w - 1) + " " + targetSavingsTransactionHistoryFragment.f32550A);
            }
        }
        TextView textView4 = targetSavingsTransactionHistoryFragment.f32555M;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        TextView textView5 = targetSavingsTransactionHistoryFragment.f32554L;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        if (i7 == 1) {
            TextView textView6 = targetSavingsTransactionHistoryFragment.f32555M;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        } else if (i7 == 2 && (textView = targetSavingsTransactionHistoryFragment.f32554L) != null) {
            textView.setVisibility(8);
        }
        TextView textView7 = targetSavingsTransactionHistoryFragment.f32554L;
        if (textView7 != null) {
            textView7.setText(C0.G.i("In  ").setForegroundColor(targetSavingsTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append("0.00").create());
        }
        TextView textView8 = targetSavingsTransactionHistoryFragment.f32555M;
        if (textView8 != null) {
            textView8.setText(C0.G.i("Out  ").setForegroundColor(targetSavingsTransactionHistoryFragment.requireContext().getColor(com.transsnet.palmpay.custom_view.p.cv_color_858a8f)).append("0.00").create());
        }
        LinearLayout linearLayout = targetSavingsTransactionHistoryFragment.f32551B;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = targetSavingsTransactionHistoryViewModel.f32788e) != null) {
            queryCashBoxStatReq2.setTransactionDirection(i7);
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = targetSavingsTransactionHistoryViewModel2.f32789f) != null) {
            queryCashBoxStatReq.setTransactionDirection(i7);
        }
        targetSavingsTransactionHistoryFragment.v(true);
    }

    @Override // com.transsnet.palmpay.core.ui.widget.TransFilterLayout.OnSelectListener
    public final void onSelectStatus(int i7) {
        QueryCashBoxStatReq queryCashBoxStatReq;
        QueryCashBoxStatReq queryCashBoxStatReq2;
        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
        TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32654a;
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel != null && (queryCashBoxStatReq2 = targetSavingsTransactionHistoryViewModel.f32788e) != null) {
            queryCashBoxStatReq2.setTransactionStatus(i7);
        }
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2 = (TargetSavingsTransactionHistoryViewModel) targetSavingsTransactionHistoryFragment.f27333i;
        if (targetSavingsTransactionHistoryViewModel2 != null && (queryCashBoxStatReq = targetSavingsTransactionHistoryViewModel2.f32789f) != null) {
            queryCashBoxStatReq.setTransactionStatus(i7);
        }
        targetSavingsTransactionHistoryFragment.v(true);
    }
}
