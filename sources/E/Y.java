package E;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rational f1975a;

    public final X a(float f10, float f11, float f12) {
        PointF pointF;
        androidx.camera.view.s sVar = (androidx.camera.view.s) this;
        float[] fArr = {f10, f11};
        synchronized (sVar) {
            try {
                Matrix matrix = sVar.f15012d;
                if (matrix == null) {
                    pointF = androidx.camera.view.s.f15009e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float f13 = pointF.x;
        float f14 = pointF.y;
        Rational rational = this.f1975a;
        X x3 = new X();
        x3.f1971a = f13;
        x3.f1972b = f14;
        x3.f1973c = f12;
        x3.f1974d = rational;
        return x3;
    }
}
