package A4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f55a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f56b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f57c;

    static {
        g gVar = new g("LEFT", 0);
        f55a = gVar;
        g gVar2 = new g("RIGHT", 1);
        f56b = gVar2;
        f57c = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f57c.clone();
    }
}
