package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CalcReturnSendCouponDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;", "couponResp", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;", "Landroid/widget/ImageView;", "ivClose", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvBorrow", "Landroid/widget/TextView;", "tvCouponValid", "tvCouponDiscount", "tvCouponHint", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CalcReturnSendCouponDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private final QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO couponResp;

    @Nullable
    private ImageView ivClose;

    @Nullable
    private TextView tvBorrow;

    @Nullable
    private TextView tvCouponDiscount;

    @Nullable
    private TextView tvCouponHint;

    @Nullable
    private TextView tvCouponValid;

    public /* synthetic */ CalcReturnSendCouponDialog(Context context, QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : calcReturnSendCouponDTO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CalcReturnSendCouponDialog calcReturnSendCouponDialog, String str, View view) {
        androidx.fragment.app.E activity;
        calcReturnSendCouponDialog.dismiss();
        if (TextUtils.isEmpty(str) || (activity = calcReturnSendCouponDialog.getActivity(calcReturnSendCouponDialog.getContext())) == null) {
            return;
        }
        ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        iLoanCreditService.startBorrow(supportFragmentManager, str, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Integer validDays;
        Long nominaValue;
        Long maxReduceValue;
        this.ivClose = (ImageView) findViewById(p116hb.c.ivClose);
        this.tvBorrow = (TextView) findViewById(p116hb.c.tvBorrow);
        this.tvCouponValid = (TextView) findViewById(p116hb.c.tvCouponValid);
        this.tvCouponDiscount = (TextView) findViewById(p116hb.c.tvCouponDiscount);
        this.tvCouponHint = (TextView) findViewById(p116hb.c.tvCouponHint);
        QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO = this.couponResp;
        long jLongValue = 0;
        String strF = Pa.r0.F((calcReturnSendCouponDTO == null || (maxReduceValue = calcReturnSendCouponDTO.getMaxReduceValue()) == null) ? 0L : maxReduceValue.longValue());
        QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO2 = this.couponResp;
        if (calcReturnSendCouponDTO2 != null && (nominaValue = calcReturnSendCouponDTO2.getNominaValue()) != null) {
            jLongValue = nominaValue.longValue();
        }
        QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO3 = this.couponResp;
        int iIntValue = (calcReturnSendCouponDTO3 == null || (validDays = calcReturnSendCouponDTO3.getValidDays()) == null) ? 0 : validDays.intValue();
        QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO4 = this.couponResp;
        String loanProduct = calcReturnSendCouponDTO4 != null ? calcReturnSendCouponDTO4.getLoanProduct() : null;
        TextView textView = this.tvCouponHint;
        if (textView != null) {
            textView.setText(getContext().getString(p116hb.f.cs_cl_calc_return_send_coupon_max_amount, strF));
        }
        TextView textView2 = this.tvCouponDiscount;
        if (textView2 != null) {
            textView2.setText(new SpanUtils().append((jLongValue / ((long) 100)) + "%").setFontSize(32, true).append(" off").setFontSize(14, true).create());
        }
        TextView textView3 = this.tvCouponValid;
        if (textView3 != null) {
            textView3.setText(getContext().getString(p116hb.f.cs_cl_calc_return_send_coupon_valid_days, Integer.valueOf(iIntValue)));
        }
        TextView textView4 = this.tvBorrow;
        if (textView4 != null) {
            p220oa.h.l(new p010a9.b(17, this, loanProduct), textView4);
        }
        ImageView imageView = this.ivClose;
        if (imageView != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 6), imageView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalcReturnSendCouponDialog(@NotNull Context context, @Nullable QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO calcReturnSendCouponDTO) {
        super(context, p116hb.d.cs_cl_calc_return_send_coupon_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.couponResp = calcReturnSendCouponDTO;
    }
}
