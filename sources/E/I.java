package E;

import androidx.camera.core.ImageProxy;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class I extends androidx.camera.core.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1928d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1929e;

    public I(ImageProxy imageProxy) {
        super(imageProxy);
        this.f1929e = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        switch (this.f1928d) {
            case 1:
                if (!((AtomicBoolean) this.f1929e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public I(ImageProxy imageProxy, J j6) {
        super(imageProxy);
        this.f1929e = new WeakReference(j6);
        a(new H(this, 0));
    }
}
