package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f13828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f13829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f13830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f13831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f13832e;

    static {
        A a3 = new A(p381za.c.UNKNOWN_PROCESS_NAME, 0);
        f13828a = a3;
        A a10 = new A("NONE", 1);
        f13829b = a10;
        A a11 = new A("READY", 2);
        f13830c = a11;
        A a12 = new A("FIRED", 3);
        f13831d = a12;
        f13832e = new A[]{a3, a10, a11, a12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f13832e.clone();
    }
}
