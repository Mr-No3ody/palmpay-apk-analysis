package com.transsnet.palmpay.ui.activity.detail;

import Ac.f;
import C9.ViewOnClickListenerC0146m;
import Cc.a;
import O6.c;
import V9.C0714c;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import java.io.File;
import p025ba.k;
import p071ef.b;
import p160ke.e;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/merchant_order_detail")
public class MerchantOrderDetailActivity extends h implements CompleteCallback<File> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f34703Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34704A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f34705B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f34706C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RelativeLayout f34707H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f34708L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f34709M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f34711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelBillDetailTextItem1 f34716g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelTitleContentImg f34717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelTitleContentImg f34718j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelTitleContentImg f34719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelCopyableText f34720p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f34721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f34722w;

    public static void m(MerchantOrderDetailActivity merchantOrderDetailActivity, String str) {
        merchantOrderDetailActivity.getClass();
        c cVar = new c(merchantOrderDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new ViewOnClickListenerC0146m(merchantOrderDetailActivity, 28));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_merchant_order_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34710a)) {
            this.f34710a = getQueryParameter("orderId");
        }
        this.f34711b.t.setOnClickListener(new e(this, 0));
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).getMerchantOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 14));
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] fileArr2 = fileArr;
        ModelBillDetailTitle modelBillDetailTitle = this.f34711b;
        if (modelBillDetailTitle != null) {
            modelBillDetailTitle.t.setVisibility(0);
        }
        ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", fileArr2[0]).navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n(this.f34710a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34711b = (ModelBillDetailTitle) findViewById(Ac.e.detailTitle);
        this.f34712c = (ModelBillDetailTextItem1) findViewById(Ac.e.itemAmount);
        this.f34713d = (ModelBillDetailTextItem1) findViewById(Ac.e.itemFee);
        this.f34714e = (ModelBillDetailTextItem1) findViewById(Ac.e.itemPointUsed);
        this.f34715f = (ModelBillDetailTextItem1) findViewById(Ac.e.itemPointEarned);
        this.f34716g = (ModelBillDetailTextItem1) findViewById(Ac.e.itemTotal);
        this.f34717i = (ModelTitleContentImg) findViewById(Ac.e.itemRefund);
        this.f34718j = (ModelTitleContentImg) findViewById(Ac.e.itemBillType);
        this.f34719o = (ModelTitleContentImg) findViewById(Ac.e.itemPaymentMethod);
        this.f34720p = (ModelCopyableText) findViewById(Ac.e.textViewRefNo);
        this.t = (TextView) findViewById(Ac.e.textViewPostDate);
        this.f34721v = (TextView) findViewById(Ac.e.textViewTransactionDate);
        this.f34722w = (TextView) findViewById(Ac.e.textViewOriginOrder);
        this.f34706C = (TextView) findViewById(s.textViewFailReason);
        this.f34705B = findViewById(Ac.e.viewFailReason);
        this.f34716g.f31454c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f34707H = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        this.f34708L = (TextView) findViewById(s.atubd_contact_service_tv);
        this.f34709M = (TextView) findViewById(Ac.e.textViewPendingMessage);
        this.f34704A = (ModelBillDetailTextItem1) findViewById(Ac.e.itemCoupon);
    }
}
