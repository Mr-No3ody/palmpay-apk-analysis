package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15408a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15409b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f15411d;

    public p(MotionLayout motionLayout) {
        this.f15411d = motionLayout;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public final float a() {
        return this.f15411d.f15296d;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11 = this.f15408a;
        MotionLayout motionLayout = this.f15411d;
        if (f11 > 0.0f) {
            float f12 = this.f15410c;
            if (f11 / f12 < f10) {
                f10 = f11 / f12;
            }
            motionLayout.f15296d = f11 - (f12 * f10);
            return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f15409b;
        }
        float f13 = this.f15410c;
        if ((-f11) / f13 < f10) {
            f10 = (-f11) / f13;
        }
        motionLayout.f15296d = (f13 * f10) + f11;
        return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f15409b;
    }
}
