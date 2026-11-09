package p042cg;

import Wf.AbstractC0780y;
import androidx.camera.video.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f19016c;

    public k(Runnable runnable, long j6, boolean z3) {
        super(j6, z3);
        this.f19016c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19016c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f19016c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(AbstractC0780y.i(runnable));
        sb2.append(", ");
        sb2.append(this.f19014a);
        sb2.append(", ");
        return u.p(sb2, this.f19015b ? "Blocking" : "Non-blocking", ']');
    }
}
