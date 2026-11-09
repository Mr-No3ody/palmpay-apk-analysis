package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class InputImage implements MLTaskInput {

    @KeepForSdk
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;

    @Nullable
    private volatile Bitmap zza;

    @Nullable
    private volatile ByteBuffer zzb;

    @Nullable
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;

    @ImageFormat
    private final int zzg;

    @Nullable
    private final Matrix zzh;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    private InputImage(@NonNull Bitmap bitmap, int i7) {
        this.zza = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        this.zzf = i7;
        this.zzg = -1;
        this.zzh = null;
    }

    @NonNull
    public static InputImage fromBitmap(@NonNull Bitmap bitmap, int i7) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i7);
        zzb(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i7);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteArray(@NonNull byte[] bArr, int i7, int i10, int i11, @ImageFormat int i12) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i7, i10, i11, i12);
        zzb(i12, 2, jElapsedRealtime, i10, i7, bArr.length, i11);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, int i7, int i10, int i11, @ImageFormat int i12) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i7, i10, i11, i12);
        zzb(i12, 3, jElapsedRealtime, i10, i7, byteBuffer.limit(), i11);
        return inputImage;
    }

    @NonNull
    public static InputImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(bitmapZza, 0);
        zzb(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
        return inputImage;
    }

    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i7) {
        return zza(image, i7, null);
    }

    private static InputImage zza(@NonNull Image image, int i7, @Nullable Matrix matrix) {
        int i10;
        boolean z3;
        int i11;
        Image image2;
        int iLimit;
        InputImage inputImage;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        boolean z8 = true;
        if (i7 == 0 || i7 == 90 || i7 == 180) {
            i10 = i7;
            z3 = true;
        } else if (i7 == 270) {
            z3 = true;
            i10 = 270;
        } else {
            i10 = i7;
            z3 = false;
        }
        Preconditions.checkArgument(z3, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i10), 0);
            image2 = image;
            i11 = i10;
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            i11 = i10;
            image2 = image;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i11, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzb(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i11);
        return inputImage;
    }

    private static void zzb(int i7, int i10, long j6, int i11, int i12, int i13, int i14) {
        zzli.zza(zzlg.zzb("vision-common"), i7, i10, j6, i11, i12, i13, i14);
    }

    @Nullable
    @KeepForSdk
    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    @Nullable
    @KeepForSdk
    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    @Nullable
    @KeepForSdk
    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    @KeepForSdk
    @ImageFormat
    public int getFormat() {
        return this.zzg;
    }

    @KeepForSdk
    public int getHeight() {
        return this.zze;
    }

    @Nullable
    @KeepForSdk
    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    @Nullable
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    @KeepForSdk
    public int getRotationDegrees() {
        return this.zzf;
    }

    @KeepForSdk
    public int getWidth() {
        return this.zzd;
    }

    @NonNull
    @KeepForSdk
    public static InputImage fromMediaImage(@NonNull Image image, int i7, @NonNull Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zza(image, i7, matrix);
    }

    private InputImage(@NonNull Image image, int i7, int i10, int i11, @Nullable Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i7;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(@NonNull ByteBuffer byteBuffer, int i7, int i10, int i11, @ImageFormat int i12) {
        boolean z3;
        if (i12 == 842094169) {
            z3 = true;
        } else if (i12 == 17) {
            i12 = 17;
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        this.zzb = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i7 * i10, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i7;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = null;
    }
}
