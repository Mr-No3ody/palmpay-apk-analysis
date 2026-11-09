package p376z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f44440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f44441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f44442f;

    static {
        b bVar = new b("BAR", 0);
        f44437a = bVar;
        b bVar2 = new b("BUBBLE", 1);
        f44438b = bVar2;
        b bVar3 = new b("LINE", 2);
        f44439c = bVar3;
        b bVar4 = new b("CANDLE", 3);
        f44440d = bVar4;
        b bVar5 = new b("SCATTER", 4);
        f44441e = bVar5;
        f44442f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44442f.clone();
    }
}
