package T;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f8921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray f8922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SparseArray f8923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f8924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f8925k;

    @Override // T.p
    public final boolean b(float f10, long j6, O.e eVar, View view) {
        this.f8927a.x(f10, this.f8924j);
        float[] fArr = this.f8924j;
        float f11 = fArr[fArr.length - 2];
        float f12 = fArr[fArr.length - 1];
        long j10 = j6 - this.f8931e;
        if (Float.isNaN(this.f8932f)) {
            float fC = eVar.c(view, this.f8921g);
            this.f8932f = fC;
            if (Float.isNaN(fC)) {
                this.f8932f = 0.0f;
            }
        }
        float f13 = (float) ((((j10 * 1.0E-9d) * ((double) f11)) + ((double) this.f8932f)) % 1.0d);
        this.f8932f = f13;
        this.f8931e = j6;
        float fSin = (float) Math.sin(f13 * 6.2831855f);
        this.f8930d = false;
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f8925k;
            if (i7 >= fArr2.length) {
                break;
            }
            boolean z3 = this.f8930d;
            float f14 = this.f8924j[i7];
            this.f8930d = z3 | (((double) f14) != 0.0d);
            fArr2[i7] = (f14 * fSin) + f12;
            i7++;
        }
        com.palmpay.lib.apm.launchcounter.util.d.O((androidx.constraintlayout.widget.a) this.f8922h.valueAt(0), view, this.f8925k);
        if (f11 != 0.0f) {
            this.f8930d = true;
        }
        return this.f8930d;
    }

    @Override // T.p
    public final void c(int i7) {
        SparseArray sparseArray = this.f8922h;
        int size = sparseArray.size();
        int iC = ((androidx.constraintlayout.widget.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i10 = iC + 2;
        this.f8924j = new float[i10];
        this.f8925k = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) sparseArray.valueAt(i11);
            float[] fArr = (float[]) this.f8923i.valueAt(i11);
            dArr[i11] = ((double) iKeyAt) * 0.01d;
            aVar.b(this.f8924j);
            int i12 = 0;
            while (true) {
                float[] fArr2 = this.f8924j;
                if (i12 < fArr2.length) {
                    dArr2[i11][i12] = fArr2[i12];
                    i12++;
                }
            }
            double[] dArr3 = dArr2[i11];
            dArr3[iC] = fArr[0];
            dArr3[iC + 1] = fArr[1];
        }
        this.f8927a = p059e1.a.n(i7, dArr, dArr2);
    }
}
