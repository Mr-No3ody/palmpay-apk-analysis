package com.transsnet.palmpay.base;

import C0.G;
import Ca.f;
import Hb.L;
import Kf.o;
import Pa.AbstractC0520q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bumptech.glide.b;
import com.didiglobal.booster.instrument.ActivityThreadHooker;
import com.didiglobal.booster.instrument.FinalizerWatchdogDaemonKiller;
import com.didiglobal.booster.instrument.ResChecker;
import com.didiglobal.booster.instrument.ShadowAsyncTask;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushUpdateManager;
import com.palmpay.init.InitTaskList;
import com.palmpay.init.annotation.TaskInfo;
import com.palmpay.init.api.AlphaTaskManager;
import com.palmpay.lib.apm.LibApm;
import com.transsnet.palmpay.core.base.BaseApplication;
import io.fastkv.m;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import p141j9.C1807o;
import p267r9.c;
import p267r9.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/base/ShellApplication;", "Lcom/transsnet/palmpay/core/base/BaseApplication;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShellApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellApplication.kt\ncom/transsnet/palmpay/base/ShellApplication\n+ 2 ApplicationExtensions.kt\ncom/transsnet/palmpay/core/primaree/ApplicationExtensions\n*L\n1#1,224:1\n20#2:225\n*S KotlinDebug\n*F\n+ 1 ShellApplication.kt\ncom/transsnet/palmpay/base/ShellApplication\n*L\n160#1:225\n*E\n"})
public final class ShellApplication extends BaseApplication implements ReactApplication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f26653b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        ShadowAsyncTask.optimizeAsyncTaskExecutor();
    }

    public static SharedPreferences e(ShellApplication shellApplication, String name, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        SharedPreferences sharedPreferences = super.getSharedPreferences(name, i7);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static boolean f(ShellApplication shellApplication, String str) {
        return super.deleteSharedPreferences(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseApplication, androidx.multidex.b, android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        boolean z3;
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        ResChecker.checkRes(this);
        if (Intrinsics.c(p264r5.a.o(), getPackageName())) {
            boolean z8 = AbstractC0520q.f7140f;
            if ((z8 && "Infinix X6525D".equalsIgnoreCase(AbstractC0520q.f7136b)) || (((z3 = AbstractC0520q.f7139e) && "TECNO BG6m".equalsIgnoreCase(AbstractC0520q.f7136b)) || ((AbstractC0520q.f7141g && "23106RN0DA".equalsIgnoreCase(AbstractC0520q.f7136b)) || ((z3 && "TECNO BF6".equalsIgnoreCase(AbstractC0520q.f7136b)) || "raphael".equalsIgnoreCase(AbstractC0520q.f7137c) || ((z8 && "Infinix X6531B".equalsIgnoreCase(AbstractC0520q.f7136b)) || (z3 && "TECNO KL5".equalsIgnoreCase(AbstractC0520q.f7136b))))))) {
                this.f26653b = c.f41646e.install(this, new C1807o(this, 2));
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        c cVar = this.f26653b;
        if (cVar == null) {
            return super.deleteSharedPreferences(name);
        }
        L systemDelete = new L(24, this, name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(systemDelete, "systemDelete");
        if (Intrinsics.c(name, "key_app_env")) {
            return ((Boolean) systemDelete.invoke()).booleanValue();
        }
        synchronized (cVar.f41649c) {
            SharedPreferences sharedPreferences = (SharedPreferences) cVar.f41649c.remove(name);
            if (sharedPreferences != null && (sharedPreferences instanceof m)) {
                try {
                    ((m) sharedPreferences).clear();
                    ((m) sharedPreferences).d();
                } catch (Throwable th) {
                    F6.d.c("FastKvWrap", G.o("Failed to close FastKV: ", name), th);
                }
            }
            Unit unit = Unit.f38893a;
        }
        try {
            File file = new File(cVar.f41647a.getFilesDir(), "fastkv");
            Iterator it = C1850q.h(".kva", ".kvb", ".kvc", ".tmp").iterator();
            while (it.hasNext()) {
                new File(file, name + ((String) it.next())).delete();
            }
            o.e(new File(file, name));
        } catch (Throwable th2) {
            F6.d.c("FastKvWrap", G.o("Failed to delete FastKV files: ", name), th2);
        }
        try {
            return ((Boolean) systemDelete.invoke()).booleanValue();
        } catch (Exception e10) {
            F6.d.c("FastKvWrap", G.o("Failed to delete SharedPreferences: ", name), e10);
            return false;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseApplication
    public final String getCodePushData() {
        try {
            JSONObject currentPackage = new CodePushUpdateManager(BaseApplication.get().getFilesDir().getAbsolutePath()).getCurrentPackage();
            return (currentPackage == null || currentPackage.get(Constants.ScionAnalytics.PARAM_LABEL) == null) ? "" : currentPackage.get(Constants.ScionAnalytics.PARAM_LABEL).toString();
        } catch (Exception e10) {
            F6.d.c("CodePushLabel", "Unable to retrieve CodePush Label", e10);
            return "";
        }
    }

    @Override // com.facebook.react.ReactApplication
    public final ReactNativeHost getReactNativeHost() {
        if (this.f26652a == null) {
            this.f26652a = new d(this);
        }
        d dVar = this.f26652a;
        Intrinsics.e(dVar);
        return dVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String name, int i7) {
        SharedPreferences sharedPreferences;
        Intrinsics.checkNotNullParameter(name, "name");
        c cVar = this.f26653b;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            Object obj = cVar.f41650d.get();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.c(obj, bool) || Intrinsics.c(name, "key_app_env")) {
                sharedPreferences = (SharedPreferences) cVar.f41648b.invoke(name, Integer.valueOf(i7));
            } else if (i7 != 0) {
                F6.d.h("FastKvWrap", 3, com.airbnb.lottie.model.layer.d.j("fallback system SP (mode=", i7, "): ", name));
                sharedPreferences = (SharedPreferences) cVar.f41648b.invoke(name, Integer.valueOf(i7));
            } else {
                synchronized (cVar.f41649c) {
                    SharedPreferences sharedPreferences2 = (SharedPreferences) cVar.f41649c.get(name);
                    if (sharedPreferences2 != null) {
                        sharedPreferences = sharedPreferences2;
                    } else {
                        cVar.f41650d.set(bool);
                        try {
                            m mVarA = m.a(cVar.f41647a, name);
                            cVar.f41649c.put(name, mVarA);
                            cVar.f41650d.remove();
                            sharedPreferences = mVarA;
                        } catch (Throwable th) {
                            try {
                                F6.d.c("FastKvWrap", "FastKV.adapt failed, fallback system SP: " + name, th);
                                Object objInvoke = cVar.f41648b.invoke(name, Integer.valueOf(i7));
                                cVar.f41649c.put(name, (SharedPreferences) objInvoke);
                                SharedPreferences sharedPreferences3 = (SharedPreferences) objInvoke;
                                cVar.f41650d.remove();
                                sharedPreferences = sharedPreferences3;
                            } catch (Throwable th2) {
                                cVar.f41650d.remove();
                                throw th2;
                            }
                        }
                    }
                }
            }
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
        }
        SharedPreferences sharedPreferences4 = super.getSharedPreferences(name, i7);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences4, "getSharedPreferences(...)");
        return sharedPreferences4;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        Intrinsics.checkNotNullParameter(sourceContext, "sourceContext");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f26653b != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.c(name, "key_app_env")) {
                return false;
            }
        }
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override // p381za.c, android.app.Application
    public final void onCreate() {
        this.versionCode = 1261030162;
        this.versionName = "7.19.0";
        super.onCreate();
        ResChecker.checkRes(this);
        int i7 = AbstractC0520q.f7138d;
        if (i7 < 31 || i7 > 33) {
            F6.d.h("ShellApplication", 3, "onCreate: initRnSoLoaderInApplication");
            f.a(this);
        }
        FinalizerWatchdogDaemonKiller.kill();
        ActivityThreadHooker.hook("");
    }

    @Override // com.transsnet.palmpay.core.base.BaseApplication, p381za.c
    public final void onPrimaryCreate() {
        LibApm.INSTANCE.onApplicationOnCreate(this);
        super.onPrimaryCreate();
        setInstance(this);
    }

    @Override // p381za.c
    public final void onPrimaryLowMemory() {
        super.onPrimaryLowMemory();
        b.b(this).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return (Build.VERSION.SDK_INT < 34 || getApplicationInfo().targetSdkVersion < 34) ? super.registerReceiver(broadcastReceiver, filter) : registerReceiver(broadcastReceiver, filter, 2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseApplication
    public final void startAlphaTaskManager(String str) {
        if (TextUtils.isEmpty(str)) {
            AlphaTaskManager.Companion.start$default(AlphaTaskManager.INSTANCE, this, InitTaskList.INSTANCE.getTaskList(), null, null, null, 28, null);
            return;
        }
        AlphaTaskManager.Companion companion = AlphaTaskManager.INSTANCE;
        List<TaskInfo> taskList = InitTaskList.INSTANCE.getTaskList();
        Intrinsics.e(str);
        AlphaTaskManager.Companion.start$default(companion, this, taskList, null, str, null, 16, null);
    }
}
