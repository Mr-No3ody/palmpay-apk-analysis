package O;

import android.graphics.Color;
import androidx.camera.video.u;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6529f;

    public l(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f6524a = f10;
        this.f6525b = f11;
        this.f6526c = f12;
        this.f6527d = f13;
        this.f6528e = f14;
        this.f6529f = f15;
    }

    public static l b(int i7) {
        Y.k kVar = Y.k.f11257k;
        float fG = Y.a.g(Color.red(i7));
        float fG2 = Y.a.g(Color.green(i7));
        float fG3 = Y.a.g(Color.blue(i7));
        float[][] fArr = Y.a.f11232d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fG3) + (fArr2[1] * fG2) + (fArr2[0] * fG);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fG3) + (fArr3[1] * fG2) + (fArr3[0] * fG);
        float[] fArr4 = fArr[2];
        float f12 = (fG3 * fArr4[2]) + (fG2 * fArr4[1]) + (fG * fArr4[0]);
        float[][] fArr5 = Y.a.f11229a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = kVar.f11264g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = kVar.f11265h;
        float fPow = (float) Math.pow(((double) (fAbs * f19)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f17) * f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f18) * f19)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f20 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d2)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * kVar.f11259b;
        float f28 = kVar.f11258a;
        float f29 = kVar.f11261d;
        float fPow4 = ((float) Math.pow(f27 / f28, kVar.f11267j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f11263f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f25) < 20.14d ? f25 + 360.0f : f25)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f11262e) * kVar.f11260c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f31 = kVar.f11266i * fSqrt;
        Math.sqrt((fPow5 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f26;
        return new l(f25, fSqrt, fPow4, f32, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static l c(float f10, float f11, float f12) {
        Y.k kVar = Y.k.f11257k;
        float f13 = kVar.f11261d;
        double d2 = ((double) f10) / 100.0d;
        Math.sqrt(d2);
        float f14 = kVar.f11258a + 4.0f;
        float f15 = kVar.f11266i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d2))) * kVar.f11261d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new l(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public void a(float f10, float f11, int i7, int i10, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f6526c;
        float f17 = f13 + this.f6527d;
        float f18 = (this.f6524a * f14) + f16;
        float f19 = (this.f6525b * f15) + f17;
        float radians = (float) Math.toRadians(this.f6529f);
        float radians2 = (float) Math.toRadians(this.f6528e);
        double d2 = radians;
        double d10 = i10 * f15;
        float fSin = (((float) ((Math.sin(d2) * ((double) ((-i7) * f14))) - (Math.cos(d2) * d10))) * radians2) + f18;
        float fCos = (radians2 * ((float) ((Math.cos(d2) * ((double) (i7 * f14))) - (Math.sin(d2) * d10)))) + f19;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int d(Y.k kVar) {
        float fSqrt;
        float f10 = this.f6525b;
        double d2 = f10;
        float f11 = this.f6526c;
        if (d2 != 0.0d) {
            double d10 = f11;
            if (d10 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d10 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, kVar.f11263f), 0.73d), 1.1111111111111112d);
        double d11 = (this.f6524a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f11258a * ((float) Math.pow(((double) f11) / 100.0d, (1.0d / ((double) kVar.f11261d)) / ((double) kVar.f11267j)));
        float f12 = fCos * 3846.1538f * kVar.f11262e * kVar.f11260c;
        float f13 = fPow2 / kVar.f11259b;
        float fSin = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float fA = u.a(f16, 261.0f, f17 - (891.0f * f15), 1403.0f);
        float fA2 = u.a(f16, 6300.0f, f17 - (f15 * 220.0f), 1403.0f);
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
        float fSignum = Math.signum(f18);
        float f19 = 100.0f / kVar.f11265h;
        float fPow3 = fSignum * f19 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(fA) * f19 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA)) * 27.13d) / (400.0d - ((double) Math.abs(fA)))), 2.380952380952381d));
        float fSignum3 = Math.signum(fA2) * f19 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA2)) * 27.13d) / (400.0d - ((double) Math.abs(fA2)))), 2.380952380952381d));
        float[] fArr = kVar.f11264g;
        float f20 = fPow3 / fArr[0];
        float f21 = fSignum2 / fArr[1];
        float f22 = fSignum3 / fArr[2];
        float[][] fArr2 = Y.a.f11230b;
        float[] fArr3 = fArr2[0];
        float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
        float[] fArr4 = fArr2[1];
        float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
        float[] fArr5 = fArr2[2];
        return androidx.core.graphics.d.a(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
    }
}
