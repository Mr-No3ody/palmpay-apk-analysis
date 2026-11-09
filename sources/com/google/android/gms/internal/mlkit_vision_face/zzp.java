package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    @SafeParcelable.Field(id = 2)
    public int zza;

    @SafeParcelable.Field(id = 3)
    public int zzb;

    @SafeParcelable.Field(id = 4)
    public int zzc;

    @SafeParcelable.Field(id = 5)
    public long zzd;

    @SafeParcelable.Field(id = 6)
    public int zze;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 2) int i7, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) long j6, @SafeParcelable.Param(id = 6) int i12) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j6;
        this.zze = i12;
    }
}
