package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g[] f364a = {new g("UP", 0), new g("DOWN", 1), new g("CLOSEST", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    g EF5;

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f364a.clone();
    }
}
