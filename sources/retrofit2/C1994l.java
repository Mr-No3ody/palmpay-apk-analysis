package retrofit2;

/* JADX INFO: renamed from: retrofit2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1994l extends AbstractC1997o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CallAdapter f41935d;

    public C1994l(J j6, okhttp3.Call.Factory factory, Converter converter, CallAdapter callAdapter) {
        super(j6, factory, converter);
        this.f41935d = callAdapter;
    }

    @Override // retrofit2.AbstractC1997o
    public final Object b(C2002u c2002u, Object[] objArr) {
        return this.f41935d.adapt(c2002u);
    }
}
