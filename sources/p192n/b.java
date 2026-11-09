package p192n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f39798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f39799c;

    static {
        b bVar = new b("WARNING", 0);
        f39797a = bVar;
        b bVar2 = new b("ERROR", 1);
        f39798b = bVar2;
        f39799c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f39799c.clone();
    }
}
