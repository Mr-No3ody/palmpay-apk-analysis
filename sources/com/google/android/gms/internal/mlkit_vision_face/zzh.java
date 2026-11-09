package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "FaceSettingsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field(id = 2)
    public int zza;

    @SafeParcelable.Field(id = 3)
    public int zzb;

    @SafeParcelable.Field(id = 4)
    public int zzc;

    @SafeParcelable.Field(id = 5)
    public boolean zzd;

    @SafeParcelable.Field(id = 6)
    public boolean zze;

    @SafeParcelable.Field(defaultValue = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, id = 7)
    public float zzf;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 2) int i7, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) boolean z8, @SafeParcelable.Param(id = 7) float f10) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z3;
        this.zze = z8;
        this.zzf = f10;
    }
}
