package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f9141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f9142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f9143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f9144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f9145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f9146f;

    static {
        j jVar = new j("H11", 0);
        f9141a = jVar;
        j jVar2 = new j("H12", 1);
        f9142b = jVar2;
        j jVar3 = new j("H23", 2);
        f9143c = jVar3;
        j jVar4 = new j("H24", 3);
        f9144d = jVar4;
        j jVar5 = new j("UNDEFINED", 4);
        f9145e = jVar5;
        f9146f = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f9146f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "h11";
        }
        if (iOrdinal == 1) {
            return "h12";
        }
        if (iOrdinal == 2) {
            return "h23";
        }
        if (iOrdinal == 3) {
            return "h24";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
