package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @NonNull
        public ActivityTransition build() {
            Preconditions.checkState(this.zza != -1, "Activity type not set.");
            Preconditions.checkState(this.zzb != -1, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        }

        @NonNull
        public Builder setActivityTransition(int i7) {
            ActivityTransition.zza(i7);
            this.zzb = i7;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i7) {
            this.zza = i7;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = i7;
        this.zzb = i10;
    }

    public static void zza(int i7) {
        boolean z3 = false;
        if (i7 >= 0 && i7 <= 1) {
            z3 = true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 30);
        sb2.append("Transition type ");
        sb2.append(i7);
        sb2.append(" is not valid.");
        Preconditions.checkArgument(z3, sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        int i7 = this.zza;
        int length = String.valueOf(i7).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i10).length() + 1);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i7);
        sb2.append(", mTransitionType=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
