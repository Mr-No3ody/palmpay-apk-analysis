package p356xg;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f43998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Deflater f43999c;

    @Override // p356xg.c
    public final void a() throws IOException {
        Deflater deflater = this.f43999c;
        if (!deflater.finished()) {
            deflater.finish();
            while (!deflater.finished()) {
                Deflater deflater2 = this.f43999c;
                byte[] bArr = this.f43998b;
                int iDeflate = deflater2.deflate(bArr, 0, bArr.length);
                if (iDeflate > 0) {
                    super.write(bArr, 0, iDeflate);
                }
            }
        }
        deflater.end();
        super.a();
    }

    @Override // p356xg.c, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // p356xg.c, java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // p356xg.c, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        Deflater deflater = this.f43999c;
        deflater.setInput(bArr, i7, i10);
        while (!deflater.needsInput()) {
            Deflater deflater2 = this.f43999c;
            byte[] bArr2 = this.f43998b;
            int iDeflate = deflater2.deflate(bArr2, 0, bArr2.length);
            if (iDeflate > 0) {
                super.write(bArr2, 0, iDeflate);
            }
        }
    }
}
