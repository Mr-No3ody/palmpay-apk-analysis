package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f16779b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void c(long j6, byte[] bArr, long j10) {
        switch (this.f16779b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final boolean d(Object obj, long j6) {
        switch (this.f16779b) {
            case 0:
                if (w2.f16807h) {
                    if (w2.h(obj, j6) == 0) {
                        return false;
                    }
                } else if (w2.i(obj, j6) == 0) {
                    return false;
                }
                return true;
            default:
                if (w2.f16807h) {
                    if (w2.h(obj, j6) == 0) {
                        return false;
                    }
                } else if (w2.i(obj, j6) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final byte e(long j6) {
        switch (this.f16779b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final byte f(Object obj, long j6) {
        switch (this.f16779b) {
            case 0:
                return w2.f16807h ? w2.h(obj, j6) : w2.i(obj, j6);
            default:
                return w2.f16807h ? w2.h(obj, j6) : w2.i(obj, j6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final double g(Object obj, long j6) {
        switch (this.f16779b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(obj, j6));
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final float h(Object obj, long j6) {
        switch (this.f16779b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(obj, j6));
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void m(Object obj, long j6, boolean z3) {
        switch (this.f16779b) {
            case 0:
                if (!w2.f16807h) {
                    w2.m(obj, j6, z3 ? (byte) 1 : (byte) 0);
                } else {
                    w2.l(obj, j6, z3 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!w2.f16807h) {
                    w2.m(obj, j6, z3 ? (byte) 1 : (byte) 0);
                } else {
                    w2.l(obj, j6, z3 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void n(Object obj, long j6, byte b7) {
        switch (this.f16779b) {
            case 0:
                if (!w2.f16807h) {
                    w2.m(obj, j6, b7);
                } else {
                    w2.l(obj, j6, b7);
                }
                break;
            default:
                if (!w2.f16807h) {
                    w2.m(obj, j6, b7);
                } else {
                    w2.l(obj, j6, b7);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void o(Object obj, long j6, double d2) {
        switch (this.f16779b) {
            case 0:
                r(obj, j6, Double.doubleToLongBits(d2));
                break;
            default:
                r(obj, j6, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final void p(Object obj, long j6, float f10) {
        switch (this.f16779b) {
            case 0:
                q(obj, j6, Float.floatToIntBits(f10));
                break;
            default:
                q(obj, j6, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v2
    public final boolean u() {
        switch (this.f16779b) {
        }
        return false;
    }
}
