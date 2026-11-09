package com.facebook.imagepipeline.image;

import com.facebook.common.references.HasBitmap;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface CloseableImage extends Closeable, ImageInfo, HasBitmap, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // com.facebook.imagepipeline.image.ImageInfo
    int getHeight();

    ImageInfo getImageInfo();

    @Override // com.facebook.imagepipeline.image.ImageInfo
    QualityInfo getQualityInfo();

    @Override // com.facebook.imagepipeline.image.ImageInfo
    int getSizeInBytes();

    @Override // com.facebook.imagepipeline.image.ImageInfo
    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
