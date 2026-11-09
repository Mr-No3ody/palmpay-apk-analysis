package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16907a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f16909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f16910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16912f;

    public o(t tVar) {
        this.f16908b = tVar;
        this.f16909c = tVar;
    }

    public final void a() {
        this.f16907a = 1;
        this.f16909c = this.f16908b;
        this.f16912f = 0;
    }

    public final boolean b() {
        androidx.emoji2.text.flatbuffer.a aVarB = this.f16909c.f16933b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f348d).get(iA + aVarB.f345a) == 0) || this.f16911e == 65039;
    }
}
