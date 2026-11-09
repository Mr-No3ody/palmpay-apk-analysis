package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import p242q0.g;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private static final String CONTENT_SCHEME = "content";
    private static final int MIN_CROPPED_HEIGHT = 1;
    private static final String TAG = "BitmapCropTask";
    private int cropOffsetX;
    private int cropOffsetY;
    private final Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final WeakReference<Context> mContext;
    private final BitmapCropCallback mCropCallback;
    private final RectF mCropRect;
    private int mCroppedImageHeight;
    private int mCroppedImageWidth;
    private float mCurrentAngle;
    private final RectF mCurrentImageRect;
    private float mCurrentScale;
    private final ExifInfo mExifInfo;
    private final String mImageInputPath;
    private final Uri mImageInputUri;
    private final String mImageOutputPath;
    private final Uri mImageOutputUri;
    private final int mMaxResultImageSizeX;
    private final int mMaxResultImageSizeY;
    private Bitmap mViewBitmap;

    public BitmapCropTask(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull ImageState imageState, @NonNull CropParameters cropParameters, @Nullable BitmapCropCallback bitmapCropCallback) {
        this.mContext = new WeakReference<>(context);
        this.mViewBitmap = bitmap;
        this.mCropRect = imageState.getCropRect();
        this.mCurrentImageRect = imageState.getCurrentImageRect();
        this.mCurrentScale = imageState.getCurrentScale();
        this.mCurrentAngle = imageState.getCurrentAngle();
        this.mMaxResultImageSizeX = cropParameters.getMaxResultImageSizeX();
        this.mMaxResultImageSizeY = cropParameters.getMaxResultImageSizeY();
        this.mCompressFormat = cropParameters.getCompressFormat();
        this.mCompressQuality = cropParameters.getCompressQuality();
        this.mImageInputPath = cropParameters.getImageInputPath();
        this.mImageOutputPath = cropParameters.getImageOutputPath();
        this.mImageInputUri = cropParameters.getContentImageInputUri();
        this.mImageOutputUri = cropParameters.getContentImageOutputUri();
        this.mExifInfo = cropParameters.getExifInfo();
        this.mCropCallback = bitmapCropCallback;
    }

    private void checkValidityCropBounds() {
        if (this.cropOffsetX < 0) {
            this.cropOffsetX = 0;
            this.mCroppedImageWidth = this.mViewBitmap.getWidth();
        }
        if (this.cropOffsetY < 0) {
            this.cropOffsetY = 0;
            this.mCroppedImageHeight = this.mViewBitmap.getHeight();
        }
    }

    private void copyExifForOutputFile(Context context) throws Throwable {
        boolean zHasContentScheme = BitmapLoadUtils.hasContentScheme(this.mImageInputUri);
        boolean zHasContentScheme2 = BitmapLoadUtils.hasContentScheme(this.mImageOutputUri);
        if (zHasContentScheme && zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputUri);
            return;
        }
        if (zHasContentScheme) {
            ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputPath);
        } else if (zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, new g(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputUri);
        } else {
            ImageHeaderParser.copyExif(new g(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
        }
    }

    private boolean crop() throws Throwable {
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            float fWidth = this.mCropRect.width() / this.mCurrentScale;
            float fHeight = this.mCropRect.height() / this.mCurrentScale;
            int i7 = this.mMaxResultImageSizeX;
            if (fWidth > i7 || fHeight > this.mMaxResultImageSizeY) {
                float fMin = Math.min(i7 / fWidth, this.mMaxResultImageSizeY / fHeight);
                Bitmap bitmap = this.mViewBitmap;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMin), Math.round(this.mViewBitmap.getHeight() * fMin), false);
                Bitmap bitmap2 = this.mViewBitmap;
                if (bitmap2 != bitmapCreateScaledBitmap) {
                    bitmap2.recycle();
                }
                this.mViewBitmap = bitmapCreateScaledBitmap;
                this.mCurrentScale /= fMin;
            }
        }
        if (this.mCurrentAngle != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.mCurrentAngle, this.mViewBitmap.getWidth() / 2, this.mViewBitmap.getHeight() / 2);
            Bitmap bitmap3 = this.mViewBitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.mViewBitmap.getHeight(), matrix, true);
            Bitmap bitmap4 = this.mViewBitmap;
            if (bitmap4 != bitmapCreateBitmap) {
                bitmap4.recycle();
            }
            this.mViewBitmap = bitmapCreateBitmap;
        }
        this.cropOffsetX = Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = Math.round(this.mCropRect.width() / this.mCurrentScale);
        int iRound = Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = iRound;
        if (!shouldCrop(this.mCroppedImageWidth, iRound)) {
            if (Build.VERSION.SDK_INT < 29 || !FileUtils.isContent(this.mImageInputPath)) {
                FileUtils.copyFile(this.mImageInputPath, this.mImageOutputPath);
            } else {
                FileUtils.writeFileFromIS(context.getContentResolver().openInputStream(Uri.parse(this.mImageInputPath)), new FileOutputStream(this.mImageOutputPath));
            }
            return false;
        }
        checkValidityCropBounds();
        saveImage(Bitmap.createBitmap(this.mViewBitmap, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight));
        if (!this.mCompressFormat.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        copyExifForOutputFile(context);
        return true;
    }

    private void saveImage(@NonNull Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.mImageOutputUri);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.mCompressFormat, this.mCompressQuality, byteArrayOutputStream);
                    outputStreamOpenOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    BitmapLoadUtils.close(outputStreamOpenOutputStream);
                    BitmapLoadUtils.close(byteArrayOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = outputStreamOpenOutputStream;
                    try {
                        Log.e(TAG, e.getLocalizedMessage());
                        BitmapLoadUtils.close(outputStream);
                        BitmapLoadUtils.close(byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        BitmapLoadUtils.close(outputStream);
                        BitmapLoadUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStreamOpenOutputStream;
                    BitmapLoadUtils.close(outputStream);
                    BitmapLoadUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private boolean shouldCrop(int i7, int i10) {
        int iRound = Math.round(Math.max(i7, i10) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX <= 0 || this.mMaxResultImageSizeY <= 0) {
            float f10 = iRound;
            if (Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) <= f10 && Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) <= f10 && Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) <= f10 && Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) <= f10 && this.mCurrentAngle == 0.0f) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.AsyncTask
    @Nullable
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.mViewBitmap;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.mCurrentImageRect.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.mImageOutputUri == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            crop();
            this.mViewBitmap = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(@Nullable Throwable th) {
        BitmapCropCallback bitmapCropCallback = this.mCropCallback;
        if (bitmapCropCallback != null) {
            if (th == null) {
                this.mCropCallback.onBitmapCropped(BitmapLoadUtils.hasContentScheme(this.mImageOutputUri) ? this.mImageOutputUri : Uri.fromFile(new File(this.mImageOutputPath)), this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
            } else {
                bitmapCropCallback.onCropFailure(th);
            }
        }
    }
}
