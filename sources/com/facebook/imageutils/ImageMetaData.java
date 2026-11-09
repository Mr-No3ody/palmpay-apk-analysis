package com.facebook.imageutils;

import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/imageutils/ImageMetaData;", "", "", "width", "height", "Landroid/graphics/ColorSpace;", "colorSpace", "<init>", "(IILandroid/graphics/ColorSpace;)V", "a", "Landroid/graphics/ColorSpace;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "getDimensions", "()Lkotlin/Pair;", "dimensions", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageMetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Pair dimensions;

    public ImageMetaData(int i7, int i10, @Nullable ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
        this.dimensions = (i7 == -1 || i10 == -1) ? null : new Pair(Integer.valueOf(i7), Integer.valueOf(i10));
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Nullable
    public final Pair<Integer, Integer> getDimensions() {
        return this.dimensions;
    }
}
