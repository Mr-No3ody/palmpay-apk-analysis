package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ q[] f9160b;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        q qVar = new q("NUMERIC", 0);
        q qVar2 = new q("DIGIT2", 1);
        q qVar3 = new q("UNDEFINED", 2);
        f9159a = qVar3;
        f9160b = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f9160b.clone();
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
