package Pg;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends F {
    @Override // Pg.F
    public final F timeout(long j6, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this;
    }

    @Override // Pg.F
    public final void throwIfReached() {
    }

    @Override // Pg.F
    public final F deadlineNanoTime(long j6) {
        return this;
    }
}
