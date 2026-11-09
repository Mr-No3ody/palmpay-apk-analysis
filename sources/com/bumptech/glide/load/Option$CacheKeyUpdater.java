package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface Option$CacheKeyUpdater<T> {
    void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
}
