package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import L6.b;
import La.i;
import N8.D;
import Pa.C0504a;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.fragment.app.Z;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyPatternFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p042cg.f;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/pin_safe_verification")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PinSafeWithPatternActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPinSafeWithPatternActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinSafeWithPatternActivity.kt\ncom/transsnet/palmpay/account/ui/activity/PinSafeWithPatternActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n562#2,10:405\n1#3:415\n*S KotlinDebug\n*F\n+ 1 PinSafeWithPatternActivity.kt\ncom/transsnet/palmpay/account/ui/activity/PinSafeWithPatternActivity\n*L\n122#1:405,10\n*E\n"})
public final class PinSafeWithPatternActivity extends BaseActivity implements CancelAdapt {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f25946g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f25947a = C2131j.b(new i(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f25948b = C2131j.b(new i(13));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f25949c = C2131j.b(new i(14));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25950d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25951e = SPUtils.getInstance().getInt("SAFE_PIN_LOCK_ERROR_COUNT", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f25952f = C2131j.b(new i(15));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_vertifcation_pin_safe_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return 3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
        setNavigationBarColor(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        Z supportFragmentManager = getSupportFragmentManager();
        if ((supportFragmentManager != null ? supportFragmentManager.D(d.fragmentContainer) : null) instanceof VerifyFingerPrintFragment) {
            return;
        }
        F6.d.h(this.TAG, 3, "loadFingerPrintFragment: ");
        int i7 = d.fragmentContainer;
        t tVar = this.f25949c;
        h.i(this, i7, (VerifyFingerPrintFragment) tVar.getValue());
        C0504a.a().c(this, (VerifyFingerPrintFragment) tVar.getValue());
    }

    public final void m() {
        Z supportFragmentManager = getSupportFragmentManager();
        if ((supportFragmentManager != null ? supportFragmentManager.D(d.fragmentContainer) : null) instanceof VerifyPatternFragment) {
            return;
        }
        int i7 = d.fragmentContainer;
        t tVar = this.f25948b;
        h.i(this, i7, (VerifyPatternFragment) tVar.getValue());
        C0504a.a().c(this, (VerifyPatternFragment) tVar.getValue());
    }

    public final void n(boolean z3) {
        t tVar = this.f25947a;
        ((VerifySafePinFragment) tVar.getValue()).f26123p = z3;
        Z supportFragmentManager = getSupportFragmentManager();
        if ((supportFragmentManager != null ? supportFragmentManager.D(d.fragmentContainer) : null) instanceof VerifySafePinFragment) {
            return;
        }
        h.i(this, d.fragmentContainer, (VerifySafePinFragment) tVar.getValue());
        C0504a.a().c(this, (VerifySafePinFragment) tVar.getValue());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 26 || i7 == 27 || i7 == 28) {
            String str = Build.BRAND;
            if ("Huawei".equalsIgnoreCase(str) || "Samsung".equalsIgnoreCase(str)) {
                getSupportFragmentManager().f17091z = new L8.e();
                if (bundle != null) {
                    bundle.remove("android:support:fragments");
                }
                if (bundle != null) {
                    bundle.remove("android:fragments");
                }
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        p115ha.b.f37362a.f37366d = false;
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i7 != 4 || event.getRepeatCount() != 0) {
            return super.onKeyDown(i7, event);
        }
        VerifySafePinFragment verifySafePinFragment = (VerifySafePinFragment) this.f25947a.getValue();
        if (verifySafePinFragment != null) {
            verifySafePinFragment.C();
        }
        if (this.f25951e >= this.f25950d) {
            showLoadingDialog(true);
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new D(this, null), 2);
        } else {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setFlags(67108864);
                intent.addCategory("android.intent.category.HOME");
                startActivity(intent);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().getDecorView().post(new androidx.camera.core.impl.utils.futures.i(9, (Handler) this.f25952f.getValue(), this));
    }
}
