package com.transsnet.palmpay.account.ui.activity;

import Bc.C0105b;
import F8.e;
import F8.h;
import Ja.t;
import L6.b;
import M7.s;
import N8.X;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.A;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.camera.video.internal.c;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.content.d;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SetTouchIdV2Activity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetTouchIdV2Activity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26022g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f26025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f26026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f26027e = new s(this, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0105b f26028f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Executor executorD = d.d(this);
        t tVar = new t(this, 1);
        w wVar = new w();
        if (executorD == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        Z supportFragmentManager = getSupportFragmentManager();
        A a3 = (A) new c(this).h(A.class);
        wVar.f13101b = true;
        wVar.f13100a = supportFragmentManager;
        a3.f13044d = executorD;
        a3.f13045e = tVar;
        this.f26026d = wVar;
        v vVar = new v();
        vVar.f13097a = getString(h.ac_verify_fingerprint);
        Intrinsics.checkNotNullExpressionValue(vVar, "setTitle(...)");
        vVar.f13099c = getString(h.ac_cancel);
        this.f26025c = vVar.a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_set_touch_id_v2, (ViewGroup) null, false);
        int i7 = F8.d.barrier1;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = F8.d.btnClose;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = F8.d.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = F8.d.textViewError;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = F8.d.textViewMessage;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = F8.d.tvTitle;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                C0105b c0105b = new C0105b((ViewGroup) viewInflate, (View) ppButton, (View) iconicsImageView, textView, textView2, textView3, 7);
                                this.f26028f = c0105b;
                                return c0105b;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        C0105b c0105b = this.f26028f;
        if (c0105b != null) {
            p220oa.h.s((TextView) c0105b.f663c, false);
        }
        C0105b c0105b2 = this.f26028f;
        if (c0105b2 != null) {
            p220oa.h.s((TextView) c0105b2.f664d, true);
        }
        C0105b c0105b3 = this.f26028f;
        if (c0105b3 != null) {
            p220oa.h.s((PpButton) c0105b3.f666f, false);
        }
        p220oa.h.z(this, "Fingerprint Unlock turned on successfully", null, new Dd.b(this, 7), 29);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        View decorView;
        super.onPause();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.removeCallbacks(this.f26027e);
        }
        try {
            w wVar = this.f26026d;
            if (wVar != null) {
                wVar.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        Window window;
        View decorView;
        super.onResume();
        if (!ActivityUtils.isValidActivityContext(this) || (window = getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        s sVar = this.f26027e;
        decorView.removeCallbacks(sVar);
        decorView.post(sVar);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_data");
            this.f26024b = stringExtra;
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f26023a = true;
            }
        }
        X x3 = new X(this, 0);
        C0105b c0105b = this.f26028f;
        p220oa.h.q(x3, c0105b != null ? (IconicsImageView) c0105b.f667g : null, c0105b != null ? (PpButton) c0105b.f666f : null);
    }
}
