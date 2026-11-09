package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f9140b;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("NUMERIC", 0);
        i iVar2 = new i("DIGIT2", 1);
        i iVar3 = new i("UNDEFINED", 2);
        f9139a = iVar3;
        f9140b = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f9140b.clone();
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
