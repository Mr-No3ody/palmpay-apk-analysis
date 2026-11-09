package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import C9.ViewOnClickListenerC0146m;
import Cc.a;
import O6.c;
import V9.C0714c;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p071ef.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "佣金订单详情页/Commission Order Detail", path = "/main/commission_order_detail")
public class CommissionDetailActivity extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f34675w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelTitleContentImg f34682g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelTitleContentImg f34683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelCopyableText f34684j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34686p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f34687v;

    public static void m(CommissionDetailActivity commissionDetailActivity, String str) {
        commissionDetailActivity.getClass();
        c cVar = new c(commissionDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new ViewOnClickListenerC0146m(commissionDetailActivity, 27));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_commission_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).queryCommissionOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 13));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n(this.f34676a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34686p = (TextView) findViewById(e.textViewTransactionDate);
        this.f34685o = (TextView) findViewById(e.textViewPostDate);
        this.f34684j = (ModelCopyableText) findViewById(e.textViewRefNo);
        this.f34683i = (ModelTitleContentImg) findViewById(e.itemLocation);
        this.f34682g = (ModelTitleContentImg) findViewById(e.itemBillType);
        this.f34681f = (ModelBillDetailTextItem1) findViewById(e.itemTotal);
        this.f34680e = (ModelBillDetailTextItem1) findViewById(e.itemPoints);
        this.f34679d = (ModelBillDetailTextItem1) findViewById(e.itemCash);
        this.f34678c = (ModelBillDetailTextItem1) findViewById(e.itemAmount);
        this.f34677b = (ModelBillDetailTitle) findViewById(e.detailTitle);
        findViewById(e.textViewOriginOrder).setOnClickListener(new ViewOnClickListenerC1649v(this, 23));
    }
}
