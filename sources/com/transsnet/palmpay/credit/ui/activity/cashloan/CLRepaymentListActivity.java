package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Ya.f;
import Za.b;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.credit.bean.req.OLRepaymentListReq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p183m6.j;
import p221ob.c;
import p294tb.h0;
import p294tb.i0;
import p351xb.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款记录列表页", path = "/credit_score/cl_bill_repayment_list_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentListActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentListActivity extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f29103p = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f29105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f29106f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f29109j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f29110o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29104d = C2131j.b(new p068ec.d(this, 20));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29107g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f29108i = -1;

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_bill_repayment_list_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void m(boolean z3) {
        if (z3) {
            this.f29107g = 1;
        } else {
            this.f29107g++;
        }
        G.h(c.f40268a).clGetRepaymentList(new OLRepaymentListReq(this.f29109j, this.f29110o, "2,4,26,27", Integer.valueOf(this.f29107g), 100, null, 32, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new h0(this, z3));
    }

    public final RecyclerView n() {
        Object value = this.f29104d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        long longExtra = getIntent().getLongExtra("cl_repayment_list_bill_id", 0L);
        this.f29109j = Long.valueOf(longExtra);
        if (longExtra == 0) {
            this.f29109j = null;
        }
        this.f29110o = getIntent().getStringExtra("cl_repayment_list_loan_no");
        this.f29105e = new ArrayList();
        ArrayList data = this.f29105e;
        if (data == null) {
            Intrinsics.n("mData");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29106f = new d(this, data);
        n().setLayoutManager(new LinearLayoutManager(this, 1, false));
        n().addOnScrollListener(new i0(this));
        d dVar = this.f29106f;
        if (dVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        j itemClickListener = new j(this, 22);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        dVar.f4993c = itemClickListener;
    }
}
