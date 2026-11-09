package p265r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f41630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f41631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f41632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f41633d;

    static {
        n nVar = new n("UNDECIDED", 0);
        f41630a = nVar;
        n nVar2 = new n("SHOULD_OVERRIDE", 1);
        f41631b = nVar2;
        n nVar3 = new n("DO_NOT_OVERRIDE", 2);
        f41632c = nVar3;
        f41633d = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f41633d.clone();
    }
}
