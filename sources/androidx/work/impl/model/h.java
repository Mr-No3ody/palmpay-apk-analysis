package androidx.work.impl.model;

import V0.EnumC0682a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final long calculateNextRunTime(boolean z3, int i7, @NotNull EnumC0682a backoffPolicy, long j6, long j10, int i10, boolean z8, long j11, long j12, long j13, long j14) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        if (j14 != Long.MAX_VALUE && z8) {
            if (i10 != 0) {
                long j15 = j10 + 900000;
                if (j14 < j15) {
                    return j15;
                }
            }
            return j14;
        }
        if (z3) {
            long jScalb = backoffPolicy == EnumC0682a.f9916b ? j6 * ((long) i7) : (long) Math.scalb(j6, i7 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        if (z8) {
            long j16 = i10 == 0 ? j10 + j11 : j10 + j13;
            return (j12 == j13 || i10 != 0) ? j16 : (j13 - j12) + j16;
        }
        if (j10 == -1) {
            return Long.MAX_VALUE;
        }
        return j10 + j11;
    }

    private h() {
    }
}
