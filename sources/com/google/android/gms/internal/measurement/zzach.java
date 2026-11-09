package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzach {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzacg zzacgVar) {
        int i10 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzb(b7, bArr, i10, zzacgVar);
        }
        zzacgVar.zza = b7;
        return i10;
    }

    public static int zzb(int i7, byte[] bArr, int i10, zzacg zzacgVar) {
        byte b7 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b7 >= 0) {
            zzacgVar.zza = i12 | (b7 << 7);
            return i11;
        }
        int i13 = i12 | ((b7 & Ascii.DEL) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzacgVar.zza = i13 | (b10 << Ascii.SO);
            return i14;
        }
        int i15 = i13 | ((b10 & Ascii.DEL) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzacgVar.zza = i15 | (b11 << Ascii.NAK);
            return i16;
        }
        int i17 = i15 | ((b11 & Ascii.DEL) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzacgVar.zza = i17 | (b12 << Ascii.FS);
            return i18;
        }
        int i19 = i17 | ((b12 & Ascii.DEL) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzacgVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzc(byte[] bArr, int i7, zzacg zzacgVar) {
        long j6 = bArr[i7];
        int i10 = i7 + 1;
        if (j6 >= 0) {
            zzacgVar.zzb = j6;
            return i10;
        }
        int i11 = i7 + 2;
        byte b7 = bArr[i10];
        long j10 = (j6 & 127) | (((long) (b7 & Ascii.DEL)) << 7);
        int i12 = 7;
        while (b7 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b10 & Ascii.DEL)) << i12;
            b7 = b10;
            i11 = i13;
        }
        zzacgVar.zzb = j10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i7) {
        int i10 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        int i11 = bArr[i7 + 1] & UnsignedBytes.MAX_VALUE;
        int i12 = bArr[i7 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long zze(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i7, zzacg zzacgVar) throws zzaeh {
        int iZza = zza(bArr, i7, zzacgVar);
        int i10 = zzacgVar.zza;
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            zzacgVar.zzc = "";
            return iZza;
        }
        zzacgVar.zzc = zzagl.zzd(bArr, iZza, i10);
        return iZza + i10;
    }

    public static int zzg(byte[] bArr, int i7, zzacg zzacgVar) throws zzaeh {
        int iZza = zza(bArr, i7, zzacgVar);
        int i10 = zzacgVar.zza;
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZza) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzacgVar.zzc = zzacr.zza;
            return iZza;
        }
        zzacgVar.zzc = zzacr.zzj(bArr, iZza, i10);
        return iZza + i10;
    }

    public static int zzh(zzafp zzafpVar, byte[] bArr, int i7, int i10, zzacg zzacgVar) throws IOException {
        Object objZza = zzafpVar.zza();
        int iZzj = zzj(objZza, zzafpVar, bArr, i7, i10, zzacgVar);
        zzafpVar.zzk(objZza);
        zzacgVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzafp zzafpVar, byte[] bArr, int i7, int i10, int i11, zzacg zzacgVar) throws IOException {
        Object objZza = zzafpVar.zza();
        int iZzk = zzk(objZza, zzafpVar, bArr, i7, i10, i11, zzacgVar);
        zzafpVar.zzk(objZza);
        zzacgVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzafp zzafpVar, byte[] bArr, int i7, int i10, zzacg zzacgVar) throws IOException {
        int iZzb = i7 + 1;
        int i11 = bArr[i7];
        if (i11 < 0) {
            iZzb = zzb(i11, bArr, iZzb, zzacgVar);
            i11 = zzacgVar.zza;
        }
        int i12 = iZzb;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zzacgVar.zze + 1;
        zzacgVar.zze = i13;
        zzq(i13);
        int i14 = i12 + i11;
        zzafpVar.zzj(obj, bArr, i12, i14, zzacgVar);
        zzacgVar.zze--;
        zzacgVar.zzc = obj;
        return i14;
    }

    public static int zzk(Object obj, zzafp zzafpVar, byte[] bArr, int i7, int i10, int i11, zzacg zzacgVar) throws IOException {
        int i12 = zzacgVar.zze + 1;
        zzacgVar.zze = i12;
        zzq(i12);
        int iZzi = ((zzaff) zzafpVar).zzi(obj, bArr, i7, i10, i11, zzacgVar);
        zzacgVar.zze--;
        zzacgVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i7, byte[] bArr, int i10, int i11, zzaef zzaefVar, zzacg zzacgVar) {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iZza = zza(bArr, i10, zzacgVar);
        zzadvVar.zzh(zzacgVar.zza);
        while (iZza < i11) {
            int iZza2 = zza(bArr, iZza, zzacgVar);
            if (i7 != zzacgVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzacgVar);
            zzadvVar.zzh(zzacgVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i7, zzaef zzaefVar, zzacg zzacgVar) throws IOException {
        zzadv zzadvVar = (zzadv) zzaefVar;
        int iZza = zza(bArr, i7, zzacgVar);
        int i10 = zzacgVar.zza + iZza;
        while (iZza < i10) {
            iZza = zza(bArr, iZza, zzacgVar);
            zzadvVar.zzh(zzacgVar.zza);
        }
        if (iZza == i10) {
            return iZza;
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzafp zzafpVar, int i7, byte[] bArr, int i10, int i11, zzaef zzaefVar, zzacg zzacgVar) throws IOException {
        int iZzh = zzh(zzafpVar, bArr, i10, i11, zzacgVar);
        zzaefVar.add(zzacgVar.zzc);
        while (iZzh < i11) {
            int iZza = zza(bArr, iZzh, zzacgVar);
            if (i7 != zzacgVar.zza) {
                break;
            }
            iZzh = zzh(zzafpVar, bArr, iZza, i11, zzacgVar);
            zzaefVar.add(zzacgVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i7, byte[] bArr, int i10, int i11, zzaga zzagaVar, zzacg zzacgVar) throws zzaeh {
        if ((i7 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int iZzc = zzc(bArr, i10, zzacgVar);
            zzagaVar.zzk(i7, Long.valueOf(zzacgVar.zzb));
            return iZzc;
        }
        if (i12 == 1) {
            zzagaVar.zzk(i7, Long.valueOf(zze(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZza = zza(bArr, i10, zzacgVar);
            int i13 = zzacgVar.zza;
            if (i13 < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZza) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzagaVar.zzk(i7, zzacr.zza);
            } else {
                zzagaVar.zzk(i7, zzacr.zzj(bArr, iZza, i13));
            }
            return iZza + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzaeh("Protocol message contained an invalid tag (zero).");
            }
            zzagaVar.zzk(i7, Integer.valueOf(zzd(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzaga zzagaVarZzb = zzaga.zzb();
        int i15 = zzacgVar.zze + 1;
        zzacgVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iZza2 = zza(bArr, i10, zzacgVar);
            int i17 = zzacgVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZza2;
                break;
            }
            i10 = zzo(i17, bArr, iZza2, i11, zzagaVarZzb, zzacgVar);
            i16 = i17;
        }
        zzacgVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzaeh("Failed to parse the message.");
        }
        zzagaVar.zzk(i7, zzagaVarZzb);
        return i10;
    }

    public static int zzp(int i7, byte[] bArr, int i10, int i11, zzacg zzacgVar) throws zzaeh {
        if ((i7 >>> 3) == 0) {
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return zzc(bArr, i10, zzacgVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zza(bArr, i10, zzacgVar) + zzacgVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zzaeh("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zza(bArr, i10, zzacgVar);
            i14 = zzacgVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzp(i14, bArr, i10, i11, zzacgVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw new zzaeh("Failed to parse the message.");
        }
        return i10;
    }

    private static void zzq(int i7) throws zzaeh {
        if (i7 >= zzb) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
