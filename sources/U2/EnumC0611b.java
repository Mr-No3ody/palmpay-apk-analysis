package U2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0611b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC0611b[] f9122a = {new EnumC0611b("UPPER", 0), new EnumC0611b("LOWER", 1), new EnumC0611b("FALSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0611b EF5;

    public static EnumC0611b valueOf(String str) {
        return (EnumC0611b) Enum.valueOf(EnumC0611b.class, str);
    }

    public static EnumC0611b[] values() {
        return (EnumC0611b[]) f9122a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "upper";
        }
        if (iOrdinal == 1) {
            return "lower";
        }
        if (iOrdinal == 2) {
            return "false";
        }
        throw new IllegalArgumentException();
    }
}
