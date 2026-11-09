package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FlagOverridesCreator")
@SafeParcelable.Reserved({1})
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = new zzjt();

    @SafeParcelable.Field(id = 2)
    public final List zza;

    @SafeParcelable.Constructor
    public zzjs(@SafeParcelable.Param(id = 2) List list) {
        this.zza = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjs) {
            return this.zza.equals(((zzjs) obj).zza);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlagOverrides(");
        boolean z3 = true;
        for (zzjq zzjqVar : this.zza) {
            if (!z3) {
                sb2.append(", ");
            }
            zzjqVar.zza(sb2);
            z3 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
