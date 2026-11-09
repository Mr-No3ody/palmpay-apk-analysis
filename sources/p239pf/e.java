package p239pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f41308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f41309b;

    static {
        e eVar = new e("COMPLETE", 0);
        f41308a = eVar;
        f41309b = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f41309b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
