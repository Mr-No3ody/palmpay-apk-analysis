package com.transsnet.palmpay.core.init;

import C0.G;
import N8.q0;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.camera2.internal.F;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.perf.util.Constants;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u0014H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/core/init/LateInitProbe;", "", "<init>", "()V", "TAG", "", ViewProps.ENABLED, "", "getEnabled", "()Z", "lateInitScheduleUptimeMs", "", "sectionStartMs", "Ljava/util/concurrent/ConcurrentHashMap;", "cookieSeq", "Ljava/util/concurrent/atomic/AtomicLong;", "cookies", "", Constants.ENABLE_DISABLE, "markLateInitScheduled", "", "trigger", "markLateInitStarted", "markLateInitGroupEnd", "markIdleGateReleased", "reason", "beginTask", "name", "endTask", "sinceScheduleMs", "beginAsync", "endAsync", "log", "msg", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LateInitProbe {

    @NotNull
    public static final String TAG = "LateInitProbe";
    private static volatile long lateInitScheduleUptimeMs;

    @NotNull
    public static final LateInitProbe INSTANCE = new LateInitProbe();

    @NotNull
    private static final ConcurrentHashMap<String, Long> sectionStartMs = new ConcurrentHashMap<>();

    @NotNull
    private static final AtomicLong cookieSeq = new AtomicLong(1);

    @NotNull
    private static final ConcurrentHashMap<String, Integer> cookies = new ConcurrentHashMap<>();

    private LateInitProbe() {
    }

    private final void beginAsync(String name) {
        int andIncrement = (int) cookieSeq.getAndIncrement();
        cookies.put(name, Integer.valueOf(andIncrement));
        try {
            Trace.beginAsyncSection(name, andIncrement);
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void beginTask(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LateInitProbe lateInitProbe = INSTANCE;
        if (lateInitProbe.getEnabled()) {
            sectionStartMs.put(name, Long.valueOf(SystemClock.uptimeMillis()));
            lateInitProbe.beginAsync("InitTask:" + name);
            Trace.beginSection(name);
            lateInitProbe.log(q0.n(F.f("task.begin name=", name, " thread=", Thread.currentThread().getName(), " sinceSchedule="), "ms", lateInitProbe.sinceScheduleMs()));
        }
    }

    private final void endAsync(String name) {
        Integer numRemove = cookies.remove(name);
        if (numRemove != null) {
            try {
                Trace.endAsyncSection(name, numRemove.intValue());
            } catch (Throwable unused) {
            }
        }
    }

    @JvmStatic
    public static final void endTask(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (INSTANCE.getEnabled()) {
            Long lRemove = sectionStartMs.remove(name);
            long jUptimeMillis = lRemove != null ? SystemClock.uptimeMillis() - lRemove.longValue() : -1L;
            try {
                Trace.endSection();
            } catch (Throwable unused) {
            }
            LateInitProbe lateInitProbe = INSTANCE;
            lateInitProbe.endAsync(G.o("InitTask:", name));
            lateInitProbe.log("task.end name=" + name + " cost=" + jUptimeMillis + "ms sinceSchedule=" + lateInitProbe.sinceScheduleMs() + "ms");
        }
    }

    private final boolean getEnabled() {
        return false;
    }

    @JvmStatic
    public static final boolean isEnabled() {
        return INSTANCE.getEnabled();
    }

    private final void log(String msg) {
        SystemClock.elapsedRealtime();
    }

    @JvmStatic
    public static final void markIdleGateReleased(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        LateInitProbe lateInitProbe = INSTANCE;
        if (lateInitProbe.getEnabled()) {
            lateInitProbe.beginAsync("IdleGate");
            lateInitProbe.endAsync("IdleGate");
            lateInitProbe.log("IdleGate.release reason=" + reason + " sinceSchedule=" + lateInitProbe.sinceScheduleMs() + "ms");
        }
    }

    @JvmStatic
    public static final void markLateInitGroupEnd() {
        LateInitProbe lateInitProbe = INSTANCE;
        if (lateInitProbe.getEnabled()) {
            lateInitProbe.endAsync("lateInit.group");
            lateInitProbe.log("lateInit.group.end sinceSchedule=" + lateInitProbe.sinceScheduleMs() + "ms");
        }
    }

    @JvmStatic
    public static final void markLateInitScheduled(@NotNull String trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        LateInitProbe lateInitProbe = INSTANCE;
        if (lateInitProbe.getEnabled()) {
            lateInitScheduleUptimeMs = SystemClock.uptimeMillis();
            lateInitProbe.log(G.o("lateInit.schedule trigger=", trigger));
            lateInitProbe.beginAsync("lateInit.group");
        }
    }

    @JvmStatic
    public static final void markLateInitStarted() {
        LateInitProbe lateInitProbe = INSTANCE;
        if (lateInitProbe.getEnabled()) {
            lateInitProbe.log("lateInit.start sinceSchedule=" + lateInitProbe.sinceScheduleMs() + "ms");
        }
    }

    private final long sinceScheduleMs() {
        long j6 = lateInitScheduleUptimeMs;
        if (j6 == 0) {
            return -1L;
        }
        return SystemClock.uptimeMillis() - j6;
    }
}
