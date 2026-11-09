package P4;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends e implements Box {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Container f6919j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6921p;
    public long t;

    public b(String str) {
        this.f6928c = null;
        this.f6929d = 0L;
        this.f6930e = 0L;
        this.f6931f = 0L;
        this.f6932g = new ArrayList();
        this.f6920o = str;
    }

    public final ByteBuffer d() {
        ByteBuffer byteBufferWrap;
        boolean z3 = this.f6921p;
        String str = this.f6920o;
        if (z3 || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            byteBufferWrap.putLong(getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, str.getBytes()[0], str.getBytes()[1], str.getBytes()[2], str.getBytes()[3]});
            byteBufferWrap.putInt((int) getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    public final void e(DataSource dataSource, long j6, BoxParser boxParser) {
        this.f6927b = dataSource;
        long jPosition = dataSource.position();
        this.f6929d = jPosition;
        this.f6930e = jPosition - ((long) ((this.f6921p || 8 + j6 >= 4294967296L) ? 16 : 8));
        dataSource.position(dataSource.position() + j6);
        this.f6931f = dataSource.position();
        this.f6926a = boxParser;
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        writeContainer(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getOffset() {
        return this.t;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final Container getParent() {
        return this.f6919j;
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
        long jB = b();
        return jB + ((long) ((this.f6921p || 8 + jB >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.Box
    public final String getType() {
        return this.f6920o;
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) {
        this.t = dataSource.position() - ((long) byteBuffer.remaining());
        this.f6921p = byteBuffer.remaining() == 16;
        e(dataSource, j6, boxParser);
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void setParent(Container container) {
        this.f6919j = container;
    }
}
