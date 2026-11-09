package com.airbnb.lottie.animation.keyframe;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19855i;

    public r(Object obj, p243q1.c cVar) {
        super(Collections.EMPTY_LIST);
        j(cVar);
        this.f19855i = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final float b() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object e() {
        p243q1.c cVar = this.f19793e;
        float f10 = this.f19792d;
        Object obj = this.f19855i;
        return cVar.b(0.0f, 0.0f, obj, obj, f10, f10, f10);
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object f(p243q1.a aVar, float f10) {
        return e();
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final void h() {
        if (this.f19793e != null) {
            super.h();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final void i(float f10) {
        this.f19792d = f10;
    }
}
