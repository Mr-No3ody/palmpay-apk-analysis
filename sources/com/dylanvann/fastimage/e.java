package com.dylanvann.fastimage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21170a;

    static {
        int[] iArr = new int[FastImageCacheControl.values().length];
        f21170a = iArr;
        try {
            iArr[FastImageCacheControl.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21170a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21170a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
