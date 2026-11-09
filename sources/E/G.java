package E;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import com.google.common.util.concurrent.ListenableFuture;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends F {
    @Override // E.F
    public final ImageProxy a(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // E.F
    public final void e(ImageProxy imageProxy) throws Throwable {
        ListenableFuture listenableFutureB = b(imageProxy);
        C2085k0 c2085k0 = new C2085k0(imageProxy, 2);
        listenableFutureB.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureB, c2085k0), org.chromium.support_lib_boundary.util.b.u());
    }

    @Override // E.F
    public final void c() {
    }
}
