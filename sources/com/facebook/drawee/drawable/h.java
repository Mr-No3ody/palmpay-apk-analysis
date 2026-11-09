package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f21258z0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Paint f21259t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Paint f21260u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Bitmap f21261v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public WeakReference f21262w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f21263x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public RectF f21264y0;

    public h(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f21259t0 = paint2;
        Paint paint3 = new Paint(1);
        this.f21260u0 = paint3;
        this.f21264y0 = null;
        this.f21261v0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f21263x0 = false;
    }

    @Override // com.facebook.drawee.drawable.k
    public final void b() {
        super.b();
        if (this.f21263x0) {
            return;
        }
        if (this.f21264y0 == null) {
            this.f21264y0 = new RectF();
        }
        this.f21304Z.mapRect(this.f21264y0, this.f21322w);
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        p181m3.a.a();
        if (!((this.f21306b || this.f21307c || this.f21308d > 0.0f) && this.f21261v0 != null)) {
            super.draw(canvas);
            p181m3.a.a();
            return;
        }
        b();
        a();
        WeakReference weakReference = this.f21262w0;
        Paint paint = this.f21259t0;
        Bitmap bitmap = this.f21261v0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.f21262w0 = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f21310f = true;
            }
        }
        if (this.f21310f && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.f21304Z);
            this.f21310f = false;
        }
        paint.setFilterBitmap(this.f21318q0);
        int iSave = canvas.save();
        canvas.concat(this.f21301Q);
        boolean z3 = this.f21263x0;
        Path path = this.f21309e;
        if (z3 || this.f21264y0 == null) {
            canvas.drawPath(path, paint);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f21264y0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        }
        float f10 = this.f21308d;
        if (f10 > 0.0f) {
            Paint paint2 = this.f21260u0;
            paint2.setStrokeWidth(f10);
            paint2.setColor(com.facebook.imagepipeline.nativecode.b.C(this.f21311g, paint.getAlpha()));
            canvas.drawPath(this.f21312i, paint2);
        }
        canvas.restoreToCount(iSave);
        p181m3.a.a();
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        Paint paint = this.f21259t0;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            super.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.k, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f21259t0.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.drawable.k, com.facebook.drawee.drawable.Rounded
    public final void setRepeatEdgePixels(boolean z3) {
        this.f21263x0 = z3;
    }
}
