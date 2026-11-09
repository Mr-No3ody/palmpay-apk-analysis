package H3;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public enum g {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3643a;

    g(int i7) {
        this.f3643a = i7;
    }

    public static g a(int i7) {
        switch (i7) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
        }
    }
}
