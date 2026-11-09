package retrofit2;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Converter f41815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41816e;

    public C(Converter converter, boolean z3) {
        this.f41815d = converter;
        this.f41816e = z3;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        if (obj == null) {
            return;
        }
        h7.c((String) this.f41815d.convert(obj), null, this.f41816e);
    }
}
