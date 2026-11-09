package io.fastkv;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f37631b;

    public e(int i7, float f10) {
        this.f37628a = i7;
        this.f37631b = f10;
    }

    @Override // io.fastkv.b
    public final byte a() {
        return (byte) 3;
    }

    @Override // io.fastkv.b
    public final boolean b() {
        return this.f37631b != 0.0f;
    }

    @Override // io.fastkv.b
    public final float c() {
        return this.f37631b;
    }

    @Override // io.fastkv.b
    public final int d() {
        return (int) this.f37631b;
    }

    @Override // io.fastkv.b
    public final long e() {
        return (long) this.f37631b;
    }

    @Override // io.fastkv.b
    public final String f() {
        return String.valueOf(this.f37631b);
    }
}
