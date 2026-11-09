package X1;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f10971q0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10972A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f10973B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10974C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f10975H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f10976L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f10977M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f10978Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f10979X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f10980Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f10981Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f10982k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public byte[] f10983p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10984w;

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        int i7 = this.f10974C;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i7 == 1 ? 16 : 0) + 28 + (i7 == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        V1.a.q(this.f10967v, byteBufferAllocate);
        V1.a.q(this.f10974C, byteBufferAllocate);
        V1.a.q(this.f10981Z, byteBufferAllocate);
        byteBufferAllocate.putInt((int) this.f10982k0);
        V1.a.q(this.f10984w, byteBufferAllocate);
        V1.a.q(this.f10972A, byteBufferAllocate);
        V1.a.q(this.f10975H, byteBufferAllocate);
        V1.a.q(this.f10976L, byteBufferAllocate);
        if (this.f6920o.equals("mlpa")) {
            byteBufferAllocate.putInt((int) this.f10973B);
        } else {
            byteBufferAllocate.putInt((int) (this.f10973B << 16));
        }
        if (this.f10974C == 1) {
            byteBufferAllocate.putInt((int) this.f10977M);
            byteBufferAllocate.putInt((int) this.f10978Q);
            byteBufferAllocate.putInt((int) this.f10979X);
            byteBufferAllocate.putInt((int) this.f10980Y);
        }
        if (this.f10974C == 2) {
            byteBufferAllocate.putInt((int) this.f10977M);
            byteBufferAllocate.putInt((int) this.f10978Q);
            byteBufferAllocate.putInt((int) this.f10979X);
            byteBufferAllocate.putInt((int) this.f10980Y);
            byteBufferAllocate.put(this.f10983p0);
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final long getSize() {
        int i7 = this.f10974C;
        int i10 = 16;
        long jB = b() + ((long) ((i7 == 1 ? 16 : 0) + 28 + (i7 == 2 ? 36 : 0)));
        if (!this.f6921p && 8 + jB < 4294967296L) {
            i10 = 8;
        }
        return jB + ((long) i10);
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.position(6);
        this.f10967v = V1.a.h(byteBufferAllocate);
        this.f10974C = V1.a.h(byteBufferAllocate);
        this.f10981Z = V1.a.h(byteBufferAllocate);
        this.f10982k0 = V1.a.j(byteBufferAllocate);
        this.f10984w = V1.a.h(byteBufferAllocate);
        this.f10972A = V1.a.h(byteBufferAllocate);
        this.f10975H = V1.a.h(byteBufferAllocate);
        this.f10976L = V1.a.h(byteBufferAllocate);
        this.f10973B = V1.a.j(byteBufferAllocate);
        String str = this.f6920o;
        if (!str.equals("mlpa")) {
            this.f10973B >>>= 16;
        }
        if (this.f10974C == 1) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            dataSource.read(byteBufferAllocate2);
            byteBufferAllocate2.rewind();
            this.f10977M = V1.a.j(byteBufferAllocate2);
            this.f10978Q = V1.a.j(byteBufferAllocate2);
            this.f10979X = V1.a.j(byteBufferAllocate2);
            this.f10980Y = V1.a.j(byteBufferAllocate2);
        }
        if (this.f10974C == 2) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(36);
            dataSource.read(byteBufferAllocate3);
            byteBufferAllocate3.rewind();
            this.f10977M = V1.a.j(byteBufferAllocate3);
            this.f10978Q = V1.a.j(byteBufferAllocate3);
            this.f10979X = V1.a.j(byteBufferAllocate3);
            this.f10980Y = V1.a.j(byteBufferAllocate3);
            byte[] bArr = new byte[20];
            this.f10983p0 = bArr;
            byteBufferAllocate3.get(bArr);
        }
        if (!"owma".equals(str)) {
            long j10 = j6 - 28;
            int i7 = this.f10974C;
            e(dataSource, (j10 - ((long) (i7 != 1 ? 0 : 16))) - ((long) (i7 != 2 ? 0 : 36)), boxParser);
            return;
        }
        System.err.println("owma");
        long j11 = j6 - 28;
        int i10 = this.f10974C;
        long j12 = (j11 - ((long) (i10 != 1 ? 0 : 16))) - ((long) (i10 != 2 ? 0 : 36));
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(f.r(j12));
        dataSource.read(byteBufferAllocate4);
        a(new b(this, j12, byteBufferAllocate4));
    }

    @Override // P4.e
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f10980Y + ", bytesPerFrame=" + this.f10979X + ", bytesPerPacket=" + this.f10978Q + ", samplesPerPacket=" + this.f10977M + ", packetSize=" + this.f10976L + ", compressionId=" + this.f10975H + ", soundVersion=" + this.f10974C + ", sampleRate=" + this.f10973B + ", sampleSize=" + this.f10972A + ", channelCount=" + this.f10984w + ", boxes=" + getBoxes() + '}';
    }
}
