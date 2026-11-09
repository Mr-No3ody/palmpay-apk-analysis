package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DrawingContent, BaseKeyframeAnimation$AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M.j f19690d = new M.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M.j f19691e = new M.j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f19692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f19693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f19694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f19695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f19698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f19701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f19702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f19703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.airbnb.lottie.animation.keyframe.d f19705s;
    public float t;

    public f(y yVar, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.c cVar) {
        Path path = new Path();
        this.f19692f = path;
        this.f19693g = new com.airbnb.lottie.animation.a(1, 0);
        this.f19694h = new RectF();
        this.f19695i = new ArrayList();
        this.t = 0.0f;
        this.f19689c = aVar;
        this.f19687a = cVar.f19930g;
        this.f19688b = cVar.f19931h;
        this.f19703q = yVar;
        this.f19696j = cVar.f19924a;
        path.setFillType(cVar.f19925b);
        this.f19704r = (int) (kVar.b() / 32.0f);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = cVar.f19926c.createAnimation();
        this.f19697k = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation;
        dVarCreateAnimation.a(this);
        aVar.a(dVarCreateAnimation);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation2 = cVar.f19927d.createAnimation();
        this.f19698l = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation2;
        dVarCreateAnimation2.a(this);
        aVar.a(dVarCreateAnimation2);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation3 = cVar.f19928e.createAnimation();
        this.f19699m = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation3;
        dVarCreateAnimation3.a(this);
        aVar.a(dVarCreateAnimation3);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation4 = cVar.f19929f.createAnimation();
        this.f19700n = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation4;
        dVarCreateAnimation4.a(this);
        aVar.a(dVarCreateAnimation4);
        if (aVar.e() != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = ((com.airbnb.lottie.model.animatable.b) aVar.e().f41176b).createAnimation();
            this.f19705s = hVarCreateAnimation;
            hVarCreateAnimation.a(this);
            aVar.a(this.f19705s);
        }
    }

    public final int[] a(int[] iArr) {
        r rVar = this.f19702p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i7 = 0;
            if (iArr.length == numArr.length) {
                while (i7 < iArr.length) {
                    iArr[i7] = numArr[i7].intValue();
                    i7++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i7 < numArr.length) {
                    iArr[i7] = numArr[i7].intValue();
                    i7++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        PointF pointF = LottieProperty.f19608a;
        if (obj == 4) {
            this.f19698l.j(cVar);
            return;
        }
        ColorFilter colorFilter = LottieProperty.f19602I;
        com.airbnb.lottie.model.layer.a aVar = this.f19689c;
        if (obj == colorFilter) {
            r rVar = this.f19701o;
            if (rVar != null) {
                aVar.h(rVar);
            }
            if (cVar == null) {
                this.f19701o = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f19701o = rVar2;
            rVar2.a(this);
            aVar.a(this.f19701o);
            return;
        }
        if (obj != LottieProperty.f19603J) {
            if (obj == LottieProperty.f19612e) {
                com.airbnb.lottie.animation.keyframe.d dVar = this.f19705s;
                if (dVar != null) {
                    dVar.j(cVar);
                    return;
                }
                r rVar3 = new r(null, cVar);
                this.f19705s = rVar3;
                rVar3.a(this);
                aVar.a(this.f19705s);
                return;
            }
            return;
        }
        r rVar4 = this.f19702p;
        if (rVar4 != null) {
            aVar.h(rVar4);
        }
        if (cVar == null) {
            this.f19702p = null;
            return;
        }
        this.f19690d.a();
        this.f19691e.a();
        r rVar5 = new r(null, cVar);
        this.f19702p = rVar5;
        rVar5.a(this);
        aVar.a(this.f19702p);
    }

    public final int b() {
        float f10 = this.f19699m.f19792d;
        float f11 = this.f19704r;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f19700n.f19792d * f11);
        int iRound3 = Math.round(this.f19697k.f19792d * f11);
        int i7 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i7 = i7 * 31 * iRound2;
        }
        return iRound3 != 0 ? i7 * 31 * iRound3 : i7;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader radialGradient;
        float[] fArr2;
        int[] iArr2;
        if (this.f19688b) {
            return;
        }
        Path path = this.f19692f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19695i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((PathContent) arrayList.get(i10)).getPath(), matrix);
            i10++;
        }
        path.computeBounds(this.f19694h, false);
        int i11 = this.f19696j;
        com.airbnb.lottie.animation.keyframe.i iVar = this.f19697k;
        com.airbnb.lottie.animation.keyframe.i iVar2 = this.f19700n;
        com.airbnb.lottie.animation.keyframe.i iVar3 = this.f19699m;
        if (i11 == 1) {
            long jB = b();
            M.j jVar = this.f19690d;
            radialGradient = (LinearGradient) jVar.b(jB);
            if (radialGradient == null) {
                PointF pointF = (PointF) iVar3.e();
                PointF pointF2 = (PointF) iVar2.e();
                com.airbnb.lottie.model.content.b bVar = (com.airbnb.lottie.model.content.b) iVar.e();
                int[] iArrA = a(bVar.f19923b);
                if (iArrA.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrA[0], iArrA[0]};
                } else {
                    fArr2 = bVar.f19922a;
                    iArr2 = iArrA;
                }
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                jVar.e(jB, radialGradient);
            }
        } else {
            long jB2 = b();
            M.j jVar2 = this.f19691e;
            RadialGradient radialGradient2 = (RadialGradient) jVar2.b(jB2);
            if (radialGradient2 != null) {
                radialGradient = radialGradient2;
            } else {
                PointF pointF3 = (PointF) iVar3.e();
                PointF pointF4 = (PointF) iVar2.e();
                com.airbnb.lottie.model.content.b bVar2 = (com.airbnb.lottie.model.content.b) iVar.e();
                int[] iArrA2 = a(bVar2.f19923b);
                if (iArrA2.length < 2) {
                    fArr = new float[]{0.0f, 1.0f};
                    iArr = new int[]{iArrA2[0], iArrA2[0]};
                } else {
                    fArr = bVar2.f19922a;
                    iArr = iArrA2;
                }
                float[] fArr3 = fArr;
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f10, pointF4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr3, Shader.TileMode.CLAMP);
                jVar2.e(jB2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        com.airbnb.lottie.animation.a aVar2 = this.f19693g;
        aVar2.setShader(radialGradient);
        r rVar = this.f19701o;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f19705s;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                aVar2.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f19698l.e()).intValue() / 100.0f;
        aVar2.setAlpha(com.airbnb.lottie.utils.g.c((int) (i7 * fIntValue)));
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar2);
        }
        canvas.drawPath(path, aVar2);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f19692f;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19695i;
            if (i7 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i7)).getPath(), matrix);
                i7++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19687a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener
    public final void onValueChanged() {
        this.f19703q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void resolveKeyPath(p212o1.e eVar, int i7, List list, p212o1.e eVar2) {
        com.airbnb.lottie.utils.g.g(eVar, i7, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void setContents(List list, List list2) {
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Content content = (Content) list2.get(i7);
            if (content instanceof PathContent) {
                this.f19695i.add((PathContent) content);
            }
        }
    }
}
