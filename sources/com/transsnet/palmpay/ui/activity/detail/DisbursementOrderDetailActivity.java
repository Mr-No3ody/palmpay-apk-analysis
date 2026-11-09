package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import Cc.a;
import O6.c;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p071ef.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/disbursement_order_detail")
public class DisbursementOrderDetailActivity extends h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34688p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTitle f34691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem f34692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelTitleContentImg f34693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelCopyableText f34694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34695g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f34697j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f34698o;

    public static void m(DisbursementOrderDetailActivity disbursementOrderDetailActivity, String str) {
        disbursementOrderDetailActivity.getClass();
        c cVar = new c(disbursementOrderDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new ViewOnClickListenerC1649v(disbursementOrderDetailActivity, 24));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_disbursement_order_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34689a)) {
            this.f34689a = getQueryParameter("orderId");
        }
        if (TextUtils.isEmpty(this.f34690b)) {
            this.f34690b = getQueryParameter("extra_data");
        }
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT.equalsIgnoreCase(this.f34690b)) {
            showLoadingDialog(true);
            ((IApiMainService) a.f1353a.f39520b).queryBulkDisbursementOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new p160ke.b(this, 1));
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            showLoadingDialog(true);
            ((IApiMainService) a.f1353a.f39520b).getMerchantDisburseOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new p160ke.b(this, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n(this.f34689a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34691c = (ModelBillDetailTitle) findViewById(e.titleView);
        this.f34692d = (ModelBillDetailTextItem) findViewById(e.itemAmount);
        this.f34693e = (ModelTitleContentImg) findViewById(e.itemPaymentType);
        this.f34694f = (ModelCopyableText) findViewById(e.textViewRefNo);
        this.f34695g = (TextView) findViewById(e.textViewTransactionDate);
        this.f34696i = (TextView) findViewById(e.textViewExpiredDate);
        this.f34697j = (TextView) findViewById(e.tvRemark);
        this.f34698o = findViewById(e.viewRemark);
    }
}
