package W1;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.FullBox;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends P4.b implements FullBox {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10442w;

    public l() {
        super("stsd");
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        V1.a.s(this.f10441v, byteBufferAllocate);
        V1.a.r(this.f10442w, byteBufferAllocate);
        byteBufferAllocate.putInt(getBoxes().size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final int getFlags() {
        return this.f10442w;
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final long getSize() {
        long jB = b();
        return 8 + jB + ((long) ((this.f6921p || jB + 16 >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final int getVersion() {
        return this.f10441v;
    }

    @Override // P4.b, com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        dataSource.read(byteBufferAllocate);
        byteBufferAllocate.rewind();
        this.f10441v = V1.a.a(byteBufferAllocate.get());
        this.f10442w = V1.a.i(byteBufferAllocate);
        e(dataSource, j6 - 8, boxParser);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final void setFlags(int i7) {
        this.f10442w = i7;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final void setVersion(int i7) {
        this.f10441v = i7;
    }
}
