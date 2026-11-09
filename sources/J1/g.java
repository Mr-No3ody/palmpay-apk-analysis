package J1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.camera.core.impl.utils.executor.a f4461a = new androidx.camera.core.impl.utils.executor.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.camera.core.impl.utils.executor.a f4462b = new androidx.camera.core.impl.utils.executor.a(2);

    public static void a(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
