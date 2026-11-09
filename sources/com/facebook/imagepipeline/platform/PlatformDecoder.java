package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109h3.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/imagepipeline/platform/PlatformDecoder;", "", "Lh3/e;", "encodedImage", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Rect;", "regionToDecode", "Lcom/facebook/common/references/CloseableReference;", "Landroid/graphics/Bitmap;", "decodeFromEncodedImage", "(Lh3/e;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;)Lcom/facebook/common/references/CloseableReference;", "", "length", "decodeJPEGFromEncodedImage", "(Lh3/e;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;I)Lcom/facebook/common/references/CloseableReference;", "Landroid/graphics/ColorSpace;", "colorSpace", "decodeFromEncodedImageWithColorSpace", "(Lh3/e;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;Landroid/graphics/ColorSpace;)Lcom/facebook/common/references/CloseableReference;", "decodeJPEGFromEncodedImageWithColorSpace", "(Lh3/e;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;ILandroid/graphics/ColorSpace;)Lcom/facebook/common/references/CloseableReference;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PlatformDecoder {
    @Nullable
    CloseableReference decodeFromEncodedImage(@NotNull e encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode);

    @Nullable
    CloseableReference decodeFromEncodedImageWithColorSpace(@NotNull e encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, @Nullable ColorSpace colorSpace);

    @Nullable
    CloseableReference decodeJPEGFromEncodedImage(@NotNull e encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length);

    @Nullable
    CloseableReference decodeJPEGFromEncodedImageWithColorSpace(@NotNull e encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length, @Nullable ColorSpace colorSpace);
}
