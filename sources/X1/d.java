package X1;

import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataSource f10986b;

    public d(long j6, DataSource dataSource) {
        this.f10985a = j6;
        this.f10986b = dataSource;
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10986b.close();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final ByteBuffer map(long j6, long j10) {
        return this.f10986b.map(j6, j10);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final long position() {
        return this.f10986b.position();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final int read(ByteBuffer byteBuffer) throws IOException {
        DataSource dataSource = this.f10986b;
        long jPosition = dataSource.position();
        long j6 = this.f10985a;
        if (j6 == jPosition) {
            return -1;
        }
        if (byteBuffer.remaining() <= j6 - dataSource.position()) {
            return dataSource.read(byteBuffer);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(f.r(j6 - dataSource.position()));
        dataSource.read(byteBufferAllocate);
        byteBuffer.put((ByteBuffer) byteBufferAllocate.rewind());
        return byteBufferAllocate.capacity();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final long size() {
        return this.f10985a;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final long transferTo(long j6, long j10, WritableByteChannel writableByteChannel) {
        return this.f10986b.transferTo(j6, j10, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public final void position(long j6) throws IOException {
        this.f10986b.position(j6);
    }
}
