package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public r f19706A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f19707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f19708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final M.j f19709s;
    public final M.j t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f19710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19711v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.i f19715z;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.d dVar) {
        int i7 = F.i(dVar.f19939h);
        Paint.Cap cap = i7 != 0 ? i7 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int i10 = F.i(dVar.f19940i);
        super(yVar, aVar, cap, i10 != 0 ? i10 != 1 ? i10 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, dVar.f19941j, dVar.f19935d, dVar.f19938g, dVar.f19942k, dVar.f19943l);
        this.f19709s = new M.j();
        this.t = new M.j();
        this.f19710u = new RectF();
        this.f19707q = dVar.f19932a;
        this.f19711v = dVar.f19933b;
        this.f19708r = dVar.f19944m;
        this.f19712w = (int) (yVar.f20304a.b() / 32.0f);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = dVar.f19934c.createAnimation();
        this.f19713x = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation;
        dVarCreateAnimation.a(this);
        aVar.a(dVarCreateAnimation);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation2 = dVar.f19936e.createAnimation();
        this.f19714y = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation2;
        dVarCreateAnimation2.a(this);
        aVar.a(dVarCreateAnimation2);
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation3 = dVar.f19937f.createAnimation();
        this.f19715z = (com.airbnb.lottie.animation.keyframe.i) dVarCreateAnimation3;
        dVarCreateAnimation3.a(this);
        aVar.a(dVarCreateAnimation3);
    }

    public final int[] a(int[] iArr) {
        r rVar = this.f19706A;
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

    @Override // com.airbnb.lottie.animation.content.b, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        if (obj == LottieProperty.f19603J) {
            r rVar = this.f19706A;
            com.airbnb.lottie.model.layer.a aVar = this.f19644f;
            if (rVar != null) {
                aVar.h(rVar);
            }
            if (cVar == null) {
                this.f19706A = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f19706A = rVar2;
            rVar2.a(this);
            aVar.a(this.f19706A);
        }
    }

    public final int b() {
        float f10 = this.f19714y.f19792d;
        float f11 = this.f19712w;
        int iRound = Math.round(f10 * f11);
        int iRound2 = Math.round(this.f19715z.f19792d * f11);
        int iRound3 = Math.round(this.f19713x.f19792d * f11);
        int i7 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i7 = i7 * 31 * iRound2;
        }
        return iRound3 != 0 ? i7 * 31 * iRound3 : i7;
    }

    @Override // com.airbnb.lottie.animation.content.b, com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f19708r) {
            return;
        }
        getBounds(this.f19710u, matrix, false);
        int i10 = this.f19711v;
        com.airbnb.lottie.animation.keyframe.i iVar = this.f19713x;
        com.airbnb.lottie.animation.keyframe.i iVar2 = this.f19715z;
        com.airbnb.lottie.animation.keyframe.i iVar3 = this.f19714y;
        if (i10 == 1) {
            long jB = b();
            M.j jVar = this.f19709s;
            shader = (LinearGradient) jVar.b(jB);
            if (shader == null) {
                PointF pointF = (PointF) iVar3.e();
                PointF pointF2 = (PointF) iVar2.e();
                com.airbnb.lottie.model.content.b bVar = (com.airbnb.lottie.model.content.b) iVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, a(bVar.f19923b), bVar.f19922a, Shader.TileMode.CLAMP);
                jVar.e(jB, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jB2 = b();
            M.j jVar2 = this.t;
            shader = (RadialGradient) jVar2.b(jB2);
            if (shader == null) {
                PointF pointF3 = (PointF) iVar3.e();
                PointF pointF4 = (PointF) iVar2.e();
                com.airbnb.lottie.model.content.b bVar2 = (com.airbnb.lottie.model.content.b) iVar.e();
                int[] iArrA = a(bVar2.f19923b);
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointF4.x - f10, pointF4.y - f11), iArrA, bVar2.f19922a, Shader.TileMode.CLAMP);
                jVar2.e(jB2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f19647i.setShader(shader);
        super.draw(canvas, matrix, i7, aVar);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19707q;
    }
}
