package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/imageutils/StreamProcessor;", "", "Ljava/io/InputStream;", "stream", "", "numBytes", "", "isLittleEndian", "readPackedInt", "(Ljava/io/InputStream;IZ)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamProcessor {

    @NotNull
    public static final StreamProcessor INSTANCE = new StreamProcessor();

    @JvmStatic
    public static final int readPackedInt(@NotNull InputStream stream, int numBytes, boolean isLittleEndian) throws IOException {
        int i7;
        Intrinsics.checkNotNullParameter(stream, "stream");
        int i10 = 0;
        for (int i11 = 0; i11 < numBytes; i11++) {
            int i12 = stream.read();
            if (i12 == -1) {
                throw new IOException("no more bytes");
            }
            if (isLittleEndian) {
                i7 = (i12 & 255) << (i11 * 8);
            } else {
                i10 <<= 8;
                i7 = i12 & 255;
            }
            i10 |= i7;
        }
        return i10;
    }
}
