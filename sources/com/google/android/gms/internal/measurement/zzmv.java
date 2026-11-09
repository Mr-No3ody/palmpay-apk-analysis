package com.google.android.gms.internal.measurement;

import androidx.camera.camera2.internal.F;
import com.google.common.base.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmv implements Comparable {
    final long zza;
    final String zzb;
    final int zzc;
    final long zzd;
    final Object zze;
    private final RuntimeException zzf;

    public zzmv(long j6, String str, int i7, long j10, Object obj) {
        Preconditions.checkArgument(((j6 > 0L ? 1 : (j6 == 0L ? 0 : -1)) == 0) == (str != null));
        this.zza = j6;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = j10;
        this.zze = obj;
        if (i7 != 5) {
            this.zzf = null;
            return;
        }
        if (obj == null) {
            this.zzf = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.zzf = null;
        } else {
            this.zzf = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j6 = zzmvVar.zza;
        long j10 = this.zza;
        int iCompare = Long.compare(j10, j6);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j10 != 0) {
            return 0;
        }
        return ((String) Preconditions.checkNotNull(this.zzb)).compareTo((String) Preconditions.checkNotNull(zzmvVar.zzb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.zza == zzmvVar.zza && Objects.equals(this.zzb, zzmvVar.zzb);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strZza = zza();
        String strValueOf = String.valueOf(zzb());
        return F.d(new StringBuilder(String.valueOf(strZza).length() + 1 + strValueOf.length()), strZza, ":", strValueOf);
    }

    public final String zza() {
        String str = this.zzb;
        return str != null ? str : Long.toString(this.zza);
    }

    public final Object zzb() {
        int i7 = this.zzc;
        if (i7 == 0) {
            return Boolean.FALSE;
        }
        if (i7 == 1) {
            return Boolean.TRUE;
        }
        if (i7 == 2) {
            return Long.valueOf(this.zzd);
        }
        if (i7 == 3) {
            return Double.valueOf(Double.longBitsToDouble(this.zzd));
        }
        if (i7 == 4) {
            Object obj = this.zze;
            Preconditions.checkNotNull(obj);
            return obj;
        }
        if (i7 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        Object obj2 = this.zze;
        Preconditions.checkNotNull(obj2);
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((zzacr) obj2).zzm();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.zzf;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }
}
