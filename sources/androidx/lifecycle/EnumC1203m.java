package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1203m {
    private static final /* synthetic */ EnumC1203m[] $VALUES;

    @NotNull
    public static final C1201k Companion;
    public static final EnumC1203m ON_ANY;
    public static final EnumC1203m ON_CREATE;
    public static final EnumC1203m ON_DESTROY;
    public static final EnumC1203m ON_PAUSE;
    public static final EnumC1203m ON_RESUME;
    public static final EnumC1203m ON_START;
    public static final EnumC1203m ON_STOP;

    static {
        EnumC1203m enumC1203m = new EnumC1203m("ON_CREATE", 0);
        ON_CREATE = enumC1203m;
        EnumC1203m enumC1203m2 = new EnumC1203m("ON_START", 1);
        ON_START = enumC1203m2;
        EnumC1203m enumC1203m3 = new EnumC1203m("ON_RESUME", 2);
        ON_RESUME = enumC1203m3;
        EnumC1203m enumC1203m4 = new EnumC1203m("ON_PAUSE", 3);
        ON_PAUSE = enumC1203m4;
        EnumC1203m enumC1203m5 = new EnumC1203m("ON_STOP", 4);
        ON_STOP = enumC1203m5;
        EnumC1203m enumC1203m6 = new EnumC1203m("ON_DESTROY", 5);
        ON_DESTROY = enumC1203m6;
        EnumC1203m enumC1203m7 = new EnumC1203m("ON_ANY", 6);
        ON_ANY = enumC1203m7;
        $VALUES = new EnumC1203m[]{enumC1203m, enumC1203m2, enumC1203m3, enumC1203m4, enumC1203m5, enumC1203m6, enumC1203m7};
        Companion = new C1201k(null);
    }

    public static EnumC1203m valueOf(String str) {
        return (EnumC1203m) Enum.valueOf(EnumC1203m.class, str);
    }

    public static EnumC1203m[] values() {
        return (EnumC1203m[]) $VALUES.clone();
    }

    public final EnumC1204n a() {
        switch (AbstractC1202l.f17459a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1204n.f17462c;
            case 3:
            case 4:
                return EnumC1204n.f17463d;
            case 5:
                return EnumC1204n.f17464e;
            case 6:
                return EnumC1204n.f17460a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
