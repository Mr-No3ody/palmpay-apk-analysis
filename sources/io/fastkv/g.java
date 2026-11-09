package io.fastkv;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37633b;

    public g(int i7, long j6) {
        this.f37628a = i7;
        this.f37633b = j6;
    }

    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 4;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        return this.f37633b != 0;
    }

    @Override // io.fastkv.b
    public final float c() {
        return this.f37633b;
    }

    @Override // io.fastkv.b
    public final int d() {
        return (int) this.f37633b;
    }

    @Override // io.fastkv.b
    public final long e() {
        return this.f37633b;
    }

    @Override // io.fastkv.b
    public final String f() {
        return String.valueOf(this.f37633b);
    }
}
