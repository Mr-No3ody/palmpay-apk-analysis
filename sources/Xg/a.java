package Xg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f11228d;

    /* JADX INFO: Fake field, exist only in values array */
    a EF1;

    static {
        a aVar = new a("yotta", 0);
        a aVar2 = new a("zetta", 1);
        a aVar3 = new a("exa", 2);
        a aVar4 = new a("peta", 3);
        a aVar5 = new a("tera", 4);
        a aVar6 = new a("giga", 5);
        a aVar7 = new a("mega", 6);
        a aVar8 = new a("kilo", 7);
        f11225a = aVar8;
        a aVar9 = new a("hecto", 8);
        a aVar10 = new a("deca", 9);
        a aVar11 = new a("one", 10);
        f11226b = aVar11;
        a aVar12 = new a("deci", 11);
        a aVar13 = new a("centi", 12);
        a aVar14 = new a("milli", 13);
        f11227c = aVar14;
        f11228d = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, new a("micro", 14), new a("nano", 15), new a("pico", 16), new a("femto", 17), new a("atto", 18), new a("zepto", 19), new a("yocto", 20)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11228d.clone();
    }
}
