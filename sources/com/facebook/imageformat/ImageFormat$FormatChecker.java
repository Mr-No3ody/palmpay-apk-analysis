package com.facebook.imageformat;

import W2.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/imageformat/ImageFormat$FormatChecker", "", "", "headerBytes", "", "headerSize", "LW2/e;", "determineFormat", "([BI)LW2/e;", "getHeaderSize", "()I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ImageFormat$FormatChecker {
    @NotNull
    e determineFormat(@NotNull byte[] headerBytes, int headerSize);

    int getHeaderSize();
}
