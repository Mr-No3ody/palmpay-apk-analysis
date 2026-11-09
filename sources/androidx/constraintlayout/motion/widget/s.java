package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public final class s implements MotionLayout.MotionTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f15433b = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VelocityTracker f15434a;

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final void addMovement(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final void clear() {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final void computeCurrentVelocity(int i7) {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(i7);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final float getXVelocity() {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            return velocityTracker.getXVelocity();
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final float getYVelocity() {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            return velocityTracker.getYVelocity();
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final void recycle() {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15434a = null;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final void computeCurrentVelocity(int i7, float f10) {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(i7, f10);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final float getXVelocity(int i7) {
        VelocityTracker velocityTracker = this.f15434a;
        if (velocityTracker != null) {
            return velocityTracker.getXVelocity(i7);
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
    public final float getYVelocity(int i7) {
        if (this.f15434a != null) {
            return getYVelocity(i7);
        }
        return 0.0f;
    }
}
