package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.identity.zzek;

/* JADX INFO: loaded from: classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 3;
        private long zzc = -1;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Geofence build() {
            if (this.zza == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i7 = this.zzb;
            if (i7 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i7 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.zzc == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.zzh >= 0) {
                return new zzek(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, to = 90.0d) double d2, @FloatRange(from = -180.0d, to = 180.0d) double d10, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
            boolean z3 = d2 >= -90.0d && d2 <= 90.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 18);
            sb2.append("Invalid latitude: ");
            sb2.append(d2);
            Preconditions.checkArgument(z3, sb2.toString());
            boolean z8 = d10 >= -180.0d && d10 <= 180.0d;
            StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 19);
            sb3.append("Invalid longitude: ");
            sb3.append(d10);
            Preconditions.checkArgument(z8, sb3.toString());
            boolean z10 = f10 > 0.0f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb4.append("Invalid radius: ");
            sb4.append(f10);
            Preconditions.checkArgument(z10, sb4.toString());
            this.zzd = (short) 1;
            this.zze = d2;
            this.zzf = d10;
            this.zzg = f10;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j6) {
            if (j6 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j6;
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i7) {
            this.zzi = i7;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i7) {
            this.zzh = i7;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i7) {
            this.zzb = i7;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
