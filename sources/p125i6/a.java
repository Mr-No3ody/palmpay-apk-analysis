package p125i6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37427b;

    public a(String activityName, long j6) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f37426a = activityName;
        this.f37427b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f37426a, aVar.f37426a) && this.f37427b == aVar.f37427b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37427b) + (this.f37426a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingMilestone(activityName=" + this.f37426a + ", createTimeNanos=" + this.f37427b + ")";
    }
}
