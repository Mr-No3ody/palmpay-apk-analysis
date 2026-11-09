package V0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9938b;

    public C0688g(Uri uri, boolean z3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f9937a = uri;
        this.f9938b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0688g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0688g c0688g = (C0688g) obj;
        return Intrinsics.c(this.f9937a, c0688g.f9937a) && this.f9938b == c0688g.f9938b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9938b) + (this.f9937a.hashCode() * 31);
    }
}
