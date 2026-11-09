package com.transsnet.palmpay.core.init;

import C0.G;
import F6.d;
import Pa.n0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import com.alibaba.android.alpha.Task;
import com.google.android.gms.net.CronetProviderInstaller;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.DnsOptions;
import org.chromium.net.QuicOptions;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;
import p350xa.g;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_IDLE_GATE}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.TASK_CRONET)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0003J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/core/init/CronetInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "setupCronetEngine", "", "createBuilder", "Lorg/chromium/net/CronetEngine$Builder;", "formatUrl", "url", "configNetworkPolicy", "context", "Landroid/content/Context;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCronetInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CronetInitTask.kt\ncom/transsnet/palmpay/core/init/CronetInitTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class CronetInitTask extends BaseInitTask {

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.init.CronetInitTask$getTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/transsnet/palmpay/core/init/CronetInitTask$getTask$1", "Lcom/alibaba/android/alpha/Task;", "run", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends Task {
        final /* synthetic */ Application $application;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Application application, String str) {
            super(str);
            this.$application = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void run$lambda$0(Application application, CronetInitTask cronetInitTask, com.google.android.gms.tasks.Task it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.isSuccessful()) {
                n0 n0VarG = n0.g();
                Exception exception = it.getException();
                n0VarG.o("FB_install_cronet_fail", "message", exception != null ? exception.getMessage() : null);
                return;
            }
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(application)) {
                if (!cronetProvider.isEnabled()) {
                    n0.g().o("FB_cronet_provider_not_enabled", "name", cronetProvider.getName());
                } else {
                    if (!Intrinsics.c(cronetProvider.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
                        d.h(BaseInitTask.TAG, 3, G.o("installProvider ", cronetProvider.getName()));
                        V v3 = V.f10828a;
                        f fVar = I.f10809a;
                        AbstractC0780y.m(v3, e.f19009c, null, new CronetInitTask$getTask$1$run$1$1(cronetInitTask, application, cronetProvider, null), 2);
                        return;
                    }
                    n0.g().o("FB_cronet_provider_fallback", "name", cronetProvider.getName());
                }
            }
        }

        @Override // com.alibaba.android.alpha.Task
        public void run() {
            BaseInitTask.beginSection$default(CronetInitTask.this, null, 1, null);
            if (p059e1.a.C("key_enable_cronet", true) && BaseApplication.isFirebaseInitialized()) {
                try {
                    Intrinsics.e(CronetProviderInstaller.installProvider(this.$application).addOnCompleteListener(new com.transsnet.adsdk.b(1, this.$application, CronetInitTask.this)));
                } catch (Exception e10) {
                    d.c(BaseInitTask.TAG, "setupCronetEngine", e10);
                }
            }
            BaseInitTask.endSection$default(CronetInitTask.this, null, 1, null);
        }
    }

    @RequiresApi(23)
    private final void configNetworkPolicy(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        Intrinsics.checkNotNullExpressionValue(allNetworks, "getAllNetworks(...)");
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    connectivityManager.bindProcessToNetwork(network);
                }
                if (networkCapabilities.hasTransport(0)) {
                    connectivityManager.bindProcessToNetwork(network);
                }
            }
        }
    }

    private final String formatUrl(String url) {
        if (url != null) {
            String strConcat = null;
            String str = !TextUtils.isEmpty(url) ? url : null;
            if (str != null) {
                if (y.m(str, "https://", false)) {
                    strConcat = url.substring(8);
                    Intrinsics.checkNotNullExpressionValue(strConcat, "substring(...)");
                }
                if (strConcat != null && !y.m(strConcat, "ng-", false)) {
                    strConcat = "ng-".concat(strConcat);
                }
                d.h(BaseInitTask.TAG, 3, G.o("formatUrl: ", strConcat));
                return strConcat;
            }
        }
        return url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @OptIn(markerClass = {DnsOptions.Experimental.class, QuicOptions.Experimental.class})
    public final void setupCronetEngine(Application application, CronetEngine.Builder createBuilder) {
        if (createBuilder != null) {
            try {
                createBuilder.enableBrotli(!BaseApplication.get().isOldAndroidDevice());
                createBuilder.enableQuic(true);
                createBuilder.enablePublicKeyPinningBypassForLocalTrustAnchors(false);
                try {
                    String strE = g.e();
                    if (TextUtils.isEmpty(strE)) {
                        strE = p059e1.a.H("key_dynamic_base_url_v3");
                    }
                    String url = formatUrl(strE);
                    if (!TextUtils.isEmpty(url)) {
                        createBuilder.addQuicHint(url, 443, 443);
                    }
                    String url2 = formatUrl("https://ng-m.palmpay.app");
                    if (!TextUtils.isEmpty(url2)) {
                        createBuilder.addQuicHint(url2, 443, 443);
                    }
                } catch (Exception unused) {
                }
                createBuilder.setQuicOptions(QuicOptions.builder().enableTlsZeroRtt(true).build());
                createBuilder.setDnsOptions(DnsOptions.builder().persistHostCache(true).setPersistHostCachePeriodMillis(30000L).enableStaleDns(true).setStaleDnsOptions(DnsOptions.StaleDnsOptions.builder().allowCrossNetworkUsage(true).setFreshLookupTimeoutMillis(0L).build()).build());
                File file = new File(application.getCacheDir(), "cronetCache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                createBuilder.setStoragePath(file.getAbsolutePath());
                createBuilder.enableHttpCache(3, 104857600L);
                p350xa.f.f43721i.getInstance().a(createBuilder.build());
            } catch (Throwable th) {
                d.c(BaseInitTask.TAG, "setupCronetEngine: ", th);
            }
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new AnonymousClass1(application, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_CRONET;
    }
}
