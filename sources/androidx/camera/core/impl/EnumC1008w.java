package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.camera.core.impl.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1008w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1008w f14274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1008w f14275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1008w f14276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1008w f14277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1008w[] f14278e;

    static {
        EnumC1008w enumC1008w = new EnumC1008w(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f14274a = enumC1008w;
        EnumC1008w enumC1008w2 = new EnumC1008w("OFF", 1);
        f14275b = enumC1008w2;
        EnumC1008w enumC1008w3 = new EnumC1008w("ON_MANUAL_AUTO", 2);
        f14276c = enumC1008w3;
        EnumC1008w enumC1008w4 = new EnumC1008w("ON_CONTINUOUS_AUTO", 3);
        f14277d = enumC1008w4;
        f14278e = new EnumC1008w[]{enumC1008w, enumC1008w2, enumC1008w3, enumC1008w4};
    }

    public static EnumC1008w valueOf(String str) {
        return (EnumC1008w) Enum.valueOf(EnumC1008w.class, str);
    }

    public static EnumC1008w[] values() {
        return (EnumC1008w[]) f14278e.clone();
    }
}
