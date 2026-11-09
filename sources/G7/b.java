package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f3052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f3053f;

    static {
        b bVar = new b("BOTTOM", 0);
        f3049b = bVar;
        b bVar2 = new b("TOP", 1);
        f3050c = bVar2;
        b bVar3 = new b("START", 2);
        f3051d = bVar3;
        b bVar4 = new b("END", 3);
        f3052e = bVar4;
        f3053f = new b[]{bVar, bVar2, bVar3, bVar4};
        f3048a = new a(null);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3053f.clone();
    }
}
