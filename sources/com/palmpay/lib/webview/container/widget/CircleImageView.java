package com.palmpay.lib.webview.container.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.E;
import androidx.core.view.N;
import com.palmpay.lib.webview.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class CircleImageView extends ImageView {
    private static final int DEFAULT_BACKGROUND_COLOR = -328966;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private int mBackgroundColor;
    private Animation.AnimationListener mListener;
    private int mShadowRadius;

    public static class OvalShadow extends OvalShape {
        private CircleImageView mCircleImageView;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        public OvalShadow(CircleImageView circleImageView, int i7) {
            this.mCircleImageView = circleImageView;
            this.mShadowRadius = i7;
            updateRadialGradient((int) rect().width());
        }

        private void updateRadialGradient(int i7) {
            float f10 = i7 / 2;
            this.mShadowPaint.setShader(new RadialGradient(f10, f10, this.mShadowRadius, new int[]{CircleImageView.FILL_SHADOW_COLOR, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.mCircleImageView.getWidth() / 2;
            float f10 = width;
            float height = this.mCircleImageView.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.mShadowPaint);
            canvas.drawCircle(f10, height, width - this.mShadowRadius, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            updateRadialGradient((int) f10);
        }
    }

    public CircleImageView(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i7 = (int) (Y_OFFSET * f10);
        int i10 = (int) (0.0f * f10);
        this.mShadowRadius = (int) (SHADOW_RADIUS * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(R.styleable.PpSwipeRefreshLayout);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PpSwipeRefreshLayout_ppSwipeRefreshLayoutProgressSpinnerBackgroundColor, DEFAULT_BACKGROUND_COLOR);
        typedArrayObtainStyledAttributes.recycle();
        if (elevationSupported()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            WeakHashMap weakHashMap = N.f16168a;
            E.l(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShadow(this, this.mShadowRadius));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.mShadowRadius, i10, i7, KEY_SHADOW_COLOR);
            int i11 = this.mShadowRadius;
            setPadding(i11, i11, i11, i11);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.mBackgroundColor);
        WeakHashMap weakHashMap2 = N.f16168a;
        setBackground(shapeDrawable);
    }

    private boolean elevationSupported() {
        return true;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension((this.mShadowRadius * 2) + getMeasuredWidth(), (this.mShadowRadius * 2) + getMeasuredHeight());
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i7);
            this.mBackgroundColor = i7;
        }
    }
}
