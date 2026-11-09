package p355xf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C f43948b = new C(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43949a;

    public /* synthetic */ D(long j6) {
        this.f43949a = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = ((D) obj).f43949a;
        long j10 = this.f43949a ^ Long.MIN_VALUE;
        long j11 = j6 ^ Long.MIN_VALUE;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return this.f43949a == ((D) obj).f43949a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43949a);
    }

    public final String toString() {
        long j6 = this.f43949a;
        if (j6 >= 0) {
            String string = Long.toString(j6, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j10 = 10;
        long j11 = ((j6 >>> 1) / j10) << 1;
        long j12 = j6 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j11, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j12, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
