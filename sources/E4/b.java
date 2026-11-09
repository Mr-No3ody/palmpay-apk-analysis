package E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f2226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f2228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f2229g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f2231j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f2232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b[] f2233p;

    static {
        b bVar = new b("NONE", 0);
        f2223a = bVar;
        b bVar2 = new b("DRAG", 1);
        f2224b = bVar2;
        b bVar3 = new b("X_ZOOM", 2);
        f2225c = bVar3;
        b bVar4 = new b("Y_ZOOM", 3);
        f2226d = bVar4;
        b bVar5 = new b("PINCH_ZOOM", 4);
        f2227e = bVar5;
        b bVar6 = new b("ROTATE", 5);
        f2228f = bVar6;
        b bVar7 = new b("SINGLE_TAP", 6);
        f2229g = bVar7;
        b bVar8 = new b("DOUBLE_TAP", 7);
        f2230i = bVar8;
        b bVar9 = new b("LONG_PRESS", 8);
        f2231j = bVar9;
        b bVar10 = new b("FLING", 9);
        f2232o = bVar10;
        f2233p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2233p.clone();
    }
}
