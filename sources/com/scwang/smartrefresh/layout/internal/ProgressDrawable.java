package com.scwang.smartrefresh.layout.internal;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressDrawable extends PaintDrawable implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ValueAnimator f25189e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25186b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25187c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25188d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f25190f = new Path();

    public ProgressDrawable() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f25189e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iMax = Math.max(1, iWidth / 20);
        int i7 = this.f25186b;
        Path path = this.f25190f;
        if (i7 != iWidth || this.f25187c != iHeight) {
            path.reset();
            float f10 = iWidth - iMax;
            int i10 = iHeight / 2;
            float f11 = i10;
            float f12 = iMax;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f10, f11, f12, direction);
            float f13 = iWidth - (iMax * 5);
            path.addRect(f13, i10 - iMax, f10, i10 + iMax, direction);
            path.addCircle(f13, f11, f12, direction);
            this.f25186b = iWidth;
            this.f25187c = iHeight;
        }
        canvas.save();
        float f14 = iWidth / 2;
        float f15 = iHeight / 2;
        canvas.rotate(this.f25188d, f14, f15);
        for (int i11 = 0; i11 < 12; i11++) {
            Paint paint = this.f25185a;
            paint.setAlpha((i11 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f25189e.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25188d = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.f25189e;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.addUpdateListener(this);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.f25189e;
        if (valueAnimator.isRunning()) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }
}
