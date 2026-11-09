package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p243q1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f19809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p243q1.a f19810r;

    public k(com.airbnb.lottie.k kVar, p243q1.a aVar) {
        super(kVar, (PointF) aVar.f41421b, (PointF) aVar.f41422c, aVar.f41423d, aVar.f41424e, aVar.f41425f, aVar.f41426g, aVar.f41427h);
        this.f19810r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f41422c;
        Object obj3 = this.f41421b;
        boolean z3 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f41422c) == null || z3) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        p243q1.a aVar = this.f19810r;
        PointF pointF3 = aVar.f41434o;
        PointF pointF4 = aVar.f41435p;
        Matrix matrix = com.airbnb.lottie.utils.i.f20269a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f19809q = path;
    }
}
