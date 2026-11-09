package P4;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Box {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p264r5.a f6908p = p264r5.a.t(a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Container f6910b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f6913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6915g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DataSource f6917j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6916i = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f6918o = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6912d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6911c = true;

    public a(String str) {
        this.f6909a = str;
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract void b(ByteBuffer byteBuffer);

    public abstract long c();

    public final void d(ByteBuffer byteBuffer) {
        boolean zE = e();
        String str = this.f6909a;
        if (zE) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(V1.b.d(str));
        } else {
            byteBuffer.putInt((int) 1);
            byteBuffer.put(V1.b.d(str));
            byteBuffer.putLong(getSize());
        }
        if ("uuid".equals(str)) {
            byteBuffer.put((byte[]) null);
        }
    }

    public final boolean e() {
        int i7 = "uuid".equals(this.f6909a) ? 24 : 8;
        if (this.f6912d) {
            if (this.f6911c) {
                long jC = c();
                ByteBuffer byteBuffer = this.f6918o;
                if (jC + ((long) (byteBuffer != null ? byteBuffer.limit() : 0)) + ((long) i7) < 4294967296L) {
                    return true;
                }
            } else if (this.f6913e.limit() + i7 < 4294967296L) {
                return true;
            }
        } else if (this.f6916i + ((long) i7) < 4294967296L) {
            return true;
        }
        return false;
    }

    public final synchronized void f() {
        try {
            g();
            f6908p.B("parsing details of ".concat(this.f6909a));
            ByteBuffer byteBuffer = this.f6913e;
            if (byteBuffer != null) {
                this.f6911c = true;
                byteBuffer.rewind();
                a(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f6918o = byteBuffer.slice();
                }
                this.f6913e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        try {
            if (!this.f6912d) {
                try {
                    f6908p.B("mem mapping ".concat(this.f6909a));
                    this.f6913e = this.f6917j.map(this.f6914f, this.f6916i);
                    this.f6912d = true;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        boolean z3 = this.f6912d;
        String str = this.f6909a;
        if (!z3) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((e() ? 8 : 16) + ("uuid".equals(str) ? 16 : 0));
            d(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            this.f6917j.transferTo(this.f6914f, this.f6916i, writableByteChannel);
            return;
        }
        if (!this.f6911c) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((e() ? 8 : 16) + ("uuid".equals(str) ? 16 : 0));
            d(byteBufferAllocate2);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.f6913e.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(p140j8.f.r(getSize()));
        d(byteBufferAllocate3);
        b(byteBufferAllocate3);
        ByteBuffer byteBuffer = this.f6918o;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.f6918o.remaining() > 0) {
                byteBufferAllocate3.put(this.f6918o);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate3.rewind());
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getOffset() {
        return this.f6915g;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final Container getParent() {
        return this.f6910b;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final long getSize() {
        long jLimit;
        if (!this.f6912d) {
            jLimit = this.f6916i;
        } else if (this.f6911c) {
            jLimit = c();
        } else {
            ByteBuffer byteBuffer = this.f6913e;
            jLimit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        long j6 = jLimit + ((long) ((jLimit >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(this.f6909a) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.f6918o;
        return j6 + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0));
    }

    @Override // com.coremedia.iso.boxes.Box
    public final String getType() {
        return this.f6909a;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void parse(DataSource dataSource, ByteBuffer byteBuffer, long j6, BoxParser boxParser) throws IOException {
        long jPosition = dataSource.position();
        this.f6914f = jPosition;
        this.f6915g = jPosition - ((long) byteBuffer.remaining());
        this.f6916i = j6;
        this.f6917j = dataSource;
        dataSource.position(dataSource.position() + j6);
        this.f6912d = false;
        this.f6911c = false;
    }

    @Override // com.coremedia.iso.boxes.Box
    public final void setParent(Container container) {
        this.f6910b = container;
    }
}
