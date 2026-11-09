package M2;

import android.util.SparseArray;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imageutils.BitmapUtil;
import java.util.Iterator;
import p109h3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BitmapFrameCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2.d f5740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f5742c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CloseableReference f5743d;

    public b(Z2.d dVar, boolean z3) {
        this.f5740a = dVar;
        this.f5741b = z3;
    }

    public static CloseableReference a(CloseableReference closeableReference) {
        try {
            if (!CloseableReference.h(closeableReference) || !(closeableReference.f() instanceof CloseableStaticBitmap)) {
                CloseableReference.d(closeableReference);
                return null;
            }
            CloseableReference closeableReferenceCloneUnderlyingBitmapReference = ((CloseableStaticBitmap) closeableReference.f()).cloneUnderlyingBitmapReference();
            closeableReference.close();
            return closeableReferenceCloneUnderlyingBitmapReference;
        } catch (Throwable th) {
            CloseableReference.d(closeableReference);
            throw th;
        }
    }

    public static com.facebook.common.references.b b(CloseableReference closeableReference) {
        return CloseableReference.i(new CloseableStaticBitmap(closeableReference, g.f37290d, 0));
    }

    public static int c(CloseableImage closeableImage) {
        if (closeableImage instanceof CloseableBitmap) {
            return BitmapUtil.getSizeInBytes(((CloseableBitmap) closeableImage).getUnderlyingBitmap());
        }
        return 0;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized void clear() {
        try {
            CloseableReference.d(this.f5743d);
            this.f5743d = null;
            for (int i7 = 0; i7 < this.f5742c.size(); i7++) {
                CloseableReference.d((CloseableReference) this.f5742c.valueAt(i7));
            }
            this.f5742c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized boolean contains(int i7) {
        Z2.d dVar;
        dVar = this.f5740a;
        return dVar.f11506b.contains(new Z2.c(dVar.f11505a, i7));
    }

    public final synchronized void d(int i7) {
        CloseableReference closeableReference = (CloseableReference) this.f5742c.get(i7);
        if (closeableReference != null) {
            this.f5742c.delete(i7);
            closeableReference.close();
            p229p2.a.p(b.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i7), this.f5742c);
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getBitmapToReuseForFrame(int i7, int i10, int i11) {
        CacheKey cacheKey;
        CloseableReference closeableReference = null;
        if (!this.f5741b) {
            return null;
        }
        Z2.d dVar = this.f5740a;
        while (true) {
            synchronized (dVar) {
                Iterator it = dVar.f11508d.iterator();
                if (it.hasNext()) {
                    cacheKey = (CacheKey) it.next();
                    it.remove();
                } else {
                    cacheKey = null;
                }
            }
            if (cacheKey == null) {
                break;
            }
            CloseableReference closeableReferenceReuse = dVar.f11506b.reuse(cacheKey);
            if (closeableReferenceReuse != null) {
                closeableReference = closeableReferenceReuse;
                break;
            }
        }
        return a(closeableReference);
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getCachedFrame(int i7) {
        Z2.d dVar;
        dVar = this.f5740a;
        return a(dVar.f11506b.get(new Z2.c(dVar.f11505a, i7)));
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized CloseableReference getFallbackFrame(int i7) {
        return a(CloseableReference.c(this.f5743d));
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized int getSizeInBytes() {
        int iC;
        try {
            CloseableReference closeableReference = this.f5743d;
            int iC2 = !CloseableReference.h(closeableReference) ? 0 : c((CloseableImage) closeableReference.f());
            synchronized (this) {
                iC = 0;
                for (int i7 = 0; i7 < this.f5742c.size(); i7++) {
                    CloseableReference closeableReference2 = (CloseableReference) this.f5742c.valueAt(i7);
                    iC += !CloseableReference.h(closeableReference2) ? 0 : c((CloseableImage) closeableReference2.f());
                }
            }
            return iC2 + iC;
        } catch (Throwable th) {
            throw th;
        }
        return iC2 + iC;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized void onFramePrepared(int i7, CloseableReference closeableReference, int i10) {
        com.facebook.common.references.b bVarB;
        closeableReference.getClass();
        try {
            bVarB = b(closeableReference);
            if (bVarB == null) {
                CloseableReference.d(bVarB);
                return;
            }
            try {
                Z2.d dVar = this.f5740a;
                CloseableReference closeableReferenceCache = dVar.f11506b.cache(new Z2.c(dVar.f11505a, i7), bVarB, dVar.f11507c);
                if (CloseableReference.h(closeableReferenceCache)) {
                    CloseableReference.d((CloseableReference) this.f5742c.get(i7));
                    this.f5742c.put(i7, closeableReferenceCache);
                    p229p2.a.p(b.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i7), this.f5742c);
                }
                bVarB.close();
            } catch (Throwable th) {
                th = th;
                CloseableReference.d(bVarB);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVarB = null;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final synchronized void onFrameRendered(int i7, CloseableReference closeableReference, int i10) {
        com.facebook.common.references.b bVarB;
        closeableReference.getClass();
        d(i7);
        try {
            bVarB = b(closeableReference);
            if (bVarB != null) {
                try {
                    CloseableReference.d(this.f5743d);
                    Z2.d dVar = this.f5740a;
                    this.f5743d = dVar.f11506b.cache(new Z2.c(dVar.f11505a, i7), bVarB, dVar.f11507c);
                } catch (Throwable th) {
                    th = th;
                    CloseableReference.d(bVarB);
                    throw th;
                }
            }
            CloseableReference.d(bVarB);
        } catch (Throwable th2) {
            th = th2;
            bVarB = null;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public final void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
    }
}
