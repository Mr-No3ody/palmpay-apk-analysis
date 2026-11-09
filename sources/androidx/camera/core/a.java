package androidx.camera.core;

import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ImageProxy.PlaneProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image.Plane f13710a;

    public a(Image.Plane plane) {
        this.f13710a = plane;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final ByteBuffer getBuffer() {
        return this.f13710a.getBuffer();
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getPixelStride() {
        return this.f13710a.getPixelStride();
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getRowStride() {
        return this.f13710a.getRowStride();
    }
}
