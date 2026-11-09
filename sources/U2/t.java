package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f9166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f9167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f9168c;

    static {
        t tVar = new t("STANDARD", 0);
        f9166a = tVar;
        t tVar2 = new t("ACCOUNTING", 1);
        f9167b = tVar2;
        f9168c = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f9168c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "accounting";
        }
        throw new IllegalArgumentException();
    }
}
