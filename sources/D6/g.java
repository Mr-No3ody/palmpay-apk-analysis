package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f1637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f1638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f1639e;

    static {
        g gVar = new g("InProgress", 0);
        f1635a = gVar;
        g gVar2 = new g("Success", 1);
        f1636b = gVar2;
        g gVar3 = new g("Error", 2);
        f1637c = gVar3;
        g gVar4 = new g("TimeOut", 3);
        f1638d = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        f1639e = gVarArr;
        com.facebook.imagepipeline.nativecode.b.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1639e.clone();
    }
}
