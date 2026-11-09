package p386zf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f44699b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("IGNORE", 0);
        a aVar2 = new a("WARN", 1);
        a aVar3 = new a("STRICT", 2);
        f44698a = aVar3;
        f44699b = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f44699b.clone();
    }
}
