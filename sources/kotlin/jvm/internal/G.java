package kotlin.jvm.internal;

import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f38952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KClass[] f38953b;

    static {
        H h7 = null;
        try {
            h7 = (H) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (h7 == null) {
            h7 = new H();
        }
        f38952a = h7;
        f38953b = new KClass[0];
    }

    public static C1858h a(Class cls) {
        f38952a.getClass();
        return new C1858h(cls);
    }
}
