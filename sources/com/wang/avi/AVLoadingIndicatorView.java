package com.wang.avi;

import Qe.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.alibaba.android.arouter.utils.Consts;
import com.wang.avi.indicators.BallPulseIndicator;

/* JADX INFO: loaded from: classes4.dex */
public class AVLoadingIndicatorView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BallPulseIndicator f35414w = new BallPulseIndicator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f35419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f35420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35421g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35423j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Indicator f35425p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f35426v;

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.f35415a = -1L;
        this.f35416b = false;
        this.f35417c = false;
        this.f35418d = false;
        this.f35419e = new a(this, 0);
        this.f35420f = new a(this, 1);
        a(context, null, 0, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f35421g = 24;
        this.f35422i = 48;
        this.f35423j = 24;
        this.f35424o = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AVLoadingIndicatorView, i7, i10);
        this.f35421g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_minWidth, this.f35421g);
        this.f35422i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_maxWidth, this.f35422i);
        this.f35423j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_minHeight, this.f35423j);
        this.f35424o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_maxHeight, this.f35424o);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.AVLoadingIndicatorView_indicatorName);
        this.t = typedArrayObtainStyledAttributes.getColor(R.styleable.AVLoadingIndicatorView_indicatorColor, -1);
        setIndicator(string);
        if (this.f35425p == null) {
            setIndicator(f35414w);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f35425p != null) {
            this.f35426v = true;
        }
        postInvalidate();
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Indicator indicator = this.f35425p;
        if (indicator != null) {
            indicator.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Indicator indicator = this.f35425p;
        if (indicator == null || !indicator.isStateful()) {
            return;
        }
        this.f35425p.setState(drawableState);
    }

    public Indicator getIndicator() {
        return this.f35425p;
    }

    public void hide() {
        this.f35418d = true;
        removeCallbacks(this.f35420f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = this.f35415a;
        long j10 = jCurrentTimeMillis - j6;
        if (j10 >= 500 || j6 == -1) {
            setVisibility(8);
        } else {
            if (this.f35416b) {
                return;
            }
            postDelayed(this.f35419e, 500 - j10);
            this.f35416b = true;
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int paddingLeft = getPaddingLeft() + getScrollX();
        int paddingTop = getPaddingTop() + getScrollY();
        invalidate(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        removeCallbacks(this.f35419e);
        removeCallbacks(this.f35420f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Indicator indicator = this.f35425p;
        if (indicator != null) {
            indicator.stop();
            this.f35426v = false;
        }
        postInvalidate();
        super.onDetachedFromWindow();
        removeCallbacks(this.f35419e);
        removeCallbacks(this.f35420f);
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Indicator indicator = this.f35425p;
        if (indicator != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            indicator.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f35426v) {
                indicator.start();
                this.f35426v = false;
            }
        }
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i7, int i10) {
        int iMax;
        int iMax2;
        try {
            Indicator indicator = this.f35425p;
            if (indicator != null) {
                iMax2 = Math.max(this.f35421g, Math.min(this.f35422i, indicator.getIntrinsicWidth()));
                iMax = Math.max(this.f35423j, Math.min(this.f35424o, indicator.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            int[] drawableState = getDrawableState();
            Indicator indicator2 = this.f35425p;
            if (indicator2 != null && indicator2.isStateful()) {
                this.f35425p.setState(drawableState);
            }
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + iMax2, i7, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + iMax, i10, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        int paddingLeft = i7 - (getPaddingLeft() + getPaddingRight());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        Indicator indicator = this.f35425p;
        if (indicator != null) {
            float intrinsicWidth = indicator.getIntrinsicWidth() / this.f35425p.getIntrinsicHeight();
            float f10 = paddingLeft;
            float f11 = paddingBottom;
            float f12 = f10 / f11;
            int i14 = 0;
            if (intrinsicWidth == f12) {
                i13 = 0;
            } else if (f12 > intrinsicWidth) {
                int i15 = (int) (f11 * intrinsicWidth);
                int i16 = (paddingLeft - i15) / 2;
                i14 = i16;
                paddingLeft = i15 + i16;
                i13 = 0;
            } else {
                int i17 = (int) ((1.0f / intrinsicWidth) * f10);
                int i18 = (paddingBottom - i17) / 2;
                int i19 = i17 + i18;
                i13 = i18;
                paddingBottom = i19;
            }
            this.f35425p.setBounds(i14, i13, paddingLeft, paddingBottom);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 != 8 && i7 != 4) {
            b();
            return;
        }
        Indicator indicator = this.f35425p;
        if (indicator != null) {
            indicator.stop();
            this.f35426v = false;
        }
        postInvalidate();
    }

    public void setIndicator(Indicator indicator) {
        Indicator indicator2 = this.f35425p;
        if (indicator2 != indicator) {
            if (indicator2 != null) {
                indicator2.setCallback(null);
                unscheduleDrawable(this.f35425p);
            }
            this.f35425p = indicator;
            setIndicatorColor(this.t);
            if (indicator != null) {
                indicator.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicatorColor(int i7) {
        this.t = i7;
        this.f35425p.setColor(i7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (getVisibility() != i7) {
            super.setVisibility(i7);
            if (i7 != 8 && i7 != 4) {
                b();
                return;
            }
            Indicator indicator = this.f35425p;
            if (indicator != null) {
                indicator.stop();
                this.f35426v = false;
            }
            postInvalidate();
        }
    }

    public void show() {
        this.f35415a = -1L;
        this.f35418d = false;
        removeCallbacks(this.f35419e);
        if (this.f35417c) {
            return;
        }
        postDelayed(this.f35420f, 500L);
        this.f35417c = true;
    }

    public void smoothToHide() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        setVisibility(8);
    }

    public void smoothToShow() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        setVisibility(0);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f35425p || super.verifyDrawable(drawable);
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!str.contains(Consts.DOT)) {
            sb2.append(getClass().getPackage().getName());
            sb2.append(".indicators.");
        }
        sb2.append(str);
        try {
            setIndicator((Indicator) Class.forName(sb2.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35415a = -1L;
        this.f35416b = false;
        this.f35417c = false;
        this.f35418d = false;
        this.f35419e = new a(this, 0);
        this.f35420f = new a(this, 1);
        a(context, attributeSet, 0, R.style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f35415a = -1L;
        this.f35416b = false;
        this.f35417c = false;
        this.f35418d = false;
        this.f35419e = new a(this, 0);
        this.f35420f = new a(this, 1);
        a(context, attributeSet, i7, R.style.AVLoadingIndicatorView);
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.f35415a = -1L;
        this.f35416b = false;
        this.f35417c = false;
        this.f35418d = false;
        this.f35419e = new a(this, 0);
        this.f35420f = new a(this, 1);
        a(context, attributeSet, i7, R.style.AVLoadingIndicatorView);
    }
}
