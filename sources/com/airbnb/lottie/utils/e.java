package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import com.airbnb.lottie.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {
    public k t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f20227a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f20228b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f20229c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20230d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20231e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20232f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20233g = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20234i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20235j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f20236o = -2.1474836E9f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f20237p = 2.1474836E9f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20238v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20239w = false;

    public final float a() {
        k kVar = this.t;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f20234i;
        float f11 = kVar.f19885l;
        return (f10 - f11) / (kVar.f19886m - f11);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f20228b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f20229c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f20227a.add(animatorUpdateListener);
    }

    public final float b() {
        k kVar = this.t;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f20237p;
        return f10 == 2.1474836E9f ? kVar.f19886m : f10;
    }

    public final float c() {
        k kVar = this.t;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f20236o;
        return f10 == -2.1474836E9f ? kVar.f19885l : f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f20228b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        return this.f20230d < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        boolean z3 = false;
        if (this.f20238v) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        k kVar = this.t;
        if (kVar == null || !this.f20238v) {
            return;
        }
        long j10 = this.f20232f;
        float fAbs = (j10 != 0 ? j6 - j10 : 0L) / ((1.0E9f / kVar.f19887n) / Math.abs(this.f20230d));
        float f10 = this.f20233g;
        if (d()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = g.f20241a;
        if (f11 >= fC && f11 <= fB) {
            z3 = true;
        }
        float f12 = this.f20233g;
        float fB2 = g.b(f11, c(), b());
        this.f20233g = fB2;
        if (this.f20239w) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f20234i = fB2;
        this.f20232f = j6;
        if (z3) {
            if (!this.f20239w || this.f20233g != f12) {
                f();
            }
        } else if (getRepeatCount() == -1 || this.f20235j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f20231e = !this.f20231e;
                this.f20230d = -this.f20230d;
            } else {
                float fB3 = d() ? b() : c();
                this.f20233g = fB3;
                this.f20234i = fB3;
            }
            this.f20232f = j6;
            if (!this.f20239w || this.f20233g != f12) {
                f();
            }
            Iterator it = this.f20228b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f20235j++;
        } else {
            float fC2 = this.f20230d < 0.0f ? c() : b();
            this.f20233g = fC2;
            this.f20234i = fC2;
            g(true);
            if (!this.f20239w || this.f20233g != f12) {
                f();
            }
            e(d());
        }
        if (this.t == null) {
            return;
        }
        float f13 = this.f20234i;
        if (f13 < this.f20236o || f13 > this.f20237p) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f20236o), Float.valueOf(this.f20237p), Float.valueOf(this.f20234i)));
        }
    }

    public final void e(boolean z3) {
        for (Animator.AnimatorListener animatorListener : this.f20228b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z3);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f20227a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.f20238v = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.t == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.f20234i;
            fB = b();
            fC2 = c();
        } else {
            fC = this.f20234i - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        k kVar = this.t;
        if (kVar == null) {
            return 0L;
        }
        return (long) kVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f10) {
        if (this.f20233g == f10) {
            return;
        }
        float fB = g.b(f10, c(), b());
        this.f20233g = fB;
        if (this.f20239w) {
            fB = (float) Math.floor(fB);
        }
        this.f20234i = fB;
        this.f20232f = 0L;
        f();
    }

    public final void i(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        k kVar = this.t;
        float f12 = kVar == null ? -3.4028235E38f : kVar.f19885l;
        float f13 = kVar == null ? Float.MAX_VALUE : kVar.f19886m;
        float fB = g.b(f10, f12, f13);
        float fB2 = g.b(f11, f12, f13);
        if (fB == this.f20236o && fB2 == this.f20237p) {
            return;
        }
        this.f20236o = fB;
        this.f20237p = fB2;
        h((int) g.b(this.f20234i, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f20238v;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f20228b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f20227a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f20228b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f20229c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f20227a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j6) {
        setDuration(j6);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i7) {
        super.setRepeatMode(i7);
        if (i7 == 2 || !this.f20231e) {
            return;
        }
        this.f20231e = false;
        this.f20230d = -this.f20230d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
