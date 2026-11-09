package Rf;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class d implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f8615d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8618c;

    public d(long j6, long j10, long j11) {
        if (j11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j11 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8616a = j6;
        if (j11 > 0) {
            if (j6 < j10) {
                long j12 = j10 % j11;
                long j13 = j6 % j11;
                long j14 = ((j12 < 0 ? j12 + j11 : j12) - (j13 < 0 ? j13 + j11 : j13)) % j11;
                j10 -= j14 < 0 ? j14 + j11 : j14;
            }
        } else {
            if (j11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j6 > j10) {
                long j15 = -j11;
                long j16 = j6 % j15;
                long j17 = j10 % j15;
                long j18 = ((j16 < 0 ? j16 + j15 : j16) - (j17 < 0 ? j17 + j15 : j17)) % j15;
                j10 += j18 < 0 ? j18 + j15 : j18;
            }
        }
        this.f8617b = j10;
        this.f8618c = j11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f8616a == dVar.f8616a && this.f8617b == dVar.f8617b && this.f8618c == dVar.f8618c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j6 = 31;
        long j10 = this.f8616a;
        long j11 = this.f8617b;
        long j12 = (((j10 ^ (j10 >>> 32)) * j6) + (j11 ^ (j11 >>> 32))) * j6;
        long j13 = this.f8618c;
        return (int) (j12 + (j13 ^ (j13 >>> 32)));
    }

    public boolean isEmpty() {
        long j6 = this.f8618c;
        long j10 = this.f8617b;
        long j11 = this.f8616a;
        if (j6 > 0) {
            return j11 > j10;
        }
        return j11 < j10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f8616a, this.f8617b, this.f8618c);
    }

    public String toString() {
        StringBuilder sb2;
        long j6 = this.f8618c;
        long j10 = this.f8617b;
        long j11 = this.f8616a;
        if (j6 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j11);
            sb2.append("..");
            sb2.append(j10);
            sb2.append(" step ");
            sb2.append(j6);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j11);
            sb2.append(" downTo ");
            sb2.append(j10);
            sb2.append(" step ");
            sb2.append(-j6);
        }
        return sb2.toString();
    }
}
