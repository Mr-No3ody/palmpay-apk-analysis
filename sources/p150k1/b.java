package p150k1;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Box {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Container f38616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38618c;

    @Override // com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        Intrinsics.checkNotNullParameter(writableByteChannel, "writableByteChannel");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        long size = getSize();
        long j6 = ((long) 8) + size;
        if (!(j6 < 4294967296L) || size < 0 || size > 4294967296L) {
            byteBufferAllocate.putInt((int) 1);
        } else {
            byteBufferAllocate.putInt((int) size);
        }
        byteBufferAllocate.put(V1.b.d("mdat"));
        if (j6 < 4294967296L) {
            byteBufferAllocate.put(new byte[8]);
        } else {
            if (size < 0) {
                size = 1;
            }
            byteBufferAllocate.putLong(size);
        }
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getOffset() {
        return this.f38618c;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final Container getParent() {
        Container container = this.f38616a;
        if (container != null) {
            return container;
        }
        Intrinsics.n("parent");
        throw null;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getSize() {
        return ((long) 16) + this.f38617b;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final String getType() {
        return "mdat";
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void setParent(Container parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f38616a = parent;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) {
    }
}
