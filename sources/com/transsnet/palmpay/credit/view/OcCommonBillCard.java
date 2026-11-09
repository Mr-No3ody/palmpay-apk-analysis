package com.transsnet.palmpay.credit.view;

import A8.c;
import Ab.ViewOnClickListenerC0053e;
import C0.G;
import Ce.ViewOnClickListenerC0159a;
import E.AbstractC0198c;
import Gb.B;
import N8.q0;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.credit.bean.resp.CashRepaymentInfo;
import com.transsnet.palmpay.credit.bean.resp.CurrentRepaymentDetail;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanCardInfo;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001b\u0010\u001f\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010R\u001b\u0010\"\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010R\u001b\u0010%\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0010R\u001b\u0010(\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010\u0010R\u001b\u0010+\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u001d\u0010.\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010¨\u0006/"}, d2 = {"Lcom/transsnet/palmpay/credit/view/OcCommonBillCard;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/text/SpannableStringBuilder;", "getDueTodayContent", "()Landroid/text/SpannableStringBuilder;", "getDueInTomorrowContent", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getBill_detail_tv", "()Landroid/widget/TextView;", "bill_detail_tv", "b", "getView_tv", "view_tv", "Lcom/transsnet/adsdk/widgets/SingleAdView;", "c", "getTotal_label_sad", "()Lcom/transsnet/adsdk/widgets/SingleAdView;", "total_label_sad", "d", "getRepay_tv", "repay_tv", "e", "getCl_extend_label_tv", "cl_extend_label_tv", "f", "getLabel_divider_tv", "label_divider_tv", "g", "getRepayment_date_tv", "repayment_date_tv", "i", "getBill_amount_tv", "bill_amount_tv", "j", "getPaid_off_tv", "paid_off_tv", "o", "getBill_title_tv", "bill_title_tv", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcCommonBillCard extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f30814w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f30820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f30821g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30823j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OkCardMainPageRspData f30825p;
    public CLMainData t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InstallmentLoanMainPageData f30826v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcCommonBillCard(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i7 = 0;
        this.f30815a = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i7) {
                    case 0:
                        int i10 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i11 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i12 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i13 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i14 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i15 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i10 = 1;
        this.f30816b = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i10) {
                    case 0:
                        int i11 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i12 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i13 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i14 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i15 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i11 = 2;
        this.f30817c = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i11) {
                    case 0:
                        int i12 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i13 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i14 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i15 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i12 = 3;
        this.f30818d = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i12) {
                    case 0:
                        int i13 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i14 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i15 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i13 = 4;
        this.f30819e = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i13) {
                    case 0:
                        int i14 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i15 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i16 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i14 = 5;
        this.f30820f = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i14) {
                    case 0:
                        int i15 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i17 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i114 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i15 = 6;
        this.f30821g = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i15) {
                    case 0:
                        int i16 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i18 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i114 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i115 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i16 = 7;
        this.f30822i = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i16) {
                    case 0:
                        int i17 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i19 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i114 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i115 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i116 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i17 = 8;
        this.f30823j = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i17) {
                    case 0:
                        int i18 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i110 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i111 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i114 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i115 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i116 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i117 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        final int i18 = 9;
        this.f30824o = C2131j.b(new Function0(this) { // from class: Gb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcCommonBillCard f3225b;

            {
                this.f3225b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcCommonBillCard ocCommonBillCard = this.f3225b;
                switch (i18) {
                    case 0:
                        int i19 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_detail_tv);
                    case 1:
                        int i110 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.view_tv);
                    case 2:
                        int i111 = OcCommonBillCard.f30814w;
                        return (SingleAdView) ocCommonBillCard.findViewById(Ya.e.total_label_sad);
                    case 3:
                        int i112 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repay_tv);
                    case 4:
                        int i113 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.cl_extend_label_tv);
                    case 5:
                        int i114 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.label_divider_tv);
                    case 6:
                        int i115 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.repayment_date_tv);
                    case 7:
                        int i116 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_amount_tv);
                    case 8:
                        int i117 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.paid_off_tv);
                    default:
                        int i118 = OcCommonBillCard.f30814w;
                        return (TextView) ocCommonBillCard.findViewById(Ya.e.bill_title_tv);
                }
            }
        });
        View.inflate(context, f.cs_oc_comnon_bill_card, this);
    }

    private final TextView getBill_amount_tv() {
        Object value = this.f30822i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getBill_detail_tv() {
        return (TextView) this.f30815a.getValue();
    }

    private final TextView getBill_title_tv() {
        return (TextView) this.f30824o.getValue();
    }

    private final TextView getCl_extend_label_tv() {
        Object value = this.f30819e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final SpannableStringBuilder getDueInTomorrowContent() {
        SpannableStringBuilder spannableStringBuilderCreate = G.i("Auto Repay Occurs on Due Date (Tomorrow)").setForegroundColor(getContext().getColor(b.cs_overdue_today_txt_color)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    private final SpannableStringBuilder getDueTodayContent() {
        SpannableStringBuilder spannableStringBuilderCreate = G.i("Auto Repay Occurs on Due Date (Today)").setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    private final TextView getLabel_divider_tv() {
        Object value = this.f30820f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getPaid_off_tv() {
        Object value = this.f30823j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getRepay_tv() {
        Object value = this.f30818d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getRepayment_date_tv() {
        Object value = this.f30821g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final SingleAdView getTotal_label_sad() {
        Object value = this.f30817c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SingleAdView) value;
    }

    private final TextView getView_tv() {
        Object value = this.f30816b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final SpannableStringBuilder a(long j6) {
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("Auto Repay Occurs on Due Date (" + j6 + " days)").setForegroundColor(getContext().getColor(b.cs_overdue_today_txt_color)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    public final SpannableStringBuilder b(long j6) {
        if (j6 > 1) {
            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(String.valueOf(j6)).setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).setBold().append(" days overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).create();
            Intrinsics.e(spannableStringBuilderCreate);
            return spannableStringBuilderCreate;
        }
        SpannableStringBuilder spannableStringBuilderCreate2 = new SpanUtils().append(String.valueOf(j6)).setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).setBold().append(" day overdue. Auto Repay is taking place").setForegroundColor(getContext().getColor(b.cs_overdue_txt_color)).create();
        Intrinsics.e(spannableStringBuilderCreate2);
        return spannableStringBuilderCreate2;
    }

    public final SpannableStringBuilder c(Long l5) {
        SpannableStringBuilder spannableStringBuilderCreate = d0.j("Due on: ", r0.X1(Long.valueOf(l5 != null ? l5.longValue() : 0L), "dd MMM"), new SpanUtils()).setForegroundColor(getContext().getColor(L6.b.ppColorTextPrimary)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    public final void d() {
        OkCardMainPageRspData okCardMainPageRspData = this.f30825p;
        if (okCardMainPageRspData != null) {
            Integer applyStatus = okCardMainPageRspData.getApplyStatus();
            if (applyStatus != null && applyStatus.intValue() == 0) {
                return;
            }
            Integer accountStatus = okCardMainPageRspData.getAccountStatus();
            if (accountStatus != null && accountStatus.intValue() == 5) {
                q0.v("/credit_score/oc_protocol_activity", "oc_apply_enter_point", "OTHER");
                Unit unit = Unit.f38893a;
                return;
            }
            if (okCardMainPageRspData.getBillOutstandingAmount() <= 0) {
                ARouter.getInstance().build("/credit_score/oc_main_activity").navigation(getContext());
                return;
            }
            Integer outstandingBillCount = okCardMainPageRspData.getOutstandingBillCount();
            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) == 0) {
                Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData.getCardNo());
                Long billId = okCardMainPageRspData.getBillId();
                postcardWithString.withLong("oc_repay_bill_id", billId != null ? billId.longValue() : 0L).withString("oc_repay_order_no", null).navigation(getContext());
                return;
            }
            Integer outstandingBillCount2 = okCardMainPageRspData.getOutstandingBillCount();
            if ((outstandingBillCount2 != null ? outstandingBillCount2.intValue() : 0) != 1) {
                ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData.getCardNo()).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(getContext());
                return;
            }
            Postcard postcardWithString2 = ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, okCardMainPageRspData.getCardNo());
            Long outstandingBillId = okCardMainPageRspData.getOutstandingBillId();
            postcardWithString2.withLong("oc_repay_bill_id", outstandingBillId != null ? outstandingBillId.longValue() : 0L).withString("oc_repay_order_no", null).navigation(getContext());
        }
    }

    public final void e() {
        getRepayment_date_tv().setTextColor(getContext().getColor(b.cs_cl_overdue_txt_color));
        getRepayment_date_tv().setBackgroundResource(d.cs_btn_overdue_state_2);
    }

    public final void f() {
        getRepayment_date_tv().setTextColor(getContext().getColor(b.cs_overdue_today_txt_color));
        getRepayment_date_tv().setBackgroundResource(d.cs_btn_overdue_state_1);
    }

    public final void g() {
        getRepayment_date_tv().setTextColor(getContext().getColor(L6.b.ppColorTextAssist));
        getRepayment_date_tv().setBackgroundResource(r.cv_shape_rect_corner_4_bg_dark);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:114:0x023e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0241  */
    /* JADX WARN: Code duplicated, block: B:121:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0272  */
    /* JADX WARN: Code duplicated, block: B:128:0x0281  */
    /* JADX WARN: Code duplicated, block: B:130:0x0287  */
    /* JADX WARN: Code duplicated, block: B:131:0x0296  */
    /* JADX WARN: Code duplicated, block: B:133:0x029c  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0208  */
    public final void h(CLMainData cLMainData) {
        long outstandingAmount;
        boolean z3;
        long jLongValue;
        long jZ;
        Long repaymentDateStamp;
        Long repaymentDateStamp2;
        CLMainCreditCard creditCard;
        Integer accountStatus;
        Long repaymentDateStamp3;
        CLMainCashLoanBill currentCashLoanBill;
        Integer extensionTag;
        CLMainCashLoanBill currentCashLoanBill2;
        CLMainCashLoanBill currentCashLoanBill3;
        CLMainCashLoanBill currentCashLoanBill4;
        CLMainCreditCard creditCard2;
        Long allOutstandingAmount;
        CLMainCashLoanBill currentCashLoanBill5;
        CLMainCreditCard creditCard3;
        Long allOutstandingAmount2;
        CLMainCashLoanBill currentCashLoanBill6;
        CLMainCashLoanBill currentCashLoanBill7;
        TextView bill_title_tv = getBill_title_tv();
        if (bill_title_tv != null) {
            bill_title_tv.setText(getContext().getString(g.cs_single_repay_current_outstanding));
        }
        this.t = cLMainData;
        CLMainCreditCard creditCard4 = cLMainData != null ? cLMainData.getCreditCard() : null;
        long jLongValue2 = 0;
        getBill_amount_tv().setText(r0.B((cLMainData == null || (currentCashLoanBill7 = cLMainData.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill7.getOutstandingAmount(), true));
        getBill_amount_tv().setCompoundDrawablesWithIntrinsicBounds(0, 0, ((cLMainData != null ? cLMainData.getCurrentCashLoanBill() : null) == null || !(cLMainData == null || (currentCashLoanBill6 = cLMainData.getCurrentCashLoanBill()) == null || currentCashLoanBill6.getOutstandingAmount() != 0)) ? 0 : d.cs_cl_cornor_right_green_arrow, 0);
        TextView bill_detail_tv = getBill_detail_tv();
        if (bill_detail_tv != null) {
            h.s(bill_detail_tv, ((cLMainData == null || (creditCard3 = cLMainData.getCreditCard()) == null || (allOutstandingAmount2 = creditCard3.getAllOutstandingAmount()) == null) ? 0L : allOutstandingAmount2.longValue()) > ((cLMainData == null || (currentCashLoanBill5 = cLMainData.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill5.getOutstandingAmount()));
        }
        TextView bill_detail_tv2 = getBill_detail_tv();
        if (bill_detail_tv2 != null) {
            bill_detail_tv2.setText(getContext().getString(g.cs_oc_total_outstanding, r0.B((cLMainData == null || (creditCard2 = cLMainData.getCreditCard()) == null || (allOutstandingAmount = creditCard2.getAllOutstandingAmount()) == null) ? 0L : allOutstandingAmount.longValue(), false)));
        }
        getRepay_tv().setBackgroundResource(d.cs_corner_16_bg_00a49a);
        if (((cLMainData == null || (currentCashLoanBill4 = cLMainData.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill4.getOutstandingAmount()) <= 0) {
            if (cLMainData != null || (currentCashLoanBill2 = cLMainData.getCurrentCashLoanBill()) == null) {
                outstandingAmount = 0;
            } else {
                outstandingAmount = currentCashLoanBill2.getOutstandingAmount();
            }
            if (outstandingAmount == 0) {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(0);
                getRepay_tv().setVisibility(8);
                getLabel_divider_tv().setVisibility(8);
                getCl_extend_label_tv().setVisibility(8);
                getRepayment_date_tv().setVisibility(8);
                h.l(new ViewOnClickListenerC0053e(16), getView_tv());
            } else {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(8);
                getRepay_tv().setVisibility(0);
                getRepayment_date_tv().setVisibility(0);
                getTotal_label_sad().setVisibility(0);
                getTotal_label_sad().setSlotId(getContext().getString(g.cl_bill_label_slot_id));
                if (cLMainData != null || (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) == null || (extensionTag = currentCashLoanBill.getExtensionTag()) == null || extensionTag.intValue() != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    getLabel_divider_tv().setVisibility(0);
                    getCl_extend_label_tv().setVisibility(0);
                } else {
                    getLabel_divider_tv().setVisibility(8);
                    getCl_extend_label_tv().setVisibility(8);
                }
                if (creditCard4 != null || (repaymentDateStamp3 = creditCard4.getRepaymentDateStamp()) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = repaymentDateStamp3.longValue();
                }
                jZ = AbstractC0198c.z(jLongValue);
                if (cLMainData == null && (creditCard = cLMainData.getCreditCard()) != null && (accountStatus = creditCard.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                    if (creditCard4 != null && (repaymentDateStamp2 = creditCard4.getRepaymentDateStamp()) != null) {
                        jLongValue2 = repaymentDateStamp2.longValue();
                    }
                    getRepayment_date_tv().setText(b(AbstractC0198c.D(jLongValue2)));
                    e();
                } else {
                    if (creditCard4 != null && (repaymentDateStamp = creditCard4.getRepaymentDateStamp()) != null) {
                        jLongValue2 = repaymentDateStamp.longValue();
                    }
                    if (DateUtils.isToday(jLongValue2)) {
                        e();
                        getRepayment_date_tv().setText(getDueTodayContent());
                    } else if (jZ == 1) {
                        getRepayment_date_tv().setText(getDueInTomorrowContent());
                        f();
                    } else if (jZ <= 3) {
                        getRepayment_date_tv().setText(a(jZ));
                        f();
                    } else {
                        getRepayment_date_tv().setText(c(creditCard4 != null ? creditCard4.getRepaymentDateStamp() : null));
                        g();
                    }
                }
            }
        } else {
            if ((cLMainData == null || (currentCashLoanBill3 = cLMainData.getCurrentCashLoanBill()) == null) ? false : Intrinsics.c(currentCashLoanBill3.getCurrentCleared(), Boolean.TRUE)) {
                getBill_amount_tv().setText(r0.B(0L, true));
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(0);
                getRepay_tv().setVisibility(8);
                getLabel_divider_tv().setVisibility(8);
                getCl_extend_label_tv().setVisibility(8);
                getRepayment_date_tv().setVisibility(0);
                TextView repayment_date_tv = getRepayment_date_tv();
                Context context = getContext();
                int i7 = g.cs_oc_next_repayment_amount;
                CLMainCashLoanBill currentCashLoanBill8 = cLMainData.getCurrentCashLoanBill();
                repayment_date_tv.setText(context.getString(i7, r0.B(currentCashLoanBill8 != null ? currentCashLoanBill8.getOutstandingAmount() : 0L, true)));
                g();
                h.l(new B(this, 7), getView_tv());
            } else {
                if (cLMainData != null) {
                    outstandingAmount = 0;
                } else {
                    outstandingAmount = 0;
                }
                if (outstandingAmount == 0) {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(0);
                    getRepay_tv().setVisibility(8);
                    getLabel_divider_tv().setVisibility(8);
                    getCl_extend_label_tv().setVisibility(8);
                    getRepayment_date_tv().setVisibility(8);
                    h.l(new ViewOnClickListenerC0053e(16), getView_tv());
                } else {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(8);
                    getRepay_tv().setVisibility(0);
                    getRepayment_date_tv().setVisibility(0);
                    getTotal_label_sad().setVisibility(0);
                    getTotal_label_sad().setSlotId(getContext().getString(g.cl_bill_label_slot_id));
                    if (cLMainData != null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        getLabel_divider_tv().setVisibility(0);
                        getCl_extend_label_tv().setVisibility(0);
                    } else {
                        getLabel_divider_tv().setVisibility(8);
                        getCl_extend_label_tv().setVisibility(8);
                    }
                    if (creditCard4 != null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = 0;
                    }
                    jZ = AbstractC0198c.z(jLongValue);
                    if (cLMainData == null && (creditCard = cLMainData.getCreditCard()) != null && (accountStatus = creditCard.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                        if (creditCard4 != null) {
                            jLongValue2 = repaymentDateStamp2.longValue();
                        }
                        getRepayment_date_tv().setText(b(AbstractC0198c.D(jLongValue2)));
                        e();
                    } else {
                        if (creditCard4 != null) {
                            jLongValue2 = repaymentDateStamp.longValue();
                        }
                        if (DateUtils.isToday(jLongValue2)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            getRepayment_date_tv().setText(c(creditCard4 != null ? creditCard4.getRepaymentDateStamp() : null));
                            g();
                        }
                    }
                }
            }
        }
        h.l(new B(this, 8), this);
        h.l(new B(this, 9), getRepay_tv());
        h.l(new c(27, cLMainData, this), getBill_amount_tv());
        TextView bill_detail_tv3 = getBill_detail_tv();
        if (bill_detail_tv3 != null) {
            h.l(new ViewOnClickListenerC0159a(cLMainData, 20), bill_detail_tv3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:122:0x0245  */
    /* JADX WARN: Code duplicated, block: B:124:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x0257  */
    /* JADX WARN: Code duplicated, block: B:134:0x027e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0299  */
    /* JADX WARN: Code duplicated, block: B:147:0x029c  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x030a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0310  */
    /* JADX WARN: Code duplicated, block: B:173:0x031f  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    public final void i(InstallmentLoanMainPageData installmentLoanMainPageData) {
        long jLongValue;
        boolean z3;
        long jLongValue2;
        long jZ;
        CurrentRepaymentDetail currentRepaymentDetail;
        CashRepaymentInfo cashRepaymentInfo;
        CurrentRepaymentDetail currentRepaymentDetail2;
        CashRepaymentInfo cashRepaymentInfo2;
        Long repaymentDate;
        CurrentRepaymentDetail currentRepaymentDetail3;
        CashRepaymentInfo cashRepaymentInfo3;
        Long repaymentDate2;
        InstallmentLoanCardInfo installmentLoanCardInfo;
        Integer accountStatus;
        CurrentRepaymentDetail currentRepaymentDetail4;
        CashRepaymentInfo cashRepaymentInfo4;
        Long repaymentDate3;
        CurrentRepaymentDetail currentRepaymentDetail5;
        CashRepaymentInfo cashRepaymentInfo5;
        Integer extensionTag;
        CurrentRepaymentDetail currentRepaymentDetail6;
        CashRepaymentInfo cashRepaymentInfo6;
        Long outstandingAmount;
        CurrentRepaymentDetail currentRepaymentDetail7;
        CashRepaymentInfo cashRepaymentInfo7;
        Long outstandingAmount2;
        CurrentRepaymentDetail currentRepaymentDetail8;
        CashRepaymentInfo cashRepaymentInfo8;
        CurrentRepaymentDetail currentRepaymentDetail9;
        CashRepaymentInfo cashRepaymentInfo9;
        Long outstandingAmount3;
        InstallmentLoanCardInfo installmentLoanCardInfo2;
        Long outStandingAmount;
        CurrentRepaymentDetail currentRepaymentDetail10;
        CashRepaymentInfo cashRepaymentInfo10;
        Long outstandingAmount4;
        InstallmentLoanCardInfo installmentLoanCardInfo3;
        Long outStandingAmount2;
        CurrentRepaymentDetail currentRepaymentDetail11;
        CashRepaymentInfo cashRepaymentInfo11;
        Long outstandingAmount5;
        CurrentRepaymentDetail currentRepaymentDetail12;
        CashRepaymentInfo cashRepaymentInfo12;
        Long outstandingAmount6;
        TextView bill_title_tv = getBill_title_tv();
        if (bill_title_tv != null) {
            bill_title_tv.setText(getContext().getString(g.cs_installment_current_outstanding));
        }
        this.f30826v = installmentLoanMainPageData;
        long jLongValue3 = 0;
        getBill_amount_tv().setText(r0.B((installmentLoanMainPageData == null || (currentRepaymentDetail12 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo12 = currentRepaymentDetail12.getCashRepaymentInfo()) == null || (outstandingAmount6 = cashRepaymentInfo12.getOutstandingAmount()) == null) ? 0L : outstandingAmount6.longValue(), true));
        Long repaymentDate4 = null;
        getBill_amount_tv().setCompoundDrawablesWithIntrinsicBounds(0, 0, ((installmentLoanMainPageData != null ? installmentLoanMainPageData.getCurrentRepaymentDetail() : null) == null || !(installmentLoanMainPageData == null || (currentRepaymentDetail11 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo11 = currentRepaymentDetail11.getCashRepaymentInfo()) == null || (outstandingAmount5 = cashRepaymentInfo11.getOutstandingAmount()) == null || outstandingAmount5.longValue() != 0)) ? 0 : d.cs_cl_cornor_right_green_arrow, 0);
        TextView bill_detail_tv = getBill_detail_tv();
        if (bill_detail_tv != null) {
            h.s(bill_detail_tv, ((installmentLoanMainPageData == null || (installmentLoanCardInfo3 = installmentLoanMainPageData.getInstallmentLoanCardInfo()) == null || (outStandingAmount2 = installmentLoanCardInfo3.getOutStandingAmount()) == null) ? 0L : outStandingAmount2.longValue()) > ((installmentLoanMainPageData == null || (currentRepaymentDetail10 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo10 = currentRepaymentDetail10.getCashRepaymentInfo()) == null || (outstandingAmount4 = cashRepaymentInfo10.getOutstandingAmount()) == null) ? 0L : outstandingAmount4.longValue()));
        }
        TextView bill_detail_tv2 = getBill_detail_tv();
        if (bill_detail_tv2 != null) {
            bill_detail_tv2.setText(getContext().getString(g.cs_oc_total_outstanding, r0.B((installmentLoanMainPageData == null || (installmentLoanCardInfo2 = installmentLoanMainPageData.getInstallmentLoanCardInfo()) == null || (outStandingAmount = installmentLoanCardInfo2.getOutStandingAmount()) == null) ? 0L : outStandingAmount.longValue(), false)));
        }
        getRepay_tv().setBackgroundResource(d.cs_corner_16_bg_00a49a);
        if (((installmentLoanMainPageData == null || (currentRepaymentDetail9 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo9 = currentRepaymentDetail9.getCashRepaymentInfo()) == null || (outstandingAmount3 = cashRepaymentInfo9.getOutstandingAmount()) == null) ? 0L : outstandingAmount3.longValue()) <= 0) {
            if (installmentLoanMainPageData != null || (currentRepaymentDetail6 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo6 = currentRepaymentDetail6.getCashRepaymentInfo()) == null || (outstandingAmount = cashRepaymentInfo6.getOutstandingAmount()) == null) {
                jLongValue = 0;
            } else {
                jLongValue = outstandingAmount.longValue();
            }
            if (jLongValue == 0) {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(0);
                getRepay_tv().setVisibility(8);
                getLabel_divider_tv().setVisibility(8);
                getCl_extend_label_tv().setVisibility(8);
                getRepayment_date_tv().setVisibility(8);
                h.l(new ViewOnClickListenerC0053e(14), getView_tv());
            } else {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(8);
                getRepay_tv().setVisibility(0);
                getRepayment_date_tv().setVisibility(0);
                getTotal_label_sad().setVisibility(0);
                getTotal_label_sad().setSlotId(getContext().getString(g.cl_bill_label_slot_id));
                if (installmentLoanMainPageData != null || (currentRepaymentDetail5 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo5 = currentRepaymentDetail5.getCashRepaymentInfo()) == null || (extensionTag = cashRepaymentInfo5.getExtensionTag()) == null || extensionTag.intValue() != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    getLabel_divider_tv().setVisibility(0);
                    getCl_extend_label_tv().setVisibility(0);
                } else {
                    getLabel_divider_tv().setVisibility(8);
                    getCl_extend_label_tv().setVisibility(8);
                }
                if (installmentLoanMainPageData != null || (currentRepaymentDetail4 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo4 = currentRepaymentDetail4.getCashRepaymentInfo()) == null || (repaymentDate3 = cashRepaymentInfo4.getRepaymentDate()) == null) {
                    jLongValue2 = 0;
                } else {
                    jLongValue2 = repaymentDate3.longValue();
                }
                jZ = AbstractC0198c.z(jLongValue2);
                if (installmentLoanMainPageData == null && (installmentLoanCardInfo = installmentLoanMainPageData.getInstallmentLoanCardInfo()) != null && (accountStatus = installmentLoanCardInfo.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                    if (installmentLoanMainPageData != null && (currentRepaymentDetail3 = installmentLoanMainPageData.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo3 = currentRepaymentDetail3.getCashRepaymentInfo()) != null && (repaymentDate2 = cashRepaymentInfo3.getRepaymentDate()) != null) {
                        jLongValue3 = repaymentDate2.longValue();
                    }
                    getRepayment_date_tv().setText(b(AbstractC0198c.D(jLongValue3)));
                    e();
                } else {
                    if (installmentLoanMainPageData != null && (currentRepaymentDetail2 = installmentLoanMainPageData.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo2 = currentRepaymentDetail2.getCashRepaymentInfo()) != null && (repaymentDate = cashRepaymentInfo2.getRepaymentDate()) != null) {
                        jLongValue3 = repaymentDate.longValue();
                    }
                    if (DateUtils.isToday(jLongValue3)) {
                        e();
                        getRepayment_date_tv().setText(getDueTodayContent());
                    } else if (jZ == 1) {
                        getRepayment_date_tv().setText(getDueInTomorrowContent());
                        f();
                    } else if (jZ <= 3) {
                        getRepayment_date_tv().setText(a(jZ));
                        f();
                    } else {
                        TextView repayment_date_tv = getRepayment_date_tv();
                        if (installmentLoanMainPageData != null && (currentRepaymentDetail = installmentLoanMainPageData.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo = currentRepaymentDetail.getCashRepaymentInfo()) != null) {
                            repaymentDate4 = cashRepaymentInfo.getRepaymentDate();
                        }
                        repayment_date_tv.setText(c(repaymentDate4));
                        g();
                    }
                }
            }
        } else {
            if ((installmentLoanMainPageData == null || (currentRepaymentDetail8 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo8 = currentRepaymentDetail8.getCashRepaymentInfo()) == null) ? false : Intrinsics.c(cashRepaymentInfo8.getCurrentCleared(), Boolean.TRUE)) {
                getBill_amount_tv().setText(r0.B(0L, true));
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(0);
                getRepay_tv().setVisibility(8);
                getLabel_divider_tv().setVisibility(8);
                getCl_extend_label_tv().setVisibility(8);
                getRepayment_date_tv().setVisibility(0);
                TextView repayment_date_tv2 = getRepayment_date_tv();
                Context context = getContext();
                int i7 = g.cs_oc_next_repayment_amount;
                if (installmentLoanMainPageData != null && (currentRepaymentDetail7 = installmentLoanMainPageData.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo7 = currentRepaymentDetail7.getCashRepaymentInfo()) != null && (outstandingAmount2 = cashRepaymentInfo7.getOutstandingAmount()) != null) {
                    jLongValue3 = outstandingAmount2.longValue();
                }
                repayment_date_tv2.setText(context.getString(i7, r0.B(jLongValue3, true)));
                g();
                h.l(new B(this, 0), getView_tv());
            } else {
                if (installmentLoanMainPageData != null) {
                    jLongValue = 0;
                } else {
                    jLongValue = 0;
                }
                if (jLongValue == 0) {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(0);
                    getRepay_tv().setVisibility(8);
                    getLabel_divider_tv().setVisibility(8);
                    getCl_extend_label_tv().setVisibility(8);
                    getRepayment_date_tv().setVisibility(8);
                    h.l(new ViewOnClickListenerC0053e(14), getView_tv());
                } else {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(8);
                    getRepay_tv().setVisibility(0);
                    getRepayment_date_tv().setVisibility(0);
                    getTotal_label_sad().setVisibility(0);
                    getTotal_label_sad().setSlotId(getContext().getString(g.cl_bill_label_slot_id));
                    if (installmentLoanMainPageData != null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        getLabel_divider_tv().setVisibility(0);
                        getCl_extend_label_tv().setVisibility(0);
                    } else {
                        getLabel_divider_tv().setVisibility(8);
                        getCl_extend_label_tv().setVisibility(8);
                    }
                    if (installmentLoanMainPageData != null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = 0;
                    }
                    jZ = AbstractC0198c.z(jLongValue2);
                    if (installmentLoanMainPageData == null && (installmentLoanCardInfo = installmentLoanMainPageData.getInstallmentLoanCardInfo()) != null && (accountStatus = installmentLoanCardInfo.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                        if (installmentLoanMainPageData != null) {
                            jLongValue3 = repaymentDate2.longValue();
                        }
                        getRepayment_date_tv().setText(b(AbstractC0198c.D(jLongValue3)));
                        e();
                    } else {
                        if (installmentLoanMainPageData != null) {
                            jLongValue3 = repaymentDate.longValue();
                        }
                        if (DateUtils.isToday(jLongValue3)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            TextView repayment_date_tv3 = getRepayment_date_tv();
                            if (installmentLoanMainPageData != null) {
                                repaymentDate4 = cashRepaymentInfo.getRepaymentDate();
                            }
                            repayment_date_tv3.setText(c(repaymentDate4));
                            g();
                        }
                    }
                }
            }
        }
        h.l(new B(this, 4), this);
        h.l(new B(this, 5), getRepay_tv());
        h.l(new c(29, installmentLoanMainPageData, this), getBill_amount_tv());
        TextView bill_detail_tv3 = getBill_detail_tv();
        if (bill_detail_tv3 != null) {
            h.l(new B(this, 6), bill_detail_tv3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9  */
    public final void j(OkCardMainPageRspData okCardMainPageRspData) {
        long billOutstandingAmount;
        long repaymentDateStamp;
        long jZ;
        Long lValueOf;
        Integer accountStatus;
        long jLongValue;
        Long nextCycleInstallmentAmount;
        Long nextCycleInstallmentAmount2;
        Long nextCycleInstallmentAmount3;
        TextView bill_title_tv = getBill_title_tv();
        if (bill_title_tv != null) {
            bill_title_tv.setText(getContext().getString(g.cs_total_outstanding));
        }
        this.f30825p = okCardMainPageRspData;
        long jLongValue2 = 0;
        getBill_amount_tv().setText(r0.B(okCardMainPageRspData != null ? okCardMainPageRspData.getBillOutstandingAmount() : 0L, true));
        getBill_amount_tv().setCompoundDrawablesWithIntrinsicBounds(0, 0, (okCardMainPageRspData == null || okCardMainPageRspData.getBillOutstandingAmount() == 0) ? 0 : d.cs_cl_cornor_right_green_arrow, 0);
        if ((okCardMainPageRspData != null ? okCardMainPageRspData.getBillOutstandingAmount() : 0L) > 0) {
            if (okCardMainPageRspData != null) {
                billOutstandingAmount = okCardMainPageRspData.getBillOutstandingAmount();
            } else {
                billOutstandingAmount = 0;
            }
            if (billOutstandingAmount > 0) {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(8);
                getRepay_tv().setVisibility(0);
                getRepayment_date_tv().setVisibility(0);
                getTotal_label_sad().setVisibility(0);
                getTotal_label_sad().setSlotId(getContext().getString(g.oc_bill_label_slot_id));
                if (okCardMainPageRspData != null) {
                    repaymentDateStamp = okCardMainPageRspData.getRepaymentDateStamp();
                } else {
                    repaymentDateStamp = 0;
                }
                jZ = AbstractC0198c.z(repaymentDateStamp);
                if (okCardMainPageRspData == null && (accountStatus = okCardMainPageRspData.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                    getRepayment_date_tv().setText(b(AbstractC0198c.D(okCardMainPageRspData.getRepaymentDateStamp())));
                    e();
                } else {
                    if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                        e();
                        getRepayment_date_tv().setText(getDueTodayContent());
                    } else if (jZ == 1) {
                        getRepayment_date_tv().setText(getDueInTomorrowContent());
                        f();
                    } else if (jZ <= 3) {
                        getRepayment_date_tv().setText(a(jZ));
                        f();
                    } else {
                        TextView repayment_date_tv = getRepayment_date_tv();
                        if (okCardMainPageRspData != null) {
                            lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                        } else {
                            lValueOf = null;
                        }
                        repayment_date_tv.setText(c(lValueOf));
                        g();
                    }
                }
            } else {
                if (okCardMainPageRspData != null || (nextCycleInstallmentAmount = okCardMainPageRspData.getNextCycleInstallmentAmount()) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = nextCycleInstallmentAmount.longValue();
                }
                if (jLongValue <= 0) {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(0);
                    getRepay_tv().setVisibility(8);
                    getRepayment_date_tv().setVisibility(8);
                    h.l(new ViewOnClickListenerC0053e(15), getView_tv());
                } else {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(8);
                    getRepay_tv().setVisibility(0);
                    getRepayment_date_tv().setVisibility(0);
                    getTotal_label_sad().setVisibility(0);
                    getTotal_label_sad().setSlotId(getContext().getString(g.oc_bill_label_slot_id));
                    if (okCardMainPageRspData != null) {
                        repaymentDateStamp = okCardMainPageRspData.getRepaymentDateStamp();
                    } else {
                        repaymentDateStamp = 0;
                    }
                    jZ = AbstractC0198c.z(repaymentDateStamp);
                    if (okCardMainPageRspData == null) {
                        if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            TextView repayment_date_tv2 = getRepayment_date_tv();
                            if (okCardMainPageRspData != null) {
                                lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                            } else {
                                lValueOf = null;
                            }
                            repayment_date_tv2.setText(c(lValueOf));
                            g();
                        }
                    } else {
                        if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            TextView repayment_date_tv3 = getRepayment_date_tv();
                            if (okCardMainPageRspData != null) {
                                lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                            } else {
                                lValueOf = null;
                            }
                            repayment_date_tv3.setText(c(lValueOf));
                            g();
                        }
                    }
                }
            }
        } else {
            if (((okCardMainPageRspData == null || (nextCycleInstallmentAmount3 = okCardMainPageRspData.getNextCycleInstallmentAmount()) == null) ? 0L : nextCycleInstallmentAmount3.longValue()) > 0) {
                getPaid_off_tv().setVisibility(8);
                getView_tv().setVisibility(0);
                getRepay_tv().setVisibility(8);
                getRepayment_date_tv().setVisibility(0);
                TextView repayment_date_tv4 = getRepayment_date_tv();
                Context context = getContext();
                int i7 = g.cs_oc_next_repayment_amount;
                if (okCardMainPageRspData != null && (nextCycleInstallmentAmount2 = okCardMainPageRspData.getNextCycleInstallmentAmount()) != null) {
                    jLongValue2 = nextCycleInstallmentAmount2.longValue();
                }
                repayment_date_tv4.setText(context.getString(i7, r0.B(jLongValue2, false)));
                g();
                h.l(new B(this, 1), getView_tv());
            } else {
                if (okCardMainPageRspData != null) {
                    billOutstandingAmount = okCardMainPageRspData.getBillOutstandingAmount();
                } else {
                    billOutstandingAmount = 0;
                }
                if (billOutstandingAmount > 0) {
                    getPaid_off_tv().setVisibility(8);
                    getView_tv().setVisibility(8);
                    getRepay_tv().setVisibility(0);
                    getRepayment_date_tv().setVisibility(0);
                    getTotal_label_sad().setVisibility(0);
                    getTotal_label_sad().setSlotId(getContext().getString(g.oc_bill_label_slot_id));
                    if (okCardMainPageRspData != null) {
                        repaymentDateStamp = okCardMainPageRspData.getRepaymentDateStamp();
                    } else {
                        repaymentDateStamp = 0;
                    }
                    jZ = AbstractC0198c.z(repaymentDateStamp);
                    if (okCardMainPageRspData == null) {
                        if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            TextView repayment_date_tv5 = getRepayment_date_tv();
                            if (okCardMainPageRspData != null) {
                                lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                            } else {
                                lValueOf = null;
                            }
                            repayment_date_tv5.setText(c(lValueOf));
                            g();
                        }
                    } else {
                        if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                            e();
                            getRepayment_date_tv().setText(getDueTodayContent());
                        } else if (jZ == 1) {
                            getRepayment_date_tv().setText(getDueInTomorrowContent());
                            f();
                        } else if (jZ <= 3) {
                            getRepayment_date_tv().setText(a(jZ));
                            f();
                        } else {
                            TextView repayment_date_tv6 = getRepayment_date_tv();
                            if (okCardMainPageRspData != null) {
                                lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                            } else {
                                lValueOf = null;
                            }
                            repayment_date_tv6.setText(c(lValueOf));
                            g();
                        }
                    }
                } else {
                    if (okCardMainPageRspData != null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = 0;
                    }
                    if (jLongValue <= 0) {
                        getPaid_off_tv().setVisibility(8);
                        getView_tv().setVisibility(0);
                        getRepay_tv().setVisibility(8);
                        getRepayment_date_tv().setVisibility(8);
                        h.l(new ViewOnClickListenerC0053e(15), getView_tv());
                    } else {
                        getPaid_off_tv().setVisibility(8);
                        getView_tv().setVisibility(8);
                        getRepay_tv().setVisibility(0);
                        getRepayment_date_tv().setVisibility(0);
                        getTotal_label_sad().setVisibility(0);
                        getTotal_label_sad().setSlotId(getContext().getString(g.oc_bill_label_slot_id));
                        if (okCardMainPageRspData != null) {
                            repaymentDateStamp = okCardMainPageRspData.getRepaymentDateStamp();
                        } else {
                            repaymentDateStamp = 0;
                        }
                        jZ = AbstractC0198c.z(repaymentDateStamp);
                        if (okCardMainPageRspData == null) {
                            if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                                e();
                                getRepayment_date_tv().setText(getDueTodayContent());
                            } else if (jZ == 1) {
                                getRepayment_date_tv().setText(getDueInTomorrowContent());
                                f();
                            } else if (jZ <= 3) {
                                getRepayment_date_tv().setText(a(jZ));
                                f();
                            } else {
                                TextView repayment_date_tv7 = getRepayment_date_tv();
                                if (okCardMainPageRspData != null) {
                                    lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                                } else {
                                    lValueOf = null;
                                }
                                repayment_date_tv7.setText(c(lValueOf));
                                g();
                            }
                        } else {
                            if (DateUtils.isToday(okCardMainPageRspData != null ? okCardMainPageRspData.getRepaymentDateStamp() : 0L)) {
                                e();
                                getRepayment_date_tv().setText(getDueTodayContent());
                            } else if (jZ == 1) {
                                getRepayment_date_tv().setText(getDueInTomorrowContent());
                                f();
                            } else if (jZ <= 3) {
                                getRepayment_date_tv().setText(a(jZ));
                                f();
                            } else {
                                TextView repayment_date_tv8 = getRepayment_date_tv();
                                if (okCardMainPageRspData != null) {
                                    lValueOf = Long.valueOf(okCardMainPageRspData.getRepaymentDateStamp());
                                } else {
                                    lValueOf = null;
                                }
                                repayment_date_tv8.setText(c(lValueOf));
                                g();
                            }
                        }
                    }
                }
            }
        }
        h.l(new B(this, 2), getRepay_tv());
        h.l(new c(28, this, okCardMainPageRspData), getBill_amount_tv());
        TextView bill_detail_tv = getBill_detail_tv();
        if (bill_detail_tv != null) {
            h.l(new B(this, 3), bill_detail_tv);
        }
    }
}
