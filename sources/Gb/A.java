package Gb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f3219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f3220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ A[] f3221c;

    static {
        A a3 = new A("NEW_RADIAL", 0);
        f3219a = a3;
        A a10 = new A("OLD_SLANT", 1);
        f3220b = a10;
        A[] aArr = {a3, a10};
        f3221c = aArr;
        com.facebook.imagepipeline.nativecode.b.n(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f3221c.clone();
    }
}
