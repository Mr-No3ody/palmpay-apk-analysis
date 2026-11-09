package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f15407b;

    public /* synthetic */ o(MotionLayout motionLayout, int i7) {
        this.f15406a = i7;
        this.f15407b = motionLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15406a) {
            case 0:
                this.f15407b.f15285U0.a();
                break;
            default:
                this.f15407b.f15285U0.a();
                break;
        }
    }
}
