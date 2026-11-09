package Wf;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f10816c;

    public N(long j6, Runnable runnable) {
        super(j6);
        this.f10816c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10816c.run();
    }

    @Override // Wf.O
    public final String toString() {
        return super.toString() + this.f10816c;
    }
}
