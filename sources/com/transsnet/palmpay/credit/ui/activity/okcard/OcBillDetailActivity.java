package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.r0;
import Ua.n0;
import Ya.e;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.bean.req.OcRepaidRecordListReq;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p285sc.x;
import p310ub.C2109x;
import p310ub.C2111y;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2144l;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC账单详情页", path = "/credit_score/oc_bill_detail_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcBillDetailActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillDetailActivity extends Za.b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f29342L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OcCurBillData f29343A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Long f29344B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29345C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29350g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29352j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f29353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2144l f29354p;
    public int t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f29355v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f29356w = "1,2,3,4,8,9,12,13,14,99,21,24";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Long f29346H = 0L;

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

    public OcBillDetailActivity() {
        final int i7 = 0;
        this.f29347d = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i7) {
                    case 0:
                        int i10 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i11 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i12 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i13 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i14 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
        final int i10 = 1;
        this.f29348e = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i12 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i13 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i14 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i16 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
        final int i11 = 2;
        this.f29349f = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i11) {
                    case 0:
                        int i12 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i13 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i14 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i16 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i17 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
        final int i12 = 3;
        this.f29350g = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i12) {
                    case 0:
                        int i13 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i14 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i16 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i17 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i18 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
        final int i13 = 4;
        this.f29351i = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i13) {
                    case 0:
                        int i14 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i16 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i17 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i18 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i19 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
        final int i14 = 5;
        this.f29352j = C2131j.b(new Function0(this) { // from class: ub.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillDetailActivity f42938b;

            {
                this.f42938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillDetailActivity ocBillDetailActivity = this.f42938b;
                switch (i14) {
                    case 0:
                        int i15 = OcBillDetailActivity.f29342L;
                        return (RecyclerView) ocBillDetailActivity.findViewById(e.oc_bill_rv);
                    case 1:
                        int i16 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.penalty_amount_tv);
                    case 2:
                        int i17 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.principal_amount_tv);
                    case 3:
                        int i18 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_status_tv);
                    case 4:
                        int i19 = OcBillDetailActivity.f29342L;
                        return (TextView) ocBillDetailActivity.findViewById(e.oc_bill_repaid_amount_tv);
                    default:
                        int i110 = OcBillDetailActivity.f29342L;
                        return (PpTitleBar) ocBillDetailActivity.findViewById(e.oc_bill_detail_mtb);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_bill_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void m(boolean z3) {
        if (z3) {
            this.t = 1;
        } else {
            this.t++;
        }
        OcRepaidRecordListReq ocRepaidRecordListReq = new OcRepaidRecordListReq(this.f29344B, this.f29356w, Integer.valueOf(this.t), 100, null, 16, null);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getRepaidRecordList(ocRepaidRecordListReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n0(this, z3, 2));
    }

    public final RecyclerView n() {
        Object value = this.f29347d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final void o() {
        OcCurBillData ocCurBillData;
        Integer stauts;
        Integer stauts2;
        OcCurBillData ocCurBillData2 = this.f29343A;
        if (ocCurBillData2 != null) {
            Object value = this.f29352j.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((PpTitleBar) value).setTitle(r0.X1(ocCurBillData2.getBeginTimeStamp(), "dd") + "-" + r0.X1(ocCurBillData2.getEndTimeStamp(), "dd.MMM"));
            Object value2 = this.f29351i.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            TextView textView = (TextView) value2;
            Long paidInterest = ocCurBillData2.getPaidInterest();
            long jLongValue = paidInterest != null ? paidInterest.longValue() : 0L;
            Long paidPenalty = ocCurBillData2.getPaidPenalty();
            long jLongValue2 = jLongValue + (paidPenalty != null ? paidPenalty.longValue() : 0L);
            Long paidPrincipal = ocCurBillData2.getPaidPrincipal();
            long jLongValue3 = jLongValue2 + (paidPrincipal != null ? paidPrincipal.longValue() : 0L);
            Long paidInstallmentServiceFee = ocCurBillData2.getPaidInstallmentServiceFee();
            textView.setText(r0.B(jLongValue3 + (paidInstallmentServiceFee != null ? paidInstallmentServiceFee.longValue() : 0L), true));
            Object value3 = this.f29349f.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            TextView textView2 = (TextView) value3;
            Long usedAmount = ocCurBillData2.getUsedAmount();
            long jLongValue4 = usedAmount != null ? usedAmount.longValue() : 0L;
            Long unpaidInstallmentServiceFee = ocCurBillData2.getUnpaidInstallmentServiceFee();
            long jLongValue5 = jLongValue4 + (unpaidInstallmentServiceFee != null ? unpaidInstallmentServiceFee.longValue() : 0L);
            Long paidInstallmentServiceFee2 = ocCurBillData2.getPaidInstallmentServiceFee();
            textView2.setText(r0.B(jLongValue5 + (paidInstallmentServiceFee2 != null ? paidInstallmentServiceFee2.longValue() : 0L), true));
            Object value4 = this.f29348e.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            TextView textView3 = (TextView) value4;
            Long paidPenalty2 = ocCurBillData2.getPaidPenalty();
            long jLongValue6 = paidPenalty2 != null ? paidPenalty2.longValue() : 0L;
            Long unpaidPenalty = ocCurBillData2.getUnpaidPenalty();
            textView3.setText(r0.B(jLongValue6 + (unpaidPenalty != null ? unpaidPenalty.longValue() : 0L), true));
        }
        OcCurBillData ocCurBillData3 = this.f29343A;
        t tVar = this.f29350g;
        if ((ocCurBillData3 == null || (stauts2 = ocCurBillData3.getStauts()) == null || stauts2.intValue() != 0) && ((ocCurBillData = this.f29343A) == null || (stauts = ocCurBillData.getStauts()) == null || stauts.intValue() != 3)) {
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((TextView) value5).setVisibility(8);
        } else {
            Object value6 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((TextView) value6).setVisibility(0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (this.f29343A == null) {
            Long l5 = this.f29344B;
            if ((l5 != null ? l5.longValue() : 0L) > 0) {
                G.h(p221ob.c.f40268a).queryBillDetailById(this.f29344B).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2109x(this, 0));
            } else {
                G.h(p221ob.c.f40268a).queryFutureDetailById(this.f29345C, this.f29346H).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2109x(this, 1));
            }
        }
        m(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        t tVar = this.f29352j;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).getRightTextView().setTextColor(getColor(Ya.b.cs_oc_contract_txt_color));
        this.f29344B = Long.valueOf(getIntent().getLongExtra("oc_bill_id", 0L));
        this.f29345C = getIntent().getStringExtra("oc_card_no");
        this.f29346H = Long.valueOf(getIntent().getLongExtra("oc_future_repayment_date", 0L));
        o();
        this.f29353o = new ArrayList();
        ArrayList arrayList = this.f29353o;
        if (arrayList == null) {
            Intrinsics.n("mData");
            throw null;
        }
        this.f29354p = new C2144l(this, arrayList, 1);
        n().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerViewN = n();
        C2144l c2144l = this.f29354p;
        if (c2144l == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerViewN.setAdapter(c2144l);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView rightTextView = ((PpTitleBar) value2).getRightTextView();
        Intrinsics.checkNotNullExpressionValue(rightTextView, "getRightTextView(...)");
        p220oa.h.l(new x(this, 18), rightTextView);
        n().addOnScrollListener(new C2111y(this));
        C2144l c2144l2 = this.f29354p;
        if (c2144l2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        p1.c itemClickListener = new p1.c(this, 29);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        c2144l2.f4993c = itemClickListener;
    }
}
