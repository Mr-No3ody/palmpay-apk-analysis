package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzacu extends zzacv {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzacu(InputStream inputStream, int i7, byte[] bArr) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = inputStream;
        this.zzf = new byte[i7 < 8 ? 8 : i7];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzB() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i10 = this.zzk + i7;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i7 - i12;
    }

    private final void zzC(int i7) throws IOException {
        if (zzI(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzI(int i7) throws IOException {
        int i10 = this.zzi;
        int i11 = i10 + i7;
        int i12 = this.zzg;
        if (i11 <= i12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i7);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i13 = this.zzk;
        if (i7 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i7 > this.zzl) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzk + i10;
            this.zzk = i13;
            i12 = this.zzg - i10;
            this.zzg = i12;
            this.zzi = 0;
        }
        InputStream inputStream = this.zze;
        byte[] bArr2 = this.zzf;
        try {
            int i14 = inputStream.read(bArr2, i12, Math.min(bArr2.length - i12, (Integer.MAX_VALUE - i13) - i12));
            if (i14 != 0 && i14 >= -1 && i14 <= this.zzf.length) {
                if (i14 <= 0) {
                    return false;
                }
                this.zzg += i14;
                zzB();
                return this.zzg >= i7 || zzI(i7);
            }
            String strValueOf = String.valueOf(this.zze.getClass());
            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + strValueOf.length() + 39 + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i14);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzJ(int i7, boolean z3) throws IOException {
        byte[] bArrZzU = zzU(i7);
        if (bArrZzU != null) {
            return bArrZzU;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzU(int i7) throws IOException {
        if (i7 == 0) {
            return zzaed.zza;
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i7;
        if ((-2147483647) + i12 > 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzL((i13 - i10) - i11);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.zzg - i11;
        int i15 = i7 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zze.available()) {
                    return null;
                }
            } catch (zzaeh e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i7) {
            try {
                int i16 = this.zze.read(bArr, i14, i7 - i14);
                if (i16 == -1) {
                    throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i16;
                i14 += i16;
            } catch (zzaeh e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    private final List zzV(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                try {
                    int i11 = this.zze.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.zzk += i11;
                    i10 += i11;
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final byte zzA() throws IOException {
        if (this.zzi == this.zzg) {
            zzC(1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i7) throws zzaeh {
        if (i7 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.zzk + this.zzi + i7;
        if (i10 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i10;
        zzB();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i7) {
        this.zzl = i7;
        zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i7 = this.zzl;
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7 - (this.zzk + this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() throws IOException {
        return this.zzi == this.zzg && !zzI(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i7, int i10) throws IOException {
        zzacv.zzT(bArr, i7, i10);
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i13 > 0) {
            int iMin = Math.min(i10, i13);
            System.arraycopy(this.zzf, this.zzi, bArr, i7, iMin);
            this.zzi += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i10, (this.zzl - this.zzk) - i12);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i14 = this.zze.read(bArr, i7, iMin2);
            if (i14 != -1) {
                this.zzk += i14;
            }
            return i14;
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i7) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.zzi = i11 + i7;
            return;
        }
        if (i7 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.zzk;
        int i14 = i13 + i11;
        int i15 = this.zzl;
        if (i14 + i7 > i15) {
            zzL((i15 - i13) - i11);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i14;
        this.zzg = 0;
        this.zzi = 0;
        while (i12 < i7) {
            try {
                long j6 = i7 - i12;
                try {
                    long jSkip = this.zze.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        String strValueOf = String.valueOf(this.zze.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th) {
                this.zzk += i12;
                zzB();
                throw th;
            }
        }
        this.zzk += i12;
        zzB();
        if (i12 >= i7) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        zzC(1);
        while (true) {
            int i18 = i7 - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
                zzC(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws IOException {
        if (zzG()) {
            this.zzj = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzj = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i7) throws zzaeh {
        if (this.zzj != i7) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i7) throws IOException {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zzA() < 0) {
                        i11++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i10 == 1) {
            zzL(8);
            return true;
        }
        if (i10 == 2) {
            zzL(zzx());
            return true;
        }
        if (i10 == 3) {
            zzQ();
            zzb(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            zzP();
            return false;
        }
        if (i10 != 5) {
            throw new zzaeg("Protocol message tag had invalid wire type.");
        }
        zzL(4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzf() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzg() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzh() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() throws IOException {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i7 = this.zzg;
            int i10 = this.zzi;
            if (iZzx <= i7 - i10) {
                String str = new String(this.zzf, i10, iZzx, StandardCharsets.UTF_8);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzx > this.zzg) {
            return new String(zzJ(iZzx, false), StandardCharsets.UTF_8);
        }
        zzC(iZzx);
        String str2 = new String(this.zzf, this.zzi, iZzx, StandardCharsets.UTF_8);
        this.zzi += iZzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws IOException {
        byte[] bArrZzJ;
        int iZzx = zzx();
        int i7 = this.zzi;
        int i10 = this.zzg;
        if (iZzx <= i10 - i7 && iZzx > 0) {
            bArrZzJ = this.zzf;
            this.zzi = i7 + iZzx;
        } else {
            if (iZzx == 0) {
                return "";
            }
            if (iZzx < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i7 = 0;
            if (iZzx <= i10) {
                zzC(iZzx);
                bArrZzJ = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZzJ = zzJ(iZzx, false);
            }
        }
        return zzagl.zzd(bArrZzJ, i7, iZzx);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() throws IOException {
        int iZzx = zzx();
        int i7 = this.zzg;
        int i10 = this.zzi;
        if (iZzx <= i7 - i10 && iZzx > 0) {
            zzacr zzacrVarZzk = zzacr.zzk(this.zzf, i10, iZzx, false);
            this.zzi += iZzx;
            return zzacrVarZzk;
        }
        if (iZzx == 0) {
            return zzacr.zza;
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzU = zzU(iZzx);
        if (bArrZzU != null) {
            return zzacr.zzk(bArrZzU, 0, bArrZzU.length, false);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(iZzx - i13);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        try {
            return zzacr.zzl(bArr, false);
        } catch (zzaeh e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() throws IOException {
        int iZzx = zzx();
        int i7 = this.zzg;
        int i10 = this.zzi;
        if (iZzx > i7 - i10 || iZzx <= 0) {
            if (iZzx >= 0) {
                return zzJ(iZzx, false);
            }
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzf, i10, i10 + iZzx);
        this.zzi += iZzx;
        return bArrCopyOfRange;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() throws IOException {
        return zzacv.zzR(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() throws IOException {
        return zzacv.zzS(zzz());
    }

    public final long zzv() throws IOException {
        long j6 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzA = zzA();
            j6 |= ((long) (bZzA & Ascii.DEL)) << i7;
            if ((bZzA & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j6;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzw() throws IOException {
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            zzC(4);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        int i10 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        int i11 = bArr[i7 + 1] & UnsignedBytes.MAX_VALUE;
        int i12 = bArr[i7 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() throws IOException {
        int i7;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.zzi = i12;
                return b7;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b7;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << Ascii.FS)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return i7;
            }
        }
        return (int) zzv();
    }

    public final long zzy() throws IOException {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            zzC(8);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        long j6 = bArr[i7];
        long j10 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j11 = bArr[i7 + 2];
        long j12 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 6]) & 255) << 48) | (j6 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() throws IOException {
        long j6;
        long j10;
        long j11;
        int i7 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i7) {
            byte[] bArr = this.zzf;
            int i11 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzi = i11;
                return b7;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b7;
                if (i13 < 0) {
                    j6 = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j6 = i15 ^ 16256;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            long j12 = (-2080896) ^ i17;
                            i12 = i16;
                            j6 = j12;
                        } else {
                            i14 = i7 + 5;
                            long j13 = (((long) bArr[i16]) << 28) ^ ((long) i17);
                            if (j13 >= 0) {
                                j6 = j13 ^ 266354560;
                            } else {
                                i12 = i7 + 6;
                                long j14 = (((long) bArr[i14]) << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i18 = i7 + 7;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 42);
                                    if (j15 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i12 = i7 + 8;
                                        j14 = j15 ^ (((long) bArr[i18]) << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i18 = i7 + 9;
                                            j15 = j14 ^ (((long) bArr[i12]) << 56);
                                            if (j15 >= 0) {
                                                j10 = 71499008037633920L;
                                            } else {
                                                i12 = i7 + 10;
                                                long j16 = j15 ^ (((long) bArr[i18]) << 63);
                                                if (j16 >= 0) {
                                                    j6 = j16 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j6 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j6 = j14 ^ j11;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return j6;
            }
        }
        return zzv();
    }
}
