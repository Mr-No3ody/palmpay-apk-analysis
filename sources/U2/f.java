package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f9135b;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("NUMERIC", 0);
        f fVar2 = new f("DIGIT2", 1);
        f fVar3 = new f("UNDEFINED", 2);
        f9134a = fVar3;
        f9135b = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f9135b.clone();
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
