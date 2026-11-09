package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import V9.C0714c;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.rsp.PayMoneyToPalmpayBusinessDetailRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import p059e1.a;
import p071ef.b;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/_offline_payment_detail_billdetail")
public class OfflineQrPaymenttDetailActivity extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelTitleContentImg f34725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelCopyableText f34726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelAmountList f34729g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PayMoneyToPalmpayBusinessDetailRsp f34730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ReportTransactionItem f34731j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f34732o;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_offline_qr_paymentl_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).querySendMoneyOrderByOrderId(this.f34723a).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 15));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34729g = (ModelAmountList) findViewById(e.apbd_amount_list);
        this.f34726d = (ModelCopyableText) findViewById(e.maoqpd_trading_number_tv);
        this.f34727e = (TextView) findViewById(e.maoqpd_order_date_tv);
        this.f34725c = (ModelTitleContentImg) findViewById(e.itemTransType);
        ModelBillDetailTitle modelBillDetailTitle = (ModelBillDetailTitle) findViewById(e.maoqpd_title_info_area);
        this.f34724b = modelBillDetailTitle;
        modelBillDetailTitle.f31466c.setText(Ac.h.main_from_palmpay);
        this.f34724b.f31471i.setImageResource(r.cv_bill_default_icon);
        this.f34724b.f31473o.setVisibility(0);
        this.f34724b.f31473o.setImageDrawable(a.h(this, S6.a.pay_Share, null, getColor(p.md_white_1000), 24.0f));
        this.f34724b.f31473o.setVisibility(8);
        this.f34728f = (TextView) findViewById(e.maoqpd_post_date_tv);
        this.f34729g.e(true);
        this.f34729g.f31432e.setVisibility(0);
        this.f34729g.f31431d.setVisibility(8);
        this.f34731j = (ReportTransactionItem) findViewById(e.common_report_item);
        this.f34732o = findViewById(e.itemReport);
    }
}
