package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20507a = Charset.forName(Constants.ENCODING);

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(@NonNull MessageDigest messageDigest);
}
