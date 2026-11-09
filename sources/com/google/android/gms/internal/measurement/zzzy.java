package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzzy extends zzaaa {
    private final zzzj zza;
    private final zzzj zzb;
    private final int[] zzc;
    private final int zzd;

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    public /* synthetic */ zzzy(zzzj zzzjVar, zzzj zzzjVar2, byte[] bArr) {
        super(null);
        this.zza = zzzjVar;
        this.zzb = zzzjVar2;
        int iZza = zzzjVar2.zza();
        zzabr.zzb(iZza <= 28, "metadata size too large");
        int[] iArr = new int[iZza];
        this.zzc = iArr;
        long j6 = 0;
        int i7 = 0;
        int i10 = 0;
        while (i7 < iArr.length) {
            zzyl zzylVarZzd = zzd(i7);
            long jZzi = zzylVarZzd.zzi() | j6;
            if (jZzi == j6) {
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        i11 = -1;
                        break;
                    } else if (zzylVarZzd.equals(zzd(iArr[i11] & 31))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    iArr[i11] = zzylVarZzd.zzf() ? iArr[i11] | (1 << (i7 + 4)) : i7;
                } else {
                    iArr[i10] = i7;
                    i10++;
                }
            } else {
                iArr[i10] = i7;
                i10++;
            }
            i7++;
            j6 = jZzi;
        }
        this.zzd = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzyl zzd(int i7) {
        zzzj zzzjVar = this.zza;
        int iZza = zzzjVar.zza();
        return i7 >= iZza ? this.zzb.zzb(i7 - iZza) : zzzjVar.zzb(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final Object zze(int i7) {
        zzzj zzzjVar = this.zza;
        int iZza = zzzjVar.zza();
        return i7 >= iZza ? this.zzb.zzc(i7 - iZza) : zzzjVar.zzc(i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void zza(zzzq zzzqVar, Object obj) {
        for (int i7 = 0; i7 < this.zzd; i7++) {
            int i10 = this.zzc[i7];
            zzyl zzylVarZzd = zzd(i10 & 31);
            if (zzylVarZzd.zzf()) {
                zzzqVar.zzb(zzylVarZzd, new zzzx(this, zzylVarZzd, i10, null), obj);
            } else {
                zzzqVar.zza(zzylVarZzd, zzylVarZzd.zze(zze(i10)), obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set zzc() {
        return new zzzw(this);
    }

    public final /* synthetic */ int[] zzf() {
        return this.zzc;
    }

    public final /* synthetic */ int zzg() {
        return this.zzd;
    }
}
