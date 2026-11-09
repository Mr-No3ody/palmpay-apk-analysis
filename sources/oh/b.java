package oh;

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
public abstract class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Rect f40546g = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f40548b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f40552f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40547a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40549c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f40550d = f40546g;

    public b() {
        Paint paint = new Paint();
        this.f40552f = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public void addUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40547a.put(valueAnimator, animatorUpdateListener);
    }

    public int centerX() {
        return this.f40550d.centerX();
    }

    public int centerY() {
        return this.f40550d.centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        draw(canvas, this.f40552f);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public float exactCenterX() {
        return this.f40550d.exactCenterX();
    }

    public float exactCenterY() {
        return this.f40550d.exactCenterY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f40549c;
    }

    public int getColor() {
        return this.f40552f.getColor();
    }

    public Rect getDrawBounds() {
        return this.f40550d;
    }

    public int getHeight() {
        return this.f40550d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int getWidth() {
        return this.f40550d.width();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator it = this.f40548b.iterator();
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

    public abstract ArrayList onCreateAnimators();

    public void postInvalidate() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f40549c = i7;
    }

    public void setColor(int i7) {
        this.f40552f.setColor(i7);
    }

    public void setDrawBounds(int i7, int i10, int i11, int i12) {
        this.f40550d = new Rect(i7, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!this.f40551e) {
            this.f40548b = onCreateAnimators();
            this.f40551e = true;
        }
        ArrayList arrayList = this.f40548b;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext() ? ((ValueAnimator) it.next()).isStarted() : false) {
            return;
        }
        for (int i7 = 0; i7 < this.f40548b.size(); i7++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.f40548b.get(i7);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.f40547a.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ArrayList<ValueAnimator> arrayList = this.f40548b;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    public void setDrawBounds(Rect rect) {
        setDrawBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
