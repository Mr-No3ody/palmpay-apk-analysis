package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
final class zzagh {
    public static /* synthetic */ boolean zza(byte b7) {
        return b7 >= 0;
    }

    public static /* synthetic */ void zzb(byte b7, byte b10, char[] cArr, int i7) throws zzaeh {
        if (b7 < -62 || zze(b10)) {
            throw new zzaeh("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b7 & Ascii.US) << 6) | (b10 & 63));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* synthetic */ void zzc(byte b7, byte b10, byte b11, char[] cArr, int i7) throws zzaeh {
        if (!zze(b10)) {
            if (b7 != -32) {
                if (b7 != -19) {
                    if (!zze(b11)) {
                        cArr[i7] = (char) (((b7 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b7 = -19;
                    if (!zze(b11)) {
                        cArr[i7] = (char) (((b7 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            } else if (b10 >= -96) {
                b7 = -32;
                if (b7 != -19) {
                    if (!zze(b11)) {
                        cArr[i7] = (char) (((b7 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b7 = -19;
                    if (!zze(b11)) {
                        cArr[i7] = (char) (((b7 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzaeh("Protocol message had invalid UTF-8.");
    }

    public static /* synthetic */ void zzd(byte b7, byte b10, byte b11, byte b12, char[] cArr, int i7) throws zzaeh {
        if (!zze(b10)) {
            if ((((b10 + 112) + (b7 << Ascii.FS)) >> 30) == 0 && !zze(b11) && !zze(b12)) {
                int i10 = ((b7 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw new zzaeh("Protocol message had invalid UTF-8.");
    }

    private static boolean zze(byte b7) {
        return b7 > -65;
    }
}
