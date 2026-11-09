package p242q0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f41350a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j6) throws IOException {
        int i7 = this.f41352c;
        if (i7 > j6) {
            this.f41352c = 0;
            this.f41350a.reset();
        } else {
            j6 -= (long) i7;
        }
        a((int) j6);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f41350a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
