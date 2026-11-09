package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f9152b;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m("NUMERIC", 0);
        m mVar2 = new m("DIGIT2", 1);
        m mVar3 = new m("UNDEFINED", 2);
        f9151a = mVar3;
        f9152b = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f9152b.clone();
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
