package p245q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f41451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f41453c;

    static {
        a aVar = new a("LOCAL", 0);
        f41451a = aVar;
        a aVar2 = new a("STRICT", 1);
        f41452b = aVar2;
        f41453c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f41453c.clone();
    }
}
