package U2;

import com.adjust.sdk.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y[] f9184a = {new y("SHORT", 0), new y("NARROW", 1), new y("LONG", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    y EF5;

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f9184a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "narrow";
        }
        if (iOrdinal == 2) {
            return Constants.LONG;
        }
        throw new IllegalArgumentException();
    }
}
