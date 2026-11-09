package p109h3;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CloseableImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X2.b f37264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37265b;

    @Override // com.facebook.imagepipeline.image.CloseableImage, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                X2.b bVar = this.f37264a;
                if (bVar == null) {
                    return;
                }
                this.f37264a = null;
                synchronized (bVar) {
                    CloseableReference.d(bVar.f10996b);
                    bVar.f10996b = null;
                    CloseableReference.e(bVar.f10997c);
                    bVar.f10997c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final synchronized int getHeight() {
        X2.b bVar;
        bVar = this.f37264a;
        return bVar == null ? 0 : bVar.f10995a.getHeight();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final synchronized int getSizeInBytes() {
        X2.b bVar;
        bVar = this.f37264a;
        return bVar == null ? 0 : bVar.f10995a.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final synchronized int getWidth() {
        X2.b bVar;
        bVar = this.f37264a;
        return bVar == null ? 0 : bVar.f10995a.getWidth();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final synchronized boolean isClosed() {
        return this.f37264a == null;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final boolean isStateful() {
        return this.f37265b;
    }
}
