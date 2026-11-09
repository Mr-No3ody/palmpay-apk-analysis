package com.transsnet.palmpay.ui.activity;

import Ac.b;
import Ac.e;
import Ac.f;
import Ac.h;
import Fe.J;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.req.InviteeListReq;
import com.transsnet.palmpay.main.export.bean.rsp.InviteeListResp;
import com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import p102ge.x;
import p328ve.j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/invitee_list")
public class InviteeListActivity extends i implements InviteeListContract$IView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f34481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34482c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwipeRecyclerView f34484e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_invitee_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f34481b = new j(this);
        this.f34484e.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.main_divider_color), getResources().getDimensionPixelOffset(q.px1), getResources().getDimensionPixelOffset(q.dp15), getResources().getDimensionPixelOffset(q.dp15));
        c1548f.f31336e = false;
        this.f34484e.setRefreshEnable(true);
        this.f34484e.getRecyclerView().addItemDecoration(c1548f);
        this.f34484e.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f34481b));
        this.f34484e.setAdapter(this.f34481b);
        this.f34484e.setOnLoadListener(new x(this));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new J();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((J) this.f27350a).queryInviteeList(new InviteeListReq(this.f34482c, 10));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34484e = (SwipeRecyclerView) findViewById(e.invitee_list);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IView
    public final void showError(String str) {
        ToastUtils.showLong(str);
        this.f34484e.c();
        this.f34484e.setRefreshing(false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IView
    public final void showInviteeListResp(InviteeListResp inviteeListResp) {
        showLoadingDialog(false);
        if (!inviteeListResp.isSuccess()) {
            ToastUtils.showLong(inviteeListResp.getRespMsg());
        } else if (inviteeListResp.getData().getList() != null && !inviteeListResp.getData().getList().isEmpty()) {
            this.f34482c = inviteeListResp.getData().getCurPage();
            int totalPage = inviteeListResp.getData().getTotalPage();
            this.f34483d = totalPage;
            int i7 = this.f34482c;
            if (i7 == totalPage) {
                this.f34481b.a(inviteeListResp.getData().getList());
                this.f34484e.b(getString(h.main_list_end));
            } else if (i7 < totalPage) {
                this.f34481b.a(inviteeListResp.getData().getList());
            }
        } else if (this.f34482c == 1) {
            ModelEmptyView modelEmptyView = new ModelEmptyView(this);
            modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
            modelEmptyView.f31512c.setText(h.main_no_bill_record);
            this.f34484e.setEmptyView(modelEmptyView);
        }
        this.f34484e.c();
        this.f34484e.setRefreshing(false);
    }
}
