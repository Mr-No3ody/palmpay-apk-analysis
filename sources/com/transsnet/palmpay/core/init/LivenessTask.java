package com.transsnet.palmpay.core.init;

import Pa.n0;
import android.app.Application;
import android.content.Context;
import android.os.Trace;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.liveness.LiveID$IDeviceFingerprintHandler;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p232p6.p;
import p324va.d;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.TASK_LIVE_NESS_INIT)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/init/LivenessTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getTaskName", "", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LivenessTask extends BaseInitTask {

    @NotNull
    public static final String SDK_VERSION = "liveness_sdk_version";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean hasInitialized = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/init/LivenessTask$Companion;", "", "<init>", "()V", "SDK_VERSION", "", "hasInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "useVideo", "", "initLiveness", "", "application", "Landroid/app/Application;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLivenessTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivenessTask.kt\ncom/transsnet/palmpay/core/init/LivenessTask$Companion\n+ 2 Trace.kt\nandroidx/core/os/TraceKt\n*L\n1#1,93:1\n31#2,5:94\n*S KotlinDebug\n*F\n+ 1 LivenessTask.kt\ncom/transsnet/palmpay/core/init/LivenessTask$Companion\n*L\n62#1:94,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int useVideo() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$2] */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$1] */
        public final void initLiveness(@Nullable Application application) {
            if (application == null || LivenessTask.hasInitialized.get()) {
                return;
            }
            synchronized (LivenessTask.hasInitialized) {
                if (LivenessTask.hasInitialized.compareAndSet(false, true)) {
                    Trace.beginSection(BaseInitTaskKt.TASK_LIVE_NESS_INIT);
                    try {
                        Intrinsics.checkNotNullExpressionValue("https://ng-m.palmpay.app", "getBaseUrl(...)");
                        boolean zC = p059e1.a.C("key_http_dns", false);
                        r6.a aVar = new r6.a((U) d.f43142a.f18580b, zC, new LiveID$ILiveIDMonitor() { // from class: com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$2
                            @Override // com.palmpay.lib.liveness.LiveID$ILiveIDMonitor
                            public void report(String eventId, Map<String, Object> attribute) {
                                Intrinsics.checkNotNullParameter(eventId, "eventId");
                                n0.g().r(eventId, attribute);
                            }
                        }, new LiveID$IDeviceFingerprintHandler() { // from class: com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$1
                            @Override // com.palmpay.lib.liveness.LiveID$IDeviceFingerprintHandler
                            public String collect() {
                                return p059e1.a.H("face_guard_device_token");
                            }
                        }, Integer.valueOf(LivenessTask.INSTANCE.useVideo()));
                        Context applicationContext = application.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        p.i(applicationContext, aVar);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
        }

        private Companion() {
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.LivenessTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(LivenessTask.this, null, 1, null);
                if (!BaseApplication.hasLogin() || !BaseApplication.get().getUser().isAuthen()) {
                    LivenessTask.INSTANCE.initLiveness(application);
                }
                BaseInitTask.endSection$default(LivenessTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_LIVE_NESS_INIT;
    }
}
