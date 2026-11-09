package Ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f9427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f9428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l0[] f9429c;

    static {
        l0 l0Var = new l0("NORMAL", 0);
        f9427a = l0Var;
        l0 l0Var2 = new l0("PHONE", 1);
        f9428b = l0Var2;
        l0[] l0VarArr = {l0Var, l0Var2};
        f9429c = l0VarArr;
        com.facebook.imagepipeline.nativecode.b.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f9429c.clone();
    }
}
