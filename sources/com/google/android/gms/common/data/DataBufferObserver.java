package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(@NonNull DataBufferObserver dataBufferObserver);

        void removeObserver(@NonNull DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i7, int i10);

    void onDataRangeInserted(int i7, int i10);

    void onDataRangeMoved(int i7, int i10, int i11);

    void onDataRangeRemoved(int i7, int i10);
}
