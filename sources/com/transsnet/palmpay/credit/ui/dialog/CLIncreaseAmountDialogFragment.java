package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.CLPromoteData;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLIncreaseAmountDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLIncreaseAmountDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f29944C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLIncreaseAmountDialogFragment newInstance(@Nullable CLPromoteData cLPromoteData) {
            CLIncreaseAmountDialogFragment cLIncreaseAmountDialogFragment = new CLIncreaseAmountDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promote_data", cLPromoteData);
            cLIncreaseAmountDialogFragment.setArguments(bundle);
            return cLIncreaseAmountDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_increase_amount_decrease_interest_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31242g = 17;
        SPUtils.get().put(C0.G.k() + "show_installment_increase_dialog", false);
        Bundle arguments = getArguments();
        CLPromoteData cLPromoteData = arguments != null ? (CLPromoteData) arguments.getParcelable("promote_data") : null;
        TextView textView = (TextView) viewF.findViewById(Ya.e.tvLoanableAmount);
        TextView textView2 = (TextView) viewF.findViewById(Ya.e.tvLoanableTerm);
        TextView textView3 = (TextView) viewF.findViewById(Ya.e.tvDailyInterest);
        TextView textView4 = (TextView) viewF.findViewById(Ya.e.tvBorrowTips);
        RoundedTextView roundedTextView = (RoundedTextView) viewF.findViewById(Ya.e.rtvBorrowNow);
        TextView textView5 = (TextView) viewF.findViewById(Ya.e.tvInstallments);
        TextView textView6 = (TextView) viewF.findViewById(Ya.e.tvPeriodDialog);
        TextView textView7 = (TextView) viewF.findViewById(Ya.e.tvLearnMoreDialog);
        if (cLPromoteData != null) {
            Long l5 = cLPromoteData.creditQuota;
            textView.setText(Pa.r0.B(l5 != null ? l5.longValue() : 0L, true));
            textView2.setText(String.valueOf(cLPromoteData.maxLoanDays));
            textView3.setText(getString(Ya.g.cs_cl_daily_interest_rate, N8.q0.j(Pa.r0.V1(Pa.r0.w1(String.valueOf(cLPromoteData.interestRatio), "100").toPlainString()), "%")));
            int i7 = Ya.g.cs_cl_borrow_with_lowest_interest_per_day;
            Long l6 = cLPromoteData.loanAmount;
            String strF = Pa.r0.F(l6 != null ? l6.longValue() : 0L);
            Long l8 = cLPromoteData.dailyInterest;
            textView4.setText(getString(i7, strF, Pa.r0.F(l8 != null ? l8.longValue() : 0L)));
            textView5.setText(getString(Ya.g.cs_cl_repay_in_installments, cLPromoteData.term));
            textView6.setText(cLPromoteData.term + " Terms, " + cLPromoteData.termSpan + (Intrinsics.c(cLPromoteData.termSpanUnit, "D") ? " days/term" : " month/term"));
        }
        Intrinsics.e(roundedTextView);
        p220oa.h.l(new ViewOnClickListenerC1533v(this, 1), roundedTextView);
        Intrinsics.e(textView7);
        p220oa.h.l(new ViewOnClickListenerC1533v(cLPromoteData, 2), textView7);
        return baseDialog;
    }
}
