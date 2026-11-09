package B6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f387a;

    public F(Bitmap resultBitmap) {
        Intrinsics.checkNotNullParameter(resultBitmap, "resultBitmap");
        this.f387a = resultBitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && Intrinsics.c(this.f387a, ((F) obj).f387a);
    }

    public final int hashCode() {
        return this.f387a.hashCode();
    }

    public final String toString() {
        return "AllTasksCompleted(resultBitmap=" + this.f387a + ")";
    }
}
