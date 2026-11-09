package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityRequestCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 2)
    private final ClientIdentity zzb;

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) boolean z3, @Nullable @SafeParcelable.Param(id = 2) ClientIdentity clientIdentity) {
        this.zza = z3;
        this.zzb = clientIdentity;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.zza == zzadVar.zza && Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    public final String toString() {
        StringBuilder sbS = u.s("LocationAvailabilityRequest[");
        if (this.zza) {
            sbS.append("bypass, ");
        }
        if (this.zzb != null) {
            sbS.append("impersonation=");
            sbS.append(this.zzb);
            sbS.append(", ");
        }
        sbS.setLength(sbS.length() - 2);
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z3);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
