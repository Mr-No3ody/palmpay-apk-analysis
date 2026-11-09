package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;
import p109h3.c;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface CloseableStaticBitmap extends CloseableBitmap {
    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i7) {
        return of(bitmap, resourceReleaser, qualityInfo, i7, 0);
    }

    CloseableReference cloneUnderlyingBitmapReference();

    CloseableReference convertToBitmapReference();

    int getExifOrientation();

    int getRotationAngle();

    static CloseableStaticBitmap of(CloseableReference closeableReference, QualityInfo qualityInfo, int i7) {
        return of(closeableReference, qualityInfo, i7, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i7, int i10) {
        int i11 = c.f37266j;
        return new c(bitmap, resourceReleaser, qualityInfo, i7, i10);
    }

    static CloseableStaticBitmap of(CloseableReference closeableReference, QualityInfo qualityInfo, int i7, int i10) {
        int i11 = c.f37266j;
        return new c(closeableReference, qualityInfo, i7, i10);
    }
}
