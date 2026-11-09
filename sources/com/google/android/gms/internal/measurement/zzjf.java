package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
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
@SafeParcelable.Class(creator = "ConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new zzjg();

    @SafeParcelable.Field(id = 2)
    public final int zza;

    @SafeParcelable.Field(id = 3)
    public final zzjo[] zzb;

    @SafeParcelable.Field(id = 4)
    public final String[] zzc;
    public final Map zzd = new TreeMap();

    @SafeParcelable.Constructor
    public zzjf(@SafeParcelable.Param(id = 2) int i7, @SafeParcelable.Param(id = 3) zzjo[] zzjoVarArr, @SafeParcelable.Param(id = 4) String[] strArr) {
        this.zza = i7;
        this.zzb = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.zzd.put(zzjoVar.zza, zzjoVar);
        }
        this.zzc = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.zza - zzjfVar.zza;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzjf) {
            zzjf zzjfVar = (zzjf) obj;
            if (this.zza == zzjfVar.zza && zzkl.zza(this.zzd, zzjfVar.zzd) && Arrays.equals(this.zzc, zzjfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.zza);
        sb2.append(", (");
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            sb2.append((zzjo) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.zzc;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append(BuildConfig.TRAVIS);
        }
        sb2.append("))");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i10);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzb, i7, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
