package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.camera.camera2.internal.F;
import androidx.transition.l0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Matrix f20242B = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f20243A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f20244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4.a f20245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f20247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f20248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f20249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f20250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f20251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f20252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f20253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f20255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f20256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f20257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f20259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f20260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f20261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f20262s;
    public Canvas t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f20263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f20265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f20266x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f20267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f20268z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.f20248e == null) {
            this.f20248e = new RectF();
        }
        if (this.f20250g == null) {
            this.f20250g = new RectF();
        }
        this.f20248e.set(rectF);
        this.f20248e.offsetTo(rectF.left + aVar.f20217b, rectF.top + aVar.f20218c);
        RectF rectF2 = this.f20248e;
        float f10 = aVar.f20216a;
        rectF2.inset(-f10, -f10);
        this.f20250g.set(rectF);
        this.f20248e.union(this.f20250g);
        return this.f20248e;
    }

    public final void c() {
        float f10;
        com.airbnb.lottie.animation.a aVar;
        if (this.f20244a == null || this.f20245b == null || this.f20260q == null || this.f20247d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i7 = F.i(this.f20246c);
        if (i7 == 0 || i7 == 1) {
            this.f20244a.restore();
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    if (this.f20267y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f20244a.save();
                    Canvas canvas = this.f20244a;
                    float[] fArr = this.f20260q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f20267y.endRecording();
                    if (this.f20245b.d()) {
                        Canvas canvas2 = this.f20244a;
                        a aVar2 = (a) this.f20245b.f1156c;
                        if (this.f20267y == null || this.f20268z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i10 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f20260q;
                        float f11 = fArr2 != null ? fArr2[0] : 1.0f;
                        f10 = fArr2 != null ? fArr2[4] : 1.0f;
                        a aVar3 = this.f20243A;
                        if (aVar3 == null || aVar2.f20216a != aVar3.f20216a || aVar2.f20217b != aVar3.f20217b || aVar2.f20218c != aVar3.f20218c || aVar2.f20219d != aVar3.f20219d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar2.f20219d, PorterDuff.Mode.SRC_IN));
                            float f12 = aVar2.f20216a;
                            if (f12 > 0.0f) {
                                float f13 = ((f11 + f10) * f12) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f13, f13, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f20268z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.f20243A = aVar2;
                        }
                        RectF rectFB = b(this.f20247d, aVar2);
                        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f10, rectFB.right * f11, rectFB.bottom * f10);
                        this.f20268z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f20268z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((aVar2.f20217b * f11) + (-rectF.left), (aVar2.f20218c * f10) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f20267y);
                        this.f20268z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f20268z);
                        canvas2.restore();
                    }
                    this.f20244a.drawRenderNode(this.f20267y);
                    this.f20244a.restore();
                }
            } else {
                if (this.f20255l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f20245b.d()) {
                    Canvas canvas3 = this.f20244a;
                    a aVar4 = (a) this.f20245b.f1156c;
                    RectF rectF2 = this.f20247d;
                    if (rectF2 == null || this.f20255l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, aVar4);
                    if (this.f20249f == null) {
                        this.f20249f = new Rect();
                    }
                    this.f20249f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f20260q;
                    float f14 = fArr3 != null ? fArr3[0] : 1.0f;
                    f10 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f20251h == null) {
                        this.f20251h = new RectF();
                    }
                    this.f20251h.set(rectFB2.left * f14, rectFB2.top * f10, rectFB2.right * f14, rectFB2.bottom * f10);
                    if (this.f20252i == null) {
                        this.f20252i = new Rect();
                    }
                    this.f20252i.set(0, 0, Math.round(this.f20251h.width()), Math.round(this.f20251h.height()));
                    if (d(this.f20261r, this.f20251h)) {
                        Bitmap bitmap = this.f20261r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f20262s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f20261r = a(this.f20251h, Bitmap.Config.ARGB_8888);
                        this.f20262s = a(this.f20251h, Bitmap.Config.ALPHA_8);
                        this.t = new Canvas(this.f20261r);
                        this.f20263u = new Canvas(this.f20262s);
                    } else {
                        Canvas canvas4 = this.t;
                        if (canvas4 == null || this.f20263u == null || (aVar = this.f20258o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f20252i, aVar);
                        this.f20263u.drawRect(this.f20252i, this.f20258o);
                    }
                    if (this.f20262s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f20264v == null) {
                        this.f20264v = new com.airbnb.lottie.animation.a(1, 0);
                    }
                    RectF rectF3 = this.f20247d;
                    this.f20263u.drawBitmap(this.f20255l, Math.round((rectF3.left - rectFB2.left) * f14), Math.round((rectF3.top - rectFB2.top) * f10), (Paint) null);
                    if (this.f20265w == null || this.f20266x != aVar4.f20216a) {
                        float f15 = ((f14 + f10) * aVar4.f20216a) / 2.0f;
                        if (f15 > 0.0f) {
                            this.f20265w = new BlurMaskFilter(f15, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f20265w = null;
                        }
                        this.f20266x = aVar4.f20216a;
                    }
                    this.f20264v.setColor(aVar4.f20219d);
                    if (aVar4.f20216a > 0.0f) {
                        this.f20264v.setMaskFilter(this.f20265w);
                    } else {
                        this.f20264v.setMaskFilter(null);
                    }
                    this.f20264v.setFilterBitmap(true);
                    this.t.drawBitmap(this.f20262s, Math.round(aVar4.f20217b * f14), Math.round(aVar4.f20218c * f10), this.f20264v);
                    canvas3.drawBitmap(this.f20261r, this.f20252i, this.f20249f, this.f20254k);
                }
                if (this.f20257n == null) {
                    this.f20257n = new Rect();
                }
                this.f20257n.set(0, 0, (int) (this.f20247d.width() * this.f20260q[0]), (int) (this.f20247d.height() * this.f20260q[4]));
                this.f20244a.drawBitmap(this.f20255l, this.f20257n, this.f20247d, this.f20254k);
            }
        }
        this.f20244a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, C4.a aVar) {
        if (this.f20244a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f20260q == null) {
            this.f20260q = new float[9];
        }
        if (this.f20259p == null) {
            this.f20259p = new Matrix();
        }
        canvas.getMatrix(this.f20259p);
        this.f20259p.getValues(this.f20260q);
        float[] fArr = this.f20260q;
        float f10 = fArr[0];
        int i7 = 4;
        float f11 = fArr[4];
        if (this.f20253j == null) {
            this.f20253j = new RectF();
        }
        this.f20253j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f20244a = canvas;
        this.f20245b = aVar;
        if (aVar.f1155b >= 255 && !aVar.d()) {
            i7 = 1;
        } else if (aVar.d()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29 || !canvas.isHardwareAccelerated() || i10 <= 31) {
                i7 = 3;
            }
        } else {
            i7 = 2;
        }
        this.f20246c = i7;
        if (this.f20247d == null) {
            this.f20247d = new RectF();
        }
        this.f20247d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f20254k == null) {
            this.f20254k = new com.airbnb.lottie.animation.a();
        }
        this.f20254k.reset();
        int i11 = F.i(this.f20246c);
        if (i11 == 0) {
            canvas.save();
            return canvas;
        }
        if (i11 == 1) {
            this.f20254k.setAlpha(aVar.f1155b);
            this.f20254k.setColorFilter(null);
            com.airbnb.lottie.animation.a aVar2 = this.f20254k;
            Matrix matrix = i.f20269a;
            canvas.saveLayer(rectF, aVar2);
            return canvas;
        }
        Matrix matrix2 = f20242B;
        if (i11 == 2) {
            if (this.f20258o == null) {
                com.airbnb.lottie.animation.a aVar3 = new com.airbnb.lottie.animation.a();
                this.f20258o = aVar3;
                aVar3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f20255l, this.f20253j)) {
                Bitmap bitmap = this.f20255l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f20255l = a(this.f20253j, Bitmap.Config.ARGB_8888);
                this.f20256m = new Canvas(this.f20255l);
            } else {
                Canvas canvas2 = this.f20256m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f20256m.drawRect(-1.0f, -1.0f, this.f20253j.width() + 1.0f, this.f20253j.height() + 1.0f, this.f20258o);
            }
            androidx.core.graphics.f.a(this.f20254k, null);
            this.f20254k.setColorFilter(null);
            this.f20254k.setAlpha(aVar.f1155b);
            Canvas canvas3 = this.f20256m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i11 != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f20267y == null) {
            this.f20267y = l0.h();
        }
        if (aVar.d() && this.f20268z == null) {
            this.f20268z = l0.w();
            this.f20243A = null;
        }
        this.f20267y.setAlpha(aVar.f1155b / 255.0f);
        if (aVar.d()) {
            RenderNode renderNode = this.f20268z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(aVar.f1155b / 255.0f);
        }
        this.f20267y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f20267y;
        RectF rectF2 = this.f20253j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f20267y.beginRecording((int) this.f20253j.width(), (int) this.f20253j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
