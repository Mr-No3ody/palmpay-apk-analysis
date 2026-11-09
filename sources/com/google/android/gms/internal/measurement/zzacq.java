package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzacq extends zzacp {
    private final byte[] zzb;

    public zzacq(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte zza(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacr zzc(int i7, int i10) {
        byte[] bArr = this.zzb;
        int iZzn = zzacr.zzn(0, i10, bArr.length);
        return iZzn == 0 ? zzacr.zza : new zzacm(bArr, 0, iZzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zzd(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zzb, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void zze(zzacj zzacjVar) throws IOException {
        byte[] bArr = this.zzb;
        zzacjVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean zzf(zzacr zzacrVar) {
        boolean z3 = zzacrVar instanceof zzacq;
        if (z3) {
            return Arrays.equals(this.zzb, ((zzacq) zzacrVar).zzb);
        }
        boolean z8 = zzacrVar instanceof zzacm;
        if (!z8) {
            return zzacrVar.zzf(this);
        }
        byte[] bArr = this.zzb;
        int iZzb = zzacrVar.zzb();
        int length = bArr.length;
        if (length > iZzb) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length <= zzacrVar.zzb()) {
            if (z3) {
                return zzacr.zzo(bArr, 0, ((zzacq) zzacrVar).zzb, 0, length);
            }
            if (!z8) {
                return zzacrVar.zzc(0, length).equals(zzc(0, length));
            }
            zzacm zzacmVar = (zzacm) zzacrVar;
            return zzacr.zzo(bArr, 0, zzacmVar.zzh(), zzacmVar.zzi(), length);
        }
        int iZzb2 = zzacrVar.zzb();
        StringBuilder sb3 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(iZzb2).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(length);
        sb3.append(", ");
        sb3.append(iZzb2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzg(int i7, int i10, int i11) {
        return zzaed.zzb(i7, this.zzb, 0, i11);
    }

    public final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }
}
