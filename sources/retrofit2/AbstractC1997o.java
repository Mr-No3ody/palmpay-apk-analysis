package retrofit2;

/* JADX INFO: renamed from: retrofit2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1997o extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f41939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.Call.Factory f41940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Converter f41941c;

    public AbstractC1997o(J j6, okhttp3.Call.Factory factory, Converter converter) {
        this.f41939a = j6;
        this.f41940b = factory;
        this.f41941c = converter;
    }

    public abstract Object b(C2002u c2002u, Object[] objArr);
}
