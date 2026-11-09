package androidx.camera.video;

import E.m0;
import android.view.Surface;
import androidx.camera.video.internal.encoder.Encoder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f14558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.d f14559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Encoder f14560d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f14561e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f14562f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.utils.executor.i f14563g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f14564h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14565i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListenableFuture f14566j = new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Cannot close the encoder before configuring."), 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.concurrent.futures.k f14567k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ListenableFuture f14568l = new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Cannot close the encoder before configuring."), 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.concurrent.futures.k f14569m = null;

    public E(B8.d dVar, androidx.camera.core.impl.utils.executor.i iVar, Executor executor) {
        this.f14557a = executor;
        this.f14558b = iVar;
        this.f14559c = dVar;
    }

    public final void a() {
        int i7 = androidx.camera.camera2.internal.F.i(this.f14565i);
        if (i7 == 0 || i7 == 1) {
            b();
            return;
        }
        if (i7 == 2 || i7 == 3) {
            p140j8.f.G("VideoEncoderSession");
            this.f14565i = 3;
        } else {
            if (i7 == 4) {
                p140j8.f.G("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + u.z(this.f14565i) + " is not handled");
        }
    }

    public final void b() {
        int i7 = androidx.camera.camera2.internal.F.i(this.f14565i);
        if (i7 == 0) {
            this.f14565i = 5;
            return;
        }
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            if (i7 == 4) {
                p140j8.f.G("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + u.z(this.f14565i) + " is not handled");
        }
        this.f14565i = 5;
        this.f14569m.b(this.f14560d);
        this.f14562f = null;
        Encoder encoder = this.f14560d;
        if (encoder == null) {
            p140j8.f.G("VideoEncoderSession");
            this.f14567k.b(null);
            return;
        }
        Objects.toString(encoder);
        p140j8.f.G("VideoEncoderSession");
        this.f14560d.release();
        this.f14560d.getReleasedFuture().addListener(new W8.o(this, 24), this.f14558b);
        this.f14560d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f14562f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
