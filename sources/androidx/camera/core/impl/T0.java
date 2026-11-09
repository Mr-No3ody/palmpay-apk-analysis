package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f13974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0 f13975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T0 f13976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T0 f13977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T0 f13978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final T0 f13979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ T0[] f13980g;

    static {
        T0 t1 = new T0("IMAGE_CAPTURE", 0);
        f13974a = t1;
        T0 t3 = new T0("PREVIEW", 1);
        f13975b = t3;
        T0 t8 = new T0("IMAGE_ANALYSIS", 2);
        f13976c = t8;
        T0 t10 = new T0("VIDEO_CAPTURE", 3);
        f13977d = t10;
        T0 t11 = new T0("STREAM_SHARING", 4);
        f13978e = t11;
        T0 t12 = new T0("METERING_REPEATING", 5);
        f13979f = t12;
        f13980g = new T0[]{t1, t3, t8, t10, t11, t12};
    }

    public static T0 valueOf(String str) {
        return (T0) Enum.valueOf(T0.class, str);
    }

    public static T0[] values() {
        return (T0[]) f13980g.clone();
    }
}
