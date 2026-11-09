package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPswFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthTouchIdV2Fragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import io.fastkv.n;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/authentication")
public class AuthenticationActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25833d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25830a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25834e = 1;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_authentication;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (!new p131id.a(BaseApplication.getContext()).W()) {
            this.f25830a = this.f25830a != 4 ? 3 : 4;
        }
        if (this.f25830a != 0 || n.x()) {
            return;
        }
        this.f25830a = 3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return getIntent() != null ? !getIntent().getBooleanExtra("extra_use_night_mode", false) : super.isForceNoNightMode();
    }

    public final void l(int i7) {
        int i10 = d.fragment_container;
        boolean z3 = this.f25833d;
        int i11 = this.f25834e;
        AuthPinFragment authPinFragment = new AuthPinFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("extra_mode", i7);
        bundle.putBoolean("need_pin", z3);
        bundle.putInt("extra_type", i11);
        authPinFragment.setArguments(bundle);
        h.i(this, i10, authPinFragment);
    }

    public final void m(String str, String str2, boolean z3) {
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("extra_token", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("extra_data", str);
        }
        if (z3) {
            intent.putExtra("result", "1");
            setResult(-1, intent);
        } else {
            setResult(0);
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        int i7 = this.f25830a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return;
                        }
                        h.i(this, d.fragment_container, AuthPswFragment.f26101w.newInstance(i7, this.f25834e));
                        return;
                    }
                }
            }
            l(i7);
            return;
        }
        h.i(this, d.fragment_container, AuthTouchIdV2Fragment.f26106A.newInstance(i7, this.f25832c, null, getIntent().getStringExtra("extra_scene")));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        requestLayoutFullScreen();
    }
}
