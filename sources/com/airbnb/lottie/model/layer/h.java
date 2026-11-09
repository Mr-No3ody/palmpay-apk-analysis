package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f20078D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20079E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float[] f20080F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Path f20081G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final e f20082H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public r f20083I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public r f20084J;

    public h(y yVar, e eVar) {
        super(yVar, eVar);
        this.f20078D = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.f20079E = aVar;
        this.f20080F = new float[8];
        this.f20081G = new Path();
        this.f20082H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f20062l);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        if (obj == LottieProperty.f19602I) {
            if (cVar == null) {
                this.f20083I = null;
                return;
            } else {
                this.f20083I = new r(null, cVar);
                return;
            }
        }
        if (obj == 1) {
            if (cVar != null) {
                this.f20084J = new r(null, cVar);
                return;
            }
            this.f20084J = null;
            this.f20079E.setColor(this.f20082H.f20062l);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        e eVar = this.f20082H;
        int iAlpha = Color.alpha(eVar.f20062l);
        if (iAlpha == 0) {
            return;
        }
        r rVar = this.f20084J;
        Integer num = rVar == null ? null : (Integer) rVar.e();
        com.airbnb.lottie.animation.a aVar2 = this.f20079E;
        if (num != null) {
            aVar2.setColor(num.intValue());
        } else {
            aVar2.setColor(eVar.f20062l);
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f20027w.f19847p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (dVar == null ? 100 : ((Integer) dVar.e()).intValue())) / 100.0f) * (i7 / 255.0f) * 255.0f);
        aVar2.setAlpha(iIntValue);
        if (aVar == null || Color.alpha(aVar.f20219d) <= 0) {
            aVar2.clearShadowLayer();
        } else {
            aVar2.setShadowLayer(Math.max(aVar.f20216a, Float.MIN_VALUE), aVar.f20217b, aVar.f20218c, aVar.f20219d);
        }
        r rVar2 = this.f20083I;
        if (rVar2 != null) {
            aVar2.setColorFilter((ColorFilter) rVar2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f20080F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = eVar.f20060j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = eVar.f20061k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.f20081G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        super.getBounds(rectF, matrix, z3);
        RectF rectF2 = this.f20078D;
        e eVar = this.f20082H;
        rectF2.set(0.0f, 0.0f, eVar.f20060j, eVar.f20061k);
        this.f20019n.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
