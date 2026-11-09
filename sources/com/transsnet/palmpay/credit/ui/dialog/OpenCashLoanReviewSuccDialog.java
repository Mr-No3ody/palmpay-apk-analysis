package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0010\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OpenCashLoanReviewSuccDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "findViews", "()V", "initViews", "", "loanProduct", "setLoanProduct", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fillData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;)V", "", "creditQuota", "", "interestRatio", "", "maxLoanDays", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;)V", "Lcom/palmpay/lib/ui/button/PpButton;", "iv_borrow", "Lcom/palmpay/lib/ui/button/PpButton;", "Landroid/widget/TextView;", "tvLoanableTerm", "Landroid/widget/TextView;", "tvLoanableAmount", "tvInterest", "Landroid/widget/ImageView;", "iiv_close", "Landroid/widget/ImageView;", "Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenCashLoanReviewSuccDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private ImageView iiv_close;

    @Nullable
    private PpButton iv_borrow;

    @Nullable
    private String loanProduct;

    @Nullable
    private TextView tvInterest;

    @Nullable
    private TextView tvLoanableAmount;

    @Nullable
    private TextView tvLoanableTerm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCashLoanReviewSuccDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_dialog_review_open_cash_loan_succ);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.iv_borrow = (PpButton) findViewById(p116hb.c.iv_borrow);
        this.tvLoanableTerm = (TextView) findViewById(p116hb.c.tvLoanableTerm);
        this.tvLoanableAmount = (TextView) findViewById(p116hb.c.tvLoanableAmount);
        this.tvInterest = (TextView) findViewById(p116hb.c.tvInterest);
        this.iiv_close = (ImageView) findViewById(p116hb.c.iiv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(OpenCashLoanReviewSuccDialog openCashLoanReviewSuccDialog, View view) {
        openCashLoanReviewSuccDialog.dismiss();
        if (TextUtils.isEmpty(openCashLoanReviewSuccDialog.loanProduct)) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = openCashLoanReviewSuccDialog.getActivity(openCashLoanReviewSuccDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, openCashLoanReviewSuccDialog.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    public final void fillData(@Nullable QueryLoanDialogPopUpsBean.BusinessInfo data) {
        fillData(data != null ? data.getCashCreditQuota() : null, data != null ? data.getMinInterestRatio() : null, data != null ? data.getLoanPeriods() : null);
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
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.P0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenCashLoanReviewSuccDialog f30012b;

                {
                    this.f30012b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30012b.dismiss();
                            break;
                        default:
                            OpenCashLoanReviewSuccDialog.initViews$lambda$3(this.f30012b, view);
                            break;
                    }
                }
            }, imageView);
        }
        PpButton ppButton = this.iv_borrow;
        if (ppButton != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.P0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OpenCashLoanReviewSuccDialog f30012b;

                {
                    this.f30012b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30012b.dismiss();
                            break;
                        default:
                            OpenCashLoanReviewSuccDialog.initViews$lambda$3(this.f30012b, view);
                            break;
                    }
                }
            }, ppButton);
        }
    }

    public final void setLoanProduct(@Nullable String loanProduct) {
        this.loanProduct = loanProduct;
    }

    public final void fillData(@Nullable Long creditQuota, @Nullable Double interestRatio, @Nullable Integer maxLoanDays) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        TextView textView = this.tvInterest;
        Object obj = interestRatio;
        if (textView != null) {
            if (interestRatio == null) {
                obj = 0L;
            }
            C0.G.x("Daily interest ", decimalFormat.format(obj), textView);
        }
        TextView textView2 = this.tvLoanableAmount;
        if (textView2 != null) {
            textView2.setText(Pa.r0.F(creditQuota != null ? creditQuota.longValue() : 0L));
        }
        TextView textView3 = this.tvLoanableTerm;
        if (textView3 != null) {
            textView3.setText(String.valueOf(maxLoanDays));
        }
    }
}
