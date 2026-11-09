package U2;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0613d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0613d f9129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0613d f9130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0613d[] f9131c;

    static {
        EnumC0613d enumC0613d = new EnumC0613d("SORT", 0);
        f9129a = enumC0613d;
        EnumC0613d enumC0613d2 = new EnumC0613d("SEARCH", 1);
        f9130b = enumC0613d2;
        f9131c = new EnumC0613d[]{enumC0613d, enumC0613d2};
    }

    public static EnumC0613d valueOf(String str) {
        return (EnumC0613d) Enum.valueOf(EnumC0613d.class, str);
    }

    public static EnumC0613d[] values() {
        return (EnumC0613d[]) f9131c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "sort";
        }
        if (iOrdinal == 1) {
            return FirebaseAnalytics.Event.SEARCH;
        }
        throw new IllegalArgumentException();
    }
}
