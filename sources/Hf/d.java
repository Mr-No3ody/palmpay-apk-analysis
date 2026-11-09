package Hf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f3926b;

    static {
        d dVar = new d("LANGUAGE_VERSION", 0);
        f3925a = dVar;
        d[] dVarArr = {dVar, new d("COMPILER_VERSION", 1), new d("API_VERSION", 2)};
        f3926b = dVarArr;
        com.facebook.imagepipeline.nativecode.b.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3926b.clone();
    }
}
