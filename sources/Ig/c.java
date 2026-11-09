package Ig;

import Pg.F;
import Pg.k;
import Pg.p;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4425c;

    public c(j jVar) {
        this.f4425c = jVar;
        this.f4423a = new p(jVar.f4442c.f7388a.timeout());
    }

    public final void a() {
        j jVar = this.f4425c;
        int i7 = jVar.f4444e;
        if (i7 == 6) {
            return;
        }
        if (i7 == 5) {
            j.a(jVar, this.f4423a);
            jVar.f4444e = 6;
        } else {
            throw new IllegalStateException("state: " + jVar.f4444e);
        }
    }

    @Override // okio.Source
    public long read(k sink, long j6) throws IOException {
        j jVar = this.f4425c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return jVar.f4442c.read(sink, j6);
        } catch (IOException e10) {
            jVar.f4441b.k();
            a();
            throw e10;
        }
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f4423a;
    }
}
