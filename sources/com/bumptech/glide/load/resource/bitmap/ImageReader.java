package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface ImageReader {
    @Nullable
    Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException;

    int getImageOrientation() throws IOException;

    ImageHeaderParser.ImageType getImageType() throws IOException;

    void stopGrowingBuffers();
}
