package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes.dex */
public final class c implements GifDecoder.BitmapProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f20980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20981b;

    public c(BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20980a = bitmapPool;
        this.f20981b = fVar;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final Bitmap obtain(int i7, int i10, Bitmap.Config config) {
        return this.f20980a.getDirty(i7, i10, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final byte[] obtainByteArray(int i7) {
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20981b;
        return fVar == null ? new byte[i7] : (byte[]) fVar.get(i7, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final int[] obtainIntArray(int i7) {
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20981b;
        return fVar == null ? new int[i7] : (int[]) fVar.get(i7, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void release(Bitmap bitmap) {
        this.f20980a.put(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void release(byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20981b;
        if (fVar == null) {
            return;
        }
        fVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public final void release(int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20981b;
        if (fVar == null) {
            return;
        }
        fVar.put(iArr);
    }
}
