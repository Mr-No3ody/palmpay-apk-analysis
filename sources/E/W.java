package E;

import B6.RunnableC0085g;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class W implements ImageReaderProxy, ForwardingImageProxy$OnImageCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f1959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dg.a f1961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0197b f1963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageReaderProxy.OnImageAvailableListener f1964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f1965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray f1966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray f1967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1970m;

    public W(int i7, int i10, int i11, int i12) {
        C0197b c0197b = new C0197b(ImageReader.newInstance(i7, i10, i11, i12));
        this.f1958a = new Object();
        this.f1959b = new V(this, 0);
        this.f1960c = 0;
        this.f1961d = new Dg.a(this, 4);
        this.f1962e = false;
        this.f1966i = new LongSparseArray();
        this.f1967j = new LongSparseArray();
        this.f1970m = new ArrayList();
        this.f1963f = c0197b;
        this.f1968k = 0;
        this.f1969l = new ArrayList(getMaxImages());
    }

    public final void a(ImageProxy imageProxy) {
        synchronized (this.f1958a) {
            try {
                int iIndexOf = this.f1969l.indexOf(imageProxy);
                if (iIndexOf >= 0) {
                    this.f1969l.remove(iIndexOf);
                    int i7 = this.f1968k;
                    if (iIndexOf <= i7) {
                        this.f1968k = i7 - 1;
                    }
                }
                this.f1970m.remove(imageProxy);
                if (this.f1960c > 0) {
                    c(this.f1963f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        synchronized (this.f1958a) {
            try {
                if (this.f1969l.isEmpty()) {
                    return null;
                }
                if (this.f1968k >= this.f1969l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.f1969l.size() - 1; i7++) {
                    if (!this.f1970m.contains(this.f1969l.get(i7))) {
                        arrayList.add((ImageProxy) this.f1969l.get(i7));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                int size = this.f1969l.size();
                ArrayList arrayList2 = this.f1969l;
                this.f1968k = size;
                ImageProxy imageProxy = (ImageProxy) arrayList2.get(size - 1);
                this.f1970m.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        synchronized (this.f1958a) {
            try {
                if (this.f1969l.isEmpty()) {
                    return null;
                }
                if (this.f1968k >= this.f1969l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f1969l;
                int i7 = this.f1968k;
                this.f1968k = i7 + 1;
                ImageProxy imageProxy = (ImageProxy) arrayList.get(i7);
                this.f1970m.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(e0 e0Var) {
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.f1958a) {
            try {
                if (this.f1969l.size() < getMaxImages()) {
                    e0Var.a(this);
                    this.f1969l.add(e0Var);
                    onImageAvailableListener = this.f1964g;
                    executor = this.f1965h;
                } else {
                    p140j8.f.G("TAG");
                    e0Var.close();
                    onImageAvailableListener = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new RunnableC0085g(9, this, onImageAvailableListener));
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    public final void c(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxyAcquireNextImage;
        synchronized (this.f1958a) {
            try {
                if (this.f1962e) {
                    return;
                }
                int size = this.f1967j.size() + this.f1969l.size();
                if (size >= imageReaderProxy.getMaxImages()) {
                    p140j8.f.G("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
                        if (imageProxyAcquireNextImage != null) {
                            this.f1960c--;
                            size++;
                            this.f1967j.put(imageProxyAcquireNextImage.getImageInfo().getTimestamp(), imageProxyAcquireNextImage);
                            d();
                        }
                    } catch (IllegalStateException unused) {
                        p140j8.f.G("MetadataImageReader");
                        imageProxyAcquireNextImage = null;
                    }
                    if (imageProxyAcquireNextImage == null || this.f1960c <= 0) {
                        break;
                    }
                } while (size < imageReaderProxy.getMaxImages());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        synchronized (this.f1958a) {
            this.f1963f.clearOnImageAvailableListener();
            this.f1964g = null;
            this.f1965h = null;
            this.f1960c = 0;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.f1958a) {
            try {
                if (this.f1962e) {
                    return;
                }
                Iterator it = new ArrayList(this.f1969l).iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                this.f1969l.clear();
                this.f1963f.close();
                this.f1962e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f1958a) {
            try {
                for (int size = this.f1966i.size() - 1; size >= 0; size--) {
                    ImageInfo imageInfo = (ImageInfo) this.f1966i.valueAt(size);
                    long timestamp = imageInfo.getTimestamp();
                    ImageProxy imageProxy = (ImageProxy) this.f1967j.get(timestamp);
                    if (imageProxy != null) {
                        this.f1967j.remove(timestamp);
                        this.f1966i.removeAt(size);
                        b(new e0(imageProxy, null, imageInfo));
                    }
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f1958a) {
            try {
                if (this.f1967j.size() != 0 && this.f1966i.size() != 0) {
                    long jKeyAt = this.f1967j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f1966i.keyAt(0);
                    p118hf.a.f(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f1967j.size() - 1; size >= 0; size--) {
                            if (this.f1967j.keyAt(size) < jKeyAt2) {
                                ((ImageProxy) this.f1967j.valueAt(size)).close();
                                this.f1967j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f1966i.size() - 1; size2 >= 0; size2--) {
                            if (this.f1966i.keyAt(size2) < jKeyAt) {
                                this.f1966i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.f1958a) {
            height = this.f1963f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.f1958a) {
            imageFormat = this.f1963f.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        int maxImages;
        synchronized (this.f1958a) {
            maxImages = this.f1963f.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1958a) {
            surface = this.f1963f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.f1958a) {
            width = this.f1963f.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        synchronized (this.f1958a) {
            a(imageProxy);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.f1958a) {
            onImageAvailableListener.getClass();
            this.f1964g = onImageAvailableListener;
            executor.getClass();
            this.f1965h = executor;
            this.f1963f.setOnImageAvailableListener(this.f1961d, executor);
        }
    }
}
