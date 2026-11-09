package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f3153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y[] f3154b;

    static {
        y yVar = new y("START", 0);
        f3153a = yVar;
        f3154b = new y[]{yVar, new y("END", 1), new y("TOP", 2), new y("BOTTOM", 3)};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f3154b.clone();
    }
}
