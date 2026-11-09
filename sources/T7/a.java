package T7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f9035c;

    static {
        a aVar = new a("DETACHED", 0);
        f9033a = aVar;
        a aVar2 = new a("ATTACHED", 1);
        f9034b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f9035c = aVarArr;
        com.facebook.imagepipeline.nativecode.b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9035c.clone();
    }
}
