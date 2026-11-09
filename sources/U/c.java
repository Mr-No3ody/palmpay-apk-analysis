package U;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9096a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorMatrix f9097b = new ColorMatrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorMatrix f9098c = new ColorMatrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9099d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9100e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9101f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9102g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z3;
        float f10;
        char c6;
        float fLog;
        float fPow;
        float f11;
        float fLog2;
        ColorMatrix colorMatrix = this.f9097b;
        colorMatrix.reset();
        float f12 = this.f9100e;
        float[] fArr = this.f9096a;
        char c10 = 17;
        char c11 = 16;
        char c12 = 15;
        char c13 = 14;
        char c14 = '\f';
        boolean z8 = true;
        if (f12 != 1.0f) {
            float f13 = 1.0f - f12;
            float f14 = 0.2999f * f13;
            float f15 = 0.587f * f13;
            float f16 = f13 * 0.114f;
            fArr[0] = f14 + f12;
            fArr[1] = f15;
            fArr[2] = f16;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f14;
            fArr[6] = f15 + f12;
            fArr[7] = f16;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f14;
            fArr[11] = f15;
            fArr[12] = f16 + f12;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            z3 = true;
        } else {
            z3 = false;
        }
        float f17 = this.f9101f;
        ColorMatrix colorMatrix2 = this.f9098c;
        if (f17 != 1.0f) {
            colorMatrix2.setScale(f17, f17, f17, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z3 = true;
        }
        float f18 = this.f9102g;
        if (f18 != 1.0f) {
            if (f18 <= 0.0f) {
                f18 = 0.01f;
            }
            float f19 = (5000.0f / f18) / 100.0f;
            f10 = 1.0f;
            if (f19 > 66.0f) {
                double d2 = f19 - 60.0f;
                fPow = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d2, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f19)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f19 >= 1115947008) {
                f11 = 305.0448f;
                fLog2 = 255.0f;
            } else if (f19 > 19.0f) {
                f11 = 305.0448f;
                fLog2 = (((float) Math.log(f19 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                f11 = 305.0448f;
                fLog2 = 0.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            c6 = '\r';
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - f11;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[c14] = fMin6;
            fArr[13] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[c11] = 0.0f;
            fArr[c10] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z3 = true;
        } else {
            f10 = 1.0f;
            c10 = 17;
            c11 = 16;
            c12 = 15;
            c13 = 14;
            c6 = '\r';
            c14 = '\f';
        }
        float f20 = this.f9099d;
        if (f20 != f10) {
            fArr[0] = f20;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f20;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[c14] = f20;
            fArr[c6] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[c11] = 0.0f;
            fArr[c10] = 0.0f;
            fArr[18] = f10;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else {
            z8 = z3;
        }
        if (z8) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            imageView.clearColorFilter();
        }
    }
}
