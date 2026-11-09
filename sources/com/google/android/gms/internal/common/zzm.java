package com.google.android.gms.internal.common;

import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes2.dex */
final class zzm extends zzl {
    private final char zza;

    public zzm(char c6) {
        this.zza = c6;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.zza;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return F.d(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c6) {
        return c6 == this.zza;
    }
}
