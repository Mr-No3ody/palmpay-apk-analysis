package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    public EntityBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i7 = 1; i7 < count; i7++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i7);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i7, windowIndex);
                            if (string2 == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 42 + String.valueOf(i7).length() + 14 + String.valueOf(windowIndex).length());
                                sb2.append("Missing value for markerColumn: ");
                                sb2.append(primaryDataMarkerColumn);
                                sb2.append(", at row: ");
                                sb2.append(i7);
                                sb2.append(", for window: ");
                                sb2.append(windowIndex);
                                throw new NullPointerException(sb2.toString());
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i7));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public final T get(int i7) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i7);
        int i10 = 0;
        if (i7 >= 0 && i7 != this.zab.size()) {
            if (i7 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i7)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i7 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i7)).intValue();
            }
            int i11 = iIntValue - iIntValue2;
            if (i11 == 1) {
                int iZaa2 = zaa(i7);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i10 = 1;
                }
            } else {
                i10 = i11;
            }
        }
        return getEntry(iZaa, i10);
    }

    @Nullable
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @NonNull
    @KeepForSdk
    public abstract T getEntry(int i7, int i10);

    @NonNull
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i7) {
        if (i7 >= 0 && i7 < this.zab.size()) {
            return ((Integer) this.zab.get(i7)).intValue();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 42);
        sb2.append("Position ");
        sb2.append(i7);
        sb2.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb2.toString());
    }
}
