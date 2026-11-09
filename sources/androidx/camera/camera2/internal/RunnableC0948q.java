package androidx.camera.camera2.internal;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0948q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f13640b;

    public /* synthetic */ RunnableC0948q(J j6, int i7) {
        this.f13639a = i7;
        this.f13640b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13639a) {
            case 0:
                this.f13640b.o();
                break;
            case 1:
                J j6 = this.f13640b;
                j6.f13174Z = false;
                j6.f13173Y = false;
                j6.f("OpenCameraConfigAndClose is done, state: ".concat(F.j(j6.f13166B0)));
                int i7 = F.i(j6.f13166B0);
                if (i7 == 1 || i7 == 4) {
                    p118hf.a.k(j6.f13165B.isEmpty(), null);
                    j6.g();
                } else if (i7 == 6) {
                    int i10 = j6.f13186p;
                    if (i10 == 0) {
                        j6.w(false);
                    } else {
                        j6.f("OpenCameraConfigAndClose in error: ".concat(J.h(i10)));
                        j6.f13182i.b();
                    }
                } else {
                    j6.f("OpenCameraConfigAndClose finished while in state: ".concat(F.j(j6.f13166B0)));
                }
                break;
            default:
                this.f13640b.c();
                break;
        }
    }
}
