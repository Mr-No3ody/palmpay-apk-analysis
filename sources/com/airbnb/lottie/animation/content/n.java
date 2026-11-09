package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f19772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f19773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f19774s;
    public final com.airbnb.lottie.animation.keyframe.e t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f19775u;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(y yVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.n nVar) {
        int i7 = F.i(nVar.f19993g);
        Paint.Cap cap = i7 != 0 ? i7 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int i10 = F.i(nVar.f19994h);
        super(yVar, aVar, cap, i10 != 0 ? i10 != 1 ? i10 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, nVar.f19995i, nVar.f19991e, nVar.f19992f, nVar.f19989c, nVar.f19988b);
        this.f19772q = aVar;
        this.f19773r = nVar.f19987a;
        this.f19774s = nVar.f19996j;
        com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = nVar.f19990d.createAnimation();
        this.t = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation;
        dVarCreateAnimation.a(this);
        aVar.a(dVarCreateAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.b, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        PointF pointF = LottieProperty.f19608a;
        com.airbnb.lottie.animation.keyframe.e eVar = this.t;
        if (obj == 2) {
            eVar.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19602I) {
            r rVar = this.f19775u;
            com.airbnb.lottie.model.layer.a aVar = this.f19772q;
            if (rVar != null) {
                aVar.h(rVar);
            }
            if (cVar == null) {
                this.f19775u = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f19775u = rVar2;
            rVar2.a(this);
            aVar.a(eVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.b, com.airbnb.lottie.animation.content.DrawingContent
    public final void draw(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        if (this.f19774s) {
            return;
        }
        int iL = this.t.l();
        com.airbnb.lottie.animation.a aVar2 = this.f19647i;
        aVar2.setColor(iL);
        r rVar = this.f19775u;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        super.draw(canvas, matrix, i7, aVar);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f19773r;
    }
}
