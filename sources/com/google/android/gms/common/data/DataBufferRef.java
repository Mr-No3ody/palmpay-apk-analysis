package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class DataBufferRef {

    @NonNull
    @KeepForSdk
    protected final DataHolder mDataHolder;

    @KeepForSdk
    protected int mDataRow;
    private int zaa;

    @KeepForSdk
    public DataBufferRef(@NonNull DataHolder dataHolder, int i7) {
        this.mDataHolder = (DataHolder) Preconditions.checkNotNull(dataHolder);
        zaa(i7);
    }

    @KeepForSdk
    public void copyToBuffer(@NonNull String str, @NonNull CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zad(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.equal(Integer.valueOf(dataBufferRef.mDataRow), Integer.valueOf(this.mDataRow)) && Objects.equal(Integer.valueOf(dataBufferRef.zaa), Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int getDataRow() {
        return this.mDataRow;
    }

    @KeepForSdk
    public double getDouble(@NonNull String str) {
        return this.mDataHolder.zac(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public float getFloat(@NonNull String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int getInteger(@NonNull String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public long getLong(@NonNull String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.mDataHolder.hasColumn(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder);
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    @Nullable
    @KeepForSdk
    public Uri parseUri(@NonNull String str) {
        String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final void zaa(int i7) {
        boolean z3 = false;
        if (i7 >= 0 && i7 < this.mDataHolder.getCount()) {
            z3 = true;
        }
        Preconditions.checkState(z3);
        this.mDataRow = i7;
        this.zaa = this.mDataHolder.getWindowIndex(i7);
    }
}
