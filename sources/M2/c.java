package M2;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imageutils.BitmapUtil;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BitmapFrameCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BitmapFrameCache.FrameCacheListener f5745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CloseableReference f5746c;

    public final synchronized void a() {
        int i7;
        try {
            BitmapFrameCache.FrameCacheListener frameCacheListener = this.f5745b;
            if (frameCacheListener != null && (i7 = this.f5744a) != -1) {
                frameCacheListener.onFrameEvicted(this, i7);
            }
            CloseableReference.d(this.f5746c);
            this.f5746c = null;
            this.f5744a = -1;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized void clear() {
        a();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized boolean contains(int i7) {
        return i7 == this.f5744a && CloseableReference.h(this.f5746c);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getBitmapToReuseForFrame(int i7, int i10, int i11) {
        CloseableReference closeableReferenceC;
        try {
            closeableReferenceC = CloseableReference.c(this.f5746c);
            a();
        } catch (Throwable th) {
            a();
            throw th;
        }
        return closeableReferenceC;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getCachedFrame(int i7) {
        if (this.f5744a != i7) {
            return null;
        }
        return CloseableReference.c(this.f5746c);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getFallbackFrame(int i7) {
        return CloseableReference.c(this.f5746c);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized int getSizeInBytes() {
        CloseableReference closeableReference;
        closeableReference = this.f5746c;
        return closeableReference == null ? 0 : BitmapUtil.getSizeInBytes((Bitmap) closeableReference.f());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[Catch: all -> 0x001b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x001d, B:14:0x0026, B:16:0x002b, B:17:0x002e, B:19:0x0038, B:20:0x003b), top: B:25:0x0003 }] */
    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized void onFrameRendered(int i7, CloseableReference closeableReference, int i10) {
        BitmapFrameCache.FrameCacheListener frameCacheListener;
        BitmapFrameCache.FrameCacheListener frameCacheListener2;
        int i11;
        if (closeableReference == null) {
            CloseableReference.d(this.f5746c);
            frameCacheListener = this.f5745b;
            if (frameCacheListener != null) {
                frameCacheListener.onFrameEvicted(this, i11);
            }
            this.f5746c = CloseableReference.c(closeableReference);
            frameCacheListener2 = this.f5745b;
            if (frameCacheListener2 != null) {
                frameCacheListener2.onFrameCached(this, i7);
            }
            this.f5744a = i7;
            return;
        }
        if (this.f5746c != null && ((Bitmap) closeableReference.f()).equals(this.f5746c.f())) {
            return;
        }
        CloseableReference.d(this.f5746c);
        frameCacheListener = this.f5745b;
        if (frameCacheListener != null && (i11 = this.f5744a) != -1) {
            frameCacheListener.onFrameEvicted(this, i11);
        }
        this.f5746c = CloseableReference.c(closeableReference);
        frameCacheListener2 = this.f5745b;
        if (frameCacheListener2 != null) {
            frameCacheListener2.onFrameCached(this, i7);
        }
        this.f5744a = i7;
        return;
        throw th;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
        this.f5745b = frameCacheListener;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void onFramePrepared(int i7, CloseableReference closeableReference, int i10) {
    }
}
