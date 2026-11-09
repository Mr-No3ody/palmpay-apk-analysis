package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109h3.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/imagepipeline/decoder/ImageDecoder;", "", "Lh3/e;", "encodedImage", "", "length", "Lcom/facebook/imagepipeline/image/QualityInfo;", "qualityInfo", "Lcom/facebook/imagepipeline/common/c;", "options", "Lcom/facebook/imagepipeline/image/CloseableImage;", "decode", "(Lh3/e;ILcom/facebook/imagepipeline/image/QualityInfo;Lcom/facebook/imagepipeline/common/c;)Lcom/facebook/imagepipeline/image/CloseableImage;", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ImageDecoder {
    @Nullable
    CloseableImage decode(@NotNull e encodedImage, int length, @NotNull QualityInfo qualityInfo, @NotNull c options);
}
