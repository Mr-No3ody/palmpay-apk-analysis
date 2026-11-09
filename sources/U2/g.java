package U2;

import com.adjust.sdk.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f9137b;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g("LONG", 0);
        g gVar2 = new g("SHORT", 1);
        g gVar3 = new g("NARROW", 2);
        g gVar4 = new g("UNDEFINED", 3);
        f9136a = gVar4;
        f9137b = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f9137b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Constants.LONG;
        }
        if (iOrdinal == 1) {
            return "short";
        }
        if (iOrdinal == 2) {
            return "narrow";
        }
        if (iOrdinal == 3) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
