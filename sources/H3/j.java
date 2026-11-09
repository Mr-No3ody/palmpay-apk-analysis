package H3;

import C0.G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f3658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f3660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f3661d;

    static {
        j jVar = new j("UNDEFINED", 0);
        f3658a = jVar;
        j jVar2 = new j("EXACTLY", 1);
        f3659b = jVar2;
        j jVar3 = new j("AT_MOST", 2);
        f3660c = jVar3;
        f3661d = new j[]{jVar, jVar2, jVar3};
    }

    public static j a(int i7) {
        if (i7 == 0) {
            return f3658a;
        }
        if (i7 == 1) {
            return f3659b;
        }
        if (i7 == 2) {
            return f3660c;
        }
        throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3661d.clone();
    }
}
