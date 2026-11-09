package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f16800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f16801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v2 f16802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f16803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f16804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f16805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f16806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f16807h;

    static {
        Unsafe unsafeJ = j();
        f16800a = unsafeJ;
        f16801b = AbstractC1086d.f16596a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        v2 u2Var = null;
        if (unsafeJ != null) {
            if (!AbstractC1086d.a()) {
                u2Var = new u2(unsafeJ);
            } else if (zF) {
                u2Var = new t2(unsafeJ, 1);
            } else if (zF2) {
                u2Var = new t2(unsafeJ, 0);
            }
        }
        f16802c = u2Var;
        f16803d = u2Var == null ? false : u2Var.u();
        f16804e = u2Var == null ? false : u2Var.t();
        f16805f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        f16806g = (fieldE == null || u2Var == null) ? -1L : u2Var.l(fieldE);
        f16807h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(w2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f16800a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f16804e) {
            return f16802c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f16804e) {
            f16802c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1086d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC1086d.a()) {
            return false;
        }
        try {
            Class cls2 = f16801b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j6) {
        return f16802c.f(bArr, f16805f + j6);
    }

    public static byte h(Object obj, long j6) {
        return (byte) ((f16802c.i(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j6) {
        return (byte) ((f16802c.i(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j6, byte b7) {
        f16802c.n(bArr, f16805f + j6, b7);
    }

    public static void l(Object obj, long j6, byte b7) {
        long j10 = (-4) & j6;
        int i7 = f16802c.i(obj, j10);
        int i10 = ((~((int) j6)) & 3) << 3;
        n(obj, j10, ((255 & b7) << i10) | (i7 & (~(255 << i10))));
    }

    public static void m(Object obj, long j6, byte b7) {
        long j10 = (-4) & j6;
        int i7 = (((int) j6) & 3) << 3;
        n(obj, j10, ((255 & b7) << i7) | (f16802c.i(obj, j10) & (~(255 << i7))));
    }

    public static void n(Object obj, long j6, int i7) {
        f16802c.q(obj, j6, i7);
    }

    public static void o(Object obj, long j6, long j10) {
        f16802c.r(obj, j6, j10);
    }

    public static void p(Object obj, long j6, Object obj2) {
        f16802c.s(obj, j6, obj2);
    }
}
