package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class g implements LruBitmapPool$BitmapTracker, BitmapPool {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker
    public void add(Bitmap bitmap) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap get(int i7, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap getDirty(int i7, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker
    public void remove(Bitmap bitmap) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void setSizeMultiplier(float f10) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void trimMemory(int i7) {
    }
}
