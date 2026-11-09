package E;

import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ImageReaderProxy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageReaderProxy f2009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Surface f2010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ForwardingImageProxy$OnImageCloseListener f2011f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2006a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2007b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2008c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H f2012g = new H(this, 1);

    public d0(ImageReaderProxy imageReaderProxy) {
        this.f2009d = imageReaderProxy;
        this.f2010e = imageReaderProxy.getSurface();
    }

    public final void a() {
        synchronized (this.f2006a) {
            try {
                this.f2008c = true;
                this.f2009d.clearOnImageAvailableListener();
                if (this.f2007b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        I i7;
        synchronized (this.f2006a) {
            ImageProxy imageProxyAcquireLatestImage = this.f2009d.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                this.f2007b++;
                i7 = new I(imageProxyAcquireLatestImage);
                i7.a(this.f2012g);
            } else {
                i7 = null;
            }
        }
        return i7;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        I i7;
        synchronized (this.f2006a) {
            ImageProxy imageProxyAcquireNextImage = this.f2009d.acquireNextImage();
            if (imageProxyAcquireNextImage != null) {
                this.f2007b++;
                i7 = new I(imageProxyAcquireNextImage);
                i7.a(this.f2012g);
            } else {
                i7 = null;
            }
        }
        return i7;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        synchronized (this.f2006a) {
            this.f2009d.clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f2006a) {
            try {
                Surface surface = this.f2010e;
                if (surface != null) {
                    surface.release();
                }
                this.f2009d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f2006a) {
            height = this.f2009d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f2006a) {
            imageFormat = this.f2009d.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f2006a) {
            maxImages = this.f2009d.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f2006a) {
            surface = this.f2009d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f2006a) {
            width = this.f2009d.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.f2006a) {
            this.f2009d.setOnImageAvailableListener(new Ad.c0(4, this, onImageAvailableListener), executor);
        }
    }
}
