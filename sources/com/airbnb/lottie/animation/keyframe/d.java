package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseKeyframeAnimation$KeyframesWrapper f19791c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p243q1.c f19793e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19789a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19790b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19792d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19794f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19795g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19796h = -1.0f;

    public d(List list) {
        BaseKeyframeAnimation$KeyframesWrapper cVar;
        if (list.isEmpty()) {
            cVar = new a();
        } else {
            cVar = list.size() == 1 ? new c(list) : new b(list);
        }
        this.f19791c = cVar;
    }

    public final void a(BaseKeyframeAnimation$AnimationListener baseKeyframeAnimation$AnimationListener) {
        this.f19789a.add(baseKeyframeAnimation$AnimationListener);
    }

    public float b() {
        if (this.f19796h == -1.0f) {
            this.f19796h = this.f19791c.getEndProgress();
        }
        return this.f19796h;
    }

    public final float c() {
        Interpolator interpolator;
        p243q1.a currentKeyframe = this.f19791c.getCurrentKeyframe();
        if (currentKeyframe == null || currentKeyframe.c() || (interpolator = currentKeyframe.f41423d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f19790b) {
            return 0.0f;
        }
        p243q1.a currentKeyframe = this.f19791c.getCurrentKeyframe();
        if (currentKeyframe.c()) {
            return 0.0f;
        }
        return (this.f19792d - currentKeyframe.b()) / (currentKeyframe.a() - currentKeyframe.b());
    }

    public Object e() {
        Interpolator interpolator;
        float fD = d();
        p243q1.c cVar = this.f19793e;
        BaseKeyframeAnimation$KeyframesWrapper baseKeyframeAnimation$KeyframesWrapper = this.f19791c;
        if (cVar == null && baseKeyframeAnimation$KeyframesWrapper.isCachedValueEnabled(fD) && !k()) {
            return this.f19794f;
        }
        p243q1.a currentKeyframe = baseKeyframeAnimation$KeyframesWrapper.getCurrentKeyframe();
        Interpolator interpolator2 = currentKeyframe.f41424e;
        Object objF = (interpolator2 == null || (interpolator = currentKeyframe.f41425f) == null) ? f(currentKeyframe, c()) : g(currentKeyframe, fD, interpolator2.getInterpolation(fD), interpolator.getInterpolation(fD));
        this.f19794f = objF;
        return objF;
    }

    public abstract Object f(p243q1.a aVar, float f10);

    public Object g(p243q1.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
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

    public void i(float f10) {
        BaseKeyframeAnimation$KeyframesWrapper baseKeyframeAnimation$KeyframesWrapper = this.f19791c;
        if (baseKeyframeAnimation$KeyframesWrapper.isEmpty()) {
            return;
        }
        if (this.f19795g == -1.0f) {
            this.f19795g = baseKeyframeAnimation$KeyframesWrapper.getStartDelayProgress();
        }
        float f11 = this.f19795g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f19795g = baseKeyframeAnimation$KeyframesWrapper.getStartDelayProgress();
            }
            f10 = this.f19795g;
        } else if (f10 > b()) {
            f10 = b();
        }
        if (f10 == this.f19792d) {
            return;
        }
        this.f19792d = f10;
        if (baseKeyframeAnimation$KeyframesWrapper.isValueChanged(f10)) {
            h();
        }
    }

    public final void j(p243q1.c cVar) {
        p243q1.c cVar2 = this.f19793e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f19793e = cVar;
    }

    public boolean k() {
        return false;
    }
}
