package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f7429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f7431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f7432e;

    static {
        d dVar = new d("FIXED", 0);
        f7428a = dVar;
        d dVar2 = new d("WRAP_CONTENT", 1);
        f7429b = dVar2;
        d dVar3 = new d("MATCH_CONSTRAINT", 2);
        f7430c = dVar3;
        d dVar4 = new d("MATCH_PARENT", 3);
        f7431d = dVar4;
        f7432e = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7432e.clone();
    }
}
