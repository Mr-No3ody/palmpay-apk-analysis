package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import C9.ViewOnClickListenerC0146m;
import Fe.Q;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;
import p052da.ViewOnClickListenerC1649v;
import p102ge.H;
import p328ve.s;

/* JADX INFO: loaded from: classes4.dex */
public class PalmPayStatementActivity extends i implements PalmPayStatementContract.View, MonthPickDialog.CallBack {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f34505Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f34506A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f34507B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f34508C = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f34509H = 5;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f34510L = 2018;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f34511M = new ViewOnClickListenerC0146m(this, 24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f34514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f34516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34517g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f34518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f34519j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34521p;
    public SwipeRecyclerView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MonthPickDialog f34522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f34523w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_palmpay_statement;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void handleBalanceAccountInfo(BalanceAccountInfo balanceAccountInfo) {
        if (balanceAccountInfo == null || balanceAccountInfo.getData() == null) {
            return;
        }
        BalanceAccountInfo.DataBean data = balanceAccountInfo.getData();
        this.f34512b.setText(r0.B(data.getAvailableBalance(), true));
        this.f34513c.setText(r0.B(data.getReservedBalance(), true));
        this.f34515e.setText(r0.B(data.getFrozenBalance(), true));
        this.f34517g.setText(r0.B(data.getFrozenBalance() + data.getReservedBalance() + data.getAvailableBalance(), true));
        this.f34512b.setOnClickListener(new ViewOnClickListenerC1649v(this, 5));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f34506A = BaseApplication.getInstance().getUser().getBalanceAccountId();
        this.f34512b.setText(r0.B(0L, true));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        Q q10 = new Q();
        q10.f2745d = new ArrayList();
        return q10;
    }

    @Override // com.transsnet.palmpay.core.dialog.MonthPickDialog.CallBack
    public final void onConfirmClick() {
        int nowPickYear = this.f34522v.getNowPickYear();
        int nowPickMonth = this.f34522v.getNowPickMonth();
        if (this.f34509H != nowPickMonth || this.f34510L != nowPickYear) {
            this.f34507B = 1;
            ((Q) this.f27350a).loadBillData(nowPickYear, nowPickMonth, null, 1, 15, this.f34506A);
        }
        this.f34510L = nowPickYear;
        this.f34509H = nowPickMonth;
        if (nowPickMonth > 0) {
            this.f34519j.setText(r0.i0(nowPickMonth - 1));
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void onOrderNoReceived(String str, QueryOrderNoRsp queryOrderNoRsp) {
        if (TextUtils.isEmpty(str) || queryOrderNoRsp.getData() == null || TextUtils.isEmpty(queryOrderNoRsp.getData().getOrderNo())) {
            return;
        }
        String orderNo = queryOrderNoRsp.getData().getOrderNo();
        String orderType = queryOrderNoRsp.getData().getOrderType();
        if (TextUtils.isEmpty(orderType)) {
            orderType = i0.F(str);
        }
        Ea.a.e(orderType, orderNo, "");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f34522v.setCallBack(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f34522v.setCallBack(this);
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((Q) this.f27350a).queryBalanceAccount();
        ((Q) this.f27350a).loadBillData(this.f34510L, this.f34509H, null, this.f34507B, 15, this.f34506A);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void setTotalPage(int i7) {
        this.f34508C = i7;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34512b = (TextView) findViewById(e.tvAvailable);
        this.f34513c = (TextView) findViewById(e.tvReserved);
        this.f34514d = findViewById(e.layoutLine2);
        this.f34515e = (TextView) findViewById(e.tvFrozen);
        this.f34516f = findViewById(e.layoutLine3);
        this.f34517g = (TextView) findViewById(e.tvCurrent);
        this.f34518i = findViewById(e.layoutLine4);
        this.f34519j = (TextView) findViewById(e.tvMonth);
        this.f34520o = (TextView) findViewById(e.textViewIn);
        this.f34521p = (TextView) findViewById(e.textViewOut);
        this.t = (SwipeRecyclerView) findViewById(e.billList);
        this.f34523w = new s(this);
        this.t.getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.t.getRecyclerView().setItemViewCacheSize(4);
        this.t.setRefreshEnable(true);
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), SizeUtils.dp2px(0.5f), SizeUtils.dp2px(15.0f), SizeUtils.dp2px(15.0f));
        c1548f.f31336e = false;
        this.t.getRecyclerView().addItemDecoration(c1548f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f34509H = r0.h0(jCurrentTimeMillis);
        this.f34510L = r0.N0(jCurrentTimeMillis);
        int i7 = this.f34509H;
        if (i7 > 0) {
            this.f34519j.setText(r0.i0(i7 - 1));
        }
        MonthPickDialog monthPickDialog = new MonthPickDialog(this);
        this.f34522v = monthPickDialog;
        monthPickDialog.setShowConfirmBtn(true);
        this.f34519j.setOnClickListener(this.f34511M);
        this.t.setOnLoadListener(new H(this));
        this.t.setAdapter(this.f34523w);
        this.f34523w.f4986c = new Z(this, 28);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void showBillData(List list) {
        if (this.t.getEmptyView() == null) {
            ModelEmptyView modelEmptyView = new ModelEmptyView(this);
            modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
            modelEmptyView.f31512c.setText(h.main_no_bill_record);
            this.t.setEmptyView(modelEmptyView);
        }
        s sVar = this.f34523w;
        sVar.f4985b = list;
        sVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void stopLoadMore() {
        this.t.c();
        this.t.setRefreshing(false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.View
    public final void updateTotalAmount(long j6, long j10) {
        this.f34521p.setText(r0.B(Math.abs(j10), false));
        this.f34520o.setText(r0.B(j6, false));
    }
}
