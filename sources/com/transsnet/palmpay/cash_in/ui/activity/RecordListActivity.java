package com.transsnet.palmpay.cash_in.ui.activity;

import A9.a;
import C9.D;
import C9.E;
import C9.F;
import C9.G;
import E9.e;
import L6.b;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.cash_in.bean.PageBean;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import p025ba.k;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
public class RecordListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PpTitleBar f26899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRecyclerView f26900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f26901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f26903e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelEmptyView f26907j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26904f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26905g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26906i = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E f26908o = new E(this);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_record;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f26903e = new ArrayList();
        String stringExtra = getIntent().getStringExtra("extra_type");
        this.f26902d = stringExtra;
        l(this.f26904f, stringExtra);
        e eVar = this.f26901c;
        eVar.f2260e = this.f26902d;
        eVar.notifyDataSetChanged();
        if ("01".equals(this.f26902d)) {
            this.f26899a.setTitle(getString(k.core_fund_history));
        } else if ("02".equals(this.f26902d)) {
            this.f26899a.setTitle(getString(k.core_withdrawal_history));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l(int i7, String str) {
        boolean zEquals = "01".equals(str);
        int i10 = this.f26906i;
        if (zEquals) {
            PageBean pageBean = new PageBean();
            pageBean.pageSize = i10;
            pageBean.pageNum = i7;
            ((IRechargeService) a.f95a.f35518b).queryCashInList(pageBean).enqueue(new F(this));
            return;
        }
        if ("02".equals(str)) {
            PageBean pageBean2 = new PageBean();
            pageBean2.pageSize = i10;
            pageBean2.pageNum = i7;
            ((IRechargeService) a.f95a.f35518b).queryCashOutList(pageBean2).enqueue(new G(this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        this.f26900b = (SwipeRecyclerView) findViewById(p366y9.b.ar_record_rcv);
        this.f26899a = (PpTitleBar) findViewById(p366y9.b.ar_title_bar);
        this.f26900b.getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        e eVar = new e(this);
        eVar.f2260e = "01";
        this.f26901c = eVar;
        this.f26900b.setAdapter(eVar);
        this.f26900b.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f26901c));
        this.f26901c.f4986c = this.f26908o;
        this.f26900b.setRefreshEnable(false);
        this.f26900b.setOnLoadListener(new D(this));
        if (this.f26900b.getEmptyView() != null) {
            return;
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(this);
        this.f26907j = modelEmptyView;
        modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
        this.f26907j.f31512c.setText(k.core_no_history);
        this.f26900b.setEmptyView(this.f26907j);
    }
}
