package com.transsnet.palmpay.credit.view;

import Bc.s;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/view/PhoneInstallmentLoanWaitPayView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneInstallmentLoanWaitPayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneInstallmentLoanWaitPayView.kt\ncom/transsnet/palmpay/credit/view/PhoneInstallmentLoanWaitPayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class PhoneInstallmentLoanWaitPayView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f30874a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInstallmentLoanWaitPayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInstallmentLoanWaitPayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PhoneInstallmentLoanWaitPayView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInstallmentLoanWaitPayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        View viewM;
        View viewM2;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f.cs_cl_phone_installment_loan_wait_pay_layout, this);
        int i10 = e.btnConfirmPay;
        TextView textView = (TextView) p059e1.a.m(i10, this);
        if (textView != null) {
            i10 = e.clMobileInstallment;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i10, this);
            if (constraintLayout != null) {
                i10 = e.clTotalOutstanding;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i10, this);
                if (constraintLayout2 != null) {
                    i10 = e.iv_bill_bottow;
                    if (((ImageView) p059e1.a.m(i10, this)) != null) {
                        i10 = e.ivBrand;
                        ImageView imageView = (ImageView) p059e1.a.m(i10, this);
                        if (imageView != null) {
                            i10 = e.ivBrandIcon;
                            ImageView imageView2 = (ImageView) p059e1.a.m(i10, this);
                            if (imageView2 != null) {
                                i10 = e.layoutDeviceActiveTime;
                                if (((LinearLayout) p059e1.a.m(i10, this)) != null) {
                                    i10 = e.layoutDeviceInfo;
                                    if (((ConstraintLayout) p059e1.a.m(i10, this)) != null) {
                                        i10 = e.layoutRepayOnTimeBanner;
                                        if (((LinearLayout) p059e1.a.m(i10, this)) != null) {
                                            i10 = e.rvRepaymentPlan;
                                            InnerRecyclerView innerRecyclerView = (InnerRecyclerView) p059e1.a.m(i10, this);
                                            if (innerRecyclerView != null) {
                                                i10 = e.tvBrand;
                                                TextView textView2 = (TextView) p059e1.a.m(i10, this);
                                                if (textView2 != null) {
                                                    i10 = e.tvContactAgent;
                                                    TextView textView3 = (TextView) p059e1.a.m(i10, this);
                                                    if (textView3 != null) {
                                                        i10 = e.tvDownPaymentAmount;
                                                        TextView textView4 = (TextView) p059e1.a.m(i10, this);
                                                        if (textView4 != null) {
                                                            i10 = e.tvDownPaymentTitle;
                                                            TextView textView5 = (TextView) p059e1.a.m(i10, this);
                                                            if (textView5 != null) {
                                                                i10 = e.tvMobilePriceLabel;
                                                                TextView textView6 = (TextView) p059e1.a.m(i10, this);
                                                                if (textView6 != null) {
                                                                    i10 = e.tvPriceAmount;
                                                                    TextView textView7 = (TextView) p059e1.a.m(i10, this);
                                                                    if (textView7 != null) {
                                                                        i10 = e.tvRepaymentTotalTerms;
                                                                        TextView textView8 = (TextView) p059e1.a.m(i10, this);
                                                                        if (textView8 != null) {
                                                                            i10 = e.tvTotalOutstandingAmount;
                                                                            TextView textView9 = (TextView) p059e1.a.m(i10, this);
                                                                            if (textView9 != null) {
                                                                                i10 = e.tvTotalOutstandingTitle;
                                                                                TextView textView10 = (TextView) p059e1.a.m(i10, this);
                                                                                if (textView10 != null && (viewM = p059e1.a.m((i10 = e.view_bill_top), this)) != null && (viewM2 = p059e1.a.m((i10 = e.viewDivider), this)) != null) {
                                                                                    this.f30874a = new s(this, textView, constraintLayout, constraintLayout2, imageView, imageView2, innerRecyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewM, viewM2);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i10)));
    }
}
