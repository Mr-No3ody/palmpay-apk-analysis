package com.palmpay.lib.apm;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.FirebaseApp;
import com.palmpay.lib.apm.launchcounter.instrumentation.HandlerHooker;
import com.palmpay.lib.apm.startup.AppStartupPerfTracker;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p079f6.a;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010&\u001a\u00020\u0004J0\u0010'\u001a\u00020(2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u001cJ\u0006\u0010+\u001a\u00020\u0004J\u0006\u0010,\u001a\u00020\u0016J\u0006\u0010-\u001a\u00020\u0016J\u0010\u0010.\u001a\u00020(2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010\u0004J\u0006\u00101\u001a\u00020(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a¨\u00062"}, d2 = {"Lcom/palmpay/lib/apm/LibApm;", "", "()V", "KEY_LAST_VERSION_CODE", "", "SP_NAME", "activityTraceName", "getActivityTraceName", "()Ljava/lang/String;", "setActivityTraceName", "(Ljava/lang/String;)V", "appCreateTime", "", "application", "Landroid/app/Application;", "callback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getCallback", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "callback$delegate", "Lkotlin/Lazy;", "debug", "", "getDebug", "()Z", "setDebug", "(Z)V", "heavyMessageThresholdMs", "", "getHeavyMessageThresholdMs", "()I", "setHeavyMessageThresholdMs", "(I)V", "lifecycleCallbackRegistered", "nqeTraceName", "printHeavyMessage", "getPrintHeavyMessage", "setPrintHeavyMessage", "checkAndMarkLaunchType", "enableActivityTrace", "", "printHeavyMsg", "heavyMsgThresholdMs", "getNqeTraceName", "isFirebaseInitialized", "isWarmStart", "onApplicationOnCreate", "setNqeTraceName", "traceName", "unregisterLifecycleCallback", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LibApm {

    @NotNull
    private static final String KEY_LAST_VERSION_CODE = "last_version_code";

    @NotNull
    private static final String SP_NAME = "apm_startup_prefs";

    @Nullable
    private static String activityTraceName;
    private static long appCreateTime;

    @Nullable
    private static Application application;
    private static boolean debug;
    private static boolean lifecycleCallbackRegistered;
    private static boolean printHeavyMessage;

    @NotNull
    public static final LibApm INSTANCE = new LibApm();

    @NotNull
    private static String nqeTraceName = "NQETraceV2";
    private static int heavyMessageThresholdMs = 500;

    /* JADX INFO: renamed from: callback$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy callback = C2131j.b(a.f36409a);

    private LibApm() {
    }

    public static /* synthetic */ void enableActivityTrace$default(LibApm libApm, Application application2, String str, boolean z3, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "ActivityTrace";
        }
        if ((i10 & 4) != 0) {
            z3 = false;
        }
        if ((i10 & 8) != 0) {
            i7 = 500;
        }
        libApm.enableActivityTrace(application2, str, z3, i7);
    }

    private final Application.ActivityLifecycleCallbacks getCallback() {
        return (Application.ActivityLifecycleCallbacks) callback.getValue();
    }

    @NotNull
    public final String checkAndMarkLaunchType() {
        String str;
        Application application2 = application;
        if (application2 == null) {
            return "normal";
        }
        try {
            PackageInfo packageInfo = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 0);
            int longVersionCode = Build.VERSION.SDK_INT >= 28 ? (int) packageInfo.getLongVersionCode() : packageInfo.versionCode;
            SharedPreferences sharedPreferences = application2.getSharedPreferences(SP_NAME, 0);
            int i7 = sharedPreferences.getInt(KEY_LAST_VERSION_CODE, -1);
            if (i7 == -1) {
                str = "fresh";
            } else {
                str = i7 != longVersionCode ? "upgrade" : "normal";
            }
            if (!str.equals("normal")) {
                sharedPreferences.edit().putInt(KEY_LAST_VERSION_CODE, longVersionCode).apply();
            }
            return str;
        } catch (Exception e10) {
            Log.e("LibApm", "checkAndMarkLaunchType: ", e10);
            return "unknown";
        }
    }

    public final void enableActivityTrace(@Nullable Application application2, @Nullable String activityTraceName2, boolean printHeavyMsg, int heavyMsgThresholdMs) {
        application = application2;
        printHeavyMessage = printHeavyMsg;
        heavyMessageThresholdMs = heavyMsgThresholdMs;
        activityTraceName = activityTraceName2;
        if (TextUtils.isEmpty(activityTraceName2)) {
            return;
        }
        HandlerHooker.doHook(application2);
    }

    @Nullable
    public final String getActivityTraceName() {
        return activityTraceName;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final int getHeavyMessageThresholdMs() {
        return heavyMessageThresholdMs;
    }

    @NotNull
    public final String getNqeTraceName() {
        return nqeTraceName;
    }

    public final boolean getPrintHeavyMessage() {
        return printHeavyMessage;
    }

    public final boolean isFirebaseInitialized() {
        Application application2 = application;
        if (application2 == null) {
            return false;
        }
        List<FirebaseApp> apps = FirebaseApp.getApps(application2);
        Intrinsics.checkNotNullExpressionValue(apps, "getApps(...)");
        return !apps.isEmpty();
    }

    public final boolean isWarmStart() {
        return SystemClock.elapsedRealtime() - appCreateTime > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    }

    public final void onApplicationOnCreate(@Nullable Application application2) {
        application = application2;
        AppStartupPerfTracker.markApplicationStart();
        appCreateTime = SystemClock.elapsedRealtime();
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(INSTANCE.getCallback());
            lifecycleCallbackRegistered = true;
        }
    }

    public final void setActivityTraceName(@Nullable String str) {
        activityTraceName = str;
    }

    public final void setDebug(boolean z3) {
        debug = z3;
    }

    public final void setHeavyMessageThresholdMs(int i7) {
        heavyMessageThresholdMs = i7;
    }

    public final void setNqeTraceName(@Nullable String traceName) {
        if (traceName == null) {
            traceName = "NQETrace";
        }
        nqeTraceName = traceName;
    }

    public final void setPrintHeavyMessage(boolean z3) {
        printHeavyMessage = z3;
    }

    public final void unregisterLifecycleCallback() {
        if (lifecycleCallbackRegistered) {
            Application application2 = application;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(getCallback());
            }
            lifecycleCallbackRegistered = false;
        }
    }
}
