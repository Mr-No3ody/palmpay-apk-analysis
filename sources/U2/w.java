package U2;

import com.facebook.react.views.scroll.ReactScrollViewHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f9177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w[] f9178b;

    static {
        w wVar = new w("AUTO", 0);
        f9177a = wVar;
        f9178b = new w[]{wVar, new w("ALWAYS", 1), new w("NEVER", 2), new w("EXCEPTZERO", 3)};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f9178b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "auto";
        }
        if (iOrdinal == 1) {
            return ReactScrollViewHelper.OVER_SCROLL_ALWAYS;
        }
        if (iOrdinal == 2) {
            return ReactScrollViewHelper.OVER_SCROLL_NEVER;
        }
        if (iOrdinal == 3) {
            return "exceptZero";
        }
        throw new IllegalArgumentException();
    }
}
