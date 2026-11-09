package androidx.camera.core;

import E.C0201f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.O0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f13711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f13712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0201f f13713c;

    public b(Image image) {
        this.f13711a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f13712b = new a[planes.length];
            for (int i7 = 0; i7 < planes.length; i7++) {
                this.f13712b[i7] = new a(planes[i7]);
            }
        } else {
            this.f13712b = new a[0];
        }
        this.f13713c = new C0201f(O0.f13940b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.f13711a.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Rect getCropRect() {
        return this.f13711a.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.f13711a.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.f13711a.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.f13711a;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageInfo getImageInfo() {
        return this.f13713c;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        return this.f13712b;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.f13711a.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public final void setCropRect(Rect rect) {
        this.f13711a.setCropRect(rect);
    }
}
