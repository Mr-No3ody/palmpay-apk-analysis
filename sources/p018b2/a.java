package p018b2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f18760c;

    static {
        a aVar = new a("Single", 0);
        f18758a = aVar;
        a aVar2 = new a("Multiple", 1);
        f18759b = aVar2;
        f18760c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18760c.clone();
    }
}
