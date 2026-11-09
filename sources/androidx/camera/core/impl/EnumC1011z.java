package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.camera.core.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1011z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1011z f14299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1011z f14300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1011z f14301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1011z f14302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1011z f14303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1011z[] f14304f;

    static {
        EnumC1011z enumC1011z = new EnumC1011z(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f14299a = enumC1011z;
        EnumC1011z enumC1011z2 = new EnumC1011z("INACTIVE", 1);
        f14300b = enumC1011z2;
        EnumC1011z enumC1011z3 = new EnumC1011z("METERING", 2);
        f14301c = enumC1011z3;
        EnumC1011z enumC1011z4 = new EnumC1011z("CONVERGED", 3);
        f14302d = enumC1011z4;
        EnumC1011z enumC1011z5 = new EnumC1011z("LOCKED", 4);
        f14303e = enumC1011z5;
        f14304f = new EnumC1011z[]{enumC1011z, enumC1011z2, enumC1011z3, enumC1011z4, enumC1011z5};
    }

    public static EnumC1011z valueOf(String str) {
        return (EnumC1011z) Enum.valueOf(EnumC1011z.class, str);
    }

    public static EnumC1011z[] values() {
        return (EnumC1011z[]) f14304f.clone();
    }
}
