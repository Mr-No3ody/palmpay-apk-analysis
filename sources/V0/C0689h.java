package V0;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0689h f9939j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f9940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.g f9941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f9948i;

    static {
        new C0687f(null);
        f9939j = new C0689h();
    }

    public C0689h() {
        D requiredNetworkType = D.f9863a;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        kotlin.collections.B contentUriTriggers = kotlin.collections.B.f38895a;
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f9941b = new androidx.work.impl.utils.g(null);
        this.f9940a = requiredNetworkType;
        this.f9942c = false;
        this.f9943d = false;
        this.f9944e = false;
        this.f9945f = false;
        this.f9946g = -1L;
        this.f9947h = -1L;
        this.f9948i = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0689h.class.equals(obj.getClass())) {
            return false;
        }
        C0689h c0689h = (C0689h) obj;
        if (this.f9942c == c0689h.f9942c && this.f9943d == c0689h.f9943d && this.f9944e == c0689h.f9944e && this.f9945f == c0689h.f9945f && this.f9946g == c0689h.f9946g && this.f9947h == c0689h.f9947h && Intrinsics.c(this.f9941b.f18699a, c0689h.f9941b.f18699a) && this.f9940a == c0689h.f9940a) {
            return Intrinsics.c(this.f9948i, c0689h.f9948i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f9940a.hashCode() * 31) + (this.f9942c ? 1 : 0)) * 31) + (this.f9943d ? 1 : 0)) * 31) + (this.f9944e ? 1 : 0)) * 31) + (this.f9945f ? 1 : 0)) * 31;
        long j6 = this.f9946g;
        int i7 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j10 = this.f9947h;
        int iHashCode2 = (this.f9948i.hashCode() + ((i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequest = this.f9941b.f18699a;
        return iHashCode2 + (networkRequest != null ? networkRequest.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f9940a + ", requiresCharging=" + this.f9942c + ", requiresDeviceIdle=" + this.f9943d + ", requiresBatteryNotLow=" + this.f9944e + ", requiresStorageNotLow=" + this.f9945f + ", contentTriggerUpdateDelayMillis=" + this.f9946g + ", contentTriggerMaxDelayMillis=" + this.f9947h + ", contentUriTriggers=" + this.f9948i + ", }";
    }

    public C0689h(androidx.work.impl.utils.g requiredNetworkRequestCompat, D requiredNetworkType, boolean z3, boolean z8, boolean z10, boolean z11, long j6, long j10, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f9941b = requiredNetworkRequestCompat;
        this.f9940a = requiredNetworkType;
        this.f9942c = z3;
        this.f9943d = z8;
        this.f9944e = z10;
        this.f9945f = z11;
        this.f9946g = j6;
        this.f9947h = j10;
        this.f9948i = contentUriTriggers;
    }

    public C0689h(C0689h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f9942c = other.f9942c;
        this.f9943d = other.f9943d;
        this.f9941b = other.f9941b;
        this.f9940a = other.f9940a;
        this.f9944e = other.f9944e;
        this.f9945f = other.f9945f;
        this.f9948i = other.f9948i;
        this.f9946g = other.f9946g;
        this.f9947h = other.f9947h;
    }
}
