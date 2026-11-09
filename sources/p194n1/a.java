package p194n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f39821c;

    static {
        a aVar = new a("STANDARD_MOTION", 0);
        f39819a = aVar;
        a aVar2 = new a("REDUCED_MOTION", 1);
        f39820b = aVar2;
        f39821c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39821c.clone();
    }
}
