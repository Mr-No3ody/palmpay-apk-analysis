package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M.n f17024a = new M.n(0);

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        M.n nVar = f17024a;
        M.n nVar2 = (M.n) nVar.get(classLoader);
        if (nVar2 == null) {
            nVar2 = new M.n(0);
            nVar.put(classLoader, nVar2);
        }
        Class cls = (Class) nVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new P0.c(5, N8.q0.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
