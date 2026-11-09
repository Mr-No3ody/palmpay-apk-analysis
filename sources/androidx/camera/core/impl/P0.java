package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P0 f13943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P0 f13944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ P0[] f13945c;

    static {
        P0 p3 = new P0("UPTIME", 0);
        f13943a = p3;
        P0 p10 = new P0("REALTIME", 1);
        f13944b = p10;
        f13945c = new P0[]{p3, p10};
    }

    public static P0 valueOf(String str) {
        return (P0) Enum.valueOf(P0.class, str);
    }

    public static P0[] values() {
        return (P0[]) f13945c.clone();
    }
}
