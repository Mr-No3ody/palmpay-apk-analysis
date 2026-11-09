package io.fastkv;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37629b;

    public c(int i7, boolean z3) {
        this.f37628a = i7;
        this.f37629b = z3;
    }

    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 1;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        return this.f37629b;
    }

    @Override // io.fastkv.b
    public final float c() {
        return this.f37629b ? 1.0f : 0.0f;
    }

    @Override // io.fastkv.b
    public final int d() {
        return this.f37629b ? 1 : 0;
    }

    @Override // io.fastkv.b
    public final long e() {
        return this.f37629b ? 1L : 0L;
    }

    @Override // io.fastkv.b
    public final String f() {
        return this.f37629b ? "true" : "false";
    }
}
