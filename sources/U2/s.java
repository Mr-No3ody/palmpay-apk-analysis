package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f9163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f9164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f9165c;

    static {
        s sVar = new s("SYMBOL", 0);
        f9163a = sVar;
        s sVar2 = new s("NARROWSYMBOL", 1);
        s sVar3 = new s("CODE", 2);
        f9164b = sVar3;
        f9165c = new s[]{sVar, sVar2, sVar3, new s("NAME", 3)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f9165c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "symbol";
        }
        if (iOrdinal == 1) {
            return "narrowSymbol";
        }
        if (iOrdinal == 2) {
            return "code";
        }
        if (iOrdinal == 3) {
            return "name";
        }
        throw new IllegalArgumentException();
    }
}
