package com.scwang.smartrefresh.layout.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.scwang.smartrefresh.layout.util.SmartUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalClassics<T extends InternalClassics> extends InternalAbstract implements RefreshInternal {
    public static final byte ID_IMAGE_ARROW = 2;
    public static final byte ID_IMAGE_PROGRESS = 3;
    public static final byte ID_TEXT_TITLE = 1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f25173A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f25174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f25175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f25176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f25177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RefreshKernel f25178g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrowDrawable f25179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDrawable f25180j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f25181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f25182p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f25184w;

    public InternalClassics(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25183v = 500;
        this.f25184w = 20;
        this.f25173A = 20;
        this.f25172b = SpinnerStyle.Translate;
        ImageView imageView = new ImageView(context);
        this.f25175d = imageView;
        ImageView imageView2 = new ImageView(context);
        this.f25176e = imageView2;
        TextView textView = new TextView(context);
        this.f25174c = textView;
        textView.setTextColor(-10066330);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25177f = linearLayout;
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        DensityUtil densityUtil = new DensityUtil();
        textView.setId(1);
        imageView.setId(2);
        imageView2.setId(3);
        linearLayout.setId(R.id.widget_frame);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(linearLayout, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(densityUtil.dip2px(20.0f), densityUtil.dip2px(20.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, R.id.widget_frame);
        addView(imageView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, R.id.widget_frame);
        imageView2.animate().setInterpolator(new LinearInterpolator());
        addView(imageView2, layoutParams3);
        if (getPaddingTop() == 0) {
            if (getPaddingBottom() == 0) {
                int paddingLeft = getPaddingLeft();
                int iDip2px = densityUtil.dip2px(20.0f);
                this.f25184w = iDip2px;
                int paddingRight = getPaddingRight();
                int iDip2px2 = densityUtil.dip2px(20.0f);
                this.f25173A = iDip2px2;
                setPadding(paddingLeft, iDip2px, paddingRight, iDip2px2);
            } else {
                int paddingLeft2 = getPaddingLeft();
                int iDip2px3 = densityUtil.dip2px(20.0f);
                this.f25184w = iDip2px3;
                int paddingRight2 = getPaddingRight();
                int paddingBottom = getPaddingBottom();
                this.f25173A = paddingBottom;
                setPadding(paddingLeft2, iDip2px3, paddingRight2, paddingBottom);
            }
        } else if (getPaddingBottom() == 0) {
            int paddingLeft3 = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f25184w = paddingTop;
            int paddingRight3 = getPaddingRight();
            int iDip2px4 = densityUtil.dip2px(20.0f);
            this.f25173A = iDip2px4;
            setPadding(paddingLeft3, paddingTop, paddingRight3, iDip2px4);
        } else {
            this.f25184w = getPaddingTop();
            this.f25173A = getPaddingBottom();
        }
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f25175d;
        ImageView imageView2 = this.f25176e;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = imageView2.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        ImageView imageView = this.f25176e;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f25183v;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i7, int i10) {
        this.f25178g = refreshKernel;
        refreshKernel.requestDrawBackgroundFor(this, this.t);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), this.f25184w, getPaddingRight(), this.f25173A);
        }
        super.onMeasure(i7, i10);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        onStartAnimator(refreshLayout, i7, i10);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        ImageView imageView = this.f25176e;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public T setAccentColor(@ColorInt int i7) {
        this.f25181o = Integer.valueOf(i7);
        this.f25174c.setTextColor(i7);
        ArrowDrawable arrowDrawable = this.f25179i;
        if (arrowDrawable != null) {
            arrowDrawable.setColor(i7);
        }
        ProgressDrawable progressDrawable = this.f25180j;
        if (progressDrawable != null) {
            progressDrawable.setColor(i7);
        }
        return this;
    }

    public T setAccentColorId(@ColorRes int i7) {
        setAccentColor(SmartUtil.getColor(getContext(), i7));
        return this;
    }

    public T setArrowDrawable(Drawable drawable) {
        this.f25179i = null;
        this.f25175d.setImageDrawable(drawable);
        return this;
    }

    public T setArrowResource(@DrawableRes int i7) {
        this.f25179i = null;
        this.f25175d.setImageResource(i7);
        return this;
    }

    public T setDrawableArrowSize(float f10) {
        ImageView imageView = this.f25175d;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iDp2px = DensityUtil.dp2px(f10);
        layoutParams.width = iDp2px;
        layoutParams.height = iDp2px;
        imageView.setLayoutParams(layoutParams);
        return this;
    }

    public T setDrawableMarginRight(float f10) {
        ImageView imageView = this.f25175d;
        ImageView imageView2 = this.f25176e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        int iDp2px = DensityUtil.dp2px(f10);
        marginLayoutParams2.rightMargin = iDp2px;
        marginLayoutParams.rightMargin = iDp2px;
        imageView.setLayoutParams(marginLayoutParams);
        imageView2.setLayoutParams(marginLayoutParams2);
        return this;
    }

    public T setDrawableProgressSize(float f10) {
        ImageView imageView = this.f25176e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iDp2px = DensityUtil.dp2px(f10);
        layoutParams.width = iDp2px;
        layoutParams.height = iDp2px;
        imageView.setLayoutParams(layoutParams);
        return this;
    }

    public T setDrawableSize(float f10) {
        ImageView imageView = this.f25175d;
        ImageView imageView2 = this.f25176e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iDp2px = DensityUtil.dp2px(f10);
        layoutParams2.width = iDp2px;
        layoutParams.width = iDp2px;
        int iDp2px2 = DensityUtil.dp2px(f10);
        layoutParams2.height = iDp2px2;
        layoutParams.height = iDp2px2;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        return this;
    }

    public T setFinishDuration(int i7) {
        this.f25183v = i7;
        return this;
    }

    public T setPrimaryColor(@ColorInt int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        this.f25182p = numValueOf;
        this.t = i7;
        RefreshKernel refreshKernel = this.f25178g;
        if (refreshKernel != null) {
            refreshKernel.requestDrawBackgroundFor(this, numValueOf.intValue());
        }
        return this;
    }

    public T setPrimaryColorId(@ColorRes int i7) {
        setPrimaryColor(SmartUtil.getColor(getContext(), i7));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && this.f25182p == null) {
                setPrimaryColor(iArr[0]);
                this.f25182p = null;
            }
            if (this.f25181o == null) {
                if (iArr.length > 1) {
                    setAccentColor(iArr[1]);
                } else {
                    setAccentColor(iArr[0] == -1 ? -10066330 : -1);
                }
                this.f25181o = null;
            }
        }
    }

    public T setProgressDrawable(Drawable drawable) {
        this.f25180j = null;
        this.f25176e.setImageDrawable(drawable);
        return this;
    }

    public T setProgressResource(@DrawableRes int i7) {
        this.f25180j = null;
        this.f25176e.setImageResource(i7);
        return this;
    }

    public T setSpinnerStyle(SpinnerStyle spinnerStyle) {
        this.f25172b = spinnerStyle;
        return this;
    }

    public T setTextSizeTitle(float f10) {
        this.f25174c.setTextSize(f10);
        RefreshKernel refreshKernel = this.f25178g;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightFor(this);
        }
        return this;
    }
}
