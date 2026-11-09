package com.google.android.gms.common.images;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
final class zaa implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;

    @Nullable
    private final AssetFileDescriptor zac;

    public zaa(ImageManager imageManager, @Nullable Uri uri, AssetFileDescriptor assetFileDescriptor) {
        Objects.requireNonNull(imageManager);
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = assetFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        AssetFileDescriptor assetFileDescriptor = this.zac;
        boolean z3 = false;
        Bitmap bitmapDecodeStream = null;
        if (assetFileDescriptor != null) {
            try {
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptor.createInputStream();
                if (fileInputStreamCreateInputStream != null) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
                    } catch (Throwable th) {
                        try {
                            fileInputStreamCreateInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (fileInputStreamCreateInputStream != null) {
                    fileInputStreamCreateInputStream.close();
                }
            } catch (IOException | OutOfMemoryError e10) {
                Log.e("ImageManager", "Error loading bitmap for uri: ".concat(String.valueOf(this.zab)), e10);
                z3 = e10 instanceof OutOfMemoryError;
            }
        }
        boolean z8 = z3;
        Bitmap bitmap = bitmapDecodeStream;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        imageManager.zae().post(new zac(imageManager, this.zab, bitmap, z8, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            "Latch interrupted while posting ".concat(String.valueOf(this.zab));
        }
    }
}
