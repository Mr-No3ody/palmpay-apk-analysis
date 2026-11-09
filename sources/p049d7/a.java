package p049d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f35541c;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("FILL", 0);
        a aVar2 = new a("WRAP", 1);
        f35539a = aVar2;
        a aVar3 = new a("CIRCLE", 2);
        f35540b = aVar3;
        f35541c = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f35541c.clone();
    }
}
