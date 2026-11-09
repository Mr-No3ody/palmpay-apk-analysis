package androidx.work.impl.model;

import N8.q0;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18586c;

    public d(String workSpecId, int i7, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18584a = workSpecId;
        this.f18585b = i7;
        this.f18586c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f18584a, dVar.f18584a) && this.f18585b == dVar.f18585b && this.f18586c == dVar.f18586c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18586c) + u.b(this.f18585b, this.f18584a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f18584a);
        sb2.append(", generation=");
        sb2.append(this.f18585b);
        sb2.append(", systemId=");
        return q0.m(sb2, this.f18586c, ')');
    }
}
