package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.h;
import androidx.camera.core.impl.utils.i;
import androidx.camera.core.impl.utils.j;
import androidx.camera.core.impl.utils.k;
import androidx.camera.core.impl.utils.l;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Bitmap a(ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
            imageProxy.getPlanes()[0].getBuffer().rewind();
            ImageProcessingUtil.e(bitmapCreateBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(imageProxy);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!c(imageProxy.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        int iCapacity = buffer.capacity();
        byte[] bArr = new byte[iCapacity];
        buffer.rewind();
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Rational b(int i7, Rational rational) {
        if (i7 == 90 || i7 == 270) {
            return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean c(int i7) {
        return i7 == 256 || i7 == 4101;
    }

    public static byte[] d(ImageProxy imageProxy, Rect rect, int i7, int i10) {
        int i11 = 2;
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer buffer = planeProxy.getBuffer();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getHeight() * imageProxy.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i12 = 0; i12 < imageProxy.getHeight(); i12++) {
            buffer.get(bArr, width, imageProxy.getWidth());
            width += imageProxy.getWidth();
            buffer.position(Math.min(iRemaining, planeProxy.getRowStride() + (buffer.position() - imageProxy.getWidth())));
        }
        int height = imageProxy.getHeight() / 2;
        int width2 = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        int i13 = 0;
        while (i13 < height) {
            int i14 = i11;
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < width2; i17++) {
                int i18 = width + 1;
                bArr[width] = bArr2[i15];
                width += 2;
                bArr[i18] = bArr3[i16];
                i15 += pixelStride;
                i16 += pixelStride2;
            }
            i13++;
            i11 = i14;
        }
        int i19 = i11;
        YuvImage yuvImage = new YuvImage(bArr, 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l[] lVarArr = j.f14230c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        i iVar = new i();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = iVar.f14228a;
        iVar.c("Orientation", strValueOf, arrayList);
        iVar.c("XResolution", "72/1", arrayList);
        iVar.c("YResolution", "72/1", arrayList);
        iVar.c("ResolutionUnit", String.valueOf(i19), arrayList);
        iVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        iVar.c("Make", Build.MANUFACTURER, arrayList);
        iVar.c("Model", Build.MODEL, arrayList);
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(iVar);
        }
        iVar.d(i10);
        iVar.c("ImageWidth", String.valueOf(imageProxy.getWidth()), arrayList);
        iVar.c("ImageLength", String.valueOf(imageProxy.getHeight()), arrayList);
        ArrayList list = Collections.list(new h(iVar));
        if (!((Map) list.get(1)).isEmpty()) {
            iVar.b("ExposureProgram", String.valueOf(0), list);
            iVar.b("ExifVersion", "0230", list);
            iVar.b("ComponentsConfiguration", "1,2,3,0", list);
            iVar.b("MeteringMode", String.valueOf(0), list);
            iVar.b("LightSource", String.valueOf(0), list);
            iVar.b("FlashpixVersion", "0100", list);
            iVar.b("FocalPlaneResolutionUnit", String.valueOf(i19), list);
            iVar.b("FileSource", String.valueOf(3), list);
            iVar.b("SceneType", String.valueOf(1), list);
            iVar.b("CustomRendered", String.valueOf(0), list);
            iVar.b("SceneCaptureType", String.valueOf(0), list);
            iVar.b("Contrast", String.valueOf(0), list);
            iVar.b("Saturation", String.valueOf(0), list);
            iVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i19)).isEmpty()) {
            iVar.b("GPSVersionID", "2300", list);
            iVar.b("GPSSpeedRef", "K", list);
            iVar.b("GPSTrackRef", "T", list);
            iVar.b("GPSImgDirectionRef", "T", list);
            iVar.b("GPSDestBearingRef", "T", list);
            iVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight()) : rect, i7, new k(byteArrayOutputStream, new j(iVar.f14229b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new b("YuvImage failed to encode jpeg.");
    }
}
