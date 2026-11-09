package Yg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f11472g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f11473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f11474j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b[] f11475o;

    static {
        b bVar = new b("BOOLEAN", 0);
        f11466a = bVar;
        b bVar2 = new b("BYTE", 1);
        f11467b = bVar2;
        b bVar3 = new b("SHORT", 2);
        f11468c = bVar3;
        b bVar4 = new b("INT", 3);
        f11469d = bVar4;
        b bVar5 = new b("LONG", 4);
        f11470e = bVar5;
        b bVar6 = new b("CHAR", 5);
        f11471f = bVar6;
        b bVar7 = new b("FLOAT", 6);
        f11472g = bVar7;
        b bVar8 = new b("DOUBLE", 7);
        f11473i = bVar8;
        b bVar9 = new b("VOID", 8);
        b bVar10 = new b("NONE", 9);
        b bVar11 = new b("NULL", 10);
        b bVar12 = new b("ARRAY", 11);
        b bVar13 = new b("DECLARED", 12);
        b bVar14 = new b("ERROR", 13);
        b bVar15 = new b("TYPEVAR", 14);
        b bVar16 = new b("WILDCARD", 15);
        b bVar17 = new b("PACKAGE", 16);
        f11474j = bVar17;
        f11475o = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, new b("EXECUTABLE", 17), new b("OTHER", 18), new b("UNION", 19), new b("INTERSECTION", 20)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11475o.clone();
    }
}
