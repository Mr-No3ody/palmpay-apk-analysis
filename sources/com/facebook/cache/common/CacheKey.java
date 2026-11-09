package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface CacheKey {
    boolean containsUri(Uri uri);

    boolean equals(Object obj);

    String getUriString();

    int hashCode();

    boolean isResourceIdForDebugging();

    String toString();
}
