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
@SafeParcelable.Class(creator = "GenericDimensionCreator")
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjv();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzju(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = i7;
        this.zzb = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zzju) && compareTo((zzju) obj) == 0;
    }

    public final int hashCode() {
        return (this.zza * 31) + this.zzb;
    }

    public final String toString() {
        int i7 = this.zza;
        int length = String.valueOf(i7).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i10).length() + 1);
        sb2.append("GenericDimension(");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzju zzjuVar) {
        int i7 = this.zza;
        int i10 = zzjuVar.zza;
        if (i7 < i10) {
            return -1;
        }
        if (i7 > i10) {
            return 1;
        }
        int i11 = this.zzb;
        int i12 = zzjuVar.zzb;
        if (i11 < i12) {
            return -1;
        }
        return i11 > i12 ? 1 : 0;
    }
}
