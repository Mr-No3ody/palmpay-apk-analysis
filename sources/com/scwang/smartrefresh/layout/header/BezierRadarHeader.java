package com.scwang.smartrefresh.layout.header;

import D7.a;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.google.android.flexbox.FlexItem;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.scwang.smartrefresh.layout.util.SmartUtil;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public class BezierRadarHeader extends InternalAbstract implements RefreshHeader {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f25119A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f25120B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f25121C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f25122H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final float f25123L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final float f25124M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f25125Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25130g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f25132j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public AnimatorSet f25133k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f25134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25135p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RectF f25136p0;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f25138w;

    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f25139a;

        public AnimatorUpdater(byte b7) {
            this.f25139a = b7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BezierRadarHeader bezierRadarHeader = BezierRadarHeader.this;
            byte b7 = this.f25139a;
            if (b7 == 0) {
                bezierRadarHeader.f25125Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b7) {
                if (bezierRadarHeader.f25130g) {
                    valueAnimator.cancel();
                    return;
                }
                bezierRadarHeader.t = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b7) {
                bezierRadarHeader.f25138w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b7) {
                bezierRadarHeader.f25121C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b7) {
                bezierRadarHeader.f25122H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            bezierRadarHeader.invalidate();
        }
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25131i = false;
        this.f25137v = -1;
        this.f25122H = 0;
        this.f25123L = 0.0f;
        this.f25124M = 0.0f;
        this.f25125Q = 0.0f;
        this.f25136p0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f25172b = SpinnerStyle.Scale;
        DensityUtil densityUtil = new DensityUtil();
        this.f25132j = new Path();
        Paint paint = new Paint();
        this.f25134o = paint;
        paint.setAntiAlias(true);
        this.f25120B = densityUtil.dip2px(7.0f);
        this.f25123L = densityUtil.dip2px(20.0f);
        this.f25124M = densityUtil.dip2px(7.0f);
        paint.setStrokeWidth(densityUtil.dip2px(3.0f));
        setMinimumHeight(densityUtil.dip2px(100.0f));
        if (isInEditMode()) {
            this.f25135p = 1000;
            this.f25125Q = 1.0f;
            this.f25122H = 270;
        } else {
            this.f25125Q = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BezierRadarHeader);
        this.f25131i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BezierRadarHeader_srlEnableHorizontalDrag, this.f25131i);
        setAccentColor(typedArrayObtainStyledAttributes.getColor(R.styleable.BezierRadarHeader_srlAccentColor, -1));
        setPrimaryColor(typedArrayObtainStyledAttributes.getColor(R.styleable.BezierRadarHeader_srlPrimaryColor, -14540254));
        this.f25129f = typedArrayObtainStyledAttributes.hasValue(R.styleable.BezierRadarHeader_srlAccentColor);
        this.f25128e = typedArrayObtainStyledAttributes.hasValue(R.styleable.BezierRadarHeader_srlPrimaryColor);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2 = canvas;
        int width = getWidth();
        int height = getHeight();
        Path path = this.f25132j;
        path.reset();
        float f11 = 0.0f;
        path.lineTo(0.0f, this.f25135p);
        int i7 = this.f25137v;
        if (i7 < 0) {
            i7 = width / 2;
        }
        float f12 = i7;
        int i10 = this.f25135p;
        float f13 = width;
        path.quadTo(f12, this.t + i10, f13, i10);
        path.lineTo(f13, 0.0f);
        Paint paint = this.f25134o;
        paint.setColor(this.f25127d);
        canvas2.drawPath(path, paint);
        if (this.f25138w > 0.0f) {
            paint.setColor(this.f25126c);
            float fPx2dp = DensityUtil.px2dp(height);
            float f14 = width / 7;
            float f15 = this.f25119A;
            float f16 = 1.0f;
            float f17 = (f14 * f15) - (f15 > 1.0f ? ((f15 - 1.0f) * f14) / f15 : 0.0f);
            float f18 = height;
            float f19 = 2.0f;
            float f20 = f18 - (f15 > 1.0f ? (((f15 - 1.0f) * f18) / 2.0f) / f15 : 0.0f);
            int i11 = 0;
            while (i11 < 7) {
                float f21 = (i11 + f16) - 4.0f;
                float f22 = f16;
                float f23 = f19;
                paint.setAlpha((int) ((1.0d - (1.0d / Math.pow((((double) fPx2dp) / 800.0d) + 1.0d, 15.0d))) * ((double) (this.f25138w * (f16 - ((Math.abs(f21) / 7.0f) * f19)) * 255.0f))));
                float f24 = (f22 - (f22 / ((fPx2dp / 10.0f) + f22))) * this.f25120B;
                canvas2.drawCircle((f21 * f17) + ((width / 2) - (f24 / f23)), f20 / f23, f24, paint);
                i11++;
                f11 = f11;
                f16 = f22;
                f19 = f23;
            }
            f10 = f11;
            paint.setAlpha(255);
        } else {
            f10 = 0.0f;
        }
        if (this.f25133k0 != null || isInEditMode()) {
            float f25 = this.f25125Q;
            float f26 = this.f25123L * f25;
            float f27 = this.f25124M * f25;
            paint.setColor(this.f25126c);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            float f28 = width / 2;
            float f29 = height / 2;
            canvas2.drawCircle(f28, f29, f26, paint);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            float f30 = f26 + f27;
            canvas2.drawCircle(f28, f29, f30, paint);
            paint.setColor((this.f25127d & FlexItem.MAX_SIZE) | ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR);
            paint.setStyle(style);
            RectF rectF = this.f25136p0;
            rectF.set(f28 - f26, f29 - f26, f28 + f26, f26 + f29);
            canvas2.drawArc(rectF, 270.0f, this.f25122H, true, paint);
            paint.setStyle(style2);
            rectF.set(f28 - f30, f29 - f30, f28 + f30, f29 + f30);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 270.0f, this.f25122H, false, paint);
            paint.setStyle(style);
        }
        if (this.f25121C > f10) {
            paint.setColor(this.f25126c);
            canvas2.drawCircle(width / 2, height / 2, this.f25121C, paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return this.f25131i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f25133k0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f25133k0.end();
            this.f25133k0 = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        AnimatorSet animatorSet = this.f25133k0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f25133k0.end();
            this.f25133k0 = null;
        }
        int width = getWidth();
        int height = getHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (float) Math.sqrt((height * height) + (width * width)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater((byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f10, int i7, int i10) {
        this.f25137v = i7;
        postInvalidateOnAnimation();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onMoving(boolean z3, float f10, int i7, int i10, int i11) {
        if (z3 || this.f25130g) {
            this.f25130g = true;
            this.f25135p = Math.min(i10, i7);
            this.t = (int) (Math.max(0, i7 - i10) * 1.9f);
            this.f25119A = f10;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        this.f25135p = i7;
        this.f25130g = false;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, MessageEvent.EVENT_CL_REPAYMENT_FAILED);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AnimatorUpdater((byte) 4));
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater((byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat2.addUpdateListener(new AnimatorUpdater((byte) 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i11 = this.t;
        float f10 = i11;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i11, 0, -((int) (0.8f * f10)), 0, -((int) (f10 * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new AnimatorUpdater((byte) 1));
        valueAnimatorOfInt2.setInterpolator(decelerateInterpolator);
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.f25133k0 = animatorSet;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        int i7 = a.f1687a[refreshState2.ordinal()];
        if (i7 == 1 || i7 == 2) {
            this.f25138w = 1.0f;
            this.f25125Q = 0.0f;
            this.f25121C = 0.0f;
        }
    }

    public BezierRadarHeader setAccentColor(@ColorInt int i7) {
        this.f25126c = i7;
        this.f25129f = true;
        return this;
    }

    public BezierRadarHeader setAccentColorId(@ColorRes int i7) {
        setAccentColor(SmartUtil.getColor(getContext(), i7));
        return this;
    }

    public BezierRadarHeader setEnableHorizontalDrag(boolean z3) {
        this.f25131i = z3;
        if (!z3) {
            this.f25137v = -1;
        }
        return this;
    }

    public BezierRadarHeader setPrimaryColor(@ColorInt int i7) {
        this.f25127d = i7;
        this.f25128e = true;
        return this;
    }

    public BezierRadarHeader setPrimaryColorId(@ColorRes int i7) {
        setPrimaryColor(SmartUtil.getColor(getContext(), i7));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0 && !this.f25128e) {
            setPrimaryColor(iArr[0]);
            this.f25128e = false;
        }
        if (iArr.length <= 1 || this.f25129f) {
            return;
        }
        setAccentColor(iArr[1]);
        this.f25129f = false;
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
