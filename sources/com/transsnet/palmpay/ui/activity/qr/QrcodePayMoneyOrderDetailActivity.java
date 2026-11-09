package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import Ac.f;
import Pa.i0;
import Pa.r0;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.rsp.QueryAcqOrderDetailRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.ui.activity.qr.QrcodePayMoneyOrderDetailActivity;
import p071ef.b;
import p271re.k;
import p271re.l;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/main_qrcode_pay_bill_detail_page")
public class QrcodePayMoneyOrderDetailActivity extends h {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f34902L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f34903A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ReportTransactionItem f34904B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f34905C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f34906H = new l(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelTitleContentImg f34909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelTitleContentImg f34910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34913g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f34915j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelAmountList f34916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public QueryAcqOrderDetailRsp.DataBean f34917p;
    public LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f34918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f34919w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_qrcode_pay_money_order_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34907a)) {
            this.f34907a = getIntent().getStringExtra("orderId");
        }
        Uri data = getIntent().getData();
        if (data != null && TextUtils.isEmpty(this.f34907a)) {
            this.f34907a = data.getQueryParameter("orderId");
        }
        String str = this.f34907a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).queryAcqOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new k(this));
    }

    public final OrderInfoForCustomerService m() {
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        orderInfoForCustomerService.paymentType = getString(p025ba.k.core_fund);
        QueryAcqOrderDetailRsp.DataBean dataBean = this.f34917p;
        orderInfoForCustomerService.time = dataBean.createTime;
        orderInfoForCustomerService.amount = dataBean.payAmount;
        orderInfoForCustomerService.fee = dataBean.payerFee;
        orderInfoForCustomerService.orderNumber = dataBean.orderNo;
        orderInfoForCustomerService.orderStatus = this.f34903A;
        orderInfoForCustomerService.vat = dataBean.payerVat;
        orderInfoForCustomerService.pointsUsed = dataBean.loyaltyPoint;
        orderInfoForCustomerService.pointsEarned = dataBean.returnPoint;
        return orderInfoForCustomerService;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        this.f34908b = (ModelBillDetailTitle) findViewById(e.ard_title_area);
        this.f34909c = (ModelTitleContentImg) findViewById(e.ard_item_payment_method);
        this.f34910d = (ModelTitleContentImg) findViewById(e.ard_bill_type);
        this.f34911e = (TextView) findViewById(e.ard_create_time);
        this.f34912f = (TextView) findViewById(e.ard_order_number);
        this.f34914i = (TextView) findViewById(e.ard_remark);
        this.f34915j = (LinearLayout) findViewById(e.ard_remark_container);
        this.f34916o = (ModelAmountList) findViewById(e.ard_amount_list);
        this.f34913g = (TextView) findViewById(e.ard_posted_time);
        this.f34916o.f31440w.f31454c.setTypeface(Typeface.DEFAULT_BOLD);
        this.t = (LinearLayout) findViewById(s.atubd_error_reason_area);
        this.f34918v = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        this.f34919w = (TextView) findViewById(s.atubd_contact_service_tv);
        this.f34904B = (ReportTransactionItem) findViewById(e.common_report_item);
        this.f34905C = findViewById(e.itemReport);
        final int i7 = 0;
        this.f34919w.setOnClickListener(new View.OnClickListener(this) { // from class: re.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrcodePayMoneyOrderDetailActivity f41799b;

            {
                this.f41799b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity = this.f41799b;
                switch (i7) {
                    case 0:
                        int i10 = QrcodePayMoneyOrderDetailActivity.f34902L;
                        i0.M(qrcodePayMoneyOrderDetailActivity, qrcodePayMoneyOrderDetailActivity.m());
                        break;
                    default:
                        qrcodePayMoneyOrderDetailActivity.f34908b.t.setVisibility(4);
                        r0.L1(qrcodePayMoneyOrderDetailActivity.f34907a, qrcodePayMoneyOrderDetailActivity.f34906H, qrcodePayMoneyOrderDetailActivity.f34908b, qrcodePayMoneyOrderDetailActivity.findViewById(e.scrollView));
                        break;
                }
            }
        });
        ARouter.getInstance().inject(this);
        this.f34908b.t.setVisibility(8);
        final int i10 = 1;
        this.f34908b.t.setOnClickListener(new View.OnClickListener(this) { // from class: re.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrcodePayMoneyOrderDetailActivity f41799b;

            {
                this.f41799b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity = this.f41799b;
                switch (i10) {
                    case 0:
                        int i11 = QrcodePayMoneyOrderDetailActivity.f34902L;
                        i0.M(qrcodePayMoneyOrderDetailActivity, qrcodePayMoneyOrderDetailActivity.m());
                        break;
                    default:
                        qrcodePayMoneyOrderDetailActivity.f34908b.t.setVisibility(4);
                        r0.L1(qrcodePayMoneyOrderDetailActivity.f34907a, qrcodePayMoneyOrderDetailActivity.f34906H, qrcodePayMoneyOrderDetailActivity.f34908b, qrcodePayMoneyOrderDetailActivity.findViewById(e.scrollView));
                        break;
                }
            }
        });
    }
}
