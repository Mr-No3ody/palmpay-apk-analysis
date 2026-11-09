package J1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4472a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4473b;

    public l(f fVar) {
        super(fVar);
        this.f4473b = Integer.MIN_VALUE;
    }

    public long a(long j6) {
        int i7 = this.f4473b;
        if (i7 == 0) {
            return -1L;
        }
        return (i7 == Integer.MIN_VALUE || j6 <= ((long) i7)) ? j6 : i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f4472a) {
            case 0:
                int i7 = this.f4473b;
                return i7 == Integer.MIN_VALUE ? super.available() : Math.min(i7, super.available());
            default:
                return Math.min(super.available(), this.f4473b);
        }
    }

    public void b(long j6) {
        int i7 = this.f4473b;
        if (i7 == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f4473b = (int) (((long) i7) - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        switch (this.f4472a) {
            case 0:
                synchronized (this) {
                    super.mark(i7);
                    this.f4473b = i7;
                }
                return;
            default:
                super.mark(i7);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f4472a) {
            case 0:
                if (a(1L) == -1) {
                    return -1;
                }
                int i7 = super.read();
                b(1L);
                return i7;
            default:
                if (this.f4473b <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 < 0) {
                    return i10;
                }
                this.f4473b--;
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f4472a) {
            case 0:
                synchronized (this) {
                    super.reset();
                    this.f4473b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        switch (this.f4472a) {
            case 0:
                long jA = a(j6);
                if (jA == -1) {
                    return 0L;
                }
                long jSkip = super.skip(jA);
                b(jSkip);
                return jSkip;
            default:
                int iSkip = (int) super.skip(Math.min(j6, this.f4473b));
                if (iSkip >= 0) {
                    this.f4473b -= iSkip;
                }
                return iSkip;
        }
    }

    public l(InputStream inputStream, int i7) {
        super(inputStream);
        this.f4473b = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        switch (this.f4472a) {
            case 0:
                int iA = (int) a(i10);
                if (iA == -1) {
                    return -1;
                }
                int i11 = super.read(bArr, i7, iA);
                b(i11);
                return i11;
            default:
                int i12 = this.f4473b;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i7, Math.min(i10, i12));
                if (i13 < 0) {
                    return i13;
                }
                this.f4473b -= i13;
                return i13;
        }
    }
}
