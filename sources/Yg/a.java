package Yg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11462g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f11463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f11464j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a[] f11465o;

    static {
        a aVar = new a("NULL", 0);
        f11456a = aVar;
        a aVar2 = new a("INT", 1);
        f11457b = aVar2;
        a aVar3 = new a("LONG", 2);
        f11458c = aVar3;
        a aVar4 = new a("FLOAT", 3);
        f11459d = aVar4;
        a aVar5 = new a("DOUBLE", 4);
        f11460e = aVar5;
        a aVar6 = new a("BOOLEAN", 5);
        f11461f = aVar6;
        a aVar7 = new a("CHAR", 6);
        f11462g = aVar7;
        a aVar8 = new a("STRING", 7);
        f11463i = aVar8;
        a aVar9 = new a("ALL", 8);
        a aVar10 = new a("PRIMITIVE", 9);
        f11464j = aVar10;
        f11465o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11465o.clone();
    }
}
