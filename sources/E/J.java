package E;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class J extends F {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Executor f1930M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Object f1931Q = new Object();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageProxy f1932X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public I f1933Y;

    public J(Executor executor) {
        this.f1930M = executor;
    }

    @Override // E.F
    public final ImageProxy a(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // E.F
    public final void c() {
        synchronized (this.f1931Q) {
            try {
                ImageProxy imageProxy = this.f1932X;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.f1932X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.F
    public final void e(ImageProxy imageProxy) {
        synchronized (this.f1931Q) {
            try {
                if (!this.f1912L) {
                    imageProxy.close();
                    return;
                }
                if (this.f1933Y != null) {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.f1933Y.f13731b.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.f1932X;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.f1932X = imageProxy;
                    }
                    return;
                }
                I i7 = new I(imageProxy, this);
                this.f1933Y = i7;
                ListenableFuture listenableFutureB = b(i7);
                Ab.r rVar = new Ab.r(i7, 1);
                listenableFutureB.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureB, rVar), org.chromium.support_lib_boundary.util.b.u());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
