package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1086d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f16596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f16597b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f16596a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f16597b = cls2 != null;
    }

    public static boolean a() {
        return (f16596a == null || f16597b) ? false : true;
    }
}
