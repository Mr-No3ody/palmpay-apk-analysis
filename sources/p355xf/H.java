package p355xf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final G f43952b = new G(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f43953a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.h(this.f43953a & 65535, ((H) obj).f43953a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            return this.f43953a == ((H) obj).f43953a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f43953a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f43953a);
    }
}
