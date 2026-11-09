package androidx.work.impl.constraints;

import androidx.camera.video.u;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18495d;

    public i(boolean z3, boolean z8, boolean z10, boolean z11) {
        this.f18492a = z3;
        this.f18493b = z8;
        this.f18494c = z10;
        this.f18495d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18492a == iVar.f18492a && this.f18493b == iVar.f18493b && this.f18494c == iVar.f18494c && this.f18495d == iVar.f18495d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18495d) + u.d(u.d(Boolean.hashCode(this.f18492a) * 31, 31, this.f18493b), 31, this.f18494c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f18492a + ", isValidated=" + this.f18493b + ", isMetered=" + this.f18494c + ", isNotRoaming=" + this.f18495d + ')';
    }
}
