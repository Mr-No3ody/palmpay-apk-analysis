package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DogfoodsTokenCreator")
@SafeParcelable.Reserved({1})
public final class zzjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjj> CREATOR = new zzjk();

    @SafeParcelable.Field(id = 2)
    public final byte[] zza;

    @SafeParcelable.Constructor
    public zzjj(@SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] bArr = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
