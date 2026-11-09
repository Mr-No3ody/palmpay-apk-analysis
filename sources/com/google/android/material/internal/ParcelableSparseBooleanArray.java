package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: com.google.android.material.internal.ParcelableSparseBooleanArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseBooleanArray createFromParcel(@NonNull Parcel parcel) {
            int i7 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i7);
            int[] iArr = new int[i7];
            boolean[] zArr = new boolean[i7];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i10 = 0; i10 < i7; i10++) {
                parcelableSparseBooleanArray.put(iArr[i10], zArr[i10]);
            }
            return parcelableSparseBooleanArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseBooleanArray[] newArray(int i7) {
            return new ParcelableSparseBooleanArray[i7];
        }
    };

    public ParcelableSparseBooleanArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i10 = 0; i10 < size(); i10++) {
            iArr[i10] = keyAt(i10);
            zArr[i10] = valueAt(i10);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ParcelableSparseBooleanArray(int i7) {
        super(i7);
    }

    public ParcelableSparseBooleanArray(@NonNull SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            put(sparseBooleanArray.keyAt(i7), sparseBooleanArray.valueAt(i7));
        }
    }
}
