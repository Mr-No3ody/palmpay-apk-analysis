package com.airbnb.lottie.animation.keyframe;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(this.f19791c.getCurrentKeyframe(), c());
    }

    public final float m(p243q1.a aVar, float f10) {
        float f11;
        if (aVar.f41421b == null || aVar.f41422c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p243q1.c cVar = this.f19793e;
        Object obj = aVar.f41421b;
        if (cVar != null) {
            Float f12 = (Float) aVar.f41422c;
            float fD = d();
            float f13 = this.f19792d;
            f11 = f10;
            Float f14 = (Float) cVar.b(aVar.f41426g, aVar.f41427h.floatValue(), (Float) obj, f12, f11, fD, f13);
            if (f14 != null) {
                return f14.floatValue();
            }
        } else {
            f11 = f10;
        }
        if (aVar.f41428i == -3987645.8f) {
            aVar.f41428i = ((Float) obj).floatValue();
        }
        float f15 = aVar.f41428i;
        if (aVar.f41429j == -3987645.8f) {
            aVar.f41429j = ((Float) aVar.f41422c).floatValue();
        }
        return com.airbnb.lottie.utils.g.f(f15, aVar.f41429j, f11);
    }
}
