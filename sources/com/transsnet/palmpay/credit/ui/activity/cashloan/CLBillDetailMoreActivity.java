package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import L6.i;
import O6.d;
import Pa.r0;
import V9.C0714c;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.credit.bean.req.CLBillDetailReq;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailMoreActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLInterestDialog;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;
import p221ob.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit账单详情更多页", path = "/credit_score/cl_bill_detail_more_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLBillDetailMoreActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLBillDetailMoreActivity extends b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f28845t0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28846A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28847B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28848C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28849H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28850L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28851M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28852Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28853X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28854Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f28855Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28859g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28861j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f28862k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28864p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CLBillDetailData f28865p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f28866q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f28867r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Long f28868s0 = 0L;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28870w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public CLBillDetailMoreActivity() {
        final int i7 = 0;
        this.f28856d = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i7) {
                    case 0:
                        int i10 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i11 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i12 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i10 = 2;
        this.f28857e = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i10) {
                    case 0:
                        int i11 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i12 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i11 = 5;
        this.f28858f = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i11) {
                    case 0:
                        int i12 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i12 = 6;
        this.f28859g = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i12) {
                    case 0:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i13 = 7;
        this.f28860i = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i13) {
                    case 0:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i14 = 8;
        this.f28861j = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i14) {
                    case 0:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i15 = 9;
        this.f28863o = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i15) {
                    case 0:
                        int i16 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i16 = 10;
        this.f28864p = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i16) {
                    case 0:
                        int i17 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i17 = 12;
        this.t = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i17) {
                    case 0:
                        int i18 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i18 = 13;
        this.f28869v = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i18) {
                    case 0:
                        int i19 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i19 = 11;
        this.f28870w = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i19) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i20 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i20 = 14;
        this.f28846A = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i20) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i21 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i21 = 15;
        this.f28847B = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i21) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i22 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i22 = 16;
        this.f28848C = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i22) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i23 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i23 = 17;
        this.f28849H = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i23) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i24 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i24 = 18;
        this.f28850L = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i24) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i25 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i25 = 19;
        this.f28851M = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i25) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i26 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i26 = 20;
        this.f28852Q = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i26) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i27 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i216 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i27 = 21;
        this.f28853X = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i27) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i28 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i216 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i217 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i28 = 1;
        this.f28854Y = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i28) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i29 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i216 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i217 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i218 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i29 = 3;
        this.f28855Z = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i29) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i216 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i217 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i218 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i219 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i30 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
        final int i30 = 4;
        this.f28862k0 = C2131j.b(new Function0(this) { // from class: tb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42465b;

            {
                this.f42465b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42465b;
                switch (i30) {
                    case 0:
                        int i110 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.proto_tv);
                    case 1:
                        int i111 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_amount_tv);
                    case 2:
                        int i112 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.init_loan_tv);
                    case 3:
                        int i113 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.interest_title_tv);
                    case 4:
                        int i114 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_amount_tv);
                    case 5:
                        int i115 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.init_loan_ll);
                    case 6:
                        int i116 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.daily_interest_tv);
                    case 7:
                        int i117 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.period_tv);
                    case 8:
                        int i118 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.bill_date_tv);
                    case 9:
                        int i119 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_amount_tv);
                    case 10:
                        int i210 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.management_fee_tv);
                    case 11:
                        int i211 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.total_amount_tv);
                    case 12:
                        int i212 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.layoutManagementFee);
                    case 13:
                        int i213 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.receive_account_tv);
                    case 14:
                        int i214 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i215 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.extend_fee_ll);
                    case 16:
                        int i216 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.coupon_content_tv);
                    case 17:
                        int i217 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.tvDiscountTitle);
                    case 18:
                        int i218 = CLBillDetailMoreActivity.f28845t0;
                        return (LinearLayout) cLBillDetailMoreActivity.findViewById(e.coupon_ll);
                    case 19:
                        int i219 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.penalty_amount_tv);
                    case 20:
                        int i31 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_amount_tv);
                    default:
                        int i32 = CLBillDetailMoreActivity.f28845t0;
                        return (TextView) cLBillDetailMoreActivity.findViewById(e.service_fee_title_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_bill_detail_more_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(c.f40268a).clGetBillDetail(new CLBillDetailReq(this.f28866q0, this.f28868s0, this.f28867r0)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 29));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f28866q0 = getIntent().getStringExtra("cl_more_bill_apply_id");
        this.f28868s0 = Long.valueOf(getIntent().getLongExtra("cl_more_bill_detail_id", 0L));
        this.f28867r0 = getIntent().getStringExtra("cl_more_bill_loan_no");
        Object value = this.f28855Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42469b;

            {
                this.f42469b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long minServiceFee;
                Long maxServiceFee;
                Double serviceFeeRate;
                Long paidServiceFee;
                Long unpaidServiceFee;
                Integer loanType;
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42469b;
                switch (i7) {
                    case 0:
                        int i10 = CLBillDetailMoreActivity.f28845t0;
                        CLBillDetailData cLBillDetailData = cLBillDetailMoreActivity.f28865p0;
                        new CLInterestDialog(cLBillDetailMoreActivity, cLBillDetailData != null ? cLBillDetailData.getInterestPrompt() : null).show();
                        break;
                    case 1:
                        CLBillDetailData cLBillDetailData2 = cLBillDetailMoreActivity.f28865p0;
                        long jLongValue = 0;
                        long jLongValue2 = (cLBillDetailData2 == null || (unpaidServiceFee = cLBillDetailData2.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                        CLBillDetailData cLBillDetailData3 = cLBillDetailMoreActivity.f28865p0;
                        if (jLongValue2 + ((cLBillDetailData3 == null || (paidServiceFee = cLBillDetailData3.getPaidServiceFee()) == null) ? 0L : paidServiceFee.longValue()) > 0) {
                            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                            O6.c cVar = new O6.c(cLBillDetailMoreActivity);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6596b = d.f(cLBillDetailMoreActivity.getString(k.core_title_attention));
                            int i11 = g.cs_cl_service_fee_description;
                            CLBillDetailData cLBillDetailData4 = cLBillDetailMoreActivity.f28865p0;
                            String str = decimalFormat.format((cLBillDetailData4 == null || (serviceFeeRate = cLBillDetailData4.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                            CLBillDetailData cLBillDetailData5 = cLBillDetailMoreActivity.f28865p0;
                            String strB = r0.B((cLBillDetailData5 == null || (maxServiceFee = cLBillDetailData5.getMaxServiceFee()) == null) ? 0L : maxServiceFee.longValue(), true);
                            CLBillDetailData cLBillDetailData6 = cLBillDetailMoreActivity.f28865p0;
                            if (cLBillDetailData6 != null && (minServiceFee = cLBillDetailData6.getMinServiceFee()) != null) {
                                jLongValue = minServiceFee.longValue();
                            }
                            cVar.f6598d = cLBillDetailMoreActivity.getString(i11, str, strB, r0.B(jLongValue, true));
                            cVar.d(k.core_got_it, null);
                            cVar.a().show();
                            break;
                        }
                        break;
                    case 2:
                        CLBillDetailData cLBillDetailData7 = cLBillDetailMoreActivity.f28865p0;
                        if (cLBillDetailData7 != null && (loanType = cLBillDetailData7.getLoanType()) != null && loanType.intValue() == 2) {
                            Bundle bundle = new Bundle();
                            CLBillDetailData cLBillDetailData8 = cLBillDetailMoreActivity.f28865p0;
                            bundle.putString("loanNo", cLBillDetailData8 != null ? cLBillDetailData8.getSourceLoanNo() : null);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                            break;
                        }
                        break;
                    default:
                        int i12 = CLBillDetailMoreActivity.f28845t0;
                        Bundle bundle2 = new Bundle();
                        CLBillDetailData cLBillDetailData9 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanNo", cLBillDetailData9 != null ? cLBillDetailData9.getLoanNo() : null);
                        CLBillDetailData cLBillDetailData10 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("largeLoanTerm", String.valueOf(cLBillDetailData10 != null ? cLBillDetailData10.getLargeLoanTerm() : null));
                        CLBillDetailData cLBillDetailData11 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanType", String.valueOf(cLBillDetailData11 != null ? cLBillDetailData11.getLoanType() : null));
                        bundle2.putString(FirebaseAnalytics.Param.INDEX, "1");
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "NormalLoanAgreement");
                        break;
                }
            }
        }, (TextView) value);
        Object value2 = this.f28853X.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42469b;

            {
                this.f42469b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long minServiceFee;
                Long maxServiceFee;
                Double serviceFeeRate;
                Long paidServiceFee;
                Long unpaidServiceFee;
                Integer loanType;
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42469b;
                switch (i10) {
                    case 0:
                        int i11 = CLBillDetailMoreActivity.f28845t0;
                        CLBillDetailData cLBillDetailData = cLBillDetailMoreActivity.f28865p0;
                        new CLInterestDialog(cLBillDetailMoreActivity, cLBillDetailData != null ? cLBillDetailData.getInterestPrompt() : null).show();
                        break;
                    case 1:
                        CLBillDetailData cLBillDetailData2 = cLBillDetailMoreActivity.f28865p0;
                        long jLongValue = 0;
                        long jLongValue2 = (cLBillDetailData2 == null || (unpaidServiceFee = cLBillDetailData2.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                        CLBillDetailData cLBillDetailData3 = cLBillDetailMoreActivity.f28865p0;
                        if (jLongValue2 + ((cLBillDetailData3 == null || (paidServiceFee = cLBillDetailData3.getPaidServiceFee()) == null) ? 0L : paidServiceFee.longValue()) > 0) {
                            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                            O6.c cVar = new O6.c(cLBillDetailMoreActivity);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6596b = d.f(cLBillDetailMoreActivity.getString(k.core_title_attention));
                            int i12 = g.cs_cl_service_fee_description;
                            CLBillDetailData cLBillDetailData4 = cLBillDetailMoreActivity.f28865p0;
                            String str = decimalFormat.format((cLBillDetailData4 == null || (serviceFeeRate = cLBillDetailData4.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                            CLBillDetailData cLBillDetailData5 = cLBillDetailMoreActivity.f28865p0;
                            String strB = r0.B((cLBillDetailData5 == null || (maxServiceFee = cLBillDetailData5.getMaxServiceFee()) == null) ? 0L : maxServiceFee.longValue(), true);
                            CLBillDetailData cLBillDetailData6 = cLBillDetailMoreActivity.f28865p0;
                            if (cLBillDetailData6 != null && (minServiceFee = cLBillDetailData6.getMinServiceFee()) != null) {
                                jLongValue = minServiceFee.longValue();
                            }
                            cVar.f6598d = cLBillDetailMoreActivity.getString(i12, str, strB, r0.B(jLongValue, true));
                            cVar.d(k.core_got_it, null);
                            cVar.a().show();
                            break;
                        }
                        break;
                    case 2:
                        CLBillDetailData cLBillDetailData7 = cLBillDetailMoreActivity.f28865p0;
                        if (cLBillDetailData7 != null && (loanType = cLBillDetailData7.getLoanType()) != null && loanType.intValue() == 2) {
                            Bundle bundle = new Bundle();
                            CLBillDetailData cLBillDetailData8 = cLBillDetailMoreActivity.f28865p0;
                            bundle.putString("loanNo", cLBillDetailData8 != null ? cLBillDetailData8.getSourceLoanNo() : null);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                            break;
                        }
                        break;
                    default:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        Bundle bundle2 = new Bundle();
                        CLBillDetailData cLBillDetailData9 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanNo", cLBillDetailData9 != null ? cLBillDetailData9.getLoanNo() : null);
                        CLBillDetailData cLBillDetailData10 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("largeLoanTerm", String.valueOf(cLBillDetailData10 != null ? cLBillDetailData10.getLargeLoanTerm() : null));
                        CLBillDetailData cLBillDetailData11 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanType", String.valueOf(cLBillDetailData11 != null ? cLBillDetailData11.getLoanType() : null));
                        bundle2.putString(FirebaseAnalytics.Param.INDEX, "1");
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "NormalLoanAgreement");
                        break;
                }
            }
        }, (TextView) value2);
        Object value3 = this.f28857e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42469b;

            {
                this.f42469b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long minServiceFee;
                Long maxServiceFee;
                Double serviceFeeRate;
                Long paidServiceFee;
                Long unpaidServiceFee;
                Integer loanType;
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42469b;
                switch (i11) {
                    case 0:
                        int i12 = CLBillDetailMoreActivity.f28845t0;
                        CLBillDetailData cLBillDetailData = cLBillDetailMoreActivity.f28865p0;
                        new CLInterestDialog(cLBillDetailMoreActivity, cLBillDetailData != null ? cLBillDetailData.getInterestPrompt() : null).show();
                        break;
                    case 1:
                        CLBillDetailData cLBillDetailData2 = cLBillDetailMoreActivity.f28865p0;
                        long jLongValue = 0;
                        long jLongValue2 = (cLBillDetailData2 == null || (unpaidServiceFee = cLBillDetailData2.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                        CLBillDetailData cLBillDetailData3 = cLBillDetailMoreActivity.f28865p0;
                        if (jLongValue2 + ((cLBillDetailData3 == null || (paidServiceFee = cLBillDetailData3.getPaidServiceFee()) == null) ? 0L : paidServiceFee.longValue()) > 0) {
                            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                            O6.c cVar = new O6.c(cLBillDetailMoreActivity);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6596b = d.f(cLBillDetailMoreActivity.getString(k.core_title_attention));
                            int i13 = g.cs_cl_service_fee_description;
                            CLBillDetailData cLBillDetailData4 = cLBillDetailMoreActivity.f28865p0;
                            String str = decimalFormat.format((cLBillDetailData4 == null || (serviceFeeRate = cLBillDetailData4.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                            CLBillDetailData cLBillDetailData5 = cLBillDetailMoreActivity.f28865p0;
                            String strB = r0.B((cLBillDetailData5 == null || (maxServiceFee = cLBillDetailData5.getMaxServiceFee()) == null) ? 0L : maxServiceFee.longValue(), true);
                            CLBillDetailData cLBillDetailData6 = cLBillDetailMoreActivity.f28865p0;
                            if (cLBillDetailData6 != null && (minServiceFee = cLBillDetailData6.getMinServiceFee()) != null) {
                                jLongValue = minServiceFee.longValue();
                            }
                            cVar.f6598d = cLBillDetailMoreActivity.getString(i13, str, strB, r0.B(jLongValue, true));
                            cVar.d(k.core_got_it, null);
                            cVar.a().show();
                            break;
                        }
                        break;
                    case 2:
                        CLBillDetailData cLBillDetailData7 = cLBillDetailMoreActivity.f28865p0;
                        if (cLBillDetailData7 != null && (loanType = cLBillDetailData7.getLoanType()) != null && loanType.intValue() == 2) {
                            Bundle bundle = new Bundle();
                            CLBillDetailData cLBillDetailData8 = cLBillDetailMoreActivity.f28865p0;
                            bundle.putString("loanNo", cLBillDetailData8 != null ? cLBillDetailData8.getSourceLoanNo() : null);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                            break;
                        }
                        break;
                    default:
                        int i14 = CLBillDetailMoreActivity.f28845t0;
                        Bundle bundle2 = new Bundle();
                        CLBillDetailData cLBillDetailData9 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanNo", cLBillDetailData9 != null ? cLBillDetailData9.getLoanNo() : null);
                        CLBillDetailData cLBillDetailData10 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("largeLoanTerm", String.valueOf(cLBillDetailData10 != null ? cLBillDetailData10.getLargeLoanTerm() : null));
                        CLBillDetailData cLBillDetailData11 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanType", String.valueOf(cLBillDetailData11 != null ? cLBillDetailData11.getLoanType() : null));
                        bundle2.putString(FirebaseAnalytics.Param.INDEX, "1");
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "NormalLoanAgreement");
                        break;
                }
            }
        }, (TextView) value3);
        Object value4 = this.f28856d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i12 = 3;
        h.l(new View.OnClickListener(this) { // from class: tb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBillDetailMoreActivity f42469b;

            {
                this.f42469b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long minServiceFee;
                Long maxServiceFee;
                Double serviceFeeRate;
                Long paidServiceFee;
                Long unpaidServiceFee;
                Integer loanType;
                CLBillDetailMoreActivity cLBillDetailMoreActivity = this.f42469b;
                switch (i12) {
                    case 0:
                        int i13 = CLBillDetailMoreActivity.f28845t0;
                        CLBillDetailData cLBillDetailData = cLBillDetailMoreActivity.f28865p0;
                        new CLInterestDialog(cLBillDetailMoreActivity, cLBillDetailData != null ? cLBillDetailData.getInterestPrompt() : null).show();
                        break;
                    case 1:
                        CLBillDetailData cLBillDetailData2 = cLBillDetailMoreActivity.f28865p0;
                        long jLongValue = 0;
                        long jLongValue2 = (cLBillDetailData2 == null || (unpaidServiceFee = cLBillDetailData2.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                        CLBillDetailData cLBillDetailData3 = cLBillDetailMoreActivity.f28865p0;
                        if (jLongValue2 + ((cLBillDetailData3 == null || (paidServiceFee = cLBillDetailData3.getPaidServiceFee()) == null) ? 0L : paidServiceFee.longValue()) > 0) {
                            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                            O6.c cVar = new O6.c(cLBillDetailMoreActivity);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6596b = d.f(cLBillDetailMoreActivity.getString(k.core_title_attention));
                            int i14 = g.cs_cl_service_fee_description;
                            CLBillDetailData cLBillDetailData4 = cLBillDetailMoreActivity.f28865p0;
                            String str = decimalFormat.format((cLBillDetailData4 == null || (serviceFeeRate = cLBillDetailData4.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                            CLBillDetailData cLBillDetailData5 = cLBillDetailMoreActivity.f28865p0;
                            String strB = r0.B((cLBillDetailData5 == null || (maxServiceFee = cLBillDetailData5.getMaxServiceFee()) == null) ? 0L : maxServiceFee.longValue(), true);
                            CLBillDetailData cLBillDetailData6 = cLBillDetailMoreActivity.f28865p0;
                            if (cLBillDetailData6 != null && (minServiceFee = cLBillDetailData6.getMinServiceFee()) != null) {
                                jLongValue = minServiceFee.longValue();
                            }
                            cVar.f6598d = cLBillDetailMoreActivity.getString(i14, str, strB, r0.B(jLongValue, true));
                            cVar.d(k.core_got_it, null);
                            cVar.a().show();
                            break;
                        }
                        break;
                    case 2:
                        CLBillDetailData cLBillDetailData7 = cLBillDetailMoreActivity.f28865p0;
                        if (cLBillDetailData7 != null && (loanType = cLBillDetailData7.getLoanType()) != null && loanType.intValue() == 2) {
                            Bundle bundle = new Bundle();
                            CLBillDetailData cLBillDetailData8 = cLBillDetailMoreActivity.f28865p0;
                            bundle.putString("loanNo", cLBillDetailData8 != null ? cLBillDetailData8.getSourceLoanNo() : null);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                            break;
                        }
                        break;
                    default:
                        int i15 = CLBillDetailMoreActivity.f28845t0;
                        Bundle bundle2 = new Bundle();
                        CLBillDetailData cLBillDetailData9 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanNo", cLBillDetailData9 != null ? cLBillDetailData9.getLoanNo() : null);
                        CLBillDetailData cLBillDetailData10 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("largeLoanTerm", String.valueOf(cLBillDetailData10 != null ? cLBillDetailData10.getLargeLoanTerm() : null));
                        CLBillDetailData cLBillDetailData11 = cLBillDetailMoreActivity.f28865p0;
                        bundle2.putString("loanType", String.valueOf(cLBillDetailData11 != null ? cLBillDetailData11.getLoanType() : null));
                        bundle2.putString(FirebaseAnalytics.Param.INDEX, "1");
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "NormalLoanAgreement");
                        break;
                }
            }
        }, (TextView) value4);
    }
}
