package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.airbnb.lottie.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1309a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1309a f19633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1309a f19634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1309a[] f19635c;

    static {
        EnumC1309a enumC1309a = new EnumC1309a("AUTOMATIC", 0);
        f19633a = enumC1309a;
        EnumC1309a enumC1309a2 = new EnumC1309a("ENABLED", 1);
        f19634b = enumC1309a2;
        f19635c = new EnumC1309a[]{enumC1309a, enumC1309a2, new EnumC1309a("DISABLED", 2)};
    }

    public static EnumC1309a valueOf(String str) {
        return (EnumC1309a) Enum.valueOf(EnumC1309a.class, str);
    }

    public static EnumC1309a[] values() {
        return (EnumC1309a[]) f19635c.clone();
    }
}
