package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f5797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f5798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f5799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f5800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ N[] f5801e;

    static {
        M m7 = new M();
        f5797a = m7;
        L l5 = new L();
        f5798b = l5;
        K k2 = new K();
        f5799c = k2;
        J j6 = new J();
        f5800d = j6;
        N[] nArr = {m7, l5, k2, j6};
        f5801e = nArr;
        com.facebook.imagepipeline.nativecode.b.n(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f5801e.clone();
    }

    public abstract int a(I i7);
}
