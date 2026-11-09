package com.transsnet.adsdk.widgets.banner.bannerview.manager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AttributeController {
    private final BannerOptions mBannerOptions;

    public AttributeController(BannerOptions bannerOptions) {
        this.mBannerOptions = bannerOptions;
    }

    private void initBannerAttrs(TypedArray typedArray) {
        int integer = typedArray.getInteger(R.styleable.BannerViewPager_bvp_interval, 3000);
        boolean z3 = typedArray.getBoolean(R.styleable.BannerViewPager_bvp_auto_play, true);
        boolean z8 = typedArray.getBoolean(R.styleable.BannerViewPager_bvp_can_loop, true);
        int dimension = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_page_margin, 0.0f);
        int dimension2 = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_round_corner, 0.0f);
        int dimension3 = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_reveal_width, -1000.0f);
        int i7 = typedArray.getInt(R.styleable.BannerViewPager_bvp_page_style, 0);
        int i10 = typedArray.getInt(R.styleable.BannerViewPager_bvp_scroll_duration, 0);
        this.mBannerOptions.setInterval(integer);
        this.mBannerOptions.setAutoPlay(z3);
        this.mBannerOptions.setCanLoop(z8);
        this.mBannerOptions.setPageMargin(dimension);
        this.mBannerOptions.setRoundRectRadius(dimension2);
        this.mBannerOptions.setRightRevealWidth(dimension3);
        this.mBannerOptions.setLeftRevealWidth(dimension3);
        this.mBannerOptions.setPageStyle(i7);
        this.mBannerOptions.setScrollDuration(i10);
    }

    private void initIndicatorAttrs(TypedArray typedArray) {
        int color = typedArray.getColor(R.styleable.BannerViewPager_bvp_indicator_checked_color, Color.parseColor("#8C18171C"));
        int color2 = typedArray.getColor(R.styleable.BannerViewPager_bvp_indicator_normal_color, Color.parseColor("#8C6C6D72"));
        int dimension = (int) typedArray.getDimension(R.styleable.BannerViewPager_bvp_indicator_radius, BannerUtils.dp2px(8.0f));
        int i7 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_gravity, 0);
        int i10 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_style, 0);
        int i11 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_slide_mode, 0);
        int i12 = typedArray.getInt(R.styleable.BannerViewPager_bvp_indicator_visibility, 0);
        this.mBannerOptions.setIndicatorSliderColor(color2, color);
        this.mBannerOptions.setIndicatorSliderWidth(dimension, dimension);
        this.mBannerOptions.setIndicatorGravity(i7);
        this.mBannerOptions.setIndicatorStyle(i10);
        this.mBannerOptions.setIndicatorSlideMode(i11);
        this.mBannerOptions.setIndicatorVisibility(i12);
        this.mBannerOptions.setIndicatorGap(dimension);
        this.mBannerOptions.setIndicatorHeight(dimension / 2);
    }

    public void init(@NonNull Context context, @Nullable AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.BannerViewPager);
            initBannerAttrs(typedArrayObtainStyledAttributes);
            initIndicatorAttrs(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
