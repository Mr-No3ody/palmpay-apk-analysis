package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ua.n0;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.req.CommonPageListReq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;
import p310ub.C2113z;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2146n;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC历史账单页", path = "/credit_score/oc_bill_history_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcBillHistoryActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillHistoryActivity extends Za.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29357j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f29359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2146n f29360f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29358d = C2131j.b(new p068ec.d(this, 25));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29361g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f29362i = -1;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_bill_history_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void m(boolean z3) {
        if (z3) {
            this.f29361g = 1;
        } else {
            this.f29361g++;
        }
        CommonPageListReq commonPageListReq = new CommonPageListReq(this.f29361g, 100);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getHistoryBillList(commonPageListReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n0(this, z3, 3));
    }

    public final RecyclerView n() {
        Object value = this.f29358d.getValue();
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
        this.f29359e = new ArrayList();
        ArrayList data = this.f29359e;
        if (data == null) {
            Intrinsics.n("mData");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29360f = new C2146n(this, data);
        n().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerViewN = n();
        C2146n c2146n = this.f29360f;
        if (c2146n == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerViewN.setAdapter(c2146n);
        n().addOnScrollListener(new C2113z(this));
        C2146n c2146n2 = this.f29360f;
        if (c2146n2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        C2085k0 itemClickListener = new C2085k0(this, 29);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        c2146n2.f4993c = itemClickListener;
    }
}
