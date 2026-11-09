package com.yalantis.ucrop.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.BitmapLoadTask;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadUtils {
    private static final String CONTENT_SCHEME = "content";
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapLoadUtils";

    @Deprecated
    public static int calculateInSampleSize(@NonNull BitmapFactory.Options options, int i7, int i10) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        int i13 = 1;
        if (i11 <= i10 && i12 <= i7) {
            return 1;
        }
        while (true) {
            if (i11 / i13 <= i10 && i12 / i13 <= i7) {
                return i13;
            }
            i13 *= 2;
        }
    }

    public static int calculateMaxBitmapSize(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(point.x, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        return maxTextureSize > 0 ? Math.min(iSqrt, maxTextureSize) : iSqrt;
    }

    public static boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= getTotalMemory()) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable == null || !(closeable instanceof Closeable)) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static int computeSize(int i7, int i10) {
        if (i7 % 2 == 1) {
            i7++;
        }
        if (i10 % 2 == 1) {
            i10++;
        }
        int iMax = Math.max(i7, i10);
        float fMin = Math.min(i7, i10) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d2 = fMin;
            if (d2 > 0.5625d || d2 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d2));
            }
            int i11 = iMax / 1280;
            if (i11 == 0) {
                return 1;
            }
            return i11;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public static void decodeBitmapInBackground(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i7, int i10, BitmapLoadCallback bitmapLoadCallback) {
        new BitmapLoadTask(context, uri, uri2, i7, i10, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int exifToDegrees(int i7) {
        switch (i7) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i7) {
        return (i7 == 2 || i7 == 7 || i7 == 4 || i7 == 5) ? -1 : 1;
    }

    public static int getExifOrientation(@NonNull Context context, @NonNull Uri uri) {
        int orientation = 0;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return 0;
            }
            orientation = new ImageHeaderParser(inputStreamOpenInputStream).getOrientation();
            close(inputStreamOpenInputStream);
            return orientation;
        } catch (IOException e10) {
            Log.e(TAG, "getExifOrientation: " + uri.toString(), e10);
            return orientation;
        }
    }

    public static int[] getMaxImageSize(Context context, Uri uri) {
        if (FileUtils.isHasHttp(uri.toString())) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = computeSize(options.outWidth, options.outHeight);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        options.inJustDecodeBounds = false;
        boolean z3 = false;
        Bitmap bitmapDecodeStream = null;
        while (!z3) {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    close(inputStreamOpenInputStream);
                    if (!checkSize(bitmapDecodeStream, options)) {
                        z3 = true;
                    }
                } catch (Throwable th) {
                    close(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (IOException e11) {
                Log.e(TAG, "doInBackground: ImageDecoder.createSource: ", e11);
            } catch (OutOfMemoryError e12) {
                Log.e(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e12);
                options.inSampleSize *= 2;
            }
        }
        return bitmapDecodeStream == null ? new int[]{0, 0} : new int[]{bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight()};
    }

    public static long getTotalMemory() {
        long j6 = Runtime.getRuntime().totalMemory();
        if (j6 > 104857600) {
            return 104857600L;
        }
        return j6;
    }

    public static boolean hasContentScheme(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static Bitmap transformBitmap(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
        Bitmap bitmap2;
        try {
            bitmap2 = bitmap;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                return !bitmap2.sameAs(bitmapCreateBitmap) ? bitmapCreateBitmap : bitmap2;
            } catch (OutOfMemoryError e10) {
                e = e10;
                Log.e(TAG, "transformBitmap: ", e);
                return bitmap2;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
            bitmap2 = bitmap;
        }
    }
}
