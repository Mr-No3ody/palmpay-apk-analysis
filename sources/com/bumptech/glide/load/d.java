package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20522a;

    static {
        int[] iArr = new int[ImageHeaderParser.ImageType.values().length];
        f20522a = iArr;
        try {
            iArr[ImageHeaderParser.ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20522a[ImageHeaderParser.ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20522a[ImageHeaderParser.ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
