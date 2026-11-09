package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j[] f365a = {new j("LINEAR", 0), new j("STEPPED", 1), new j("CUBIC_BEZIER", 2), new j("HORIZONTAL_BEZIER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    j EF5;

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f365a.clone();
    }
}
