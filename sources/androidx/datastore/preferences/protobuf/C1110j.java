package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1110j implements ByteString$ByteIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16655a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1120m f16657c;

    public C1110j(C1120m c1120m) {
        this.f16657c = c1120m;
        this.f16656b = c1120m.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16655a < this.f16656b;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString$ByteIterator
    public final byte nextByte() {
        int i7 = this.f16655a;
        if (i7 >= this.f16656b) {
            throw new NoSuchElementException();
        }
        this.f16655a = i7 + 1;
        return this.f16657c.f(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
