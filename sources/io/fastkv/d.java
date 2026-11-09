package io.fastkv;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f37630b;

    public d(int i7, double d2) {
        this.f37628a = i7;
        this.f37630b = d2;
    }

    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 5;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        return this.f37630b != 0.0d;
    }

    @Override // io.fastkv.b
    public final float c() {
        return (float) this.f37630b;
    }

    @Override // io.fastkv.b
    public final int d() {
        return (int) this.f37630b;
    }

    @Override // io.fastkv.b
    public final long e() {
        return (long) this.f37630b;
    }

    @Override // io.fastkv.b
    public final String f() {
        return String.valueOf(this.f37630b);
    }
}
