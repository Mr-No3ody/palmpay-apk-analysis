package com.shencoder.pagergridlayoutmanager;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        PagerGridLayoutManager.SavedState savedState = new PagerGridLayoutManager.SavedState();
        savedState.f25221d = -1;
        savedState.f25218a = parcel.readInt();
        savedState.f25219b = parcel.readInt();
        savedState.f25220c = parcel.readInt();
        savedState.f25221d = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new PagerGridLayoutManager.SavedState[i7];
    }
}
