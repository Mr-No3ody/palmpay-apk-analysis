package Ae;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f286b;

    public l(String title, Drawable drawable) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f285a = title;
        this.f286b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.c(this.f285a, lVar.f285a) && Intrinsics.c(this.f286b, lVar.f286b);
    }

    public final int hashCode() {
        int iHashCode = this.f285a.hashCode() * 31;
        Drawable drawable = this.f286b;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OtpMethodItem(title=" + this.f285a + ", iconRes=" + this.f286b + ")";
    }
}
