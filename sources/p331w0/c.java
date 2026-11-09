package p331w0;

import android.view.animation.Interpolator;
import androidx.camera.video.u;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f43225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43226b;

    public c(float[] fArr) {
        this.f43225a = fArr;
        this.f43226b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f43225a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f43226b;
        float fA = u.a(iMin, f11, f10, f11);
        float f12 = fArr[iMin];
        return d0.e(fArr[iMin + 1], f12, fA, f12);
    }
}
