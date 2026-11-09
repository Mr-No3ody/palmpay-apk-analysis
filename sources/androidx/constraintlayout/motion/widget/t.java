package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15435a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15436b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15437c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15438d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f15439e;

    public t(MotionLayout motionLayout) {
        this.f15439e = motionLayout;
    }

    public final void a() {
        int i7 = this.f15437c;
        MotionLayout motionLayout = this.f15439e;
        if (i7 != -1 || this.f15438d != -1) {
            if (i7 == -1) {
                motionLayout.z(this.f15438d);
            } else {
                int i10 = this.f15438d;
                if (i10 == -1) {
                    motionLayout.setState(i7, -1, -1);
                } else {
                    motionLayout.v(i7, i10);
                }
            }
            motionLayout.setState(u.f15441b);
        }
        if (Float.isNaN(this.f15436b)) {
            if (Float.isNaN(this.f15435a)) {
                return;
            }
            motionLayout.setProgress(this.f15435a);
        } else {
            motionLayout.u(this.f15435a, this.f15436b);
            this.f15435a = Float.NaN;
            this.f15436b = Float.NaN;
            this.f15437c = -1;
            this.f15438d = -1;
        }
    }
}
