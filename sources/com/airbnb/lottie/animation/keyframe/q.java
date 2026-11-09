package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f19833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f19835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f19836e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f19843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f19844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f19845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f19846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f19847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f19848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f19849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f19850s;
    public h t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f19851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f19852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f19853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f19854x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f19832a = new Matrix();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19837f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19838g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19839h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19840i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19841j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19842k = true;

    public q(com.airbnb.lottie.model.animatable.d dVar) {
        F1.c cVar = dVar.f19904a;
        this.f19843l = cVar == null ? null : cVar.createAnimation();
        AnimatableValue animatableValue = dVar.f19905b;
        this.f19844m = animatableValue == null ? null : animatableValue.createAnimation();
        com.airbnb.lottie.model.animatable.a aVar = dVar.f19906c;
        this.f19845n = aVar == null ? null : aVar.createAnimation();
        com.airbnb.lottie.model.animatable.b bVar = dVar.f19907d;
        this.f19846o = bVar == null ? null : bVar.createAnimation();
        com.airbnb.lottie.model.animatable.b bVar2 = dVar.f19909f;
        this.f19848q = bVar2 == null ? null : bVar2.createAnimation();
        this.f19854x = dVar.f19916m;
        com.airbnb.lottie.model.animatable.b bVar3 = dVar.f19911h;
        this.f19850s = bVar3 == null ? null : bVar3.createAnimation();
        com.airbnb.lottie.model.animatable.b bVar4 = dVar.f19912i;
        this.t = bVar4 == null ? null : bVar4.createAnimation();
        com.airbnb.lottie.model.animatable.b bVar5 = dVar.f19913j;
        this.f19851u = bVar5 == null ? null : bVar5.createAnimation();
        if (this.f19848q != null) {
            this.f19833b = new Matrix();
            this.f19834c = new Matrix();
            this.f19835d = new Matrix();
            this.f19836e = new float[9];
        } else {
            this.f19833b = null;
            this.f19834c = null;
            this.f19835d = null;
            this.f19836e = null;
        }
        com.airbnb.lottie.model.animatable.b bVar6 = dVar.f19910g;
        this.f19849r = bVar6 == null ? null : bVar6.createAnimation();
        com.airbnb.lottie.model.animatable.a aVar2 = dVar.f19908e;
        if (aVar2 != null) {
            this.f19847p = aVar2.createAnimation();
        }
        com.airbnb.lottie.model.animatable.b bVar7 = dVar.f19914k;
        if (bVar7 != null) {
            this.f19852v = bVar7.createAnimation();
        } else {
            this.f19852v = null;
        }
        com.airbnb.lottie.model.animatable.b bVar8 = dVar.f19915l;
        if (bVar8 != null) {
            this.f19853w = bVar8.createAnimation();
        } else {
            this.f19853w = null;
        }
    }

    public final void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.a(this.f19847p);
        aVar.a(this.f19852v);
        aVar.a(this.f19853w);
        aVar.a(this.f19843l);
        aVar.a(this.f19844m);
        aVar.a(this.f19845n);
        aVar.a(this.f19846o);
        aVar.a(this.f19848q);
        aVar.a(this.f19849r);
        aVar.a(this.f19850s);
        aVar.a(this.t);
        aVar.a(this.f19851u);
    }

    public final void b(BaseKeyframeAnimation$AnimationListener baseKeyframeAnimation$AnimationListener) {
        d dVar = this.f19847p;
        if (dVar != null) {
            dVar.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar2 = this.f19852v;
        if (dVar2 != null) {
            dVar2.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar3 = this.f19853w;
        if (dVar3 != null) {
            dVar3.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar4 = this.f19843l;
        if (dVar4 != null) {
            dVar4.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar5 = this.f19844m;
        if (dVar5 != null) {
            dVar5.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar6 = this.f19845n;
        if (dVar6 != null) {
            dVar6.a(baseKeyframeAnimation$AnimationListener);
        }
        d dVar7 = this.f19846o;
        if (dVar7 != null) {
            dVar7.a(baseKeyframeAnimation$AnimationListener);
        }
        h hVar = this.f19848q;
        if (hVar != null) {
            hVar.a(baseKeyframeAnimation$AnimationListener);
        }
        h hVar2 = this.f19849r;
        if (hVar2 != null) {
            hVar2.a(baseKeyframeAnimation$AnimationListener);
        }
        h hVar3 = this.f19850s;
        if (hVar3 != null) {
            hVar3.a(baseKeyframeAnimation$AnimationListener);
            this.f19850s.a(new p(this, 0));
        }
        h hVar4 = this.t;
        if (hVar4 != null) {
            hVar4.a(baseKeyframeAnimation$AnimationListener);
            this.t.a(new p(this, 1));
        }
        h hVar5 = this.f19851u;
        if (hVar5 != null) {
            hVar5.a(baseKeyframeAnimation$AnimationListener);
            this.f19851u.a(new p(this, 2));
        }
    }

    public final boolean c(Object obj, p243q1.c cVar) {
        if (obj == LottieProperty.f19608a) {
            d dVar = this.f19843l;
            if (dVar == null) {
                this.f19843l = new r(new PointF(), cVar);
                return true;
            }
            dVar.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19609b) {
            d dVar2 = this.f19844m;
            if (dVar2 == null) {
                this.f19844m = new r(new PointF(), cVar);
                return true;
            }
            dVar2.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19610c) {
            d dVar3 = this.f19844m;
            if (dVar3 instanceof n) {
                n nVar = (n) dVar3;
                p243q1.c cVar2 = nVar.f19825m;
                nVar.f19825m = cVar;
                return true;
            }
        }
        if (obj == LottieProperty.f19611d) {
            d dVar4 = this.f19844m;
            if (dVar4 instanceof n) {
                n nVar2 = (n) dVar4;
                p243q1.c cVar3 = nVar2.f19826n;
                nVar2.f19826n = cVar;
                return true;
            }
        }
        if (obj == LottieProperty.f19617j) {
            d dVar5 = this.f19845n;
            if (dVar5 == null) {
                this.f19845n = new r(new p243q1.d(), cVar);
                return true;
            }
            dVar5.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19618k) {
            d dVar6 = this.f19846o;
            if (dVar6 == null) {
                this.f19846o = new r(Float.valueOf(0.0f), cVar);
                return true;
            }
            dVar6.j(cVar);
            return true;
        }
        if (obj == 3) {
            d dVar7 = this.f19847p;
            if (dVar7 == null) {
                this.f19847p = new r(100, cVar);
                return true;
            }
            dVar7.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19594A) {
            d dVar8 = this.f19852v;
            if (dVar8 == null) {
                this.f19852v = new r(Float.valueOf(100.0f), cVar);
                return true;
            }
            dVar8.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19595B) {
            d dVar9 = this.f19853w;
            if (dVar9 == null) {
                this.f19853w = new r(Float.valueOf(100.0f), cVar);
                return true;
            }
            dVar9.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19622o) {
            if (this.f19848q == null) {
                this.f19848q = new h(Collections.singletonList(new p243q1.a(Float.valueOf(0.0f))));
            }
            this.f19848q.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19623p) {
            if (this.f19849r == null) {
                this.f19849r = new h(Collections.singletonList(new p243q1.a(Float.valueOf(0.0f))));
            }
            this.f19849r.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19619l) {
            if (this.f19850s == null) {
                this.f19850s = new h(Collections.singletonList(new p243q1.a(Float.valueOf(0.0f))));
            }
            this.f19850s.j(cVar);
            return true;
        }
        if (obj == LottieProperty.f19620m) {
            if (this.t == null) {
                this.t = new h(Collections.singletonList(new p243q1.a(Float.valueOf(0.0f))));
            }
            this.t.j(cVar);
            return true;
        }
        if (obj != LottieProperty.f19621n) {
            return false;
        }
        if (this.f19851u == null) {
            this.f19851u = new h(Collections.singletonList(new p243q1.a(Float.valueOf(0.0f))));
        }
        this.f19851u.j(cVar);
        return true;
    }

    public final void d() {
        for (int i7 = 0; i7 < 9; i7++) {
            this.f19836e[i7] = 0.0f;
        }
    }

    public final Matrix e() {
        h hVar;
        h hVar2;
        PointF pointF;
        p243q1.d dVar;
        PointF pointF2;
        Matrix matrix = this.f19832a;
        matrix.reset();
        h hVar3 = this.f19850s;
        if ((hVar3 == null || hVar3.l() == 0.0f) && (((hVar = this.t) == null || hVar.l() == 0.0f) && ((hVar2 = this.f19851u) == null || hVar2.l() == 0.0f))) {
            d dVar2 = this.f19844m;
            if (dVar2 != null && (pointF2 = (PointF) dVar2.e()) != null) {
                float f10 = pointF2.x;
                if (f10 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f10, pointF2.y);
                }
            }
            if (!this.f19854x) {
                d dVar3 = this.f19846o;
                if (dVar3 != null) {
                    float fFloatValue = dVar3 instanceof r ? ((Float) dVar3.e()).floatValue() : ((h) dVar3).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (dVar2 != null) {
                float f11 = dVar2.f19792d;
                PointF pointF3 = (PointF) dVar2.e();
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                dVar2.i(1.0E-4f + f11);
                PointF pointF4 = (PointF) dVar2.e();
                dVar2.i(f11);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
            }
            h hVar4 = this.f19848q;
            if (hVar4 != null) {
                h hVar5 = this.f19849r;
                float fCos = hVar5 == null ? 0.0f : (float) Math.cos(Math.toRadians((-hVar5.l()) + 90.0f));
                h hVar6 = this.f19849r;
                float fSin = hVar6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-hVar6.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(hVar4.l()));
                d();
                float[] fArr = this.f19836e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f14 = -fSin;
                fArr[3] = f14;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f19833b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f19834c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f14;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f19835d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            d dVar4 = this.f19845n;
            if (dVar4 != null && (dVar = (p243q1.d) dVar4.e()) != null) {
                float f15 = dVar.f41445a;
                if (f15 != 1.0f || dVar.f41446b != 1.0f) {
                    matrix.preScale(f15, dVar.f41446b);
                }
            }
            d dVar5 = this.f19843l;
            if (dVar5 != null && (pointF = (PointF) dVar5.e()) != null) {
                float f16 = pointF.x;
                if (f16 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f16, -pointF.y);
                }
            }
        } else {
            h hVar7 = this.f19850s;
            float fL = hVar7 != null ? hVar7.l() : 0.0f;
            h hVar8 = this.t;
            float fL2 = hVar8 != null ? hVar8.l() : 0.0f;
            h hVar9 = this.f19851u;
            float fL3 = hVar9 != null ? hVar9.l() : 0.0f;
            if (this.f19842k || fL != this.f19837f || fL2 != this.f19838g || fL3 != this.f19839h) {
                this.f19837f = fL;
                this.f19838g = fL2;
                this.f19839h = fL3;
                if (fL != 0.0f) {
                    this.f19840i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.f19840i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.f19841j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.f19841j = 1.0f;
                }
                this.f19842k = false;
            }
            d dVar6 = this.f19843l;
            PointF pointF5 = dVar6 == null ? null : (PointF) dVar6.e();
            d dVar7 = this.f19844m;
            PointF pointF6 = dVar7 == null ? null : (PointF) dVar7.e();
            d dVar8 = this.f19845n;
            p243q1.d dVar9 = dVar8 != null ? (p243q1.d) dVar8.e() : null;
            float f17 = dVar9 != null ? dVar9.f41445a : 1.0f;
            float f18 = dVar9 != null ? dVar9.f41446b : 1.0f;
            float f19 = this.f19840i;
            float f20 = this.f19841j;
            matrix.reset();
            if (pointF6 != null) {
                float f21 = pointF6.x;
                if (f21 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f21, pointF6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f20, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, f19);
            }
            if (f17 != 1.0f || f18 != 1.0f) {
                matrix.preScale(f17, f18);
            }
            if (pointF5 != null) {
                float f22 = pointF5.x;
                if (f22 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f22, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f10) {
        d dVar = this.f19844m;
        PointF pointF = dVar == null ? null : (PointF) dVar.e();
        d dVar2 = this.f19845n;
        p243q1.d dVar3 = dVar2 == null ? null : (p243q1.d) dVar2.e();
        d dVar4 = this.f19843l;
        PointF pointF2 = dVar4 != null ? (PointF) dVar4.e() : null;
        Matrix matrix = this.f19832a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        h hVar = this.f19850s;
        float fL = hVar != null ? hVar.l() * f10 : 0.0f;
        h hVar2 = this.t;
        float fL2 = hVar2 != null ? hVar2.l() * f10 : 0.0f;
        h hVar3 = this.f19851u;
        float fL3 = hVar3 != null ? hVar3.l() * f10 : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            d dVar5 = this.f19846o;
            if (dVar5 != null) {
                matrix.preRotate(((Float) dVar5.e()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (dVar3 != null) {
            double d2 = f10;
            matrix.preScale((float) Math.pow(dVar3.f41445a, d2), (float) Math.pow(dVar3.f41446b, d2));
        }
        return matrix;
    }
}
