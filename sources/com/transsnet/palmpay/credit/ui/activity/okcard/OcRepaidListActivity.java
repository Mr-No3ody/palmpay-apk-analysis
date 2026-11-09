package com.transsnet.palmpay.credit.ui.activity.okcard;

import Pa.r0;
import Ua.n0;
import Ya.e;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.dialog.SelectBillTypeDialog;
import com.transsnet.palmpay.credit.bean.req.OcRepaidRecordListReq;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p285sc.x;
import p310ub.P0;
import p310ub.Q0;
import p355xf.C2131j;
import p355xf.t;
import p368yb.W;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_repaid_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepaidListActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaidListActivity extends Za.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f29695w = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f29699g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W f29700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SelectBillTypeDialog f29701j;
    public OcCurBillData t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29702o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f29703p = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29704v = "2,4";

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

    public OcRepaidListActivity() {
        final int i7 = 0;
        this.f29696d = C2131j.b(new Function0(this) { // from class: ub.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaidListActivity f42780b;

            {
                this.f42780b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepaidListActivity ocRepaidListActivity = this.f42780b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepaidListActivity.f29695w;
                        return (RecyclerView) ocRepaidListActivity.findViewById(e.oc_bill_history_rv);
                    case 1:
                        int i11 = OcRepaidListActivity.f29695w;
                        return (TextView) ocRepaidListActivity.findViewById(e.oc_repaid_title_tv);
                    default:
                        int i12 = OcRepaidListActivity.f29695w;
                        return (PpTitleBar) ocRepaidListActivity.findViewById(e.oc_repaid_mtb);
                }
            }
        });
        final int i10 = 1;
        this.f29697e = C2131j.b(new Function0(this) { // from class: ub.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaidListActivity f42780b;

            {
                this.f42780b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepaidListActivity ocRepaidListActivity = this.f42780b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepaidListActivity.f29695w;
                        return (RecyclerView) ocRepaidListActivity.findViewById(e.oc_bill_history_rv);
                    case 1:
                        int i12 = OcRepaidListActivity.f29695w;
                        return (TextView) ocRepaidListActivity.findViewById(e.oc_repaid_title_tv);
                    default:
                        int i13 = OcRepaidListActivity.f29695w;
                        return (PpTitleBar) ocRepaidListActivity.findViewById(e.oc_repaid_mtb);
                }
            }
        });
        final int i11 = 2;
        this.f29698f = C2131j.b(new Function0(this) { // from class: ub.O0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaidListActivity f42780b;

            {
                this.f42780b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepaidListActivity ocRepaidListActivity = this.f42780b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepaidListActivity.f29695w;
                        return (RecyclerView) ocRepaidListActivity.findViewById(e.oc_bill_history_rv);
                    case 1:
                        int i13 = OcRepaidListActivity.f29695w;
                        return (TextView) ocRepaidListActivity.findViewById(e.oc_repaid_title_tv);
                    default:
                        int i14 = OcRepaidListActivity.f29695w;
                        return (PpTitleBar) ocRepaidListActivity.findViewById(e.oc_repaid_mtb);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repaid_list_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void m(boolean z3) {
        if (z3) {
            this.f29702o = 1;
        } else {
            this.f29702o++;
        }
        OcCurBillData ocCurBillData = this.t;
        OcRepaidRecordListReq ocRepaidRecordListReq = new OcRepaidRecordListReq(ocCurBillData != null ? ocCurBillData.getId() : null, this.f29704v, Integer.valueOf(this.f29702o), 100, null, 16, null);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getRepaidRecordList(ocRepaidRecordListReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n0(this, z3, 4));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Long endTimeStamp;
        Long beginTimeStamp;
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        String stringExtra = getIntent().getStringExtra("oc_repaid_bill_data");
        if (stringExtra != null) {
            this.t = (OcCurBillData) d0.l(OcCurBillData.class, stringExtra);
        }
        t tVar = this.f29698f;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value;
        S6.a aVar = S6.a.pay_Filter;
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this);
        ImageView imageView = ppTitleBar.f24625f;
        if (imageView != null) {
            imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, iColorInt, 24));
        }
        Object value2 = this.f29697e.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView = (TextView) value2;
        int i7 = Ya.g.cs_oc_bill_cycle;
        OcCurBillData ocCurBillData = this.t;
        long jLongValue = 0;
        String strX1 = r0.X1(Long.valueOf((ocCurBillData == null || (beginTimeStamp = ocCurBillData.getBeginTimeStamp()) == null) ? 0L : beginTimeStamp.longValue()), "dd");
        OcCurBillData ocCurBillData2 = this.t;
        if (ocCurBillData2 != null && (endTimeStamp = ocCurBillData2.getEndTimeStamp()) != null) {
            jLongValue = endTimeStamp.longValue();
        }
        textView.setText(getString(i7, strX1, r0.X1(Long.valueOf(jLongValue), "dd.MMM")));
        this.f29699g = new ArrayList();
        ArrayList data = this.f29699g;
        if (data == null) {
            Intrinsics.n("mData");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29700i = new W(this, data);
        t tVar2 = this.f29696d;
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value4;
        W w3 = this.f29700i;
        if (w3 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerView.setAdapter(w3);
        Object value5 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ImageView rightImageView2 = ((PpTitleBar) value5).getRightImageView2();
        if (rightImageView2 != null) {
            p220oa.h.l(new x(this, 25), rightImageView2);
        }
        Object value6 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((RecyclerView) value6).addOnScrollListener(new P0(this));
        W w6 = this.f29700i;
        if (w6 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        Q0 itemClickListener = new Q0(this);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        w6.f4993c = itemClickListener;
    }
}
