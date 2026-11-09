package com.transsnet.palmpay.credit.ui.dialog;

import Oc.C0500c;
import Pa.AbstractC0511h;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLLimitedTimeBenefitsDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "Type", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLLimitedTimeBenefitsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f29945H = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f29946C;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLLimitedTimeBenefitsDialogFragment$Type;", "", "<init>", "()V", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface Type {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NOTIFY_ONLY_A = 0;
        public static final int NOTIFY_ONLY_B = 1;
        public static final int REPAY_COUPON = 2;

        /* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.CLLimitedTimeBenefitsDialogFragment$Type$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int NOTIFY_ONLY_A = 0;
            public static final int NOTIFY_ONLY_B = 1;
            public static final int REPAY_COUPON = 2;

            private Companion() {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLLimitedTimeBenefitsDialogFragment newInstance(int i7, @Nullable QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData) {
            CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = new CLLimitedTimeBenefitsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_type", i7);
            bundle.putParcelable("extra_data", cashMarketingNotifyOnlyAData);
            cLLimitedTimeBenefitsDialogFragment.setArguments(bundle);
            return cLLimitedTimeBenefitsDialogFragment;
        }

        private a() {
        }

        @NotNull
        public final CLLimitedTimeBenefitsDialogFragment newInstance(int i7, @Nullable QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData) {
            CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = new CLLimitedTimeBenefitsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_type", i7);
            bundle.putParcelable("extra_data", cashMarketingNotifyOnlyBData);
            cLLimitedTimeBenefitsDialogFragment.setArguments(bundle);
            return cLLimitedTimeBenefitsDialogFragment;
        }

        @NotNull
        public final CLLimitedTimeBenefitsDialogFragment newInstance(int i7, @Nullable QueryLoanDialogPopUpsBean.CashMarketingRepayCouponData cashMarketingRepayCouponData) {
            CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = new CLLimitedTimeBenefitsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_type", i7);
            bundle.putParcelable("extra_data", cashMarketingRepayCouponData);
            cLLimitedTimeBenefitsDialogFragment.setArguments(bundle);
            return cLLimitedTimeBenefitsDialogFragment;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Long repaymentDate;
        Long amountToBeRepaid;
        Long repaymentDate2;
        Long mayBeIncreaseAmount;
        Long mayBeIncreaseAmount2;
        View view;
        Long couponDiscountAmount;
        Long repaymentDate3;
        Long couponDiscountAmount2;
        Long repaymentDate4;
        Long amountToBeRepaid2;
        Long repaymentDate5;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), p116hb.d.cs_cl_limited_time_benefits_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = false;
        this.f31239d = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(48.0f);
        this.f31245o = false;
        this.f31242g = 17;
        this.f31237b = SizeUtils.dp2px(-56.0f);
        this.f31246p = true;
        TextView textView = (TextView) viewF.findViewById(p116hb.c.tvTitle);
        TextView textView2 = (TextView) viewF.findViewById(p116hb.c.tvAmount);
        TextView textView3 = (TextView) viewF.findViewById(p116hb.c.tvDueDate);
        TextView textView4 = (TextView) viewF.findViewById(p116hb.c.tvTips);
        TextView textView5 = (TextView) viewF.findViewById(p116hb.c.tvCouponDiscount);
        PpButton ppButton = (PpButton) viewF.findViewById(p116hb.c.clickEvent_limitedTimeBenefits_repayNow_btn);
        ImageView imageView = (ImageView) viewF.findViewById(p116hb.c.clickEvent_limitedTimeBenefits_close_iv);
        ImageView imageView2 = (ImageView) viewF.findViewById(p116hb.c.ivCalendar);
        LinearLayout linearLayout = (LinearLayout) viewF.findViewById(p116hb.c.layoutTips);
        RelativeLayout relativeLayout = (RelativeLayout) viewF.findViewById(p116hb.c.rlContent);
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("extra_type")) : null;
        long jLongValue = 0;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            ppButton = ppButton;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                textView.setText(getString(p116hb.f.cs_cl_amount_to_be_repaid));
                Bundle arguments2 = getArguments();
                QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData = arguments2 != null ? (QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyBData) arguments2.getParcelable("extra_data") : null;
                this.f29946C = cashMarketingNotifyOnlyBData != null ? cashMarketingNotifyOnlyBData.getOutstandingAccounts() : null;
                textView4.setText(getString(p116hb.f.cs_cl_Pay_now_activate_installment_service));
                long jLongValue2 = (cashMarketingNotifyOnlyBData == null || (repaymentDate5 = cashMarketingNotifyOnlyBData.getRepaymentDate()) == null) ? 0L : repaymentDate5.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(jLongValue2));
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                long jFloor = (long) Math.floor((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((double) 86400000));
                textView2.setText(Pa.r0.V1(Pa.r0.B((cashMarketingNotifyOnlyBData == null || (amountToBeRepaid2 = cashMarketingNotifyOnlyBData.getAmountToBeRepaid()) == null) ? 0L : amountToBeRepaid2.longValue(), true)));
                textView3.setText(j(Long.valueOf((cashMarketingNotifyOnlyBData == null || (repaymentDate4 = cashMarketingNotifyOnlyBData.getRepaymentDate()) == null) ? 0L : repaymentDate4.longValue()), cashMarketingNotifyOnlyBData != null ? cashMarketingNotifyOnlyBData.getOverdueDays() : null, cashMarketingNotifyOnlyBData != null ? cashMarketingNotifyOnlyBData.getOverdueFee() : null));
                imageView2.setImageResource(jFloor == 0 ? p116hb.b.cs_cl_calendar_red_icon : p116hb.b.cs_cl_calendar_yellow_icon);
                p220oa.h.s(imageView2, jFloor >= 0);
                Intrinsics.e(relativeLayout);
                p220oa.h.s(relativeLayout, false);
            } else {
                Bundle arguments3 = getArguments();
                QueryLoanDialogPopUpsBean.CashMarketingRepayCouponData cashMarketingRepayCouponData = arguments3 != null ? (QueryLoanDialogPopUpsBean.CashMarketingRepayCouponData) arguments3.getParcelable("extra_data") : null;
                this.f29946C = cashMarketingRepayCouponData != null ? cashMarketingRepayCouponData.getOutstandingAccounts() : null;
                textView.setText(getString(p116hb.f.cs_cl_repay_coupon_amount_voucher, Pa.r0.V1(Pa.r0.B((cashMarketingRepayCouponData == null || (couponDiscountAmount2 = cashMarketingRepayCouponData.getCouponDiscountAmount()) == null) ? 0L : couponDiscountAmount2.longValue(), true))));
                long jLongValue3 = (cashMarketingRepayCouponData == null || (repaymentDate3 = cashMarketingRepayCouponData.getRepaymentDate()) == null) ? 0L : repaymentDate3.longValue();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new Date(jLongValue3));
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.set(11, 0);
                calendar4.set(12, 0);
                calendar4.set(13, 0);
                calendar4.set(14, 0);
                long jFloor2 = (long) Math.floor((calendar3.getTimeInMillis() - calendar4.getTimeInMillis()) / ((double) 86400000));
                textView2.setVisibility(8);
                linearLayout.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = ppButton.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = SizeUtils.dp2px(16.0f);
                view = ppButton;
                view.setLayoutParams(layoutParams2);
                textView3.setText(j(cashMarketingRepayCouponData != null ? cashMarketingRepayCouponData.getRepaymentDate() : null, cashMarketingRepayCouponData != null ? cashMarketingRepayCouponData.getOverdueDays() : null, cashMarketingRepayCouponData != null ? cashMarketingRepayCouponData.getOverdueFee() : null));
                imageView2.setImageResource(jFloor2 == 0 ? p116hb.b.cs_cl_calendar_red_icon : p116hb.b.cs_cl_calendar_yellow_icon);
                if (cashMarketingRepayCouponData != null && (couponDiscountAmount = cashMarketingRepayCouponData.getCouponDiscountAmount()) != null) {
                    jLongValue = couponDiscountAmount.longValue();
                }
                C0.G.x("-", Pa.r0.V1(Pa.r0.B(jLongValue, true)), textView5);
                p220oa.h.s(imageView2, jFloor2 >= 0);
                Intrinsics.e(relativeLayout);
                p220oa.h.s(relativeLayout, true);
            }
            Intrinsics.e(view);
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLLimitedTimeBenefitsDialogFragment f29977b;

                {
                    this.f29977b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = this.f29977b;
                    switch (i7) {
                        case 0:
                            List list = cLLimitedTimeBenefitsDialogFragment.f29946C;
                            if (list != null && !list.isEmpty()) {
                                if (list.size() == 1) {
                                    OutstandingAccount outstandingAccount = (OutstandingAccount) list.get(0);
                                    Integer num = outstandingAccount.accountType;
                                    if (num != null && num.intValue() == 6) {
                                        Long l5 = outstandingAccount.billOutstandingAmount;
                                        if ((l5 != null ? l5.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(cLLimitedTimeBenefitsDialogFragment.getContext());
                                        }
                                    }
                                    Integer num2 = outstandingAccount.accountType;
                                    if (num2 != null && num2.intValue() == 7) {
                                        Long l6 = outstandingAccount.billOutstandingAmount;
                                        if ((l6 != null ? l6.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("cardNo", outstandingAccount.cardNo);
                                            bundle.putString("loanProduct", outstandingAccount.loanProduct);
                                            bundle.putBoolean("repayAllFlag", false);
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanRepayHome");
                                        }
                                    }
                                    Integer num3 = outstandingAccount.accountType;
                                    if (num3 != null && num3.intValue() == 9) {
                                        Long l8 = outstandingAccount.billOutstandingAmount;
                                        if ((l8 != null ? l8.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("cardNo", outstandingAccount.cardNo);
                                            bundle2.putString("loanProduct", outstandingAccount.loanProduct);
                                            bundle2.putBoolean("repayAllFlag", false);
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanRepayHome");
                                        }
                                    }
                                }
                                cLLimitedTimeBenefitsDialogFragment.dismiss();
                                com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
                                break;
                            }
                            break;
                        default:
                            CLLimitedTimeBenefitsDialogFragment.a aVar = CLLimitedTimeBenefitsDialogFragment.f29945H;
                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                            break;
                    }
                }
            }, view);
            Intrinsics.e(imageView);
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLLimitedTimeBenefitsDialogFragment f29977b;

                {
                    this.f29977b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = this.f29977b;
                    switch (i10) {
                        case 0:
                            List list = cLLimitedTimeBenefitsDialogFragment.f29946C;
                            if (list != null && !list.isEmpty()) {
                                if (list.size() == 1) {
                                    OutstandingAccount outstandingAccount = (OutstandingAccount) list.get(0);
                                    Integer num = outstandingAccount.accountType;
                                    if (num != null && num.intValue() == 6) {
                                        Long l5 = outstandingAccount.billOutstandingAmount;
                                        if ((l5 != null ? l5.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(cLLimitedTimeBenefitsDialogFragment.getContext());
                                        }
                                    }
                                    Integer num2 = outstandingAccount.accountType;
                                    if (num2 != null && num2.intValue() == 7) {
                                        Long l6 = outstandingAccount.billOutstandingAmount;
                                        if ((l6 != null ? l6.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("cardNo", outstandingAccount.cardNo);
                                            bundle.putString("loanProduct", outstandingAccount.loanProduct);
                                            bundle.putBoolean("repayAllFlag", false);
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanRepayHome");
                                        }
                                    }
                                    Integer num3 = outstandingAccount.accountType;
                                    if (num3 != null && num3.intValue() == 9) {
                                        Long l8 = outstandingAccount.billOutstandingAmount;
                                        if ((l8 != null ? l8.longValue() : -1L) > 0) {
                                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("cardNo", outstandingAccount.cardNo);
                                            bundle2.putString("loanProduct", outstandingAccount.loanProduct);
                                            bundle2.putBoolean("repayAllFlag", false);
                                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanRepayHome");
                                        }
                                    }
                                }
                                cLLimitedTimeBenefitsDialogFragment.dismiss();
                                com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
                                break;
                            }
                            break;
                        default:
                            CLLimitedTimeBenefitsDialogFragment.a aVar = CLLimitedTimeBenefitsDialogFragment.f29945H;
                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                            break;
                    }
                }
            }, imageView);
            return baseDialog;
        }
        textView.setText(getString(p116hb.f.cs_cl_amount_to_be_repaid));
        Bundle arguments4 = getArguments();
        QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData = arguments4 != null ? (QueryLoanDialogPopUpsBean.CashMarketingNotifyOnlyAData) arguments4.getParcelable("extra_data") : null;
        this.f29946C = cashMarketingNotifyOnlyAData != null ? cashMarketingNotifyOnlyAData.getOutstandingAccounts() : null;
        AbstractC0511h.f7089a.richText(textView4, getString(p116hb.f.cs_cl_repay_loan_increase, Pa.r0.V1(Pa.r0.B((cashMarketingNotifyOnlyAData == null || (mayBeIncreaseAmount2 = cashMarketingNotifyOnlyAData.getMayBeIncreaseAmount()) == null) ? 0L : mayBeIncreaseAmount2.longValue(), true))), Pa.r0.V1(Pa.r0.B((cashMarketingNotifyOnlyAData == null || (mayBeIncreaseAmount = cashMarketingNotifyOnlyAData.getMayBeIncreaseAmount()) == null) ? 0L : mayBeIncreaseAmount.longValue(), true)), new C0500c(this, 7));
        long jLongValue4 = (cashMarketingNotifyOnlyAData == null || (repaymentDate2 = cashMarketingNotifyOnlyAData.getRepaymentDate()) == null) ? 0L : repaymentDate2.longValue();
        Calendar calendar5 = Calendar.getInstance();
        calendar5.setTime(new Date(jLongValue4));
        calendar5.set(11, 0);
        calendar5.set(12, 0);
        calendar5.set(13, 0);
        calendar5.set(14, 0);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(11, 0);
        calendar6.set(12, 0);
        calendar6.set(13, 0);
        calendar6.set(14, 0);
        long jFloor3 = (long) Math.floor((calendar5.getTimeInMillis() - calendar6.getTimeInMillis()) / ((double) 86400000));
        textView2.setText(Pa.r0.V1(Pa.r0.B((cashMarketingNotifyOnlyAData == null || (amountToBeRepaid = cashMarketingNotifyOnlyAData.getAmountToBeRepaid()) == null) ? 0L : amountToBeRepaid.longValue(), true)));
        textView3.setText(j(Long.valueOf((cashMarketingNotifyOnlyAData == null || (repaymentDate = cashMarketingNotifyOnlyAData.getRepaymentDate()) == null) ? 0L : repaymentDate.longValue()), cashMarketingNotifyOnlyAData != null ? cashMarketingNotifyOnlyAData.getOverdueDays() : null, cashMarketingNotifyOnlyAData != null ? cashMarketingNotifyOnlyAData.getOverdueFee() : null));
        imageView2.setImageResource(jFloor3 == 0 ? p116hb.b.cs_cl_calendar_red_icon : p116hb.b.cs_cl_calendar_yellow_icon);
        p220oa.h.s(imageView2, jFloor3 >= 0);
        Intrinsics.e(relativeLayout);
        p220oa.h.s(relativeLayout, false);
        imageView = imageView;
        view = ppButton;
        Intrinsics.e(view);
        final int i11 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLLimitedTimeBenefitsDialogFragment f29977b;

            {
                this.f29977b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = this.f29977b;
                switch (i11) {
                    case 0:
                        List list = cLLimitedTimeBenefitsDialogFragment.f29946C;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                OutstandingAccount outstandingAccount = (OutstandingAccount) list.get(0);
                                Integer num = outstandingAccount.accountType;
                                if (num != null && num.intValue() == 6) {
                                    Long l5 = outstandingAccount.billOutstandingAmount;
                                    if ((l5 != null ? l5.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(cLLimitedTimeBenefitsDialogFragment.getContext());
                                    }
                                }
                                Integer num2 = outstandingAccount.accountType;
                                if (num2 != null && num2.intValue() == 7) {
                                    Long l6 = outstandingAccount.billOutstandingAmount;
                                    if ((l6 != null ? l6.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("cardNo", outstandingAccount.cardNo);
                                        bundle.putString("loanProduct", outstandingAccount.loanProduct);
                                        bundle.putBoolean("repayAllFlag", false);
                                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanRepayHome");
                                    }
                                }
                                Integer num3 = outstandingAccount.accountType;
                                if (num3 != null && num3.intValue() == 9) {
                                    Long l8 = outstandingAccount.billOutstandingAmount;
                                    if ((l8 != null ? l8.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("cardNo", outstandingAccount.cardNo);
                                        bundle2.putString("loanProduct", outstandingAccount.loanProduct);
                                        bundle2.putBoolean("repayAllFlag", false);
                                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanRepayHome");
                                    }
                                }
                            }
                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
                            break;
                        }
                        break;
                    default:
                        CLLimitedTimeBenefitsDialogFragment.a aVar = CLLimitedTimeBenefitsDialogFragment.f29945H;
                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                        break;
                }
            }
        }, view);
        Intrinsics.e(imageView);
        final int i12 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLLimitedTimeBenefitsDialogFragment f29977b;

            {
                this.f29977b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragment = this.f29977b;
                switch (i12) {
                    case 0:
                        List list = cLLimitedTimeBenefitsDialogFragment.f29946C;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                OutstandingAccount outstandingAccount = (OutstandingAccount) list.get(0);
                                Integer num = outstandingAccount.accountType;
                                if (num != null && num.intValue() == 6) {
                                    Long l5 = outstandingAccount.billOutstandingAmount;
                                    if ((l5 != null ? l5.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(cLLimitedTimeBenefitsDialogFragment.getContext());
                                    }
                                }
                                Integer num2 = outstandingAccount.accountType;
                                if (num2 != null && num2.intValue() == 7) {
                                    Long l6 = outstandingAccount.billOutstandingAmount;
                                    if ((l6 != null ? l6.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("cardNo", outstandingAccount.cardNo);
                                        bundle.putString("loanProduct", outstandingAccount.loanProduct);
                                        bundle.putBoolean("repayAllFlag", false);
                                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanRepayHome");
                                    }
                                }
                                Integer num3 = outstandingAccount.accountType;
                                if (num3 != null && num3.intValue() == 9) {
                                    Long l8 = outstandingAccount.billOutstandingAmount;
                                    if ((l8 != null ? l8.longValue() : -1L) > 0) {
                                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("cardNo", outstandingAccount.cardNo);
                                        bundle2.putString("loanProduct", outstandingAccount.loanProduct);
                                        bundle2.putBoolean("repayAllFlag", false);
                                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanRepayHome");
                                    }
                                }
                            }
                            cLLimitedTimeBenefitsDialogFragment.dismiss();
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
                            break;
                        }
                        break;
                    default:
                        CLLimitedTimeBenefitsDialogFragment.a aVar = CLLimitedTimeBenefitsDialogFragment.f29945H;
                        cLLimitedTimeBenefitsDialogFragment.dismiss();
                        break;
                }
            }
        }, imageView);
        return baseDialog;
    }

    public final SpannableStringBuilder j(Long l5, Integer num, Long l6) {
        String str;
        long jLongValue = l5 != null ? l5.longValue() : 0L;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(jLongValue));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long jFloor = (long) Math.floor((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((double) 86400000));
        if (jFloor == 0) {
            return new SpanUtils().append(getString(p116hb.f.cs_cl_due_date, Pa.r0.X1(l5, "MMM dd"), "(Today)")).setForegroundColor(requireContext().getColor(L6.b.ppColorError)).create();
        }
        if (jFloor <= 0) {
            return C0.G.i("Overdue ").setForegroundColor(requireContext().getColor(L6.b.ppColorTextPrimary)).append(num + " ").setForegroundColor(requireContext().getColor(L6.b.ppColorError)).append(((num != null ? num.intValue() : 0) > 1 ? "days" : "day").concat(",Overdue fee ")).setForegroundColor(requireContext().getColor(L6.b.ppColorTextPrimary)).append(Pa.r0.V1(Pa.r0.B(l6 != null ? l6.longValue() : 0L, true))).setForegroundColor(requireContext().getColor(L6.b.ppColorError)).create();
        }
        SpanUtils spanUtils = new SpanUtils();
        int i7 = p116hb.f.cs_cl_due_date;
        String strX1 = Pa.r0.X1(l5, "MMM dd");
        if (jFloor <= 3) {
            str = "(In " + jFloor + " " + (jFloor > 1 ? "Days" : "Day") + ")";
        } else {
            str = "";
        }
        return spanUtils.append(getString(i7, strX1, str)).setForegroundColor(requireContext().getColor(L6.b.ppColorWarning)).create();
    }
}
