package p015ag;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int addFailReason(long j6) {
        return (j6 & 2305843009213693952L) != 0 ? 2 : 1;
    }

    public final long updateHead(long j6, int i7) {
        return wo(j6, 1073741823L) | ((long) i7);
    }

    public final long updateTail(long j6, int i7) {
        return wo(j6, 1152921503533105152L) | (((long) i7) << 30);
    }

    public final <T> T withState(long j6, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
        return function2.invoke(Integer.valueOf((int) (1073741823 & j6)), Integer.valueOf((int) ((j6 & 1152921503533105152L) >> 30)));
    }

    public final long wo(long j6, long j10) {
        return j6 & (~j10);
    }

    private l() {
    }
}
