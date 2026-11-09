package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.image.CloseableImage;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueDescriptor {
    @Override // com.facebook.imagepipeline.cache.ValueDescriptor
    public final int getSizeInBytes(Object obj) {
        return ((CloseableImage) obj).getSizeInBytes();
    }
}
