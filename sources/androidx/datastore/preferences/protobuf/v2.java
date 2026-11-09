package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f16790a;

    public v2(Unsafe unsafe) {
        this.f16790a = unsafe;
    }

    public final int a(Class cls) {
        return this.f16790a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f16790a.arrayIndexScale(cls);
    }

    public abstract void c(long j6, byte[] bArr, long j10);

    public abstract boolean d(Object obj, long j6);

    public abstract byte e(long j6);

    public abstract byte f(Object obj, long j6);

    public abstract double g(Object obj, long j6);

    public abstract float h(Object obj, long j6);

    public final int i(Object obj, long j6) {
        return this.f16790a.getInt(obj, j6);
    }

    public final long j(Object obj, long j6) {
        return this.f16790a.getLong(obj, j6);
    }

    public final Object k(Object obj, long j6) {
        return this.f16790a.getObject(obj, j6);
    }

    public final long l(Field field) {
        return this.f16790a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j6, boolean z3);

    public abstract void n(Object obj, long j6, byte b7);

    public abstract void o(Object obj, long j6, double d2);

    public abstract void p(Object obj, long j6, float f10);

    public final void q(Object obj, long j6, int i7) {
        this.f16790a.putInt(obj, j6, i7);
    }

    public final void r(Object obj, long j6, long j10) {
        this.f16790a.putLong(obj, j6, j10);
    }

    public final void s(Object obj, long j6, Object obj2) {
        this.f16790a.putObject(obj, j6, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f16790a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            w2.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
