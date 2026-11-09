package com.google.android.material.stateful;

import M.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ExtendableSavedState[] newArray(int i7) {
            return new ExtendableSavedState[i7];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @Nullable
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }
    };

    @NonNull
    public final n extendableStates;

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        int i10 = this.extendableStates.f5695c;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = (String) this.extendableStates.f(i11);
            bundleArr[i11] = (Bundle) this.extendableStates.j(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new n(0);
    }

    private ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i7 = parcel.readInt();
        String[] strArr = new String[i7];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i7];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new n(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            this.extendableStates.put(strArr[i10], bundleArr[i10]);
        }
    }
}
