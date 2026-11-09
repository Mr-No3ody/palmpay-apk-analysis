package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzacz extends zzada {
    private final byte[] zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private final OutputStream zzg;

    public zzacz(OutputStream outputStream, int i7) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i7, 20)];
        this.zzc = bArr;
        this.zzd = bArr.length;
    }

    private final void zzJ(int i7) throws IOException {
        if (this.zzd - this.zze < i7) {
            zzK();
        }
    }

    private final void zzK() throws IOException {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    public final void zzA(long j6) {
        if (zzada.zzc) {
            long j10 = this.zze;
            while (true) {
                int i7 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    byte[] bArr = this.zzc;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzagg.zzo(bArr, i10, (byte) i7);
                    this.zzf += (int) (((long) this.zze) - j10);
                    return;
                }
                byte[] bArr2 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzagg.zzo(bArr2, i11, (byte) (i7 | 128));
                j6 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    byte[] bArr3 = this.zzc;
                    int i13 = this.zze;
                    this.zze = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzf++;
                    return;
                }
                byte[] bArr4 = this.zzc;
                int i14 = this.zze;
                this.zze = i14 + 1;
                bArr4[i14] = (byte) (i12 | 128);
                this.zzf++;
                j6 >>>= 7;
            }
        }
    }

    public final void zzB(int i7) {
        int i10 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i10] = (byte) i7;
        bArr[i10 + 1] = (byte) (i7 >> 8);
        bArr[i10 + 2] = (byte) (i7 >> 16);
        bArr[i10 + 3] = (byte) (i7 >> 24);
        this.zze = i10 + 4;
        this.zzf += 4;
    }

    public final void zzC(long j6) {
        int i7 = this.zze;
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
        this.zzf += 8;
    }

    public final void zzD(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.zzd;
        int i12 = this.zze;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, this.zzc, i12, i10);
            this.zze += i10;
            this.zzf += i10;
            return;
        }
        byte[] bArr2 = this.zzc;
        System.arraycopy(bArr, i7, bArr2, i12, i13);
        int i14 = i7 + i13;
        this.zze = i11;
        this.zzf += i13;
        zzK();
        int i15 = i10 - i13;
        if (i15 <= i11) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.zze = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzf += i15;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void zza(byte[] bArr, int i7, int i10) throws IOException {
        zzD(bArr, i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i7, int i10) throws IOException {
        zzr((i7 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i7, int i10) throws IOException {
        zzJ(20);
        zzz(i7 << 3);
        if (i10 >= 0) {
            zzz(i10);
        } else {
            zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i7, int i10) throws IOException {
        zzJ(20);
        zzz(i7 << 3);
        zzz(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i7, int i10) throws IOException {
        zzJ(14);
        zzz((i7 << 3) | 5);
        zzB(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i7, long j6) throws IOException {
        zzJ(20);
        zzz(i7 << 3);
        zzA(j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i7, long j6) throws IOException {
        zzJ(18);
        zzz((i7 << 3) | 1);
        zzC(j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i7, boolean z3) throws IOException {
        zzJ(11);
        zzz(i7 << 3);
        zzv(z3 ? (byte) 1 : (byte) 0);
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
        zzD(bArr, 0, i10);
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
        if (this.zze == this.zzd) {
            zzK();
        }
        zzv(b7);
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
        zzJ(5);
        zzz(i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i7) throws IOException {
        zzJ(4);
        zzB(i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j6) throws IOException {
        zzJ(10);
        zzA(j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j6) throws IOException {
        zzJ(8);
        zzC(j6);
    }

    public final void zzv(byte b7) {
        byte[] bArr = this.zzc;
        int i7 = this.zze;
        bArr[i7] = b7;
        this.zze = i7 + 1;
        this.zzf++;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) throws IOException {
        int iZzb;
        int length = str.length() * 3;
        int iZzE = zzada.zzE(length);
        int i7 = iZzE + length;
        int i10 = this.zzd;
        if (i7 > i10) {
            byte[] bArr = new byte[length];
            int iZzc = zzagl.zzc(str, bArr, 0, length);
            zzr(iZzc);
            zzD(bArr, 0, iZzc);
            return;
        }
        if (i7 > i10 - this.zze) {
            zzK();
        }
        int iZzE2 = zzada.zzE(str.length());
        int i11 = this.zze;
        try {
            if (iZzE2 == iZzE) {
                int i12 = i11 + iZzE2;
                this.zze = i12;
                int iZzc2 = zzagl.zzc(str, this.zzc, i12, i10 - i12);
                this.zze = i11;
                iZzb = (iZzc2 - i11) - iZzE2;
                zzz(iZzb);
                this.zze = iZzc2;
            } else {
                iZzb = zzagl.zzb(str);
                zzz(iZzb);
                this.zze = zzagl.zzc(str, this.zzc, this.zze, iZzb);
            }
            this.zzf += iZzb;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zzacy(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzx() throws IOException {
        if (this.zze > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzz(int i7) {
        if (!zzada.zzc) {
            while ((i7 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) (i7 | 128);
                this.zzf++;
                i7 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            bArr2[i11] = (byte) i7;
            this.zzf++;
            return;
        }
        long j6 = this.zze;
        while ((i7 & (-128)) != 0) {
            byte[] bArr3 = this.zzc;
            int i12 = this.zze;
            this.zze = i12 + 1;
            zzagg.zzo(bArr3, i12, (byte) (i7 | 128));
            i7 >>>= 7;
        }
        byte[] bArr4 = this.zzc;
        int i13 = this.zze;
        this.zze = i13 + 1;
        zzagg.zzo(bArr4, i13, (byte) i7);
        this.zzf += (int) (((long) this.zze) - j6);
    }
}
