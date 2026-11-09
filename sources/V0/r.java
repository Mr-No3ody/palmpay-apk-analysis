package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f9968e;

    static {
        r rVar = new r("REPLACE", 0);
        f9964a = rVar;
        r rVar2 = new r("KEEP", 1);
        f9965b = rVar2;
        r rVar3 = new r("APPEND", 2);
        f9966c = rVar3;
        r rVar4 = new r("APPEND_OR_REPLACE", 3);
        f9967d = rVar4;
        f9968e = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f9968e.clone();
    }
}
