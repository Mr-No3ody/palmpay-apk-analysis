package com.transsnet.adsdk.widgets.banner.bannerview.manager;

import Ve.a;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;

/* JADX INFO: loaded from: classes3.dex */
public class BannerOptions {
    public static final int DEFAULT_REVEAL_WIDTH = -1000;
    private boolean disallowParentInterceptDownEvent;
    private int indicatorGravity;
    private int interval;
    private boolean isCanLoop;
    private IndicatorMargin mIndicatorMargin;
    private int roundRadius;
    private float[] roundRadiusArray;
    private boolean rtl;
    private int scrollDuration;
    private int offScreenPageLimit = -1;
    private boolean isAutoPlay = false;
    private int pageStyle = 0;
    private float pageScale = 0.85f;
    private int mIndicatorVisibility = 0;
    private boolean userInputEnabled = true;
    private int orientation = 0;
    private boolean stopLoopWhenDetachedFromWindow = true;
    private boolean autoScrollSmoothly = true;
    private final a mIndicatorOptions = new a();
    private int pageMargin = BannerUtils.dp2px(20.0f);
    private int rightRevealWidth = -1000;
    private int leftRevealWidth = -1000;

    public static class IndicatorMargin {
        private final int bottom;
        private final int left;
        private final int right;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        private final int f25624top;

        public IndicatorMargin(int left, int top2, int right, int bottom) {
            this.left = left;
            this.right = right;
            this.f25624top = top2;
            this.bottom = bottom;
        }

        public int getBottom() {
            return this.bottom;
        }

        public int getLeft() {
            return this.left;
        }

        public int getRight() {
            return this.right;
        }

        public int getTop() {
            return this.f25624top;
        }
    }

    public int getCheckedIndicatorWidth() {
        return (int) this.mIndicatorOptions.f10338j;
    }

    public int getIndicatorCheckedColor() {
        return this.mIndicatorOptions.f10334f;
    }

    public float getIndicatorGap() {
        return this.mIndicatorOptions.f10335g;
    }

    public int getIndicatorGravity() {
        return this.indicatorGravity;
    }

    public float getIndicatorHeight() {
        return this.mIndicatorOptions.a();
    }

    public IndicatorMargin getIndicatorMargin() {
        return this.mIndicatorMargin;
    }

    public int getIndicatorNormalColor() {
        return this.mIndicatorOptions.f10333e;
    }

    public a getIndicatorOptions() {
        return this.mIndicatorOptions;
    }

    public int getIndicatorSlideMode() {
        return this.mIndicatorOptions.f10331c;
    }

    public int getIndicatorStyle() {
        return this.mIndicatorOptions.f10330b;
    }

    public int getIndicatorVisibility() {
        return this.mIndicatorVisibility;
    }

    public int getInterval() {
        return this.interval;
    }

    public int getLeftRevealWidth() {
        return this.leftRevealWidth;
    }

    public int getNormalIndicatorWidth() {
        return (int) this.mIndicatorOptions.f10337i;
    }

    public int getOffScreenPageLimit() {
        return this.offScreenPageLimit;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int getPageMargin() {
        return this.pageMargin;
    }

    public float getPageScale() {
        return this.pageScale;
    }

    public int getPageStyle() {
        return this.pageStyle;
    }

    public int getRightRevealWidth() {
        return this.rightRevealWidth;
    }

    public int getRoundRectRadius() {
        return this.roundRadius;
    }

    public float[] getRoundRectRadiusArray() {
        return this.roundRadiusArray;
    }

    public int getScrollDuration() {
        return this.scrollDuration;
    }

    public boolean isAutoPlay() {
        return this.isAutoPlay;
    }

    public boolean isAutoScrollSmoothly() {
        return this.autoScrollSmoothly;
    }

    public boolean isCanLoop() {
        return this.isCanLoop;
    }

    public boolean isDisallowParentInterceptDownEvent() {
        return this.disallowParentInterceptDownEvent;
    }

    public boolean isRtl() {
        return this.rtl;
    }

    public boolean isStopLoopWhenDetachedFromWindow() {
        return this.stopLoopWhenDetachedFromWindow;
    }

    public boolean isUserInputEnabled() {
        return this.userInputEnabled;
    }

    public void resetIndicatorOptions() {
        a aVar = this.mIndicatorOptions;
        aVar.f10339k = 0;
        aVar.f10340l = 0.0f;
    }

    public void setAutoPlay(boolean autoPlay) {
        this.isAutoPlay = autoPlay;
    }

    public void setAutoScrollSmoothly(boolean autoScrollSmoothly) {
        this.autoScrollSmoothly = autoScrollSmoothly;
    }

    public void setCanLoop(boolean canLoop) {
        this.isCanLoop = canLoop;
    }

    public void setDisallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
        this.disallowParentInterceptDownEvent = disallowParentInterceptDownEvent;
    }

    public void setIndicatorGap(float indicatorGap) {
        this.mIndicatorOptions.f10335g = indicatorGap;
    }

    public void setIndicatorGravity(int indicatorGravity) {
        this.indicatorGravity = indicatorGravity;
    }

    public void setIndicatorHeight(int indicatorHeight) {
        this.mIndicatorOptions.f10336h = indicatorHeight;
    }

    public void setIndicatorMargin(int left, int top2, int right, int bottom) {
        this.mIndicatorMargin = new IndicatorMargin(left, top2, right, bottom);
    }

    public void setIndicatorSlideMode(int indicatorSlideMode) {
        this.mIndicatorOptions.f10331c = indicatorSlideMode;
    }

    public void setIndicatorSliderColor(int normalColor, int checkedColor) {
        a aVar = this.mIndicatorOptions;
        aVar.f10333e = normalColor;
        aVar.f10334f = checkedColor;
    }

    public void setIndicatorSliderWidth(int normalWidth, int checkedWidth) {
        a aVar = this.mIndicatorOptions;
        aVar.f10337i = normalWidth;
        aVar.f10338j = checkedWidth;
    }

    public void setIndicatorStyle(int indicatorStyle) {
        this.mIndicatorOptions.f10330b = indicatorStyle;
    }

    public void setIndicatorVisibility(int indicatorVisibility) {
        this.mIndicatorVisibility = indicatorVisibility;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setLeftRevealWidth(int leftRevealWidth) {
        this.leftRevealWidth = leftRevealWidth;
    }

    public void setOffScreenPageLimit(int offScreenPageLimit) {
        this.offScreenPageLimit = offScreenPageLimit;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
        this.mIndicatorOptions.f10329a = orientation;
    }

    public void setPageMargin(int pageMargin) {
        this.pageMargin = pageMargin;
    }

    public void setPageScale(float pageScale) {
        this.pageScale = pageScale;
    }

    public void setPageStyle(int pageStyle) {
        this.pageStyle = pageStyle;
    }

    public void setRightRevealWidth(int rightRevealWidth) {
        this.rightRevealWidth = rightRevealWidth;
    }

    public void setRoundRectRadius(int radius) {
        this.roundRadius = radius;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
        this.mIndicatorOptions.f10329a = rtl ? 3 : 0;
    }

    public void setScrollDuration(int scrollDuration) {
        this.scrollDuration = scrollDuration;
    }

    public void setStopLoopWhenDetachedFromWindow(boolean stopLoopWhenDetachedFromWindow) {
        this.stopLoopWhenDetachedFromWindow = stopLoopWhenDetachedFromWindow;
    }

    public void setUserInputEnabled(boolean userInputEnabled) {
        this.userInputEnabled = userInputEnabled;
    }

    public void showIndicatorWhenOneItem(boolean showIndicatorWhenOneItem) {
        this.mIndicatorOptions.f10341m = showIndicatorWhenOneItem;
    }

    public void setRoundRectRadius(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        this.roundRadiusArray = new float[]{f, f, f, f, f, f, f, f};
        float f10 = topLeftRadius;
        float f11 = topRightRadius;
        float f12 = bottomRightRadius;
        float f13 = bottomLeftRadius;
    }
}
