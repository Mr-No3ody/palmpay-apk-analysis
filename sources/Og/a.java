package Og;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f6848e;

    static {
        a aVar = new a("NONE", 0);
        f6844a = aVar;
        a aVar2 = new a("BASIC", 1);
        f6845b = aVar2;
        a aVar3 = new a("HEADERS", 2);
        f6846c = aVar3;
        a aVar4 = new a("BODY", 3);
        f6847d = aVar4;
        f6848e = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6848e.clone();
    }
}
