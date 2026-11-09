package com.facebook.imagepipeline.producers;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/imagepipeline/producers/ThumbnailProducer;", "T", "Lcom/facebook/imagepipeline/producers/Producer;", "Lcom/facebook/imagepipeline/common/g;", "resizeOptions", "", "canProvideImageForSize", "(Lcom/facebook/imagepipeline/common/g;)Z", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ThumbnailProducer<T> extends Producer<T> {
    boolean canProvideImageForSize(@Nullable com.facebook.imagepipeline.common.g resizeOptions);
}
