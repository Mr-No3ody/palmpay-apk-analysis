package U2;

import com.adjust.sdk.Constants;
import com.transsnet.palmpay.credit.bean.WaiverInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f9153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f9154b;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    static {
        n nVar = new n(WaiverInfo.TYPE_FULL, 0);
        n nVar2 = new n("LONG", 1);
        n nVar3 = new n("MEDIUM", 2);
        n nVar4 = new n("SHORT", 3);
        n nVar5 = new n("UNDEFINED", 4);
        f9153a = nVar5;
        f9154b = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f9154b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "full";
        }
        if (iOrdinal == 1) {
            return Constants.LONG;
        }
        if (iOrdinal == 2) {
            return "medium";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
