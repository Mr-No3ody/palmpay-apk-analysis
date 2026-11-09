package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f9173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f9174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f9175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f9176d;

    static {
        v vVar = new v("SIGNIFICANT_DIGITS", 0);
        f9173a = vVar;
        v vVar2 = new v("FRACTION_DIGITS", 1);
        f9174b = vVar2;
        v vVar3 = new v("COMPACT_ROUNDING", 2);
        f9175c = vVar3;
        f9176d = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f9176d.clone();
    }
}
