package com.facebook.imageutils;

import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/facebook/imageutils/JfifUtil;", "", "", "orientation", "getAutoRotateAngleFromOrientation", "(I)I", "", "jpeg", "getOrientation", "([B)I", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)I", "markerToFind", "", "moveToMarker", "(Ljava/io/InputStream;I)Z", "MARKER_FIRST_BYTE", "I", "MARKER_ESCAPE_BYTE", "MARKER_SOI", "MARKER_TEM", "MARKER_EOI", "MARKER_SOS", "MARKER_APP1", "MARKER_SOFn", "MARKER_RST0", "MARKER_RST7", "APP1_EXIF_MAGIC", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;

    @NotNull
    public static final JfifUtil INSTANCE = new JfifUtil();
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    @JvmStatic
    public static final int getAutoRotateAngleFromOrientation(int orientation) {
        return TiffUtil.getAutoRotateAngleFromOrientation(orientation);
    }

    @JvmStatic
    public static final int getOrientation(@Nullable byte[] jpeg) {
        return getOrientation(new ByteArrayInputStream(jpeg));
    }

    @JvmStatic
    public static final boolean moveToMarker(@NotNull InputStream inputStream, int markerToFind) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (StreamProcessor.readPackedInt(inputStream, 1, false) == 255) {
            int packedInt = 255;
            while (packedInt == 255) {
                packedInt = StreamProcessor.readPackedInt(inputStream, 1, false);
            }
            if (markerToFind == 192) {
                INSTANCE.getClass();
                switch (packedInt) {
                    case MARKER_SOFn /* 192 */:
                    case 193:
                    case 194:
                    case 195:
                    case 197:
                    case 198:
                    case 199:
                    case MlKitException.CODE_SCANNER_CANCELLED /* 201 */:
                    case MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED /* 202 */:
                    case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                    case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                    case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                    case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                        return true;
                }
            }
            if (packedInt == markerToFind) {
                return true;
            }
            if (packedInt != 1 && packedInt != 216) {
                if (packedInt == 217 || packedInt == 218) {
                    return false;
                }
                inputStream.skip(StreamProcessor.readPackedInt(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @JvmStatic
    public static final int getOrientation(@NotNull InputStream inputStream) {
        int i7;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            INSTANCE.getClass();
            if (moveToMarker(inputStream, MARKER_APP1)) {
                int packedInt = StreamProcessor.readPackedInt(inputStream, 2, false);
                if (packedInt - 2 > 6) {
                    int packedInt2 = StreamProcessor.readPackedInt(inputStream, 4, false);
                    int packedInt3 = StreamProcessor.readPackedInt(inputStream, 2, false);
                    i7 = packedInt - 8;
                    if (packedInt2 != 1165519206 || packedInt3 != 0) {
                        i7 = 0;
                    }
                } else {
                    i7 = 0;
                }
            } else {
                i7 = 0;
            }
            if (i7 == 0) {
                return 0;
            }
            return TiffUtil.readOrientationFromTIFF(inputStream, i7);
        } catch (IOException unused) {
            return 0;
        }
    }
}
