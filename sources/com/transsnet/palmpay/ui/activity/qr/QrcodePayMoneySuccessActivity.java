package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import Ac.f;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.rsp.QueryAcqOrderDetailRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import p071ef.b;
import p271re.m;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/qrcode_pay_money_success_page")
public class QrcodePayMoneySuccessActivity extends BaseActivity {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f34920C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f34921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public QueryAcqOrderDetailRsp.DataBean f34922B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f34923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f34924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f34926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f34927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f34929g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f34930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f34931j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f34933p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f34934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f34935w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_qrcode_pay_money_success_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("orderNo");
        this.f34921A = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).queryAcqOrderDetail(stringExtra).k(p298tf.f.f42629b).i(b.a()).subscribe(new m(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        ARouter.getInstance().build("/main/home").navigation();
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34935w = (TextView) findViewById(e.result_one_btn);
        this.f34934v = (TextView) findViewById(e.qecode_points_earned_tv);
        this.t = (TextView) findViewById(e.qecode_coupon_tv);
        this.f34933p = (TextView) findViewById(e.actual_payment_tv);
        this.f34932o = (TextView) findViewById(e.qecode_pay_order_number);
        this.f34931j = (TextView) findViewById(e.qecode_pay_store_name_tv);
        this.f34930i = (TextView) findViewById(e.qecode_pay_promotions_tv);
        this.f34929g = (TextView) findViewById(e.qecode_pay_vat_tv);
        this.f34928f = (TextView) findViewById(e.qecode_pay_amount);
        this.f34923a = (LottieAnimationView) findViewById(e.tf_money_result_img);
        this.f34924b = (TextView) findViewById(e.tf_money_result_tv);
        this.f34925c = (TextView) findViewById(e.qecode_pay_title_amount);
        this.f34926d = findViewById(e.result_content);
        this.f34927e = (TextView) findViewById(e.qecode_pay_fee);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getColor(L6.b.ppColorBackgroundLight));
        this.f34935w.setOnClickListener(new p185ma.e(this, 9));
    }
}
