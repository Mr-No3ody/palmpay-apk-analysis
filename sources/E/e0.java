package E;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.camera.core.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageInfo f2016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f2017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2018g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2019i;

    public e0(ImageProxy imageProxy, Size size, ImageInfo imageInfo) {
        super(imageProxy);
        this.f2015d = new Object();
        if (size == null) {
            this.f2018g = this.f13731b.getWidth();
            this.f2019i = this.f13731b.getHeight();
        } else {
            this.f2018g = size.getWidth();
            this.f2019i = size.getHeight();
        }
        this.f2016e = imageInfo;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy
    public final Rect getCropRect() {
        synchronized (this.f2015d) {
            try {
                if (this.f2017f == null) {
                    return new Rect(0, 0, this.f2018g, this.f2019i);
                }
                return new Rect(this.f2017f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.f2019i;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy
    public final ImageInfo getImageInfo() {
        return this.f2016e;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.f2018g;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.ImageProxy
    public final void setCropRect(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f2018g, this.f2019i)) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f2015d) {
            this.f2017f = rect;
        }
    }
}
