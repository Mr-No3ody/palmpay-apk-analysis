package com.google.android.gms.measurement.internal;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final zzbf zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final long zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    public zzbh(zzbh zzbhVar, long j6, long j10) {
        Preconditions.checkNotNull(zzbhVar);
        this.zza = zzbhVar.zza;
        this.zzb = zzbhVar.zzb;
        this.zzc = zzbhVar.zzc;
        this.zzd = j6;
        this.zze = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        u.x(sb2, "origin=", str, ",name=", str2);
        return G.r(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        zzbi.zza(this, parcel, i7);
    }

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzbf zzbfVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j6, @SafeParcelable.Param(id = 6) long j10) {
        this.zza = str;
        this.zzb = zzbfVar;
        this.zzc = str2;
        this.zzd = j6;
        this.zze = j10;
    }
}
