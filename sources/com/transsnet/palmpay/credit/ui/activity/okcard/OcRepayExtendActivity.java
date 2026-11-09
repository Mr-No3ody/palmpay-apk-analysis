package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ab.l;
import C0.G;
import O6.c;
import O6.d;
import Ya.e;
import Ya.g;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.resp.OcExtendBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendActivity;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p071ef.b;
import p284sb.A;
import p298tf.f;
import p310ub.c1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC展期还款页", path = "/credit_score/oc_repay_extend_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayExtendActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExtendActivity extends Za.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f29779C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OcExtendBillData f29780A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29785g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29787j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29789p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f29791w = 0L;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f29781B = TransType.TRANS_TYPE_REPAY_CASH_LOAN;

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

    public OcRepayExtendActivity() {
        final int i7 = 3;
        this.f29782d = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i11 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i12 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i13 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i14 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i10 = 4;
        this.f29783e = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i12 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i13 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i14 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i11 = 5;
        this.f29784f = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i13 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i14 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i12 = 6;
        this.f29785g = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i14 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i13 = 7;
        this.f29786i = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i13) {
                    case 0:
                        int i14 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i14 = 8;
        this.f29787j = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i114 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i15 = 9;
        this.f29788o = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i15) {
                    case 0:
                        int i16 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i114 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i115 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i16 = 0;
        this.f29789p = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i16) {
                    case 0:
                        int i17 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i114 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i115 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i116 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i17 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i17) {
                    case 0:
                        int i18 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i114 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i115 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i116 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i117 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
        final int i18 = 2;
        this.f29790v = C2131j.b(new Function0(this) { // from class: ub.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42822b;

            {
                this.f42822b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendActivity ocRepayExtendActivity = this.f42822b;
                switch (i18) {
                    case 0:
                        int i19 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.currency_tv);
                    case 1:
                        int i110 = OcRepayExtendActivity.f29779C;
                        return (PpTitleBar) ocRepayExtendActivity.findViewById(e.oc_extend_mbt);
                    case 2:
                        int i111 = OcRepayExtendActivity.f29779C;
                        return (RepayStampDutyView) ocRepayExtendActivity.findViewById(e.repayStampDutyView);
                    case 3:
                        int i112 = OcRepayExtendActivity.f29779C;
                        return (Button) ocRepayExtendActivity.findViewById(e.oc_extend_bt);
                    case 4:
                        int i113 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.bottom_tips_tv);
                    case 5:
                        int i114 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_fee_tv);
                    case 6:
                        int i115 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_penalty_tv);
                    case 7:
                        int i116 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_amount_tv);
                    case 8:
                        int i117 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.init_payment_title);
                    default:
                        int i118 = OcRepayExtendActivity.f29779C;
                        return (TextView) ocRepayExtendActivity.findViewById(e.extend_amount_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_extend_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).getExpendData(this.f29791w).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new c1(this, 1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f29791w = Long.valueOf(getIntent().getLongExtra("oc_extend_bill_id", 0L));
        String stringExtra = getIntent().getStringExtra("oc_repay_operate_type");
        if (stringExtra == null) {
            stringExtra = TransType.TRANS_TYPE_REPAY_CASH_LOAN;
        }
        this.f29781B = stringExtra;
        Object value = this.f29789p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(BaseApplication.getCurrencySymbol());
        Object value2 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setRightImageView2ClickListener(new A(29));
        Object value3 = this.f29787j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42827b;

            {
                this.f42827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double extensionDownPaymentRatio;
                int i10 = 0;
                OcRepayExtendActivity ocRepayExtendActivity = this.f42827b;
                switch (i7) {
                    case 0:
                        int i11 = OcRepayExtendActivity.f29779C;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f10 = new F();
                        c cVar = new c(ocRepayExtendActivity);
                        cVar.f6605k = false;
                        cVar.f6596b = d.f(ocRepayExtendActivity.getString(g.cs_initial_dialog_title));
                        cVar.f6606l = 8388611;
                        int i12 = g.cs_initial_payment_total_amount;
                        OcExtendBillData ocExtendBillData = ocRepayExtendActivity.f29780A;
                        cVar.f6598d = ocRepayExtendActivity.getString(i12, decimalFormat.format((ocExtendBillData == null || (extensionDownPaymentRatio = ocExtendBillData.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string = ocRepayExtendActivity.getString(k.core_got_it);
                        l lVar = new l(f10, 7);
                        cVar.f6600f = string;
                        cVar.f6602h = lVar;
                        d dVarA = cVar.a();
                        f10.f38951a = dVarA;
                        dVarA.show();
                        break;
                    default:
                        int i13 = OcRepayExtendActivity.f29779C;
                        F6.d.h(ocRepayExtendActivity.TAG, 3, "createOrder >>>");
                        ocRepayExtendActivity.showLoadingDialog(true);
                        OcExtendBillData ocExtendBillData2 = ocRepayExtendActivity.f29780A;
                        Long extensionAmount = ocExtendBillData2 != null ? ocExtendBillData2.getExtensionAmount() : null;
                        OcExtendBillData ocExtendBillData3 = ocRepayExtendActivity.f29780A;
                        String cardNo = ocExtendBillData3 != null ? ocExtendBillData3.getCardNo() : null;
                        String strValueOf = String.valueOf(ocRepayExtendActivity.f29791w);
                        String str = ocRepayExtendActivity.f29781B;
                        Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                        OcExtendBillData ocExtendBillData4 = ocRepayExtendActivity.f29780A;
                        OcOrderReq ocOrderReq = new OcOrderReq(extensionAmount, cardNo, strValueOf, TransType.TRANS_TYPE_OK_CARD_EXTEND, numValueOf, ocExtendBillData4 != null ? ocExtendBillData4.getOrderNo() : null, null, 64, null);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new c1(ocRepayExtendActivity, i10));
                        break;
                }
            }
        }, (TextView) value3);
        Object value4 = this.f29782d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendActivity f42827b;

            {
                this.f42827b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Double extensionDownPaymentRatio;
                int i11 = 0;
                OcRepayExtendActivity ocRepayExtendActivity = this.f42827b;
                switch (i10) {
                    case 0:
                        int i12 = OcRepayExtendActivity.f29779C;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f10 = new F();
                        c cVar = new c(ocRepayExtendActivity);
                        cVar.f6605k = false;
                        cVar.f6596b = d.f(ocRepayExtendActivity.getString(g.cs_initial_dialog_title));
                        cVar.f6606l = 8388611;
                        int i13 = g.cs_initial_payment_total_amount;
                        OcExtendBillData ocExtendBillData = ocRepayExtendActivity.f29780A;
                        cVar.f6598d = ocRepayExtendActivity.getString(i13, decimalFormat.format((ocExtendBillData == null || (extensionDownPaymentRatio = ocExtendBillData.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string = ocRepayExtendActivity.getString(k.core_got_it);
                        l lVar = new l(f10, 7);
                        cVar.f6600f = string;
                        cVar.f6602h = lVar;
                        d dVarA = cVar.a();
                        f10.f38951a = dVarA;
                        dVarA.show();
                        break;
                    default:
                        int i14 = OcRepayExtendActivity.f29779C;
                        F6.d.h(ocRepayExtendActivity.TAG, 3, "createOrder >>>");
                        ocRepayExtendActivity.showLoadingDialog(true);
                        OcExtendBillData ocExtendBillData2 = ocRepayExtendActivity.f29780A;
                        Long extensionAmount = ocExtendBillData2 != null ? ocExtendBillData2.getExtensionAmount() : null;
                        OcExtendBillData ocExtendBillData3 = ocRepayExtendActivity.f29780A;
                        String cardNo = ocExtendBillData3 != null ? ocExtendBillData3.getCardNo() : null;
                        String strValueOf = String.valueOf(ocRepayExtendActivity.f29791w);
                        String str = ocRepayExtendActivity.f29781B;
                        Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                        OcExtendBillData ocExtendBillData4 = ocRepayExtendActivity.f29780A;
                        OcOrderReq ocOrderReq = new OcOrderReq(extensionAmount, cardNo, strValueOf, TransType.TRANS_TYPE_OK_CARD_EXTEND, numValueOf, ocExtendBillData4 != null ? ocExtendBillData4.getOrderNo() : null, null, 64, null);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new c1(ocRepayExtendActivity, i11));
                        break;
                }
            }
        }, (Button) value4);
    }
}
