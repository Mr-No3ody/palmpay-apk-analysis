package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Carousel f15185a;

    public a(Carousel carousel) {
        this.f15185a = carousel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Carousel carousel = this.f15185a;
        carousel.f15131C.setProgress(0.0f);
        carousel.s();
        carousel.f15143v.onNewItem(carousel.f15130B);
        float velocity = carousel.f15131C.getVelocity();
        if (carousel.f15141t0 != 2 || velocity <= carousel.f15142u0 || carousel.f15130B >= carousel.f15143v.count() - 1) {
            return;
        }
        float f10 = velocity * carousel.f15138q0;
        int i7 = carousel.f15130B;
        if (i7 != 0 || carousel.f15129A <= i7) {
            if (i7 != carousel.f15143v.count() - 1 || carousel.f15129A >= carousel.f15130B) {
                carousel.f15131C.post(new S.a(this, f10));
            }
        }
    }
}
