package kotlin.jvm.internal;

import N8.q0;
import com.alibaba.android.arouter.utils.Consts;
import java.util.Arrays;
import p355xf.C2128g;

/* JADX INFO: loaded from: classes4.dex */
public class Intrinsics {
    public static boolean a(float f10, Float f11) {
        return f11 != null && f11.floatValue() == f10;
    }

    public static boolean b(Double d2) {
        return d2 != null && d2.doubleValue() == 9999.0d;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(q0.j(str, " must not be null"));
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        j(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void e(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        j(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int h(int i7, int i10) {
        if (i7 < i10) {
            return -1;
        }
        return i7 == i10 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), Consts.DOT, stackTraceElement.getMethodName(), ", parameter ");
        sbF.append(str);
        return sbF.toString();
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i7 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l() {
        C2128g c2128g = new C2128g();
        j(c2128g, Intrinsics.class.getName());
        throw c2128g;
    }

    public static void m() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void n(String str) {
        p355xf.J j6 = new p355xf.J(q0.k("lateinit property ", str, " has not been initialized"));
        j(j6, Intrinsics.class.getName());
        throw j6;
    }
}
