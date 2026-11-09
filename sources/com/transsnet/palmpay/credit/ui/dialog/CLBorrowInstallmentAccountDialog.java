package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainBean;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainResp;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0018\u0010 \u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowInstallmentAccountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;", "resp", "", "accountType", "fillData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;I)V", "Landroid/view/View;", "clbiad_repay_line", "Landroid/view/View;", "Landroid/widget/TextView;", "clbiad_repay_title", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "clbiad_hand", "Landroid/widget/ImageView;", "apply", "clbiad_days", "clbiad_loan", "clbiad_interest", "clbiad_amount", "clbiad_loan_type", "clbiad_ll", "clbiad_text1", "close", "mAccountType", "I", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowInstallmentAccountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private TextView apply;

    @Nullable
    private TextView clbiad_amount;

    @Nullable
    private TextView clbiad_days;

    @Nullable
    private ImageView clbiad_hand;

    @Nullable
    private TextView clbiad_interest;

    @Nullable
    private View clbiad_ll;

    @Nullable
    private TextView clbiad_loan;

    @Nullable
    private TextView clbiad_loan_type;

    @Nullable
    private View clbiad_repay_line;

    @Nullable
    private TextView clbiad_repay_title;

    @Nullable
    private TextView clbiad_text1;

    @Nullable
    private ImageView close;
    private int mAccountType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLBorrowInstallmentAccountDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_layout_borrow_installment_account_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(CLBorrowInstallmentAccountDialog cLBorrowInstallmentAccountDialog, View view) {
        int id2 = view.getId();
        if (id2 == p116hb.c.close) {
            cLBorrowInstallmentAccountDialog.dismiss();
            return;
        }
        if (id2 == p116hb.c.apply) {
            cLBorrowInstallmentAccountDialog.dismiss();
            int i7 = cLBorrowInstallmentAccountDialog.mAccountType;
            Bundle bundle = new Bundle();
            bundle.putInt("accountType", i7);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = Eb.a.f2267a;
            bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
            bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str);
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanBorrowHome");
        }
    }

    public final void fillData(@NotNull QueryCanBorrowAgainResp resp, int accountType) {
        LoanConfig loanConfig;
        LoanConfig loanConfig2;
        LoanConfig loanConfig3;
        Long availableAmount;
        Integer canBorrowAccountType;
        LoanConfig loanConfig4;
        LoanConfig loanConfig5;
        CardRiskLevelResp riskLevelResp;
        TextView textView;
        Intrinsics.checkNotNullParameter(resp, "resp");
        this.mAccountType = accountType == 7 ? 9 : 7;
        QueryCanBorrowAgainBean data = resp.getData();
        Long maxLoanDays = null;
        if (data == null || (canBorrowAccountType = data.getCanBorrowAccountType()) == null || canBorrowAccountType.intValue() != 9) {
            TextView textView2 = this.clbiad_text1;
            if (textView2 != null) {
                textView2.setText("Single Repay\nLoan");
            }
            TextView textView3 = this.clbiad_repay_title;
            if (textView3 != null) {
                p220oa.h.s(textView3, false);
            }
            View view = this.clbiad_repay_line;
            if (view != null) {
                p220oa.h.s(view, true);
            }
            View view2 = this.clbiad_ll;
            if (view2 != null) {
                view2.setBackgroundResource(p116hb.b.cs_borrow_dialog_bg2);
            }
            TextView textView4 = this.clbiad_loan;
            if (textView4 != null) {
                textView4.setText("Loan Period");
            }
            TextView textView5 = this.clbiad_interest;
            if (textView5 != null) {
                SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("Daily interest ", null, Integer.valueOf(Color.parseColor("#6F7B85")), null, null, null, null, 1021);
                QueryCanBorrowAgainBean data2 = resp.getData();
                textView5.setText(spannableStringBuilderB.append((CharSequence) p220oa.h.B(String.valueOf((data2 == null || (loanConfig = data2.getLoanConfig()) == null) ? null : loanConfig.getLoanRatioString()), null, Integer.valueOf(Color.parseColor("#00A49A")), null, null, null, null, 1021)));
            }
            ImageView imageView = this.clbiad_hand;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            TextView textView6 = this.apply;
            if (textView6 != null) {
                textView6.setBackgroundResource(p025ba.d.core_rect_corner_12_bg_00a49a);
            }
            TextView textView7 = this.clbiad_loan_type;
            if (textView7 != null) {
                textView7.setText("Single Repay Loan");
            }
            TextView textView8 = this.clbiad_loan_type;
            if (textView8 != null) {
                textView8.setCompoundDrawablesWithIntrinsicBounds(p116hb.b.cs_single_repay_loan_icon, 0, 0, 0);
            }
        } else {
            TextView textView9 = this.clbiad_text1;
            if (textView9 != null) {
                textView9.setText("Installment\nLoans");
            }
            TextView textView10 = this.clbiad_repay_title;
            if (textView10 != null) {
                p220oa.h.s(textView10, true);
            }
            QueryCanBorrowAgainBean data3 = resp.getData();
            if (data3 != null && (loanConfig5 = data3.getLoanConfig()) != null && (riskLevelResp = loanConfig5.getRiskLevelResp()) != null && (textView = this.clbiad_repay_title) != null) {
                textView.setText(riskLevelResp.getTerm() + " terms, " + riskLevelResp.getTermSpan() + (Intrinsics.c(riskLevelResp.getTermSpanUnit(), "D") ? " days/term" : "month/term"));
            }
            View view3 = this.clbiad_repay_line;
            if (view3 != null) {
                p220oa.h.s(view3, false);
            }
            View view4 = this.clbiad_ll;
            if (view4 != null) {
                view4.setBackgroundResource(p116hb.b.cs_borrow_dialog_bg);
            }
            TextView textView11 = this.clbiad_loan;
            if (textView11 != null) {
                textView11.setText("Loan Period");
            }
            TextView textView12 = this.clbiad_interest;
            if (textView12 != null) {
                SpannableStringBuilder spannableStringBuilderB2 = p220oa.h.B("Daily interest ", null, Integer.valueOf(Color.parseColor("#906948")), null, null, null, null, 1021);
                QueryCanBorrowAgainBean data4 = resp.getData();
                textView12.setText(spannableStringBuilderB2.append((CharSequence) p220oa.h.B(String.valueOf((data4 == null || (loanConfig4 = data4.getLoanConfig()) == null) ? null : loanConfig4.getLoanRatioString()), null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 1021)));
            }
            ImageView imageView2 = this.clbiad_hand;
            if (imageView2 != null) {
                p220oa.h.s(imageView2, true);
            }
            TextView textView13 = this.apply;
            if (textView13 != null) {
                textView13.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_text_primary);
            }
            TextView textView14 = this.clbiad_loan_type;
            if (textView14 != null) {
                textView14.setText("Installment Loan");
            }
            TextView textView15 = this.clbiad_loan_type;
            if (textView15 != null) {
                textView15.setCompoundDrawablesWithIntrinsicBounds(p116hb.b.cs_installment_succ_interest, 0, 0, 0);
            }
        }
        TextView textView16 = this.clbiad_amount;
        if (textView16 != null) {
            QueryCanBorrowAgainBean data5 = resp.getData();
            String strF = Pa.r0.F((data5 == null || (loanConfig3 = data5.getLoanConfig()) == null || (availableAmount = loanConfig3.getAvailableAmount()) == null) ? 0L : availableAmount.longValue());
            Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
            textView16.setText(p220oa.h.B(strF, null, null, null, null, null, null, 959));
        }
        TextView textView17 = this.clbiad_days;
        if (textView17 != null) {
            QueryCanBorrowAgainBean data6 = resp.getData();
            if (data6 != null && (loanConfig2 = data6.getLoanConfig()) != null) {
                maxLoanDays = loanConfig2.getMaxLoanDays();
            }
            textView17.setText(p220oa.h.B(String.valueOf(maxLoanDays), null, null, null, 26, null, null, 919).append((CharSequence) p220oa.h.B(" days", null, null, null, 14, "sans-serif-medium", null, 999)));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.clbiad_repay_line = findViewById(p116hb.c.clbiad_repay_line);
        this.clbiad_repay_title = (TextView) findViewById(p116hb.c.clbiad_repay_title);
        this.clbiad_hand = (ImageView) findViewById(p116hb.c.clbiad_hand);
        this.apply = (TextView) findViewById(p116hb.c.apply);
        this.clbiad_days = (TextView) findViewById(p116hb.c.clbiad_days);
        this.clbiad_loan = (TextView) findViewById(p116hb.c.clbiad_loan);
        this.clbiad_interest = (TextView) findViewById(p116hb.c.clbiad_interest);
        this.clbiad_amount = (TextView) findViewById(p116hb.c.clbiad_amount);
        this.clbiad_loan_type = (TextView) findViewById(p116hb.c.clbiad_loan_type);
        this.clbiad_ll = findViewById(p116hb.c.clbiad_ll);
        this.clbiad_text1 = (TextView) findViewById(p116hb.c.clbiad_text1);
        this.close = (ImageView) findViewById(p116hb.c.close);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
        attributes.height = -2;
        p220oa.h.q(new Yd.i(this, 29), this.close, this.apply);
    }
}
