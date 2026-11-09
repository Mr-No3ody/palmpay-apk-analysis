package androidx.camera.video.internal.encoder;

import android.view.Surface;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Encoder.SurfaceInput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f14724b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Encoder.SurfaceInput.OnSurfaceUpdateListener f14726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f14727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f14728f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14723a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f14725c = new HashSet();

    public u(v vVar) {
        this.f14728f = vVar;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
    public final void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
        Surface surface;
        synchronized (this.f14723a) {
            onSurfaceUpdateListener.getClass();
            this.f14726d = onSurfaceUpdateListener;
            executor.getClass();
            this.f14727e = executor;
            surface = this.f14724b;
        }
        if (surface != null) {
            try {
                executor.execute(new o(7, onSurfaceUpdateListener, surface));
            } catch (RejectedExecutionException e10) {
                p140j8.f.h(this.f14728f.f14734a, "Unable to post to the supplied executor.", e10);
            }
        }
    }
}
