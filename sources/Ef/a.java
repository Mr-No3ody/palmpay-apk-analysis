package Ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f2424b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2423a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        f2424b = aVarArr;
        com.facebook.imagepipeline.nativecode.b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2424b.clone();
    }
}
