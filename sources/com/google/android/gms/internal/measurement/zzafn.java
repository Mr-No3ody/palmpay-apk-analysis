package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzafn implements zzaez {
    private final zzafc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzafn(zzafc zzafcVar, String str, Object[] objArr) {
        this.zza = zzafcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.zzd = i7 | (cCharAt2 << i11);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final zzafc zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final int zzc() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
