package com.scwang.smartrefresh.layout.api;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

/* JADX INFO: loaded from: classes3.dex */
public interface RefreshLayout {
    boolean autoLoadMore();

    boolean autoLoadMore(int i7, int i10, float f10);

    boolean autoRefresh();

    boolean autoRefresh(int i7, int i10, float f10);

    RefreshLayout finishLoadMore();

    RefreshLayout finishLoadMore(int i7);

    RefreshLayout finishLoadMore(int i7, boolean z3, boolean z8);

    RefreshLayout finishLoadMore(boolean z3);

    RefreshLayout finishLoadMoreWithNoMoreData();

    RefreshLayout finishRefresh();

    RefreshLayout finishRefresh(int i7);

    RefreshLayout finishRefresh(int i7, boolean z3);

    RefreshLayout finishRefresh(boolean z3);

    ViewGroup getLayout();

    @Nullable
    RefreshFooter getRefreshFooter();

    @Nullable
    RefreshHeader getRefreshHeader();

    RefreshState getState();

    boolean isEnableLoadMore();

    boolean isEnableRefresh();

    RefreshLayout setDisableContentWhenLoading(boolean z3);

    RefreshLayout setDisableContentWhenRefresh(boolean z3);

    RefreshLayout setDragRate(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    RefreshLayout setEnableAutoLoadMore(boolean z3);

    RefreshLayout setEnableClipFooterWhenFixedBehind(boolean z3);

    RefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z3);

    RefreshLayout setEnableFooterFollowWhenLoadFinished(boolean z3);

    RefreshLayout setEnableFooterTranslationContent(boolean z3);

    RefreshLayout setEnableHeaderTranslationContent(boolean z3);

    RefreshLayout setEnableLoadMore(boolean z3);

    RefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z3);

    RefreshLayout setEnableNestedScroll(boolean z3);

    RefreshLayout setEnableOverScrollBounce(boolean z3);

    RefreshLayout setEnableOverScrollDrag(boolean z3);

    RefreshLayout setEnablePureScrollMode(boolean z3);

    RefreshLayout setEnableRefresh(boolean z3);

    RefreshLayout setEnableScrollContentWhenLoaded(boolean z3);

    RefreshLayout setEnableScrollContentWhenRefreshed(boolean z3);

    RefreshLayout setFooterHeight(float f10);

    RefreshLayout setFooterInsetStart(float f10);

    RefreshLayout setFooterMaxDragRate(@FloatRange(from = 1.0d, to = 100.0d) float f10);

    RefreshLayout setFooterTriggerRate(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    RefreshLayout setHeaderHeight(float f10);

    RefreshLayout setHeaderInsetStart(float f10);

    RefreshLayout setHeaderMaxDragRate(@FloatRange(from = 1.0d, to = 100.0d) float f10);

    RefreshLayout setHeaderTriggerRate(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    RefreshLayout setNoMoreData(boolean z3);

    RefreshLayout setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener);

    RefreshLayout setOnMultiPurposeListener(OnMultiPurposeListener onMultiPurposeListener);

    RefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener);

    RefreshLayout setOnRefreshLoadMoreListener(OnRefreshLoadMoreListener onRefreshLoadMoreListener);

    RefreshLayout setPrimaryColors(@ColorInt int... iArr);

    RefreshLayout setPrimaryColorsId(@ColorRes int... iArr);

    RefreshLayout setReboundDuration(int i7);

    RefreshLayout setReboundInterpolator(@NonNull Interpolator interpolator);

    RefreshLayout setRefreshContent(@NonNull View view);

    RefreshLayout setRefreshContent(@NonNull View view, int i7, int i10);

    RefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter);

    RefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter, int i7, int i10);

    RefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader);

    RefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader, int i7, int i10);

    RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider);
}
