package io.fastkv.interfaces;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface FastEncoder<T> {
    T decode(@NonNull byte[] bArr, int i7, int i10);

    byte[] encode(@NonNull T t);

    String tag();
}
