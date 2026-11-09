package com.transsnet.palmpay.ui.activity.points;

import Ac.d;
import Ac.f;
import Cc.a;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.main.export.bean.rsp.GetPointFlowRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p071ef.b;
import p185ma.e;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/points_billdetail")
public class PointStatementDetailActivity extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem f34807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OrderResultItemModel f34808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OrderResultViewReceiptModel f34809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OrderResultItemModel f34810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OrderResultItemModel f34811g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OrderResultItemModel f34812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OrderResultItemModel f34813j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OrderResultItemModel f34814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GetPointFlowRsp.DataBean.ListBean f34815p;
    public final e t = new e(this, 6);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_point_bill_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34805a)) {
            this.f34805a = getIntent().getStringExtra("LOYALTY_ORDER_ID");
        }
        Uri data = getIntent().getData();
        if (data == null || !TextUtils.isEmpty(this.f34805a)) {
            return;
        }
        this.f34805a = data.getQueryParameter("LOYALTY_ORDER_ID");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (TextUtils.isEmpty(this.f34805a)) {
            return;
        }
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).getPointStatement(this.f34805a).k(p298tf.f.f42629b).i(b.a()).subscribe(new p256qe.a(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34807c = (ModelBillDetailTextItem) findViewById(Ac.e.itemPoints);
        this.f34810f = (OrderResultItemModel) findViewById(Ac.e.itemOrderNo);
        this.f34812i = (OrderResultItemModel) findViewById(Ac.e.itemOrderDate);
        this.f34811g = (OrderResultItemModel) findViewById(Ac.e.apbd_expired_date_tv);
        this.f34808d = (OrderResultItemModel) findViewById(Ac.e.itemTransType);
        this.f34809e = (OrderResultViewReceiptModel) findViewById(Ac.e.viewReceipt);
        ModelBillDetailTitle modelBillDetailTitle = (ModelBillDetailTitle) findViewById(Ac.e.titleBar);
        this.f34806b = modelBillDetailTitle;
        modelBillDetailTitle.f31466c.setText(Ac.h.main_from_palmpay);
        this.f34806b.f31471i.setImageResource(d.main_point);
        this.f34806b.f31473o.setVisibility(0);
        this.f34806b.f31473o.setImageDrawable(p059e1.a.h(this, S6.a.pay_Share, null, getColor(p.md_white_1000), 24.0f));
        ImageView imageView = this.f34806b.f31473o;
        e eVar = this.t;
        imageView.setOnClickListener(eVar);
        this.f34806b.f31473o.setVisibility(8);
        this.f34813j = (OrderResultItemModel) findViewById(Ac.e.apbd_origin_trading_number_tv);
        this.f34814o = (OrderResultItemModel) findViewById(Ac.e.itemPostDate);
        this.f34809e.setOnClickListener(eVar);
    }
}
