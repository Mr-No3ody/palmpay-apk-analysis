package A4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f45a = {new d("NONE", 0), new d("EMPTY", 1), new d("DEFAULT", 2), new d("SQUARE", 3), new d("CIRCLE", 4), new d("LINE", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f45a.clone();
    }
}
