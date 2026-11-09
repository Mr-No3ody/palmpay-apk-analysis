package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h[] f9138a = {new h("BESTFIT", 0), new h("BASIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    h EF5;

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9138a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "best fit";
        }
        if (iOrdinal == 1) {
            return "basic";
        }
        throw new IllegalArgumentException();
    }
}
