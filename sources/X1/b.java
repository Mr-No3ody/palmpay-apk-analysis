package X1;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Box {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f10968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f10970c;

    public b(c cVar, long j6, ByteBuffer byteBuffer) {
        this.f10968a = cVar;
        this.f10969b = j6;
        this.f10970c = byteBuffer;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBuffer = this.f10970c;
        byteBuffer.rewind();
        writableByteChannel.write(byteBuffer);
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getOffset() {
        return 0L;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final Container getParent() {
        return this.f10968a;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getSize() {
        return this.f10969b;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final String getType() {
        return "----";
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) {
        throw new RuntimeException("NotImplemented");
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void setParent(Container container) {
        int i7 = c.f10971q0;
        if (container != this.f10968a) {
            throw new AssertionError("you cannot diswown this special box");
        }
    }
}
