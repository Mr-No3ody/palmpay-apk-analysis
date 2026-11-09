package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSparseArray>() { // from class: com.google.android.material.internal.ParcelableSparseArray.1
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseArray[] newArray(int i7) {
            return new ParcelableSparseArray[i7];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ParcelableSparseArray createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public ParcelableSparseArray createFromParcel(@NonNull Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }
    };

    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = keyAt(i10);
            parcelableArr[i10] = valueAt(i10);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }

    public ParcelableSparseArray(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        int i7 = parcel.readInt();
        int[] iArr = new int[i7];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < i7; i10++) {
            put(iArr[i10], parcelableArray[i10]);
        }
    }
}
