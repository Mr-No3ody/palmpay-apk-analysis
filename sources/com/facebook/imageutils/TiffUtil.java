package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/facebook/imageutils/TiffUtil;", "", "", "orientation", "getAutoRotateAngleFromOrientation", "(I)I", "Ljava/io/InputStream;", "stream", "length", "readOrientationFromTIFF", "(Ljava/io/InputStream;I)I", "TIFF_BYTE_ORDER_BIG_END", "I", "TIFF_BYTE_ORDER_LITTLE_END", "TIFF_TAG_ORIENTATION", "TIFF_TYPE_SHORT", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TiffUtil {

    @NotNull
    public static final TiffUtil INSTANCE = new TiffUtil();
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;

    @JvmStatic
    public static final int getAutoRotateAngleFromOrientation(int orientation) {
        if (orientation == 0 || orientation == 1) {
            return 0;
        }
        if (orientation == 3) {
            return 180;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    @JvmStatic
    public static final int readOrientationFromTIFF(@NotNull InputStream stream, int length) throws IOException {
        boolean z3;
        int packedInt;
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(stream, "stream");
        INSTANCE.getClass();
        if (length > 8) {
            int packedInt2 = StreamProcessor.readPackedInt(stream, 4, false);
            if (packedInt2 == 1229531648 || packedInt2 == 1296891946) {
                z3 = packedInt2 == 1229531648;
                packedInt = StreamProcessor.readPackedInt(stream, 4, z3);
                i7 = length - 8;
                if (packedInt < 8 || packedInt - 8 > i7) {
                    a.e(TiffUtil.class, "Invalid offset");
                    i7 = 0;
                }
            } else {
                a.e(TiffUtil.class, "Invalid TIFF header");
                i7 = 0;
                z3 = false;
                packedInt = 0;
            }
        } else {
            i7 = 0;
            z3 = false;
            packedInt = 0;
        }
        int i11 = packedInt - 8;
        if (i7 != 0 && i11 <= i7) {
            stream.skip(i11);
            int i12 = i7 - i11;
            if (i12 < 14) {
                i10 = 0;
                break;
            }
            int packedInt3 = StreamProcessor.readPackedInt(stream, 2, z3);
            int i13 = i12 - 2;
            while (true) {
                int i14 = packedInt3 - 1;
                if (packedInt3 <= 0 || i13 < 12) {
                    i10 = 0;
                    break;
                }
                i10 = i13 - 2;
                if (StreamProcessor.readPackedInt(stream, 2, z3) == 274) {
                    break;
                }
                stream.skip(10L);
                i13 -= 12;
                packedInt3 = i14;
            }
            INSTANCE.getClass();
            if (i10 >= 10 && StreamProcessor.readPackedInt(stream, 2, z3) == 3 && StreamProcessor.readPackedInt(stream, 4, z3) == 1) {
                return StreamProcessor.readPackedInt(stream, 2, z3);
            }
        }
        return 0;
    }
}
