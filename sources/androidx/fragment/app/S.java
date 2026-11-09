package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class S extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f17039b;

    public S(Z z3) {
        this.f17039b = z3;
    }

    @Override // androidx.fragment.app.J
    public final Fragment a(ClassLoader classLoader, String str) {
        return Fragment.instantiate(this.f17039b.f17087v.f17026b, str, null);
    }
}
