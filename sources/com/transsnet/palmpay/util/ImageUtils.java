package com.transsnet.palmpay.util;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.flexbox.FlexItem;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageUtils {
    private static final String TAG = "ImageUtils";

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Bitmap addBorder(Bitmap bitmap, @IntRange(from = 1) int i7, @ColorInt int i10, boolean z3, float f10, boolean z8) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z8) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i10);
        paint.setStyle(Paint.Style.STROKE);
        float f11 = i7;
        paint.setStrokeWidth(f11);
        if (z3) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f11 / 2.0f), paint);
            return bitmap;
        }
        int i11 = i7 >> 1;
        float f12 = i11;
        canvas.drawRoundRect(new RectF(f12, f12, width - i11, height - i11), f10, f10, paint);
        return bitmap;
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @IntRange(from = 1) int i7, @ColorInt int i10) {
        return addBorder(bitmap, i7, i10, true, 0.0f, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @IntRange(from = 1) int i7, @ColorInt int i10, @FloatRange(from = 0.0d) float f10) {
        return addBorder(bitmap, i7, i10, false, f10, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11) {
        return addImageWatermark(bitmap, bitmap2, i7, i10, i11, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i7) {
        return addReflection(bitmap, i7, false);
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i7, @ColorInt int i10, float f10, float f11) {
        return addTextWatermark(bitmap, str, i7, i10, f10, f11, false);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Utils.getApp().getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i7, int i10) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        int i13 = 1;
        while (true) {
            i12 >>= 1;
            if (i12 < i7 || (i11 = i11 >> 1) < i10) {
                break;
            }
            i13 <<= 1;
        }
        return i13;
    }

    public static Bitmap clip(Bitmap bitmap, int i7, int i10, int i11, int i12) {
        return clip(bitmap, i7, i10, i11, i12, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i7) {
        return compressByQuality(bitmap, i7, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i7) {
        return compressBySampleSize(bitmap, i7, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i7, int i10) {
        return scale(bitmap, i7, i10, false);
    }

    private static boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean createOrExistsDir(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i7) {
        return drawColor(bitmap, i7, false);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f10, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f11) {
        return fastBlur(bitmap, f10, f11, false);
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    private static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    private static String getFileExtension(String str) {
        if (isSpace(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || str.lastIndexOf(File.separator) >= iLastIndexOf) ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String getImageType(String str) {
        return getImageType(getFileByPath(str));
    }

    public static int getRotateDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static Bitmap getScrollViewBitmap(FrameLayout frameLayout) {
        int height = 0;
        for (int i7 = 0; i7 < frameLayout.getChildCount(); i7++) {
            height += frameLayout.getChildAt(i7).getHeight();
        }
        frameLayout.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), height, Bitmap.Config.ARGB_8888);
        frameLayout.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap getViewBitmap(View view) {
        view.getHeight();
        view.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap getViewBitmapByMeasure(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            width = view.getMeasuredWidth();
            height = view.getMeasuredHeight();
        }
        String str = TAG;
        if (width <= 0 || height <= 0) {
            Log.e(str, "invalid size, do nothing, return null");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (view.getRight() <= 0 || view.getBottom() <= 0) {
            view.layout(0, 0, width, height);
            view.draw(canvas);
            return bitmapCreateBitmap;
        }
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static byte[] input2Byte(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i7 = inputStream.read(bArr, 0, 1024);
                    if (i7 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        CloseUtils.closeIO(inputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                CloseUtils.closeIO(inputStream);
                return null;
            }
        } catch (Throwable th) {
            CloseUtils.closeIO(inputStream);
            throw th;
        }
    }

    private static boolean isBMP(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private static boolean isGIF(byte[] bArr) {
        byte b7;
        return bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && ((b7 = bArr[4]) == 55 || b7 == 57) && bArr[5] == 97;
    }

    public static boolean isImage(File file) {
        return file != null && isImage(file.getPath());
    }

    private static boolean isJPEG(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    private static boolean isPNG(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static boolean recyleBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        bitmap.recycle();
        return true;
    }

    @TargetApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f10) {
        return renderScriptBlur(bitmap, f10, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i7, float f10, float f11) {
        return rotate(bitmap, i7, f10, f11, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, getFileByPath(str), compressFormat, false);
    }

    public static boolean saveBySize(Bitmap bitmap, File file, long j6, boolean z3) {
        return saveBySize(bitmap, Bitmap.CompressFormat.JPEG, file, j6, z3);
    }

    public static File saveViewsAsImage(File file, WeakReference<View>... weakReferenceArr) {
        return saveViewsAsImage(file, 0, 0, weakReferenceArr);
    }

    public static Bitmap scale(Bitmap bitmap, int i7, int i10) {
        return scale(bitmap, i7, i10, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11) {
        return skew(bitmap, f10, f11, 0.0f, 0.0f, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i7) {
        return stackBlur(bitmap, i7, false);
    }

    public static Bitmap toAlpha(Bitmap bitmap) {
        return toAlpha(bitmap, Boolean.FALSE);
    }

    public static Bitmap toGray(Bitmap bitmap) {
        return toGray(bitmap, false);
    }

    public static Bitmap toRound(Bitmap bitmap) {
        return toRound(bitmap, 0, 0, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10) {
        return toRoundCorner(bitmap, f10, 0, 0, false);
    }

    public static Bitmap view2Bitmap(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @IntRange(from = 1) int i7, @ColorInt int i10, boolean z3) {
        return addBorder(bitmap, i7, i10, true, 0.0f, z3);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @IntRange(from = 1) int i7, @ColorInt int i10, @FloatRange(from = 0.0d) float f10, boolean z3) {
        return addBorder(bitmap, i7, i10, false, f10, z3);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i7, int i10, int i11, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(bitmapCopy);
            paint.setAlpha(i11);
            canvas.drawBitmap(bitmap2, i7, i10, paint);
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static Bitmap addReflection(Bitmap bitmap, int i7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, height - i7, width, i7, matrix, false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height + i7, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f10 = height;
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, f10, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, bitmapCreateBitmap2.getHeight(), 1895825407, FlexItem.MAX_SIZE, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f10, width, bitmapCreateBitmap2.getHeight(), paint);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f10, @ColorInt int i7, float f11, float f12, boolean z3) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(bitmapCopy);
        paint.setColor(i7);
        paint.setTextSize(f10);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f11, f12 + f10, paint);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static Bitmap clip(Bitmap bitmap, int i7, int i10, int i11, int i12, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i7, i10, i11, i12);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i7;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i7, int i10, boolean z3) {
        return scale(bitmap, i7, i10, z3);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i7, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f10, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f11, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f10, f10);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        Bitmap bitmapRenderScriptBlur = renderScriptBlur(bitmapCreateBitmap, f11, z3);
        if (f10 == 1.0f) {
            if (z3 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return bitmapRenderScriptBlur;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapRenderScriptBlur, width, height, true);
        if (!bitmapRenderScriptBlur.isRecycled()) {
            bitmapRenderScriptBlur.recycle();
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap getBitmap(File file, int i7, int i10) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i7, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getImageType(File file) throws Throwable {
        FileInputStream fileInputStream;
        IOException e10;
        int i7 = 1;
        i7 = 1;
        FileInputStream fileInputStream2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    String imageType = getImageType(fileInputStream);
                    if (imageType != null) {
                        CloseUtils.closeIO(fileInputStream);
                        return imageType;
                    }
                    Closeable[] closeableArr = {fileInputStream};
                    CloseUtils.closeIO(closeableArr);
                    i7 = closeableArr;
                    return getFileExtension(file.getAbsolutePath()).toUpperCase();
                } catch (IOException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    Closeable[] closeableArr2 = {fileInputStream};
                    CloseUtils.closeIO(closeableArr2);
                    i7 = closeableArr2;
                }
            } catch (IOException e12) {
                fileInputStream = null;
                e10 = e12;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
        }
        Closeable[] closeableArr3 = new Closeable[i7];
        closeableArr3[0] = fileInputStream2;
        CloseUtils.closeIO(closeableArr3);
        throw th;
    }

    public static boolean isImage(String str) {
        String upperCase = str.toUpperCase();
        return upperCase.endsWith(".PNG") || upperCase.endsWith(".JPG") || upperCase.endsWith(".JPEG") || upperCase.endsWith(".BMP") || upperCase.endsWith(".GIF") || upperCase.endsWith(".WEBP");
    }

    @TargetApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f10, boolean z3) {
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScriptCreate = null;
        try {
            renderScriptCreate = RenderScript.create(Utils.getApp());
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(f10);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            renderScriptCreate.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            throw th;
        }
    }

    public static Bitmap rotate(Bitmap bitmap, int i7, float f10, float f11, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i7 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i7, f10, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable[]] */
    public static boolean saveBySize(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file, long j6, boolean z3) throws Throwable {
        byte[] byteArray;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        IOException e10;
        if (isEmptyBitmap(bitmap) || j6 <= 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j6) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(compressFormat, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j6) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    i11 = (i10 + i7) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(compressFormat, i11, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j6) {
                        break;
                    }
                    if (size > j6) {
                        i7 = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
                if (i7 == i11 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(compressFormat, i10, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z3 && (j6 = bitmap.isRecycled()) == 0) {
            bitmap.recycle();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bufferedOutputStream.write(byteArray);
                    CloseUtils.closeIO(bufferedOutputStream);
                    return true;
                } catch (IOException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    CloseUtils.closeIO(bufferedOutputStream);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                CloseUtils.closeIO(new Closeable[]{j6});
                throw th;
            }
        } catch (IOException e12) {
            bufferedOutputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            j6 = 0;
            th = th3;
            CloseUtils.closeIO(new Closeable[]{j6});
            throw th;
        }
    }

    public static File saveViewsAsImage(File file, int i7, int i10, WeakReference<View>... weakReferenceArr) {
        return saveViewsAsImage(file, i7, i10, Bitmap.CompressFormat.JPEG, weakReferenceArr);
    }

    public static Bitmap scale(Bitmap bitmap, int i7, int i10, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i7, i10, true);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, boolean z3) {
        return skew(bitmap, f10, f11, 0.0f, 0.0f, z3);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i7, boolean z3) {
        int i10;
        Bitmap bitmapCopy = z3 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i11 = i7;
        if (i11 < 1) {
            i11 = 1;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int i15 = i11 + i11;
        int i16 = i15 + 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[Math.max(width, height)];
        int i17 = (i15 + 2) >> 1;
        int i18 = i17 * i17;
        int i19 = i18 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        int[] iArr6 = new int[i19];
        int i20 = 0;
        for (int i21 = 0; i21 < i19; i21++) {
            iArr6[i21] = i21 / i18;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i16, 3);
        int i22 = i11 + 1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i23 < height) {
            int[] iArr8 = iArr6;
            int i26 = -i11;
            int i27 = i20;
            int i28 = i27;
            int i29 = i28;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            while (i26 <= i11) {
                Bitmap bitmap2 = bitmapCopy;
                int[] iArr9 = iArr;
                int i36 = i20;
                int i37 = iArr9[Math.min(i13, Math.max(i26, i36)) + i24];
                int[] iArr10 = iArr7[i26 + i11];
                iArr10[i36] = (i37 & 16711680) >> 16;
                iArr10[1] = (i37 & 65280) >> 8;
                iArr10[2] = i37 & 255;
                int iAbs = i22 - Math.abs(i26);
                int i38 = iArr10[i36];
                i35 = (i38 * iAbs) + i35;
                int i39 = iArr10[1];
                i27 = (i39 * iAbs) + i27;
                int i40 = iArr10[2];
                i28 = (iAbs * i40) + i28;
                if (i26 > 0) {
                    i32 += i38;
                    i33 += i39;
                    i34 += i40;
                } else {
                    i29 += i38;
                    i30 += i39;
                    i31 += i40;
                }
                i26++;
                bitmapCopy = bitmap2;
                iArr = iArr9;
                i20 = 0;
            }
            Bitmap bitmap3 = bitmapCopy;
            int[] iArr11 = iArr;
            int i41 = i11;
            int i42 = 0;
            while (i42 < width) {
                iArr2[i24] = iArr8[i35];
                iArr3[i24] = iArr8[i27];
                iArr4[i24] = iArr8[i28];
                int i43 = i35 - i29;
                int i44 = i27 - i30;
                int i45 = i28 - i31;
                int[] iArr12 = iArr7[((i41 - i11) + i16) % i16];
                int i46 = i29 - iArr12[0];
                int i47 = i30 - iArr12[1];
                int i48 = i31 - iArr12[2];
                if (i23 == 0) {
                    i10 = i42;
                    iArr5[i10] = Math.min(i42 + i11 + 1, i13);
                } else {
                    i10 = i42;
                }
                int i49 = iArr11[i25 + iArr5[i10]];
                int i50 = (i49 & 16711680) >> 16;
                iArr12[0] = i50;
                int i51 = (i49 & 65280) >> 8;
                iArr12[1] = i51;
                int i52 = i49 & 255;
                iArr12[2] = i52;
                int i53 = i32 + i50;
                int i54 = i33 + i51;
                int i55 = i34 + i52;
                i35 = i43 + i53;
                i27 = i44 + i54;
                i28 = i45 + i55;
                i41 = (i41 + 1) % i16;
                int[] iArr13 = iArr7[i41 % i16];
                int i56 = iArr13[0];
                i29 = i46 + i56;
                int i57 = iArr13[1];
                i30 = i47 + i57;
                int i58 = iArr13[2];
                i31 = i48 + i58;
                i32 = i53 - i56;
                i33 = i54 - i57;
                i34 = i55 - i58;
                i24++;
                i42 = i10 + 1;
            }
            i25 += width;
            i23++;
            iArr6 = iArr8;
            bitmapCopy = bitmap3;
            iArr = iArr11;
            i20 = 0;
        }
        int[] iArr14 = iArr6;
        Bitmap bitmap4 = bitmapCopy;
        int[] iArr15 = iArr;
        int i59 = 0;
        while (i59 < width) {
            int i60 = -i11;
            int i61 = i59;
            int i62 = i60 * width;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            while (i60 <= i11) {
                int i72 = i11;
                int iMax = Math.max(0, i62) + i61;
                int[] iArr16 = iArr7[i60 + i72];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr4[iMax];
                int iAbs2 = i22 - Math.abs(i60);
                i71 = (iArr2[iMax] * iAbs2) + i71;
                i63 = (iArr3[iMax] * iAbs2) + i63;
                i64 = (iArr4[iMax] * iAbs2) + i64;
                if (i60 > 0) {
                    i68 += iArr16[0];
                    i69 += iArr16[1];
                    i70 += iArr16[2];
                } else {
                    i65 += iArr16[0];
                    i66 += iArr16[1];
                    i67 += iArr16[2];
                }
                if (i60 < i14) {
                    i62 += width;
                }
                i60++;
                i11 = i72;
            }
            int i73 = i11;
            int i74 = i71;
            int i75 = i61;
            int i76 = i73;
            for (int i77 = 0; i77 < height; i77++) {
                iArr15[i75] = (iArr15[i75] & (-16777216)) | (iArr14[i74] << 16) | (iArr14[i63] << 8) | iArr14[i64];
                int i78 = i74 - i65;
                int i79 = i63 - i66;
                int i80 = i64 - i67;
                int[] iArr17 = iArr7[((i76 - i73) + i16) % i16];
                int i81 = i65 - iArr17[0];
                int i82 = i66 - iArr17[1];
                int i83 = i67 - iArr17[2];
                if (i61 == 0) {
                    iArr5[i77] = Math.min(i77 + i22, i14) * width;
                }
                int i84 = i61 + iArr5[i77];
                int i85 = iArr2[i84];
                iArr17[0] = i85;
                int i86 = iArr3[i84];
                iArr17[1] = i86;
                int i87 = iArr4[i84];
                iArr17[2] = i87;
                int i88 = i68 + i85;
                int i89 = i69 + i86;
                int i90 = i70 + i87;
                i74 = i78 + i88;
                i63 = i79 + i89;
                i64 = i80 + i90;
                i76 = (i76 + 1) % i16;
                int[] iArr18 = iArr7[i76];
                int i91 = iArr18[0];
                i65 = i81 + i91;
                int i92 = iArr18[1];
                i66 = i82 + i92;
                int i93 = iArr18[2];
                i67 = i83 + i93;
                i68 = i88 - i91;
                i69 = i89 - i92;
                i70 = i90 - i93;
                i75 += width;
            }
            i59 = i61 + 1;
            i11 = i73;
        }
        bitmap4.setPixels(iArr15, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public static Bitmap toAlpha(Bitmap bitmap, Boolean bool) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapExtractAlpha;
    }

    public static Bitmap toGray(Bitmap bitmap, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z3) {
        return toRound(bitmap, 0, 0, z3);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, boolean z3) {
        return toRoundCorner(bitmap, f10, 0, 0, z3);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f10, float f11) {
        return scale(bitmap, f10, f11, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z3) {
        return save(bitmap, getFileByPath(str), compressFormat, z3);
    }

    public static File saveViewsAsImage(File file, int i7, int i10, Bitmap.CompressFormat compressFormat, WeakReference<View>... weakReferenceArr) {
        Bitmap scrollViewBitmap;
        ArrayList<Bitmap> arrayList = new ArrayList();
        int height = 0;
        int height2 = 0;
        int width = 0;
        for (WeakReference<View> weakReference : weakReferenceArr) {
            View view = weakReference.get();
            if (view != null) {
                if (!(view instanceof ScrollView) && !(view instanceof NestedScrollView)) {
                    scrollViewBitmap = getViewBitmap(view);
                } else {
                    scrollViewBitmap = getScrollViewBitmap((FrameLayout) view);
                }
                if (scrollViewBitmap != null && scrollViewBitmap.getWidth() > 0 && scrollViewBitmap.getHeight() >= 0) {
                    if (scrollViewBitmap.getWidth() > width) {
                        width = scrollViewBitmap.getWidth();
                    }
                    height2 += scrollViewBitmap.getHeight();
                    arrayList.add(scrollViewBitmap);
                }
            }
        }
        if (height2 > 0 && width > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            for (Bitmap bitmap : arrayList) {
                canvas.drawBitmap(bitmap, 0.0f, height, (Paint) null);
                height += bitmap.getHeight();
                bitmap.recycle();
            }
            if (i7 > 0 || i10 > 0) {
                float fMin = Math.min(i7 > 0 ? i7 / width : 1.0f, i10 > 0 ? i10 / height2 : 1.0f);
                bitmapCreateBitmap = scale(bitmapCreateBitmap, fMin, fMin, true);
            }
            if (save(bitmapCreateBitmap, file, compressFormat, true)) {
                return file;
            }
        }
        return null;
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return skew(bitmap, f10, f11, f12, f13, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i7, @ColorInt int i10) {
        return toRound(bitmap, i7, i10, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, @IntRange(from = 0) int i7, @ColorInt int i10) {
        return toRoundCorner(bitmap, f10, i7, i10, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f10, float f11, boolean z3) {
        return scale(bitmap, f10, f11, z3);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z3) {
        boolean zCompress;
        if (isEmptyBitmap(bitmap) || !createFileByDeleteOldFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    try {
                        zCompress = bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                        if (z3) {
                            try {
                                if (!bitmap.isRecycled()) {
                                    bitmap.recycle();
                                }
                            } catch (IOException e10) {
                                e = e10;
                                bufferedOutputStream = bufferedOutputStream2;
                                e.printStackTrace();
                                CloseUtils.closeIO(bufferedOutputStream);
                                return zCompress;
                            }
                        }
                        CloseUtils.closeIO(bufferedOutputStream2);
                        return zCompress;
                    } catch (IOException e11) {
                        e = e11;
                        zCompress = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    CloseUtils.closeIO(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                zCompress = false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, float f12, float f13, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f10, f11, f12, f13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i7, @ColorInt int i10, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float f12 = width;
        float f13 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f12, f13);
        rectF.inset((width - iMin) / 2.0f, (height - iMin) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        matrix.preScale(f10 / f12, f10 / f13);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (i7 > 0) {
            paint.setShader(null);
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            float f14 = i7;
            paint.setStrokeWidth(f14);
            canvas.drawCircle(f12 / 2.0f, f13 / 2.0f, f11 - (f14 / 2.0f), paint);
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, @IntRange(from = 0) int i7, @ColorInt int i10, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f11 = i7;
        float f12 = f11 / 2.0f;
        rectF.inset(f12, f12);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (i7 > 0) {
            paint.setShader(null);
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f11);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap scale(Bitmap bitmap, float f10, float f11) {
        return scale(bitmap, f10, f11, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f10, float f11, boolean z3) {
        return scale(bitmap, f10, f11, 0.0f, z3);
    }

    public static Bitmap scale(Bitmap bitmap, float f10, float f11, float f12, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        matrix.postRotate(f12);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j6) {
        return compressByQuality(bitmap, j6, false);
    }

    public static Bitmap getBitmap(String str) {
        if (isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j6, boolean z3) {
        byte[] byteArray;
        if (isEmptyBitmap(bitmap) || j6 <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i7 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j6) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(compressFormat, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j6) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    i11 = (i10 + i7) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j6) {
                        break;
                    }
                    if (size > j6) {
                        i7 = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
                if (i7 == i11 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i7, int i10) {
        return compressBySampleSize(bitmap, i7, i10, false);
    }

    public static Bitmap getBitmap(String str, int i7, int i10) {
        if (isSpace(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i7, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private static String getImageType(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[8];
            if (inputStream.read(bArr, 0, 8) != -1) {
                return getImageType(bArr);
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i7, int i10, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i7, i10);
        options.inJustDecodeBounds = false;
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    private static String getImageType(byte[] bArr) {
        if (isJPEG(bArr)) {
            return "JPEG";
        }
        if (isGIF(bArr)) {
            return "GIF";
        }
        if (isPNG(bArr)) {
            return "PNG";
        }
        if (isBMP(bArr)) {
            return "BMP";
        }
        return null;
    }

    public static Bitmap scale(Bitmap bitmap, int i7, boolean z3) {
        return scale(bitmap, i7, 0.0f, z3);
    }

    public static Bitmap scale(Bitmap bitmap, int i7, float f10, boolean z3) {
        float f11;
        float f12;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            f11 = i7;
            f12 = width;
        } else {
            f11 = i7;
            f12 = height;
        }
        float f13 = f11 / f12;
        if (width <= i7 && height <= i7) {
            f13 = 1.0f;
        }
        return scale(bitmap, f13, f13, f10, z3);
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i7, int i10) {
        if (inputStream == null) {
            return null;
        }
        return getBitmap(input2Byte(inputStream), 0, i7, i10);
    }

    public static Bitmap getBitmap(byte[] bArr, int i7) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i7, bArr.length);
    }

    public static Bitmap getBitmap(byte[] bArr, int i7, int i10, int i11) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i7, bArr.length, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i7, bArr.length, options);
    }

    public static Bitmap getBitmap(@DrawableRes int i7) {
        Drawable drawable = Utils.getApp().getDrawable(i7);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap getBitmap(@DrawableRes int i7, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = Utils.getApp().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i7, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i7, options);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i7, int i10) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i7, i10);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }
}
