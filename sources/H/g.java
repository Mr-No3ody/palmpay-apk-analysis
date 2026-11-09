package H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f3515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f3516d;

    static {
        g gVar = new g(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f3513a = gVar;
        g gVar2 = new g("DEFAULT", 1);
        f3514b = gVar2;
        g gVar3 = new g("YUV", 2);
        f3515c = gVar3;
        f3516d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f3516d.clone();
    }
}
