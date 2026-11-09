package H3;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3628a;

    e(int i7) {
        this.f3628a = i7;
    }

    public static e a(int i7) {
        if (i7 == 0) {
            return INHERIT;
        }
        if (i7 == 1) {
            return LTR;
        }
        if (i7 == 2) {
            return RTL;
        }
        throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
    }
}
