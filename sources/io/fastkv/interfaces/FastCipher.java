package io.fastkv.interfaces;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface FastCipher {
    int decrypt(int i7);

    long decrypt(long j6);

    byte[] decrypt(@NonNull byte[] bArr);

    int encrypt(int i7);

    long encrypt(long j6);

    byte[] encrypt(@NonNull byte[] bArr);
}
