package com.transsnet.palmpay.ui.activity;

import Ac.i;
import B5.c;
import F6.d;
import Pa.AbstractC0520q;
import Pa.T;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.I;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.inf.IgnoreAppStartTimeTrack;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.custom_view.m;
import com.transsnet.palmpay.util.DeviceUtils;
import io.fastkv.n;
import java.io.File;
import java.lang.ref.WeakReference;
import p102ge.L;
import p102ge.N;
import p102ge.O;
import p115ha.b;
import p189me.jessyan.autosize.internal.CancelAdapt;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/splash")
public class SplashActivity extends AbstractActivityC0837o implements CancelAdapt, IgnoreAppStartTimeTrack, SafeLockCheck {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34568g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f34569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34571c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34572d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f34573e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SplashScreenView f34574f;

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    public final long e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f34570b;
        boolean zIsWarmStart = LibApm.INSTANCE.isWarmStart();
        long j6 = 500;
        if (!AbstractC0520q.f7145k) {
            DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(this);
            if (deviceLevel == DeviceUtils.LEVEL.BEST || DeviceUtils.LEVEL.HIGH == deviceLevel) {
                if (zIsWarmStart) {
                    j6 = 0;
                } else {
                    j6 = 200;
                }
            } else if (zIsWarmStart) {
                j6 = 200;
            }
        } else if (!zIsWarmStart) {
            j6 = 1000;
        }
        long j10 = j6 - jElapsedRealtime;
        if (j10 < 0) {
            return 0L;
        }
        return j10;
    }

    public final Runnable f(int i7) {
        if (i7 != 1) {
            if (i7 == 2) {
                return new N(this, 1);
            }
            if (i7 != 3) {
                d.c("Splash", "Something wrong, go to home directly.");
                return new N(this, 3);
            }
        }
        return new N(this, 2);
    }

    public final synchronized void g(int i7) {
        if (this.f34569a != null && i0.W(this)) {
            int i10 = this.f34571c;
            if (i10 != i7 && i10 != 0) {
                d.c("Splash", "Next page wrong, go to home directly.");
                this.f34569a.removeCallbacksAndMessages(null);
                this.f34569a.postDelayed(f(1), e());
                return;
            }
            this.f34571c = i7;
            if (i7 == 0) {
                return;
            }
            d.h("SplashActivity", 3, "goToNextPage: " + this.f34571c);
            this.f34569a.postDelayed(f(i7), e());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return getApplication().getFilesDir();
    }

    public final void h() {
        boolean zB;
        d.h("SplashActivity", 3, "GO_TO_MAIN launchTime: " + (SystemClock.elapsedRealtime() - this.f34570b));
        Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
        if (getIntent() != null) {
            String action = getIntent().getAction();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if ("com.transsnet.palmpay.intent.action.WIDGET_PAY_BILLS".equalsIgnoreCase(action)) {
                intent2.setClassName(this, "com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity");
                intent = intent2;
            } else {
                if ("com.transsnet.palmpay.intent.action.WIDGET_SEND_MONEY".equalsIgnoreCase(action)) {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/send/money");
                    finish();
                    return;
                }
                if ("com.transsnet.palmpay.intent.action.WIDGET_TOPUP_AIRTIME".equalsIgnoreCase(action)) {
                    try {
                        n0.g().m("SystemNotificationBarPage", "Airtime", "");
                        com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
                        finish();
                        return;
                    } catch (Exception e10) {
                        d.c("SplashActivity", "gotoHome: 3", e10);
                        return;
                    }
                }
                if ("com.transsnet.palmpay.intent.action.WIDGET_BUNDLE".equalsIgnoreCase(action)) {
                    try {
                        n0.g().m("SystemNotificationBarPage", "DataBundle", "");
                        com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/buy_bundle_ng");
                        finish();
                        return;
                    } catch (Exception e11) {
                        d.c("SplashActivity", "gotoHome: 4", e11);
                        return;
                    }
                }
                if ("com.transsnet.palmpay.intent.action.TRANS_TO_BANK_ACCOUNT".equalsIgnoreCase(action)) {
                    n0.g().m("SystemNotificationBarPage", "ToBank", "");
                    com.palmpay.lib.apm.launchcounter.util.d.F("/sm/trans_to_bank");
                    finish();
                    return;
                } else if ("com.transsnet.palmpay.intent.action.TRANS_TO_PALMPAY".equalsIgnoreCase(action)) {
                    n0.g().m("SystemNotificationBarPage", "ToPalmPay", "");
                    com.palmpay.lib.apm.launchcounter.util.d.F("/send/money");
                    finish();
                    return;
                } else if ("com.transsnet.palmpay.action.home.finance".equalsIgnoreCase(action)) {
                    intent = new Intent(this, (Class<?>) HomeActivity.class);
                    intent.putExtra("tab", "finance");
                } else {
                    intent = new Intent(this, (Class<?>) HomeActivity.class);
                }
            }
        }
        intent.putExtra("extra_type", "SplashActivity");
        try {
            int i7 = AbstractC0520q.f7138d;
            if (i7 == 33 || i7 == 34) {
                zB = (intent.getComponent() != null && HomeActivity.class.getName().equals(intent.getComponent().getClassName())) ? b.f37362a.b() : false;
            }
            if (zB) {
                i(intent);
                return;
            }
            intent.addFlags(268468224);
            startActivity(intent);
            overridePendingTransition(0, m.cv_anim_keep_activity_2s);
        } catch (Exception e12) {
            d.c("SplashActivity", "gotoHome1: ", e12);
        }
    }

    public final void i(Intent intent) {
        b.f37362a.f37365c = true;
        Intent intent2 = new Intent();
        intent2.setClassName(this, "com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        intent2.putExtra("extra_after_unlock_launch_home", true);
        startActivity(intent2);
        overridePendingTransition(0, m.cv_anim_keep_activity_2s);
        finish();
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public final boolean ignoreLock() {
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (Build.VERSION.SDK_INT == 29) {
            finishAfterTransition();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ge.M] */
    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i7;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 31) {
            if (r0.T0()) {
                int i11 = ((I) getDelegate()).f12122I0;
                if (r0.V0()) {
                    i7 = -1;
                } else {
                    i7 = r0.Z0() ? 2 : 1;
                }
                if (i11 != i7) {
                    getDelegate().l(i7);
                }
            } else {
                getDelegate().l(1);
            }
        }
        if (i10 >= 33) {
            getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: ge.M
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    this.f37196a.f34574f = splashScreenView;
                }
            });
        }
        super.onCreate(bundle);
        if (i10 >= 33) {
            setTheme(i.MainSplashTheme2);
        }
        setRequestedOrientation(1);
        Window window = getWindow();
        BaseActivity.checkHardwareAccelerated(window);
        if (i10 >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i10 >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
        if (i10 >= 30) {
            n.K(window, false);
        } else {
            window.getDecorView().setSystemUiVisibility(1024);
        }
        this.f34570b = SystemClock.elapsedRealtime();
        Handler handler = new Handler();
        this.f34569a = handler;
        handler.post(new N(this, 0));
        O o10 = new O();
        o10.f37199c = new WeakReference(this);
        this.f34573e = o10;
        T.a(o10, 5);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        SplashScreenView splashScreenView = this.f34574f;
        if (splashScreenView != null) {
            splashScreenView.remove();
            this.f34574f = null;
        }
        super.onDestroy();
        O o10 = this.f34573e;
        if (o10 != null) {
            Handler handler = T.f7044a;
            synchronized (o10.f7035a) {
                try {
                    if (o10.f7035a.get() <= 1) {
                        o10.f7035a.set(4);
                        if (o10.f7036b != null) {
                            o10.f7036b.interrupt();
                        }
                        androidx.camera.core.impl.utils.executor.a aVarB = Pa.N.b();
                        c cVar = new c(o10, 19);
                        aVarB.getClass();
                        T.c(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f34573e = null;
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f34569a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        Looper.myQueue().addIdleHandler(new L());
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }
}
