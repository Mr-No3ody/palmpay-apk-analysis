package com.wang.avi;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Indicator extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Rect f35427g = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f35429b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f35433f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f35428a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35430c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f35431d = f35427g;

    public Indicator() {
        Paint paint = new Paint();
        this.f35433f = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public void addUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f35428a.put(valueAnimator, animatorUpdateListener);
    }

    public int centerX() {
        return this.f35431d.centerX();
    }

    public int centerY() {
        return this.f35431d.centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        draw(canvas, this.f35433f);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public float exactCenterX() {
        return this.f35431d.exactCenterX();
    }

    public float exactCenterY() {
        return this.f35431d.exactCenterY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35430c;
    }

    public int getColor() {
        return this.f35433f.getColor();
    }

    public Rect getDrawBounds() {
        return this.f35431d;
    }

    public int getHeight() {
        return this.f35431d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int getWidth() {
        return this.f35431d.width();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator it = this.f35429b.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setDrawBounds(rect);
    }

    public abstract ArrayList<ValueAnimator> onCreateAnimators();

    public void postInvalidate() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f35430c = i7;
    }

    public void setColor(int i7) {
        this.f35433f.setColor(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDrawBounds(Rect rect) {
        setDrawBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!this.f35432e) {
            this.f35429b = onCreateAnimators();
            this.f35432e = true;
        }
        ArrayList arrayList = this.f35429b;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext() ? ((ValueAnimator) it.next()).isStarted() : false) {
            return;
        }
        for (int i7 = 0; i7 < this.f35429b.size(); i7++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.f35429b.get(i7);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.f35428a.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ArrayList<ValueAnimator> arrayList = this.f35429b;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    public void setDrawBounds(int i7, int i10, int i11, int i12) {
        this.f35431d = new Rect(i7, i10, i11, i12);
    }
}
