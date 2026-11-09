package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: V0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0682a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0682a f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0682a f9916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0682a[] f9917c;

    static {
        EnumC0682a enumC0682a = new EnumC0682a("EXPONENTIAL", 0);
        f9915a = enumC0682a;
        EnumC0682a enumC0682a2 = new EnumC0682a("LINEAR", 1);
        f9916b = enumC0682a2;
        f9917c = new EnumC0682a[]{enumC0682a, enumC0682a2};
    }

    public static EnumC0682a valueOf(String str) {
        return (EnumC0682a) Enum.valueOf(EnumC0682a.class, str);
    }

    public static EnumC0682a[] values() {
        return (EnumC0682a[]) f9917c.clone();
    }
}
