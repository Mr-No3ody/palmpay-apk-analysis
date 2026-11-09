package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f9147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f9148b;

    /* JADX INFO: Fake field, exist only in values array */
    k EF0;

    static {
        k kVar = new k("NUMERIC", 0);
        k kVar2 = new k("DIGIT2", 1);
        k kVar3 = new k("UNDEFINED", 2);
        f9147a = kVar3;
        f9148b = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f9148b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
