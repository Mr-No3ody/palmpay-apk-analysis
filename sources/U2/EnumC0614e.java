package U2;

import com.adjust.sdk.Constants;
import com.transsnet.palmpay.credit.bean.WaiverInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0614e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0614e f9132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0614e[] f9133b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0614e EF0;

    static {
        EnumC0614e enumC0614e = new EnumC0614e(WaiverInfo.TYPE_FULL, 0);
        EnumC0614e enumC0614e2 = new EnumC0614e("LONG", 1);
        EnumC0614e enumC0614e3 = new EnumC0614e("MEDIUM", 2);
        EnumC0614e enumC0614e4 = new EnumC0614e("SHORT", 3);
        EnumC0614e enumC0614e5 = new EnumC0614e("UNDEFINED", 4);
        f9132a = enumC0614e5;
        f9133b = new EnumC0614e[]{enumC0614e, enumC0614e2, enumC0614e3, enumC0614e4, enumC0614e5};
    }

    public static EnumC0614e valueOf(String str) {
        return (EnumC0614e) Enum.valueOf(EnumC0614e.class, str);
    }

    public static EnumC0614e[] values() {
        return (EnumC0614e[]) f9133b.clone();
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
