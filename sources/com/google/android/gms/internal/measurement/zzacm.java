package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzacm extends zzacp {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzacm(byte[] bArr, int i7, int i10) {
        super(null);
        zzacr.zzn(i7, i7 + i10, bArr.length);
        this.zzb = bArr;
        this.zzc = i7;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte zza(int i7) {
        return this.zzb[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacr zzc(int i7, int i10) {
        int iZzn = zzacr.zzn(i7, i10, this.zzd);
        return iZzn == 0 ? zzacr.zza : new zzacm(this.zzb, this.zzc + i7, iZzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zzd(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zze(zzacj zzacjVar) throws IOException {
        zzacjVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean zzf(zzacr zzacrVar) {
        boolean z3 = zzacrVar instanceof zzacq;
        if (!z3 && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.zzf(this);
        }
        int i7 = this.zzd;
        if (i7 > zzacrVar.zzb()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 18 + String.valueOf(i7).length());
            sb2.append("Length too large: ");
            sb2.append(i7);
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i7 <= zzacrVar.zzb()) {
            if (z3) {
                return zzacr.zzo(this.zzb, this.zzc, ((zzacq) zzacrVar).zzh(), 0, i7);
            }
            if (zzacrVar instanceof zzacm) {
                zzacm zzacmVar = (zzacm) zzacrVar;
                return zzacr.zzo(this.zzb, this.zzc, zzacmVar.zzb, zzacmVar.zzc, i7);
            }
            zzacr zzacrVarZzc = zzacrVar.zzc(0, i7);
            int i10 = this.zzc;
            return zzacrVarZzc.equals(zzc(i10, i7 + i10));
        }
        int iZzb = zzacrVar.zzb();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 27 + String.valueOf(iZzb).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(i7);
        sb3.append(", ");
        sb3.append(iZzb);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzg(int i7, int i10, int i11) {
        return zzaed.zzb(i7, this.zzb, this.zzc, i11);
    }

    public final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }

    public final /* synthetic */ int zzi() {
        return this.zzc;
    }
}
