package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f9863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f9864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f9865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f9866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f9867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f9868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ D[] f9869g;

    static {
        D d2 = new D("NOT_REQUIRED", 0);
        f9863a = d2;
        D d10 = new D("CONNECTED", 1);
        f9864b = d10;
        D d11 = new D("UNMETERED", 2);
        f9865c = d11;
        D d12 = new D("NOT_ROAMING", 3);
        f9866d = d12;
        D d13 = new D("METERED", 4);
        f9867e = d13;
        D d14 = new D("TEMPORARILY_UNMETERED", 5);
        f9868f = d14;
        f9869g = new D[]{d2, d10, d11, d12, d13, d14};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f9869g.clone();
    }
}
