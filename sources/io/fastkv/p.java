package io.fastkv;

import N8.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37675b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37674a - ((p) obj).f37674a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Segment{start=");
        sb2.append(this.f37674a);
        sb2.append(", end=");
        return q0.m(sb2, this.f37675b, '}');
    }
}
