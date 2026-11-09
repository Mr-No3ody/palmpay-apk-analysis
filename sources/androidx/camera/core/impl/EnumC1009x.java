package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.camera.core.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1009x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1009x f14279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1009x f14280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1009x f14281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1009x f14282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1009x f14283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1009x f14284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1009x f14285g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC1009x[] f14286i;

    static {
        EnumC1009x enumC1009x = new EnumC1009x(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f14279a = enumC1009x;
        EnumC1009x enumC1009x2 = new EnumC1009x("INACTIVE", 1);
        f14280b = enumC1009x2;
        EnumC1009x enumC1009x3 = new EnumC1009x("SCANNING", 2);
        f14281c = enumC1009x3;
        EnumC1009x enumC1009x4 = new EnumC1009x("PASSIVE_FOCUSED", 3);
        f14282d = enumC1009x4;
        EnumC1009x enumC1009x5 = new EnumC1009x("PASSIVE_NOT_FOCUSED", 4);
        f14283e = enumC1009x5;
        EnumC1009x enumC1009x6 = new EnumC1009x("LOCKED_FOCUSED", 5);
        f14284f = enumC1009x6;
        EnumC1009x enumC1009x7 = new EnumC1009x("LOCKED_NOT_FOCUSED", 6);
        f14285g = enumC1009x7;
        f14286i = new EnumC1009x[]{enumC1009x, enumC1009x2, enumC1009x3, enumC1009x4, enumC1009x5, enumC1009x6, enumC1009x7};
    }

    public static EnumC1009x valueOf(String str) {
        return (EnumC1009x) Enum.valueOf(EnumC1009x.class, str);
    }

    public static EnumC1009x[] values() {
        return (EnumC1009x[]) f14286i.clone();
    }
}
