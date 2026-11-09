package V0;

import N8.q0;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f9892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f9893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f9894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0695n f9895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0695n f9896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0689h f9899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f9901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9903l;

    static {
        new O(null);
    }

    public S(UUID id2, Q state, HashSet tags, C0695n outputData, C0695n progress, int i7, int i10, C0689h constraints, long j6, P p3, long j10, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f9892a = id2;
        this.f9893b = state;
        this.f9894c = tags;
        this.f9895d = outputData;
        this.f9896e = progress;
        this.f9897f = i7;
        this.f9898g = i10;
        this.f9899h = constraints;
        this.f9900i = j6;
        this.f9901j = p3;
        this.f9902k = j10;
        this.f9903l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !S.class.equals(obj.getClass())) {
            return false;
        }
        S s3 = (S) obj;
        if (this.f9897f == s3.f9897f && this.f9898g == s3.f9898g && Intrinsics.c(this.f9892a, s3.f9892a) && this.f9893b == s3.f9893b && Intrinsics.c(this.f9895d, s3.f9895d) && this.f9899h.equals(s3.f9899h) && this.f9900i == s3.f9900i && Intrinsics.c(this.f9901j, s3.f9901j) && this.f9902k == s3.f9902k && this.f9903l == s3.f9903l && this.f9894c.equals(s3.f9894c)) {
            return Intrinsics.c(this.f9896e, s3.f9896e);
        }
        return false;
    }

    public final int hashCode() {
        int iB = q0.b((this.f9899h.hashCode() + ((((((this.f9896e.hashCode() + ((this.f9894c.hashCode() + ((this.f9895d.hashCode() + ((this.f9893b.hashCode() + (this.f9892a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f9897f) * 31) + this.f9898g) * 31)) * 31, 31, this.f9900i);
        P p3 = this.f9901j;
        return Integer.hashCode(this.f9903l) + q0.b((iB + (p3 != null ? p3.hashCode() : 0)) * 31, 31, this.f9902k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f9892a + "', state=" + this.f9893b + ", outputData=" + this.f9895d + ", tags=" + this.f9894c + ", progress=" + this.f9896e + ", runAttemptCount=" + this.f9897f + ", generation=" + this.f9898g + ", constraints=" + this.f9899h + ", initialDelayMillis=" + this.f9900i + ", periodicityInfo=" + this.f9901j + ", nextScheduleTimeMillis=" + this.f9902k + "}, stopReason=" + this.f9903l;
    }
}
