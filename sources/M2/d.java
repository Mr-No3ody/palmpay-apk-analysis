package M2;

import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;

/* JADX INFO: loaded from: classes.dex */
public final class d implements BitmapFrameCache {
    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final boolean contains(int i7) {
        return false;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final CloseableReference getBitmapToReuseForFrame(int i7, int i10, int i11) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final CloseableReference getCachedFrame(int i7) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final CloseableReference getFallbackFrame(int i7) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final int getSizeInBytes() {
        return 0;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void clear() {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void onFramePrepared(int i7, CloseableReference closeableReference, int i10) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void onFrameRendered(int i7, CloseableReference closeableReference, int i10) {
    }
}
