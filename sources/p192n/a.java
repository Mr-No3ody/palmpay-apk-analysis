package p192n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f39796b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("NONE", 0);
        a aVar2 = new a("INFERRED", 1);
        f39795a = aVar2;
        f39796b = new a[]{aVar, aVar2, new a("INT_ENUM", 2), new a("INT_FLAG", 3), new a("COLOR", 4), new a("GRAVITY", 5), new a("RESOURCE_ID", 6)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39796b.clone();
    }
}
