package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseIntArray createFromParcel(@NonNull Parcel parcel) {
            int i7 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i7);
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i10 = 0; i10 < i7; i10++) {
                parcelableSparseIntArray.put(iArr[i10], iArr2[i10]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseIntArray[] newArray(int i7) {
            return new ParcelableSparseIntArray[i7];
        }
    };

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i10 = 0; i10 < size(); i10++) {
            iArr[i10] = keyAt(i10);
            iArr2[i10] = valueAt(i10);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i7) {
        super(i7);
    }

    public ParcelableSparseIntArray(@NonNull SparseIntArray sparseIntArray) {
        for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
            put(sparseIntArray.keyAt(i7), sparseIntArray.valueAt(i7));
        }
    }
}
