package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FlagOverrideCreator")
@SafeParcelable.Reserved({1})
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjr();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Field(id = 4)
    public final zzjo zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Constructor
    public zzjq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzjo zzjoVar, @SafeParcelable.Param(id = 5) boolean z3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzjoVar;
        this.zzd = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzkl.zza(this.zza, zzjqVar.zza) && zzkl.zza(this.zzb, zzjqVar.zzb) && zzkl.zza(this.zzc, zzjqVar.zzc) && this.zzd == zzjqVar.zzd;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        zza(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i7, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zza(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        this.zzc.zzf(sb2);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(")");
    }
}
