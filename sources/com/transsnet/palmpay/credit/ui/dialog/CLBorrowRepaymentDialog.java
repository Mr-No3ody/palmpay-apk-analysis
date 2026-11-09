package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001bBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u00102R\u001d\u0010;\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010:R\u001d\u0010>\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010!\u001a\u0004\b=\u00102R\u001d\u0010A\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010!\u001a\u0004\b@\u00102R\u001d\u0010D\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010!\u001a\u0004\bC\u00102R\u001d\u0010I\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bG\u0010HR\u001d\u0010L\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010!\u001a\u0004\bK\u00102R\u001d\u0010O\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010!\u001a\u0004\bN\u0010HR\u001d\u0010R\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010!\u001a\u0004\bQ\u00102R\u001d\u0010U\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010!\u001a\u0004\bT\u00102R\u001d\u0010X\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010!\u001a\u0004\bW\u00102R\u001d\u0010[\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010!\u001a\u0004\bZ\u00102R\u001d\u0010^\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010!\u001a\u0004\b]\u0010:R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowRepaymentDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment;", "mBwFragment", "", "mProductId", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "mRepaymentPlanData", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "Lkotlin/collections/ArrayList;", "mCouponData", "Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowRepaymentDialog$CommitClickListener;", "commitClickListener", "<init>", "(Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment;ILcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;Ljava/util/ArrayList;Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowRepaymentDialog$CommitClickListener;)V", "", "initViews", "()V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "initView", "showInterestDialog", "setListener", "Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment;", "I", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowRepaymentDialog$CommitClickListener;", "Landroid/widget/Button;", "confirm_bt$delegate", "Lkotlin/Lazy;", "getConfirm_bt", "()Landroid/widget/Button;", "confirm_bt", "Landroidx/recyclerview/widget/RecyclerView;", "repayment_plan_rv$delegate", "getRepayment_plan_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "repayment_plan_rv", "Landroid/view/View;", "repayment_plan_divider_view$delegate", "getRepayment_plan_divider_view", "()Landroid/view/View;", "repayment_plan_divider_view", "Landroid/widget/TextView;", "origin_total_interest_tv$delegate", "getOrigin_total_interest_tv", "()Landroid/widget/TextView;", "origin_total_interest_tv", "bw_all_interest_amount_tv$delegate", "getBw_all_interest_amount_tv", "bw_all_interest_amount_tv", "Landroid/widget/ImageView;", "interest_tips_img$delegate", "getInterest_tips_img", "()Landroid/widget/ImageView;", "interest_tips_img", "origin_interest_rate_tv$delegate", "getOrigin_interest_rate_tv", "origin_interest_rate_tv", "bw_daily_interest_rate_tv$delegate", "getBw_daily_interest_rate_tv", "bw_daily_interest_rate_tv", "service_fee_amount_tv$delegate", "getService_fee_amount_tv", "service_fee_amount_tv", "Landroidx/constraintlayout/widget/Group;", "coupon_group$delegate", "getCoupon_group", "()Landroidx/constraintlayout/widget/Group;", "coupon_group", "coupon_content_tv$delegate", "getCoupon_content_tv", "coupon_content_tv", "borrow_all_group$delegate", "getBorrow_all_group", "borrow_all_group", "borrow_all_discount_value_tv$delegate", "getBorrow_all_discount_value_tv", "borrow_all_discount_value_tv", "coupon_title_tv$delegate", "getCoupon_title_tv", "coupon_title_tv", "principal_amount_tv$delegate", "getPrincipal_amount_tv", "principal_amount_tv", "repay_amount_tv$delegate", "getRepay_amount_tv", "repay_amount_tv", "ivClose$delegate", "getIvClose", "ivClose", "Lxb/A;", "mAdapter", "Lxb/A;", "CommitClickListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBorrowRepaymentDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: borrow_all_discount_value_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borrow_all_discount_value_tv;

    /* JADX INFO: renamed from: borrow_all_group$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borrow_all_group;

    /* JADX INFO: renamed from: bw_all_interest_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bw_all_interest_amount_tv;

    /* JADX INFO: renamed from: bw_daily_interest_rate_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bw_daily_interest_rate_tv;

    @Nullable
    private final CommitClickListener commitClickListener;

    /* JADX INFO: renamed from: confirm_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_bt;

    /* JADX INFO: renamed from: coupon_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_content_tv;

    /* JADX INFO: renamed from: coupon_group$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_group;

    /* JADX INFO: renamed from: coupon_title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_title_tv;

    /* JADX INFO: renamed from: interest_tips_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interest_tips_img;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private p351xb.A mAdapter;

    @NotNull
    private final CLBorrowBaseFragment mBwFragment;

    @NotNull
    private final ArrayList<CLBorrowCouponData> mCouponData;
    private final int mProductId;

    @Nullable
    private final CLRepaymentPlanData mRepaymentPlanData;

    /* JADX INFO: renamed from: origin_interest_rate_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy origin_interest_rate_tv;

    /* JADX INFO: renamed from: origin_total_interest_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy origin_total_interest_tv;

    /* JADX INFO: renamed from: principal_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy principal_amount_tv;

    /* JADX INFO: renamed from: repay_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repay_amount_tv;

    /* JADX INFO: renamed from: repayment_plan_divider_view$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repayment_plan_divider_view;

    /* JADX INFO: renamed from: repayment_plan_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repayment_plan_rv;

    /* JADX INFO: renamed from: service_fee_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy service_fee_amount_tv;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLBorrowRepaymentDialog$CommitClickListener;", "", "commit", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CommitClickListener {
        void commit();
    }

    public /* synthetic */ CLBorrowRepaymentDialog(CLBorrowBaseFragment cLBorrowBaseFragment, int i7, CLRepaymentPlanData cLRepaymentPlanData, ArrayList arrayList, CommitClickListener commitClickListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cLBorrowBaseFragment, i7, cLRepaymentPlanData, arrayList, (i10 & 16) != 0 ? null : commitClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView borrow_all_discount_value_tv_delegate$lambda$12(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.borrow_all_discount_value_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Group borrow_all_group_delegate$lambda$11(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (Group) cLBorrowRepaymentDialog.findViewById(Ya.e.borrow_all_group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView bw_all_interest_amount_tv_delegate$lambda$4(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.bw_all_interest_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView bw_daily_interest_rate_tv_delegate$lambda$7(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.bw_daily_interest_rate_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirm_bt_delegate$lambda$0(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (Button) cLBorrowRepaymentDialog.findViewById(Ya.e.confirm_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView coupon_content_tv_delegate$lambda$10(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.coupon_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Group coupon_group_delegate$lambda$9(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (Group) cLBorrowRepaymentDialog.findViewById(Ya.e.coupon_group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView coupon_title_tv_delegate$lambda$13(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.coupon_title_tv);
    }

    private final TextView getBorrow_all_discount_value_tv() {
        return (TextView) this.borrow_all_discount_value_tv.getValue();
    }

    private final Group getBorrow_all_group() {
        return (Group) this.borrow_all_group.getValue();
    }

    private final TextView getBw_all_interest_amount_tv() {
        return (TextView) this.bw_all_interest_amount_tv.getValue();
    }

    private final TextView getBw_daily_interest_rate_tv() {
        return (TextView) this.bw_daily_interest_rate_tv.getValue();
    }

    private final Button getConfirm_bt() {
        return (Button) this.confirm_bt.getValue();
    }

    private final TextView getCoupon_content_tv() {
        return (TextView) this.coupon_content_tv.getValue();
    }

    private final Group getCoupon_group() {
        return (Group) this.coupon_group.getValue();
    }

    private final TextView getCoupon_title_tv() {
        return (TextView) this.coupon_title_tv.getValue();
    }

    private final ImageView getInterest_tips_img() {
        return (ImageView) this.interest_tips_img.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getOrigin_interest_rate_tv() {
        return (TextView) this.origin_interest_rate_tv.getValue();
    }

    private final TextView getOrigin_total_interest_tv() {
        return (TextView) this.origin_total_interest_tv.getValue();
    }

    private final TextView getPrincipal_amount_tv() {
        return (TextView) this.principal_amount_tv.getValue();
    }

    private final TextView getRepay_amount_tv() {
        return (TextView) this.repay_amount_tv.getValue();
    }

    private final View getRepayment_plan_divider_view() {
        return (View) this.repayment_plan_divider_view.getValue();
    }

    private final RecyclerView getRepayment_plan_rv() {
        return (RecyclerView) this.repayment_plan_rv.getValue();
    }

    private final TextView getService_fee_amount_tv() {
        return (TextView) this.service_fee_amount_tv.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    private final void initView() {
        Long discountInterestSum;
        Long discountInterestSum2;
        Long originInterestSum;
        Long interestSum;
        Double interestRatio;
        Long interestSum2;
        Double interestRatio2;
        boolean z3;
        TextView origin_interest_rate_tv;
        Long actualDiscountAmount;
        Long serviceFeeSum;
        Long loanAmount;
        Long outstandingAmountSum;
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextView origin_interest_rate_tv2 = getOrigin_interest_rate_tv();
        if (origin_interest_rate_tv2 != null && (paint6 = origin_interest_rate_tv2.getPaint()) != null) {
            paint6.setFlags(8);
        }
        TextView origin_interest_rate_tv3 = getOrigin_interest_rate_tv();
        if (origin_interest_rate_tv3 != null && (paint5 = origin_interest_rate_tv3.getPaint()) != null) {
            paint5.setAntiAlias(true);
        }
        TextView origin_interest_rate_tv4 = getOrigin_interest_rate_tv();
        if (origin_interest_rate_tv4 != null && (paint4 = origin_interest_rate_tv4.getPaint()) != null) {
            paint4.setFlags(16);
        }
        TextView origin_total_interest_tv = getOrigin_total_interest_tv();
        if (origin_total_interest_tv != null && (paint3 = origin_total_interest_tv.getPaint()) != null) {
            paint3.setFlags(8);
        }
        TextView origin_total_interest_tv2 = getOrigin_total_interest_tv();
        if (origin_total_interest_tv2 != null && (paint2 = origin_total_interest_tv2.getPaint()) != null) {
            paint2.setAntiAlias(true);
        }
        TextView origin_total_interest_tv3 = getOrigin_total_interest_tv();
        if (origin_total_interest_tv3 != null && (paint = origin_total_interest_tv3.getPaint()) != null) {
            paint.setFlags(16);
        }
        TextView repay_amount_tv = getRepay_amount_tv();
        long jLongValue = 0;
        if (repay_amount_tv != null) {
            CLRepaymentPlanData cLRepaymentPlanData = this.mRepaymentPlanData;
            repay_amount_tv.setText(Pa.r0.B((cLRepaymentPlanData == null || (outstandingAmountSum = cLRepaymentPlanData.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
        }
        TextView principal_amount_tv = getPrincipal_amount_tv();
        if (principal_amount_tv != null) {
            CLRepaymentPlanData cLRepaymentPlanData2 = this.mRepaymentPlanData;
            principal_amount_tv.setText(Pa.r0.B((cLRepaymentPlanData2 == null || (loanAmount = cLRepaymentPlanData2.getLoanAmount()) == null) ? 0L : loanAmount.longValue(), true));
        }
        TextView service_fee_amount_tv = getService_fee_amount_tv();
        if (service_fee_amount_tv != null) {
            CLRepaymentPlanData cLRepaymentPlanData3 = this.mRepaymentPlanData;
            service_fee_amount_tv.setText(Pa.r0.B((cLRepaymentPlanData3 == null || (serviceFeeSum = cLRepaymentPlanData3.getServiceFeeSum()) == null) ? 0L : serviceFeeSum.longValue(), true));
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        CLRepaymentPlanData cLRepaymentPlanData4 = this.mRepaymentPlanData;
        if (cLRepaymentPlanData4 != null ? Intrinsics.c(cLRepaymentPlanData4.getUpperLimit(), Boolean.TRUE) : false) {
            TextView coupon_title_tv = getCoupon_title_tv();
            if (coupon_title_tv != null) {
                coupon_title_tv.setCompoundDrawablesWithIntrinsicBounds(0, 0, Ya.d.cs_cl_daily_interest_faq_icon, 0);
            }
        } else {
            TextView coupon_title_tv2 = getCoupon_title_tv();
            if (coupon_title_tv2 != null) {
                coupon_title_tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        CLRepaymentPlanData cLRepaymentPlanData5 = this.mRepaymentPlanData;
        double dDoubleValue = 0.0d;
        if ((cLRepaymentPlanData5 != null ? cLRepaymentPlanData5.getCoupon() : null) != null) {
            TextView coupon_content_tv = getCoupon_content_tv();
            if (coupon_content_tv != null) {
                coupon_content_tv.setTextColor(this.mContext.getColor(Ya.b.cs_cl_bw_use_coupon_txt_color));
            }
            TextView coupon_content_tv2 = getCoupon_content_tv();
            if (coupon_content_tv2 != null) {
                coupon_content_tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, Ya.d.cs_select_arrow_right, 0);
            }
            TextView coupon_content_tv3 = getCoupon_content_tv();
            if (coupon_content_tv3 != null) {
                Context context = this.mContext;
                int i7 = Ya.g.cs_use_coupons_content;
                CLBorrowCouponData coupon = this.mRepaymentPlanData.getCoupon();
                coupon_content_tv3.setText(context.getString(i7, Pa.r0.B((coupon == null || (actualDiscountAmount = coupon.getActualDiscountAmount()) == null) ? 0L : actualDiscountAmount.longValue(), true)));
            }
            Double interestRatio3 = this.mRepaymentPlanData.getInterestRatio();
            if (interestRatio3 != null) {
                double dDoubleValue2 = interestRatio3.doubleValue();
                Double originInterestRatio = this.mRepaymentPlanData.getOriginInterestRatio();
                if (Double.compare(dDoubleValue2, originInterestRatio != null ? originInterestRatio.doubleValue() : 0.0d) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                TextView bw_daily_interest_rate_tv = getBw_daily_interest_rate_tv();
                if (bw_daily_interest_rate_tv != null) {
                    bw_daily_interest_rate_tv.setText(decimalFormat.format(this.mRepaymentPlanData.getInterestRatio()));
                }
                TextView origin_interest_rate_tv5 = getOrigin_interest_rate_tv();
                if (origin_interest_rate_tv5 != null) {
                    origin_interest_rate_tv5.setVisibility(8);
                }
            } else {
                TextView bw_daily_interest_rate_tv2 = getBw_daily_interest_rate_tv();
                if (bw_daily_interest_rate_tv2 != null) {
                    Double interestRatio4 = this.mRepaymentPlanData.getInterestRatio();
                    bw_daily_interest_rate_tv2.setText(decimalFormat.format(interestRatio4 != null ? interestRatio4.doubleValue() : 0.0d));
                }
                TextView origin_interest_rate_tv6 = getOrigin_interest_rate_tv();
                if (origin_interest_rate_tv6 != null) {
                    Double originInterestRatio2 = this.mRepaymentPlanData.getOriginInterestRatio();
                    origin_interest_rate_tv6.setText(decimalFormat.format(originInterestRatio2 != null ? originInterestRatio2.doubleValue() : 0.0d));
                }
                TextView origin_interest_rate_tv7 = getOrigin_interest_rate_tv();
                if (origin_interest_rate_tv7 != null) {
                    origin_interest_rate_tv7.setVisibility(0);
                }
            }
            if (this.mRepaymentPlanData.getOriginInterestRatio() == null && (origin_interest_rate_tv = getOrigin_interest_rate_tv()) != null) {
                origin_interest_rate_tv.setVisibility(8);
            }
            if (Intrinsics.c(this.mRepaymentPlanData.getInterestSum(), this.mRepaymentPlanData.getOriginInterestSum())) {
                TextView bw_all_interest_amount_tv = getBw_all_interest_amount_tv();
                if (bw_all_interest_amount_tv != null) {
                    Long interestSum3 = this.mRepaymentPlanData.getInterestSum();
                    bw_all_interest_amount_tv.setText(Pa.r0.B(interestSum3 != null ? interestSum3.longValue() : 0L, false));
                }
                TextView origin_total_interest_tv4 = getOrigin_total_interest_tv();
                if (origin_total_interest_tv4 != null) {
                    origin_total_interest_tv4.setVisibility(8);
                }
            } else {
                TextView bw_all_interest_amount_tv2 = getBw_all_interest_amount_tv();
                if (bw_all_interest_amount_tv2 != null) {
                    Long interestSum4 = this.mRepaymentPlanData.getInterestSum();
                    bw_all_interest_amount_tv2.setText(Pa.r0.B(interestSum4 != null ? interestSum4.longValue() : 0L, false));
                }
                TextView origin_total_interest_tv5 = getOrigin_total_interest_tv();
                if (origin_total_interest_tv5 != null) {
                    Long originInterestSum2 = this.mRepaymentPlanData.getOriginInterestSum();
                    origin_total_interest_tv5.setText(Pa.r0.B(originInterestSum2 != null ? originInterestSum2.longValue() : 0L, false));
                }
                TextView origin_total_interest_tv6 = getOrigin_total_interest_tv();
                if (origin_total_interest_tv6 != null) {
                    origin_total_interest_tv6.setVisibility(0);
                }
            }
            Group coupon_group = getCoupon_group();
            if (coupon_group != null) {
                coupon_group.setVisibility(0);
            }
        } else {
            ArrayList<CLBorrowCouponData> arrayList = this.mCouponData;
            if (arrayList == null || arrayList.isEmpty()) {
                TextView coupon_content_tv4 = getCoupon_content_tv();
                if (coupon_content_tv4 != null) {
                    coupon_content_tv4.setTextColor(this.mContext.getColor(Ya.b.cs_cl_bw_no_coupon_txt_color));
                }
                TextView coupon_content_tv5 = getCoupon_content_tv();
                if (coupon_content_tv5 != null) {
                    coupon_content_tv5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                TextView coupon_content_tv6 = getCoupon_content_tv();
                if (coupon_content_tv6 != null) {
                    coupon_content_tv6.setText(this.mContext.getString(Ya.g.cs_unavailable_coupons));
                }
                TextView bw_daily_interest_rate_tv3 = getBw_daily_interest_rate_tv();
                if (bw_daily_interest_rate_tv3 != null) {
                    CLRepaymentPlanData cLRepaymentPlanData6 = this.mRepaymentPlanData;
                    if (cLRepaymentPlanData6 != null && (interestRatio = cLRepaymentPlanData6.getInterestRatio()) != null) {
                        dDoubleValue = interestRatio.doubleValue();
                    }
                    bw_daily_interest_rate_tv3.setText(decimalFormat.format(dDoubleValue));
                }
                TextView origin_interest_rate_tv8 = getOrigin_interest_rate_tv();
                if (origin_interest_rate_tv8 != null) {
                    origin_interest_rate_tv8.setVisibility(8);
                }
                TextView bw_all_interest_amount_tv3 = getBw_all_interest_amount_tv();
                if (bw_all_interest_amount_tv3 != null) {
                    CLRepaymentPlanData cLRepaymentPlanData7 = this.mRepaymentPlanData;
                    bw_all_interest_amount_tv3.setText(Pa.r0.B((cLRepaymentPlanData7 == null || (interestSum = cLRepaymentPlanData7.getInterestSum()) == null) ? 0L : interestSum.longValue(), false));
                }
                TextView origin_total_interest_tv7 = getOrigin_total_interest_tv();
                if (origin_total_interest_tv7 != null) {
                    CLRepaymentPlanData cLRepaymentPlanData8 = this.mRepaymentPlanData;
                    origin_total_interest_tv7.setText(Pa.r0.B((cLRepaymentPlanData8 == null || (originInterestSum = cLRepaymentPlanData8.getOriginInterestSum()) == null) ? 0L : originInterestSum.longValue(), false));
                }
                CLRepaymentPlanData cLRepaymentPlanData9 = this.mRepaymentPlanData;
                Long interestSum5 = cLRepaymentPlanData9 != null ? cLRepaymentPlanData9.getInterestSum() : null;
                CLRepaymentPlanData cLRepaymentPlanData10 = this.mRepaymentPlanData;
                if (Intrinsics.c(interestSum5, cLRepaymentPlanData10 != null ? cLRepaymentPlanData10.getOriginInterestSum() : null)) {
                    TextView origin_total_interest_tv8 = getOrigin_total_interest_tv();
                    if (origin_total_interest_tv8 != null) {
                        origin_total_interest_tv8.setVisibility(8);
                    }
                } else {
                    TextView origin_total_interest_tv9 = getOrigin_total_interest_tv();
                    if (origin_total_interest_tv9 != null) {
                        origin_total_interest_tv9.setVisibility(0);
                    }
                }
                CLRepaymentPlanData cLRepaymentPlanData11 = this.mRepaymentPlanData;
                if (((cLRepaymentPlanData11 == null || (discountInterestSum2 = cLRepaymentPlanData11.getDiscountInterestSum()) == null) ? 0L : discountInterestSum2.longValue()) > 0) {
                    Group borrow_all_group = getBorrow_all_group();
                    if (borrow_all_group != null) {
                        borrow_all_group.setVisibility(0);
                    }
                    TextView borrow_all_discount_value_tv = getBorrow_all_discount_value_tv();
                    if (borrow_all_discount_value_tv != null) {
                        CLRepaymentPlanData cLRepaymentPlanData12 = this.mRepaymentPlanData;
                        if (cLRepaymentPlanData12 != null && (discountInterestSum = cLRepaymentPlanData12.getDiscountInterestSum()) != null) {
                            jLongValue = discountInterestSum.longValue();
                        }
                        C0.G.x("- ", Pa.r0.z0(Pa.r0.B(jLongValue, true)), borrow_all_discount_value_tv);
                    }
                } else {
                    Group borrow_all_group2 = getBorrow_all_group();
                    if (borrow_all_group2 != null) {
                        borrow_all_group2.setVisibility(8);
                    }
                }
                Group coupon_group2 = getCoupon_group();
                if (coupon_group2 != null) {
                    coupon_group2.setVisibility(8);
                }
            } else {
                TextView coupon_content_tv7 = getCoupon_content_tv();
                if (coupon_content_tv7 != null) {
                    coupon_content_tv7.setTextColor(this.mContext.getColor(Ya.b.cs_cl_bw_use_coupon_txt_color));
                }
                TextView coupon_content_tv8 = getCoupon_content_tv();
                if (coupon_content_tv8 != null) {
                    coupon_content_tv8.setCompoundDrawablesWithIntrinsicBounds(0, 0, Ya.d.cs_select_arrow_right, 0);
                }
                TextView coupon_content_tv9 = getCoupon_content_tv();
                if (coupon_content_tv9 != null) {
                    coupon_content_tv9.setText(this.mContext.getString(Ya.g.cs_available_coupons, Integer.valueOf(this.mCouponData.size())));
                }
                TextView bw_daily_interest_rate_tv4 = getBw_daily_interest_rate_tv();
                if (bw_daily_interest_rate_tv4 != null) {
                    CLRepaymentPlanData cLRepaymentPlanData13 = this.mRepaymentPlanData;
                    if (cLRepaymentPlanData13 != null && (interestRatio2 = cLRepaymentPlanData13.getInterestRatio()) != null) {
                        dDoubleValue = interestRatio2.doubleValue();
                    }
                    bw_daily_interest_rate_tv4.setText(decimalFormat.format(dDoubleValue));
                }
                TextView origin_interest_rate_tv9 = getOrigin_interest_rate_tv();
                if (origin_interest_rate_tv9 != null) {
                    origin_interest_rate_tv9.setVisibility(8);
                }
                TextView bw_all_interest_amount_tv4 = getBw_all_interest_amount_tv();
                if (bw_all_interest_amount_tv4 != null) {
                    CLRepaymentPlanData cLRepaymentPlanData14 = this.mRepaymentPlanData;
                    if (cLRepaymentPlanData14 != null && (interestSum2 = cLRepaymentPlanData14.getInterestSum()) != null) {
                        jLongValue = interestSum2.longValue();
                    }
                    bw_all_interest_amount_tv4.setText(Pa.r0.B(jLongValue, false));
                }
                TextView origin_total_interest_tv10 = getOrigin_total_interest_tv();
                if (origin_total_interest_tv10 != null) {
                    origin_total_interest_tv10.setVisibility(8);
                }
                Group coupon_group3 = getCoupon_group();
                if (coupon_group3 != null) {
                    coupon_group3.setVisibility(0);
                }
            }
        }
        if (this.mProductId == 2) {
            CLRepaymentPlanData cLRepaymentPlanData15 = this.mRepaymentPlanData;
            List<RepaymentPlan> repaymentPlanList = cLRepaymentPlanData15 != null ? cLRepaymentPlanData15.getRepaymentPlanList() : null;
            if (repaymentPlanList == null || repaymentPlanList.isEmpty()) {
                return;
            }
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            CLRepaymentPlanData cLRepaymentPlanData16 = this.mRepaymentPlanData;
            List<RepaymentPlan> repaymentPlanList2 = cLRepaymentPlanData16 != null ? cLRepaymentPlanData16.getRepaymentPlanList() : null;
            Intrinsics.e(repaymentPlanList2);
            this.mAdapter = new p351xb.A(mContext, repaymentPlanList2);
            RecyclerView repayment_plan_rv = getRepayment_plan_rv();
            if (repayment_plan_rv != null) {
                repayment_plan_rv.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
            }
            RecyclerView repayment_plan_rv2 = getRepayment_plan_rv();
            if (repayment_plan_rv2 != null) {
                repayment_plan_rv2.setAdapter(this.mAdapter);
            }
            View repayment_plan_divider_view = getRepayment_plan_divider_view();
            if (repayment_plan_divider_view != null) {
                repayment_plan_divider_view.setVisibility(0);
            }
            RecyclerView repayment_plan_rv3 = getRepayment_plan_rv();
            if (repayment_plan_rv3 != null) {
                repayment_plan_rv3.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView interest_tips_img_delegate$lambda$5(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (ImageView) cLBorrowRepaymentDialog.findViewById(Ya.e.interest_tips_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$16(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (ImageView) cLBorrowRepaymentDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView origin_interest_rate_tv_delegate$lambda$6(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.origin_interest_rate_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView origin_total_interest_tv_delegate$lambda$3(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.origin_total_interest_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView principal_amount_tv_delegate$lambda$14(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.principal_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView repay_amount_tv_delegate$lambda$15(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.repay_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View repayment_plan_divider_view_delegate$lambda$2(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return cLBorrowRepaymentDialog.findViewById(Ya.e.repayment_plan_divider_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView repayment_plan_rv_delegate$lambda$1(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (RecyclerView) cLBorrowRepaymentDialog.findViewById(Ya.e.repayment_plan_rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView service_fee_amount_tv_delegate$lambda$8(CLBorrowRepaymentDialog cLBorrowRepaymentDialog) {
        return (TextView) cLBorrowRepaymentDialog.findViewById(Ya.e.service_fee_amount_tv);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowRepaymentDialog f30139b;

                {
                    this.f30139b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30139b.dismiss();
                            break;
                        case 1:
                            CLBorrowRepaymentDialog.setListener$lambda$19(this.f30139b, view);
                            break;
                        case 2:
                            CLBorrowRepaymentDialog.setListener$lambda$20(this.f30139b, view);
                            break;
                        case 3:
                            CLBorrowRepaymentDialog.setListener$lambda$21(this.f30139b, view);
                            break;
                        default:
                            CLBorrowRepaymentDialog.setListener$lambda$22(this.f30139b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        Button confirm_bt = getConfirm_bt();
        if (confirm_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowRepaymentDialog f30139b;

                {
                    this.f30139b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30139b.dismiss();
                            break;
                        case 1:
                            CLBorrowRepaymentDialog.setListener$lambda$19(this.f30139b, view);
                            break;
                        case 2:
                            CLBorrowRepaymentDialog.setListener$lambda$20(this.f30139b, view);
                            break;
                        case 3:
                            CLBorrowRepaymentDialog.setListener$lambda$21(this.f30139b, view);
                            break;
                        default:
                            CLBorrowRepaymentDialog.setListener$lambda$22(this.f30139b, view);
                            break;
                    }
                }
            }, confirm_bt);
        }
        ImageView interest_tips_img = getInterest_tips_img();
        if (interest_tips_img != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowRepaymentDialog f30139b;

                {
                    this.f30139b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f30139b.dismiss();
                            break;
                        case 1:
                            CLBorrowRepaymentDialog.setListener$lambda$19(this.f30139b, view);
                            break;
                        case 2:
                            CLBorrowRepaymentDialog.setListener$lambda$20(this.f30139b, view);
                            break;
                        case 3:
                            CLBorrowRepaymentDialog.setListener$lambda$21(this.f30139b, view);
                            break;
                        default:
                            CLBorrowRepaymentDialog.setListener$lambda$22(this.f30139b, view);
                            break;
                    }
                }
            }, interest_tips_img);
        }
        TextView coupon_content_tv = getCoupon_content_tv();
        if (coupon_content_tv != null) {
            final int i12 = 3;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowRepaymentDialog f30139b;

                {
                    this.f30139b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f30139b.dismiss();
                            break;
                        case 1:
                            CLBorrowRepaymentDialog.setListener$lambda$19(this.f30139b, view);
                            break;
                        case 2:
                            CLBorrowRepaymentDialog.setListener$lambda$20(this.f30139b, view);
                            break;
                        case 3:
                            CLBorrowRepaymentDialog.setListener$lambda$21(this.f30139b, view);
                            break;
                        default:
                            CLBorrowRepaymentDialog.setListener$lambda$22(this.f30139b, view);
                            break;
                    }
                }
            }, coupon_content_tv);
        }
        TextView coupon_title_tv = getCoupon_title_tv();
        if (coupon_title_tv != null) {
            final int i13 = 4;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLBorrowRepaymentDialog f30139b;

                {
                    this.f30139b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f30139b.dismiss();
                            break;
                        case 1:
                            CLBorrowRepaymentDialog.setListener$lambda$19(this.f30139b, view);
                            break;
                        case 2:
                            CLBorrowRepaymentDialog.setListener$lambda$20(this.f30139b, view);
                            break;
                        case 3:
                            CLBorrowRepaymentDialog.setListener$lambda$21(this.f30139b, view);
                            break;
                        default:
                            CLBorrowRepaymentDialog.setListener$lambda$22(this.f30139b, view);
                            break;
                    }
                }
            }, coupon_title_tv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$19(CLBorrowRepaymentDialog cLBorrowRepaymentDialog, View view) {
        CommitClickListener commitClickListener = cLBorrowRepaymentDialog.commitClickListener;
        if (commitClickListener != null) {
            commitClickListener.commit();
        }
        cLBorrowRepaymentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$20(CLBorrowRepaymentDialog cLBorrowRepaymentDialog, View view) {
        cLBorrowRepaymentDialog.showInterestDialog();
        cLBorrowRepaymentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$21(CLBorrowRepaymentDialog cLBorrowRepaymentDialog, View view) {
        cLBorrowRepaymentDialog.mBwFragment.b0();
        cLBorrowRepaymentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$22(CLBorrowRepaymentDialog cLBorrowRepaymentDialog, View view) {
        Long nominaValue;
        CLRepaymentPlanData cLRepaymentPlanData = cLBorrowRepaymentDialog.mRepaymentPlanData;
        if (cLRepaymentPlanData != null ? Intrinsics.c(cLRepaymentPlanData.getUpperLimit(), Boolean.TRUE) : false) {
            O6.c cVar = new O6.c(cLBorrowRepaymentDialog.mContext);
            cVar.f6615v = L6.i.ppFlexiCashDialogTheme;
            CLBorrowCouponData coupon = cLBorrowRepaymentDialog.mRepaymentPlanData.getCoupon();
            cVar.f6598d = C0.G.o("The deduction amount cannot exceed the upper limit ", Pa.r0.B((coupon == null || (nominaValue = coupon.getNominaValue()) == null) ? 0L : nominaValue.longValue(), true));
            cVar.d(p025ba.k.core_got_it, null);
            cVar.a().show();
        }
        cLBorrowRepaymentDialog.dismiss();
    }

    private final void showInterestDialog() {
        Double penaltyRatio;
        Double originInterestRatio;
        CLRepaymentPlanData cLRepaymentPlanData = this.mRepaymentPlanData;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (cLRepaymentPlanData == null || (originInterestRatio = cLRepaymentPlanData.getOriginInterestRatio()) == null) ? 0.0d : originInterestRatio.doubleValue();
        CLRepaymentPlanData cLRepaymentPlanData2 = this.mRepaymentPlanData;
        if (cLRepaymentPlanData2 != null && (penaltyRatio = cLRepaymentPlanData2.getPenaltyRatio()) != null) {
            dDoubleValue = penaltyRatio.doubleValue();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        String str = decimalFormat.format(dDoubleValue2);
        String str2 = decimalFormat.format(dDoubleValue);
        O6.c cVar = new O6.c(this.mContext);
        cVar.f6615v = L6.i.ppFlexiCashDialogTheme;
        cVar.f6596b = O6.d.f("Interest Rate");
        cVar.f6598d = com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color, C0.G.i(str), " daily rate before repayment date;\n").setForegroundColor(Color.parseColor("#858A8F")).append(str2), " daily rate after repayment date.").setForegroundColor(Color.parseColor("#858A8F")).create();
        cVar.d(p025ba.k.core_got_it, null);
        cVar.a().show();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        initView();
        setListener();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        View decorView3;
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || getWindow() == null) {
            return;
        }
        Window window3 = getWindow();
        if (((window3 == null || (decorView3 = window3.getDecorView()) == null || decorView3.getHeight() != 0) && ((window = getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWidth() != 0)) || (window2 = getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        decorView2.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLBorrowRepaymentDialog(@NotNull CLBorrowBaseFragment mBwFragment, int i7, @Nullable CLRepaymentPlanData cLRepaymentPlanData, @NotNull ArrayList<CLBorrowCouponData> mCouponData, @Nullable CommitClickListener commitClickListener) {
        super(mBwFragment.getContext(), Ya.f.cs_cl_bw_repayment_dialog_layout);
        Intrinsics.checkNotNullParameter(mBwFragment, "mBwFragment");
        Intrinsics.checkNotNullParameter(mCouponData, "mCouponData");
        this.mBwFragment = mBwFragment;
        this.mProductId = i7;
        this.mRepaymentPlanData = cLRepaymentPlanData;
        this.mCouponData = mCouponData;
        this.commitClickListener = commitClickListener;
        final int i10 = 0;
        this.confirm_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i11 = 15;
        this.repayment_plan_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i12 = 16;
        this.repayment_plan_divider_view = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i13 = 1;
        this.origin_total_interest_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i14 = 2;
        this.bw_all_interest_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i15 = 3;
        this.interest_tips_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i16 = 4;
        this.origin_interest_rate_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i17 = 5;
        this.bw_daily_interest_rate_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i18 = 6;
        this.service_fee_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i19 = 7;
        this.coupon_group = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i20 = 8;
        this.coupon_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i21 = 9;
        this.borrow_all_group = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i22 = 10;
        this.borrow_all_discount_value_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i23 = 11;
        this.coupon_title_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i24 = 12;
        this.principal_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i25 = 13;
        this.repay_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
        final int i26 = 14;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowRepaymentDialog f30132b;

            {
                this.f30132b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return CLBorrowRepaymentDialog.confirm_bt_delegate$lambda$0(this.f30132b);
                    case 1:
                        return CLBorrowRepaymentDialog.origin_total_interest_tv_delegate$lambda$3(this.f30132b);
                    case 2:
                        return CLBorrowRepaymentDialog.bw_all_interest_amount_tv_delegate$lambda$4(this.f30132b);
                    case 3:
                        return CLBorrowRepaymentDialog.interest_tips_img_delegate$lambda$5(this.f30132b);
                    case 4:
                        return CLBorrowRepaymentDialog.origin_interest_rate_tv_delegate$lambda$6(this.f30132b);
                    case 5:
                        return CLBorrowRepaymentDialog.bw_daily_interest_rate_tv_delegate$lambda$7(this.f30132b);
                    case 6:
                        return CLBorrowRepaymentDialog.service_fee_amount_tv_delegate$lambda$8(this.f30132b);
                    case 7:
                        return CLBorrowRepaymentDialog.coupon_group_delegate$lambda$9(this.f30132b);
                    case 8:
                        return CLBorrowRepaymentDialog.coupon_content_tv_delegate$lambda$10(this.f30132b);
                    case 9:
                        return CLBorrowRepaymentDialog.borrow_all_group_delegate$lambda$11(this.f30132b);
                    case 10:
                        return CLBorrowRepaymentDialog.borrow_all_discount_value_tv_delegate$lambda$12(this.f30132b);
                    case 11:
                        return CLBorrowRepaymentDialog.coupon_title_tv_delegate$lambda$13(this.f30132b);
                    case 12:
                        return CLBorrowRepaymentDialog.principal_amount_tv_delegate$lambda$14(this.f30132b);
                    case 13:
                        return CLBorrowRepaymentDialog.repay_amount_tv_delegate$lambda$15(this.f30132b);
                    case 14:
                        return CLBorrowRepaymentDialog.ivClose_delegate$lambda$16(this.f30132b);
                    case 15:
                        return CLBorrowRepaymentDialog.repayment_plan_rv_delegate$lambda$1(this.f30132b);
                    default:
                        return CLBorrowRepaymentDialog.repayment_plan_divider_view_delegate$lambda$2(this.f30132b);
                }
            }
        });
    }
}
