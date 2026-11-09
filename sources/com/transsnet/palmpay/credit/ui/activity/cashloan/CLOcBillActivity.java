package com.transsnet.palmpay.credit.ui.activity.cashloan;

import N8.q0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.rsp.CLMainOkCardBill;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOcBillActivity;
import com.transsnet.palmpay.util.BarUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p285sc.x;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit Ok卡账单页", path = "/credit_score/cl_oc_bill_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLOcBillActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOcBillActivity extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f28948o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28952g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CLMainOkCardBill f28954j;

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

    public CLOcBillActivity() {
        final int i7 = 0;
        this.f28949d = C2131j.b(new Function0(this) { // from class: tb.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillActivity f42518b;

            {
                this.f42518b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOcBillActivity cLOcBillActivity = this.f42518b;
                switch (i7) {
                    case 0:
                        int i10 = CLOcBillActivity.f28948o;
                        return (Button) cLOcBillActivity.findViewById(e.oc_repay_bt);
                    case 1:
                        int i11 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 2:
                        int i12 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_overdue_days_tv);
                    case 3:
                        int i13 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_due_date_tv);
                    default:
                        int i14 = CLOcBillActivity.f28948o;
                        return (ConstraintLayout) cLOcBillActivity.findViewById(e.oc_bill_view);
                }
            }
        });
        final int i10 = 1;
        this.f28950e = C2131j.b(new Function0(this) { // from class: tb.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillActivity f42518b;

            {
                this.f42518b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOcBillActivity cLOcBillActivity = this.f42518b;
                switch (i10) {
                    case 0:
                        int i11 = CLOcBillActivity.f28948o;
                        return (Button) cLOcBillActivity.findViewById(e.oc_repay_bt);
                    case 1:
                        int i12 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 2:
                        int i13 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_overdue_days_tv);
                    case 3:
                        int i14 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_due_date_tv);
                    default:
                        int i15 = CLOcBillActivity.f28948o;
                        return (ConstraintLayout) cLOcBillActivity.findViewById(e.oc_bill_view);
                }
            }
        });
        final int i11 = 2;
        this.f28951f = C2131j.b(new Function0(this) { // from class: tb.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillActivity f42518b;

            {
                this.f42518b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOcBillActivity cLOcBillActivity = this.f42518b;
                switch (i11) {
                    case 0:
                        int i12 = CLOcBillActivity.f28948o;
                        return (Button) cLOcBillActivity.findViewById(e.oc_repay_bt);
                    case 1:
                        int i13 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 2:
                        int i14 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_overdue_days_tv);
                    case 3:
                        int i15 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_due_date_tv);
                    default:
                        int i16 = CLOcBillActivity.f28948o;
                        return (ConstraintLayout) cLOcBillActivity.findViewById(e.oc_bill_view);
                }
            }
        });
        final int i12 = 3;
        this.f28952g = C2131j.b(new Function0(this) { // from class: tb.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillActivity f42518b;

            {
                this.f42518b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOcBillActivity cLOcBillActivity = this.f42518b;
                switch (i12) {
                    case 0:
                        int i13 = CLOcBillActivity.f28948o;
                        return (Button) cLOcBillActivity.findViewById(e.oc_repay_bt);
                    case 1:
                        int i14 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 2:
                        int i15 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_overdue_days_tv);
                    case 3:
                        int i16 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_due_date_tv);
                    default:
                        int i17 = CLOcBillActivity.f28948o;
                        return (ConstraintLayout) cLOcBillActivity.findViewById(e.oc_bill_view);
                }
            }
        });
        final int i13 = 4;
        this.f28953i = C2131j.b(new Function0(this) { // from class: tb.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillActivity f42518b;

            {
                this.f42518b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOcBillActivity cLOcBillActivity = this.f42518b;
                switch (i13) {
                    case 0:
                        int i14 = CLOcBillActivity.f28948o;
                        return (Button) cLOcBillActivity.findViewById(e.oc_repay_bt);
                    case 1:
                        int i15 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 2:
                        int i16 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_overdue_days_tv);
                    case 3:
                        int i17 = CLOcBillActivity.f28948o;
                        return (TextView) cLOcBillActivity.findViewById(e.oc_due_date_tv);
                    default:
                        int i18 = CLOcBillActivity.f28948o;
                        return (ConstraintLayout) cLOcBillActivity.findViewById(e.oc_bill_view);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_oc_bill_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(BaseApplication.getContext().getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String stringExtra = getIntent().getStringExtra("cl_oc_bill_data");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f28954j = (CLMainOkCardBill) d0.l(CLMainOkCardBill.class, stringExtra);
        }
        CLMainOkCardBill cLMainOkCardBill = this.f28954j;
        if (cLMainOkCardBill != null) {
            Long repaymentDateStamp = cLMainOkCardBill.getRepaymentDateStamp();
            long jLongValue = repaymentDateStamp != null ? repaymentDateStamp.longValue() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            t tVar = this.f28951f;
            if (jLongValue < jCurrentTimeMillis) {
                Long repaymentDateStamp2 = cLMainOkCardBill.getRepaymentDateStamp();
                long jLongValue2 = repaymentDateStamp2 != null ? repaymentDateStamp2.longValue() : 0L;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(jLongValue2));
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                long jC = (q0.c(calendar2, 13, 0, 14, 0) - calendar.getTimeInMillis()) / ((long) 86400000);
                Object value = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(getString(g.cs_oc_overdue_day, Long.valueOf(jC)));
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((TextView) value2).setVisibility(0);
            } else {
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((TextView) value3).setVisibility(8);
            }
            Object value4 = this.f28952g.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setText(r0.X1(cLMainOkCardBill.getRepaymentDateStamp(), "dd MMM"));
            Object value5 = this.f28950e.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            TextView textView = (TextView) value5;
            Long outstandingAmount = cLMainOkCardBill.getOutstandingAmount();
            textView.setText(r0.B(outstandingAmount != null ? outstandingAmount.longValue() : 0L, true));
            Object value6 = this.f28953i.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((ConstraintLayout) value6).setVisibility(0);
        }
        Object value7 = this.f28949d.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        h.l(new x(this, 9), (Button) value7);
    }
}
