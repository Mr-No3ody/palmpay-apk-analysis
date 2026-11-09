package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.req.CLBillDetailReq;
import com.transsnet.palmpay.credit.bean.resp.CLBillDetailData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentDetailActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p220oa.h;
import p294tb.C2055q;
import p351xb.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit大额分期借款详情页", path = "/credit_score/cl_ins_detail_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLInstallmentDetailActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentDetailActivity extends b {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f28901x0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28902A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28903B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28904C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28905H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28906L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28907M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28908Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28909X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28910Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f28911Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28915g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28917j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f28918k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28920p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f28921p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f28922q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f28923r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f28924s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f28925t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CLBillDetailData f28926u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28927v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ArrayList f28928v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28929w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final o f28930w0;

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

    public CLInstallmentDetailActivity() {
        final int i7 = 21;
        this.f28912d = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i7) {
                    case 0:
                        int i10 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i11 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i10 = 6;
        this.f28913e = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i10) {
                    case 0:
                        int i11 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i11 = 13;
        this.f28914f = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i11) {
                    case 0:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i12 = 14;
        this.f28915g = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i12) {
                    case 0:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i13 = 15;
        this.f28916i = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i13) {
                    case 0:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i14 = 16;
        this.f28917j = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i14) {
                    case 0:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i15 = 17;
        this.f28919o = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i15) {
                    case 0:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i16 = 18;
        this.f28920p = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i16) {
                    case 0:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i17 = 19;
        this.t = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i17) {
                    case 0:
                        int i18 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i18 = 20;
        this.f28927v = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i18) {
                    case 0:
                        int i19 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i19 = 22;
        this.f28929w = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i19) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i20 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i20 = 23;
        this.f28902A = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i20) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i21 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i21 = 24;
        this.f28903B = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i21) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i22 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i22 = 25;
        this.f28904C = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i22) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i23 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i23 = 0;
        this.f28905H = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i23) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i24 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i24 = 1;
        this.f28906L = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i24) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i25 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i25 = 2;
        this.f28907M = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i25) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i26 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i26 = 3;
        this.f28908Q = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i26) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i27 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i27 = 4;
        this.f28909X = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i27) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i28 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i28 = 5;
        this.f28910Y = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i28) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i29 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i29 = 7;
        this.f28911Z = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i29) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i30 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i30 = 8;
        this.f28918k0 = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i30) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i31 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i36 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i31 = 9;
        this.f28921p0 = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i31) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i32 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i36 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i37 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i32 = 10;
        this.f28922q0 = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i32) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i33 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i36 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i37 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i38 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i33 = 11;
        this.f28923r0 = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i33) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i34 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i36 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i37 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i38 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i39 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        final int i34 = 12;
        this.f28924s0 = C2131j.b(new Function0(this) { // from class: tb.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42496b;

            {
                this.f42496b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42496b;
                switch (i34) {
                    case 0:
                        int i110 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.service_fee_group);
                    case 1:
                        int i111 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_amount_tv);
                    case 2:
                        int i112 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_service_fee_title_tv);
                    case 3:
                        int i113 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.interest_group);
                    case 4:
                        int i114 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.interest_amount_tv);
                    case 5:
                        int i115 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_interest_title_tv);
                    case 6:
                        int i116 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.installment_repay_ll);
                    case 7:
                        int i117 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.principal_group);
                    case 8:
                        int i118 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.principal_amount_tv);
                    case 9:
                        int i119 = CLInstallmentDetailActivity.f28901x0;
                        return cLInstallmentDetailActivity.findViewById(e.csTextview123);
                    case 10:
                        int i210 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.pay_in_tv);
                    case 11:
                        int i211 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extended_tag_tv);
                    case 12:
                        int i212 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.total_installment_amount_tv);
                    case 13:
                        int i213 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_repayment_date_tv);
                    case 14:
                        int i214 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extend_amount_tv);
                    case 15:
                        int i215 = CLInstallmentDetailActivity.f28901x0;
                        return (LinearLayout) cLInstallmentDetailActivity.findViewById(e.extend_info_ll);
                    case 16:
                        int i216 = CLInstallmentDetailActivity.f28901x0;
                        return (RecyclerView) cLInstallmentDetailActivity.findViewById(e.installment_rv);
                    case 17:
                        int i217 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_record_tv);
                    case 18:
                        int i218 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.repayment_amount_rv);
                    case 19:
                        int i219 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_detail_tv);
                    case 20:
                        int i35 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.loan_amount_tv);
                    case 21:
                        int i36 = CLInstallmentDetailActivity.f28901x0;
                        return (Button) cLInstallmentDetailActivity.findViewById(e.oc_installment_pay_bt);
                    case 22:
                        int i37 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.extension_fee_group);
                    case 23:
                        int i38 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.extension_fee_amount_tv);
                    case 24:
                        int i39 = CLInstallmentDetailActivity.f28901x0;
                        return (Group) cLInstallmentDetailActivity.findViewById(e.overdue_interest_group);
                    default:
                        int i310 = CLInstallmentDetailActivity.f28901x0;
                        return (TextView) cLInstallmentDetailActivity.findViewById(e.unpaid_penalty_amount_tv);
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f28928v0 = arrayList;
        this.f28930w0 = new o(this, arrayList);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_installment_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final TextView m() {
        Object value = this.f28922q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 358 || eventType == 359) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).clGetBillDetail(new CLBillDetailReq(null, null, this.f28925t0)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        c.b().j(this);
        this.f28925t0 = getIntent().getStringExtra("cl_installment_loan_no");
        t tVar = this.f28917j;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(this.f28930w0);
        Object value3 = this.f28912d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42492b;

            {
                this.f42492b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer accountType;
                Double serviceFeeRate;
                String str = null;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42492b;
                switch (i7) {
                    case 0:
                        CLBillDetailData cLBillDetailData = cLInstallmentDetailActivity.f28926u0;
                        if (cLBillDetailData != null && (accountType = cLBillDetailData.getAccountType()) != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        bundle.putBoolean("repayAllFlag", true);
                        d.x(bundle, "LoanRepayHome");
                        break;
                    case 1:
                        int i10 = CLInstallmentDetailActivity.f28901x0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        d.x(bundle2, "LoanAmountDetails");
                        break;
                    case 2:
                        int i11 = CLInstallmentDetailActivity.f28901x0;
                        ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity").withString("cl_repayment_list_loan_no", cLInstallmentDetailActivity.f28925t0).navigation();
                        break;
                    case 3:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        O6.c cVar = new O6.c(cLInstallmentDetailActivity);
                        cVar.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(g.cs_interest_dialog_title));
                        CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                        cVar.f6598d = cLBillDetailData2 != null ? cLBillDetailData2.getInterestPrompt() : null;
                        cVar.d(g.cs_agree_now, null);
                        cVar.a().show();
                        break;
                    default:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar2 = new O6.c(cLInstallmentDetailActivity);
                        cVar2.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(k.core_title_attention));
                        int i14 = g.cs_cl_service_fee_description;
                        CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                        String str2 = decimalFormat.format((cLBillDetailData3 == null || (serviceFeeRate = cLBillDetailData3.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                        String strA = d.a(cLBillDetailData4 != null ? cLBillDetailData4.getMaxServiceFee() : null);
                        CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                        cVar2.f6598d = cLInstallmentDetailActivity.getString(i14, str2, strA, d.a(cLBillDetailData5 != null ? cLBillDetailData5.getMinServiceFee() : null));
                        cVar2.d(g.cs_got_it, null);
                        cVar2.a().show();
                        break;
                }
            }
        }, (Button) value3);
        Object value4 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42492b;

            {
                this.f42492b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer accountType;
                Double serviceFeeRate;
                String str = null;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42492b;
                switch (i10) {
                    case 0:
                        CLBillDetailData cLBillDetailData = cLInstallmentDetailActivity.f28926u0;
                        if (cLBillDetailData != null && (accountType = cLBillDetailData.getAccountType()) != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        bundle.putBoolean("repayAllFlag", true);
                        d.x(bundle, "LoanRepayHome");
                        break;
                    case 1:
                        int i11 = CLInstallmentDetailActivity.f28901x0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        d.x(bundle2, "LoanAmountDetails");
                        break;
                    case 2:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity").withString("cl_repayment_list_loan_no", cLInstallmentDetailActivity.f28925t0).navigation();
                        break;
                    case 3:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        O6.c cVar = new O6.c(cLInstallmentDetailActivity);
                        cVar.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(g.cs_interest_dialog_title));
                        CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                        cVar.f6598d = cLBillDetailData2 != null ? cLBillDetailData2.getInterestPrompt() : null;
                        cVar.d(g.cs_agree_now, null);
                        cVar.a().show();
                        break;
                    default:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar2 = new O6.c(cLInstallmentDetailActivity);
                        cVar2.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(k.core_title_attention));
                        int i15 = g.cs_cl_service_fee_description;
                        CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                        String str2 = decimalFormat.format((cLBillDetailData3 == null || (serviceFeeRate = cLBillDetailData3.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                        String strA = d.a(cLBillDetailData4 != null ? cLBillDetailData4.getMaxServiceFee() : null);
                        CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                        cVar2.f6598d = cLInstallmentDetailActivity.getString(i15, str2, strA, d.a(cLBillDetailData5 != null ? cLBillDetailData5.getMinServiceFee() : null));
                        cVar2.d(g.cs_got_it, null);
                        cVar2.a().show();
                        break;
                }
            }
        }, (TextView) value4);
        Object value5 = this.f28919o.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42492b;

            {
                this.f42492b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer accountType;
                Double serviceFeeRate;
                String str = null;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42492b;
                switch (i11) {
                    case 0:
                        CLBillDetailData cLBillDetailData = cLInstallmentDetailActivity.f28926u0;
                        if (cLBillDetailData != null && (accountType = cLBillDetailData.getAccountType()) != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        bundle.putBoolean("repayAllFlag", true);
                        d.x(bundle, "LoanRepayHome");
                        break;
                    case 1:
                        int i12 = CLInstallmentDetailActivity.f28901x0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        d.x(bundle2, "LoanAmountDetails");
                        break;
                    case 2:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity").withString("cl_repayment_list_loan_no", cLInstallmentDetailActivity.f28925t0).navigation();
                        break;
                    case 3:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        O6.c cVar = new O6.c(cLInstallmentDetailActivity);
                        cVar.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(g.cs_interest_dialog_title));
                        CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                        cVar.f6598d = cLBillDetailData2 != null ? cLBillDetailData2.getInterestPrompt() : null;
                        cVar.d(g.cs_agree_now, null);
                        cVar.a().show();
                        break;
                    default:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar2 = new O6.c(cLInstallmentDetailActivity);
                        cVar2.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(k.core_title_attention));
                        int i16 = g.cs_cl_service_fee_description;
                        CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                        String str2 = decimalFormat.format((cLBillDetailData3 == null || (serviceFeeRate = cLBillDetailData3.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                        String strA = d.a(cLBillDetailData4 != null ? cLBillDetailData4.getMaxServiceFee() : null);
                        CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                        cVar2.f6598d = cLInstallmentDetailActivity.getString(i16, str2, strA, d.a(cLBillDetailData5 != null ? cLBillDetailData5.getMinServiceFee() : null));
                        cVar2.d(g.cs_got_it, null);
                        cVar2.a().show();
                        break;
                }
            }
        }, (TextView) value5);
        Object value6 = this.f28910Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i12 = 3;
        h.l(new View.OnClickListener(this) { // from class: tb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42492b;

            {
                this.f42492b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer accountType;
                Double serviceFeeRate;
                String str = null;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42492b;
                switch (i12) {
                    case 0:
                        CLBillDetailData cLBillDetailData = cLInstallmentDetailActivity.f28926u0;
                        if (cLBillDetailData != null && (accountType = cLBillDetailData.getAccountType()) != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        bundle.putBoolean("repayAllFlag", true);
                        d.x(bundle, "LoanRepayHome");
                        break;
                    case 1:
                        int i13 = CLInstallmentDetailActivity.f28901x0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        d.x(bundle2, "LoanAmountDetails");
                        break;
                    case 2:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity").withString("cl_repayment_list_loan_no", cLInstallmentDetailActivity.f28925t0).navigation();
                        break;
                    case 3:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        O6.c cVar = new O6.c(cLInstallmentDetailActivity);
                        cVar.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(g.cs_interest_dialog_title));
                        CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                        cVar.f6598d = cLBillDetailData2 != null ? cLBillDetailData2.getInterestPrompt() : null;
                        cVar.d(g.cs_agree_now, null);
                        cVar.a().show();
                        break;
                    default:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar2 = new O6.c(cLInstallmentDetailActivity);
                        cVar2.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(k.core_title_attention));
                        int i17 = g.cs_cl_service_fee_description;
                        CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                        String str2 = decimalFormat.format((cLBillDetailData3 == null || (serviceFeeRate = cLBillDetailData3.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                        String strA = d.a(cLBillDetailData4 != null ? cLBillDetailData4.getMaxServiceFee() : null);
                        CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                        cVar2.f6598d = cLInstallmentDetailActivity.getString(i17, str2, strA, d.a(cLBillDetailData5 != null ? cLBillDetailData5.getMinServiceFee() : null));
                        cVar2.d(g.cs_got_it, null);
                        cVar2.a().show();
                        break;
                }
            }
        }, (TextView) value6);
        Object value7 = this.f28907M.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i13 = 4;
        h.l(new View.OnClickListener(this) { // from class: tb.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentDetailActivity f42492b;

            {
                this.f42492b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer accountType;
                Double serviceFeeRate;
                String str = null;
                CLInstallmentDetailActivity cLInstallmentDetailActivity = this.f42492b;
                switch (i13) {
                    case 0:
                        CLBillDetailData cLBillDetailData = cLInstallmentDetailActivity.f28926u0;
                        if (cLBillDetailData != null && (accountType = cLBillDetailData.getAccountType()) != null && accountType.intValue() == 9) {
                            str = "INSTALLMENT_LOAN";
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        bundle.putBoolean("repayAllFlag", true);
                        d.x(bundle, "LoanRepayHome");
                        break;
                    case 1:
                        int i14 = CLInstallmentDetailActivity.f28901x0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("loanNo", cLInstallmentDetailActivity.f28925t0);
                        d.x(bundle2, "LoanAmountDetails");
                        break;
                    case 2:
                        int i15 = CLInstallmentDetailActivity.f28901x0;
                        ARouter.getInstance().build("/credit_score/cl_bill_repayment_list_activity").withString("cl_repayment_list_loan_no", cLInstallmentDetailActivity.f28925t0).navigation();
                        break;
                    case 3:
                        int i16 = CLInstallmentDetailActivity.f28901x0;
                        O6.c cVar = new O6.c(cLInstallmentDetailActivity);
                        cVar.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(g.cs_interest_dialog_title));
                        CLBillDetailData cLBillDetailData2 = cLInstallmentDetailActivity.f28926u0;
                        cVar.f6598d = cLBillDetailData2 != null ? cLBillDetailData2.getInterestPrompt() : null;
                        cVar.d(g.cs_agree_now, null);
                        cVar.a().show();
                        break;
                    default:
                        int i17 = CLInstallmentDetailActivity.f28901x0;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        O6.c cVar2 = new O6.c(cLInstallmentDetailActivity);
                        cVar2.f6596b = O6.d.f(cLInstallmentDetailActivity.getString(k.core_title_attention));
                        int i18 = g.cs_cl_service_fee_description;
                        CLBillDetailData cLBillDetailData3 = cLInstallmentDetailActivity.f28926u0;
                        String str2 = decimalFormat.format((cLBillDetailData3 == null || (serviceFeeRate = cLBillDetailData3.getServiceFeeRate()) == null) ? 0.0d : serviceFeeRate.doubleValue());
                        CLBillDetailData cLBillDetailData4 = cLInstallmentDetailActivity.f28926u0;
                        String strA = d.a(cLBillDetailData4 != null ? cLBillDetailData4.getMaxServiceFee() : null);
                        CLBillDetailData cLBillDetailData5 = cLInstallmentDetailActivity.f28926u0;
                        cVar2.f6598d = cLInstallmentDetailActivity.getString(i18, str2, strA, d.a(cLBillDetailData5 != null ? cLBillDetailData5.getMinServiceFee() : null));
                        cVar2.d(g.cs_got_it, null);
                        cVar2.a().show();
                        break;
                }
            }
        }, (TextView) value7);
    }
}
