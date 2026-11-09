package Pg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F f7365a;

    public p(F delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7365a = delegate;
    }

    @Override // Pg.F
    public final F clearDeadline() {
        return this.f7365a.clearDeadline();
    }

    @Override // Pg.F
    public final F clearTimeout() {
        return this.f7365a.clearTimeout();
    }

    @Override // Pg.F
    public final long deadlineNanoTime() {
        return this.f7365a.deadlineNanoTime();
    }

    @Override // Pg.F
    public final boolean hasDeadline() {
        return this.f7365a.hasDeadline();
    }

    @Override // Pg.F
    public final void throwIfReached() throws IOException {
        this.f7365a.throwIfReached();
    }

    @Override // Pg.F
    public final F timeout(long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f7365a.timeout(j6, unit);
    }

    @Override // Pg.F
    public final long timeoutNanos() {
        return this.f7365a.timeoutNanos();
    }

    @Override // Pg.F
    public final F deadlineNanoTime(long j6) {
        return this.f7365a.deadlineNanoTime(j6);
    }
}
