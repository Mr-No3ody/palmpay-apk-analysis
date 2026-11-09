package p042cg;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f19011d;

    static {
        int i7 = l.f19019c;
        int i10 = l.f19020d;
        long j6 = l.f19021e;
        String str = l.f19017a;
        f fVar = new f();
        fVar.f19013c = new d(j6, str, i7, i10);
        f19011d = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
