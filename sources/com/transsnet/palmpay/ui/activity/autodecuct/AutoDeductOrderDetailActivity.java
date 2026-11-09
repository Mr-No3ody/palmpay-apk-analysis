package com.transsnet.palmpay.ui.activity.autodecuct;

import Ac.e;
import Ac.f;
import Cc.a;
import L6.b;
import O6.c;
import V9.C0714c;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.ui.widget.BillDetailProcessDataWedgit;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/auto_deduct_order_detail")
public class AutoDeductOrderDetailActivity extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f34611A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34618g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelTitleContentImg f34620j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelTitleContentImg f34621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelCopyableText f34622p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f34623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BillDetailProcessDataWedgit f34624w;

    public static void m(AutoDeductOrderDetailActivity autoDeductOrderDetailActivity, String str) {
        autoDeductOrderDetailActivity.getClass();
        c cVar = new c(autoDeductOrderDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new ViewOnClickListenerC1649v(autoDeductOrderDetailActivity, 9));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_auto_deduct_order_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar(int i7) {
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).getAutoDeductOrderDetail(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 9));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (TextUtils.isEmpty(this.f34612a)) {
            this.f34612a = getQueryParameter("orderId");
        }
        n(this.f34612a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34624w = (BillDetailProcessDataWedgit) findViewById(e.atu_bill_process);
        this.f34623v = (TextView) findViewById(e.textViewOriginOrder);
        this.t = (TextView) findViewById(e.textViewTransactionDate);
        this.f34622p = (ModelCopyableText) findViewById(e.textViewRefNo);
        this.f34621o = (ModelTitleContentImg) findViewById(e.itemPaymentMethod);
        this.f34620j = (ModelTitleContentImg) findViewById(e.itemBillType);
        this.f34619i = (ModelBillDetailTextItem1) findViewById(e.itemTotal);
        this.f34618g = (ModelBillDetailTextItem1) findViewById(e.itemPointEarned);
        this.f34617f = (ModelBillDetailTextItem1) findViewById(e.itemPointUsed);
        this.f34616e = (ModelBillDetailTextItem1) findViewById(e.itemVAT);
        this.f34615d = (ModelBillDetailTextItem1) findViewById(e.itemFee);
        this.f34614c = (ModelBillDetailTextItem1) findViewById(e.itemAmount);
        this.f34613b = (ModelBillDetailTitle) findViewById(e.detailTitle);
    }
}
