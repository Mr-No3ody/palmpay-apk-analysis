package com.google.android.gms.internal.measurement;

import androidx.camera.video.u;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzacx extends zzada {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzacx(byte[] bArr, int i7, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(u.h(length, "Array range is invalid. Buffer.length=", i10, ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void zza(byte[] bArr, int i7, int i10) throws IOException {
        zzv(bArr, i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i7, int i10) throws IOException {
        zzr((i7 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i7, int i10) throws IOException {
        zzr(i7 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i7, int i10) throws IOException {
        zzr(i7 << 3);
        zzr(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i7, int i10) throws IOException {
        zzr((i7 << 3) | 5);
        zzs(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i7, long j6) throws IOException {
        zzr(i7 << 3);
        zzt(j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i7, long j6) throws IOException {
        zzr((i7 << 3) | 1);
        zzu(j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i7, boolean z3) throws IOException {
        zzr(i7 << 3);
        zzp(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzi(int i7, String str) throws IOException {
        zzr((i7 << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzj(int i7, zzacr zzacrVar) throws IOException {
        zzr((i7 << 3) | 2);
        zzk(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzk(zzacr zzacrVar) throws IOException {
        zzr(zzacrVar.zzb());
        zzacrVar.zze(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzl(byte[] bArr, int i7, int i10) throws IOException {
        zzr(i10);
        zzv(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzm(int i7, zzafc zzafcVar) throws IOException {
        zzr(11);
        zzd(2, i7);
        zzr(26);
        zzo(zzafcVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzn(int i7, zzacr zzacrVar) throws IOException {
        zzr(11);
        zzd(2, i7);
        zzj(3, zzacrVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzo(zzafc zzafcVar) throws IOException {
        zzr(zzafcVar.zzcq());
        zzafcVar.zzcH(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzp(byte b7) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zze;
        try {
            int i10 = i7 + 1;
            try {
                this.zzc[i7] = b7;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i7 = i10;
                throw new zzacy(i7, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzq(int i7) throws IOException {
        if (i7 >= 0) {
            zzr(i7);
        } else {
            zzt(i7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzr(int i7) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i7 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i11 = i10;
                    throw new zzacy(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzacy(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zzc[i11] = (byte) i7;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i7) throws IOException {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = (byte) (i7 >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(i10, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j6) throws IOException {
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z3 = zzada.zzc;
        int i10 = this.zze;
        if (!z3 || this.zzd - i10 < 10) {
            while ((j6 & (-128)) != 0) {
                try {
                    int i11 = i10 + 1;
                    try {
                        this.zzc[i10] = (byte) (((int) j6) | 128);
                        j6 >>>= 7;
                        i10 = i11;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i10 = i11;
                        throw new zzacy(i10, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i7 = i10 + 1;
            try {
                this.zzc[i10] = (byte) j6;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i10 = i7;
                throw new zzacy(i10, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j6 & (-128)) != 0) {
                zzagg.zzo(this.zzc, i10, (byte) (((int) j6) | 128));
                j6 >>>= 7;
                i10++;
            }
            i7 = i10 + 1;
            zzagg.zzo(this.zzc, i10, (byte) j6);
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j6) throws IOException {
        int i7 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i7] = (byte) j6;
            bArr[i7 + 1] = (byte) (j6 >> 8);
            bArr[i7 + 2] = (byte) (j6 >> 16);
            bArr[i7 + 3] = (byte) (j6 >> 24);
            bArr[i7 + 4] = (byte) (j6 >> 32);
            bArr[i7 + 5] = (byte) (j6 >> 40);
            bArr[i7 + 6] = (byte) (j6 >> 48);
            bArr[i7 + 7] = (byte) (j6 >> 56);
            this.zze = i7 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(i7, this.zzd, 8, e10);
        }
    }

    public final void zzv(byte[] bArr, int i7, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i7, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(this.zze, this.zzd, i10, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) throws IOException {
        int i7 = this.zze;
        try {
            int iZzE = zzada.zzE(str.length() * 3);
            int iZzE2 = zzada.zzE(str.length());
            if (iZzE2 != iZzE) {
                zzr(zzagl.zzb(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzagl.zzc(str, bArr, i10, bArr.length - i10);
                return;
            }
            int i11 = i7 + iZzE2;
            this.zze = i11;
            byte[] bArr2 = this.zzc;
            int iZzc = zzagl.zzc(str, bArr2, i11, bArr2.length - i11);
            this.zze = i7;
            zzr((iZzc - i7) - iZzE2);
            this.zze = iZzc;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
