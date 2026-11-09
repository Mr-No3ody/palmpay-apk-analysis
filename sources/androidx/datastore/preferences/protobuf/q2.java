package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q2 f16751f = new q2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f16754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16755d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16756e;

    public q2(int i7, int[] iArr, Object[] objArr, boolean z3) {
        this.f16752a = i7;
        this.f16753b = iArr;
        this.f16754c = objArr;
        this.f16756e = z3;
    }

    public static q2 c() {
        return new q2(0, new int[8], new Object[8], true);
    }

    public static void e(int i7, Object obj, Writer writer) throws IOException {
        int i10 = i7 >>> 3;
        int i11 = i7 & 7;
        if (i11 == 0) {
            writer.writeInt64(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            writer.writeFixed64(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            writer.writeBytes(i10, (AbstractC1123n) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new RuntimeException(C1160z1.c());
            }
            writer.writeFixed32(i10, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == J2.f16510a) {
            writer.writeStartGroup(i10);
            ((q2) obj).f(writer);
            writer.writeEndGroup(i10);
        } else {
            writer.writeEndGroup(i10);
            ((q2) obj).f(writer);
            writer.writeStartGroup(i10);
        }
    }

    public final void a(int i7) {
        int[] iArr = this.f16753b;
        if (i7 > iArr.length) {
            int i10 = this.f16752a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f16753b = Arrays.copyOf(iArr, i7);
            this.f16754c = Arrays.copyOf(this.f16754c, i7);
        }
    }

    public final int b() {
        int iC;
        int iE;
        int iC2;
        int i7 = this.f16755d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16752a; i11++) {
            int i12 = this.f16753b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f16754c[i11]).getClass();
                    iC2 = AbstractC1146v.C(i13) + 8;
                } else if (i14 == 2) {
                    iC2 = AbstractC1146v.x(i13, (AbstractC1123n) this.f16754c[i11]);
                } else if (i14 == 3) {
                    iC = AbstractC1146v.C(i13) * 2;
                    iE = ((q2) this.f16754c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C1160z1.c());
                    }
                    ((Integer) this.f16754c[i11]).getClass();
                    iC2 = AbstractC1146v.C(i13) + 4;
                }
                i10 = iC2 + i10;
            } else {
                long jLongValue = ((Long) this.f16754c[i11]).longValue();
                iC = AbstractC1146v.C(i13);
                iE = AbstractC1146v.E(jLongValue);
            }
            i10 = iE + iC + i10;
        }
        this.f16755d = i10;
        return i10;
    }

    public final void d(int i7, Object obj) {
        if (!this.f16756e) {
            throw new UnsupportedOperationException();
        }
        a(this.f16752a + 1);
        int[] iArr = this.f16753b;
        int i10 = this.f16752a;
        iArr[i10] = i7;
        this.f16754c[i10] = obj;
        this.f16752a = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        int i7 = this.f16752a;
        if (i7 == q2Var.f16752a) {
            int[] iArr = this.f16753b;
            int[] iArr2 = q2Var.f16753b;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f16754c;
            Object[] objArr2 = q2Var.f16754c;
            int i11 = this.f16752a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(Writer writer) throws IOException {
        if (this.f16752a == 0) {
            return;
        }
        if (writer.fieldOrder() == J2.f16510a) {
            for (int i7 = 0; i7 < this.f16752a; i7++) {
                e(this.f16753b[i7], this.f16754c[i7], writer);
            }
            return;
        }
        for (int i10 = this.f16752a - 1; i10 >= 0; i10--) {
            e(this.f16753b[i10], this.f16754c[i10], writer);
        }
    }

    public final int hashCode() {
        int i7 = this.f16752a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f16753b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f16754c;
        int i14 = this.f16752a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
