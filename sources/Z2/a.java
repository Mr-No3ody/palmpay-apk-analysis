package Z2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageFrame;
import java.util.ArrayList;
import java.util.Arrays;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AnimatedDrawableBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.growingio.android.debugger.a f11490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2.b f11491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedImage f11492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f11493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f11494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f11495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X2.a[] f11497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f11498i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f11499j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f11501l;

    public a(com.growingio.android.debugger.a aVar, X2.b bVar, Rect rect, boolean z3) {
        this.f11490a = aVar;
        this.f11491b = bVar;
        AnimatedImage animatedImage = bVar.f10995a;
        this.f11492c = animatedImage;
        int[] frameDurations = animatedImage.getFrameDurations();
        this.f11494e = frameDurations;
        aVar.getClass();
        for (int i7 = 0; i7 < frameDurations.length; i7++) {
            if (frameDurations[i7] < 11) {
                frameDurations[i7] = 100;
            }
        }
        com.growingio.android.debugger.a aVar2 = this.f11490a;
        int[] iArr = this.f11494e;
        aVar2.getClass();
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        this.f11496g = i10;
        com.growingio.android.debugger.a aVar3 = this.f11490a;
        int[] iArr2 = this.f11494e;
        aVar3.getClass();
        int[] iArr3 = new int[iArr2.length];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr2.length; i13++) {
            iArr3[i13] = i12;
            i12 += iArr2[i13];
        }
        this.f11495f = iArr3;
        this.f11493d = a(this.f11492c, rect);
        this.f11500k = z3;
        this.f11497h = new X2.a[this.f11492c.getFrameCount()];
        for (int i14 = 0; i14 < this.f11492c.getFrameCount(); i14++) {
            X2.a[] aVarArr = this.f11497h;
            this.f11492c.getFrameInfo(i14);
            aVarArr[i14] = null;
        }
    }

    public static Rect a(AnimatedImage animatedImage, Rect rect) {
        return rect == null ? new Rect(0, 0, animatedImage.getWidth(), animatedImage.getHeight()) : new Rect(0, 0, Math.min(rect.width(), animatedImage.getWidth()), Math.min(rect.height(), animatedImage.getHeight()));
    }

    public final synchronized Bitmap b(int i7, int i10) {
        try {
            Bitmap bitmap = this.f11501l;
            if (bitmap != null && (bitmap.getWidth() < i7 || this.f11501l.getHeight() < i10)) {
                synchronized (this) {
                    Bitmap bitmap2 = this.f11501l;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.f11501l = null;
                    }
                }
            }
            if (this.f11501l == null) {
                this.f11501l = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            }
            this.f11501l.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f11501l;
    }

    public final void c(Canvas canvas, AnimatedImageFrame animatedImageFrame) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        if (this.f11500k) {
            float fMax = Math.max(animatedImageFrame.getWidth() / Math.min(animatedImageFrame.getWidth(), canvas.getWidth()), animatedImageFrame.getHeight() / Math.min(animatedImageFrame.getHeight(), canvas.getHeight()));
            width = (int) (animatedImageFrame.getWidth() / fMax);
            height = (int) (animatedImageFrame.getHeight() / fMax);
            xOffset = (int) (animatedImageFrame.getXOffset() / fMax);
            yOffset = (int) (animatedImageFrame.getYOffset() / fMax);
        } else {
            width = animatedImageFrame.getWidth();
            height = animatedImageFrame.getHeight();
            xOffset = animatedImageFrame.getXOffset();
            yOffset = animatedImageFrame.getYOffset();
        }
        synchronized (this) {
            Bitmap bitmapB = b(width, height);
            this.f11501l = bitmapB;
            animatedImageFrame.renderFrame(width, height, bitmapB);
            canvas.save();
            canvas.translate(xOffset, yOffset);
            canvas.drawBitmap(this.f11501l, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public final void d(Canvas canvas, AnimatedImageFrame animatedImageFrame) {
        double dWidth = ((double) this.f11493d.width()) / ((double) this.f11492c.getWidth());
        double dHeight = ((double) this.f11493d.height()) / ((double) this.f11492c.getHeight());
        int iRound = (int) Math.round(((double) animatedImageFrame.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) animatedImageFrame.getHeight()) * dHeight);
        int xOffset = (int) (((double) animatedImageFrame.getXOffset()) * dWidth);
        int yOffset = (int) (((double) animatedImageFrame.getYOffset()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f11493d.width();
                int iHeight = this.f11493d.height();
                b(iWidth, iHeight);
                Bitmap bitmap = this.f11501l;
                if (bitmap != null) {
                    animatedImageFrame.renderFrame(iRound, iRound2, bitmap);
                }
                this.f11498i.set(0, 0, iWidth, iHeight);
                this.f11499j.set(xOffset, yOffset, iWidth + xOffset, iHeight + yOffset);
                Bitmap bitmap2 = this.f11501l;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f11498i, this.f11499j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final synchronized void dropCaches() {
        synchronized (this) {
            Bitmap bitmap = this.f11501l;
            if (bitmap != null) {
                bitmap.recycle();
                this.f11501l = null;
            }
        }
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final AnimatedDrawableBackend forNewBounds(Rect rect) {
        if (a(this.f11492c, rect).equals(this.f11493d)) {
            return this;
        }
        return new a(this.f11490a, this.f11491b, rect, this.f11500k);
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final X2.b getAnimatedImageResult() {
        return this.f11491b;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getDurationMs() {
        return this.f11496g;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getDurationMsForFrame(int i7) {
        return this.f11494e[i7];
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getFrameCount() {
        return this.f11492c.getFrameCount();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getFrameForPreview() {
        this.f11491b.getClass();
        return 0;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getFrameForTimestampMs(int i7) {
        this.f11490a.getClass();
        int iBinarySearch = Arrays.binarySearch(this.f11495f, i7);
        return iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final X2.a getFrameInfo(int i7) {
        X2.a aVar = this.f11497h[i7];
        return null;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getHeight() {
        return this.f11492c.getHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getLoopCount() {
        return this.f11492c.getLoopCount();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final synchronized int getMemoryUsage() {
        int allocationByteCount;
        try {
            Bitmap bitmap = this.f11501l;
            if (bitmap != null) {
                this.f11490a.getClass();
                allocationByteCount = bitmap.getAllocationByteCount();
            } else {
                allocationByteCount = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocationByteCount + this.f11492c.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final CloseableReference getPreDecodedFrame(int i7) {
        X2.b bVar = this.f11491b;
        synchronized (bVar) {
            ArrayList arrayList = bVar.f10997c;
            if (arrayList == null) {
                return null;
            }
            return CloseableReference.c((CloseableReference) arrayList.get(i7));
        }
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getRenderedHeight() {
        return this.f11493d.height();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getRenderedWidth() {
        return this.f11493d.width();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getTimestampMsForFrame(int i7) {
        int[] iArr = this.f11495f;
        e.d(i7, iArr.length);
        return iArr[i7];
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final int getWidth() {
        return this.f11492c.getWidth();
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final boolean hasPreDecodedFrame(int i7) {
        boolean z3;
        X2.b bVar = this.f11491b;
        synchronized (bVar) {
            ArrayList arrayList = bVar.f10997c;
            z3 = (arrayList == null || arrayList.get(i7) == null) ? false : true;
        }
        return z3;
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend
    public final void renderFrame(int i7, Canvas canvas) {
        AnimatedImage animatedImage = this.f11492c;
        AnimatedImageFrame frame = animatedImage.getFrame(i7);
        try {
            if (animatedImage.doesRenderSupportScaling()) {
                d(canvas, frame);
            } else {
                c(canvas, frame);
            }
        } finally {
            frame.dispose();
        }
    }
}
