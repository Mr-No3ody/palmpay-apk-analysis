package p121i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f37409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f37410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f37411d;

    static {
        b bVar = new b("CACHE_FULL", 0);
        f37408a = bVar;
        b bVar2 = new b("CONTENT_STALE", 1);
        f37409b = bVar2;
        b bVar3 = new b("USER_FORCED", 2);
        b bVar4 = new b("CACHE_MANAGER_TRIMMED", 3);
        f37410c = bVar4;
        f37411d = new b[]{bVar, bVar2, bVar3, bVar4, new b("TRIM_EXPIRED", 4)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f37411d.clone();
    }
}
