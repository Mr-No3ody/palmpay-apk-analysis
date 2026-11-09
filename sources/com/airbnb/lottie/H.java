package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f19567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f19568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f19569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H[] f19570d;

    static {
        H h7 = new H("AUTOMATIC", 0);
        f19567a = h7;
        H h10 = new H("HARDWARE", 1);
        f19568b = h10;
        H h11 = new H("SOFTWARE", 2);
        f19569c = h11;
        f19570d = new H[]{h7, h10, h11};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f19570d.clone();
    }
}
