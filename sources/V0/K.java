package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f9880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K f9881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ K[] f9882c;

    static {
        K k2 = new K("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f9880a = k2;
        K k8 = new K("DROP_WORK_REQUEST", 1);
        f9881b = k8;
        f9882c = new K[]{k2, k8};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f9882c.clone();
    }
}
