package U2;

import com.adjust.sdk.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f9161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r[] f9162b;

    static {
        r rVar = new r("SHORT", 0);
        f9161a = rVar;
        f9162b = new r[]{rVar, new r("LONG", 1)};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f9162b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return Constants.LONG;
        }
        throw new IllegalArgumentException();
    }
}
