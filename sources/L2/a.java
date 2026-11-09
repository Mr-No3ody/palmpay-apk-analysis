package L2;

import Ab.r;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck$InactivityListener;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import p032c3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AnimationBackend, AnimationBackendDelegateWithInactivityCheck$InactivityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapFrameCache f5528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O2.a f5530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N2.b f5531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N2.a f5532f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f5534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5535j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap.Config f5537p = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f5533g = new Paint(6);

    public a(b bVar, BitmapFrameCache bitmapFrameCache, r rVar, O2.a aVar, N2.b bVar2, N2.a aVar2) {
        this.f5527a = bVar;
        this.f5528b = bitmapFrameCache;
        this.f5529c = rVar;
        this.f5530d = aVar;
        this.f5531e = bVar2;
        this.f5532f = aVar2;
        c();
    }

    public final boolean a(int i7, CloseableReference closeableReference, Canvas canvas, int i10) {
        if (!CloseableReference.h(closeableReference)) {
            return false;
        }
        Rect rect = this.f5534i;
        Paint paint = this.f5533g;
        if (rect == null) {
            canvas.drawBitmap((Bitmap) closeableReference.f(), 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap((Bitmap) closeableReference.f(), (Rect) null, this.f5534i, paint);
        }
        if (i10 == 3) {
            return true;
        }
        this.f5528b.onFrameRendered(i7, closeableReference, i10);
        return true;
    }

    public final boolean b(Canvas canvas, int i7, int i10) {
        CloseableReference cachedFrame;
        boolean zA = false;
        BitmapFrameCache bitmapFrameCache = this.f5528b;
        int i11 = 1;
        try {
            if (i10 != 0) {
                O2.a aVar = this.f5530d;
                if (i10 != 1) {
                    i11 = 3;
                    if (i10 != 2) {
                        if (i10 == 3) {
                            cachedFrame = bitmapFrameCache.getFallbackFrame(i7);
                            zA = a(i7, cachedFrame, canvas, 3);
                            i11 = -1;
                        }
                        return false;
                    }
                    try {
                        cachedFrame = this.f5527a.a(this.f5535j, this.f5536o, this.f5537p);
                        if (CloseableReference.h(cachedFrame)) {
                            aVar.renderFrame(i7, (Bitmap) cachedFrame.f());
                            cachedFrame.close();
                        }
                    } catch (RuntimeException e10) {
                        p229p2.a.t(a.class, "Failed to create frame bitmap", e10);
                    }
                } else {
                    cachedFrame = bitmapFrameCache.getBitmapToReuseForFrame(i7, this.f5535j, this.f5536o);
                    if (CloseableReference.h(cachedFrame)) {
                        aVar.renderFrame(i7, (Bitmap) cachedFrame.f());
                        cachedFrame.close();
                    }
                    i11 = 2;
                }
            } else {
                cachedFrame = bitmapFrameCache.getCachedFrame(i7);
                zA = a(i7, cachedFrame, canvas, 0);
            }
            CloseableReference.d(cachedFrame);
            return (zA || i11 == -1) ? zA : b(canvas, i7, i11);
        } catch (Throwable th) {
            CloseableReference.d(null);
            throw th;
        }
    }

    public final void c() {
        O2.a aVar = this.f5530d;
        int width = ((AnimatedDrawableBackend) aVar.f6554b).getWidth();
        this.f5535j = width;
        if (width == -1) {
            Rect rect = this.f5534i;
            this.f5535j = rect == null ? -1 : rect.width();
        }
        int height = ((AnimatedDrawableBackend) aVar.f6554b).getHeight();
        this.f5536o = height;
        if (height == -1) {
            Rect rect2 = this.f5534i;
            this.f5536o = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void clear() {
        this.f5528b.clear();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final boolean drawFrame(Drawable drawable, Canvas canvas, int i7) {
        N2.a aVar;
        boolean zB = b(canvas, i7, 0);
        N2.b bVar = this.f5531e;
        if (bVar != null && (aVar = this.f5532f) != null) {
            bVar.prepareFrames(aVar, this.f5528b, this, i7);
        }
        return zB;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getFrameCount() {
        return ((AnimatedDrawableBackend) this.f5529c.f139b).getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getFrameDurationMs(int i7) {
        return ((AnimatedDrawableBackend) this.f5529c.f139b).getDurationMsForFrame(i7);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getIntrinsicHeight() {
        return this.f5536o;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getIntrinsicWidth() {
        return this.f5535j;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getLoopCount() {
        return ((AnimatedDrawableBackend) this.f5529c.f139b).getLoopCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getSizeInBytes() {
        return this.f5528b.getSizeInBytes();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck$InactivityListener
    public final void onInactive() {
        clear();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setAlpha(int i7) {
        this.f5533g.setAlpha(i7);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setBounds(Rect rect) {
        this.f5534i = rect;
        this.f5530d.setBounds(rect);
        c();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5533g.setColorFilter(colorFilter);
    }
}
