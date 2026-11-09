package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Ac.e;
import Ac.f;
import Ac.h;
import Ce.C0170l;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chuanyi.ad.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.MerchantPaymentResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.TPMerchantPaymentMsg;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ActivityUtils;
import p025ba.k;
import p039cb.c;
import p297te.d;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/third_party_merchant_result")
public class TPMerchantPaymentResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f34980p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f34981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LottieAnimationView f34982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PpButton f34985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleAdView f34987g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34989j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MerchantPaymentResult f34990o;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_merchant_payment_result_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ARouter.getInstance().inject(this);
        C0525w c0525wF = C0525w.f();
        String str = this.f34988i;
        c0525wF.getClass();
        MerchantPaymentResult merchantPaymentResult = (MerchantPaymentResult) C0525w.d(str, MerchantPaymentResult.class);
        this.f34990o = merchantPaymentResult;
        if (merchantPaymentResult == null) {
            finish();
            return;
        }
        if (merchantPaymentResult.getExtVerifyMethod() == 1) {
            this.f34982b.e();
            this.f34983c.setTextSize(1, 18.0f);
            this.f34983c.setText(h.main_merchant_payment_pending_desc);
            this.f34984d.setText(h.main_default_text);
            this.f34981a.setVisibility(8);
            this.f34985e.setText(getString(k.core_pay_with_ussd));
            this.f34985e.setVisibility(0);
            this.f34985e.setOnClickListener(new d(this, 3));
            this.f34986f.setVisibility(0);
        } else if (this.f34990o.getPayStatus().intValue() == 1) {
            this.f34982b.setImageResource(r.cv_result_success);
            i0.k0();
            this.f34983c.setText(k.core_success_upper);
            this.f34984d.setText(h.main_merchant_payment_success_desc);
            this.f34985e.setText(getString(h.main_go_back_to_merchant_desc));
            this.f34987g.setVisibility(0);
        } else if (this.f34990o.getPayStatus().intValue() == 3) {
            this.f34982b.setImageResource(r.cv_result_pending);
            this.f34983c.setText(k.core_pending_upper);
            this.f34984d.setText(h.main_merchant_payment_pending_desc);
            this.f34985e.setText(getString(h.main_go_back_to_merchant_desc));
            this.f34987g.setVisibility(0);
        } else {
            this.f34982b.setImageResource(r.cv_result_fail);
            this.f34983c.setText(k.core_failed_upper);
            this.f34984d.setText(h.main_merchant_payment_fail_desc);
            this.f34985e.setText(getString(k.core_try_again));
            this.f34985e.setVisibility(0);
            this.f34987g.setVisibility(8);
        }
        this.f34985e.setOnClickListener(new d(this, 2));
    }

    public final void l(View view) {
        int id2 = view.getId();
        if (id2 == e.share_bt) {
            r0.L1(null, new C0170l(1), findViewById(e.rootView));
        } else if (id2 == e.ussd_guide_tv) {
            try {
                c cVar = new c(this, 12);
                cVar.f18902c = this.f34990o.getPayerWalletChannel();
                cVar.g();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        org.greenrobot.eventbus.c.b().f(new TPMerchantPaymentMsg(this.f34988i));
        if (ActivityUtils.isActivityExistsInStack((Class<?>) ThirdPartyMerchantActivity.class)) {
            ActivityUtils.finishToActivity((Class<?>) ThirdPartyMerchantActivity.class, false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdManager.clearPreloadSingleAd();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34981a = (ImageView) findViewById(e.share_bt);
        this.f34982b = (LottieAnimationView) findViewById(e.result_img);
        this.f34983c = (TextView) findViewById(e.result_tv);
        this.f34984d = (TextView) findViewById(e.result_desc_tv);
        this.f34985e = (PpButton) findViewById(e.complete_bt);
        this.f34986f = (TextView) findViewById(e.ussd_guide_tv);
        this.f34987g = (SingleAdView) findViewById(e.actur_ad);
        findViewById(e.share_bt).setOnClickListener(new d(this, 0));
        findViewById(e.ussd_guide_tv).setOnClickListener(new d(this, 1));
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getColor(b.ppColorBackgroundLight));
        this.f34987g.setSlotId(org.chromium.support_lib_boundary.util.b.z(TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT));
        this.f34987g.setAdListener(new a(this.f34987g, "TPMerchantPaymentResult"));
    }
}
