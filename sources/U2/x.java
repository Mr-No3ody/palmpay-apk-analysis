package U2;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f9180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f9181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f9182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ x[] f9183e;

    static {
        x xVar = new x("DECIMAL", 0);
        f9179a = xVar;
        x xVar2 = new x("PERCENT", 1);
        f9180b = xVar2;
        x xVar3 = new x("CURRENCY", 2);
        f9181c = xVar3;
        x xVar4 = new x("UNIT", 3);
        f9182d = xVar4;
        f9183e = new x[]{xVar, xVar2, xVar3, xVar4};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f9183e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "decimal";
        }
        if (iOrdinal == 1) {
            return "percent";
        }
        if (iOrdinal == 2) {
            return FirebaseAnalytics.Param.CURRENCY;
        }
        if (iOrdinal == 3) {
            return "unit";
        }
        throw new IllegalArgumentException();
    }
}
