package Y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f11276e;

    static {
        b bVar = new b("LEFT", 0);
        f11272a = bVar;
        b bVar2 = new b("TOP", 1);
        f11273b = bVar2;
        b bVar3 = new b("RIGHT", 2);
        f11274c = bVar3;
        b bVar4 = new b("BOTTOM", 3);
        f11275d = bVar4;
        f11276e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11276e.clone();
    }
}
