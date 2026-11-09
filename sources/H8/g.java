package H8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f3760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f3761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f3762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f3763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f3764f;

    static {
        g gVar = new g("NO_MOBILE_NETWORK", 0);
        f3759a = gVar;
        g gVar2 = new g("NOT_MTN_NETWORK", 1);
        f3760b = gVar2;
        g gVar3 = new g("NETWORK_ERROR", 2);
        f3761c = gVar3;
        g gVar4 = new g("EMPTY_REDIRECT_URL", 3);
        f3762d = gVar4;
        g gVar5 = new g("FAILED_TO_PARSE_AUTH_CODE", 4);
        f3763e = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f3764f = gVarArr;
        com.facebook.imagepipeline.nativecode.b.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f3764f.clone();
    }
}
