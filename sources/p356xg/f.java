package p356xg;

import Ag.a;
import androidx.work.impl.model.b;
import java.io.IOException;
import net.lingala.zip4j.crypto.Encrypter;
import p372yg.h;
import retrofit2.adapter.rxjava2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, h hVar2, char[] cArr, int i7) {
        super(hVar, hVar2, cArr);
        this.f44000c = i7;
    }

    @Override // p356xg.b
    public final Encrypter b(h hVar, char[] cArr) throws IOException {
        switch (this.f44000c) {
            case 0:
                return new d(10);
            default:
                b bVar = new b(cArr, hVar.f44406j ? (a.b(hVar.f44404h) & 65535) << 16 : 0L);
                this.f43993a.write((byte[]) bVar.f18581c);
                return bVar;
        }
    }

    @Override // p356xg.b, java.io.OutputStream
    public void write(int i7) throws IOException {
        switch (this.f44000c) {
            case 1:
                super.write(new byte[]{(byte) i7}, 0, 1);
                break;
            default:
                super.write(i7);
                break;
        }
    }

    @Override // p356xg.b, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f44000c) {
            case 1:
                super.write(bArr, 0, bArr.length);
                break;
            default:
                super.write(bArr);
                break;
        }
    }
}
