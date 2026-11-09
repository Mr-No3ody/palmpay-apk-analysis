package Ng;

import Pg.AbstractC0555b;
import Pg.m;
import Pg.w;
import com.facebook.imageutils.JfifUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pg.k f6454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pg.k f6455g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f6457j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f6458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Pg.h f6459p;

    public l(w sink, Random random, boolean z3, boolean z8, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f6449a = sink;
        this.f6450b = random;
        this.f6451c = z3;
        this.f6452d = z8;
        this.f6453e = j6;
        this.f6454f = new Pg.k();
        this.f6455g = sink.f7386b;
        this.f6458o = new byte[4];
        this.f6459p = new Pg.h();
    }

    public final void a(m mVar, int i7) {
        if (this.f6456i) {
            throw new IOException("closed");
        }
        int iD = mVar.d();
        if (iD > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        Pg.k kVar = this.f6455g;
        kVar.m(i7 | 128);
        kVar.m(iD | 128);
        byte[] bArr = this.f6458o;
        Intrinsics.e(bArr);
        this.f6450b.nextBytes(bArr);
        kVar.k(bArr);
        if (iD > 0) {
            long j6 = kVar.f7358b;
            kVar.i(mVar);
            Pg.h hVar = this.f6459p;
            Intrinsics.e(hVar);
            kVar.f(hVar);
            hVar.b(j6);
            com.palmpay.lib.apm.launchcounter.util.d.T(hVar, bArr);
            hVar.close();
        }
        this.f6449a.flush();
    }

    public final void b(m data, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f6456i) {
            throw new IOException("closed");
        }
        Pg.k buffer = this.f6454f;
        buffer.i(data);
        int i10 = i7 | 128;
        if (this.f6451c && data.d() >= this.f6453e) {
            a aVar = this.f6457j;
            if (aVar == null) {
                aVar = new a(this.f6452d, 0);
                this.f6457j = aVar;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Pg.k kVar = aVar.f6394c;
            if (kVar.f7358b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f6393b) {
                ((Deflater) aVar.f6395d).reset();
            }
            long j6 = buffer.f7358b;
            Ig.h hVar = (Ig.h) aVar.f6396e;
            hVar.write(buffer, j6);
            hVar.flush();
            m mVar = b.f6397a;
            if (kVar.rangeEquals(kVar.f7358b - ((long) mVar.d()), mVar)) {
                long j10 = kVar.f7358b - ((long) 4);
                Pg.h hVarF = kVar.f(AbstractC0555b.f7339a);
                try {
                    hVarF.a(j10);
                    hVarF.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(hVarF, th);
                        throw th2;
                    }
                }
            } else {
                kVar.m(0);
            }
            buffer.write(kVar, kVar.f7358b);
            i10 = i7 | JfifUtil.MARKER_SOFn;
        }
        long j11 = buffer.f7358b;
        Pg.k kVar2 = this.f6455g;
        kVar2.m(i10);
        if (j11 <= 125) {
            kVar2.m(((int) j11) | 128);
        } else if (j11 <= 65535) {
            kVar2.m(254);
            kVar2.r((int) j11);
        } else {
            kVar2.m(255);
            kVar2.q(j11);
        }
        byte[] bArr = this.f6458o;
        Intrinsics.e(bArr);
        this.f6450b.nextBytes(bArr);
        kVar2.k(bArr);
        if (j11 > 0) {
            Pg.h hVar2 = this.f6459p;
            Intrinsics.e(hVar2);
            buffer.f(hVar2);
            hVar2.b(0L);
            com.palmpay.lib.apm.launchcounter.util.d.T(hVar2, bArr);
            hVar2.close();
        }
        kVar2.write(buffer, j11);
        this.f6449a.emit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f6457j;
        if (aVar != null) {
            aVar.close();
        }
    }
}
