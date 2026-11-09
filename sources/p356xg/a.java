package p356xg;

import java.io.IOException;
import net.lingala.zip4j.crypto.Encrypter;
import p372yg.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f43991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43992d;

    @Override // p356xg.b
    public final void a() throws IOException {
        int i7 = this.f43992d;
        if (i7 != 0) {
            super.write(this.f43991c, 0, i7);
            this.f43992d = 0;
        }
        net.lingala.zip4j.crypto.PBKDF2.a aVar = ((p299tg.a) this.f43994b).f42632b;
        if (aVar.f39953c.size() > 0) {
            aVar.a();
        }
        byte[] bArr = new byte[10];
        System.arraycopy(aVar.f39951a.doFinal(), 0, bArr, 0, 10);
        h hVar = this.f43993a;
        hVar.getClass();
        hVar.write(bArr, 0, 10);
        super.a();
    }

    @Override // p356xg.b
    public final Encrypter b(h hVar, char[] cArr) throws IOException {
        p299tg.a aVar = new p299tg.a(cArr, hVar.f44401e);
        this.f43993a.write(aVar.f42640o);
        this.f43993a.write(aVar.f42639j);
        return aVar;
    }

    @Override // p356xg.b, java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // p356xg.b, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // p356xg.b, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        int i11;
        int i12 = this.f43992d;
        int i13 = 16 - i12;
        byte[] bArr2 = this.f43991c;
        if (i10 >= i13) {
            System.arraycopy(bArr, i7, bArr2, i12, 16 - i12);
            super.write(bArr2, 0, bArr2.length);
            int i14 = 16 - this.f43992d;
            int i15 = i10 - i14;
            this.f43992d = 0;
            if (i15 != 0 && (i11 = i15 % 16) != 0) {
                System.arraycopy(bArr, (i15 + i14) - i11, bArr2, 0, i11);
                this.f43992d = i11;
                i15 -= i11;
            }
            super.write(bArr, i14, i15);
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i12, i10);
        this.f43992d += i10;
    }
}
