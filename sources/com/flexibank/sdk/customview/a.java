package com.flexibank.sdk.customview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        FlexiBankPinEntryView.SavedState savedState = new FlexiBankPinEntryView.SavedState(in);
        savedState.f22178a = in.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new FlexiBankPinEntryView.SavedState[i7];
    }
}
