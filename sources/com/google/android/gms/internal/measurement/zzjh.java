package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConfigurationsCreator")
@SafeParcelable.Reserved({1})
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzji();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @Nullable
    @SafeParcelable.Field(id = 6)
    public final byte[] zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public final zzjf[] zzd;
    public final Map zze = new TreeMap();

    @SafeParcelable.Field(id = 5)
    public final boolean zzf;

    @SafeParcelable.Field(id = 7)
    public final long zzg;

    @SafeParcelable.Constructor
    public zzjh(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzjf[] zzjfVarArr, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) @Nullable byte[] bArr, @SafeParcelable.Param(id = 7) long j6) {
        this.zza = str;
        this.zzc = str2;
        this.zzd = zzjfVarArr;
        this.zzf = z3;
        this.zzb = bArr;
        this.zzg = j6;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.zze.put(Integer.valueOf(zzjfVar.zza), zzjfVar);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzjh) {
            zzjh zzjhVar = (zzjh) obj;
            if (zzkl.zza(this.zza, zzjhVar.zza) && zzkl.zza(this.zzc, zzjhVar.zzc) && this.zze.equals(zzjhVar.zze) && this.zzf == zzjhVar.zzf && Arrays.equals(this.zzb, zzjhVar.zzb) && this.zzg == zzjhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zze, Boolean.valueOf(this.zzf), this.zzb, Long.valueOf(this.zzg)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.zza);
        sb2.append("', '");
        sb2.append(this.zzc);
        sb2.append("', (");
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            sb2.append((zzjf) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.zzf);
        sb2.append(", ");
        byte[] bArr = this.zzb;
        sb2.append(bArr == null ? BuildConfig.TRAVIS : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.zzg);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i7, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzf);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzb, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
