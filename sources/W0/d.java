package W0;

import B6.RunnableC0085g;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.work.impl.C1275h;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.l;
import p045d3.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f10371e;

    public d(k runnableScheduler, p279s5.d launcher) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f10368b = runnableScheduler;
        this.f10369c = launcher;
        this.f10367a = millis;
        this.f10370d = new Object();
        this.f10371e = new LinkedHashMap();
    }

    public void a(C1275h token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f10370d) {
            runnable = (Runnable) ((LinkedHashMap) this.f10371e).remove(token);
        }
        if (runnable != null) {
            ((k) this.f10368b).cancel(runnable);
        }
    }

    public void b(C1275h token) {
        Intrinsics.checkNotNullParameter(token, "token");
        RunnableC0085g runnableC0085g = new RunnableC0085g(23, this, token);
        synchronized (this.f10370d) {
        }
        ((k) this.f10368b).scheduleWithDelay(this.f10367a, runnableC0085g);
    }

    public d(l lVar, P0 p3, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f10367a = -1L;
        this.f10368b = lVar;
        this.f10369c = p3;
        this.f10370d = cameraUseInconsistentTimebaseQuirk;
    }
}
