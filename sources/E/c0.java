package E;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f1998d = new c0(false, false, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f1999e = new c0(true, false, 500);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f2000f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2003c;

    static {
        new c0(true, false, 100L);
        f2000f = new c0(false, true, 0L);
    }

    public c0(boolean z3, boolean z8, long j6) {
        this.f2002b = z3;
        this.f2001a = j6;
        if (z8) {
            p118hf.a.g(!z3, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.f2003c = z8;
    }
}
