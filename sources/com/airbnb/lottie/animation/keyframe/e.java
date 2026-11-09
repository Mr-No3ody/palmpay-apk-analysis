package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, int i7) {
        super(list);
        this.f19797i = i7;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        int i7;
        int iIntValue;
        Object obj;
        switch (this.f19797i) {
            case 0:
                return Integer.valueOf(m(aVar, f10));
            case 1:
                Object obj2 = aVar.f41421b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = aVar.f41422c;
                if (obj3 == null) {
                    if (aVar.f41430k == 784923401) {
                        aVar.f41430k = ((Integer) obj2).intValue();
                    }
                    i7 = aVar.f41430k;
                } else {
                    if (aVar.f41431l == 784923401) {
                        aVar.f41431l = ((Integer) obj3).intValue();
                    }
                    i7 = aVar.f41431l;
                }
                int i10 = i7;
                p243q1.c cVar = this.f19793e;
                if (cVar != null) {
                    Integer num = (Integer) cVar.b(aVar.f41426g, aVar.f41427h.floatValue(), (Integer) obj2, Integer.valueOf(i10), f10, d(), this.f19792d);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        if (aVar.f41430k == 784923401) {
                            aVar.f41430k = ((Integer) obj2).intValue();
                        }
                        int i11 = aVar.f41430k;
                        PointF pointF = com.airbnb.lottie.utils.g.f20241a;
                        iIntValue = (int) (((i10 - i11) * f10) + i11);
                    }
                } else {
                    if (aVar.f41430k == 784923401) {
                        aVar.f41430k = ((Integer) obj2).intValue();
                    }
                    int i12 = aVar.f41430k;
                    PointF pointF2 = com.airbnb.lottie.utils.g.f20241a;
                    iIntValue = (int) (((i10 - i12) * f10) + i12);
                }
                return Integer.valueOf(iIntValue);
            default:
                p243q1.c cVar2 = this.f19793e;
                Object obj4 = aVar.f41421b;
                if (cVar2 == null) {
                    return (f10 != 1.0f || (obj = aVar.f41422c) == null) ? (p212o1.b) obj4 : (p212o1.b) obj;
                }
                Float f11 = aVar.f41427h;
                float fFloatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
                p212o1.b bVar = (p212o1.b) obj4;
                Object obj5 = aVar.f41422c;
                return (p212o1.b) cVar2.b(aVar.f41426g, fFloatValue, bVar, obj5 == null ? bVar : (p212o1.b) obj5, f10, c(), this.f19792d);
        }
    }

    public int l() {
        return m(this.f19791c.getCurrentKeyframe(), c());
    }

    public int m(p243q1.a aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.f41421b == null || aVar.f41422c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p243q1.c cVar = this.f19793e;
        Object obj = aVar.f41421b;
        if (cVar == null || (f12 = aVar.f41427h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f41426g, f12.floatValue(), (Integer) obj, (Integer) aVar.f41422c, f11, d(), this.f19792d);
            if (num != null) {
                return num.intValue();
            }
        }
        return androidx.camera.core.impl.utils.n.g(com.airbnb.lottie.utils.g.b(f11, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) aVar.f41422c).intValue());
    }
}
