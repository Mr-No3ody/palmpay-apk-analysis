package androidx.work.impl.model;

import V0.Q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f18592b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.c(this.f18591a, iVar.f18591a) && this.f18592b == iVar.f18592b;
    }

    public final int hashCode() {
        return this.f18592b.hashCode() + (this.f18591a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f18591a + ", state=" + this.f18592b + ')';
    }
}
