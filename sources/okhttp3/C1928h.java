package okhttp3;

import okio.Sink;

/* JADX INFO: renamed from: okhttp3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1928h extends Pg.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1929i f40757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.rnmaps.maps.M f40758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1928h(C1929i c1929i, com.rnmaps.maps.M m7, Sink sink) {
        super(sink);
        this.f40757b = c1929i;
        this.f40758c = m7;
    }

    @Override // Pg.n, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1929i c1929i = this.f40757b;
        com.rnmaps.maps.M m7 = this.f40758c;
        synchronized (c1929i) {
            if (m7.f24718a) {
                return;
            }
            m7.f24718a = true;
            super.close();
            ((Eg.g) this.f40758c.f24719b).b();
        }
    }
}
