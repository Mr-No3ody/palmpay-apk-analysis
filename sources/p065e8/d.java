package p065e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f36183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f36184c;

    static {
        d dVar = new d("CONTINUITIES", 0);
        f36182a = dVar;
        d dVar2 = new d("PAGE", 1);
        f36183b = dVar2;
        f36184c = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f36184c.clone();
    }
}
