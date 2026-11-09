package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) long j6, @SafeParcelable.Param(id = 4) long j10) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = j6;
        this.zzd = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc));
    }

    public final String toString() {
        int i7 = this.zza;
        int length = String.valueOf(i7).length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        long j6 = this.zzd;
        int length3 = String.valueOf(j6).length();
        long j10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j10).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i7);
        sb2.append(" Cell status: ");
        sb2.append(i10);
        u.v(sb2, " elapsed time NS: ", j6, " system time ms: ");
        sb2.append(j10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
