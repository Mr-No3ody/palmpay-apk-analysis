package com.scwang.smartrefresh.layout.api;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface RefreshContent {
    boolean canLoadMore();

    boolean canRefresh();

    @NonNull
    View getScrollableView();

    @NonNull
    View getView();

    void moveSpinner(int i7, int i10, int i11);

    void onActionDown(MotionEvent motionEvent);

    ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i7);

    void setEnableLoadMoreWhenContentNotFull(boolean z3);

    void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider);

    void setUpComponent(RefreshKernel refreshKernel, View view, View view2);
}
