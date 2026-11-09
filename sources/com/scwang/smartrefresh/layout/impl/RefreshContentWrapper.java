package com.scwang.smartrefresh.layout.impl;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener;
import com.scwang.smartrefresh.layout.util.DesignUtil;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;
import com.scwang.smartrefresh.layout.util.SmartUtil;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class RefreshContentWrapper implements RefreshContent, CoordinatorLayoutListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f25159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f25160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f25163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25164f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25165g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25166i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScrollBoundaryDeciderAdapter f25167j = new ScrollBoundaryDeciderAdapter();

    public RefreshContentWrapper(@NonNull View view) {
        this.f25161c = view;
        this.f25160b = view;
        this.f25159a = view;
    }

    public static View a(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (ScrollBoundaryUtil.isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && SmartUtil.isScrollableView(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewA = a(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewA;
                }
            }
        }
        return view2;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canLoadMore() {
        return this.f25166i && this.f25167j.canLoadMore(this.f25159a);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canRefresh() {
        return this.f25165g && this.f25167j.canRefresh(this.f25159a);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    @NonNull
    public View getScrollableView() {
        return this.f25161c;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    @NonNull
    public View getView() {
        return this.f25159a;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void moveSpinner(int i7, int i10, int i11) {
        boolean z3;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z8 = true;
        View view = this.f25160b;
        if (i10 == -1 || (viewFindViewById2 = view.findViewById(i10)) == null) {
            z3 = false;
        } else if (i7 > 0) {
            viewFindViewById2.setTranslationY(i7);
            z3 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z3 = false;
        }
        if (i11 == -1 || (viewFindViewById = view.findViewById(i11)) == null) {
            z8 = z3;
        } else if (i7 < 0) {
            viewFindViewById.setTranslationY(i7);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z8 = z3;
        }
        if (z8) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i7);
        }
        View view2 = this.f25162d;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i7));
        }
        View view3 = this.f25163e;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i7));
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void onActionDown(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f25159a.getLeft(), -this.f25159a.getTop());
        View view = this.f25161c;
        View view2 = this.f25159a;
        if (view != view2) {
            this.f25161c = a(view2, pointF, view);
        }
        if (this.f25161c == this.f25159a) {
            this.f25167j.mActionEvent = null;
        } else {
            this.f25167j.mActionEvent = pointF;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            View view = this.f25161c;
            if (view instanceof AbsListView) {
                SmartUtil.scrollListBy((AbsListView) view, iIntValue - this.f25164f);
            } else {
                view.scrollBy(0, iIntValue - this.f25164f);
            }
        } catch (Throwable unused) {
        }
        this.f25164f = iIntValue;
    }

    @Override // com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener
    public void onCoordinatorUpdate(boolean z3, boolean z8) {
        this.f25165g = z3;
        this.f25166i = z8;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i7) {
        View view = this.f25161c;
        if (view == null || i7 == 0) {
            return null;
        }
        if ((i7 >= 0 || !ScrollBoundaryUtil.canScrollDown(view)) && (i7 <= 0 || !ScrollBoundaryUtil.canScrollUp(this.f25161c))) {
            return null;
        }
        this.f25164f = i7;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setEnableLoadMoreWhenContentNotFull(boolean z3) {
        this.f25167j.mEnableLoadMoreWhenContentNotFull = z3;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        if (scrollBoundaryDecider instanceof ScrollBoundaryDeciderAdapter) {
            this.f25167j = (ScrollBoundaryDeciderAdapter) scrollBoundaryDecider;
        } else {
            this.f25167j.boundary = scrollBoundaryDecider;
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setUpComponent(RefreshKernel refreshKernel, View view, View view2) {
        View view3 = this.f25159a;
        boolean zIsInEditMode = view3.isInEditMode();
        View view4 = null;
        while (true) {
            if (view4 != null && (!(view4 instanceof NestedScrollingParent) || (view4 instanceof NestedScrollingChild))) {
                break;
            }
            boolean z3 = view4 == null;
            LinkedList linkedList = new LinkedList(Collections.singletonList(view3));
            View view5 = null;
            while (!linkedList.isEmpty() && view5 == null) {
                View view6 = (View) linkedList.poll();
                if (view6 != null) {
                    if ((z3 || view6 != view3) && SmartUtil.isScrollableView(view6)) {
                        view5 = view6;
                    } else if (view6 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view6;
                        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                            linkedList.add(viewGroup.getChildAt(i7));
                        }
                    }
                }
            }
            if (view5 != null) {
                view3 = view5;
            }
            if (view3 == view4) {
                break;
            }
            if (!zIsInEditMode) {
                DesignUtil.checkCoordinatorLayout(view3, refreshKernel, this);
            }
            view4 = view3;
        }
        if (view4 != null) {
            this.f25161c = view4;
        }
        if (view == null && view2 == null) {
            return;
        }
        this.f25162d = view;
        this.f25163e = view2;
        FrameLayout frameLayout = new FrameLayout(this.f25159a.getContext());
        refreshKernel.getRefreshLayout().getLayout().removeView(this.f25159a);
        ViewGroup.LayoutParams layoutParams = this.f25159a.getLayoutParams();
        frameLayout.addView(this.f25159a, -1, -1);
        refreshKernel.getRefreshLayout().getLayout().addView(frameLayout, layoutParams);
        this.f25159a = frameLayout;
        if (view != null) {
            view.setClickable(true);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup2.removeView(view);
            layoutParams2.height = SmartUtil.measureViewHeight(view);
            viewGroup2.addView((View) new Space(this.f25159a.getContext()), iIndexOfChild, layoutParams2);
            frameLayout.addView(view);
        }
        if (view2 != null) {
            view2.setClickable(true);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
            int iIndexOfChild2 = viewGroup3.indexOfChild(view2);
            viewGroup3.removeView(view2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
            layoutParams3.height = SmartUtil.measureViewHeight(view2);
            viewGroup3.addView((View) new Space(this.f25159a.getContext()), iIndexOfChild2, layoutParams3);
            layoutParams4.gravity = 80;
            frameLayout.addView(view2, layoutParams4);
        }
    }
}
