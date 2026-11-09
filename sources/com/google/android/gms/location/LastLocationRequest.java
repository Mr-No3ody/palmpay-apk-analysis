package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "LastLocationRequestCreator")
@SafeParcelable.Reserved({4})
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 5)
    private final ClientIdentity zzd;

    public static final class Builder {
        private long zza;
        private int zzb;
        private final boolean zzc;

        @Nullable
        private final ClientIdentity zzd;

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
        }

        @NonNull
        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        public Builder setGranularity(int i7) {
            zzq.zza(i7);
            this.zzb = i7;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j6) {
            Preconditions.checkArgument(j6 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j6;
            return this;
        }

        public Builder(@NonNull LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
            this.zzd = lastLocationRequest.zzb();
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j6, @SafeParcelable.Param(id = 2) int i7, @SafeParcelable.Param(id = 3) boolean z3, @Nullable @SafeParcelable.Param(id = 5) ClientIdentity clientIdentity) {
        this.zza = j6;
        this.zzb = i7;
        this.zzc = z3;
        this.zzd = clientIdentity;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd);
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sbS = u.s("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sbS.append("maxAge=");
            zzeo.zzc(this.zza, sbS);
        }
        if (this.zzb != 0) {
            sbS.append(", ");
            sbS.append(zzq.zzb(this.zzb));
        }
        if (this.zzc) {
            sbS.append(", bypass");
        }
        if (this.zzd != null) {
            sbS.append(", impersonation=");
            sbS.append(this.zzd);
        }
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Pure
    public final boolean zza() {
        return this.zzc;
    }

    @Nullable
    @Pure
    public final ClientIdentity zzb() {
        return this.zzd;
    }
}
