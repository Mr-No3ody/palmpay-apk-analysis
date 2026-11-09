package com.facebook.imagepipeline.transcoder;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109h3.e;
import p196n3.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/facebook/imagepipeline/transcoder/ImageTranscoder;", "", "Lh3/e;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/imagepipeline/common/i;", "rotationOptions", "Lcom/facebook/imagepipeline/common/g;", "resizeOptions", "LW2/e;", "outputFormat", "", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Ln3/a;", "transcode", "(Lh3/e;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/i;Lcom/facebook/imagepipeline/common/g;LW2/e;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Ln3/a;", "", "canResize", "(Lh3/e;Lcom/facebook/imagepipeline/common/i;Lcom/facebook/imagepipeline/common/g;)Z", "imageFormat", "canTranscode", "(LW2/e;)Z", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ImageTranscoder {
    boolean canResize(@NotNull e encodedImage, @Nullable i rotationOptions, @Nullable g resizeOptions);

    boolean canTranscode(@NotNull W2.e imageFormat);

    @NotNull
    String getIdentifier();

    @NotNull
    a transcode(@NotNull e encodedImage, @NotNull OutputStream outputStream, @Nullable i rotationOptions, @Nullable g resizeOptions, @Nullable W2.e outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws IOException;
}
