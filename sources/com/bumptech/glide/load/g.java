package com.bumptech.glide.load;

import C0.G;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final org.sufficientlysecure.htmltextview.g f20802e = new org.sufficientlysecure.htmltextview.g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Option$CacheKeyUpdater f20804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f20806d;

    public g(String str, Object obj, Option$CacheKeyUpdater option$CacheKeyUpdater) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f20805c = str;
        this.f20803a = obj;
        this.f20804b = option$CacheKeyUpdater;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f20802e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f20805c.equals(((g) obj).f20805c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20805c.hashCode();
    }

    public final String toString() {
        return G.r(new StringBuilder("Option{key='"), this.f20805c, "'}");
    }
}
