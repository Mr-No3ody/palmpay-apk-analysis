package E;

import B6.RunnableC0085g;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: E.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197b implements ImageReaderProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f1981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1982b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1983c = true;

    public C0197b(ImageReader imageReader) {
        this.f1981a = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        Image imageAcquireLatestImage;
        synchronized (this.f1982b) {
            try {
                imageAcquireLatestImage = this.f1981a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!"ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.b(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        Image imageAcquireNextImage;
        synchronized (this.f1982b) {
            try {
                imageAcquireNextImage = this.f1981a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!"ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.b(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        synchronized (this.f1982b) {
            this.f1983c = true;
            this.f1981a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f1982b) {
            this.f1981a.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f1982b) {
            height = this.f1981a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f1982b) {
            imageFormat = this.f1981a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f1982b) {
            maxImages = this.f1981a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1982b) {
            surface = this.f1981a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f1982b) {
            width = this.f1981a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.f1982b) {
            this.f1983c = false;
            this.f1981a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: E.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0197b c0197b = this.f1977a;
                    Executor executor2 = executor;
                    ImageReaderProxy.OnImageAvailableListener onImageAvailableListener2 = onImageAvailableListener;
                    synchronized (c0197b.f1982b) {
                        try {
                            if (!c0197b.f1983c) {
                                executor2.execute(new RunnableC0085g(6, c0197b, onImageAvailableListener2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, androidx.camera.core.impl.utils.n.o());
        }
    }
}
