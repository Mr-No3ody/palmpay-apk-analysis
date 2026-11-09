package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f19811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f19812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f19813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f19814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f19815m;

    public l(ArrayList arrayList) {
        super(arrayList);
        this.f19811i = new PointF();
        this.f19812j = new float[2];
        this.f19813k = new float[2];
        this.f19814l = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        float f11;
        k kVar = (k) aVar;
        Path path = kVar.f19809q;
        p243q1.c cVar = this.f19793e;
        if (cVar == null || aVar.f41427h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(kVar.f41426g, kVar.f41427h.floatValue(), (PointF) kVar.f41421b, (PointF) kVar.f41422c, d(), f11, this.f19792d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f41421b;
        }
        k kVar2 = this.f19815m;
        PathMeasure pathMeasure = this.f19814l;
        if (kVar2 != kVar) {
            pathMeasure.setPath(path, false);
            this.f19815m = kVar;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.f19812j;
        float[] fArr2 = this.f19813k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        PointF pointF2 = this.f19811i;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
            return pointF2;
        }
        if (f12 > length) {
            float f13 = f12 - length;
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
        }
        return pointF2;
    }
}
