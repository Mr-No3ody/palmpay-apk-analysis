package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k[] f366a = {new k("INSIDE_SLICE", 0), new k("OUTSIDE_SLICE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    k EF5;

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f366a.clone();
    }
}
