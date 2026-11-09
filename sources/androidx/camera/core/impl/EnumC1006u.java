package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.camera.core.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1006u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1006u f14132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1006u f14133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1006u f14134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1006u f14135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1006u f14136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1006u f14137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1006u f14138g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC1006u[] f14139i;

    static {
        EnumC1006u enumC1006u = new EnumC1006u(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f14132a = enumC1006u;
        EnumC1006u enumC1006u2 = new EnumC1006u("OFF", 1);
        f14133b = enumC1006u2;
        EnumC1006u enumC1006u3 = new EnumC1006u("ON", 2);
        f14134c = enumC1006u3;
        EnumC1006u enumC1006u4 = new EnumC1006u("ON_AUTO_FLASH", 3);
        f14135d = enumC1006u4;
        EnumC1006u enumC1006u5 = new EnumC1006u("ON_ALWAYS_FLASH", 4);
        f14136e = enumC1006u5;
        EnumC1006u enumC1006u6 = new EnumC1006u("ON_AUTO_FLASH_REDEYE", 5);
        f14137f = enumC1006u6;
        EnumC1006u enumC1006u7 = new EnumC1006u("ON_EXTERNAL_FLASH", 6);
        f14138g = enumC1006u7;
        f14139i = new EnumC1006u[]{enumC1006u, enumC1006u2, enumC1006u3, enumC1006u4, enumC1006u5, enumC1006u6, enumC1006u7};
    }

    public static EnumC1006u valueOf(String str) {
        return (EnumC1006u) Enum.valueOf(EnumC1006u.class, str);
    }

    public static EnumC1006u[] values() {
        return (EnumC1006u[]) f14139i.clone();
    }
}
