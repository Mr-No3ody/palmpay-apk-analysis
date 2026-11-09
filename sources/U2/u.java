package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f9170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f9171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f9172d;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("STANDARD", 0);
        u uVar2 = new u("SCIENTIFIC", 1);
        f9169a = uVar2;
        u uVar3 = new u("ENGINEERING", 2);
        f9170b = uVar3;
        u uVar4 = new u("COMPACT", 3);
        f9171c = uVar4;
        f9172d = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f9172d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "scientific";
        }
        if (iOrdinal == 2) {
            return "engineering";
        }
        if (iOrdinal == 3) {
            return "compact";
        }
        throw new IllegalArgumentException();
    }
}
