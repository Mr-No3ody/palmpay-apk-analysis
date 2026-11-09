package Y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f11281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f11282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f11283d;

    static {
        d dVar = new d("Middle", 0);
        f11280a = dVar;
        d dVar2 = new d("Open", 1);
        f11281b = dVar2;
        d dVar3 = new d("Close", 2);
        f11282c = dVar3;
        f11283d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f11283d.clone();
    }
}
