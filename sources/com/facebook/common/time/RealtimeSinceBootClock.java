package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(a.f41451a)
public class RealtimeSinceBootClock implements MonotonicClock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RealtimeSinceBootClock f21222a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @DoNotStrip
    public static RealtimeSinceBootClock get() {
        return f21222a;
    }

    @Override // com.facebook.common.time.MonotonicClock
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.common.time.MonotonicClock
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
