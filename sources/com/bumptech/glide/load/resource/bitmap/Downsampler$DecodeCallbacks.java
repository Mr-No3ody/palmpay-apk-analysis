package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface Downsampler$DecodeCallbacks {
    void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

    void onObtainBounds();
}
