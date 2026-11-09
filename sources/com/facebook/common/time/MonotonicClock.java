package com.facebook.common.time;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@ThreadSafe
@Nullsafe(a.f41451a)
public interface MonotonicClock {
    static MonotonicClock of(Clock clock) {
        return new R2.a(clock);
    }

    @DoNotStrip
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @DoNotStrip
    long nowNanos();
}
