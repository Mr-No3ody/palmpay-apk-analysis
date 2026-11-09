package U2;

import com.adjust.sdk.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f9149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f9150b;

    /* JADX INFO: Fake field, exist only in values array */
    l EF0;

    static {
        l lVar = new l("NUMERIC", 0);
        l lVar2 = new l("DIGIT2", 1);
        l lVar3 = new l("LONG", 2);
        l lVar4 = new l("SHORT", 3);
        l lVar5 = new l("NARROW", 4);
        l lVar6 = new l("UNDEFINED", 5);
        f9149a = lVar6;
        f9150b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f9150b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return Constants.LONG;
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "narrow";
        }
        if (iOrdinal == 5) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
