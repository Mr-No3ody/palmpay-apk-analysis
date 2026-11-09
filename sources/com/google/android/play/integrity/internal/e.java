package com.google.android.play.integrity.internal;

import N8.q0;

/* JADX INFO: loaded from: classes2.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22770b;

    public e(int i7, long j6) {
        this.f22769a = i7;
        this.f22770b = j6;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f22769a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f22770b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f22769a == fVar.a() && this.f22770b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f22770b;
        return ((int) (j6 ^ (j6 >>> 32))) ^ ((this.f22769a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f22769a);
        sb2.append(", eventTimestamp=");
        return q0.n(sb2, "}", this.f22770b);
    }
}
