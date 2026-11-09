package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f13994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f13995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f13996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f13997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ W[] f13998e;

    static {
        W w3 = new W("ALWAYS_OVERRIDE", 0);
        f13994a = w3;
        W w6 = new W("HIGH_PRIORITY_REQUIRED", 1);
        f13995b = w6;
        W w10 = new W("REQUIRED", 2);
        f13996c = w10;
        W w11 = new W("OPTIONAL", 3);
        f13997d = w11;
        f13998e = new W[]{w3, w6, w10, w11};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f13998e.clone();
    }
}
