package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f17255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f17256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f17257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z0[] f17258d;

    static {
        z0 z0Var = new z0("NONE", 0);
        f17255a = z0Var;
        z0 z0Var2 = new z0("ADDING", 1);
        f17256b = z0Var2;
        z0 z0Var3 = new z0("REMOVING", 2);
        f17257c = z0Var3;
        f17258d = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f17258d.clone();
    }
}
