package com.google.android.gms.internal.mlkit_vision_face;

import C0.G;
import com.google.common.primitives.UnsignedBytes;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzbe {
    public static int zza(int i7) {
        return (i7 + 1) * (i7 < 32 ? 4 : 2);
    }

    public static int zzb(@CheckForNull Object obj, @CheckForNull Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iZza = zzbf.zza(obj);
        int i10 = iZza & i7;
        int iZzc = zzc(obj3, i10);
        if (iZzc != 0) {
            int i11 = ~i7;
            int i12 = iZza & i11;
            int i13 = -1;
            while (true) {
                int i14 = iZzc - 1;
                int i15 = iArr[i14];
                if ((i15 & i11) != i12 || !zzx.zza(obj, objArr[i14]) || (objArr2 != null && !zzx.zza(obj2, objArr2[i14]))) {
                    int i16 = i15 & i7;
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    iZzc = i16;
                } else {
                    int i17 = i15 & i7;
                    if (i13 == -1) {
                        zze(obj3, i10, i17);
                        return i14;
                    }
                    iArr[i13] = (i17 & i7) | (iArr[i13] & i11);
                    return i14;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i7) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & UnsignedBytes.MAX_VALUE;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    public static Object zzd(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(G.m(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i7 <= 256) {
            return new byte[i7];
        }
        return i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static void zze(Object obj, int i7, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i10;
        } else {
            ((int[]) obj)[i7] = i10;
        }
    }
}
