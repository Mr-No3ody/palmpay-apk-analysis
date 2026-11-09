package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0010\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OpenInstallmentLoanReviewSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "findViews", "()V", "initViews", "", "loanProduct", "setLoanProduct", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fillData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;)V", "", "creditQuota", "", "interestRatio", "loanAmount", "", "maxLoanDays", FirebaseAnalytics.Param.TERM, "termSpan", "termSpanUnit", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/palmpay/lib/ui/button/PpButton;", "iv_borrow", "Lcom/palmpay/lib/ui/button/PpButton;", "Landroid/widget/TextView;", "tvPeriodDialog", "Landroid/widget/TextView;", "tvLoanableTerm", "tvLoanableAmount", "interest", "Landroid/widget/ImageView;", "iiv_close", "Landroid/widget/ImageView;", "Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenInstallmentLoanReviewSuccDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private ImageView iiv_close;

    @Nullable
    private TextView interest;

    @Nullable
    private PpButton iv_borrow;

    @Nullable
    private String loanProduct;

    @Nullable
    private TextView tvLoanableAmount;

    @Nullable
    private TextView tvLoanableTerm;

    @Nullable
    private TextView tvPeriodDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenInstallmentLoanReviewSuccDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_dialog_review_open_installment_succ);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.iv_borrow = (PpButton) findViewById(p116hb.c.iv_borrow);
        this.tvPeriodDialog = (TextView) findViewById(p116hb.c.tvPeriodDialog);
        this.tvLoanableTerm = (TextView) findViewById(p116hb.c.tvLoanableTerm);
        this.tvLoanableAmount = (TextView) findViewById(p116hb.c.tvLoanableAmount);
        this.interest = (TextView) findViewById(p116hb.c.interest);
        this.iiv_close = (ImageView) findViewById(p116hb.c.iiv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(OpenInstallmentLoanReviewSuccDialog openInstallmentLoanReviewSuccDialog, View view) {
        if (TextUtils.isEmpty(openInstallmentLoanReviewSuccDialog.loanProduct)) {
            N8.q0.v("/main/home", "tab", "finance");
        } else {
            androidx.fragment.app.E activity = openInstallmentLoanReviewSuccDialog.getActivity(openInstallmentLoanReviewSuccDialog.getContext());
            if (activity != null) {
                ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
                androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                iLoanCreditService.startBorrow(supportFragmentManager, openInstallmentLoanReviewSuccDialog.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
            }
        }
        openInstallmentLoanReviewSuccDialog.dismiss();
    }

    public final void fillData(@NotNull QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto data) {
        Intrinsics.checkNotNullParameter(data, "data");
        fillData(data.getCreditQuota(), data.getInterestRatio(), data.getLoanAmount(), data.getMaxLoanDays(), data.getTerm(), data.getTermSpan(), data.getTermSpanUnit());
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ImageView imageView = this.iiv_close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.X0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenInstallmentLoanReviewSuccDialog f30065b;

                {
                    this.f30065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30065b.dismiss();
                            break;
                        default:
                            OpenInstallmentLoanReviewSuccDialog.initViews$lambda$3(this.f30065b, view);
                            break;
                    }
                }
            }, imageView);
        }
        PpButton ppButton = this.iv_borrow;
        if (ppButton != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.X0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenInstallmentLoanReviewSuccDialog f30065b;

                {
                    this.f30065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30065b.dismiss();
                            break;
                        default:
                            OpenInstallmentLoanReviewSuccDialog.initViews$lambda$3(this.f30065b, view);
                            break;
                    }
                }
            }, ppButton);
        }
    }

    public final void setLoanProduct(@Nullable String loanProduct) {
        this.loanProduct = loanProduct;
    }

    public final void fillData(@Nullable Long creditQuota, @Nullable Double interestRatio, @Nullable Long loanAmount, @Nullable Integer maxLoanDays, @Nullable Integer term, @Nullable Integer termSpan, @Nullable String termSpanUnit) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        TextView textView = this.interest;
        if (textView != null) {
            C0.G.x("Daily interest ", decimalFormat.format(interestRatio), textView);
        }
        TextView textView2 = this.tvLoanableAmount;
        if (textView2 != null) {
            textView2.setText(Pa.r0.F(creditQuota != null ? creditQuota.longValue() : 0L));
        }
        TextView textView3 = this.tvLoanableTerm;
        if (textView3 != null) {
            textView3.setText(String.valueOf(maxLoanDays));
        }
        TextView textView4 = this.tvPeriodDialog;
        if (textView4 != null) {
            textView4.setText(term + " Terms, " + termSpan + (Intrinsics.c(termSpanUnit, "D") ? " days/term" : " month/term"));
        }
    }
}
