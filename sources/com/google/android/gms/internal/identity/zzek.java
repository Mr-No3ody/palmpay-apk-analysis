package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import java.util.Locale;
import p381za.c;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzek extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, getter = "getLoiteringDelay", id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzek(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i7, @SafeParcelable.Param(id = 3) short s3, @SafeParcelable.Param(id = 4) double d2, @SafeParcelable.Param(id = 5) double d10, @SafeParcelable.Param(id = 6) float f10, @SafeParcelable.Param(id = 2) long j6, @SafeParcelable.Param(id = 8) int i10, @SafeParcelable.Param(id = 9) int i11) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f10 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb2.append("invalid radius: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d2).length() + 18);
            sb3.append("invalid latitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d10 > 180.0d || d10 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(d10).length() + 19);
            sb4.append("invalid longitude: ");
            sb4.append(d10);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            throw new IllegalArgumentException(d0.n(i7, "No supported transition specified: ", new StringBuilder(String.valueOf(i7).length() + 35)));
        }
        this.zzc = s3;
        this.zza = str;
        this.zzd = d2;
        this.zze = d10;
        this.zzf = f10;
        this.zzb = j6;
        this.zzg = i12;
        this.zzh = i10;
        this.zzi = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.zzf == zzekVar.zzf && this.zzd == zzekVar.zzd && this.zze == zzekVar.zze && this.zzc == zzekVar.zzc && this.zzg == zzekVar.zzg) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.zzb;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.zzd;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.zzi;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.zze;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.zzf;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long j6 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) j6) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        short s3 = this.zzc;
        Locale locale = Locale.US;
        if (s3 != -1) {
            str = s3 != 1 ? c.UNKNOWN_PROCESS_NAME : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
