package R1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f7911e;

    static {
        a aVar = new a("Complete", 0);
        f7907a = aVar;
        a aVar2 = new a("Loading", 1);
        f7908b = aVar2;
        a aVar3 = new a("Fail", 2);
        f7909c = aVar3;
        a aVar4 = new a("End", 3);
        f7910d = aVar4;
        f7911e = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7911e.clone();
    }
}
