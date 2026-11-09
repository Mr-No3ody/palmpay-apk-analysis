package Ug;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f9782d;

    public b(InputStream inputStream) throws IOException {
        f fVar = new f();
        this.f9782d = fVar;
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.f9779a = new byte[16384];
        this.f9780b = 0;
        this.f9781c = 0;
        try {
            f.a(fVar, inputStream);
        } catch (c e10) {
            throw new IOException("Brotli decoder initialization failed", e10);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        f fVar = this.f9782d;
        int i7 = fVar.f9827a;
        if (i7 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i7 == 11) {
            return;
        }
        fVar.f9827a = 11;
        a aVar = fVar.f9829c;
        InputStream inputStream = aVar.f9773d;
        aVar.f9773d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i7 = this.f9781c;
        int i10 = this.f9780b;
        byte[] bArr = this.f9779a;
        if (i7 >= i10) {
            int i11 = read(bArr, 0, bArr.length);
            this.f9780b = i11;
            this.f9781c = 0;
            if (i11 == -1) {
                return -1;
            }
        }
        int i12 = this.f9781c;
        this.f9781c = i12 + 1;
        return bArr[i12] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        f fVar = this.f9782d;
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "Bad offset: "));
        }
        if (i10 >= 0) {
            int i11 = i7 + i10;
            if (i11 > bArr.length) {
                StringBuilder sbE = F.e(i11, "Buffer overflow: ", " > ");
                sbE.append(bArr.length);
                throw new IllegalArgumentException(sbE.toString());
            }
            if (i10 == 0) {
                return 0;
            }
            int iMax = Math.max(this.f9780b - this.f9781c, 0);
            if (iMax != 0) {
                iMax = Math.min(iMax, i10);
                System.arraycopy(this.f9779a, this.f9781c, bArr, i7, iMax);
                this.f9781c += iMax;
                i7 += iMax;
                i10 -= iMax;
                if (i10 == 0) {
                    return iMax;
                }
            }
            try {
                fVar.f9826Y = bArr;
                fVar.f9821T = i7;
                fVar.f9822U = i10;
                fVar.f9823V = 0;
                d.e(fVar);
                int i12 = fVar.f9823V;
                if (i12 == 0) {
                    return -1;
                }
                return i12 + iMax;
            } catch (c e10) {
                throw new IOException("Brotli stream decoding failed", e10);
            }
        }
        throw new IllegalArgumentException(G.m(i10, "Bad length: "));
    }
}
