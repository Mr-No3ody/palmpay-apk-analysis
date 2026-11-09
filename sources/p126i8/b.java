package p126i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f37435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f37436c;

    static {
        b bVar = new b("OnErrorDiscard", 0);
        f37434a = bVar;
        b bVar2 = new b("OnErrorRecover", 1);
        f37435b = bVar2;
        f37436c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String name) {
        return (b) Enum.valueOf(b.class, name);
    }

    public static b[] values() {
        return (b[]) f37436c.clone();
    }
}
