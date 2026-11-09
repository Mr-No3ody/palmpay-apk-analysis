package com.transsnet.palmpay.account.ui.activity;

import B5.c;
import F8.e;
import F8.h;
import Je.l;
import L6.b;
import M7.s;
import N8.U;
import N8.V;
import O6.d;
import Pa.n0;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.security.utils.FingerPrintHelper$AuthenticationCallback;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/set_touch_id")
public class SetTouchIdActivity extends BaseActivity implements FingerPrintHelper$AuthenticationCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f26012o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p131id.a f26013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f26014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f26015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f26016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f26017e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f26019g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f26020i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f26018f = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final V f26021j = new V(this, 2);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_set_touch_id;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f26013a = new p131id.a(BaseApplication.getContext());
        boolean booleanExtra = getIntent().getBooleanExtra("IS_FORCE_SETTING_MODE", false);
        this.f26020i = Boolean.valueOf(booleanExtra);
        if (booleanExtra) {
            this.f26017e.setVisibility(0);
            this.f26016d.setVisibility(8);
            this.f26017e.setOnClickListener(this.f26021j);
        }
    }

    public final void l() {
        d dVar = this.f26019g;
        if (dVar != null && dVar.isShowing()) {
            this.f26019g.dismiss();
        }
        this.f26019g = null;
    }

    @Override // com.transsnet.palmpay.security.utils.FingerPrintHelper$AuthenticationCallback
    public final void onAuthenticationError() {
        this.f26015c.setVisibility(0);
        this.f26014b.setVisibility(8);
        this.f26018f.postDelayed(new c(this, 14), 3000L);
        p131id.a aVar = this.f26013a;
        if (aVar != null) {
            aVar.Y();
            if ("TNY-AL00".equals(Build.MODEL) && "HONOR".equals(Build.BRAND)) {
                return;
            }
            this.f26013a.X(this);
        }
    }

    @Override // com.transsnet.palmpay.security.utils.FingerPrintHelper$AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.f26015c.setVisibility(0);
        this.f26014b.setVisibility(8);
        this.f26018f.postDelayed(new c(this, 14), 3000L);
    }

    @Override // com.transsnet.palmpay.security.utils.FingerPrintHelper$AuthenticationCallback
    public final void onAuthenticationSucceeded(Cipher cipher) {
        n0.g().v("Enable_Touch_ID_Result_Success");
        D3.a.N("enable", "success", null);
        t tVar = new t(this);
        tVar.b();
        tVar.c(h.ac_msg_enable_touch_id_ok);
        tVar.f31311j = new U(this, 0);
        tVar.e(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        l();
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        p131id.a aVar = this.f26013a;
        if (aVar != null) {
            aVar.Y();
        }
        l();
        this.f26018f.removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f26018f.post(new s(this, 3));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().h();
        }
        initStatusBar(getColor(b.ppColorBackgroundLight));
        this.f26016d = (TextView) findViewById(F8.d.textViewSkip);
        this.f26014b = (TextView) findViewById(F8.d.textViewMessage);
        this.f26015c = (TextView) findViewById(F8.d.textViewError);
        this.f26017e = (TextView) findViewById(F8.d.acsti_use_pattern_tv);
        this.f26016d.setOnClickListener(new l(this, 24));
    }
}
