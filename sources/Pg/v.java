package Pg;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSource f7379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f7381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7384f;

    public v(BufferedSource upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f7379a = upstream;
        k buffer = upstream.getBuffer();
        this.f7380b = buffer;
        z zVar = buffer.f7357a;
        this.f7381c = zVar;
        this.f7382d = zVar != null ? zVar.f7392b : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7383e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f7392b) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(Pg.k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f7383e
            if (r3 != 0) goto L63
            Pg.z r3 = r8.f7381c
            Pg.k r4 = r8.f7380b
            if (r3 == 0) goto L2b
            Pg.z r5 = r4.f7357a
            if (r3 != r5) goto L23
            int r3 = r8.f7382d
            kotlin.jvm.internal.Intrinsics.e(r5)
            int r5 = r5.f7392b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f7384f
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.f7379a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            Pg.z r0 = r8.f7381c
            if (r0 != 0) goto L4c
            Pg.z r0 = r4.f7357a
            if (r0 == 0) goto L4c
            r8.f7381c = r0
            int r0 = r0.f7392b
            r8.f7382d = r0
        L4c:
            long r0 = r4.f7358b
            long r2 = r8.f7384f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            Pg.k r2 = r8.f7380b
            long r4 = r8.f7384f
            r3 = r9
            r2.d(r3, r4, r6)
            long r9 = r8.f7384f
            long r9 = r9 + r6
            r8.f7384f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.camera.video.u.i(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.v.read(Pg.k, long):long");
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f7379a.timeout();
    }
}
