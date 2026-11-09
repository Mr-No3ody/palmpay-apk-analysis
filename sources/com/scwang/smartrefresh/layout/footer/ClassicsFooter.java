package com.scwang.smartrefresh.layout.footer;

import C7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.ArrowDrawable;
import com.scwang.smartrefresh.layout.internal.InternalClassics;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicsFooter extends InternalClassics<ClassicsFooter> implements RefreshFooter {
    public static String REFRESH_FOOTER_FAILED;
    public static String REFRESH_FOOTER_FINISH;
    public static String REFRESH_FOOTER_LOADING;
    public static String REFRESH_FOOTER_NOTHING;
    public static String REFRESH_FOOTER_PULLING;
    public static String REFRESH_FOOTER_REFRESHING;
    public static String REFRESH_FOOTER_RELEASE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f25117B;

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        if (this.f25117B) {
            return 0;
        }
        this.f25174c.setText(z3 ? REFRESH_FOOTER_FINISH : REFRESH_FOOTER_FAILED);
        return super.onFinish(refreshLayout, z3);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        if (this.f25117B) {
            return;
        }
        super.onStartAnimator(refreshLayout, i7, i10);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f25175d;
        if (this.f25117B) {
            return;
        }
        int i7 = b.f1242a[refreshState2.ordinal()];
        TextView textView = this.f25174c;
        switch (i7) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                textView.setText(REFRESH_FOOTER_LOADING);
                return;
            case 5:
                textView.setText(REFRESH_FOOTER_RELEASE);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                textView.setText(REFRESH_FOOTER_REFRESHING);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        textView.setText(REFRESH_FOOTER_PULLING);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean z3) {
        if (this.f25117B == z3) {
            return true;
        }
        this.f25117B = z3;
        ImageView imageView = this.f25175d;
        TextView textView = this.f25174c;
        if (z3) {
            textView.setText(REFRESH_FOOTER_NOTHING);
            imageView.setVisibility(8);
            return true;
        }
        textView.setText(REFRESH_FOOTER_PULLING);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalClassics, com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f25172b == SpinnerStyle.FixedBehind) {
            super.setPrimaryColors(iArr);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25117B = false;
        if (REFRESH_FOOTER_PULLING == null) {
            REFRESH_FOOTER_PULLING = context.getString(R.string.srl_footer_pulling);
        }
        if (REFRESH_FOOTER_RELEASE == null) {
            REFRESH_FOOTER_RELEASE = context.getString(R.string.srl_footer_release);
        }
        if (REFRESH_FOOTER_LOADING == null) {
            REFRESH_FOOTER_LOADING = context.getString(R.string.srl_footer_loading);
        }
        if (REFRESH_FOOTER_REFRESHING == null) {
            REFRESH_FOOTER_REFRESHING = context.getString(R.string.srl_footer_refreshing);
        }
        if (REFRESH_FOOTER_FINISH == null) {
            REFRESH_FOOTER_FINISH = context.getString(R.string.srl_footer_finish);
        }
        if (REFRESH_FOOTER_FAILED == null) {
            REFRESH_FOOTER_FAILED = context.getString(R.string.srl_footer_failed);
        }
        if (REFRESH_FOOTER_NOTHING == null) {
            REFRESH_FOOTER_NOTHING = context.getString(R.string.srl_footer_nothing);
        }
        ImageView imageView = this.f25175d;
        ImageView imageView2 = this.f25176e;
        DensityUtil densityUtil = new DensityUtil();
        this.f25174c.setTextColor(-10066330);
        this.f25174c.setText(isInEditMode() ? REFRESH_FOOTER_LOADING : REFRESH_FOOTER_PULLING);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsFooter_srlDrawableMarginRight, densityUtil.dip2px(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableArrowSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableArrowSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableProgressSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableProgressSize, layoutParams2.height);
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ClassicsFooter_srlDrawableSize, layoutParams2.height);
        this.f25183v = typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsFooter_srlFinishDuration, this.f25183v);
        this.f25172b = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.f25172b.ordinal())];
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsFooter_srlDrawableArrow)) {
            this.f25175d.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.ClassicsFooter_srlDrawableArrow));
        } else {
            ArrowDrawable arrowDrawable = new ArrowDrawable();
            this.f25179i = arrowDrawable;
            arrowDrawable.setColor(-10066330);
            this.f25175d.setImageDrawable(this.f25179i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsFooter_srlDrawableProgress)) {
            this.f25176e.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.ClassicsFooter_srlDrawableProgress));
        } else {
            ProgressDrawable progressDrawable = new ProgressDrawable();
            this.f25180j = progressDrawable;
            progressDrawable.setColor(-10066330);
            this.f25176e.setImageDrawable(this.f25180j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsFooter_srlTextSizeTitle)) {
            this.f25174c.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClassicsFooter_srlTextSizeTitle, DensityUtil.dp2px(16.0f)));
        } else {
            this.f25174c.setTextSize(16.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsFooter_srlPrimaryColor)) {
            setPrimaryColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ClassicsFooter_srlPrimaryColor, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ClassicsFooter_srlAccentColor)) {
            setAccentColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ClassicsFooter_srlAccentColor, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
