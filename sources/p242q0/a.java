package p242q0;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f41347b;

    public a(f fVar) {
        this.f41347b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j10 = this.f41346a;
            f fVar = this.f41347b;
            if (j10 != j6) {
                if (j10 >= 0 && j6 >= j10 + ((long) fVar.f41350a.available())) {
                    return -1;
                }
                fVar.b(j6);
                this.f41346a = j6;
            }
            if (i10 > fVar.f41350a.available()) {
                i10 = fVar.f41350a.available();
            }
            int i11 = fVar.read(bArr, i7, i10);
            if (i11 >= 0) {
                this.f41346a += (long) i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f41346a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
