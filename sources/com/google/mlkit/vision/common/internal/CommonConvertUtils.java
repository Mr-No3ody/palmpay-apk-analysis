package com.google.mlkit.vision.common.internal;

import C0.G;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.odml.image.BitmapExtractor;
import com.google.android.odml.image.ByteBufferExtractor;
import com.google.android.odml.image.ImageProperties;
import com.google.android.odml.image.MediaImageExtractor;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class CommonConvertUtils {
    @KeepForSdk
    public static int convertToAndroidImageFormat(@InputImage.ImageFormat int i7) {
        int i10 = 17;
        if (i7 != 17) {
            i10 = 35;
            if (i7 != 35) {
                i10 = InputImage.IMAGE_FORMAT_YV12;
                if (i7 != 842094169) {
                    return 0;
                }
            }
        }
        return i10;
    }

    @KeepForSdk
    public static int convertToMVRotation(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 90) {
            return 1;
        }
        if (i7 == 180) {
            return 2;
        }
        if (i7 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid rotation: "));
    }

    @KeepForSdk
    public static void transformPointArray(@NonNull Point[] pointArr, @NonNull Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i7 = 0; i7 < pointArr.length; i7++) {
            int i10 = i7 + i7;
            Point point = pointArr[i7];
            fArr[i10] = point.x;
            fArr[i10 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            int i12 = i11 + i11;
            pointArr[i11].set((int) fArr[i12], (int) fArr[i12 + 1]);
        }
    }

    @KeepForSdk
    public static void transformPointF(@NonNull PointF pointF, @NonNull Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    @KeepForSdk
    public static void transformPointList(@NonNull List<PointF> list, @NonNull Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = i7 + i7;
            fArr[i10] = list.get(i7).x;
            fArr[i10 + 1] = list.get(i7).y;
        }
        matrix.mapPoints(fArr);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = i11 + i11;
            list.get(i11).set(fArr[i12], fArr[i12 + 1]);
        }
    }

    @KeepForSdk
    public static void transformRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Nullable
    public static InputImage zza(@NonNull MlImage mlImage) {
        InputImage inputImageFromBitmap;
        Integer numValueOf;
        ImageProperties imageProperties = mlImage.getContainedImageProperties().get(0);
        int storageType = imageProperties.getStorageType();
        if (storageType != 1) {
            inputImageFromBitmap = null;
            if (storageType == 2) {
                ByteBuffer byteBufferExtract = ByteBufferExtractor.extract(mlImage);
                int imageFormat = imageProperties.getImageFormat();
                if (imageFormat != 4) {
                    numValueOf = imageFormat != 5 ? null : Integer.valueOf(InputImage.IMAGE_FORMAT_YV12);
                } else {
                    numValueOf = 17;
                }
                if (numValueOf != null) {
                    zzb(numValueOf.intValue(), 3, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), byteBufferExtract.limit(), mlImage.getRotation());
                    inputImageFromBitmap = InputImage.fromByteBuffer(byteBufferExtract, mlImage.getWidth(), mlImage.getHeight(), mlImage.getRotation(), numValueOf.intValue());
                }
            } else if (storageType == 3) {
                Image imageExtract = MediaImageExtractor.extract(mlImage);
                zzb(imageExtract.getFormat(), 5, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), imageExtract.getFormat() == 256 ? imageExtract.getPlanes()[0].getBuffer().limit() : (imageExtract.getPlanes()[0].getBuffer().limit() * 3) / 2, mlImage.getRotation());
                inputImageFromBitmap = InputImage.fromMediaImage(imageExtract, mlImage.getRotation());
            }
        } else {
            Bitmap bitmapExtract = BitmapExtractor.extract(mlImage);
            zzb(-1, 1, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), bitmapExtract.getAllocationByteCount(), mlImage.getRotation());
            inputImageFromBitmap = InputImage.fromBitmap(bitmapExtract, mlImage.getRotation());
        }
        if (inputImageFromBitmap != null) {
            zzlk.zza();
        }
        return inputImageFromBitmap;
    }

    private static void zzb(int i7, int i10, long j6, int i11, int i12, int i13, int i14) {
        zzli.zzb(zzlg.zzb("vision-common"), i7, i10, j6, i11, i12, i13, i14);
    }
}
