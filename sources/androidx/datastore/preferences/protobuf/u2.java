package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends v2 {
    @Override // androidx.datastore.preferences.protobuf.v2
    public final void c(long j6, byte[] bArr, long j10) {
        this.f16790a.copyMemory((Object) null, j6, bArr, w2.f16805f, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final boolean d(Object obj, long j6) {
        return this.f16790a.getBoolean(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final byte e(long j6) {
        return this.f16790a.getByte(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final byte f(Object obj, long j6) {
        return this.f16790a.getByte(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final double g(Object obj, long j6) {
        return this.f16790a.getDouble(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final float h(Object obj, long j6) {
        return this.f16790a.getFloat(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void m(Object obj, long j6, boolean z3) {
        this.f16790a.putBoolean(obj, j6, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void n(Object obj, long j6, byte b7) {
        this.f16790a.putByte(obj, j6, b7);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void o(Object obj, long j6, double d2) {
        this.f16790a.putDouble(obj, j6, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void p(Object obj, long j6, float f10) {
        this.f16790a.putFloat(obj, j6, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f16790a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            w2.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final boolean u() {
        Unsafe unsafe = this.f16790a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (w2.e() != null) {
                    try {
                        Class<?> cls3 = this.f16790a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        w2.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                w2.a(th2);
            }
        }
        return false;
    }
}
