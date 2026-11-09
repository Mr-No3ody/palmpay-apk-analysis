package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class HexDumpUtils {
    @Nullable
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i7, int i10, boolean z3) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i7 < 0 || i10 <= 0 || i7 + i10 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((i10 + 15) / 16) * (z3 ? 75 : 57));
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        while (i11 > 0) {
            if (i12 == 0) {
                if (i10 < 65536) {
                    sb2.append(String.format("%04X:", Integer.valueOf(i7)));
                } else {
                    sb2.append(String.format("%08X:", Integer.valueOf(i7)));
                }
                i13 = i7;
            } else if (i12 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", Integer.valueOf(bArr[i7] & UnsignedBytes.MAX_VALUE)));
            i11--;
            i12++;
            if (z3 && (i12 == 16 || i11 == 0)) {
                int i14 = 16 - i12;
                if (i14 > 0) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        sb2.append("   ");
                    }
                }
                if (i14 >= 8) {
                    sb2.append("  ");
                }
                sb2.append("  ");
                for (int i16 = 0; i16 < i12; i16++) {
                    char c6 = (char) bArr[i13 + i16];
                    if (c6 < ' ' || c6 > '~') {
                        c6 = '.';
                    }
                    sb2.append(c6);
                }
            }
            if (i12 == 16 || i11 == 0) {
                sb2.append('\n');
                i12 = 0;
            }
            i7++;
        }
        return sb2.toString();
    }
}
