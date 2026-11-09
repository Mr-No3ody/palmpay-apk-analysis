package p039cb;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f18892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18893e;

    public a(boolean z3, String status, String message, b bVar, String str, int i7) {
        bVar = (i7 & 8) != 0 ? null : bVar;
        str = (i7 & 16) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f18889a = z3;
        this.f18890b = status;
        this.f18891c = message;
        this.f18892d = bVar;
        this.f18893e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18889a == aVar.f18889a && this.f18890b.equals(aVar.f18890b) && Intrinsics.c(this.f18891c, aVar.f18891c) && Intrinsics.c(this.f18892d, aVar.f18892d) && Intrinsics.c(this.f18893e, aVar.f18893e);
    }

    public final int hashCode() {
        int iC = G.c(G.c(Boolean.hashCode(this.f18889a) * 31, 31, this.f18890b), 31, this.f18891c);
        b bVar = this.f18892d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f18893e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String strConcat;
        String str = this.f18893e;
        if (str == null || (strConcat = ", error=".concat(str)) == null) {
            strConcat = "";
        }
        StringBuilder sb2 = new StringBuilder("LocationPermissionCheckResult(success=");
        sb2.append(this.f18889a);
        sb2.append(", status=");
        sb2.append(this.f18890b);
        sb2.append(", message=");
        return F.d(sb2, this.f18891c, strConcat, ")");
    }
}
