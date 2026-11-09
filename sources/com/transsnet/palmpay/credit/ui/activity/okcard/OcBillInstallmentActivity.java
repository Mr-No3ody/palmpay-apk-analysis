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
import com.transsnet.palmpay.credit.bean.rsp.OcBillInstallmentBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillInstallmentActivity;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2148p;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC分期账单页", path = "/credit_score/oc_bill_installment_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcBillInstallmentActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillInstallmentActivity extends Za.b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f29363L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29364A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public OcBillInstallmentBillData f29365B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f29366C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C2148p f29367H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29371g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29373j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29375p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29377w;

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

    public OcBillInstallmentActivity() {
        final int i7 = 3;
        this.f29368d = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i7) {
                    case 0:
                        int i10 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i11 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i12 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i13 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i14 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i10 = 5;
        this.f29369e = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i12 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i13 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i14 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i11 = 6;
        this.f29370f = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i11) {
                    case 0:
                        int i12 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i13 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i14 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i12 = 7;
        this.f29371g = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i12) {
                    case 0:
                        int i13 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i14 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i13 = 8;
        this.f29372i = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i13) {
                    case 0:
                        int i14 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i14 = 9;
        this.f29373j = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i14) {
                    case 0:
                        int i15 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i15 = 10;
        this.f29374o = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i15) {
                    case 0:
                        int i16 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i115 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i16 = 0;
        this.f29375p = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i16) {
                    case 0:
                        int i17 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i115 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i116 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i17 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i17) {
                    case 0:
                        int i18 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i115 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i116 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i117 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i18 = 2;
        this.f29376v = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i18) {
                    case 0:
                        int i19 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i115 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i116 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i117 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i118 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        final int i19 = 4;
        this.f29377w = C2131j.b(new Function0(this) { // from class: ub.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42737b;

            {
                this.f42737b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42737b;
                switch (i19) {
                    case 0:
                        int i110 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.principal_amount_tv);
                    case 1:
                        int i111 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.pay_in_tv);
                    case 2:
                        int i112 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.total_installment_amount_tv);
                    case 3:
                        int i113 = OcBillInstallmentActivity.f29363L;
                        return (Button) ocBillInstallmentActivity.findViewById(e.oc_installment_pay_bt);
                    case 4:
                        int i114 = OcBillInstallmentActivity.f29363L;
                        return (PpTitleBar) ocBillInstallmentActivity.findViewById(e.oc_installment_detail_mtb);
                    case 5:
                        int i115 = OcBillInstallmentActivity.f29363L;
                        return (LinearLayout) ocBillInstallmentActivity.findViewById(e.installment_repay_ll);
                    case 6:
                        int i116 = OcBillInstallmentActivity.f29363L;
                        return (RecyclerView) ocBillInstallmentActivity.findViewById(e.installment_rv);
                    case 7:
                        int i117 = OcBillInstallmentActivity.f29363L;
                        return (ProgressBar) ocBillInstallmentActivity.findViewById(e.grab_pb);
                    case 8:
                        int i118 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.remain_tv);
                    case 9:
                        int i119 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.paid_off_tv);
                    default:
                        int i20 = OcBillInstallmentActivity.f29363L;
                        return (TextView) ocBillInstallmentActivity.findViewById(e.service_fee_amount_tv);
                }
            }
        });
        ArrayList data = new ArrayList();
        this.f29366C = data;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29367H = new C2148p(this, data);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_bill_installment_bill_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        G.h(p221ob.c.f40268a).queryBillInstallmentData(this.f29364A).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 10));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f29364A = getIntent().getStringExtra("oc_bill_installment_order_id");
        t tVar = this.f29377w;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).getRightTextView().setTextColor(getColor(Ya.b.cs_oc_detail_txt_color));
        t tVar2 = this.f29370f;
        Object value2 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(this.f29367H);
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView rightTextView = ((PpTitleBar) value4).getRightTextView();
        Intrinsics.checkNotNullExpressionValue(rightTextView, "getRightTextView(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42733b;

            {
                this.f42733b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42733b;
                switch (i7) {
                    case 0:
                        int i10 = OcBillInstallmentActivity.f29363L;
                        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD);
                        OcBillInstallmentBillData ocBillInstallmentBillData = ocBillInstallmentActivity.f29365B;
                        postcardWithString.withString("orderNo", ocBillInstallmentBillData != null ? ocBillInstallmentBillData.getPayId() : null).navigation();
                        break;
                    default:
                        int i11 = OcBillInstallmentActivity.f29363L;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                        OcBillInstallmentBillData ocBillInstallmentBillData2 = ocBillInstallmentActivity.f29365B;
                        Postcard postcardWithLong = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocBillInstallmentBillData2 != null ? ocBillInstallmentBillData2.getCardNo() : null).withLong("oc_repay_bill_id", 0L);
                        OcBillInstallmentBillData ocBillInstallmentBillData3 = ocBillInstallmentActivity.f29365B;
                        postcardWithLong.withString("oc_repay_order_no", ocBillInstallmentBillData3 != null ? ocBillInstallmentBillData3.getOrderNo() : null).withString("oc_repay_operate_type", TransType.TRANS_TYPE_MERCHANT_PAYMENT).withInt("oc_repay_query_ins_type", 2).navigation(ocBillInstallmentActivity);
                        break;
                }
            }
        }, rightTextView);
        Object value5 = this.f29368d.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillInstallmentActivity f42733b;

            {
                this.f42733b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcBillInstallmentActivity ocBillInstallmentActivity = this.f42733b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillInstallmentActivity.f29363L;
                        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD);
                        OcBillInstallmentBillData ocBillInstallmentBillData = ocBillInstallmentActivity.f29365B;
                        postcardWithString.withString("orderNo", ocBillInstallmentBillData != null ? ocBillInstallmentBillData.getPayId() : null).navigation();
                        break;
                    default:
                        int i12 = OcBillInstallmentActivity.f29363L;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                        OcBillInstallmentBillData ocBillInstallmentBillData2 = ocBillInstallmentActivity.f29365B;
                        Postcard postcardWithLong = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocBillInstallmentBillData2 != null ? ocBillInstallmentBillData2.getCardNo() : null).withLong("oc_repay_bill_id", 0L);
                        OcBillInstallmentBillData ocBillInstallmentBillData3 = ocBillInstallmentActivity.f29365B;
                        postcardWithLong.withString("oc_repay_order_no", ocBillInstallmentBillData3 != null ? ocBillInstallmentBillData3.getOrderNo() : null).withString("oc_repay_operate_type", TransType.TRANS_TYPE_MERCHANT_PAYMENT).withInt("oc_repay_query_ins_type", 2).navigation(ocBillInstallmentActivity);
                        break;
                }
            }
        }, (Button) value5);
    }
}
