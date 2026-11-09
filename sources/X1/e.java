package X1;

import com.adjust.sdk.Constants;
import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double f10988B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double f10989C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10990H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f10991L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f10992M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final long[] f10993Q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10994w;

    public e(String str) {
        super(str);
        this.f10988B = 72.0d;
        this.f10989C = 72.0d;
        this.f10990H = 1;
        this.f10991L = "";
        this.f10992M = 24;
        this.f10993Q = new long[3];
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        V1.a.q(this.f10967v, byteBufferAllocate);
        V1.a.q(0, byteBufferAllocate);
        V1.a.q(0, byteBufferAllocate);
        long[] jArr = this.f10993Q;
        byteBufferAllocate.putInt((int) jArr[0]);
        byteBufferAllocate.putInt((int) jArr[1]);
        byteBufferAllocate.putInt((int) jArr[2]);
        V1.a.q(this.f10994w, byteBufferAllocate);
        V1.a.q(this.f10987A, byteBufferAllocate);
        V1.a.o(byteBufferAllocate, this.f10988B);
        V1.a.o(byteBufferAllocate, this.f10989C);
        byteBufferAllocate.putInt((int) 0);
        V1.a.q(this.f10990H, byteBufferAllocate);
        byteBufferAllocate.put((byte) (V1.a.m(this.f10991L) & 255));
        byteBufferAllocate.put(V1.a.b(this.f10991L));
        int iM = V1.a.m(this.f10991L);
        while (iM < 31) {
            iM++;
            byteBufferAllocate.put((byte) 0);
        }
        V1.a.q(this.f10992M, byteBufferAllocate);
        V1.a.q(65535, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final long getSize() {
        long jB = b();
        return 78 + jB + ((long) ((this.f6921p || jB + 86 >= 4294967296L) ? 16 : 8));
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) throws IOException {
        long jPosition = dataSource.position() + j6;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.f10967v = V1.a.h(byteBufferAllocate);
        V1.a.h(byteBufferAllocate);
        V1.a.h(byteBufferAllocate);
        long j10 = V1.a.j(byteBufferAllocate);
        long[] jArr = this.f10993Q;
        jArr[0] = j10;
        jArr[1] = V1.a.j(byteBufferAllocate);
        jArr[2] = V1.a.j(byteBufferAllocate);
        this.f10994w = V1.a.h(byteBufferAllocate);
        this.f10987A = V1.a.h(byteBufferAllocate);
        this.f10988B = V1.a.f(byteBufferAllocate);
        this.f10989C = V1.a.f(byteBufferAllocate);
        V1.a.j(byteBufferAllocate);
        this.f10990H = V1.a.h(byteBufferAllocate);
        int iA = V1.a.a(byteBufferAllocate.get());
        if (iA > 31) {
            iA = 31;
        }
        byte[] bArr = new byte[iA];
        byteBufferAllocate.get(bArr);
        try {
            this.f10991L = new String(bArr, Constants.ENCODING);
            if (iA < 31) {
                byteBufferAllocate.get(new byte[31 - iA]);
            }
            this.f10992M = V1.a.h(byteBufferAllocate);
            V1.a.h(byteBufferAllocate);
            e(new d(jPosition, dataSource), j6 - 78, boxParser);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }
}
