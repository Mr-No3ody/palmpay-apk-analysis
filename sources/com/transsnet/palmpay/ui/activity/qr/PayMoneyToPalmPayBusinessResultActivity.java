package com.transsnet.palmpay.ui.activity.qr;

import Ac.f;
import V9.C0714c;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.rsp.PayMoneyToPalmpayBusinessDetailRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p025ba.k;
import p071ef.b;
import p185ma.e;
import p324va.c;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/pay_money_to_palmpay_business_result_page")
public class PayMoneyToPalmPayBusinessResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f34833A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f34835C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f34836H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PayMoneyToPalmpayBusinessDetailRsp f34837L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f34839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f34841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f34842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f34843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelPaymentMethodItem f34844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelPaymentResultProgress f34845g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f34846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f34847j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleAdView f34848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f34849p;
    public a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f34850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34851w;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f34834B = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final e f34838M = new e(this, 8);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_pay_money_to_palmpay_business_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        if (this.f34834B == -1) {
            this.f34834B = intent.getIntExtra("orderState", -1);
        }
        int i7 = this.f34834B;
        if (i7 == 1 || i7 == 7) {
            AutoTrackUtil.trackTransactionResult(this, 1);
        } else if (i7 == 0 || i7 == 5 || i7 == 8 || i7 == 9 || i7 == 10 || i7 == 14 || i7 == 11) {
            AutoTrackUtil.trackTransactionResult(this, 3);
        } else {
            AutoTrackUtil.trackTransactionResult(this, 2);
        }
        if (TextUtils.isEmpty(this.f34835C)) {
            finish();
        } else {
            try {
                this.f34836H = new JSONObject(this.f34835C).optString("orderId");
            } catch (Exception unused) {
            }
            l();
        }
    }

    public final void l() {
        ((PayApiService) c.f43141a.f14621b).querySendMoneyOrderByOrderId(this.f34836H).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 21));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdManager.clearPreloadSingleAd();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceivePushMessage(PushMessage pushMessage) {
        PushMessage.Content content;
        if (pushMessage == null || (content = pushMessage.content) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(content.messageType) || "1000".equals(pushMessage.content.messageType) || "1036".equals(pushMessage.content.messageType)) {
            l();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        this.f34845g = (ModelPaymentResultProgress) findViewById(Ac.e.aaturv_result_progress_view);
        this.f34839a = (Button) findViewById(Ac.e.actur_complete_btn);
        this.f34840b = (TextView) findViewById(Ac.e.actur_done_tv);
        this.f34846i = (LinearLayout) findViewById(Ac.e.aatu_order_data_area);
        this.f34847j = (ImageView) findViewById(Ac.e.imageViewShare);
        this.f34841c = (RelativeLayout) findViewById(Ac.e.mam_booker_item);
        this.f34842d = (RelativeLayout) findViewById(Ac.e.aatu_amount_item);
        this.f34843e = (RelativeLayout) findViewById(Ac.e.aatu_reference_number_item);
        this.f34844f = (ModelPaymentMethodItem) findViewById(Ac.e.aatu_payment_method_item);
        this.f34848o = (SingleAdView) findViewById(Ac.e.actur_ad);
        this.f34849p = new a(this.f34841c, 21);
        this.t = new a(this.f34842d, 21);
        this.f34850v = new a(this.f34843e, 21);
        ((TextView) this.f34849p.f42646c).setText("Recipient");
        ((TextView) this.t.f42646c).setText(k.core_amount);
        ((TextView) this.f34850v.f42646c).setText(k.core_reference_no_2);
        TextView textView = this.f34840b;
        e eVar = this.f34838M;
        textView.setOnClickListener(eVar);
        this.f34839a.setOnClickListener(eVar);
        this.f34847j.setOnClickListener(eVar);
        ARouter.getInstance().inject(this);
        this.f34848o.setSlotId(org.chromium.support_lib_boundary.util.b.z(TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS));
        this.f34848o.setAdListener(new com.chuanyi.ad.a(this.f34848o, "Business"));
    }
}
