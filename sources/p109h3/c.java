package p109h3;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imageutils.BitmapUtil;
import p213o2.e;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a implements CloseableStaticBitmap {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37266j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CloseableReference f37267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Bitmap f37268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final QualityInfo f37269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37270g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37271i;

    public c(Bitmap bitmap, ResourceReleaser resourceReleaser, QualityInfo qualityInfo, int i7, int i10) {
        bitmap.getClass();
        this.f37268e = bitmap;
        Bitmap bitmap2 = this.f37268e;
        resourceReleaser.getClass();
        this.f37267d = CloseableReference.j(bitmap2, resourceReleaser, CloseableReference.f21217f);
        this.f37269f = qualityInfo;
        this.f37270g = i7;
        this.f37271i = i10;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized CloseableReference cloneUnderlyingBitmapReference() {
        return CloseableReference.c(this.f37267d);
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CloseableReference closeableReference;
        synchronized (this) {
            closeableReference = this.f37267d;
            this.f37267d = null;
            this.f37268e = null;
        }
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized CloseableReference convertToBitmapReference() {
        CloseableReference closeableReference;
        e.e(this.f37267d, "Cannot convert a closed static bitmap");
        synchronized (this) {
            closeableReference = this.f37267d;
            this.f37267d = null;
            this.f37268e = null;
        }
        return closeableReference;
        return closeableReference;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        a.x("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", c.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getExifOrientation() {
        return this.f37271i;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        int i7;
        if (this.f37270g % 180 != 0 || (i7 = this.f37271i) == 5 || i7 == 7) {
            Bitmap bitmap = this.f37268e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f37268e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // p109h3.a, com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final QualityInfo getQualityInfo() {
        return this.f37269f;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getRotationAngle() {
        return this.f37270g;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getSizeInBytes() {
        return BitmapUtil.getSizeInBytes(this.f37268e);
    }

    @Override // com.facebook.imagepipeline.image.CloseableBitmap
    public final Bitmap getUnderlyingBitmap() {
        return this.f37268e;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        int i7;
        if (this.f37270g % 180 != 0 || (i7 = this.f37271i) == 5 || i7 == 7) {
            Bitmap bitmap = this.f37268e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f37268e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final synchronized boolean isClosed() {
        return this.f37267d == null;
    }

    public c(CloseableReference closeableReference, QualityInfo qualityInfo, int i7, int i10) {
        CloseableReference closeableReferenceB = closeableReference.b();
        closeableReferenceB.getClass();
        this.f37267d = closeableReferenceB;
        this.f37268e = (Bitmap) closeableReferenceB.f();
        this.f37269f = qualityInfo;
        this.f37270g = i7;
        this.f37271i = i10;
    }
}
