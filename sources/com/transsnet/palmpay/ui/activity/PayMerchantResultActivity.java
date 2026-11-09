package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import C9.ViewOnClickListenerC0146m;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.r;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/pay_merchant_result")
public class PayMerchantResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f34525p0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public top.zibin.luban.io.a f34526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public top.zibin.luban.io.a f34527B;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f34530L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f34531M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f34532Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f34533X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f34534Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f34535Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PpButton f34536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LottieAnimationView f34541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f34542g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f34543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f34544j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f34546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f34547p;
    public SingleAdView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public top.zibin.luban.io.a f34548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public top.zibin.luban.io.a f34549w;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f34528C = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f34529H = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f34545k0 = new ViewOnClickListenerC0146m(this, 25);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_paymerchant_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdManager.clearPreloadSingleAd();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f34532Q)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f34532Q);
                this.f34534Y = jSONObject.optString("orderNo");
                this.f34535Z = jSONObject.optInt("orderStatus");
                this.f34534Y = i0.Y(this.f34534Y);
                long j6 = jSONObject.getLong("amount");
                this.f34533X = j6;
                ((TextView) this.f34549w.f42647d).setText(r0.B(j6, true));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        int i7 = this.f34535Z;
        if (i7 == 0 || i7 == 1) {
            getString(k.core_pending);
            this.f34541f.setImageResource(r.cv_result_pending);
            this.f34537b.setText(k.core_hint_pay_merchant_pending);
            this.f34538c.setText(k.core_pending_upper);
            this.t.setVisibility(0);
            return;
        }
        if (i7 == 2) {
            getString(k.core_completed);
            this.f34537b.setText(k.core_hint_pay_merchant_success);
            this.f34538c.setText(k.core_success_upper);
            this.f34541f.setImageResource(r.cv_result_success);
            this.t.setVisibility(0);
            return;
        }
        if (i7 != 3) {
            if (i7 != 4) {
                return;
            }
            getString(k.core_closed);
        } else {
            getString(k.core_failed);
            this.f34541f.setImageResource(r.cv_result_fail);
            this.f34537b.setText(k.core_hint_pay_merchant_fail);
            this.f34538c.setText(k.core_failed_upper);
            this.t.setVisibility(8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34536a = (PpButton) findViewById(e.actur_complete_btn);
        this.f34537b = (TextView) findViewById(e.actur_hint_tv);
        this.f34538c = (TextView) findViewById(e.actur_result_title_tv);
        this.f34541f = (LottieAnimationView) findViewById(e.actur_iv);
        this.f34539d = (TextView) findViewById(e.actur_done_tv);
        this.f34540e = (TextView) findViewById(e.ussd_guide_tv);
        this.f34547p = (ImageView) findViewById(e.imageViewShare);
        this.f34542g = (RelativeLayout) findViewById(e.mam_booker_item);
        this.f34543i = (RelativeLayout) findViewById(e.aatu_amount_item);
        this.f34544j = (RelativeLayout) findViewById(e.aatu_points_earnd_item);
        this.f34546o = (RelativeLayout) findViewById(e.aatu_payment_method_item);
        this.t = (SingleAdView) findViewById(e.actur_ad);
        this.f34548v = new top.zibin.luban.io.a(this.f34542g, 21);
        this.f34549w = new top.zibin.luban.io.a(this.f34543i, 21);
        this.f34526A = new top.zibin.luban.io.a(this.f34544j, 21);
        this.f34527B = new top.zibin.luban.io.a(this.f34546o, 21);
        ((TextView) this.f34548v.f42646c).setText("Recipient");
        ((TextView) this.f34549w.f42646c).setText("Amount");
        ((TextView) this.f34526A.f42646c).setText("Cashback earned");
        ((TextView) this.f34527B.f42646c).setText("Payment method");
        TextView textView = this.f34539d;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f34545k0;
        textView.setOnClickListener(viewOnClickListenerC0146m);
        this.f34536a.setOnClickListener(viewOnClickListenerC0146m);
        this.f34540e.setOnClickListener(viewOnClickListenerC0146m);
        this.f34547p.setOnClickListener(viewOnClickListenerC0146m);
        this.t.setSlotId(org.chromium.support_lib_boundary.util.b.z(TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B));
        this.t.setAdListener(new com.chuanyi.ad.a(this.t, "CtoB"));
        ARouter.getInstance().inject(this);
        this.f34536a.setText("Complete");
    }
}
