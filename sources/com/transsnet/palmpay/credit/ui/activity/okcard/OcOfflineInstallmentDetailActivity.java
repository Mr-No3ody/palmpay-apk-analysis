package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.rsp.OcOfflineInstallmentBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOfflineInstallmentDetailActivity;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;
import p368yb.F;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC分期详情页", path = "/credit_score/oc_offline_installment_detail_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcOfflineInstallmentDetailActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOfflineInstallmentDetailActivity extends Za.b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f29590L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29591A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public OcOfflineInstallmentBillData f29592B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f29593C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final F f29594H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29598g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29600j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29602p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29604w;

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

    public OcOfflineInstallmentDetailActivity() {
        final int i7 = 3;
        this.f29595d = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i7) {
                    case 0:
                        int i10 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i11 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i12 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i13 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i14 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i10 = 5;
        this.f29596e = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i10) {
                    case 0:
                        int i11 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i12 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i13 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i14 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i11 = 6;
        this.f29597f = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i11) {
                    case 0:
                        int i12 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i13 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i14 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i12 = 7;
        this.f29598g = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i12) {
                    case 0:
                        int i13 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i14 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i13 = 8;
        this.f29599i = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i13) {
                    case 0:
                        int i14 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i14 = 9;
        this.f29600j = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i14) {
                    case 0:
                        int i15 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i15 = 10;
        this.f29601o = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i15) {
                    case 0:
                        int i16 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i115 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i16 = 0;
        this.f29602p = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i16) {
                    case 0:
                        int i17 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i115 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i116 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i17 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i17) {
                    case 0:
                        int i18 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i115 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i116 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i117 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i18 = 2;
        this.f29603v = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i18) {
                    case 0:
                        int i19 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i115 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i116 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i117 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i118 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i19 = 4;
        this.f29604w = C2131j.b(new Function0(this) { // from class: ub.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42903b;

            {
                this.f42903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42903b;
                switch (i19) {
                    case 0:
                        int i110 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i111 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i112 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i113 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (Button) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i114 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (PpTitleBar) ocOfflineInstallmentDetailActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i115 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (LinearLayout) ocOfflineInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i116 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (RecyclerView) ocOfflineInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 7:
                        int i117 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (ProgressBar) ocOfflineInstallmentDetailActivity.findViewById(e.grab_pb);
                    case 8:
                        int i118 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.remain_tv);
                    case 9:
                        int i119 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcOfflineInstallmentDetailActivity.f29590L;
                        return (TextView) ocOfflineInstallmentDetailActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        ArrayList data = new ArrayList();
        this.f29593C = data;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29594H = new F(this, data);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_installment_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        G.h(p221ob.c.f40268a).queryOfflineInstallmentBillDetail(this.f29591A).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 20));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f29591A = getIntent().getStringExtra("oc_installment_order_id");
        t tVar = this.f29597f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(this.f29594H);
        Object value3 = this.f29604w.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView rightTextView = ((PpTitleBar) value3).getRightTextView();
        if (rightTextView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: ub.o0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcOfflineInstallmentDetailActivity f42897b;

                {
                    this.f42897b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42897b;
                    switch (i7) {
                        case 0:
                            int i10 = OcOfflineInstallmentDetailActivity.f29590L;
                            Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD);
                            OcOfflineInstallmentBillData ocOfflineInstallmentBillData = ocOfflineInstallmentDetailActivity.f29592B;
                            postcardWithString.withString("orderNo", ocOfflineInstallmentBillData != null ? ocOfflineInstallmentBillData.getPayId() : null).navigation();
                            break;
                        default:
                            int i11 = OcOfflineInstallmentDetailActivity.f29590L;
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcOfflineInstallmentBillData ocOfflineInstallmentBillData2 = ocOfflineInstallmentDetailActivity.f29592B;
                            Postcard postcardWithLong = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocOfflineInstallmentBillData2 != null ? ocOfflineInstallmentBillData2.getCardNo() : null).withLong("oc_repay_bill_id", 0L);
                            OcOfflineInstallmentBillData ocOfflineInstallmentBillData3 = ocOfflineInstallmentDetailActivity.f29592B;
                            postcardWithLong.withString("oc_repay_order_no", ocOfflineInstallmentBillData3 != null ? ocOfflineInstallmentBillData3.getOrderNo() : null).withString("oc_repay_operate_type", "17").withInt("oc_repay_query_ins_type", 1).navigation(ocOfflineInstallmentDetailActivity);
                            break;
                    }
                }
            }, rightTextView);
        }
        Object value4 = this.f29595d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOfflineInstallmentDetailActivity f42897b;

            {
                this.f42897b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOfflineInstallmentDetailActivity ocOfflineInstallmentDetailActivity = this.f42897b;
                switch (i10) {
                    case 0:
                        int i11 = OcOfflineInstallmentDetailActivity.f29590L;
                        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD);
                        OcOfflineInstallmentBillData ocOfflineInstallmentBillData = ocOfflineInstallmentDetailActivity.f29592B;
                        postcardWithString.withString("orderNo", ocOfflineInstallmentBillData != null ? ocOfflineInstallmentBillData.getPayId() : null).navigation();
                        break;
                    default:
                        int i12 = OcOfflineInstallmentDetailActivity.f29590L;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                        OcOfflineInstallmentBillData ocOfflineInstallmentBillData2 = ocOfflineInstallmentDetailActivity.f29592B;
                        Postcard postcardWithLong = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocOfflineInstallmentBillData2 != null ? ocOfflineInstallmentBillData2.getCardNo() : null).withLong("oc_repay_bill_id", 0L);
                        OcOfflineInstallmentBillData ocOfflineInstallmentBillData3 = ocOfflineInstallmentDetailActivity.f29592B;
                        postcardWithLong.withString("oc_repay_order_no", ocOfflineInstallmentBillData3 != null ? ocOfflineInstallmentBillData3.getOrderNo() : null).withString("oc_repay_operate_type", "17").withInt("oc_repay_query_ins_type", 1).navigation(ocOfflineInstallmentDetailActivity);
                        break;
                }
            }
        }, (Button) value4);
    }
}
