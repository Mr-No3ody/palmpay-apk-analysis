package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.C0525w;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.bean.rsp.AllBillDetail;
import com.transsnet.palmpay.credit.bean.rsp.OcAllBillListData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2135c;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC总账单页", path = "/credit_score/oc_all_bill_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcAllBillActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcAllBillActivity extends Za.b {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f29226Z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f29227A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f29228B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f29229C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C2135c f29230H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C2135c f29231L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C2135c f29232M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f29233Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f29234X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public OcAllBillListData f29235Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29239g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29241j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29243p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29245w;

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

    public OcAllBillActivity() {
        final int i7 = 0;
        this.f29236d = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i7) {
                    case 0:
                        int i10 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i11 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i12 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i13 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i14 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i10 = 3;
        this.f29237e = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i10) {
                    case 0:
                        int i11 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i12 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i13 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i14 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i11 = 4;
        this.f29238f = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i11) {
                    case 0:
                        int i12 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i13 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i14 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i12 = 5;
        this.f29239g = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i12) {
                    case 0:
                        int i13 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i14 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i13 = 6;
        this.f29240i = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i13) {
                    case 0:
                        int i14 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i14 = 7;
        this.f29241j = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i14) {
                    case 0:
                        int i15 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i15 = 8;
        this.f29242o = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i15) {
                    case 0:
                        int i16 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i115 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i16 = 9;
        this.f29243p = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i16) {
                    case 0:
                        int i17 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i115 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i116 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i17 = 10;
        this.t = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i17) {
                    case 0:
                        int i18 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i115 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i116 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i117 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i18 = 1;
        this.f29244v = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i18) {
                    case 0:
                        int i19 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i115 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i116 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i117 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i118 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        final int i19 = 2;
        this.f29245w = C2131j.b(new Function0(this) { // from class: ub.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42841b;

            {
                this.f42841b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAllBillActivity ocAllBillActivity = this.f42841b;
                switch (i19) {
                    case 0:
                        int i110 = OcAllBillActivity.f29226Z;
                        return (Button) ocAllBillActivity.findViewById(e.oc_all_pay_bt);
                    case 1:
                        int i111 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.all_outstanding_tv);
                    case 2:
                        int i112 = OcAllBillActivity.f29226Z;
                        return (PpTitleBar) ocAllBillActivity.findViewById(e.oc_all_bill_mtb);
                    case 3:
                        int i113 = OcAllBillActivity.f29226Z;
                        return (LinearLayout) ocAllBillActivity.findViewById(e.all_bill_repay_ll);
                    case 4:
                        int i114 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.unpaid_rv);
                    case 5:
                        int i115 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.unpaid_bill_title_tv);
                    case 6:
                        int i116 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.current_bill_rv);
                    case 7:
                        int i117 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.cur_bill_title_tv);
                    case 8:
                        int i118 = OcAllBillActivity.f29226Z;
                        return (RecyclerView) ocAllBillActivity.findViewById(e.outstanding_rv);
                    case 9:
                        int i119 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.outstanding_bill_title_tv);
                    default:
                        int i20 = OcAllBillActivity.f29226Z;
                        return (TextView) ocAllBillActivity.findViewById(e.bill_count_tv);
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f29227A = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f29228B = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f29229C = arrayList3;
        this.f29230H = new C2135c(this, arrayList, 0);
        this.f29231L = new C2135c(this, arrayList2, 1);
        this.f29232M = new C2135c(this, arrayList3, 2);
        this.f29233Q = "oc_all_bill";
    }

    public static final void m(OcAllBillActivity ocAllBillActivity, AllBillDetail allBillDetail) {
        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_bill_activity").withString("oc_card_no", ocAllBillActivity.f29234X);
        Long id2 = allBillDetail.getId();
        Postcard postcardWithLong = postcardWithString.withLong("oc_bill_id", id2 != null ? id2.longValue() : 0L);
        Long repaymentDateStamp = allBillDetail.getRepaymentDateStamp();
        postcardWithLong.withLong("oc_future_repayment_date", repaymentDateStamp != null ? repaymentDateStamp.longValue() : 0L).navigation(ocAllBillActivity);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_all_bill_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final TextView n() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView o() {
        Object value = this.f29240i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final PpTitleBar p() {
        Object value = this.f29245w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).queryAllBillList(this.f29234X, Boolean.valueOf(Intrinsics.c(this.f29233Q, "oc_all_bill"))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 8));
    }

    public final RecyclerView q() {
        Object value = this.f29242o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final RecyclerView r() {
        Object value = this.f29238f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        String stringExtra = getIntent().getStringExtra("oc_bill_list_type");
        if (stringExtra == null) {
            stringExtra = "oc_all_bill";
        }
        this.f29233Q = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("oc_card_no");
        this.f29234X = stringExtra2;
        F6.d.h(this.TAG, 3, G.p("mBillType=", this.f29233Q, ", mCardNo=", stringExtra2));
        p().getRightTextView().setTextColor(getColor(Ya.b.cs_oc_top_right_txt_color));
        o().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerViewO = o();
        C2135c c2135c = this.f29230H;
        recyclerViewO.setAdapter(c2135c);
        r().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerViewR = r();
        C2135c c2135c2 = this.f29231L;
        recyclerViewR.setAdapter(c2135c2);
        q().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerViewQ = q();
        C2135c c2135c3 = this.f29232M;
        recyclerViewQ.setAdapter(c2135c3);
        if (Intrinsics.c(this.f29233Q, "oc_all_bill")) {
            p().setTitle(getString(Ya.g.cs_all_bills));
        } else {
            p().setTitle(getString(Ya.g.cs_due_bills));
        }
        final int i7 = 0;
        p().setRightTextViewClickListener(new View.OnClickListener(this) { // from class: ub.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42847b;

            {
                this.f42847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcAllBillActivity ocAllBillActivity = this.f42847b;
                switch (i7) {
                    case 0:
                        int i10 = OcAllBillActivity.f29226Z;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocAllBillActivity);
                        break;
                    default:
                        if (!Intrinsics.c(ocAllBillActivity.f29233Q, "oc_all_bill")) {
                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocAllBillActivity.f29234X).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocAllBillActivity);
                        } else {
                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocAllBillActivity.f29234X).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).withString("oc_all_repay_scope_type", "oc_repay_all").navigation(ocAllBillActivity);
                        }
                        break;
                }
            }
        });
        Oe.a itemClickListener = new Oe.a(this, 26);
        c2135c.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        c2135c.f4993c = itemClickListener;
        C0525w itemClickListener2 = new C0525w(this, 29);
        c2135c2.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener2, "itemClickListener");
        c2135c2.f4993c = itemClickListener2;
        Sd.b itemClickListener3 = new Sd.b(this, 27);
        c2135c3.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener3, "itemClickListener");
        c2135c3.f4993c = itemClickListener3;
        Object value = this.f29236d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAllBillActivity f42847b;

            {
                this.f42847b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcAllBillActivity ocAllBillActivity = this.f42847b;
                switch (i10) {
                    case 0:
                        int i11 = OcAllBillActivity.f29226Z;
                        ARouter.getInstance().build("/credit_score/oc_bill_history_activity").navigation(ocAllBillActivity);
                        break;
                    default:
                        if (!Intrinsics.c(ocAllBillActivity.f29233Q, "oc_all_bill")) {
                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocAllBillActivity.f29234X).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).navigation(ocAllBillActivity);
                        } else {
                            ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocAllBillActivity.f29234X).withLong("oc_repay_bill_id", 0L).withString("oc_repay_order_no", null).withString("oc_all_repay_scope_type", "oc_repay_all").navigation(ocAllBillActivity);
                        }
                        break;
                }
            }
        }, (Button) value);
    }
}
