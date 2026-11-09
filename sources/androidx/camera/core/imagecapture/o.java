package androidx.camera.core.imagecapture;

import E.e0;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.O0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ImageReaderProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReaderProxy f13779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f13780b;

    public o(ImageReaderProxy imageReaderProxy) {
        this.f13779a = imageReaderProxy;
    }

    public final e0 a(ImageProxy imageProxy) {
        O0 o10;
        if (imageProxy == null) {
            return null;
        }
        if (this.f13780b == null) {
            o10 = O0.f13940b;
        } else {
            t tVar = this.f13780b;
            Pair pair = new Pair(tVar.f13804h, tVar.f13805i.get(0));
            O0 o11 = O0.f13940b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            o10 = new O0(arrayMap);
        }
        this.f13780b = null;
        return new e0(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new androidx.camera.core.internal.c(new androidx.camera.core.streamsharing.i(null, o10, imageProxy.getImageInfo().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        return a(this.f13779a.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        return a(this.f13779a.acquireNextImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        this.f13779a.clearOnImageAvailableListener();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        this.f13779a.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        return this.f13779a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        return this.f13779a.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        return this.f13779a.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        return this.f13779a.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        return this.f13779a.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        this.f13779a.setOnImageAvailableListener(new U8.a(9, this, onImageAvailableListener), executor);
    }
}
