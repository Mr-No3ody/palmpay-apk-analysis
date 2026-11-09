package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Ya.e;
import Ya.f;
import Za.b;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.bean.resp.OcClOverdueBillData;
import com.transsnet.palmpay.credit.bean.resp.OverdueCashLoanDetail;
import com.transsnet.palmpay.credit.bean.resp.OverdueOkCardDetail;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTotalOverdueActivity;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.util.BarUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p221ob.c;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit总逾期页", path = "/credit_score/cs_cl_total_overdue_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLTotalOverdueActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTotalOverdueActivity extends b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f29161B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OcClOverdueBillData f29162A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29166g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29168j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29170p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29172w;

    public CLTotalOverdueActivity() {
        final int i7 = 4;
        this.f29163d = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i7) {
                    case 0:
                        int i10 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i11 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i12 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i13 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i14 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i10 = 6;
        this.f29164e = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i10) {
                    case 0:
                        int i11 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i12 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i13 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i14 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i11 = 7;
        this.f29165f = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i11) {
                    case 0:
                        int i12 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i13 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i14 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i12 = 8;
        this.f29166g = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i12) {
                    case 0:
                        int i13 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i14 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i13 = 9;
        this.f29167i = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i13) {
                    case 0:
                        int i14 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i14 = 10;
        this.f29168j = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i14) {
                    case 0:
                        int i15 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i15 = 0;
        this.f29169o = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i15) {
                    case 0:
                        int i16 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i115 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i16 = 1;
        this.f29170p = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i16) {
                    case 0:
                        int i17 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i115 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i116 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i17 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i17) {
                    case 0:
                        int i18 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i115 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i116 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i117 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i18 = 3;
        this.f29171v = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i18) {
                    case 0:
                        int i19 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i115 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i116 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i117 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i118 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
        final int i19 = 5;
        this.f29172w = C2131j.b(new Function0(this) { // from class: tb.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42520b;

            {
                this.f42520b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42520b;
                switch (i19) {
                    case 0:
                        int i110 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_outstanding_amount_tv);
                    case 1:
                        int i111 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_overdue_days_tv);
                    case 2:
                        int i112 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.oc_due_date_tv);
                    case 3:
                        int i113 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.oc_bill_view);
                    case 4:
                        int i114 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.cl_repay_bt);
                    case 5:
                        int i115 = CLTotalOverdueActivity.f29161B;
                        return (PpTitleBar) cLTotalOverdueActivity.findViewById(e.cl_upgrade_service_mtb);
                    case 6:
                        int i116 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_outstanding_amount_tv);
                    case 7:
                        int i117 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_overdue_days_tv);
                    case 8:
                        int i118 = CLTotalOverdueActivity.f29161B;
                        return (TextView) cLTotalOverdueActivity.findViewById(e.cl_due_date_tv);
                    case 9:
                        int i119 = CLTotalOverdueActivity.f29161B;
                        return (ConstraintLayout) cLTotalOverdueActivity.findViewById(e.cl_bill_view);
                    default:
                        int i20 = CLTotalOverdueActivity.f29161B;
                        return (Button) cLTotalOverdueActivity.findViewById(e.oc_repay_bt);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_total_overdue_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().getOcCLOverdueBill().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 5));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(Ya.b.cs_common_bg_color));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        t tVar = this.f29172w;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setBackgroundColor(getColor(Ya.b.cs_common_bg_color));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i7 = 0;
        ((PpTitleBar) value2).setBackButtonClickListener(new View.OnClickListener(this) { // from class: tb.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42516b;

            {
                this.f42516b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<OverdueOkCardDetail> overdueListOkCard;
                OverdueOkCardDetail overdueOkCardDetail;
                List<OverdueCashLoanDetail> overdueListCashLoan;
                OverdueCashLoanDetail overdueCashLoanDetail;
                Long id2 = null;
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42516b;
                switch (i7) {
                    case 0:
                        int i10 = CLTotalOverdueActivity.f29161B;
                        cLTotalOverdueActivity.finish();
                        break;
                    case 1:
                        OcClOverdueBillData ocClOverdueBillData = cLTotalOverdueActivity.f29162A;
                        List<OverdueOkCardDetail> overdueListOkCard2 = ocClOverdueBillData != null ? ocClOverdueBillData.getOverdueListOkCard() : null;
                        if (overdueListOkCard2 != null && !overdueListOkCard2.isEmpty()) {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcClOverdueBillData ocClOverdueBillData2 = cLTotalOverdueActivity.f29162A;
                            postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, (ocClOverdueBillData2 == null || (overdueListOkCard = ocClOverdueBillData2.getOverdueListOkCard()) == null || (overdueOkCardDetail = overdueListOkCard.get(0)) == null) ? null : overdueOkCardDetail.getCardNo()).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).withString("oc_all_repay_scope_type", "oc_repay_all").navigation(cLTotalOverdueActivity);
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                    default:
                        OcClOverdueBillData ocClOverdueBillData3 = cLTotalOverdueActivity.f29162A;
                        List<OverdueCashLoanDetail> overdueListCashLoan2 = ocClOverdueBillData3 != null ? ocClOverdueBillData3.getOverdueListCashLoan() : null;
                        if (overdueListCashLoan2 != null && !overdueListCashLoan2.isEmpty()) {
                            Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                            OcClOverdueBillData ocClOverdueBillData4 = cLTotalOverdueActivity.f29162A;
                            if (ocClOverdueBillData4 != null && (overdueListCashLoan = ocClOverdueBillData4.getOverdueListCashLoan()) != null && (overdueCashLoanDetail = overdueListCashLoan.get(0)) != null) {
                                id2 = overdueCashLoanDetail.getId();
                            }
                            postcardBuild2.withString("cl_repayment_bill_id", String.valueOf(id2)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                }
            }
        });
        Object value3 = this.f29168j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42516b;

            {
                this.f42516b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<OverdueOkCardDetail> overdueListOkCard;
                OverdueOkCardDetail overdueOkCardDetail;
                List<OverdueCashLoanDetail> overdueListCashLoan;
                OverdueCashLoanDetail overdueCashLoanDetail;
                Long id2 = null;
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42516b;
                switch (i10) {
                    case 0:
                        int i11 = CLTotalOverdueActivity.f29161B;
                        cLTotalOverdueActivity.finish();
                        break;
                    case 1:
                        OcClOverdueBillData ocClOverdueBillData = cLTotalOverdueActivity.f29162A;
                        List<OverdueOkCardDetail> overdueListOkCard2 = ocClOverdueBillData != null ? ocClOverdueBillData.getOverdueListOkCard() : null;
                        if (overdueListOkCard2 != null && !overdueListOkCard2.isEmpty()) {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcClOverdueBillData ocClOverdueBillData2 = cLTotalOverdueActivity.f29162A;
                            postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, (ocClOverdueBillData2 == null || (overdueListOkCard = ocClOverdueBillData2.getOverdueListOkCard()) == null || (overdueOkCardDetail = overdueListOkCard.get(0)) == null) ? null : overdueOkCardDetail.getCardNo()).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).withString("oc_all_repay_scope_type", "oc_repay_all").navigation(cLTotalOverdueActivity);
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                    default:
                        OcClOverdueBillData ocClOverdueBillData3 = cLTotalOverdueActivity.f29162A;
                        List<OverdueCashLoanDetail> overdueListCashLoan2 = ocClOverdueBillData3 != null ? ocClOverdueBillData3.getOverdueListCashLoan() : null;
                        if (overdueListCashLoan2 != null && !overdueListCashLoan2.isEmpty()) {
                            Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                            OcClOverdueBillData ocClOverdueBillData4 = cLTotalOverdueActivity.f29162A;
                            if (ocClOverdueBillData4 != null && (overdueListCashLoan = ocClOverdueBillData4.getOverdueListCashLoan()) != null && (overdueCashLoanDetail = overdueListCashLoan.get(0)) != null) {
                                id2 = overdueCashLoanDetail.getId();
                            }
                            postcardBuild2.withString("cl_repayment_bill_id", String.valueOf(id2)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                }
            }
        }, (Button) value3);
        Object value4 = this.f29163d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTotalOverdueActivity f42516b;

            {
                this.f42516b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<OverdueOkCardDetail> overdueListOkCard;
                OverdueOkCardDetail overdueOkCardDetail;
                List<OverdueCashLoanDetail> overdueListCashLoan;
                OverdueCashLoanDetail overdueCashLoanDetail;
                Long id2 = null;
                CLTotalOverdueActivity cLTotalOverdueActivity = this.f42516b;
                switch (i11) {
                    case 0:
                        int i12 = CLTotalOverdueActivity.f29161B;
                        cLTotalOverdueActivity.finish();
                        break;
                    case 1:
                        OcClOverdueBillData ocClOverdueBillData = cLTotalOverdueActivity.f29162A;
                        List<OverdueOkCardDetail> overdueListOkCard2 = ocClOverdueBillData != null ? ocClOverdueBillData.getOverdueListOkCard() : null;
                        if (overdueListOkCard2 != null && !overdueListOkCard2.isEmpty()) {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcClOverdueBillData ocClOverdueBillData2 = cLTotalOverdueActivity.f29162A;
                            postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, (ocClOverdueBillData2 == null || (overdueListOkCard = ocClOverdueBillData2.getOverdueListOkCard()) == null || (overdueOkCardDetail = overdueListOkCard.get(0)) == null) ? null : overdueOkCardDetail.getCardNo()).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).withString("oc_all_repay_scope_type", "oc_repay_all").navigation(cLTotalOverdueActivity);
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                    default:
                        OcClOverdueBillData ocClOverdueBillData3 = cLTotalOverdueActivity.f29162A;
                        List<OverdueCashLoanDetail> overdueListCashLoan2 = ocClOverdueBillData3 != null ? ocClOverdueBillData3.getOverdueListCashLoan() : null;
                        if (overdueListCashLoan2 != null && !overdueListCashLoan2.isEmpty()) {
                            Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                            OcClOverdueBillData ocClOverdueBillData4 = cLTotalOverdueActivity.f29162A;
                            if (ocClOverdueBillData4 != null && (overdueListCashLoan = ocClOverdueBillData4.getOverdueListCashLoan()) != null && (overdueCashLoanDetail = overdueListCashLoan.get(0)) != null) {
                                id2 = overdueCashLoanDetail.getId();
                            }
                            postcardBuild2.withString("cl_repayment_bill_id", String.valueOf(id2)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                        }
                        cLTotalOverdueActivity.finish();
                        break;
                }
            }
        }, (Button) value4);
    }
}
