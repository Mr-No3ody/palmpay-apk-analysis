package androidx.camera.video;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f14570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f14571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f14572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F[] f14573d;

    static {
        F f10 = new F("ACTIVE_STREAMING", 0);
        f14570a = f10;
        F f11 = new F("ACTIVE_NON_STREAMING", 1);
        f14571b = f11;
        F f12 = new F("INACTIVE", 2);
        f14572c = f12;
        f14573d = new F[]{f10, f11, f12};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f14573d.clone();
    }
}
