package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f9885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f9886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f9887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f9888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f9889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Q f9890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Q[] f9891g;

    static {
        Q q10 = new Q("ENQUEUED", 0);
        f9885a = q10;
        Q q11 = new Q("RUNNING", 1);
        f9886b = q11;
        Q q12 = new Q("SUCCEEDED", 2);
        f9887c = q12;
        Q q13 = new Q("FAILED", 3);
        f9888d = q13;
        Q q14 = new Q("BLOCKED", 4);
        f9889e = q14;
        Q q15 = new Q("CANCELLED", 5);
        f9890f = q15;
        f9891g = new Q[]{q10, q11, q12, q13, q14, q15};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f9891g.clone();
    }

    public final boolean a() {
        return this == f9887c || this == f9888d || this == f9890f;
    }
}
