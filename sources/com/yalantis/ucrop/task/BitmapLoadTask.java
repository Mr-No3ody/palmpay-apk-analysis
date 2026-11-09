package com.yalantis.ucrop.task;

import C0.G;
import Pg.AbstractC0555b;
import Pg.C0557d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.yalantis.ucrop.OkHttpClientStore;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.U;
import okhttp3.X;
import okhttp3.e0;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final WeakReference<Context> mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i7, int i10, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = new WeakReference<>(context);
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i7;
        this.mRequiredHeight = i10;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private void downloadFile(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        Closeable closeable;
        e0 e0Var;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.mContext.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        U client = OkHttpClientStore.INSTANCE.getClient();
        BufferedSource bufferedSource = null;
        try {
            X x3 = new X();
            x3.k(uri.toString());
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(client.newCall(x3.b()));
            try {
                BufferedSource bufferedSourceSource = e0VarExecute.f40734g.source();
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    C0557d c0557dH = AbstractC0555b.h(outputStreamOpenOutputStream);
                    bufferedSourceSource.readAll(c0557dH);
                    BitmapLoadUtils.close(bufferedSourceSource);
                    BitmapLoadUtils.close(c0557dH);
                    BitmapLoadUtils.close(e0VarExecute.f40734g);
                    client.f40653a.a();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th) {
                    th = th;
                    e0Var = e0VarExecute;
                    closeable = null;
                    bufferedSource = bufferedSourceSource;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    if (e0Var != null) {
                        BitmapLoadUtils.close(e0Var.f40734g);
                    }
                    client.f40653a.a();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                e0Var = e0VarExecute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            e0Var = null;
        }
    }

    private void processInputUri() throws IOException, NullPointerException {
        String scheme = this.mInputUri.getScheme();
        if ("http".equals(scheme) || Constants.SCHEME.equals(scheme)) {
            try {
                downloadFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e(TAG, "Downloading failed", e10);
                throw e10;
            }
        }
        if ("file".equals(scheme) || FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            return;
        }
        Log.e(TAG, "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException(G.o("Invalid Uri scheme", scheme));
    }

    @Override // android.os.AsyncTask
    @NonNull
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        Context context = this.mContext.get();
        if (context == null) {
            return new BitmapWorkerResult(new NullPointerException("context is null"));
        }
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(this.mInputUri), null, options);
                options.inSampleSize = BitmapLoadUtils.computeSize(options.outWidth, options.outHeight);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            boolean z3 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z3) {
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            return new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        if (!BitmapLoadUtils.checkSize(bitmapDecodeStream, options)) {
                            z3 = true;
                        }
                    } finally {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                    }
                } catch (IOException e11) {
                    Log.e(TAG, "doInBackground: ImageDecoder.createSource: ", e11);
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e11));
                } catch (OutOfMemoryError e12) {
                    Log.e(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e12);
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(context, this.mInputUri);
            int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
            Matrix matrix = new Matrix();
            if (iExifToDegrees != 0) {
                matrix.preRotate(iExifToDegrees);
            }
            if (iExifToTranslation != 1) {
                matrix.postScale(iExifToTranslation, 1.0f);
            }
            return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeStream, matrix), exifInfo) : new BitmapWorkerResult(bitmapDecodeStream, exifInfo);
        } catch (IOException | NullPointerException e13) {
            return new BitmapWorkerResult(e13);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(@NonNull BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc == null) {
            this.mBitmapLoadCallback.onBitmapLoaded(bitmapWorkerResult.mBitmapResult, bitmapWorkerResult.mExifInfo, this.mInputUri, this.mOutputUri);
        } else {
            this.mBitmapLoadCallback.onFailure(exc);
        }
    }

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(@NonNull Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }
}
