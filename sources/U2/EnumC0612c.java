package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0612c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0612c f9123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0612c f9124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0612c f9125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0612c f9126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC0612c f9127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0612c[] f9128f;

    static {
        EnumC0612c enumC0612c = new EnumC0612c("BASE", 0);
        f9123a = enumC0612c;
        EnumC0612c enumC0612c2 = new EnumC0612c("ACCENT", 1);
        f9124b = enumC0612c2;
        EnumC0612c enumC0612c3 = new EnumC0612c("CASE", 2);
        f9125c = enumC0612c3;
        EnumC0612c enumC0612c4 = new EnumC0612c("VARIANT", 3);
        f9126d = enumC0612c4;
        EnumC0612c enumC0612c5 = new EnumC0612c("LOCALE", 4);
        f9127e = enumC0612c5;
        f9128f = new EnumC0612c[]{enumC0612c, enumC0612c2, enumC0612c3, enumC0612c4, enumC0612c5};
    }

    public static EnumC0612c valueOf(String str) {
        return (EnumC0612c) Enum.valueOf(EnumC0612c.class, str);
    }

    public static EnumC0612c[] values() {
        return (EnumC0612c[]) f9128f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "base";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "case";
        }
        if (iOrdinal == 3) {
            return "variant";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
