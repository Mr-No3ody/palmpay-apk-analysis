package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.imagehelper.ImageSource;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class ImageView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23315g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23317j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f23318o;

    public ImageView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23318o = new AtomicBoolean(false);
    }

    public final void b(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f23314f == 0 || this.f23315g == 0) {
            this.f23314f = bitmap.getWidth();
            this.f23315g = bitmap.getHeight();
        }
        RectF rectFC = c();
        RectF rectF = new RectF(0.0f, 0.0f, this.f23314f, this.f23315g);
        p377z5.l.n(rectF, rectFC, this.f23316i, this.f23317j).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    public final RectF c() {
        double dRelativeOnWidth = relativeOnWidth(this.f23309a);
        double dRelativeOnHeight = relativeOnHeight(this.f23310b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f23311c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f23312d);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f23314f * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f23315g * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        boolean z3;
        AtomicBoolean atomicBoolean = this.f23318o;
        if (atomicBoolean.get()) {
            return;
        }
        p061e3.k kVarW = p118hf.a.w();
        com.facebook.imagepipeline.request.d imageRequest = com.facebook.imagepipeline.request.d.fromUri(new ImageSource(this.mContext, this.f23313e).getUri());
        if (imageRequest == null) {
            kVarW.getClass();
            z3 = false;
        } else {
            CacheKey bitmapCacheKey = kVarW.f36039h.getBitmapCacheKey(imageRequest, null);
            Intrinsics.e(bitmapCacheKey);
            CloseableReference closeableReference = kVarW.f36037f.get(bitmapCacheKey);
            try {
                boolean zH = CloseableReference.h(closeableReference);
                CloseableReference.d(closeableReference);
                z3 = zH;
            } catch (Throwable th) {
                CloseableReference.d(closeableReference);
                throw th;
            }
        }
        if (!z3) {
            atomicBoolean.set(true);
            kVarW.a(imageRequest, this.mContext).subscribe(new C1414k(this), p180m2.d.b());
            return;
        }
        float f11 = f10 * this.mOpacity;
        ReactContext reactContext = this.mContext;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        com.facebook.imagepipeline.request.c lowestPermittedRequestLevelOnSubmit = com.facebook.imagepipeline.request.c.BITMAP_MEMORY_CACHE;
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        CancellationException cancellationException = p061e3.k.f36030l;
        p360y2.b bVarB = kVarW.b(imageRequest, reactContext, lowestPermittedRequestLevelOnSubmit, null, null);
        try {
            try {
                CloseableReference closeableReference2 = (CloseableReference) bVarB.getResult();
                try {
                    if (closeableReference2 == null) {
                        bVarB.close();
                        return;
                    }
                    try {
                        CloseableImage closeableImage = (CloseableImage) closeableReference2.f();
                        if (!(closeableImage instanceof CloseableBitmap)) {
                            closeableReference2.close();
                            bVarB.close();
                            return;
                        }
                        Bitmap underlyingBitmap = ((CloseableBitmap) closeableImage).getUnderlyingBitmap();
                        if (underlyingBitmap == null) {
                            closeableReference2.close();
                            bVarB.close();
                        } else {
                            b(canvas, paint, underlyingBitmap, f11);
                            closeableReference2.close();
                            bVarB.close();
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (Throwable th2) {
                    closeableReference2.close();
                    throw th2;
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        } catch (Throwable th3) {
            bVarB.close();
            throw th3;
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(c(), Path.Direction.CW);
        return this.mPath;
    }
}
