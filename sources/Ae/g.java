package Ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f278e;

    static {
        g gVar = new g("GENERIC", 0);
        f275b = gVar;
        g gVar2 = new g("BANK", 1);
        f276c = gVar2;
        g gVar3 = new g("PALMPAY", 2);
        f277d = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f278e = gVarArr;
        com.facebook.imagepipeline.nativecode.b.n(gVarArr);
        f274a = new f(null);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f278e.clone();
    }
}
