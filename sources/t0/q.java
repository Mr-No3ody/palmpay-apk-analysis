package t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f42296b;

    public q(float f10, j feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f42295a = f10;
        this.f42296b = feature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f42295a, qVar.f42295a) == 0 && Intrinsics.c(this.f42296b, qVar.f42296b);
    }

    public final int hashCode() {
        return this.f42296b.hashCode() + (Float.hashCode(this.f42295a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.f42295a + ", feature=" + this.f42296b + ')';
    }
}
