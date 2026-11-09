package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.airbnb.lottie.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1316h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.f19587a = parcel.readString();
        savedState.f19589c = parcel.readFloat();
        savedState.f19590d = parcel.readInt() == 1;
        savedState.f19591e = parcel.readString();
        savedState.f19592f = parcel.readInt();
        savedState.f19593g = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new LottieAnimationView.SavedState[i7];
    }
}
