package com.airbnb.lottie.animation.keyframe;

import C0.G;
import android.graphics.PointF;
import com.horcrux.svg.d0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f19808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, int i7) {
        super(list);
        this.f19807i = i7;
        switch (i7) {
            case 1:
                super(list);
                this.f19808j = new PointF();
                break;
            case 2:
                super(list);
                this.f19808j = new p243q1.d();
                break;
            default:
                int iMax = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    com.airbnb.lottie.model.content.b bVar = (com.airbnb.lottie.model.content.b) ((p243q1.a) list.get(i10)).f41421b;
                    if (bVar != null) {
                        iMax = Math.max(iMax, bVar.f19923b.length);
                    }
                }
                this.f19808j = new com.airbnb.lottie.model.content.b(new int[iMax], new float[iMax]);
                break;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        Object obj;
        float f11;
        switch (this.f19807i) {
            case 0:
                com.airbnb.lottie.model.content.b bVar = (com.airbnb.lottie.model.content.b) aVar.f41421b;
                com.airbnb.lottie.model.content.b bVar2 = (com.airbnb.lottie.model.content.b) aVar.f41422c;
                com.airbnb.lottie.model.content.b bVar3 = (com.airbnb.lottie.model.content.b) this.f19808j;
                bVar3.getClass();
                if (bVar.equals(bVar2) || f10 <= 0.0f) {
                    bVar3.a(bVar);
                } else if (f10 >= 1.0f) {
                    bVar3.a(bVar2);
                } else {
                    int[] iArr = bVar.f19923b;
                    int length = iArr.length;
                    int[] iArr2 = bVar2.f19923b;
                    if (length != iArr2.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(G.n(iArr2.length, ")", sb2));
                    }
                    int i7 = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = bVar3.f19923b;
                        float[] fArr = bVar3.f19922a;
                        if (i7 < length2) {
                            fArr[i7] = com.airbnb.lottie.utils.g.f(bVar.f19922a[i7], bVar2.f19922a[i7], f10);
                            iArr3[i7] = androidx.camera.core.impl.utils.n.g(f10, iArr[i7], iArr2[i7]);
                            i7++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return bVar3;
            case 1:
                return l(aVar, f10, f10, f10);
            default:
                Object obj2 = aVar.f41421b;
                if (obj2 == null || (obj = aVar.f41422c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                p243q1.d dVar = (p243q1.d) obj2;
                p243q1.d dVar2 = (p243q1.d) obj;
                p243q1.c cVar = this.f19793e;
                if (cVar != null) {
                    f11 = f10;
                    p243q1.d dVar3 = (p243q1.d) cVar.b(aVar.f41426g, aVar.f41427h.floatValue(), dVar, dVar2, f11, d(), this.f19792d);
                    if (dVar3 != null) {
                        return dVar3;
                    }
                } else {
                    f11 = f10;
                }
                float f12 = com.airbnb.lottie.utils.g.f(dVar.f41445a, dVar2.f41445a, f11);
                float f13 = com.airbnb.lottie.utils.g.f(dVar.f41446b, dVar2.f41446b, f11);
                p243q1.d dVar4 = (p243q1.d) this.f19808j;
                dVar4.f41445a = f12;
                dVar4.f41446b = f13;
                return dVar4;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public /* bridge */ /* synthetic */ Object g(p243q1.a aVar, float f10, float f11, float f12) {
        switch (this.f19807i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                return super.g(aVar, f10, f11, f12);
        }
    }

    public PointF l(p243q1.a aVar, float f10, float f11, float f12) {
        Object obj;
        Object obj2 = aVar.f41421b;
        if (obj2 == null || (obj = aVar.f41422c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        p243q1.c cVar = this.f19793e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.b(aVar.f41426g, aVar.f41427h.floatValue(), pointF, pointF2, f10, d(), this.f19792d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f19808j;
        float f13 = pointF.x;
        float fE = d0.e(pointF2.x, f13, f11, f13);
        float f14 = pointF.y;
        pointF4.set(fE, d0.e(pointF2.y, f14, f12, f14));
        return pointF4;
    }
}
