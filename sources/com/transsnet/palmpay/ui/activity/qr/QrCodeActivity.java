package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import Ac.f;
import L6.b;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.ui.fragment.QrReceiveMoneyFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.List;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/main_qrcode_activity")
public class QrCodeActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f34869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f34870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f34871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f34872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f34873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f34874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f34875g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f34876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f34877j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34878o;
    public C1161a t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34879p = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final QrReceiveMoneyFragment f34880v = new QrReceiveMoneyFragment();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final QrReceiveMoneyFragment f34881w = new QrReceiveMoneyFragment();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final QrCodePayMoneyFragment f34868A = new QrCodePayMoneyFragment();

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_qr_code;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorPrimary));
    }

    public final void l(int i7) {
        View[] viewArr = {this.f34869a, this.f34870b, this.f34871c};
        View[] viewArr2 = {this.f34872d, this.f34873e, this.f34874f};
        ImageView[] imageViewArr = {this.f34875g, this.f34876i, this.f34877j};
        QrCodePayMoneyFragment qrCodePayMoneyFragment = this.f34868A;
        if (i7 == 2) {
            qrCodePayMoneyFragment.f34896p0 = true;
            if (!SPUtils.getInstance().getBoolean("AUTH_PAY_QRCODE", false)) {
                qrCodePayMoneyFragment.f34901w.setVisibility(0);
            }
        } else {
            qrCodePayMoneyFragment.f34896p0 = false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == i7) {
                viewArr[i10].setVisibility(0);
                imageViewArr[i10].setImageDrawable(a.h(this, S6.a.pay_ArrowUp, null, getColor(b.ppColorPrimary), 16.0f));
                viewArr2[i10].setBackground(getResources().getDrawable(r.cv_shape_rect_top_corner_white_8));
            } else {
                viewArr[i10].setVisibility(8);
                imageViewArr[i10].setImageDrawable(a.h(this, S6.a.pay_Arrowdown, null, getColor(b.ppColorPrimary), 16.0f));
                viewArr2[i10].setBackground(getResources().getDrawable(r.cv_shape_rect_corner_8_bg_white));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        List<Activity> activityList = ActivityUtils.getActivityList();
        if (activityList == null || activityList.size() <= 1) {
            super.onBackPressed();
        } else {
            goBackToHome();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == e.aqc_receive_money_item) {
            l(0);
        } else if (id2 == e.aqc_cash_in_item) {
            l(1);
        } else if (id2 == e.aqc_pay_qrcode_item) {
            l(2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f34877j = (ImageView) findViewById(e.pay_qrcode_arrow_iv);
        this.f34876i = (ImageView) findViewById(e.cash_in_arrow_iv);
        this.f34875g = (ImageView) findViewById(e.receive_money_arrow_iv);
        this.f34869a = findViewById(e.receive_money_container);
        this.f34870b = findViewById(e.cash_in_container);
        this.f34871c = findViewById(e.pay_qrcode_container);
        this.f34872d = findViewById(e.aqc_receive_money_item);
        this.f34873e = findViewById(e.aqc_cash_in_item);
        this.f34874f = findViewById(e.aqc_pay_qrcode_item);
        ARouter.getInstance().inject(this);
        this.f34872d.setOnClickListener(this);
        this.f34873e.setOnClickListener(this);
        this.f34874f.setOnClickListener(this);
        Z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1161a c1161a = new C1161a(supportFragmentManager);
        this.t = c1161a;
        c1161a.a(this.f34880v, e.receive_money_container);
        this.t.a(this.f34881w, e.cash_in_container);
        this.t.a(this.f34868A, e.pay_qrcode_container);
        this.t.h(false);
        if (!TextUtils.isEmpty(this.f34878o)) {
            try {
                this.f34879p = Integer.valueOf(this.f34878o).intValue();
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
        }
        l(this.f34879p);
        if (BaseApplication.isAO()) {
            this.f34870b.setVisibility(8);
            this.f34871c.setVisibility(8);
            this.f34873e.setVisibility(8);
            this.f34874f.setVisibility(8);
            this.f34875g.setVisibility(8);
        }
    }
}
