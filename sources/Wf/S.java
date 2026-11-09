package Wf;

import kotlin.collections.C1843j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S extends AbstractC0774s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10823f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1843j f10826e;

    public final void e(boolean z3) {
        long j6 = this.f10824c - (z3 ? 4294967296L : 1L);
        this.f10824c = j6;
        if (j6 <= 0 && this.f10825d) {
            shutdown();
        }
    }

    public final void f(G g7) {
        C1843j c1843j = this.f10826e;
        if (c1843j == null) {
            c1843j = new C1843j();
            this.f10826e = c1843j;
        }
        c1843j.addLast(g7);
    }

    public abstract Thread g();

    public final void h(boolean z3) {
        this.f10824c = (z3 ? 4294967296L : 1L) + this.f10824c;
        if (z3) {
            return;
        }
        this.f10825d = true;
    }

    public abstract long i();

    public final boolean j() {
        C1843j c1843j = this.f10826e;
        if (c1843j == null) {
            return false;
        }
        G g7 = (G) (c1843j.isEmpty() ? null : c1843j.removeFirst());
        if (g7 == null) {
            return false;
        }
        g7.run();
        return true;
    }

    public void k(long j6, O o10) {
        RunnableC0781z.f10920o.p(j6, o10);
    }

    public abstract void shutdown();
}
