package com.palmpay.lib.liveness.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new LiveIDResult.Error((Throwable) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new LiveIDResult.Error[i7];
    }
}
