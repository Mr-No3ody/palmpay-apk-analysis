package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Ac.f;
import Cc.a;
import O6.c;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import p025ba.k;
import p071ef.b;
import p185ma.e;
import p294tb.C2055q;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/third_party_merchant_order_detail")
public class ThirdPartyMerchantOrderDetailActivity extends h {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f35001M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f35002A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f35003B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RelativeLayout f35004C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f35005H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f35006L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ModelBillDetailTitle f35008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f35009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem1 f35010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem1 f35011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem1 f35012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelBillDetailTextItem1 f35013g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelTitleContentImg f35014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelTitleContentImg f35015j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelTitleContentImg f35016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelTitleContentImg f35017p;
    public ModelCopyableText t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35019w;

    public static void m(ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity, String str) {
        thirdPartyMerchantOrderDetailActivity.getClass();
        c cVar = new c(thirdPartyMerchantOrderDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new e(thirdPartyMerchantOrderDetailActivity, 15));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_third_party_merchant_order_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f35007a)) {
            this.f35007a = getQueryParameter("orderId");
        }
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        showLoadingDialog(true);
        ((IApiMainService) a.f1353a.f39520b).queryThirdPartyMerchantOrderDetail(str).k(p298tf.f.f42629b).i(b.a()).subscribe(new C2055q(this, 7));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n(this.f35007a);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f35008b = (ModelBillDetailTitle) findViewById(Ac.e.detailTitle);
        this.f35009c = (ModelBillDetailTextItem1) findViewById(Ac.e.itemAmount);
        this.f35010d = (ModelBillDetailTextItem1) findViewById(Ac.e.itemFee);
        this.f35011e = (ModelBillDetailTextItem1) findViewById(Ac.e.itemPointUsed);
        this.f35012f = (ModelBillDetailTextItem1) findViewById(Ac.e.itemPointEarned);
        this.f35013g = (ModelBillDetailTextItem1) findViewById(Ac.e.itemTotal);
        this.f35014i = (ModelTitleContentImg) findViewById(Ac.e.itemRefund);
        this.f35015j = (ModelTitleContentImg) findViewById(Ac.e.itemBillType);
        this.f35016o = (ModelTitleContentImg) findViewById(Ac.e.itemPaymentMethod);
        this.f35017p = (ModelTitleContentImg) findViewById(Ac.e.itemEmail);
        this.t = (ModelCopyableText) findViewById(Ac.e.textViewRefNo);
        this.f35018v = (TextView) findViewById(Ac.e.textViewPostDate);
        this.f35019w = (TextView) findViewById(Ac.e.textViewTransactionDate);
        this.f35003B = (TextView) findViewById(s.textViewFailReason);
        this.f35002A = findViewById(Ac.e.viewFailReason);
        this.f35013g.f31454c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f35004C = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        this.f35005H = (TextView) findViewById(s.atubd_contact_service_tv);
        this.f35006L = (TextView) findViewById(Ac.e.textViewPendingMessage);
    }
}
