package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "FaceParcelCreator")
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final float zzc;

    @SafeParcelable.Field(id = 4)
    public final float zzd;

    @SafeParcelable.Field(id = 5)
    public final float zze;

    @SafeParcelable.Field(id = 6)
    public final float zzf;

    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 7)
    public final float zzg;

    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 8)
    public final float zzh;

    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 14)
    public final float zzi;

    @SafeParcelable.Field(id = 9)
    public final zzn[] zzj;

    @SafeParcelable.Field(id = 10)
    public final float zzk;

    @SafeParcelable.Field(id = 11)
    public final float zzl;

    @SafeParcelable.Field(id = 12)
    public final float zzm;

    @SafeParcelable.Field(id = 13)
    public final zzd[] zzn;

    @SafeParcelable.Field(defaultValue = "-1.0f", id = 15)
    public final float zzo;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) float f10, @SafeParcelable.Param(id = 4) float f11, @SafeParcelable.Param(id = 5) float f12, @SafeParcelable.Param(id = 6) float f13, @SafeParcelable.Param(id = 7) float f14, @SafeParcelable.Param(id = 8) float f15, @SafeParcelable.Param(id = 14) float f16, @SafeParcelable.Param(id = 9) zzn[] zznVarArr, @SafeParcelable.Param(id = 10) float f17, @SafeParcelable.Param(id = 11) float f18, @SafeParcelable.Param(id = 12) float f19, @SafeParcelable.Param(id = 13) zzd[] zzdVarArr, @SafeParcelable.Param(id = 15) float f20) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = f12;
        this.zzf = f13;
        this.zzg = f14;
        this.zzh = f15;
        this.zzi = f16;
        this.zzj = zznVarArr;
        this.zzk = f17;
        this.zzl = f18;
        this.zzm = f19;
        this.zzn = zzdVarArr;
        this.zzo = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzh);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzj, i7, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 11, this.zzl);
        SafeParcelWriter.writeFloat(parcel, 12, this.zzm);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.zzn, i7, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.zzi);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
