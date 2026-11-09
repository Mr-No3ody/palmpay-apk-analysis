package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ImageProxy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageProxy f13731b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13730a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f13732c = new HashSet();

    public d(ImageProxy imageProxy) {
        this.f13731b = imageProxy;
    }

    public final void a(ForwardingImageProxy$OnImageCloseListener forwardingImageProxy$OnImageCloseListener) {
        synchronized (this.f13730a) {
            this.f13732c.add(forwardingImageProxy$OnImageCloseListener);
        }
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f13731b.close();
        synchronized (this.f13730a) {
            hashSet = new HashSet(this.f13732c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ForwardingImageProxy$OnImageCloseListener) it.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public Rect getCropRect() {
        return this.f13731b.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.f13731b.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.f13731b.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.f13731b.getImage();
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        return this.f13731b.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        return this.f13731b.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.f13731b.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(Rect rect) {
        this.f13731b.setCropRect(rect);
    }
}
