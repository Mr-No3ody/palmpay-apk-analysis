package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
class zzagi {
    public static final int zza(String str, byte[] bArr, int i7, int i10) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i7 > i10) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i7, length);
        return i7 + length;
    }
}
