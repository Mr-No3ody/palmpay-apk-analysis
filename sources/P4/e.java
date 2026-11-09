package P4;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Container, Iterator, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f6925i = new d("eof ");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BoxParser f6926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSource f6927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Box f6928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6932g;

    static {
        p264r5.a.t(e.class);
    }

    public final void a(Box box) {
        if (box != null) {
            this.f6932g = new ArrayList(getBoxes());
            box.setParent(this);
            this.f6932g.add(box);
        }
    }

    public final long b() {
        long size = 0;
        for (int i7 = 0; i7 < getBoxes().size(); i7++) {
            size += ((Box) this.f6932g.get(i7)).getSize();
        }
        return size;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Box next() {
        Box box;
        Box box2 = this.f6928c;
        if (box2 != null && box2 != f6925i) {
            this.f6928c = null;
            return box2;
        }
        DataSource dataSource = this.f6927b;
        if (dataSource == null || this.f6929d >= this.f6931f) {
            this.f6928c = f6925i;
            throw new NoSuchElementException();
        }
        try {
            synchronized (dataSource) {
                this.f6927b.position(this.f6929d);
                box = this.f6926a.parseBox(this.f6927b, this);
                this.f6929d = this.f6927b.position();
            }
            return box;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6927b.close();
    }

    @Override // com.coremedia.iso.boxes.Container
    public final List getBoxes() {
        return (this.f6927b == null || this.f6928c == f6925i) ? this.f6932g : new T4.d(this.f6932g, this);
    }

    @Override // com.coremedia.iso.boxes.Container
    public final ByteBuffer getByteBuffer(long j6, long j10) throws IOException {
        ByteBuffer map;
        DataSource dataSource = this.f6927b;
        if (dataSource != null) {
            synchronized (dataSource) {
                map = this.f6927b.map(this.f6930e + j6, j10);
            }
            return map;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(p140j8.f.r(j10));
        long j11 = j10 + j6;
        long j12 = 0;
        for (Box box : this.f6932g) {
            long size = box.getSize() + j12;
            if (size > j6 && j12 < j11) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream);
                box.getBox(writableByteChannelNewChannel);
                writableByteChannelNewChannel.close();
                if (j12 >= j6 && size <= j11) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray());
                } else if (j12 < j6 && size > j11) {
                    long j13 = j6 - j12;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), p140j8.f.r(j13), p140j8.f.r((box.getSize() - j13) - (size - j11)));
                } else if (j12 < j6 && size <= j11) {
                    long j14 = j6 - j12;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), p140j8.f.r(j14), p140j8.f.r(box.getSize() - j14));
                } else if (j12 >= j6 && size > j11) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), 0, p140j8.f.r(box.getSize() - (size - j11)));
                }
            }
            j12 = size;
        }
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Box box = this.f6928c;
        d dVar = f6925i;
        if (box == dVar) {
            return false;
        }
        if (box != null) {
            return true;
        }
        try {
            this.f6928c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f6928c = dVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.coremedia.iso.boxes.Container
    public void setBoxes(List list) {
        this.f6932g = new ArrayList(list);
        this.f6928c = f6925i;
        this.f6927b = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i7 = 0; i7 < this.f6932g.size(); i7++) {
            if (i7 > 0) {
                sb2.append(";");
            }
            sb2.append(((Box) this.f6932g.get(i7)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.coremedia.iso.boxes.Container
    public final void writeContainer(WritableByteChannel writableByteChannel) {
        Iterator it = getBoxes().iterator();
        while (it.hasNext()) {
            ((Box) it.next()).getBox(writableByteChannel);
        }
    }

    @Override // com.coremedia.iso.boxes.Container
    public final List getBoxes(Class cls) {
        List boxes = getBoxes();
        ArrayList arrayList = null;
        Box box = null;
        for (int i7 = 0; i7 < boxes.size(); i7++) {
            Box box2 = (Box) boxes.get(i7);
            if (cls.isInstance(box2)) {
                if (box == null) {
                    box = box2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(box);
                    }
                    arrayList.add(box2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (box != null) {
            return Collections.singletonList(box);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.Container
    public final List getBoxes(Class cls, boolean z3) {
        ArrayList arrayList = new ArrayList(2);
        List boxes = getBoxes();
        for (int i7 = 0; i7 < boxes.size(); i7++) {
            Box box = (Box) boxes.get(i7);
            if (cls.isInstance(box)) {
                arrayList.add(box);
            }
            if (z3 && (box instanceof Container)) {
                arrayList.addAll(((Container) box).getBoxes(cls, z3));
            }
        }
        return arrayList;
    }
}
