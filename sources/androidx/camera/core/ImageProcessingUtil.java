package androidx.camera.core;

import E.I;
import E.S;
import E.d0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;
import java.nio.ByteBuffer;
import java.util.Locale;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f13708a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(ImageProxy imageProxy) {
        if (!f(imageProxy)) {
            f.g("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0) {
            f.g("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static ImageProxy b(d0 d0Var, byte[] bArr) {
        p118hf.a.f(d0Var.getImageFormat() == 256);
        bArr.getClass();
        Surface surface = d0Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            f.g("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy imageProxyAcquireLatestImage = d0Var.acquireLatestImage();
        if (imageProxyAcquireLatestImage == null) {
            f.g("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return imageProxyAcquireLatestImage;
    }

    public static Bitmap c(ImageProxy imageProxy) {
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static I d(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, int i7, boolean z3) {
        if (!f(imageProxy)) {
            f.g("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        System.currentTimeMillis();
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            f.g("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = imageReaderProxy.getSurface();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z3 ? pixelStride : 0, z3 ? pixelStride2 : 0, z3 ? pixelStride2 : 0, i7) != 0) {
            f.g("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            f.G("ImageProcessingUtil");
            f13708a++;
        }
        ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (imageProxyAcquireLatestImage == null) {
            f.g("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        I i10 = new I(imageProxyAcquireLatestImage);
        i10.a(new S(imageProxyAcquireLatestImage, imageProxy, 0));
        return i10;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i7) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i7, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean f(ImageProxy imageProxy) {
        return imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3;
    }

    public static I g(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        String str;
        if (!f(imageProxy)) {
            f.g("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            f.g("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i7 > 0) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int rowStride = imageProxy.getPlanes()[0].getRowStride();
            int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
            int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
            int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i7) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
                if (imageProxyAcquireLatestImage == null) {
                    f.g("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                    return null;
                }
                I i10 = new I(imageProxyAcquireLatestImage);
                i10.a(new S(imageProxyAcquireLatestImage, imageProxy, 1));
                return i10;
            }
            str = "ImageProcessingUtil";
        } else {
            str = "ImageProcessingUtil";
        }
        f.g(str, "rotate YUV failure");
        return null;
    }

    public static void h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            f.g("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i7, @NonNull ByteBuffer byteBuffer2, int i10, @NonNull ByteBuffer byteBuffer3, int i11, int i12, int i13, @Nullable Surface surface, @Nullable ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeConvertAndroid420ToBitmap(@NonNull ByteBuffer byteBuffer, int i7, @NonNull ByteBuffer byteBuffer2, int i10, @NonNull ByteBuffer byteBuffer3, int i11, int i12, int i13, @NonNull Bitmap bitmap, int i14, int i15, int i16);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i7, int i10, int i11, int i12, boolean z3);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i7, @NonNull ByteBuffer byteBuffer2, int i10, @NonNull ByteBuffer byteBuffer3, int i11, int i12, @NonNull ByteBuffer byteBuffer4, int i13, int i14, @NonNull ByteBuffer byteBuffer5, int i15, int i16, @NonNull ByteBuffer byteBuffer6, int i17, int i18, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i19, int i20, int i21);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i7, @NonNull ByteBuffer byteBuffer2, int i10, @NonNull ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
