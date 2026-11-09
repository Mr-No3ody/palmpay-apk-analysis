package com.transsnet.adsdk.widgets.banner.bannerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.flexibank.sdk.g;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.widgets.banner.bannerview.manager.BannerManager;
import com.transsnet.adsdk.widgets.banner.bannerview.manager.BannerOptions;
import com.transsnet.adsdk.widgets.banner.bannerview.provider.ReflectLayoutManager;
import com.transsnet.adsdk.widgets.banner.bannerview.provider.ViewStyleSetter;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import com.zhpan.indicator.IndicatorView;
import com.zhpan.indicator.base.IIndicator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BannerViewPager<T> extends FrameLayout implements LifecycleObserver {
    private static final String KEY_CURRENT_POSITION = "CURRENT_POSITION";
    private static final String KEY_IS_CUSTOM_INDICATOR = "IS_CUSTOM_INDICATOR";
    private static final String KEY_SUPER_STATE = "SUPER_STATE";
    private int currentPosition;
    private boolean isCustomIndicator;
    private boolean isLooping;
    private AbstractC1205o lifecycleRegistry;
    private BannerManager mBannerManager;
    private BaseBannerAdapter<T> mBannerPagerAdapter;
    protected RecyclerView mContentRv;
    private final Handler mHandler;
    private RelativeLayout mIndicatorLayout;
    private IIndicator mIndicatorView;
    private ImageView mIvHolder;
    protected int mNextCount;
    private final ViewPager2.OnPageChangeCallback mOnPageChangeCallback;
    private Path mRadiusPath;
    private RectF mRadiusRectF;
    private final Runnable mRunnable;
    private ViewPager2 mViewPager;
    private ViewPager2.OnPageChangeCallback onPageChangeCallback;
    private int startX;
    private int startY;

    public interface OnPageClickListener {
        void onPageClick(View clickedView, int position);
    }

    public BannerViewPager(Context context) {
        this(context, null);
    }

    private int getInterval() {
        return this.mBannerManager.getBannerOptions().getInterval();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePosition() {
        BaseBannerAdapter<T> baseBannerAdapter = this.mBannerPagerAdapter;
        if (baseBannerAdapter == null || baseBannerAdapter.getListSize() <= 1 || !isAutoPlay()) {
            return;
        }
        ViewPager2 viewPager2 = this.mViewPager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + this.mNextCount, this.mBannerManager.getBannerOptions().isAutoScrollSmoothly());
        this.mHandler.postDelayed(this.mRunnable, getInterval());
    }

    private void init(Context context, AttributeSet attrs) {
        BannerManager bannerManager = new BannerManager();
        this.mBannerManager = bannerManager;
        bannerManager.initAttrs(context, attrs);
        initView();
    }

    private void initBannerData() {
        List<? extends T> data = this.mBannerPagerAdapter.getData();
        if (data != null) {
            setIndicatorValues(data);
            setupViewPager(data);
            initRoundCorner();
        }
    }

    private void initIndicator(Ve.a indicatorOptions, List<? extends T> list) {
        if (((View) this.mIndicatorView).getParent() == null) {
            this.mIndicatorLayout.removeAllViews();
            this.mIndicatorLayout.addView((View) this.mIndicatorView);
            initIndicatorSliderMargin();
            initIndicatorGravity();
        }
        this.mIndicatorView.setIndicatorOptions(indicatorOptions);
        indicatorOptions.f10332d = list.size();
        this.mIndicatorView.notifyDataChanged();
    }

    private void initIndicatorGravity() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.mIndicatorView).getLayoutParams();
        int indicatorGravity = this.mBannerManager.getBannerOptions().getIndicatorGravity();
        if (indicatorGravity == 0) {
            layoutParams.addRule(14);
        } else if (indicatorGravity == 2) {
            layoutParams.addRule(9);
        } else {
            if (indicatorGravity != 4) {
                return;
            }
            layoutParams.addRule(11);
        }
    }

    private void initIndicatorSliderMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.mIndicatorView).getLayoutParams();
        BannerOptions.IndicatorMargin indicatorMargin = this.mBannerManager.getBannerOptions().getIndicatorMargin();
        if (indicatorMargin != null) {
            marginLayoutParams.setMargins(indicatorMargin.getLeft(), indicatorMargin.getTop(), indicatorMargin.getRight(), indicatorMargin.getBottom());
        } else {
            int iDp2px = BannerUtils.dp2px(10.0f);
            marginLayoutParams.setMargins(iDp2px, iDp2px, iDp2px, iDp2px);
        }
    }

    private void initPageStyle(int pageStyle) {
        float pageScale = this.mBannerManager.getBannerOptions().getPageScale();
        if (pageStyle == 4) {
            this.mBannerManager.setMultiPageStyle(true, pageScale);
        } else if (pageStyle == 8) {
            this.mBannerManager.setMultiPageStyle(false, pageScale);
        }
    }

    private void initRevealWidth(BannerOptions bannerOptions) {
        int rightRevealWidth = bannerOptions.getRightRevealWidth();
        int leftRevealWidth = bannerOptions.getLeftRevealWidth();
        if (leftRevealWidth != -1000 || rightRevealWidth != -1000) {
            RecyclerView recyclerView = (RecyclerView) this.mViewPager.getChildAt(0);
            int orientation = bannerOptions.getOrientation();
            int pageMargin = bannerOptions.getPageMargin() + rightRevealWidth;
            int pageMargin2 = bannerOptions.getPageMargin() + leftRevealWidth;
            if (pageMargin2 < 0) {
                pageMargin2 = 0;
            }
            if (pageMargin < 0) {
                pageMargin = 0;
            }
            if (orientation == 0) {
                recyclerView.setPadding(pageMargin2, 0, pageMargin, 0);
            } else if (orientation == 1) {
                recyclerView.setPadding(0, pageMargin2, 0, pageMargin);
            }
            recyclerView.setClipToPadding(false);
        }
        this.mBannerManager.createMarginTransformer();
    }

    private void initRoundCorner() {
        int roundRectRadius = this.mBannerManager.getBannerOptions().getRoundRectRadius();
        if (roundRectRadius > 0) {
            ViewStyleSetter.applyRoundCorner(this, roundRectRadius);
        }
    }

    private void initView() {
        View.inflate(getContext(), R.layout.lib_ad_bvp_layout, this);
        ImageView imageView = (ImageView) findViewById(R.id.ivHolder);
        this.mIvHolder = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.leftMargin = this.mBannerManager.getBannerOptions().getLeftRevealWidth() + this.mBannerManager.getBannerOptions().getPageMargin();
        layoutParams.rightMargin = this.mBannerManager.getBannerOptions().getRightRevealWidth() + this.mBannerManager.getBannerOptions().getPageMargin();
        this.mIvHolder.setLayoutParams(layoutParams);
        this.mViewPager = (ViewPager2) findViewById(R.id.vp_main);
        this.mIndicatorLayout = (RelativeLayout) findViewById(R.id.bvp_layout_indicator);
        this.mViewPager.setPageTransformer(this.mBannerManager.getCompositePageTransformer());
        RecyclerView recyclerView = (RecyclerView) this.mViewPager.getChildAt(0);
        this.mContentRv = recyclerView;
        recyclerView.setItemAnimator(null);
    }

    private boolean isAutoPlay() {
        return this.mBannerManager.getBannerOptions().isAutoPlay();
    }

    private boolean isCanLoopSafely() {
        BaseBannerAdapter<T> baseBannerAdapter;
        BannerManager bannerManager = this.mBannerManager;
        return (bannerManager == null || bannerManager.getBannerOptions() == null || !this.mBannerManager.getBannerOptions().isCanLoop() || (baseBannerAdapter = this.mBannerPagerAdapter) == null || baseBannerAdapter.getListSize() <= 1) ? false : true;
    }

    private boolean isStopLoopWhenDetachedFromWindow() {
        return this.mBannerManager.getBannerOptions().isStopLoopWhenDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshData$1(List list) {
        if (!isAttachedToWindow() || list == null || this.mBannerPagerAdapter == null) {
            return;
        }
        stopLoop();
        this.mBannerPagerAdapter.setData(list);
        this.mBannerPagerAdapter.notifyDataSetChanged();
        resetCurrentItem(getCurrentItem());
        refreshIndicator(list);
        if (list.size() > 0) {
            showPlaceHolderImage(false);
        }
        startLoop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnPageClickListener$0(OnPageClickListener onPageClickListener, boolean z3, View view, int i7, int i10) {
        onPageClickListener.onPageClick(view, i7);
        if (z3) {
            this.mViewPager.setCurrentItem(i10);
        }
    }

    private void onHorizontalActionMove(int endX, int disX, int disY) {
        if (disX <= disY) {
            if (disY > disX) {
                requestParentDisallowInterceptTouchEvent(false);
            }
        } else {
            if (this.mBannerManager.getBannerOptions().isCanLoop()) {
                requestParentDisallowInterceptTouchEvent(true);
                return;
            }
            int i7 = this.currentPosition;
            if (i7 != 0 || endX - this.startX <= 0) {
                requestParentDisallowInterceptTouchEvent(i7 != getData().size() - 1 || endX - this.startX >= 0);
            } else {
                requestParentDisallowInterceptTouchEvent(false);
            }
        }
    }

    private void onVerticalActionMove(int endY, int disX, int disY) {
        if (disY <= disX) {
            if (disX > disY) {
                requestParentDisallowInterceptTouchEvent(false);
            }
        } else {
            if (this.mBannerManager.getBannerOptions().isCanLoop()) {
                requestParentDisallowInterceptTouchEvent(true);
                return;
            }
            int i7 = this.currentPosition;
            if (i7 != 0 || endY - this.startY <= 0) {
                requestParentDisallowInterceptTouchEvent(i7 != getData().size() - 1 || endY - this.startY >= 0);
            } else {
                requestParentDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageScrollStateChanged(int state) {
        IIndicator iIndicator = this.mIndicatorView;
        if (iIndicator != null) {
            iIndicator.onPageScrollStateChanged(state);
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.onPageChangeCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        int listSize = this.mBannerPagerAdapter.getListSize();
        this.mBannerManager.getBannerOptions().isCanLoop();
        int realPosition = BannerUtils.getRealPosition(position, listSize);
        if (listSize > 0) {
            ViewPager2.OnPageChangeCallback onPageChangeCallback = this.onPageChangeCallback;
            if (onPageChangeCallback != null) {
                onPageChangeCallback.onPageScrolled(realPosition, positionOffset, positionOffsetPixels);
            }
            IIndicator iIndicator = this.mIndicatorView;
            if (iIndicator != null) {
                iIndicator.onPageScrolled(realPosition, positionOffset, positionOffsetPixels);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageSelected(int position) {
        int listSize = this.mBannerPagerAdapter.getListSize();
        boolean zIsCanLoop = this.mBannerManager.getBannerOptions().isCanLoop();
        int realPosition = BannerUtils.getRealPosition(position, listSize);
        this.currentPosition = realPosition;
        if (listSize > 0 && zIsCanLoop && (position == 0 || position == 999)) {
            resetCurrentItem(realPosition);
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.onPageChangeCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(this.currentPosition);
        }
        IIndicator iIndicator = this.mIndicatorView;
        if (iIndicator != null) {
            iIndicator.onPageSelected(this.currentPosition);
        }
    }

    private void refreshIndicator(List<? extends T> data) {
        setIndicatorValues(data);
        this.mBannerManager.getBannerOptions().getIndicatorOptions().f10339k = BannerUtils.getRealPosition(this.mViewPager.getCurrentItem(), data.size());
        this.mIndicatorView.notifyDataChanged();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    private void resetCurrentItem(int item) {
        if (isCanLoopSafely()) {
            this.mViewPager.setCurrentItem(BannerUtils.getOriginalPosition(this.mBannerPagerAdapter.getListSize()) + item, false);
        } else {
            this.mViewPager.setCurrentItem(item, false);
        }
    }

    private void setIndicatorValues(List<? extends T> list) {
        BannerOptions bannerOptions = this.mBannerManager.getBannerOptions();
        this.mIndicatorLayout.setVisibility(bannerOptions.getIndicatorVisibility());
        bannerOptions.resetIndicatorOptions();
        if (this.isCustomIndicator) {
            this.mIndicatorLayout.removeAllViews();
        } else if (this.mIndicatorView == null) {
            this.mIndicatorView = new IndicatorView(getContext());
        }
        initIndicator(bannerOptions.getIndicatorOptions(), list);
    }

    private void setupViewPager(List<T> list) {
        if (this.mBannerPagerAdapter == null) {
            throw new NullPointerException("You must set adapter for BannerViewPager");
        }
        BannerOptions bannerOptions = this.mBannerManager.getBannerOptions();
        if (bannerOptions.getScrollDuration() != 0) {
            ReflectLayoutManager.reflectLayoutManager(this.mViewPager, bannerOptions.getScrollDuration());
        }
        this.currentPosition = 0;
        this.mBannerPagerAdapter.setCanLoop(bannerOptions.isCanLoop());
        this.mBannerPagerAdapter.setHasStableIds(true);
        this.mViewPager.setAdapter(this.mBannerPagerAdapter);
        if (isCanLoopSafely()) {
            this.mViewPager.setCurrentItem(BannerUtils.getOriginalPosition(list.size()), false);
        }
        this.mViewPager.unregisterOnPageChangeCallback(this.mOnPageChangeCallback);
        this.mViewPager.registerOnPageChangeCallback(this.mOnPageChangeCallback);
        this.mViewPager.setOrientation(bannerOptions.getOrientation());
        this.mViewPager.setOffscreenPageLimit(bannerOptions.getOffScreenPageLimit());
        initRevealWidth(bannerOptions);
        initPageStyle(bannerOptions.getPageStyle());
        startLoop();
    }

    public void addData(List<? extends T> list) {
        BaseBannerAdapter<T> baseBannerAdapter;
        if (!isAttachedToWindow() || list == null || (baseBannerAdapter = this.mBannerPagerAdapter) == null) {
            return;
        }
        List<? extends T> data = baseBannerAdapter.getData();
        data.addAll(list);
        this.mBannerPagerAdapter.notifyDataSetChanged();
        resetCurrentItem(getCurrentItem());
        refreshIndicator(data);
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration decor, int index) {
        if (!isCanLoopSafely()) {
            this.mViewPager.addItemDecoration(decor, index);
            return;
        }
        int listSize = this.mBannerPagerAdapter.getListSize();
        int currentItem = this.mViewPager.getCurrentItem();
        this.mBannerManager.getBannerOptions().isCanLoop();
        int realPosition = BannerUtils.getRealPosition(currentItem, listSize);
        if (currentItem != index) {
            if (index == 0 && realPosition == listSize - 1) {
                this.mViewPager.addItemDecoration(decor, currentItem + 1);
            } else if (realPosition == 0 && index == listSize - 1) {
                this.mViewPager.addItemDecoration(decor, currentItem - 1);
            } else {
                this.mViewPager.addItemDecoration(decor, (index - realPosition) + currentItem);
            }
        }
    }

    public BannerViewPager<T> addPageTransformer(@Nullable ViewPager2.PageTransformer transformer) {
        if (transformer != null) {
            this.mBannerManager.addTransformer(transformer);
        }
        return this;
    }

    public void create(List<T> data) {
        BaseBannerAdapter<T> baseBannerAdapter = this.mBannerPagerAdapter;
        if (baseBannerAdapter == null) {
            throw new NullPointerException("You must set adapter for BannerViewPager");
        }
        baseBannerAdapter.setData(data);
        initBannerData();
    }

    @Deprecated
    public BannerViewPager<T> disallowInterceptTouchEvent(boolean disallowIntercept) {
        this.mBannerManager.getBannerOptions().setDisallowParentInterceptDownEvent(disallowIntercept);
        return this;
    }

    public BannerViewPager<T> disallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
        this.mBannerManager.getBannerOptions().setDisallowParentInterceptDownEvent(disallowParentInterceptDownEvent);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float[] roundRectRadiusArray = this.mBannerManager.getBannerOptions().getRoundRectRadiusArray();
        RectF rectF = this.mRadiusRectF;
        if (rectF != null && this.mRadiusPath != null && roundRectRadiusArray != null) {
            rectF.right = getWidth();
            this.mRadiusRectF.bottom = getHeight();
            this.mRadiusPath.addRoundRect(this.mRadiusRectF, roundRectRadiusArray, Path.Direction.CW);
            canvas.clipPath(this.mRadiusPath);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            this.isLooping = true;
            stopLoop();
        } else if (action == 1 || action == 3 || action == 4) {
            this.isLooping = false;
            startLoop();
        }
        return super.dispatchTouchEvent(ev);
    }

    public BaseBannerAdapter<T> getAdapter() {
        return this.mBannerPagerAdapter;
    }

    public int getCurrentItem() {
        return this.currentPosition;
    }

    public List<T> getData() {
        BaseBannerAdapter<T> baseBannerAdapter = this.mBannerPagerAdapter;
        return baseBannerAdapter != null ? baseBannerAdapter.getData() : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void insertItem(int index, T item) {
        List<? extends T> data = this.mBannerPagerAdapter.getData();
        if (!isAttachedToWindow() || index < 0 || index > data.size()) {
            return;
        }
        data.add(index, item);
        this.mBannerPagerAdapter.notifyDataSetChanged();
        resetCurrentItem(getCurrentItem());
        refreshIndicator(data);
    }

    public void nextPage() {
        setCurrentItem(getCurrentItem() + 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mBannerManager == null || !isStopLoopWhenDetachedFromWindow()) {
            return;
        }
        startLoop();
    }

    @OnLifecycleEvent(EnumC1203m.ON_DESTROY)
    public void onDestroy() {
        stopLoop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.mBannerManager != null && isStopLoopWhenDetachedFromWindow()) {
            stopLoop();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        BaseBannerAdapter<T> baseBannerAdapter;
        if (!this.mViewPager.isUserInputEnabled() || ((baseBannerAdapter = this.mBannerPagerAdapter) != null && baseBannerAdapter.getData().size() <= 1)) {
            try {
                return super.onInterceptTouchEvent(ev);
            } catch (Exception unused) {
                return true;
            }
        }
        int action = ev.getAction();
        if (action == 0) {
            this.startX = (int) ev.getX();
            this.startY = (int) ev.getY();
            requestParentDisallowInterceptTouchEvent(!this.mBannerManager.getBannerOptions().isDisallowParentInterceptDownEvent());
        } else if (action == 1) {
            requestParentDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            int x3 = (int) ev.getX();
            int y8 = (int) ev.getY();
            int iAbs = Math.abs(x3 - this.startX);
            int iAbs2 = Math.abs(y8 - this.startY);
            int orientation = this.mBannerManager.getBannerOptions().getOrientation();
            if (orientation == 1) {
                onVerticalActionMove(y8, iAbs, iAbs2);
            } else if (orientation == 0) {
                onHorizontalActionMove(x3, iAbs, iAbs2);
            }
        } else if (action == 3) {
            requestParentDisallowInterceptTouchEvent(false);
        }
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (Exception unused2) {
            return true;
        }
    }

    @OnLifecycleEvent(EnumC1203m.ON_PAUSE)
    public void onPause() {
        stopLoop();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState(bundle.getParcelable(KEY_SUPER_STATE));
        this.currentPosition = bundle.getInt(KEY_CURRENT_POSITION);
        this.isCustomIndicator = bundle.getBoolean(KEY_IS_CUSTOM_INDICATOR);
        setCurrentItem(this.currentPosition, false);
    }

    @OnLifecycleEvent(EnumC1203m.ON_RESUME)
    public void onResume() {
        startLoop();
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_SUPER_STATE, parcelableOnSaveInstanceState);
        bundle.putInt(KEY_CURRENT_POSITION, this.currentPosition);
        bundle.putBoolean(KEY_IS_CUSTOM_INDICATOR, this.isCustomIndicator);
        return bundle;
    }

    public void previousPage() {
        setCurrentItem(getCurrentItem() - 1);
    }

    public void refreshData(List<? extends T> list) {
        post(new g(14, this, list));
    }

    public BannerViewPager<T> registerLifecycleObserver(AbstractC1205o lifecycleRegistry) {
        lifecycleRegistry.a(this);
        this.lifecycleRegistry = lifecycleRegistry;
        return this;
    }

    public BannerViewPager<T> registerOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.onPageChangeCallback = onPageChangeCallback;
        return this;
    }

    public void removeDefaultPageTransformer() {
        this.mBannerManager.removeDefaultPageTransformer();
    }

    public void removeItem(int index) {
        List<? extends T> data = this.mBannerPagerAdapter.getData();
        if (!isAttachedToWindow() || index < 0 || index >= data.size()) {
            return;
        }
        data.remove(index);
        this.mBannerPagerAdapter.notifyDataSetChanged();
        resetCurrentItem(getCurrentItem());
        refreshIndicator(data);
    }

    public BannerViewPager<T> removeLifecycleObserver(AbstractC1205o lifecycleRegistry) {
        lifecycleRegistry.b(this);
        return this;
    }

    public void removeMarginPageTransformer() {
        this.mBannerManager.removeMarginPageTransformer();
    }

    public void removeTransformer(@Nullable ViewPager2.PageTransformer transformer) {
        if (transformer != null) {
            this.mBannerManager.removeTransformer(transformer);
        }
    }

    public BannerViewPager<T> setAdapter(BaseBannerAdapter<T> adapter) {
        this.mBannerPagerAdapter = adapter;
        return this;
    }

    public BannerViewPager<T> setAutoPlay(boolean autoPlay) {
        this.mBannerManager.getBannerOptions().setAutoPlay(autoPlay);
        if (isAutoPlay()) {
            this.mBannerManager.getBannerOptions().setCanLoop(true);
        }
        return this;
    }

    public BannerViewPager<T> setAutoPlaySmoothly(boolean autoScrollSmoothly) {
        this.mBannerManager.getBannerOptions().setAutoScrollSmoothly(autoScrollSmoothly);
        return this;
    }

    public BannerViewPager<T> setCanLoop(boolean canLoop) {
        this.mBannerManager.getBannerOptions().setCanLoop(canLoop);
        if (!canLoop) {
            this.mBannerManager.getBannerOptions().setAutoPlay(false);
        }
        return this;
    }

    public void setCurrentItem(int item) {
        setCurrentItem(item, true);
    }

    public BannerViewPager<T> setIndicatorGravity(int gravity) {
        this.mBannerManager.getBannerOptions().setIndicatorGravity(gravity);
        return this;
    }

    public BannerViewPager<T> setIndicatorHeight(int indicatorHeight) {
        this.mBannerManager.getBannerOptions().setIndicatorHeight(indicatorHeight);
        return this;
    }

    public BannerViewPager<T> setIndicatorMargin(int left, int top2, int right, int bottom) {
        this.mBannerManager.getBannerOptions().setIndicatorMargin(left, top2, right, bottom);
        return this;
    }

    public BannerViewPager<T> setIndicatorSlideMode(int slideMode) {
        this.mBannerManager.getBannerOptions().setIndicatorSlideMode(slideMode);
        return this;
    }

    public BannerViewPager<T> setIndicatorSliderColor(@ColorInt int normalColor, @ColorInt int checkedColor) {
        this.mBannerManager.getBannerOptions().setIndicatorSliderColor(normalColor, checkedColor);
        return this;
    }

    public BannerViewPager<T> setIndicatorSliderGap(int indicatorGap) {
        this.mBannerManager.getBannerOptions().setIndicatorGap(indicatorGap);
        return this;
    }

    public BannerViewPager<T> setIndicatorSliderRadius(int radius) {
        setIndicatorSliderRadius(radius, radius);
        return this;
    }

    public BannerViewPager<T> setIndicatorSliderWidth(int indicatorWidth) {
        setIndicatorSliderWidth(indicatorWidth, indicatorWidth);
        return this;
    }

    public BannerViewPager<T> setIndicatorStyle(int indicatorStyle) {
        this.mBannerManager.getBannerOptions().setIndicatorStyle(indicatorStyle);
        return this;
    }

    public BannerViewPager<T> setIndicatorView(IIndicator customIndicator) {
        if (customIndicator instanceof View) {
            this.isCustomIndicator = true;
            this.mIndicatorView = customIndicator;
        }
        return this;
    }

    public BannerViewPager<T> setIndicatorVisibility(int visibility) {
        this.mBannerManager.getBannerOptions().setIndicatorVisibility(visibility);
        return this;
    }

    public BannerViewPager<T> setInterval(int interval) {
        this.mBannerManager.getBannerOptions().setInterval(interval);
        return this;
    }

    @Deprecated
    public BannerViewPager<T> setLifecycleRegistry(AbstractC1205o lifecycleRegistry) {
        registerLifecycleObserver(lifecycleRegistry);
        return this;
    }

    public BannerViewPager<T> setOffScreenPageLimit(int offScreenPageLimit) {
        this.mBannerManager.getBannerOptions().setOffScreenPageLimit(offScreenPageLimit);
        return this;
    }

    public BannerViewPager<T> setOnPageClickListener(OnPageClickListener onPageClickListener) {
        setOnPageClickListener(onPageClickListener, false);
        return this;
    }

    public BannerViewPager<T> setOrientation(int orientation) {
        this.mBannerManager.getBannerOptions().setOrientation(orientation);
        return this;
    }

    public BannerViewPager<T> setPageMargin(int pageMargin) {
        this.mBannerManager.setPageMargin(pageMargin);
        return this;
    }

    public BannerViewPager<T> setPageStyle(int pageStyle) {
        return setPageStyle(pageStyle, 0.85f);
    }

    public BannerViewPager<T> setPageTransformer(@Nullable ViewPager2.PageTransformer transformer) {
        if (transformer != null) {
            this.mViewPager.setPageTransformer(transformer);
        }
        return this;
    }

    public void setPlaceHolderImage(int resId) {
        ImageView imageView = this.mIvHolder;
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
    }

    public void setPlaceHolderImageMargins() {
        ImageView imageView = this.mIvHolder;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMargins(this.mBannerManager.getBannerOptions().getPageMargin() + this.mBannerManager.getBannerOptions().getLeftRevealWidth(), 0, this.mBannerManager.getBannerOptions().getPageMargin() + this.mBannerManager.getBannerOptions().getRightRevealWidth(), 0);
            this.mIvHolder.setLayoutParams(layoutParams);
        }
    }

    public BannerViewPager<T> setRTLMode(boolean z3) {
        this.mViewPager.setLayoutDirection(z3 ? 1 : 0);
        this.mBannerManager.getBannerOptions().setRtl(z3);
        return this;
    }

    public BannerViewPager<T> setRevealWidth(int revealWidth) {
        setRevealWidth(revealWidth, revealWidth);
        return this;
    }

    public BannerViewPager<T> setRoundCorner(int radius) {
        this.mBannerManager.getBannerOptions().setRoundRectRadius(radius);
        return this;
    }

    @Deprecated
    public BannerViewPager<T> setRoundRect(int radius) {
        return setRoundCorner(radius);
    }

    public BannerViewPager<T> setScrollDuration(int scrollDuration) {
        this.mBannerManager.getBannerOptions().setScrollDuration(scrollDuration);
        return this;
    }

    public BannerViewPager<T> setUserInputEnabled(boolean userInputEnabled) {
        this.mBannerManager.getBannerOptions().setUserInputEnabled(userInputEnabled);
        this.mViewPager.setUserInputEnabled(userInputEnabled);
        return this;
    }

    public BannerViewPager<T> showIndicatorWhenOneItem(boolean showIndicatorWhenOneItem) {
        this.mBannerManager.getBannerOptions().showIndicatorWhenOneItem(showIndicatorWhenOneItem);
        return this;
    }

    public void showPlaceHolderImage(boolean show) {
        ImageView imageView = this.mIvHolder;
        if (imageView != null) {
            imageView.setVisibility(show ? 0 : 8);
        }
    }

    public void startLoop() {
        BaseBannerAdapter<T> baseBannerAdapter;
        if (this.isLooping || !isAutoPlay() || (baseBannerAdapter = this.mBannerPagerAdapter) == null || baseBannerAdapter.getListSize() <= 1 || !isAttachedToWindow()) {
            return;
        }
        AbstractC1205o abstractC1205o = this.lifecycleRegistry;
        if (abstractC1205o == null || ((C1212w) abstractC1205o).f17478d == EnumC1204n.f17464e || ((C1212w) abstractC1205o).f17478d == EnumC1204n.f17462c) {
            this.mHandler.postDelayed(this.mRunnable, getInterval());
            this.isLooping = true;
        }
    }

    public void startLoopNow() {
        BaseBannerAdapter<T> baseBannerAdapter;
        if (this.isLooping || !isAutoPlay() || (baseBannerAdapter = this.mBannerPagerAdapter) == null || baseBannerAdapter.getListSize() <= 1) {
            return;
        }
        this.mHandler.post(this.mRunnable);
        this.isLooping = true;
    }

    public void stopLoop() {
        if (this.isLooping) {
            this.isLooping = false;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mRunnable);
        }
    }

    public BannerViewPager<T> stopLoopWhenDetachedFromWindow(boolean stopLoopWhenDetachedFromWindow) {
        this.mBannerManager.getBannerOptions().setStopLoopWhenDetachedFromWindow(stopLoopWhenDetachedFromWindow);
        return this;
    }

    public BannerViewPager(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setCurrentItem(int item, boolean smoothScroll) {
        if (!isCanLoopSafely()) {
            this.mViewPager.setCurrentItem(item, smoothScroll);
            return;
        }
        stopLoop();
        int currentItem = this.mViewPager.getCurrentItem();
        this.mViewPager.setCurrentItem((item - BannerUtils.getRealPosition(currentItem, this.mBannerPagerAdapter.getListSize())) + currentItem, smoothScroll);
        startLoop();
    }

    public BannerViewPager<T> setIndicatorSliderRadius(int normalRadius, int checkedRadius) {
        this.mBannerManager.getBannerOptions().setIndicatorSliderWidth(normalRadius * 2, checkedRadius * 2);
        return this;
    }

    public BannerViewPager<T> setIndicatorSliderWidth(int normalWidth, int checkWidth) {
        this.mBannerManager.getBannerOptions().setIndicatorSliderWidth(normalWidth, checkWidth);
        return this;
    }

    public BannerViewPager<T> setOnPageClickListener(final OnPageClickListener onPageClickListener, final boolean scrollToThisItem) {
        BaseBannerAdapter<T> baseBannerAdapter = this.mBannerPagerAdapter;
        if (baseBannerAdapter != null) {
            baseBannerAdapter.setPageClickListener(new BaseBannerAdapter.PageClickListener() { // from class: com.transsnet.adsdk.widgets.banner.bannerview.a
                @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter.PageClickListener
                public final void onPageClick(View view, int i7, int i10) {
                    this.f25618a.lambda$setOnPageClickListener$0(onPageClickListener, scrollToThisItem, view, i7, i10);
                }
            });
        }
        return this;
    }

    public BannerViewPager<T> setPageStyle(int pageStyle, float pageScale) {
        this.mBannerManager.getBannerOptions().setPageStyle(pageStyle);
        this.mBannerManager.getBannerOptions().setPageScale(pageScale);
        return this;
    }

    public BannerViewPager<T> setRevealWidth(int leftRevealWidth, int rightRevealWidth) {
        this.mBannerManager.getBannerOptions().setRightRevealWidth(rightRevealWidth);
        this.mBannerManager.getBannerOptions().setLeftRevealWidth(leftRevealWidth);
        return this;
    }

    public BannerViewPager<T> setRoundCorner(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        this.mRadiusRectF = new RectF();
        this.mRadiusPath = new Path();
        this.mBannerManager.getBannerOptions().setRoundRectRadius(topLeftRadius, topRightRadius, bottomLeftRadius, bottomRightRadius);
        return this;
    }

    @Deprecated
    public BannerViewPager<T> setRoundRect(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        return setRoundCorner(topLeftRadius, topRightRadius, bottomLeftRadius, bottomRightRadius);
    }

    public BannerViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mRunnable = new b(this, 0);
        this.mNextCount = 1;
        this.mOnPageChangeCallback = new c(this);
        init(context, attrs);
    }

    public void create() {
        create(new ArrayList());
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration decor) {
        this.mViewPager.addItemDecoration(decor);
    }
}
