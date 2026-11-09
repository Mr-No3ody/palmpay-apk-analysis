package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzacs extends zzacv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzacs(byte[] bArr, int i7, int i10, boolean z3, byte[] bArr2) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzU() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i10 = this.zzj;
        if (i7 <= i10) {
            this.zzg = 0;
            return;
        }
        int i11 = i7 - i10;
        this.zzg = i11;
        this.zzf = i7 - i11;
    }

    public final long zzA() throws IOException {
        long j6 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzI = zzI();
            j6 |= ((long) (bZzI & Ascii.DEL)) << i7;
            if ((bZzI & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j6;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzB() throws IOException {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        int i10 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        int i11 = bArr[i7 + 1] & UnsignedBytes.MAX_VALUE;
        int i12 = bArr[i7 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long zzC() throws IOException {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        long j6 = bArr[i7];
        long j10 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j11 = bArr[i7 + 2];
        long j12 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 6]) & 255) << 48) | (j6 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i7) throws zzaeh {
        if (i7 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i7 + this.zzh;
        if (i10 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzj;
        if (i10 > i11) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i10;
        zzU();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i7) {
        this.zzj = i7;
        zzU();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i7 = this.zzj;
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7 - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzh;
    }

    public final byte zzI() throws IOException {
        int i7 = this.zzh;
        if (i7 == this.zzf) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    public final byte[] zzJ(int i7) throws IOException {
        if (i7 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i7 <= i10 - i11) {
                int i12 = i7 + i11;
                this.zzh = i12;
                return Arrays.copyOfRange(this.zze, i11, i12);
            }
        }
        if (i7 > 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i7 == 0) {
            return zzaed.zza;
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i7, int i10) throws IOException {
        zzacv.zzT(bArr, i7, i10);
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, this.zzf - this.zzh);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.zze, this.zzh, bArr, i7, iMin);
        this.zzh += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i7) throws IOException {
        if (i7 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i7 <= i10 - i11) {
                this.zzh = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws IOException {
        if (zzG()) {
            this.zzi = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzi = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i7) throws zzaeh {
        if (this.zzi != i7) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i7) throws IOException {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zzI() < 0) {
                        i11++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
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
            zzL(zzv());
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
        return Double.longBitsToDouble(zzC());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzB());
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
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() throws IOException {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() throws IOException {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() throws IOException {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (iZzv <= i7 - i10) {
                String str = new String(this.zze, i10, iZzv, StandardCharsets.UTF_8);
                this.zzh += iZzv;
                return str;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (iZzv <= i7 - i10) {
                String strZzd = zzagl.zzd(this.zze, i10, iZzv);
                this.zzh += iZzv;
                return strZzd;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (iZzv <= i7 - i10) {
                zzacr zzacrVarZzk = zzacr.zzk(this.zze, i10, iZzv, false);
                this.zzh += iZzv;
                return zzacrVarZzk;
            }
        }
        return iZzv == 0 ? zzacr.zza : zzacr.zzl(zzJ(iZzv), false);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() throws IOException {
        return zzJ(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() throws IOException {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() throws IOException {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() throws IOException {
        return zzacv.zzR(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() throws IOException {
        return zzacv.zzS(zzz());
    }

    public abstract int zzv() throws IOException;

    public abstract int zzw() throws IOException;

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() throws IOException {
        return zzw();
    }

    public final int zzy() throws IOException {
        int i7;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
                return i7;
            }
        }
        return (int) zzA();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() throws IOException {
        long j6;
        long j10;
        long j11;
        int i7 = this.zzh;
        int i10 = this.zzf;
        if (i10 != i7) {
            byte[] bArr = this.zze;
            int i11 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzh = i11;
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
                this.zzh = i12;
                return j6;
            }
        }
        return zzA();
    }
}
