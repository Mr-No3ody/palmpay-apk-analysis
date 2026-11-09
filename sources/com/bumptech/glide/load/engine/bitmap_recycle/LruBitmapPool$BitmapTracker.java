package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
interface LruBitmapPool$BitmapTracker {
    void add(Bitmap bitmap);

    void remove(Bitmap bitmap);
}
