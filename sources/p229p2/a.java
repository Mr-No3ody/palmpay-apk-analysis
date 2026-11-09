package p229p2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41180a = b.f41181b;

    public static void a(String str, String str2) {
        b bVar = f41180a;
        if (bVar.isLoggable(3)) {
            bVar.getClass();
            b.a(3, str, str2);
        }
    }

    public static void b(String str, String str2, Integer num, Object obj, Object obj2) {
        b bVar = f41180a;
        if (bVar.isLoggable(3)) {
            String str3 = String.format(null, str2, num, obj, obj2);
            bVar.getClass();
            b.a(3, str, str3);
        }
    }

    public static void c(String str, String str2, Object obj) {
        b bVar = f41180a;
        if (bVar.isLoggable(3)) {
            String str3 = String.format(null, str2, obj);
            bVar.getClass();
            b.a(3, str, str3);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        b bVar = f41180a;
        if (bVar.isLoggable(3)) {
            String str3 = String.format(null, str2, obj, obj2);
            bVar.getClass();
            b.a(3, str, str3);
        }
    }

    public static void e(Class cls, String str) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(cls.getSimpleName(), str);
        }
    }

    public static void f(Class cls, String str, Throwable th) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(cls.getSimpleName(), str, th);
        }
    }

    public static void g(Class cls, String str, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void h(String str, String str2) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(str, str2, th);
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.e(str, String.format(null, str2, objArr));
        }
    }

    public static void k(String str, String str2) {
        b bVar = f41180a;
        if (bVar.isLoggable(4)) {
            bVar.getClass();
            b.a(4, str, str2);
        }
    }

    public static void l(String str, String str2, Integer num, Integer num2) {
        b bVar = f41180a;
        if (bVar.isLoggable(4)) {
            String str3 = String.format(null, str2, num, num2);
            bVar.getClass();
            b.a(4, str, str3);
        }
    }

    public static void m(String str, String str2, Integer num, Integer num2, Integer num3) {
        b bVar = f41180a;
        if (bVar.isLoggable(4)) {
            String str3 = String.format(null, str2, num, num2, num3);
            bVar.getClass();
            b.a(4, str, str3);
        }
    }

    public static void n(String str, String str2, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(4)) {
            String str3 = String.format(null, str2, objArr);
            bVar.getClass();
            b.a(4, str, str3);
        }
    }

    public static void o(Class cls, String str, Object obj) {
        b bVar = f41180a;
        if (bVar.isLoggable(2)) {
            String simpleName = cls.getSimpleName();
            String str2 = String.format(null, str, obj);
            bVar.getClass();
            b.a(2, simpleName, str2);
        }
    }

    public static void p(Class cls, String str, Object obj, Object obj2) {
        b bVar = f41180a;
        if (bVar.isLoggable(2)) {
            String simpleName = cls.getSimpleName();
            String str2 = String.format(null, str, obj, obj2);
            bVar.getClass();
            b.a(2, simpleName, str2);
        }
    }

    public static void q(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (f41180a.isLoggable(2)) {
            String str2 = String.format(null, str, obj, obj2, obj3);
            if (f41180a.isLoggable(2)) {
                b.a(2, cls.getSimpleName(), str2);
            }
        }
    }

    public static void r(Class cls, Exception exc, String str, Object... objArr) {
        if (f41180a.isLoggable(5)) {
            t(cls, String.format(null, str, objArr), exc);
        }
    }

    public static void s(Class cls, String str) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            String simpleName = cls.getSimpleName();
            bVar.getClass();
            b.a(5, simpleName, str);
        }
    }

    public static void t(Class cls, String str, Exception exc) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            String simpleName = cls.getSimpleName();
            bVar.getClass();
            b.b(5, simpleName, str, exc);
        }
    }

    public static void u(Class cls, String str, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            String simpleName = cls.getSimpleName();
            String str2 = String.format(null, str, objArr);
            bVar.getClass();
            b.a(5, simpleName, str2);
        }
    }

    public static void v(String str, String str2) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            bVar.getClass();
            b.a(5, str, str2);
        }
    }

    public static void w(String str, String str2, Exception exc) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            bVar.getClass();
            b.b(5, str, str2, exc);
        }
    }

    public static void x(String str, String str2, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            String str3 = String.format(null, str2, objArr);
            bVar.getClass();
            b.a(5, str, str3);
        }
    }

    public static void y(Throwable th, String str, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(5)) {
            String str2 = String.format(null, str, objArr);
            bVar.getClass();
            b.b(5, "ReactNative", str2, th);
        }
    }

    public static void z(String str, String str2, Object... objArr) {
        b bVar = f41180a;
        if (bVar.isLoggable(6)) {
            bVar.wtf(str, String.format(null, str2, objArr));
        }
    }
}
