package V5;

import androidx.camera.camera2.internal.F;
import com.horcrux.svg.d0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends com.nimbusds.jose.shaded.gson.stream.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final f f10007M = new f();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Object f10008Q = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object[] f10009B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10010C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String[] f10011H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f10012L;

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void C() {
        int i7 = F.i(w());
        if (i7 == 1) {
            e();
            return;
        }
        if (i7 != 9) {
            if (i7 == 3) {
                f();
                return;
            }
            if (i7 == 4) {
                H(true);
                return;
            }
            J();
            int i10 = this.f10010C;
            if (i10 > 0) {
                int[] iArr = this.f10012L;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    public final void E(int i7) {
        if (w() == i7) {
            return;
        }
        throw new IllegalStateException("Expected " + d0.u(i7) + " but was " + d0.u(w()) + G());
    }

    public final String F(boolean z3) {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i10 = this.f10010C;
            if (i7 >= i10) {
                return sb2.toString();
            }
            Object[] objArr = this.f10009B;
            Object obj = objArr[i7];
            if (obj instanceof com.nimbusds.jose.shaded.gson.n) {
                i7++;
                if (i7 < i10 && (objArr[i7] instanceof Iterator)) {
                    int i11 = this.f10012L[i7];
                    if (z3 && i11 > 0 && (i7 == i10 - 1 || i7 == i10 - 2)) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                }
            } else if ((obj instanceof com.nimbusds.jose.shaded.gson.r) && (i7 = i7 + 1) < i10 && (objArr[i7] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f10011H[i7];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i7++;
        }
    }

    public final String G() {
        return " at path " + F(false);
    }

    public final String H(boolean z3) {
        E(5);
        Map.Entry entry = (Map.Entry) ((Iterator) I()).next();
        String str = (String) entry.getKey();
        this.f10011H[this.f10010C - 1] = z3 ? "<skipped>" : str;
        K(entry.getValue());
        return str;
    }

    public final Object I() {
        return this.f10009B[this.f10010C - 1];
    }

    public final Object J() {
        Object[] objArr = this.f10009B;
        int i7 = this.f10010C - 1;
        this.f10010C = i7;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    public final void K(Object obj) {
        int i7 = this.f10010C;
        Object[] objArr = this.f10009B;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            this.f10009B = Arrays.copyOf(objArr, i10);
            this.f10012L = Arrays.copyOf(this.f10012L, i10);
            this.f10011H = (String[]) Arrays.copyOf(this.f10011H, i10);
        }
        Object[] objArr2 = this.f10009B;
        int i11 = this.f10010C;
        this.f10010C = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void a() {
        E(1);
        K(((com.nimbusds.jose.shaded.gson.n) I()).f23686a.iterator());
        this.f10012L[this.f10010C - 1] = 0;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void b() {
        E(3);
        K(((com.nimbusds.jose.shaded.gson.internal.j) ((com.nimbusds.jose.shaded.gson.r) I()).f23688a.entrySet()).iterator());
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10009B = new Object[]{f10008Q};
        this.f10010C = 1;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void e() {
        E(2);
        J();
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void f() {
        E(4);
        this.f10011H[this.f10010C - 1] = null;
        J();
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final String getPath() {
        return F(false);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final String i() {
        return F(true);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final boolean j() {
        int iW = w();
        return (iW == 4 || iW == 2 || iW == 10) ? false : true;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final boolean m() {
        E(8);
        boolean zA = ((com.nimbusds.jose.shaded.gson.s) J()).a();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return zA;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final double n() throws com.nimbusds.jose.shaded.gson.stream.d {
        int iW = w();
        if (iW != 7 && iW != 6) {
            throw new IllegalStateException("Expected " + d0.u(7) + " but was " + d0.u(iW) + G());
        }
        com.nimbusds.jose.shaded.gson.s sVar = (com.nimbusds.jose.shaded.gson.s) I();
        double dDoubleValue = sVar.f23692a instanceof Number ? sVar.b().doubleValue() : Double.parseDouble(sVar.c());
        if (!this.f23696b && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new com.nimbusds.jose.shaded.gson.stream.d("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return dDoubleValue;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final int o() {
        int iW = w();
        if (iW != 7 && iW != 6) {
            throw new IllegalStateException("Expected " + d0.u(7) + " but was " + d0.u(iW) + G());
        }
        com.nimbusds.jose.shaded.gson.s sVar = (com.nimbusds.jose.shaded.gson.s) I();
        int iIntValue = sVar.f23692a instanceof Number ? sVar.b().intValue() : Integer.parseInt(sVar.c());
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return iIntValue;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final long p() {
        int iW = w();
        if (iW != 7 && iW != 6) {
            throw new IllegalStateException("Expected " + d0.u(7) + " but was " + d0.u(iW) + G());
        }
        com.nimbusds.jose.shaded.gson.s sVar = (com.nimbusds.jose.shaded.gson.s) I();
        long jLongValue = sVar.f23692a instanceof Number ? sVar.b().longValue() : Long.parseLong(sVar.c());
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return jLongValue;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final String q() {
        return H(false);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final void s() {
        E(9);
        J();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final String toString() {
        return g.class.getSimpleName() + G();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final String u() {
        int iW = w();
        if (iW != 6 && iW != 7) {
            throw new IllegalStateException("Expected " + d0.u(6) + " but was " + d0.u(iW) + G());
        }
        String strC = ((com.nimbusds.jose.shaded.gson.s) J()).c();
        int i7 = this.f10010C;
        if (i7 > 0) {
            int[] iArr = this.f10012L;
            int i10 = i7 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return strC;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.b
    public final int w() {
        if (this.f10010C == 0) {
            return 10;
        }
        Object objI = I();
        if (objI instanceof Iterator) {
            boolean z3 = this.f10009B[this.f10010C - 2] instanceof com.nimbusds.jose.shaded.gson.r;
            Iterator it = (Iterator) objI;
            if (!it.hasNext()) {
                return z3 ? 4 : 2;
            }
            if (z3) {
                return 5;
            }
            K(it.next());
            return w();
        }
        if (objI instanceof com.nimbusds.jose.shaded.gson.r) {
            return 3;
        }
        if (objI instanceof com.nimbusds.jose.shaded.gson.n) {
            return 1;
        }
        if (objI instanceof com.nimbusds.jose.shaded.gson.s) {
            Serializable serializable = ((com.nimbusds.jose.shaded.gson.s) objI).f23692a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objI instanceof com.nimbusds.jose.shaded.gson.q) {
            return 9;
        }
        if (objI == f10008Q) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new com.nimbusds.jose.shaded.gson.stream.d("Custom JsonElement subclass " + objI.getClass().getName() + " is not supported");
    }
}
