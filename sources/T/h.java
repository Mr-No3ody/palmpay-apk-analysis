package T;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f8917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f8918g;

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void b(int i7, float f10) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public final void c(int i7) {
        SparseArray sparseArray = this.f8917f;
        int size = sparseArray.size();
        int iC = ((androidx.constraintlayout.widget.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f8918g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) sparseArray.valueAt(i10);
            dArr[i10] = ((double) iKeyAt) * 0.01d;
            aVar.b(this.f8918g);
            int i11 = 0;
            while (true) {
                float[] fArr = this.f8918g;
                if (i11 < fArr.length) {
                    dArr2[i10][i11] = fArr[i11];
                    i11++;
                }
            }
        }
        this.f15124a = p059e1.a.n(i7, dArr, dArr2);
    }

    @Override // T.k
    public final void d(View view, float f10) {
        this.f15124a.x(f10, this.f8918g);
        com.palmpay.lib.apm.launchcounter.util.d.O((androidx.constraintlayout.widget.a) this.f8917f.valueAt(0), view, this.f8918g);
    }
}
