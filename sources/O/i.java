package O;

import androidx.constraintlayout.core.motion.utils.StopEngine;

/* JADX INFO: loaded from: classes.dex */
public final class i implements StopEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f6502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6508i;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final String debug(String str, float f10) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f10) {
        double d2 = f10 - this.f6503d;
        double d10 = this.f6501b;
        double d11 = this.f6500a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d10 / ((double) this.f6506g)) * d2) * 4.0d)) + 1.0d);
        double d12 = d2 / ((double) iSqrt);
        int i7 = 0;
        while (i7 < iSqrt) {
            double d13 = this.f6504e;
            double d14 = this.f6502c;
            double d15 = d12;
            double d16 = this.f6505f;
            double d17 = this.f6506g;
            double d18 = ((((((-d10) * (d13 - d14)) - (d11 * d16)) / d17) * d15) / 2.0d) + d16;
            double d19 = ((((-((((d15 * d18) / 2.0d) + d13) - d14)) * d10) - (d18 * d11)) / d17) * d15;
            double d20 = (d19 / 2.0d) + d16;
            float f11 = (float) (d16 + d19);
            this.f6505f = f11;
            float f12 = (float) ((d20 * d15) + d13);
            this.f6504e = f12;
            int i10 = this.f6508i;
            if (i10 > 0) {
                if (f12 < 0.0f && (i10 & 1) == 1) {
                    this.f6504e = -f12;
                    this.f6505f = -f11;
                }
                float f13 = this.f6504e;
                if (f13 > 1.0f && (i10 & 2) == 2) {
                    this.f6504e = 2.0f - f13;
                    this.f6505f = -this.f6505f;
                }
            }
            i7++;
            d12 = d15;
        }
        this.f6503d = f10;
        return this.f6504e;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getVelocity(float f10) {
        return this.f6505f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final boolean isStopped() {
        double d2 = ((double) this.f6504e) - this.f6502c;
        double d10 = this.f6501b;
        double d11 = this.f6505f;
        return Math.sqrt((((d10 * d2) * d2) + ((d11 * d11) * ((double) this.f6506g))) / d10) <= ((double) this.f6507h);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getVelocity() {
        return 0.0f;
    }
}
