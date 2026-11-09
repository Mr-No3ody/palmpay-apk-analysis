package Pg;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f7346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f7348c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f7350e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7349d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7351f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7352g = -1;

    public final void a(long j6) {
        k kVar = this.f7346a;
        if (kVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f7347b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j10 = kVar.f7358b;
        if (j6 <= j10) {
            if (j6 < 0) {
                throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "newSize < 0: ").toString());
            }
            long j11 = j10 - j6;
            while (j11 > 0) {
                z zVar = kVar.f7357a;
                Intrinsics.e(zVar);
                z zVar2 = zVar.f7397g;
                Intrinsics.e(zVar2);
                int i7 = zVar2.f7393c;
                long j12 = i7 - zVar2.f7392b;
                if (j12 > j11) {
                    zVar2.f7393c = i7 - ((int) j11);
                    break;
                } else {
                    kVar.f7357a = zVar2.a();
                    A.a(zVar2);
                    j11 -= j12;
                }
            }
            this.f7348c = null;
            this.f7349d = j6;
            this.f7350e = null;
            this.f7351f = -1;
            this.f7352g = -1;
        } else if (j6 > j10) {
            long j13 = j6 - j10;
            int i10 = 1;
            boolean z3 = true;
            for (long j14 = 0; j13 > j14; j14 = 0) {
                z zVarH = kVar.h(i10);
                int iMin = (int) Math.min(j13, 8192 - zVarH.f7393c);
                int i11 = zVarH.f7393c + iMin;
                zVarH.f7393c = i11;
                j13 -= (long) iMin;
                if (z3) {
                    this.f7348c = zVarH;
                    this.f7349d = j10;
                    this.f7350e = zVarH.f7391a;
                    this.f7351f = i11 - iMin;
                    this.f7352g = i11;
                    z3 = false;
                }
                i10 = 1;
            }
        }
        kVar.f7358b = j6;
    }

    public final int b(long j6) {
        k kVar = this.f7346a;
        if (kVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j6 >= -1) {
            long j10 = kVar.f7358b;
            if (j6 <= j10) {
                if (j6 == -1 || j6 == j10) {
                    this.f7348c = null;
                    this.f7349d = j6;
                    this.f7350e = null;
                    this.f7351f = -1;
                    this.f7352g = -1;
                    return -1;
                }
                z zVar = kVar.f7357a;
                z zVar2 = this.f7348c;
                long j11 = 0;
                if (zVar2 != null) {
                    long j12 = this.f7349d - ((long) (this.f7351f - zVar2.f7392b));
                    if (j12 > j6) {
                        zVar2 = zVar;
                        zVar = zVar2;
                        j10 = j12;
                    } else {
                        j11 = j12;
                    }
                } else {
                    zVar2 = zVar;
                }
                if (j10 - j6 > j6 - j11) {
                    while (true) {
                        Intrinsics.e(zVar2);
                        long j13 = ((long) (zVar2.f7393c - zVar2.f7392b)) + j11;
                        if (j6 < j13) {
                            break;
                        }
                        zVar2 = zVar2.f7396f;
                        j11 = j13;
                    }
                } else {
                    while (j10 > j6) {
                        Intrinsics.e(zVar);
                        zVar = zVar.f7397g;
                        Intrinsics.e(zVar);
                        j10 -= (long) (zVar.f7393c - zVar.f7392b);
                    }
                    zVar2 = zVar;
                    j11 = j10;
                }
                if (this.f7347b) {
                    Intrinsics.e(zVar2);
                    if (zVar2.f7394d) {
                        byte[] bArr = zVar2.f7391a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                        z zVar3 = new z(bArrCopyOf, zVar2.f7392b, zVar2.f7393c, false, true);
                        if (kVar.f7357a == zVar2) {
                            kVar.f7357a = zVar3;
                        }
                        zVar2.b(zVar3);
                        z zVar4 = zVar3.f7397g;
                        Intrinsics.e(zVar4);
                        zVar4.a();
                        zVar2 = zVar3;
                    }
                }
                this.f7348c = zVar2;
                this.f7349d = j6;
                Intrinsics.e(zVar2);
                this.f7350e = zVar2.f7391a;
                int i7 = zVar2.f7392b + ((int) (j6 - j11));
                this.f7351f = i7;
                int i10 = zVar2.f7393c;
                this.f7352g = i10;
                return i10 - i7;
            }
        }
        StringBuilder sbR = androidx.camera.video.u.r(j6, "offset=", " > size=");
        sbR.append(kVar.f7358b);
        throw new ArrayIndexOutOfBoundsException(sbR.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7346a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f7346a = null;
        this.f7348c = null;
        this.f7349d = -1L;
        this.f7350e = null;
        this.f7351f = -1;
        this.f7352g = -1;
    }
}
