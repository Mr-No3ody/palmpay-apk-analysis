package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.horcrux.svg.d0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@NonNull DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final Object next() {
        if (!hasNext()) {
            int i7 = this.zab;
            throw new NoSuchElementException(d0.n(i7, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i7).length() + 35)));
        }
        int i10 = this.zab + 1;
        this.zab = i10;
        if (i10 == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(objCheckNotNull.getClass());
                throw new IllegalStateException(F.d(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
