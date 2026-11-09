package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import F8.f;
import F8.h;
import L6.b;
import N8.P;
import N8.Q;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.PatternLockResultView;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.util.BarUtils;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/set_pattern_pin")
public class SetPatternPinActivity extends BaseActivity {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f25991H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Boolean f25992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f25993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Q f25994C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PatternLockView f25995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PatternLockResultView f25996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f25997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f25998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f25999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f26000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f26001g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConstraintLayout f26002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26003j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26004o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f26005p;
    public int[] t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PpTitleBar f26006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f26007w;

    public SetPatternPinActivity() {
        Boolean bool = Boolean.FALSE;
        this.f26007w = bool;
        this.f25992A = bool;
        this.f25993B = 0;
        this.f25994C = new Q(this, 0);
    }

    public static void l(SetPatternPinActivity setPatternPinActivity) {
        setPatternPinActivity.f26004o = 1;
        setPatternPinActivity.f25999e.setText(h.ac_pattern_step1);
        int[] iArr = setPatternPinActivity.f26005p;
        if (iArr != null) {
            for (int i7 = 0; i7 < iArr.length; i7++) {
                iArr[i7] = -1;
            }
        }
        int[] iArr2 = setPatternPinActivity.t;
        if (iArr2 != null) {
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                iArr2[i10] = -1;
            }
        }
        PatternLockResultView patternLockResultView = setPatternPinActivity.f25996b;
        patternLockResultView.b();
        patternLockResultView.invalidate();
        setPatternPinActivity.n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_set_pattern_pin_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return getIntent() != null ? !getIntent().getBooleanExtra("extra_use_night_mode", false) : super.isForceNoNightMode();
    }

    public final void m(String str) {
        this.f25997c.setTextColor(getResources().getColor(b.ppColorError));
        this.f25997c.setText(str);
    }

    public final void n() {
        this.f25997c.setTextColor(getResources().getColor(b.ppColorTextPrimary));
        if (this.f26004o == 1) {
            this.f25997c.setText(h.ac_msg_draw_your_pattern);
        } else {
            this.f25997c.setText(h.ac_msg_draw_your_pattern_again);
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 257 && i10 == -1) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f26007w.booleanValue()) {
            getMenuInflater().inflate(f.ac_menu_security_question, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f25992A.booleanValue()) {
            return i7 == 4 && keyEvent.getRepeatCount() == 0;
        }
        finish();
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (d.menu_skip != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f26006v = (PpTitleBar) findViewById(d.mpa_title);
        this.f25995a = (PatternLockView) findViewById(d.sppa_pattern_lock_view);
        this.f25996b = (PatternLockResultView) findViewById(d.sppa_pattern_result_view);
        this.f25997c = (TextView) findViewById(d.tvMsg);
        this.f25998d = (TextView) findViewById(d.sppa_reset_tv);
        this.f26002i = (ConstraintLayout) findViewById(d.sppa_hint_text_container);
        this.f26001g = (TextView) findViewById(d.asppa_use_pattern_tv);
        this.f25999e = (TextView) findViewById(d.textViewLine1);
        this.f26000f = (TextView) findViewById(d.textViewLine2);
        this.f25999e.setText(h.ac_pattern_step1);
        this.f26000f.setText(h.ac_msg_draw_pattern);
        TextView textView = this.f25998d;
        Q q10 = this.f25994C;
        textView.setOnClickListener(q10);
        this.f26001g.setOnClickListener(q10);
        this.f25995a.setUnlockListener(new P(this));
        if (this.f25992A.booleanValue()) {
            if (androidx.core.content.d.a(this, "android.permission.USE_FINGERPRINT") != 0 ? false : new p131id.a(this).f37572e.c()) {
                this.f26001g.setVisibility(0);
            }
        }
    }
}
