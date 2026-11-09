package O;

import C0.G;
import N8.q0;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class k implements StopEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6523n;

    public final void a(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f6510a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f6520k = "backward accelerate, decelerate";
                this.f6519j = 2;
                this.f6510a = f10;
                this.f6511b = fSqrt;
                this.f6512c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f6513d = f17;
                this.f6514e = fSqrt / f12;
                this.f6516g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f6517h = f11;
                this.f6518i = f11;
                return;
            }
            this.f6520k = "backward accelerate cruse decelerate";
            this.f6519j = 3;
            this.f6510a = f10;
            this.f6511b = f13;
            this.f6512c = f13;
            float f18 = (f13 - f10) / f12;
            this.f6513d = f18;
            float f19 = f13 / f12;
            this.f6515f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f6514e = ((f11 - f20) - f21) / f13;
            this.f6516g = f20;
            this.f6517h = f11 - f21;
            this.f6518i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f6520k = "hard stop";
            this.f6519j = 1;
            this.f6510a = f10;
            this.f6511b = 0.0f;
            this.f6516g = f11;
            this.f6513d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f6520k = "cruse decelerate";
            this.f6519j = 2;
            this.f6510a = f10;
            this.f6511b = f10;
            this.f6512c = 0.0f;
            this.f6516g = f22;
            this.f6517h = f11;
            this.f6513d = f23;
            this.f6514e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f6513d = f24;
        float f25 = fSqrt2 / f12;
        this.f6514e = f25;
        if (fSqrt2 < f13) {
            this.f6520k = "accelerate decelerate";
            this.f6519j = 2;
            this.f6510a = f10;
            this.f6511b = fSqrt2;
            this.f6512c = 0.0f;
            this.f6513d = f24;
            this.f6514e = f25;
            this.f6516g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f6517h = f11;
            return;
        }
        this.f6520k = "accelerate cruse decelerate";
        this.f6519j = 3;
        this.f6510a = f10;
        this.f6511b = f13;
        this.f6512c = f13;
        float f26 = (f13 - f10) / f12;
        this.f6513d = f26;
        float f27 = f13 / f12;
        this.f6515f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f6514e = ((f11 - f28) - f29) / f13;
        this.f6516g = f28;
        this.f6517h = f11 - f29;
        this.f6518i = f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final String debug(String str, float f10) {
        StringBuilder sbT = G.t(G.r(G.t(str, " ===== "), this.f6520k, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), str);
        sbT.append(this.f6521l ? "backwards" : "forward ");
        sbT.append(" time = ");
        sbT.append(f10);
        sbT.append("  stages ");
        String str2 = G.n(this.f6519j, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, sbT) + str + " dur " + this.f6513d + " vel " + this.f6510a + " pos " + this.f6516g + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        if (this.f6519j > 1) {
            str2 = str2 + str + " dur " + this.f6514e + " vel " + this.f6511b + " pos " + this.f6517h + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        if (this.f6519j > 2) {
            str2 = str2 + str + " dur " + this.f6515f + " vel " + this.f6512c + " pos " + this.f6518i + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        float f11 = this.f6513d;
        if (f10 <= f11) {
            return q0.y(str2, str, "stage 0\n");
        }
        int i7 = this.f6519j;
        if (i7 == 1) {
            return q0.y(str2, str, "end stage 0\n");
        }
        float f12 = f10 - f11;
        float f13 = this.f6514e;
        if (f12 < f13) {
            return q0.y(str2, str, " stage 1\n");
        }
        if (i7 == 2) {
            return q0.y(str2, str, "end stage 1\n");
        }
        return f12 - f13 < this.f6515f ? q0.y(str2, str, " stage 2\n") : q0.y(str2, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f10) {
        float f11;
        float f12 = this.f6513d;
        if (f10 <= f12) {
            float f13 = this.f6510a;
            f11 = ((((this.f6511b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i7 = this.f6519j;
            if (i7 == 1) {
                f11 = this.f6516g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f6514e;
                if (f14 < f15) {
                    float f16 = this.f6516g;
                    float f17 = this.f6511b;
                    f11 = ((((this.f6512c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i7 == 2) {
                    f11 = this.f6517h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f6515f;
                    if (f18 <= f19) {
                        float f20 = this.f6517h;
                        float f21 = this.f6512c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f6518i;
                    }
                }
            }
        }
        this.f6523n = f10;
        return this.f6521l ? this.f6522m - f11 : this.f6522m + f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getVelocity(float f10) {
        float f11;
        float f12;
        float f13 = this.f6513d;
        if (f10 <= f13) {
            f11 = this.f6510a;
            f12 = this.f6511b;
        } else {
            int i7 = this.f6519j;
            if (i7 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f6514e;
            if (f10 >= f13) {
                if (i7 == 2) {
                    return this.f6517h;
                }
                float f14 = f10 - f13;
                float f15 = this.f6515f;
                if (f14 >= f15) {
                    return this.f6518i;
                }
                float f16 = this.f6512c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f6511b;
            f12 = this.f6512c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.f6518i - this.f6523n) < 1.0E-5f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getVelocity() {
        return this.f6521l ? -getVelocity(this.f6523n) : getVelocity(this.f6523n);
    }
}
