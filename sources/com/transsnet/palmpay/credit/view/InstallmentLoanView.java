package com.transsnet.palmpay.credit.view;

import C0.G;
import E.AbstractC0198c;
import L6.b;
import Pa.r0;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.bean.resp.CashRepaymentInfo;
import com.transsnet.palmpay.credit.bean.resp.CurrentRepaymentDetail;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanCardInfo;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.view.InstallmentLoanView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001RB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010 \u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u001d\u0010#\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u001d\u0010&\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011R\u001d\u0010)\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u0011R\u001d\u0010,\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010\u0011R\u001d\u0010/\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b.\u0010\u0019R\u001d\u00102\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u001d\u00107\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0019R\u001d\u0010=\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011R\u001d\u0010@\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u000f\u001a\u0004\b?\u0010\u0011R\u001d\u0010C\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u000f\u001a\u0004\bB\u0010\u0011R\u001d\u0010F\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u000f\u001a\u0004\bE\u0010\u0011R\u001d\u0010I\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u000f\u001a\u0004\bH\u0010\u0011R\u001d\u0010N\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u000f\u001a\u0004\bL\u0010MR\u001d\u0010Q\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u000f\u001a\u0004\bP\u0010M¨\u0006S"}, d2 = {"Lcom/transsnet/palmpay/credit/view/InstallmentLoanView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/transsnet/palmpay/credit/view/InstallmentLoanView$OnButtonClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnButtonClickListener", "(Lcom/transsnet/palmpay/credit/view/InstallmentLoanView$OnButtonClickListener;)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTvLoanTerms", "()Landroid/widget/TextView;", "tvLoanTerms", "b", "getInstallment_ifJointDebit", "installment_ifJointDebit", "Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "c", "getRtvBorrow", "()Lcom/transsnet/palmpay/custom_view/RoundedTextView;", "rtvBorrow", "d", "getTvFrozenReason", "tvFrozenReason", "e", "getTvDailyInterest", "tvDailyInterest", "f", "getTvLoanPeriodDays", "tvLoanPeriodDays", "g", "getTvLoanPeriod", "tvLoanPeriod", "i", "getTvLoanPeriodTitle", "tvLoanPeriodTitle", "j", "getTvLoanableAmount", "tvLoanableAmount", "o", "getRtvFrozen", "rtvFrozen", "p", "getTvLoanableAmountTitle", "tvLoanableAmountTitle", "Landroidx/constraintlayout/widget/ConstraintLayout;", "t", "getLayoutContent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutContent", "v", "getRtvRepay", "rtvRepay", "w", "getTvRepaymentDate", "tvRepaymentDate", "A", "getTvDueDate", "tvDueDate", "B", "getTvDueDateTitle", "tvDueDateTitle", "C", "getTvCurrentOutstandingAmount", "tvCurrentOutstandingAmount", "H", "getTvCurrentOutstandingTitle", "tvCurrentOutstandingTitle", "Landroid/view/ViewStub;", "L", "getViewStubWithOutstanding", "()Landroid/view/ViewStub;", "viewStubWithOutstanding", "M", "getViewStubWithoutOutstanding", "viewStubWithoutOutstanding", "OnButtonClickListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstallmentLoanView extends FrameLayout {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f30770k0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30773C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30774H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30775L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30776M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OnButtonClickListener f30777Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f30784g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30786j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30788p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30790w;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/view/InstallmentLoanView$OnButtonClickListener;", "", "onBorrowClick", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnButtonClickListener {
        void onBorrowClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentLoanView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30778a = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i7) {
                    case 0:
                        int i10 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i11 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i12 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i13 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i14 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i10 = 2;
        this.f30779b = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i10) {
                    case 0:
                        int i11 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i12 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i13 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i14 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i11 = 3;
        this.f30780c = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i11) {
                    case 0:
                        int i12 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i13 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i14 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i12 = 4;
        this.f30781d = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i12) {
                    case 0:
                        int i13 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i14 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i13 = 5;
        this.f30782e = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i13) {
                    case 0:
                        int i14 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i14 = 6;
        this.f30783f = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i14) {
                    case 0:
                        int i15 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i15 = 7;
        this.f30784g = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i15) {
                    case 0:
                        int i16 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i16 = 8;
        this.f30785i = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i16) {
                    case 0:
                        int i17 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i17 = 9;
        this.f30786j = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i17) {
                    case 0:
                        int i18 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i18 = 10;
        this.f30787o = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i18) {
                    case 0:
                        int i19 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i19 = 11;
        this.f30788p = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i19) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i20 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i20 = 12;
        this.t = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i20) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i21 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i21 = 13;
        this.f30789v = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i21) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i22 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i22 = 14;
        this.f30790w = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i22) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i23 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i23 = 15;
        this.f30771A = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i23) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i24 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i24 = 16;
        this.f30772B = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i24) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i25 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i214 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i25 = 17;
        this.f30773C = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i25) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i26 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i214 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i215 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i26 = 18;
        this.f30774H = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i26) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i27 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i214 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i215 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i216 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i27 = 19;
        this.f30775L = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i27) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i28 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i214 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i215 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i216 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i217 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        final int i28 = 1;
        this.f30776M = C2131j.b(new Function0(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstallmentLoanView f3279b;

            {
                this.f3279b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallmentLoanView installmentLoanView = this.f3279b;
                switch (i28) {
                    case 0:
                        int i110 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanTerms);
                    case 1:
                        int i111 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithoutOutstanding);
                    case 2:
                        int i112 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.installment_ifJointDebit);
                    case 3:
                        int i113 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvBorrow);
                    case 4:
                        int i114 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvFrozenReason);
                    case 5:
                        int i115 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDailyInterest);
                    case 6:
                        int i116 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodDays);
                    case 7:
                        int i117 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriod);
                    case 8:
                        int i118 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanPeriodTitle);
                    case 9:
                        int i119 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmount);
                    case 10:
                        int i29 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvFrozen);
                    case 11:
                        int i210 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvLoanableAmountTitle);
                    case 12:
                        int i211 = InstallmentLoanView.f30770k0;
                        return (ConstraintLayout) installmentLoanView.findViewById(Ya.e.layoutContent);
                    case 13:
                        int i212 = InstallmentLoanView.f30770k0;
                        return (RoundedTextView) installmentLoanView.findViewById(Ya.e.rtvRepay);
                    case 14:
                        int i213 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvRepaymentDate);
                    case 15:
                        int i214 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDate);
                    case 16:
                        int i215 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvDueDateTitle);
                    case 17:
                        int i216 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingAmount);
                    case 18:
                        int i217 = InstallmentLoanView.f30770k0;
                        return (TextView) installmentLoanView.findViewById(Ya.e.tvCurrentOutstandingTitle);
                    default:
                        int i218 = InstallmentLoanView.f30770k0;
                        return (ViewStub) installmentLoanView.findViewById(Ya.e.viewStubWithOutstanding);
                }
            }
        });
        View.inflate(context, f.cs_cl_installment_loan_layout, this);
    }

    private final TextView getInstallment_ifJointDebit() {
        return (TextView) this.f30779b.getValue();
    }

    private final ConstraintLayout getLayoutContent() {
        return (ConstraintLayout) this.t.getValue();
    }

    private final RoundedTextView getRtvBorrow() {
        return (RoundedTextView) this.f30780c.getValue();
    }

    private final RoundedTextView getRtvFrozen() {
        return (RoundedTextView) this.f30787o.getValue();
    }

    private final RoundedTextView getRtvRepay() {
        return (RoundedTextView) this.f30789v.getValue();
    }

    private final TextView getTvCurrentOutstandingAmount() {
        return (TextView) this.f30773C.getValue();
    }

    private final TextView getTvCurrentOutstandingTitle() {
        return (TextView) this.f30774H.getValue();
    }

    private final TextView getTvDailyInterest() {
        return (TextView) this.f30782e.getValue();
    }

    private final TextView getTvDueDate() {
        return (TextView) this.f30771A.getValue();
    }

    private final TextView getTvDueDateTitle() {
        return (TextView) this.f30772B.getValue();
    }

    private final TextView getTvFrozenReason() {
        return (TextView) this.f30781d.getValue();
    }

    private final TextView getTvLoanPeriod() {
        return (TextView) this.f30784g.getValue();
    }

    private final TextView getTvLoanPeriodDays() {
        return (TextView) this.f30783f.getValue();
    }

    private final TextView getTvLoanPeriodTitle() {
        return (TextView) this.f30785i.getValue();
    }

    private final TextView getTvLoanTerms() {
        return (TextView) this.f30778a.getValue();
    }

    private final TextView getTvLoanableAmount() {
        return (TextView) this.f30786j.getValue();
    }

    private final TextView getTvLoanableAmountTitle() {
        return (TextView) this.f30788p.getValue();
    }

    private final TextView getTvRepaymentDate() {
        return (TextView) this.f30790w.getValue();
    }

    private final ViewStub getViewStubWithOutstanding() {
        return (ViewStub) this.f30775L.getValue();
    }

    private final ViewStub getViewStubWithoutOutstanding() {
        return (ViewStub) this.f30776M.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:183:0x0291  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:200:0x034a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0475  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, com.transsnet.palmpay.custom_view.RoundedTextView] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [int] */
    /* JADX WARN: Type inference failed for: r9v30 */
    public final void a(final InstallmentLoanMainPageData installmentLoanMainPageData, final CLMainData cLMainData) {
        InstallmentLoanCardInfo installmentLoanCardInfo;
        Integer accountStatus;
        final boolean z3;
        InstallmentLoanCardInfo installmentLoanCardInfo2;
        Integer accountStatus2;
        Integer accountStatus3;
        CLMainCreditCard creditCard;
        Integer accountStatus4;
        CLMainCreditCard creditCard2;
        Integer accountStatus5;
        CLMainCreditCard creditCard3;
        Integer accountStatus6;
        Integer accountStatus7;
        CLMainCashLoanBill currentCashLoanBill;
        CardRiskLevelResp riskLevelResp;
        CardRiskLevelResp riskLevelResp2;
        CardRiskLevelResp riskLevelResp3;
        Long availableBalance;
        CurrentRepaymentDetail currentRepaymentDetail;
        long jD;
        TextView tvRepaymentDate;
        TextView tvRepaymentDate2;
        TextView tvRepaymentDate3;
        SpannableStringBuilder spannableStringBuilderCreate;
        Long repaymentDate;
        Integer accountStatus8;
        Integer accountStatus9;
        Long repaymentDate2;
        Long repaymentDate3;
        CashRepaymentInfo cashRepaymentInfo;
        Long outstandingAmount;
        String str;
        CashRepaymentInfo cashRepaymentInfo2;
        Long outstandingAmount2;
        String string;
        CashRepaymentInfo cashRepaymentInfo3;
        Long outstandingAmount3;
        Long outStandingAmount;
        Long outStandingAmount2;
        Long outStandingAmount3;
        Integer accountStatus10;
        Integer applyStatus;
        Integer applyStatus2;
        Integer applyStatus3;
        final boolean z8 = false;
        setVisibility((installmentLoanMainPageData == null || ((applyStatus = installmentLoanMainPageData.getApplyStatus()) != null && applyStatus.intValue() == -1) || (((applyStatus2 = installmentLoanMainPageData.getApplyStatus()) != null && applyStatus2.intValue() == 0) || ((applyStatus3 = installmentLoanMainPageData.getApplyStatus()) != null && applyStatus3.intValue() == 2))) ? 8 : 0);
        if (installmentLoanMainPageData != null) {
            InstallmentLoanCardInfo installmentLoanCardInfo3 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
            boolean z10 = true;
            boolean z11 = ((installmentLoanCardInfo3 == null || (accountStatus10 = installmentLoanCardInfo3.getAccountStatus()) == null || accountStatus10.intValue() != 5) && ((installmentLoanCardInfo = installmentLoanMainPageData.getInstallmentLoanCardInfo()) == null || (accountStatus = installmentLoanCardInfo.getAccountStatus()) == null || accountStatus.intValue() != 4)) ? false : true;
            ViewStub viewStubWithoutOutstanding = getViewStubWithoutOutstanding();
            long jLongValue = 0;
            if (viewStubWithoutOutstanding != null) {
                InstallmentLoanCardInfo installmentLoanCardInfo4 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                viewStubWithoutOutstanding.setVisibility((((installmentLoanCardInfo4 == null || (outStandingAmount3 = installmentLoanCardInfo4.getOutStandingAmount()) == null) ? 0L : outStandingAmount3.longValue()) == 0 || z11) ? 0 : 8);
            }
            ViewStub viewStubWithOutstanding = getViewStubWithOutstanding();
            if (viewStubWithOutstanding != null) {
                InstallmentLoanCardInfo installmentLoanCardInfo5 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                viewStubWithOutstanding.setVisibility((((installmentLoanCardInfo5 == null || (outStandingAmount2 = installmentLoanCardInfo5.getOutStandingAmount()) == null) ? 0L : outStandingAmount2.longValue()) <= 0 || z11) ? 8 : 0);
            }
            InstallmentLoanCardInfo installmentLoanCardInfo6 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
            if (((installmentLoanCardInfo6 == null || (outStandingAmount = installmentLoanCardInfo6.getOutStandingAmount()) == null) ? 0L : outStandingAmount.longValue()) == 0 || z11) {
                TextView tvLoanableAmount = getTvLoanableAmount();
                if (tvLoanableAmount != null) {
                    InstallmentLoanCardInfo installmentLoanCardInfo7 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                    tvLoanableAmount.setText(r0.C(r0.E((installmentLoanCardInfo7 == null || (availableBalance = installmentLoanCardInfo7.getAvailableBalance()) == null) ? 0L : availableBalance.longValue()), true));
                }
                TextView tvLoanPeriod = getTvLoanPeriod();
                String termSpanUnit = null;
                if (tvLoanPeriod != null) {
                    LoanConfig loanConfig = installmentLoanMainPageData.getLoanConfig();
                    tvLoanPeriod.setText(String.valueOf(loanConfig != null ? loanConfig.getMaxLoanDays() : null));
                }
                TextView tvDailyInterest = getTvDailyInterest();
                if (tvDailyInterest != null) {
                    SpanUtils foregroundColor = new SpanUtils().append(getContext().getString(g.cs_daily_interest)).setForegroundColor(getContext().getColor(p.cv_color_906948));
                    LoanConfig loanConfig2 = installmentLoanMainPageData.getLoanConfig();
                    G.w(getContext(), b.ppColorWarning, d0.j(" ", loanConfig2 != null ? loanConfig2.getLoanRatioString() : null, foregroundColor), tvDailyInterest);
                }
                TextView tvLoanTerms = getTvLoanTerms();
                if (tvLoanTerms != null) {
                    Context context = getContext();
                    int i7 = g.cs_repay_loan_terms;
                    LoanConfig loanConfig3 = installmentLoanMainPageData.getLoanConfig();
                    Integer term = (loanConfig3 == null || (riskLevelResp3 = loanConfig3.getRiskLevelResp()) == null) ? null : riskLevelResp3.getTerm();
                    LoanConfig loanConfig4 = installmentLoanMainPageData.getLoanConfig();
                    Integer termSpan = (loanConfig4 == null || (riskLevelResp2 = loanConfig4.getRiskLevelResp()) == null) ? null : riskLevelResp2.getTermSpan();
                    LoanConfig loanConfig5 = installmentLoanMainPageData.getLoanConfig();
                    if (loanConfig5 != null && (riskLevelResp = loanConfig5.getRiskLevelResp()) != null) {
                        termSpanUnit = riskLevelResp.getTermSpanUnit();
                    }
                    tvLoanTerms.setText(context.getString(i7, term, termSpan + (Intrinsics.c(termSpanUnit, "D") ? " days/term" : "month/term")));
                }
                Integer ifJointDebit = installmentLoanMainPageData.getIfJointDebit();
                if (ifJointDebit != null && ifJointDebit.intValue() == 0) {
                    if (((cLMainData == null || (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill.getOutstandingAmount()) > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                InstallmentLoanCardInfo installmentLoanCardInfo8 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                if ((installmentLoanCardInfo8 != null && (accountStatus7 = installmentLoanCardInfo8.getAccountStatus()) != null && accountStatus7.intValue() == 5) || ((installmentLoanCardInfo2 = installmentLoanMainPageData.getInstallmentLoanCardInfo()) != null && (accountStatus2 = installmentLoanCardInfo2.getAccountStatus()) != null && accountStatus2.intValue() == 4)) {
                    z8 = true;
                }
                TextView tvFrozenReason = getTvFrozenReason();
                if (tvFrozenReason != null) {
                    tvFrozenReason.setText(getContext().getString(g.cs_repayment_late_than_due_date, installmentLoanMainPageData.getAccountPrompt()));
                }
                TextView tvFrozenReason2 = getTvFrozenReason();
                if (tvFrozenReason2 != null) {
                    tvFrozenReason2.setVisibility((!z8 || TextUtils.isEmpty(installmentLoanMainPageData.getAccountPrompt())) ? 8 : 0);
                }
                ?? tvDailyInterest2 = getTvDailyInterest();
                if (tvDailyInterest2 != 0) {
                    tvDailyInterest2.setVisibility((z8 || !TextUtils.isEmpty(installmentLoanMainPageData.getAccountPrompt())) ? 8 : z8);
                }
                ConstraintLayout layoutContent = getLayoutContent();
                if (layoutContent != null) {
                    layoutContent.setBackgroundResource(z8 ? d.cs_cl_installment_loan_disabled_bg : d.cs_cl_installment_loan_bg);
                }
                TextView tvLoanTerms2 = getTvLoanTerms();
                if (tvLoanTerms2 != null) {
                    tvLoanTerms2.setBackgroundResource(z8 ? d.cs_cl_installment_loan_decoration_frozen : d.cs_cl_installment_loan_decoration);
                }
                TextView tvLoanTerms3 = getTvLoanTerms();
                if (tvLoanTerms3 != null) {
                    tvLoanTerms3.setTextColor(getContext().getColor(z8 ? Ya.b.cs_cl_installment_loan_terms_disabled_text_color : Ya.b.cs_cl_installment_loan_terms_text_color));
                }
                TextView tvLoanableAmountTitle = getTvLoanableAmountTitle();
                if (tvLoanableAmountTitle != null) {
                    tvLoanableAmountTitle.setTextColor(getContext().getColor(z8 ? Ya.b.cs_installment_loan_main_page_disabled_text_color : b.ppColorTextPrimary));
                }
                TextView tvLoanableAmount2 = getTvLoanableAmount();
                if (tvLoanableAmount2 != null) {
                    tvLoanableAmount2.setTextColor(getContext().getColor(z8 ? Ya.b.cs_installment_loan_main_page_disabled_text_color : b.ppColorTextPrimary));
                }
                TextView tvLoanPeriodTitle = getTvLoanPeriodTitle();
                if (tvLoanPeriodTitle != null) {
                    tvLoanPeriodTitle.setTextColor(getContext().getColor(z8 ? Ya.b.cs_installment_loan_main_page_disabled_text_color : b.ppColorTextPrimary));
                }
                TextView tvLoanPeriod2 = getTvLoanPeriod();
                if (tvLoanPeriod2 != null) {
                    tvLoanPeriod2.setTextColor(getContext().getColor(z8 ? Ya.b.cs_installment_loan_main_page_disabled_text_color : b.ppColorTextPrimary));
                }
                TextView tvLoanPeriodDays = getTvLoanPeriodDays();
                if (tvLoanPeriodDays != null) {
                    tvLoanPeriodDays.setTextColor(getContext().getColor(z8 ? Ya.b.cs_installment_loan_main_page_disabled_text_color : b.ppColorTextPrimary));
                }
                RoundedTextView rtvBorrow = getRtvBorrow();
                if (rtvBorrow != null) {
                    rtvBorrow.setRoundedBackgroundColor(getContext().getColor((z8 || z3 || !(cLMainData == null || (creditCard3 = cLMainData.getCreditCard()) == null || (accountStatus6 = creditCard3.getAccountStatus()) == null || accountStatus6.intValue() != 1)) ? Ya.b.cs_installment_loan_main_page_disabled_background_color : Ya.b.cs_installment_loan_main_page_repay_background_color));
                }
                RoundedTextView rtvBorrow2 = getRtvBorrow();
                if (rtvBorrow2 != null) {
                    rtvBorrow2.setTextColor(getContext().getColor((z8 || z3 || !(cLMainData == null || (creditCard2 = cLMainData.getCreditCard()) == null || (accountStatus5 = creditCard2.getAccountStatus()) == null || accountStatus5.intValue() != 1)) ? Ya.b.cs_installment_loan_main_page_borrow_disabled_text_color : Ya.b.cs_installment_loan_main_page_borrow_text_color));
                }
                TextView installment_ifJointDebit = getInstallment_ifJointDebit();
                if (installment_ifJointDebit != null) {
                    if (!z3 && (cLMainData == null || (creditCard = cLMainData.getCreditCard()) == null || (accountStatus4 = creditCard.getAccountStatus()) == null || accountStatus4.intValue() != 1)) {
                        z10 = z8;
                    }
                    h.s(installment_ifJointDebit, z10);
                }
                ?? rtvFrozen = getRtvFrozen();
                if (rtvFrozen != 0) {
                    rtvFrozen.setVisibility(z8 ? z8 : 8);
                }
                RoundedTextView rtvFrozen2 = getRtvFrozen();
                if (rtvFrozen2 != null) {
                    InstallmentLoanCardInfo installmentLoanCardInfo9 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                    rtvFrozen2.setText((installmentLoanCardInfo9 == null || (accountStatus3 = installmentLoanCardInfo9.getAccountStatus()) == null || accountStatus3.intValue() != 4) ? getContext().getString(g.cs_disabled) : getContext().getString(g.cs_frozen));
                }
                RoundedTextView rtvBorrow3 = getRtvBorrow();
                if (rtvBorrow3 != null) {
                    h.l(new View.OnClickListener() { // from class: Gb.l
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Integer accountStatus11;
                            CLMainData cLMainData2;
                            CLMainCreditCard creditCard4;
                            Integer accountStatus12;
                            int i10 = InstallmentLoanView.f30770k0;
                            if (!z8 && !z3 && ((cLMainData2 = cLMainData) == null || (creditCard4 = cLMainData2.getCreditCard()) == null || (accountStatus12 = creditCard4.getAccountStatus()) == null || accountStatus12.intValue() != 1)) {
                                InstallmentLoanView.OnButtonClickListener onButtonClickListener = this.f30777Q;
                                if (onButtonClickListener != null) {
                                    onButtonClickListener.onBorrowClick();
                                    return;
                                }
                                return;
                            }
                            InstallmentLoanCardInfo installmentLoanCardInfo10 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                            if (installmentLoanCardInfo10 == null || (accountStatus11 = installmentLoanCardInfo10.getAccountStatus()) == null || accountStatus11.intValue() != 4) {
                                return;
                            }
                            com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/unfreeze_activity");
                        }
                    }, rtvBorrow3);
                    return;
                }
                return;
            }
            TextView tvCurrentOutstandingTitle = getTvCurrentOutstandingTitle();
            if (tvCurrentOutstandingTitle != null) {
                CurrentRepaymentDetail currentRepaymentDetail2 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                if (currentRepaymentDetail2 != null ? Intrinsics.c(currentRepaymentDetail2.getCurrentCleared(), Boolean.TRUE) : false) {
                    CurrentRepaymentDetail currentRepaymentDetail3 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                    if (((currentRepaymentDetail3 == null || (cashRepaymentInfo3 = currentRepaymentDetail3.getCashRepaymentInfo()) == null || (outstandingAmount3 = cashRepaymentInfo3.getOutstandingAmount()) == null) ? 0L : outstandingAmount3.longValue()) > 0) {
                        string = "Uncoming Outstanding";
                    } else {
                        string = getContext().getString(g.cs_current_outstanding);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                } else {
                    string = getContext().getString(g.cs_current_outstanding);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                tvCurrentOutstandingTitle.setText(string);
            }
            TextView tvDueDateTitle = getTvDueDateTitle();
            if (tvDueDateTitle != null) {
                CurrentRepaymentDetail currentRepaymentDetail4 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                if (currentRepaymentDetail4 != null ? Intrinsics.c(currentRepaymentDetail4.getCurrentCleared(), Boolean.TRUE) : false) {
                    CurrentRepaymentDetail currentRepaymentDetail5 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                    if (((currentRepaymentDetail5 == null || (cashRepaymentInfo2 = currentRepaymentDetail5.getCashRepaymentInfo()) == null || (outstandingAmount2 = cashRepaymentInfo2.getOutstandingAmount()) == null) ? 0L : outstandingAmount2.longValue()) > 0) {
                        str = "Next Due Date";
                    } else {
                        String string2 = getContext().getString(g.cs_due_date_title);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        str = string2;
                    }
                } else {
                    String string3 = getContext().getString(g.cs_due_date_title);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    str = string3;
                }
                tvDueDateTitle.setText(str);
            }
            TextView tvCurrentOutstandingAmount = getTvCurrentOutstandingAmount();
            if (tvCurrentOutstandingAmount != null) {
                CurrentRepaymentDetail currentRepaymentDetail6 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                tvCurrentOutstandingAmount.setText(r0.V1(r0.B((currentRepaymentDetail6 == null || (cashRepaymentInfo = currentRepaymentDetail6.getCashRepaymentInfo()) == null || (outstandingAmount = cashRepaymentInfo.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue(), true)));
            }
            TextView tvDueDate = getTvDueDate();
            if (tvDueDate != null) {
                CurrentRepaymentDetail currentRepaymentDetail7 = installmentLoanMainPageData.getCurrentRepaymentDetail();
                tvDueDate.setText(r0.X1(Long.valueOf((currentRepaymentDetail7 == null || (repaymentDate3 = currentRepaymentDetail7.getRepaymentDate()) == null) ? 0L : repaymentDate3.longValue()), "MMM dd"));
            }
            CurrentRepaymentDetail currentRepaymentDetail8 = installmentLoanMainPageData.getCurrentRepaymentDetail();
            long jZ = AbstractC0198c.z((currentRepaymentDetail8 == null || (repaymentDate2 = currentRepaymentDetail8.getRepaymentDate()) == null) ? 0L : repaymentDate2.longValue());
            InstallmentLoanCardInfo installmentLoanCardInfo10 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
            if ((installmentLoanCardInfo10 == null || (accountStatus9 = installmentLoanCardInfo10.getAccountStatus()) == null || accountStatus9.intValue() != 1) ? false : true) {
                currentRepaymentDetail = installmentLoanMainPageData.getCurrentRepaymentDetail();
                if (currentRepaymentDetail != null && (repaymentDate = currentRepaymentDetail.getRepaymentDate()) != null) {
                    jLongValue = repaymentDate.longValue();
                }
                jD = AbstractC0198c.D(jLongValue);
                tvRepaymentDate = getTvRepaymentDate();
                if (tvRepaymentDate != null) {
                    tvRepaymentDate.setVisibility(0);
                }
                tvRepaymentDate2 = getTvRepaymentDate();
                if (tvRepaymentDate2 != null) {
                    if (jD > 1) {
                        spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).setBold().append(" days overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).create();
                        Intrinsics.e(spannableStringBuilderCreate);
                    } else {
                        spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).setBold().append(" day overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).create();
                        Intrinsics.e(spannableStringBuilderCreate);
                    }
                    tvRepaymentDate2.setText(spannableStringBuilderCreate);
                }
                b(true, new SpannableStringBuilder(getContext().getString(g.cs_cl_oc_repay)));
                tvRepaymentDate3 = getTvRepaymentDate();
                if (tvRepaymentDate3 != null) {
                    tvRepaymentDate3.setBackgroundResource(d.cs_btn_overdue_state_2);
                }
            } else {
                InstallmentLoanCardInfo installmentLoanCardInfo11 = installmentLoanMainPageData.getInstallmentLoanCardInfo();
                if ((installmentLoanCardInfo11 == null || (accountStatus8 = installmentLoanCardInfo11.getAccountStatus()) == null || accountStatus8.intValue() != 1) ? false : true) {
                    currentRepaymentDetail = installmentLoanMainPageData.getCurrentRepaymentDetail();
                    if (currentRepaymentDetail != null) {
                        jLongValue = repaymentDate.longValue();
                    }
                    jD = AbstractC0198c.D(jLongValue);
                    tvRepaymentDate = getTvRepaymentDate();
                    if (tvRepaymentDate != null) {
                        tvRepaymentDate.setVisibility(0);
                    }
                    tvRepaymentDate2 = getTvRepaymentDate();
                    if (tvRepaymentDate2 != null) {
                        if (jD > 1) {
                            spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).setBold().append(" days overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).create();
                            Intrinsics.e(spannableStringBuilderCreate);
                        } else {
                            spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(jD)).setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).setBold().append(" day overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(Ya.b.cs_overdue_txt_color)).create();
                            Intrinsics.e(spannableStringBuilderCreate);
                        }
                        tvRepaymentDate2.setText(spannableStringBuilderCreate);
                    }
                    b(true, new SpannableStringBuilder(getContext().getString(g.cs_cl_oc_repay)));
                    tvRepaymentDate3 = getTvRepaymentDate();
                    if (tvRepaymentDate3 != null) {
                        tvRepaymentDate3.setBackgroundResource(d.cs_btn_overdue_state_2);
                    }
                } else if (jZ <= 3) {
                    TextView tvRepaymentDate4 = getTvRepaymentDate();
                    if (tvRepaymentDate4 != null) {
                        tvRepaymentDate4.setVisibility(0);
                    }
                    TextView tvRepaymentDate5 = getTvRepaymentDate();
                    if (tvRepaymentDate5 != null) {
                        SpannableStringBuilder spannableStringBuilderCreate2 = new SpanUtils().append("Auto Repay Occurs on Due Date (" + jZ + " days)").setForegroundColor(getContext().getColor(Ya.b.cs_overdue_today_txt_color)).create();
                        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate2, "create(...)");
                        tvRepaymentDate5.setText(spannableStringBuilderCreate2);
                    }
                    b(false, new SpannableStringBuilder(getContext().getString(g.cs_pre_repay)));
                    TextView tvRepaymentDate6 = getTvRepaymentDate();
                    if (tvRepaymentDate6 != null) {
                        tvRepaymentDate6.setTextColor(getContext().getColor(Ya.b.cs_overdue_today_txt_color));
                    }
                    TextView tvRepaymentDate7 = getTvRepaymentDate();
                    if (tvRepaymentDate7 != null) {
                        tvRepaymentDate7.setBackgroundResource(d.cs_btn_overdue_state_1);
                    }
                } else {
                    b(false, new SpannableStringBuilder(getContext().getString(g.cs_cl_repay_before_due)));
                    TextView tvRepaymentDate8 = getTvRepaymentDate();
                    if (tvRepaymentDate8 != null) {
                        tvRepaymentDate8.setVisibility(8);
                    }
                }
            }
            RoundedTextView rtvRepay = getRtvRepay();
            if (rtvRepay != null) {
                final int i10 = 0;
                h.l(new View.OnClickListener() { // from class: Gb.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CashRepaymentInfo cashRepaymentInfo4;
                        CashRepaymentInfo cashRepaymentInfo5;
                        CashRepaymentInfo cashRepaymentInfo6;
                        CashRepaymentInfo cashRepaymentInfo7;
                        CashRepaymentInfo cashRepaymentInfo8;
                        Long billId = null;
                        loanProduct = null;
                        String loanProduct = null;
                        billId = null;
                        InstallmentLoanMainPageData installmentLoanMainPageData2 = installmentLoanMainPageData;
                        switch (i10) {
                            case 0:
                                int i11 = InstallmentLoanView.f30770k0;
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                                CurrentRepaymentDetail currentRepaymentDetail9 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                if (currentRepaymentDetail9 != null && (cashRepaymentInfo4 = currentRepaymentDetail9.getCashRepaymentInfo()) != null) {
                                    billId = cashRepaymentInfo4.getBillId();
                                }
                                postcardBuild.withString("cl_repayment_bill_id", String.valueOf(billId)).withString("cl_repayment_loan_product", "INSTALLMENT_LOAN").withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                                break;
                            default:
                                int i12 = InstallmentLoanView.f30770k0;
                                Bundle bundle = new Bundle();
                                CurrentRepaymentDetail currentRepaymentDetail10 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("billId", String.valueOf((currentRepaymentDetail10 == null || (cashRepaymentInfo8 = currentRepaymentDetail10.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo8.getBillId()));
                                CurrentRepaymentDetail currentRepaymentDetail11 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("accountType", (currentRepaymentDetail11 == null || (cashRepaymentInfo7 = currentRepaymentDetail11.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo7.getAccountType());
                                CurrentRepaymentDetail currentRepaymentDetail12 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("cardNo", (currentRepaymentDetail12 == null || (cashRepaymentInfo6 = currentRepaymentDetail12.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo6.getCardNo());
                                CurrentRepaymentDetail currentRepaymentDetail13 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                if (currentRepaymentDetail13 != null && (cashRepaymentInfo5 = currentRepaymentDetail13.getCashRepaymentInfo()) != null) {
                                    loanProduct = cashRepaymentInfo5.getLoanProduct();
                                }
                                bundle.putString("loanProduct", loanProduct);
                                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                                break;
                        }
                    }
                }, rtvRepay);
            }
            TextView tvCurrentOutstandingAmount2 = getTvCurrentOutstandingAmount();
            if (tvCurrentOutstandingAmount2 != null) {
                final int i11 = 1;
                h.l(new View.OnClickListener() { // from class: Gb.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CashRepaymentInfo cashRepaymentInfo4;
                        CashRepaymentInfo cashRepaymentInfo5;
                        CashRepaymentInfo cashRepaymentInfo6;
                        CashRepaymentInfo cashRepaymentInfo7;
                        CashRepaymentInfo cashRepaymentInfo8;
                        Long billId = null;
                        loanProduct = null;
                        String loanProduct = null;
                        billId = null;
                        InstallmentLoanMainPageData installmentLoanMainPageData2 = installmentLoanMainPageData;
                        switch (i11) {
                            case 0:
                                int i12 = InstallmentLoanView.f30770k0;
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                                CurrentRepaymentDetail currentRepaymentDetail9 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                if (currentRepaymentDetail9 != null && (cashRepaymentInfo4 = currentRepaymentDetail9.getCashRepaymentInfo()) != null) {
                                    billId = cashRepaymentInfo4.getBillId();
                                }
                                postcardBuild.withString("cl_repayment_bill_id", String.valueOf(billId)).withString("cl_repayment_loan_product", "INSTALLMENT_LOAN").withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                                break;
                            default:
                                int i13 = InstallmentLoanView.f30770k0;
                                Bundle bundle = new Bundle();
                                CurrentRepaymentDetail currentRepaymentDetail10 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("billId", String.valueOf((currentRepaymentDetail10 == null || (cashRepaymentInfo8 = currentRepaymentDetail10.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo8.getBillId()));
                                CurrentRepaymentDetail currentRepaymentDetail11 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("accountType", (currentRepaymentDetail11 == null || (cashRepaymentInfo7 = currentRepaymentDetail11.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo7.getAccountType());
                                CurrentRepaymentDetail currentRepaymentDetail12 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                bundle.putString("cardNo", (currentRepaymentDetail12 == null || (cashRepaymentInfo6 = currentRepaymentDetail12.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo6.getCardNo());
                                CurrentRepaymentDetail currentRepaymentDetail13 = installmentLoanMainPageData2.getCurrentRepaymentDetail();
                                if (currentRepaymentDetail13 != null && (cashRepaymentInfo5 = currentRepaymentDetail13.getCashRepaymentInfo()) != null) {
                                    loanProduct = cashRepaymentInfo5.getLoanProduct();
                                }
                                bundle.putString("loanProduct", loanProduct);
                                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                                break;
                        }
                    }
                }, tvCurrentOutstandingAmount2);
            }
        }
    }

    public final void b(boolean z3, SpannableStringBuilder spannableStringBuilder) {
        RoundedTextView rtvRepay = getRtvRepay();
        if (rtvRepay != null) {
            rtvRepay.setText(spannableStringBuilder);
        }
        if (z3) {
            RoundedTextView rtvRepay2 = getRtvRepay();
            if (rtvRepay2 != null) {
                rtvRepay2.setTextColor(getContext().getColor(Ya.b.cs_installment_loan_main_page_repay_text_color));
            }
            RoundedTextView rtvRepay3 = getRtvRepay();
            if (rtvRepay3 != null) {
                rtvRepay3.setRoundedBackgroundColor(getContext().getColor(Ya.b.cs_installment_loan_main_page_repay_background_color));
            }
            RoundedTextView rtvRepay4 = getRtvRepay();
            if (rtvRepay4 != null) {
                rtvRepay4.setRoundedBorderColor(getContext().getColor(Ya.b.cs_installment_loan_main_page_repay_background_color));
                return;
            }
            return;
        }
        RoundedTextView rtvRepay5 = getRtvRepay();
        if (rtvRepay5 != null) {
            rtvRepay5.setTextColor(getContext().getColor(Ya.b.cs_installment_loan_main_page_repay_border_color));
        }
        RoundedTextView rtvRepay6 = getRtvRepay();
        if (rtvRepay6 != null) {
            rtvRepay6.setRoundedBackgroundColor(getContext().getColor(p.transparent));
        }
        RoundedTextView rtvRepay7 = getRtvRepay();
        if (rtvRepay7 != null) {
            rtvRepay7.setRoundedBorderColor(getContext().getColor(Ya.b.cs_installment_loan_main_page_repay_border_color));
        }
    }

    public final void setOnButtonClickListener(@NotNull OnButtonClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30777Q = listener;
    }
}
