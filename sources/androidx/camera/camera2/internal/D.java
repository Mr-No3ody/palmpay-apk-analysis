package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f13126b;

    public /* synthetic */ D(E e10, int i7) {
        this.f13125a = i7;
        this.f13126b = e10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13125a) {
            case 0:
                E e10 = this.f13126b;
                if (!e10.f13132b.getAndSet(true)) {
                    ((J) e10.f13133c.f13513b).f13177c.execute(new D(e10, 1));
                    break;
                }
                break;
            default:
                E e11 = this.f13126b;
                if (((J) e11.f13133c.f13513b).f13166B0 == 8) {
                    ((J) e11.f13133c.f13513b).f("Camera onError timeout, reopen it.");
                    ((J) e11.f13133c.f13513b).s(7);
                    ((J) e11.f13133c.f13513b).f13182i.b();
                } else {
                    J j6 = (J) e11.f13133c.f13513b;
                    j6.f("Camera skip reopen at state: ".concat(F.j(j6.f13166B0)));
                }
                break;
        }
    }
}
