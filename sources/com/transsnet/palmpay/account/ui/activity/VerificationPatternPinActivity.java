package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import L6.b;
import N8.j0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.PatternLockResultView;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.util.BarUtils;

/* JADX INFO: loaded from: classes3.dex */
public class VerificationPatternPinActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f26054i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PatternLockView f26055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PatternLockResultView f26056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f26057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConstraintLayout f26058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PpTitleBar f26059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f26060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26061g = 0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_vertifcation_partten_pin_activity;
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

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 145 && i10 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f26059e = (PpTitleBar) findViewById(d.mpa_title);
        this.f26055a = (PatternLockView) findViewById(d.sppa_pattern_lock_view);
        this.f26056b = (PatternLockResultView) findViewById(d.sppa_pattern_result_view);
        this.f26057c = (TextView) findViewById(d.tvMsg);
        this.f26058d = (ConstraintLayout) findViewById(d.sppa_hint_text_container);
        this.f26055a.setUnlockListener(new j0(this));
    }
}
