package p318v1;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f43059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f43060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f43061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43063e;

    public e(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(f.f43064a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f43059a = fileInputStream;
        this.f43060b = charset;
        this.f43061c = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String a() {
        int i7;
        synchronized (this.f43059a) {
            try {
                byte[] bArr = this.f43061c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f43062d >= this.f43063e) {
                    int i10 = this.f43059a.read(bArr, 0, bArr.length);
                    if (i10 == -1) {
                        throw new EOFException();
                    }
                    this.f43062d = 0;
                    this.f43063e = i10;
                }
                for (int i11 = this.f43062d; i11 != this.f43063e; i11++) {
                    byte[] bArr2 = this.f43061c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f43062d;
                        if (i11 != i12) {
                            i7 = i11 - 1;
                            if (bArr2[i7] != 13) {
                                i7 = i11;
                            }
                        } else {
                            i7 = i11;
                        }
                        String str = new String(bArr2, i12, i7 - i12, this.f43060b.name());
                        this.f43062d = i11 + 1;
                        return str;
                    }
                }
                d dVar = new d(this, (this.f43063e - this.f43062d) + 80);
                while (true) {
                    byte[] bArr3 = this.f43061c;
                    int i13 = this.f43062d;
                    dVar.write(bArr3, i13, this.f43063e - i13);
                    this.f43063e = -1;
                    byte[] bArr4 = this.f43061c;
                    int i14 = this.f43059a.read(bArr4, 0, bArr4.length);
                    if (i14 == -1) {
                        throw new EOFException();
                    }
                    this.f43062d = 0;
                    this.f43063e = i14;
                    for (int i15 = 0; i15 != this.f43063e; i15++) {
                        byte[] bArr5 = this.f43061c;
                        if (bArr5[i15] == 10) {
                            int i16 = this.f43062d;
                            if (i15 != i16) {
                                dVar.write(bArr5, i16, i15 - i16);
                            }
                            this.f43062d = i15 + 1;
                            return dVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f43059a) {
            try {
                if (this.f43061c != null) {
                    this.f43061c = null;
                    this.f43059a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
