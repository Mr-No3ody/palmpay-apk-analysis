package com.transsnet.palmpay.send_money.ui.activity;

import L6.b;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.QueryRecordReq;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;
import com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import p159kd.c;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p173ld.u;
import p255qd.g;
import p270rd.C1964g;
import p270rd.C1965h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/collect/record")
public class MoneyTransferRecordActivity extends i implements MoneyTransferRecordContract$IView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRecyclerView f33172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f33173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33175e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_collect_record_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new g();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        this.f33172b.a();
        this.f33174d = 1;
        ((g) this.f27350a).queryMoneyTransferRecordList(new QueryRecordReq(1, 10));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        this.f33172b = (SwipeRecyclerView) findViewById(e.collect_record_rv);
        u uVar = new u(this);
        uVar.f39338e = 3;
        this.f33173c = uVar;
        uVar.f4986c = new C1964g(this);
        this.f33172b.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        this.f33172b.setRefreshEnable(false);
        this.f33172b.setAdapter(this.f33173c);
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), getResources().getDimensionPixelOffset(c.sm_record_divider_height), getResources().getDimensionPixelOffset(c.sm_record_divider_padding), getResources().getDimensionPixelOffset(c.sm_record_divider_padding));
        c1548f.f31336e = false;
        this.f33172b.getRecyclerView().addItemDecoration(c1548f);
        this.f33172b.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f33173c));
        this.f33172b.setOnLoadListener(new C1965h(this));
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IView
    public final void showMoneyTransferRecordList(QueryRecordResp queryRecordResp) {
        showLoadingDialog(false);
        if (!queryRecordResp.isSuccess()) {
            this.f33172b.c();
            ToastUtils.showShort(queryRecordResp.getRespMsg());
            return;
        }
        QueryRecordResp.Data data = queryRecordResp.data;
        if (data == null) {
            this.f33172b.c();
            this.f33175e = true;
            if (this.f33174d != 1) {
                this.f33172b.b(getString(h.sm_no_more_text));
                return;
            } else {
                if (this.f33172b.getEmptyView() != null) {
                    return;
                }
                ModelEmptyView modelEmptyView = new ModelEmptyView(this);
                modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
                modelEmptyView.f31512c.setText(h.sm_no_collect_record_text);
                this.f33172b.setEmptyView(modelEmptyView);
                return;
            }
        }
        this.f33174d = data.curPage;
        List<QueryRecordResp.Record> list = data.list;
        if (list == null || list.isEmpty()) {
            this.f33172b.c();
            this.f33172b.b(getString(h.sm_no_more_text));
            this.f33175e = true;
        } else if (queryRecordResp.data.list.size() >= 10) {
            this.f33173c.a(queryRecordResp.data.list);
            this.f33172b.c();
        } else {
            this.f33173c.a(queryRecordResp.data.list);
            this.f33172b.c();
            this.f33172b.b(getString(h.sm_no_more_text));
            this.f33175e = true;
        }
    }

    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IView
    public final void showQueryError(String str) {
        this.f33172b.c();
        ToastUtils.showShort(str);
    }
}
