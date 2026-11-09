package androidx.dynamicanimation.animation;

import Re.n;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Force {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f16869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f16872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f16873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f16874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f16875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f16876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f16877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f16878j;

    public k() {
        this.f16869a = Math.sqrt(1500.0d);
        this.f16870b = 0.5d;
        this.f16871c = false;
        this.f16877i = Double.MAX_VALUE;
        this.f16878j = new n();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f16870b = f10;
        this.f16871c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f16869a = Math.sqrt(f10);
        this.f16871c = false;
    }

    public final n c(double d2, double d10, long j6) {
        double dSin;
        double dCos;
        if (!this.f16871c) {
            if (this.f16877i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d11 = this.f16870b;
            if (d11 > 1.0d) {
                double d12 = this.f16869a;
                this.f16874f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                double d13 = this.f16870b;
                double d14 = this.f16869a;
                this.f16875g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f16876h = Math.sqrt(1.0d - (d11 * d11)) * this.f16869a;
            }
            this.f16871c = true;
        }
        double d15 = j6 / 1000.0d;
        double d16 = d2 - this.f16877i;
        double d17 = this.f16870b;
        if (d17 > 1.0d) {
            double d18 = this.f16875g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f16874f);
            double d20 = d16 - d19;
            dSin = (Math.pow(2.718281828459045d, this.f16874f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f16875g;
            double dPow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f16874f;
            dCos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + dPow;
        } else if (d17 == 1.0d) {
            double d23 = this.f16869a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double dPow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f16869a) * d15) * d25;
            double d26 = -this.f16869a;
            dCos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (dPow3 * d26);
            dSin = dPow2;
        } else {
            double d27 = 1.0d / this.f16876h;
            double d28 = this.f16869a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            dSin = ((Math.sin(this.f16876h * d15) * d29) + (Math.cos(this.f16876h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f16869a;
            double d31 = this.f16870b;
            double d32 = (-d30) * dSin * d31;
            double dPow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.f16876h;
            double dSin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.f16876h;
            dCos = (((Math.cos(d34 * d15) * d29 * d34) + dSin2) * dPow4) + d32;
        }
        float f10 = (float) (dSin + this.f16877i);
        n nVar = this.f16878j;
        nVar.f8589a = f10;
        nVar.f8590b = (float) dCos;
        return nVar;
    }

    @Override // androidx.dynamicanimation.animation.Force
    public final float getAcceleration(float f10, float f11) {
        float f12 = f10 - ((float) this.f16877i);
        double d2 = this.f16869a;
        return (float) (((-(d2 * d2)) * ((double) f12)) - (((d2 * 2.0d) * this.f16870b) * ((double) f11)));
    }

    @Override // androidx.dynamicanimation.animation.Force
    public final boolean isAtEquilibrium(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f16873e && ((double) Math.abs(f10 - ((float) this.f16877i))) < this.f16872d;
    }

    public k(float f10) {
        this.f16869a = Math.sqrt(1500.0d);
        this.f16870b = 0.5d;
        this.f16871c = false;
        this.f16878j = new n();
        this.f16877i = f10;
    }
}
