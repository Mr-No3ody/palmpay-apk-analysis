package com.transsnet.palmpay.custom_view;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1554l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        PinEntryView.SavedState savedState = new PinEntryView.SavedState(parcel);
        savedState.f31094a = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new PinEntryView.SavedState[i7];
    }
}
