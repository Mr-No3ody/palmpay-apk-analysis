package p212o1;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f39983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f39984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f39985c;

    public a() {
        this.f39983a = new PointF();
        this.f39984b = new PointF();
        this.f39985c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f39985c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f39983a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f39984b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f39983a = pointF;
        this.f39984b = pointF2;
        this.f39985c = pointF3;
    }
}
