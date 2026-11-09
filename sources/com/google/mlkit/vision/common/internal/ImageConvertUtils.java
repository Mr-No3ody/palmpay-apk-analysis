package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class ImageConvertUtils {
    private static final ImageConvertUtils zza = new ImageConvertUtils();

    private ImageConvertUtils() {
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer bufferWithBackingArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @NonNull
    @KeepForSdk
    public static ImageConvertUtils getInstance() {
        return zza;
    }

    @NonNull
    @KeepForSdk
    public static Bitmap yv12ToBitmap(@NonNull ByteBuffer byteBuffer, int i7, int i10, int i11) throws MlKitException {
        byte[] bArrZzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i7, i10);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i11, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @VisibleForTesting
    @KeepForSdk
    public static ByteBuffer yv12ToNv21Buffer(@NonNull ByteBuffer byteBuffer, boolean z3) {
        int i7;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z3 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i11 = 0;
        while (true) {
            i7 = i10 * 4;
            if (i11 >= i7) {
                break;
            }
            byteBufferAllocate.put(i11, byteBuffer.get(i11));
            i11++;
        }
        for (int i12 = 0; i12 < i10 + i10; i12++) {
            byteBufferAllocate.put(i7 + i12, byteBuffer.get((i12 / 2) + ((i12 % 2) * i10) + i7));
        }
        return byteBufferAllocate;
    }

    private static Bitmap zza(Bitmap bitmap, int i7, int i10, int i11) {
        if (i7 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i10, i11);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        return Bitmap.createBitmap(bitmap, 0, 0, i10, i11, matrix, true);
    }

    private static byte[] zzb(@NonNull byte[] bArr, int i7, int i10) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i7, i10, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i7, i10), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    } catch (Exception unused) {
                        throw th;
                    }
                }
            }
        } catch (IOException unused2) {
            throw new MlKitException("Image conversion error from NV21 format", 13);
        }
    }

    private static final void zzc(Image.Plane plane, int i7, int i10, byte[] bArr, int i11, int i12) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i13 = i7 / (i10 / rowStride);
        int rowStride2 = 0;
        for (int i14 = 0; i14 < rowStride; i14++) {
            int pixelStride = rowStride2;
            for (int i15 = 0; i15 < i13; i15++) {
                bArr[i11] = buffer.get(pixelStride);
                i11 += i12;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    @NonNull
    @KeepForSdk
    public byte[] byteBufferToByteArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer cloneByteBuffer(@NonNull ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocateDirect.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocateDirect;
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertJpegToUpRightBitmap(@NonNull Image image, int i7) {
        Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return zza(bitmapDecodeByteArray, i7, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer convertToNv21Buffer(@NonNull InputImage inputImage, boolean z3) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format == 17) {
                return z3 ? bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())) : (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
            if (format == 35) {
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            }
            if (format == 842094169) {
                return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z3);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i7 = width * height;
        int[] iArr = new int[i7];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i7;
        ByteBuffer byteBufferAllocate = z3 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = 0;
            while (i13 < width) {
                int i14 = iArr[i10];
                int i15 = (i14 >> 16) & 255;
                int i16 = (i14 >> 8) & 255;
                int i17 = i14 & 255;
                int i18 = ((((i17 * HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) + ((i15 * (-38)) - (i16 * 74))) + 128) >> 8) + 128;
                int i19 = (((((i15 * HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) - (i16 * 94)) - (i17 * 18)) + 128) >> 8) + 128;
                int i20 = i11 + 1;
                byteBufferAllocate.put(i11, (byte) Math.min(255, ((((i17 * 25) + ((i16 * 129) + (i15 * 66))) + 128) >> 8) + 16));
                if (i12 % 2 == 0 && i10 % 2 == 0) {
                    int i21 = i7 + 1;
                    byteBufferAllocate.put(i7, (byte) Math.min(255, i19));
                    i7 += 2;
                    byteBufferAllocate.put(i21, (byte) Math.min(255, i18));
                }
                i10++;
                i13++;
                i11 = i20;
            }
        }
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertToUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return zza((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        if (format == 17) {
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 35) {
            return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        if (format == 842094169) {
            return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    @NonNull
    @KeepForSdk
    public Bitmap getUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        return bitmapInternal != null ? zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight()) : convertToUpRightBitmap(inputImage);
    }

    @NonNull
    @KeepForSdk
    public Bitmap nv21ToBitmap(@NonNull ByteBuffer byteBuffer, int i7, int i10, int i11) throws MlKitException {
        byte[] bArrZzb = zzb(byteBufferToByteArray(byteBuffer), i7, i10);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i11, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer yuv420ThreePlanesToNV21(@NonNull Image.Plane[] planeArr, int i7, int i10) {
        int i11 = i7 * i10;
        int i12 = i11 / 4;
        byte[] bArr = new byte[i12 + i12 + i11];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i13 = (i11 + i11) / 4;
        boolean z3 = buffer2.remaining() == i13 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z3) {
            planeArr[0].getBuffer().get(bArr, 0, i11);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i11, 1);
            buffer3.get(bArr, i11 + 1, i13 - 1);
        } else {
            zzc(planeArr[0], i7, i10, bArr, 0, 1);
            zzc(planeArr[1], i7, i10, bArr, i11 + 1, 2);
            zzc(planeArr[2], i7, i10, bArr, i11, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
