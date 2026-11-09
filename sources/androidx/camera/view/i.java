package androidx.camera.view;

import E.AbstractC0198c;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Observable;
import java.util.ArrayList;
import java.util.Objects;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Observable.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f14952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.F f14953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f14954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f14955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.camera.core.impl.utils.futures.b f14956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14957f = false;

    public i(CameraInfoInternal cameraInfoInternal, androidx.lifecycle.F f10, r rVar) {
        this.f14952a = cameraInfoInternal;
        this.f14953b = f10;
        this.f14955d = rVar;
        synchronized (this) {
            this.f14954c = (q) f10.d();
        }
    }

    public final void a(q qVar) {
        synchronized (this) {
            try {
                if (this.f14954c.equals(qVar)) {
                    return;
                }
                this.f14954c = qVar;
                Objects.toString(qVar);
                p140j8.f.G("StreamStateObserver");
                this.f14953b.i(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        androidx.camera.core.impl.utils.futures.b bVar = this.f14956e;
        if (bVar != null) {
            bVar.cancel(false);
            this.f14956e = null;
        }
        a(q.f15002a);
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        androidx.camera.core.impl.G g7 = (androidx.camera.core.impl.G) obj;
        androidx.camera.core.impl.G g10 = androidx.camera.core.impl.G.CLOSING;
        q qVar = q.f15002a;
        if (g7 == g10 || g7 == androidx.camera.core.impl.G.CLOSED || g7 == androidx.camera.core.impl.G.RELEASING || g7 == androidx.camera.core.impl.G.RELEASED) {
            a(qVar);
            if (this.f14957f) {
                this.f14957f = false;
                androidx.camera.core.impl.utils.futures.b bVar = this.f14956e;
                if (bVar != null) {
                    bVar.cancel(false);
                    this.f14956e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((g7 == androidx.camera.core.impl.G.OPENING || g7 == androidx.camera.core.impl.G.OPEN || g7 == androidx.camera.core.impl.G.PENDING_OPEN) && !this.f14957f) {
            a(qVar);
            ArrayList arrayList = new ArrayList();
            CameraInfoInternal cameraInfoInternal = this.f14952a;
            androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(AbstractC0198c.y(new U8.a(cameraInfoInternal, this, arrayList)));
            C1021b c1021b = new C1021b(this);
            androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
            bVarA.getClass();
            androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(bVarA, c1021b, aVarU);
            C1020a c1020a = new C1020a(this, 1);
            androidx.camera.core.impl.utils.futures.a aVarI2 = androidx.camera.core.impl.utils.futures.j.i(aVarI, new C2085k0(c1020a, 13), org.chromium.support_lib_boundary.util.b.u());
            this.f14956e = aVarI2;
            androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(cameraInfoInternal, this, arrayList);
            aVarI2.addListener(new androidx.camera.core.impl.utils.futures.i(0, aVarI2, cVar), org.chromium.support_lib_boundary.util.b.u());
            this.f14957f = true;
        }
    }
}
