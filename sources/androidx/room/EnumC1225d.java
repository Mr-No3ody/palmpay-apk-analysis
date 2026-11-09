package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1225d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1225d f17743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1225d[] f17744b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1225d EF0;

    static {
        EnumC1225d enumC1225d = new EnumC1225d("ENABLED", 0);
        EnumC1225d enumC1225d2 = new EnumC1225d("DISABLED", 1);
        EnumC1225d enumC1225d3 = new EnumC1225d("INHERITED", 2);
        f17743a = enumC1225d3;
        f17744b = new EnumC1225d[]{enumC1225d, enumC1225d2, enumC1225d3};
    }

    public static EnumC1225d valueOf(String str) {
        return (EnumC1225d) Enum.valueOf(EnumC1225d.class, str);
    }

    public static EnumC1225d[] values() {
        return (EnumC1225d[]) f17744b.clone();
    }
}
