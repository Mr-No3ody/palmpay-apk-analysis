package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0 f13859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ F0[] f13860b;

    static {
        F0 f1 = new F0("SESSION_ERROR_SURFACE_NEEDS_RESET", 0);
        f13859a = f1;
        f13860b = new F0[]{f1, new F0("SESSION_ERROR_UNKNOWN", 1)};
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) f13860b.clone();
    }
}
