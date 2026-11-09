package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1146v extends AbstractC1102h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f16784b = Logger.getLogger(AbstractC1146v.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f16785c = w2.f16804e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1149w f16786a;

    public static int A(long j6) {
        return E((j6 >> 63) ^ (j6 << 1));
    }

    public static int B(String str) {
        int length;
        try {
            length = z2.b(str);
        } catch (y2 unused) {
            length = str.getBytes(AbstractC1154x1.f16808a).length;
        }
        return D(length) + length;
    }

    public static int C(int i7) {
        return D(i7 << 3);
    }

    public static int D(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int E(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public static int x(int i7, AbstractC1123n abstractC1123n) {
        return y(abstractC1123n) + C(i7);
    }

    public static int y(AbstractC1123n abstractC1123n) {
        int size = abstractC1123n.size();
        return D(size) + size;
    }

    public static int z(int i7) {
        return D((i7 >> 31) ^ (i7 << 1));
    }

    public final void F(String str, y2 y2Var) throws Kf.d {
        f16784b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) y2Var);
        byte[] bytes = str.getBytes(AbstractC1154x1.f16808a);
        try {
            a0(bytes.length);
            w(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new Kf.d(e10);
        }
    }

    public abstract void G(byte b7);

    public abstract void H(int i7, boolean z3);

    public abstract void I(int i7, byte[] bArr);

    public abstract void J(int i7, AbstractC1123n abstractC1123n);

    public abstract void K(AbstractC1123n abstractC1123n);

    public abstract void L(int i7, int i10);

    public abstract void M(int i7);

    public abstract void N(int i7, long j6);

    public abstract void O(long j6);

    public abstract void P(int i7, int i10);

    public abstract void Q(int i7);

    public abstract void R(int i7, MessageLite messageLite);

    public abstract void S(int i7, MessageLite messageLite, Schema schema);

    public abstract void T(MessageLite messageLite);

    public abstract void U(int i7, MessageLite messageLite);

    public abstract void V(int i7, AbstractC1123n abstractC1123n);

    public abstract void W(int i7, String str);

    public abstract void X(String str);

    public abstract void Y(int i7, int i10);

    public abstract void Z(int i7, int i10);

    public abstract void a0(int i7);

    public abstract void b0(int i7, long j6);

    public abstract void c0(long j6);
}
