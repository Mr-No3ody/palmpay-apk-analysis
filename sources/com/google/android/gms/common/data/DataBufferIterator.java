package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.horcrux.svg.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    @NonNull
    protected final DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(@NonNull DataBuffer dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public Object next() {
        if (!hasNext()) {
            int i7 = this.zab;
            throw new NoSuchElementException(d0.n(i7, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i7).length() + 35)));
        }
        DataBuffer dataBuffer = this.zaa;
        int i10 = this.zab + 1;
        this.zab = i10;
        return dataBuffer.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
