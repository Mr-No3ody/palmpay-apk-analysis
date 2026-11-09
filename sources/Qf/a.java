package Qf;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Pf.a {
    @Override // Pf.d
    public final int d(int i7, int i10) {
        return ThreadLocalRandom.current().nextInt(i7, i10);
    }

    @Override // Pf.a
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
