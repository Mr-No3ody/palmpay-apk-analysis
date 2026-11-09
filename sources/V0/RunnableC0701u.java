package V0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: V0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0701u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f9974b;

    public /* synthetic */ RunnableC0701u(AtomicBoolean atomicBoolean, int i7) {
        this.f9973a = i7;
        this.f9974b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9973a) {
            case 0:
                this.f9974b.set(true);
                break;
            default:
                this.f9974b.set(true);
                break;
        }
    }
}
