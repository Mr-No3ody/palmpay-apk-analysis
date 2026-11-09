package H3;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3618a;

    a(int i7) {
        this.f3618a = i7;
    }

    public static a a(int i7) {
        switch (i7) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            case 8:
                return SPACE_EVENLY;
            default:
                throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
        }
    }
}
