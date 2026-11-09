package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class n extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f19821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f19822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f19823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f19824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p243q1.c f19825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p243q1.c f19826n;

    public n(h hVar, h hVar2) {
        super(Collections.EMPTY_LIST);
        this.f19821i = new PointF();
        this.f19822j = new PointF();
        this.f19823k = hVar;
        this.f19824l = hVar2;
        i(this.f19792d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final Object e() {
        return l();
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final /* bridge */ /* synthetic */ Object f(p243q1.a aVar, float f10) {
        return l();
    }

    @Override // com.airbnb.lottie.animation.keyframe.d
    public final void i(float f10) {
        h hVar = this.f19823k;
        hVar.i(f10);
        h hVar2 = this.f19824l;
        hVar2.i(f10);
        this.f19821i.set(((Float) hVar.e()).floatValue(), ((Float) hVar2.e()).floatValue());
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f19789a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation$AnimationListener) arrayList.get(i7)).onValueChanged();
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final PointF l() {
        Float f10;
        Float f11 = null;
        if (this.f19825m != null) {
            h hVar = this.f19823k;
            p243q1.a currentKeyframe = hVar.f19791c.getCurrentKeyframe();
            if (currentKeyframe != null) {
                Float f12 = currentKeyframe.f41427h;
                p243q1.c cVar = this.f19825m;
                float f13 = currentKeyframe.f41426g;
                f10 = (Float) cVar.b(f13, f12 == null ? f13 : f12.floatValue(), (Float) currentKeyframe.f41421b, (Float) currentKeyframe.f41422c, hVar.c(), hVar.d(), hVar.f19792d);
            } else {
                f10 = null;
            }
        } else {
            f10 = null;
        }
        if (this.f19826n != null) {
            h hVar2 = this.f19824l;
            p243q1.a currentKeyframe2 = hVar2.f19791c.getCurrentKeyframe();
            if (currentKeyframe2 != null) {
                Float f14 = currentKeyframe2.f41427h;
                p243q1.c cVar2 = this.f19826n;
                float f15 = currentKeyframe2.f41426g;
                f11 = (Float) cVar2.b(f15, f14 == null ? f15 : f14.floatValue(), (Float) currentKeyframe2.f41421b, (Float) currentKeyframe2.f41422c, hVar2.c(), hVar2.d(), hVar2.f19792d);
            }
        }
        PointF pointF = this.f19821i;
        PointF pointF2 = this.f19822j;
        if (f10 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f10.floatValue(), 0.0f);
        }
        if (f11 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f11.floatValue());
        return pointF2;
    }
}
