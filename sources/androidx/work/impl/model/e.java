package androidx.work.impl.model;

import N8.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18588b;

    public e(String workSpecId, int i7) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18587a = workSpecId;
        this.f18588b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f18587a, eVar.f18587a) && this.f18588b == eVar.f18588b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18588b) + (this.f18587a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f18587a);
        sb2.append(", generation=");
        return q0.m(sb2, this.f18588b, ')');
    }
}
