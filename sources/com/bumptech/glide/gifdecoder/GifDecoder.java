package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import p332w1.b;

/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {

    public interface BitmapProvider {
        @NonNull
        Bitmap obtain(int i7, int i10, @NonNull Bitmap.Config config);

        @NonNull
        byte[] obtainByteArray(int i7);

        @NonNull
        int[] obtainIntArray(int i7);

        void release(@NonNull Bitmap bitmap);

        void release(@NonNull byte[] bArr);

        void release(@NonNull int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    @NonNull
    ByteBuffer getData();

    int getDelay(int i7);

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    @Nullable
    Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(@Nullable InputStream inputStream, int i7);

    int read(@Nullable byte[] bArr);

    void resetFrameIndex();

    void setData(@NonNull b bVar, @NonNull ByteBuffer byteBuffer);

    void setData(@NonNull b bVar, @NonNull ByteBuffer byteBuffer, int i7);

    void setData(@NonNull b bVar, @NonNull byte[] bArr);

    void setDefaultBitmapConfig(@NonNull Bitmap.Config config);
}
