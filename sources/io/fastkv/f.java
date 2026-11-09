package io.fastkv;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37632b;

    public f(int i7, int i10) {
        this.f37628a = i7;
        this.f37632b = i10;
    }

    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 2;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        return this.f37632b != 0;
    }

    @Override // io.fastkv.b
    public final float c() {
        return this.f37632b;
    }

    @Override // io.fastkv.b
    public final int d() {
        return this.f37632b;
    }

    @Override // io.fastkv.b
    public final long e() {
        return this.f37632b;
    }

    @Override // io.fastkv.b
    public final String f() {
        return String.valueOf(this.f37632b);
    }
}
