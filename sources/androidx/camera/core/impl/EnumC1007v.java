package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.camera.core.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1007v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1007v f14264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1007v f14265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1007v f14266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1007v f14267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1007v f14268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1007v f14269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1007v[] f14270g;

    static {
        EnumC1007v enumC1007v = new EnumC1007v(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f14264a = enumC1007v;
        EnumC1007v enumC1007v2 = new EnumC1007v("INACTIVE", 1);
        f14265b = enumC1007v2;
        EnumC1007v enumC1007v3 = new EnumC1007v("SEARCHING", 2);
        f14266c = enumC1007v3;
        EnumC1007v enumC1007v4 = new EnumC1007v("FLASH_REQUIRED", 3);
        f14267d = enumC1007v4;
        EnumC1007v enumC1007v5 = new EnumC1007v("CONVERGED", 4);
        f14268e = enumC1007v5;
        EnumC1007v enumC1007v6 = new EnumC1007v("LOCKED", 5);
        f14269f = enumC1007v6;
        f14270g = new EnumC1007v[]{enumC1007v, enumC1007v2, enumC1007v3, enumC1007v4, enumC1007v5, enumC1007v6};
    }

    public static EnumC1007v valueOf(String str) {
        return (EnumC1007v) Enum.valueOf(EnumC1007v.class, str);
    }

    public static EnumC1007v[] values() {
        return (EnumC1007v[]) f14270g.clone();
    }
}
