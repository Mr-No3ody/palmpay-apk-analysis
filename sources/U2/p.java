package U2;

import com.adjust.sdk.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f9157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ p[] f9158b;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("LONG", 0);
        p pVar2 = new p("SHORT", 1);
        p pVar3 = new p("NARROW", 2);
        p pVar4 = new p("UNDEFINED", 3);
        f9157a = pVar4;
        f9158b = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f9158b.clone();
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
