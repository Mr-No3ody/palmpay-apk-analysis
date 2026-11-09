package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.y;
import com.horcrux.svg.d0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements PathContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f19727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f19732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f19737p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19739r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19722a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19723b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f19724c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f19725d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F1.b f19738q = new F1.b(2);

    public i(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.g gVar) {
        this.f19727f = yVar;
        this.f19726e = gVar.f19952a;
        int i7 = gVar.f19953b;
        this.f19728g = i7;
        this.f19729h = gVar.f19961j;
        this.f19730i = gVar.f19962k;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = gVar.f19954c.createAnimation();
        this.f19731j = hVarCreateAnimation;
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = gVar.f19955d.createAnimation();
        this.f19732k = dVarCreateAnimation;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation2 = gVar.f19956e.createAnimation();
        this.f19733l = hVarCreateAnimation2;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation3 = gVar.f19958g.createAnimation();
        this.f19735n = hVarCreateAnimation3;
        com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation4 = gVar.f19960i.createAnimation();
        this.f19737p = hVarCreateAnimation4;
        if (i7 == 1) {
            this.f19734m = gVar.f19957f.createAnimation();
            this.f19736o = gVar.f19959h.createAnimation();
        } else {
            this.f19734m = null;
            this.f19736o = null;
        }
        aVar.a(hVarCreateAnimation);
        aVar.a(dVarCreateAnimation);
        aVar.a(hVarCreateAnimation2);
        aVar.a(hVarCreateAnimation3);
        aVar.a(hVarCreateAnimation4);
        if (i7 == 1) {
            aVar.a(this.f19734m);
            aVar.a(this.f19736o);
        }
        hVarCreateAnimation.a(this);
        dVarCreateAnimation.a(this);
        hVarCreateAnimation2.a(this);
        hVarCreateAnimation3.a(this);
        hVarCreateAnimation4.a(this);
        if (i7 == 1) {
            this.f19734m.a(this);
            this.f19736o.a(this);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        com.airbnb.lottie.animation.keyframe.h hVar;
        com.airbnb.lottie.animation.keyframe.h hVar2;
        if (obj == LottieProperty.f19627u) {
            this.f19731j.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19628v) {
            this.f19733l.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19616i) {
            this.f19732k.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19629w && (hVar2 = this.f19734m) != null) {
            hVar2.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19630x) {
            this.f19735n.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19631y && (hVar = this.f19736o) != null) {
            hVar.j(cVar);
        } else if (obj == LottieProperty.f19632z) {
            this.f19737p.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19726e;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z3;
        float f10;
        double d2;
        float fCos;
        float fSin;
        float f11;
        float f12;
        int i7;
        int i10;
        double d10;
        boolean z8 = this.f19739r;
        Path path = this.f19722a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f19729h) {
            this.f19739r = true;
            return path;
        }
        int i11 = F.i(this.f19728g);
        com.airbnb.lottie.animation.keyframe.d dVar = this.f19732k;
        float f13 = 0.0f;
        com.airbnb.lottie.animation.keyframe.h hVar = this.f19735n;
        com.airbnb.lottie.animation.keyframe.h hVar2 = this.f19737p;
        com.airbnb.lottie.animation.keyframe.h hVar3 = this.f19733l;
        com.airbnb.lottie.animation.keyframe.h hVar4 = this.f19731j;
        if (i11 == 0) {
            z3 = true;
            float fFloatValue = ((Float) hVar4.e()).floatValue();
            double radians = Math.toRadians((hVar3 != null ? ((Float) hVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d11 = fFloatValue;
            float f14 = (float) (6.283185307179586d / d11);
            if (this.f19730i) {
                f14 *= -1.0f;
            }
            float f15 = f14;
            float f16 = f15 / 2.0f;
            float f17 = fFloatValue - ((int) fFloatValue);
            if (f17 != 0.0f) {
                radians += (double) ((1.0f - f17) * f16);
            }
            float fFloatValue2 = ((Float) hVar.e()).floatValue();
            float fFloatValue3 = ((Float) this.f19734m.e()).floatValue();
            com.airbnb.lottie.animation.keyframe.h hVar5 = this.f19736o;
            float fFloatValue4 = hVar5 != null ? ((Float) hVar5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = hVar2 != null ? ((Float) hVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f17 != 0.0f) {
                float fE = d0.e(fFloatValue2, fFloatValue3, f17, fFloatValue3);
                double d12 = fE;
                fCos = (float) (Math.cos(radians) * d12);
                fSin = (float) (Math.sin(radians) * d12);
                path.moveTo(fCos, fSin);
                d2 = radians + ((double) ((f15 * f17) / 2.0f));
                f11 = fE;
                f10 = f16;
            } else {
                double d13 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d13);
                float fSin2 = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos2, fSin2);
                f10 = f16;
                d2 = radians + ((double) f10);
                fCos = fCos2;
                fSin = fSin2;
                f11 = 0.0f;
            }
            double dCeil = Math.ceil(d11) * 2.0d;
            double d14 = d2;
            int i12 = 0;
            boolean z10 = false;
            while (true) {
                double d15 = i12;
                if (d15 >= dCeil) {
                    break;
                }
                float f18 = z10 ? fFloatValue2 : fFloatValue3;
                float f19 = (f11 == f13 || d15 != dCeil - 2.0d) ? f10 : (f15 * f17) / 2.0f;
                if (f11 != f13 && d15 == dCeil - 1.0d) {
                    f18 = f11;
                }
                double d16 = f18;
                float fCos3 = (float) (Math.cos(d14) * d16);
                float f20 = f15;
                float fSin3 = (float) (Math.sin(d14) * d16);
                if (fFloatValue4 == f13 && fFloatValue5 == f13) {
                    path.lineTo(fCos3, fSin3);
                    f12 = f17;
                    i7 = i12;
                } else {
                    f12 = f17;
                    Path path2 = path;
                    float f21 = fSin;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    i7 = i12;
                    float f22 = fCos;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f23 = z10 ? fFloatValue4 : fFloatValue5;
                    float f24 = z10 ? fFloatValue5 : fFloatValue4;
                    float f25 = (z10 ? fFloatValue3 : fFloatValue2) * f23 * 0.47829f;
                    float f26 = fCos4 * f25;
                    float f27 = f25 * fSin4;
                    float f28 = (z10 ? fFloatValue2 : fFloatValue3) * f24 * 0.47829f;
                    float f29 = fCos5 * f28;
                    float f30 = f28 * fSin5;
                    if (f17 != 0.0f) {
                        if (i7 == 0) {
                            f26 *= f12;
                            f27 *= f12;
                        } else if (d15 == dCeil - 1.0d) {
                            f29 *= f12;
                            f30 *= f12;
                        }
                    }
                    path = path2;
                    path.cubicTo(f22 - f26, f21 - f27, f29 + fCos3, fSin3 + f30, fCos3, fSin3);
                }
                d14 += (double) f19;
                z10 = !z10;
                i12 = i7 + 1;
                fCos = fCos3;
                fSin = fSin3;
                f17 = f12;
                f15 = f20;
                f13 = f13;
            }
            PointF pointF = (PointF) dVar.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i11 != 1) {
            z3 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) hVar4.e()).floatValue());
            double radians2 = Math.toRadians((hVar3 != null ? ((Float) hVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d17 = iFloor;
            float fFloatValue6 = ((Float) hVar2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) hVar.e()).floatValue();
            double d18 = fFloatValue7;
            z3 = true;
            float fCos6 = (float) (Math.cos(radians2) * d18);
            float fSin6 = (float) (Math.sin(radians2) * d18);
            path.moveTo(fCos6, fSin6);
            double d19 = (float) (6.283185307179586d / d17);
            double dCeil2 = Math.ceil(d17);
            double d20 = radians2 + d19;
            int i13 = 0;
            while (true) {
                double d21 = i13;
                if (d21 >= dCeil2) {
                    break;
                }
                double d22 = dCeil2;
                float fCos7 = (float) (Math.cos(d20) * d18);
                float fSin7 = (float) (Math.sin(d20) * d18);
                if (fFloatValue6 != 0.0f) {
                    i10 = i13;
                    Path path3 = path;
                    d10 = d19;
                    double dAtan4 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    float f31 = fCos6;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f33 = fCos8 * f32;
                    float f34 = f32 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f32;
                    float fSin9 = f32 * ((float) Math.sin(dAtan5));
                    if (d21 == d22 - 1.0d) {
                        Path path4 = this.f19723b;
                        path4.reset();
                        path4.moveTo(f31, fSin6);
                        float f35 = f31 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos7 + fCos9;
                        float f38 = fSin7 + fSin9;
                        path4.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f19724c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f19725d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f35, f36, f37, f38, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f39 = fSin7 + fSin9;
                        path = path3;
                        path.cubicTo(f31 - f33, fSin6 - f34, fCos7 + fCos9, f39, fCos7, fSin7);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    }
                } else {
                    i10 = i13;
                    d10 = d19;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d21 != d22 - 1.0d) {
                        path.lineTo(fCos6, fSin6);
                    }
                    i13 = i10 + 1;
                    d19 = d10;
                    dCeil2 = d22;
                }
                d20 += d10;
                i13 = i10 + 1;
                d19 = d10;
                dCeil2 = d22;
            }
            PointF pointF2 = (PointF) dVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f19738q.f(path);
        this.f19739r = z3;
        return path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19739r = false;
        this.f19727f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Content content = (Content) list.get(i7);
            if (content instanceof o) {
                o oVar = (o) content;
                if (oVar.f19779d == 1) {
                    this.f19738q.f2516a.add(oVar);
                    oVar.a(this);
                }
            }
        }
    }
}
