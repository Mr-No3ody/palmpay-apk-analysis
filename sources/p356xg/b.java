package p356xg;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.crypto.Encrypter;
import p372yg.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f43993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Encrypter f43994b;

    public b(h hVar, h hVar2, char[] cArr) {
        this.f43993a = hVar;
        this.f43994b = b(hVar2, cArr);
    }

    public void a() {
        this.f43993a.f44003c = true;
    }

    public abstract Encrypter b(h hVar, char[] cArr);

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43993a.getClass();
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        this.f43993a.write(i7);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f43993a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i10) throws IOException {
        this.f43994b.encryptData(bArr, i7, i10);
        this.f43993a.write(bArr, i7, i10);
    }
}
