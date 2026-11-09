package Gg;

import Pg.w;
import Pg.x;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f3460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.d f3461c;

    public m(x source, w sink, D.d dVar) {
        this.f3461c = dVar;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f3459a = source;
        this.f3460b = sink;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3461c.a(-1L, true, true, null);
    }
}
