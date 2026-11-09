package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final long zzc;

    @Nullable
    @SafeParcelable.Field(id = 4)
    public final Long zzd;

    @Nullable
    @SafeParcelable.Field(id = 6)
    public final String zze;

    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzpl(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j6, @Nullable @SafeParcelable.Param(id = 4) Long l5, @SafeParcelable.Param(id = 5) Float f10, @Nullable @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @Nullable @SafeParcelable.Param(id = 8) Double d2) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = j6;
        this.zzd = l5;
        this.zzg = i7 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d2;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        zzpm.zza(this, parcel, i7);
    }

    @Nullable
    public final Object zza() {
        Long l5 = this.zzd;
        if (l5 != null) {
            return l5;
        }
        Double d2 = this.zzg;
        if (d2 != null) {
            return d2;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(zzpn zzpnVar) {
        this(zzpnVar.zzc, zzpnVar.zzd, zzpnVar.zze, zzpnVar.zzb);
    }

    public zzpl(String str, long j6, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j6;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
