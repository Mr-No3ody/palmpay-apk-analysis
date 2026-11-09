package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f3132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f3133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f3134c;

    static {
        p pVar = new p("START", 0);
        f3132a = pVar;
        p pVar2 = new p("END", 1);
        f3133b = pVar2;
        f3134c = new p[]{pVar, pVar2, new p("TOP", 2), new p("BOTTOM", 3)};
        new o(null);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f3134c.clone();
    }
}
